package y;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.t1;
import b0.f;
import java.util.concurrent.atomic.AtomicInteger;
import l0.c;

public abstract class q0 {
    public static final Size f26394i = new Size(0, 0);
    public static final boolean f26395j = t1.f("DeferrableSurface");
    public static final AtomicInteger f26396k = new AtomicInteger(0);
    public static final AtomicInteger f26397l = new AtomicInteger(0);
    public final Object f26398a;
    public int f26399b;
    public boolean f26400c;
    public c.a<Void> f26401d;
    public final c7.a<Void> f26402e;
    public final Size f26403f;
    public final int f26404g;
    public Class<?> f26405h;

    public static final class a extends Exception {
        public q0 f26406a;

        public a(String str, q0 q0Var) {
            super(str);
            this.f26406a = q0Var;
        }

        public q0 a() {
            return this.f26406a;
        }
    }

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public q0() {
        this(f26394i, 0);
    }

    public Object k(c.a aVar) {
        synchronized (this.f26398a) {
            this.f26401d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    public void l(String str) {
        try {
            this.f26402e.get();
            m("Surface terminated", f26397l.decrementAndGet(), f26396k.get());
        } catch (Exception e10) {
            t1.c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f26398a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f26400c), Integer.valueOf(this.f26399b)), e10);
            }
        }
    }

    public final void c() {
        c.a<Void> aVar;
        synchronized (this.f26398a) {
            if (!this.f26400c) {
                this.f26400c = true;
                if (this.f26399b == 0) {
                    aVar = this.f26401d;
                    this.f26401d = null;
                } else {
                    aVar = null;
                }
                if (t1.f("DeferrableSurface")) {
                    t1.a("DeferrableSurface", "surface closed,  useCount=" + this.f26399b + " closed=true " + this);
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void d() {
        c.a<Void> aVar;
        synchronized (this.f26398a) {
            int i10 = this.f26399b;
            if (i10 != 0) {
                int i11 = i10 - 1;
                this.f26399b = i11;
                if (i11 != 0 || !this.f26400c) {
                    aVar = null;
                } else {
                    aVar = this.f26401d;
                    this.f26401d = null;
                }
                if (t1.f("DeferrableSurface")) {
                    t1.a("DeferrableSurface", "use count-1,  useCount=" + this.f26399b + " closed=" + this.f26400c + " " + this);
                    if (this.f26399b == 0) {
                        m("Surface no longer in use", f26397l.get(), f26396k.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public Class<?> e() {
        return this.f26405h;
    }

    public Size f() {
        return this.f26403f;
    }

    public int g() {
        return this.f26404g;
    }

    public final c7.a<Surface> h() {
        synchronized (this.f26398a) {
            if (this.f26400c) {
                return f.f(new a("DeferrableSurface already closed.", this));
            }
            return n();
        }
    }

    public c7.a<Void> i() {
        return f.j(this.f26402e);
    }

    public void j() {
        synchronized (this.f26398a) {
            int i10 = this.f26399b;
            if (i10 == 0 && this.f26400c) {
                throw new a("Cannot begin use on a closed surface.", this);
            }
            this.f26399b = i10 + 1;
            if (t1.f("DeferrableSurface")) {
                if (this.f26399b == 1) {
                    m("New surface in use", f26397l.get(), f26396k.incrementAndGet());
                }
                t1.a("DeferrableSurface", "use count+1, useCount=" + this.f26399b + " " + this);
            }
        }
    }

    public final void m(String str, int i10, int i11) {
        if (!f26395j && t1.f("DeferrableSurface")) {
            t1.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        t1.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public abstract c7.a<Surface> n();

    public void o(Class<?> cls) {
        this.f26405h = cls;
    }

    public q0(Size size, int i10) {
        this.f26398a = new Object();
        this.f26399b = 0;
        this.f26400c = false;
        this.f26403f = size;
        this.f26404g = i10;
        c7.a<Void> a10 = c.a(new c.AbstractC0147c() {
            @Override
            public final Object a(c.a aVar) {
                Object k10;
                k10 = q0.this.k(aVar);
                return k10;
            }
        });
        this.f26402e = a10;
        if (t1.f("DeferrableSurface")) {
            m("Surface created", f26397l.incrementAndGet(), f26396k.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            a10.a(new Runnable() {
                @Override
                public final void run() {
                    q0.this.l(stackTraceString);
                }
            }, a0.a.a());
        }
    }
}
