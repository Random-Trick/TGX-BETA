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
    public static final Size f33120i = new Size(0, 0);
    public static final boolean f33121j = C0662u1.m40648f("DeferrableSurface");
    public static final AtomicInteger f33122k = new AtomicInteger(0);
    public static final AtomicInteger f33123l = new AtomicInteger(0);
    public final Object f33124a;
    public int f33125b;
    public boolean f33126c;
    public C6287c.C6288a<Void> f33127d;
    public final AbstractFutureC1291a<Void> f33128e;
    public final Size f33129f;
    public final int f33130g;
    public Class<?> f33131h;

    public static final class C10288a extends Exception {
        public AbstractC10287q0 f33132a;

        public C10288a(String str, AbstractC10287q0 q0Var) {
            super(str);
            this.f33132a = q0Var;
        }

        public AbstractC10287q0 m5538a() {
            return this.f33132a;
        }
    }

    public static final class C10289b extends Exception {
        public C10289b(String str) {
            super(str);
        }
    }

    public AbstractC10287q0() {
        this(f33120i, 0);
    }

    public Object m5543k(C6287c.C6288a aVar) {
        synchronized (this.f33124a) {
            this.f33127d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    public void m5542l(String str) {
        try {
            this.f33128e.get();
            m5541m("Surface terminated", f33123l.decrementAndGet(), f33122k.get());
        } catch (Exception e) {
            C0662u1.m40651c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f33124a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f33126c), Integer.valueOf(this.f33125b)), e);
            }
        }
    }

    public final void m5551c() {
        C6287c.C6288a<Void> aVar;
        synchronized (this.f33124a) {
            if (!this.f33126c) {
                this.f33126c = true;
                if (this.f33125b == 0) {
                    aVar = this.f33127d;
                    this.f33127d = null;
                } else {
                    aVar = null;
                }
                if (C0662u1.m40648f("DeferrableSurface")) {
                    C0662u1.m40653a("DeferrableSurface", "surface closed,  useCount=" + this.f33125b + " closed=true " + this);
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.m20716c(null);
        }
    }

    public void m5550d() {
        C6287c.C6288a<Void> aVar;
        synchronized (this.f33124a) {
            int i = this.f33125b;
            if (i != 0) {
                int i2 = i - 1;
                this.f33125b = i2;
                if (i2 != 0 || !this.f33126c) {
                    aVar = null;
                } else {
                    aVar = this.f33127d;
                    this.f33127d = null;
                }
                if (C0662u1.m40648f("DeferrableSurface")) {
                    C0662u1.m40653a("DeferrableSurface", "use count-1,  useCount=" + this.f33125b + " closed=" + this.f33126c + " " + this);
                    if (this.f33125b == 0) {
                        m5541m("Surface no longer in use", f33123l.get(), f33122k.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.m20716c(null);
        }
    }

    public Class<?> m5549e() {
        return this.f33131h;
    }

    public Size m5548f() {
        return this.f33129f;
    }

    public int m5547g() {
        return this.f33130g;
    }

    public final AbstractFutureC1291a<Surface> m5546h() {
        synchronized (this.f33124a) {
            if (this.f33126c) {
                return C1111f.m38353f(new C10288a("DeferrableSurface already closed.", this));
            }
            return mo5540n();
        }
    }

    public AbstractFutureC1291a<Void> m5545i() {
        return C1111f.m38349j(this.f33128e);
    }

    public void m5544j() {
        synchronized (this.f33124a) {
            int i = this.f33125b;
            if (i == 0 && this.f33126c) {
                throw new C10288a("Cannot begin use on a closed surface.", this);
            }
            this.f33125b = i + 1;
            if (C0662u1.m40648f("DeferrableSurface")) {
                if (this.f33125b == 1) {
                    m5541m("New surface in use", f33123l.get(), f33122k.incrementAndGet());
                }
                C0662u1.m40653a("DeferrableSurface", "use count+1, useCount=" + this.f33125b + " " + this);
            }
        }
    }

    public final void m5541m(String str, int i, int i2) {
        if (!f33121j && C0662u1.m40648f("DeferrableSurface")) {
            C0662u1.m40653a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C0662u1.m40653a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public abstract AbstractFutureC1291a<Surface> mo5540n();

    public void m5539o(Class<?> cls) {
        this.f33131h = cls;
    }

    public AbstractC10287q0(Size size, int i) {
        this.f33124a = new Object();
        this.f33125b = 0;
        this.f33126c = false;
        this.f33129f = size;
        this.f33130g = i;
        AbstractFutureC1291a<Void> a = C6287c.m20719a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object k;
                k = AbstractC10287q0.this.m5543k(aVar);
                return k;
            }
        });
        this.f33128e = a;
        if (C0662u1.m40648f("DeferrableSurface")) {
            m5541m("Surface created", f33123l.incrementAndGet(), f33122k.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            a.mo13372a(new Runnable() {
                @Override
                public final void run() {
                    AbstractC10287q0.this.m5542l(stackTraceString);
                }
            }, C0003a.m42611a());
        }
    }
}
