package p336y;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0662u1;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0003a;
import p015b0.C1111f;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;

public abstract class AbstractC10287q0 {
    public static final Size f33123i = new Size(0, 0);
    public static final boolean f33124j = C0662u1.m40651f("DeferrableSurface");
    public static final AtomicInteger f33125k = new AtomicInteger(0);
    public static final AtomicInteger f33126l = new AtomicInteger(0);
    public final Object f33127a;
    public int f33128b;
    public boolean f33129c;
    public C6287c.C6288a<Void> f33130d;
    public final AbstractFutureC1291a<Void> f33131e;
    public final Size f33132f;
    public final int f33133g;
    public Class<?> f33134h;

    public static final class C10288a extends Exception {
        public AbstractC10287q0 f33135a;

        public C10288a(String str, AbstractC10287q0 q0Var) {
            super(str);
            this.f33135a = q0Var;
        }

        public AbstractC10287q0 m5538a() {
            return this.f33135a;
        }
    }

    public static final class C10289b extends Exception {
        public C10289b(String str) {
            super(str);
        }
    }

    public AbstractC10287q0() {
        this(f33123i, 0);
    }

    public Object m5543k(C6287c.C6288a aVar) {
        synchronized (this.f33127a) {
            this.f33130d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    public void m5542l(String str) {
        try {
            this.f33131e.get();
            m5541m("Surface terminated", f33126l.decrementAndGet(), f33125k.get());
        } catch (Exception e) {
            C0662u1.m40654c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f33127a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f33129c), Integer.valueOf(this.f33128b)), e);
            }
        }
    }

    public final void m5551c() {
        C6287c.C6288a<Void> aVar;
        synchronized (this.f33127a) {
            if (!this.f33129c) {
                this.f33129c = true;
                if (this.f33128b == 0) {
                    aVar = this.f33130d;
                    this.f33130d = null;
                } else {
                    aVar = null;
                }
                if (C0662u1.m40651f("DeferrableSurface")) {
                    C0662u1.m40656a("DeferrableSurface", "surface closed,  useCount=" + this.f33128b + " closed=true " + this);
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.m20717c(null);
        }
    }

    public void m5550d() {
        C6287c.C6288a<Void> aVar;
        synchronized (this.f33127a) {
            int i = this.f33128b;
            if (i != 0) {
                int i2 = i - 1;
                this.f33128b = i2;
                if (i2 != 0 || !this.f33129c) {
                    aVar = null;
                } else {
                    aVar = this.f33130d;
                    this.f33130d = null;
                }
                if (C0662u1.m40651f("DeferrableSurface")) {
                    C0662u1.m40656a("DeferrableSurface", "use count-1,  useCount=" + this.f33128b + " closed=" + this.f33129c + " " + this);
                    if (this.f33128b == 0) {
                        m5541m("Surface no longer in use", f33126l.get(), f33125k.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.m20717c(null);
        }
    }

    public Class<?> m5549e() {
        return this.f33134h;
    }

    public Size m5548f() {
        return this.f33132f;
    }

    public int m5547g() {
        return this.f33133g;
    }

    public final AbstractFutureC1291a<Surface> m5546h() {
        synchronized (this.f33127a) {
            if (this.f33129c) {
                return C1111f.m38356f(new C10288a("DeferrableSurface already closed.", this));
            }
            return mo5540n();
        }
    }

    public AbstractFutureC1291a<Void> m5545i() {
        return C1111f.m38352j(this.f33131e);
    }

    public void m5544j() {
        synchronized (this.f33127a) {
            int i = this.f33128b;
            if (i == 0 && this.f33129c) {
                throw new C10288a("Cannot begin use on a closed surface.", this);
            }
            this.f33128b = i + 1;
            if (C0662u1.m40651f("DeferrableSurface")) {
                if (this.f33128b == 1) {
                    m5541m("New surface in use", f33126l.get(), f33125k.incrementAndGet());
                }
                C0662u1.m40656a("DeferrableSurface", "use count+1, useCount=" + this.f33128b + " " + this);
            }
        }
    }

    public final void m5541m(String str, int i, int i2) {
        if (!f33124j && C0662u1.m40651f("DeferrableSurface")) {
            C0662u1.m40656a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C0662u1.m40656a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public abstract AbstractFutureC1291a<Surface> mo5540n();

    public void m5539o(Class<?> cls) {
        this.f33134h = cls;
    }

    public AbstractC10287q0(Size size, int i) {
        this.f33127a = new Object();
        this.f33128b = 0;
        this.f33129c = false;
        this.f33132f = size;
        this.f33133g = i;
        AbstractFutureC1291a<Void> a = C6287c.m20720a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object k;
                k = AbstractC10287q0.this.m5543k(aVar);
                return k;
            }
        });
        this.f33131e = a;
        if (C0662u1.m40651f("DeferrableSurface")) {
            m5541m("Surface created", f33126l.incrementAndGet(), f33125k.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            a.mo13371a(new Runnable() {
                @Override
                public final void run() {
                    AbstractC10287q0.this.m5542l(stackTraceString);
                }
            }, C0003a.m42614a());
        }
    }
}
