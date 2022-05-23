package s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import androidx.camera.core.l3;
import androidx.camera.core.m;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import c0.f;
import java.util.concurrent.Executor;
import l0.c;
import r.a;
import s.t;
import t.z;

public final class c3 {
    public final t f21975a;
    public final Executor f21976b;
    public final d3 f21977c;
    public final n<l3> f21978d;
    public final b f21979e;
    public boolean f21980f = false;
    public t.c f21981g = new a();

    public class a implements t.c {
        public a() {
        }

        @Override
        public boolean a(TotalCaptureResult totalCaptureResult) {
            c3.this.f21979e.a(totalCaptureResult);
            return false;
        }
    }

    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        void b(a.C0201a aVar);

        float c();

        float d();

        void e(float f10, c.a<Void> aVar);

        void f();
    }

    public c3(t tVar, z zVar, Executor executor) {
        this.f21975a = tVar;
        this.f21976b = executor;
        b d10 = d(zVar);
        this.f21979e = d10;
        d3 d3Var = new d3(d10.c(), d10.d());
        this.f21977c = d3Var;
        d3Var.f(1.0f);
        this.f21978d = new n<>(f.e(d3Var));
        tVar.s(this.f21981g);
    }

    public static b d(z zVar) {
        if (g(zVar)) {
            return new s.a(zVar);
        }
        return new u1(zVar);
    }

    public static l3 e(z zVar) {
        b d10 = d(zVar);
        d3 d3Var = new d3(d10.c(), d10.d());
        d3Var.f(1.0f);
        return f.e(d3Var);
    }

    public static boolean g(z zVar) {
        return Build.VERSION.SDK_INT >= 30 && zVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) != null;
    }

    public Object i(final l3 l3Var, final c.a aVar) {
        this.f21976b.execute(new Runnable() {
            @Override
            public final void run() {
                c3.this.h(aVar, l3Var);
            }
        });
        return "setZoomRatio";
    }

    public void c(a.C0201a aVar) {
        this.f21979e.b(aVar);
    }

    public LiveData<l3> f() {
        return this.f21978d;
    }

    public void j(boolean z10) {
        l3 e10;
        if (this.f21980f != z10) {
            this.f21980f = z10;
            if (!z10) {
                synchronized (this.f21977c) {
                    this.f21977c.f(1.0f);
                    e10 = f.e(this.f21977c);
                }
                m(e10);
                this.f21979e.f();
                this.f21975a.e0();
            }
        }
    }

    public c7.a<Void> k(float f10) {
        final l3 e10;
        synchronized (this.f21977c) {
            try {
                this.f21977c.f(f10);
                e10 = f.e(this.f21977c);
            } catch (IllegalArgumentException e11) {
                return b0.f.f(e11);
            }
        }
        m(e10);
        return c.a(new c.AbstractC0147c() {
            @Override
            public final Object a(c.a aVar) {
                Object i10;
                i10 = c3.this.i(e10, aVar);
                return i10;
            }
        });
    }

    public final void h(c.a<Void> aVar, l3 l3Var) {
        l3 e10;
        if (!this.f21980f) {
            synchronized (this.f21977c) {
                this.f21977c.f(1.0f);
                e10 = f.e(this.f21977c);
            }
            m(e10);
            aVar.f(new m.a("Camera is not active."));
            return;
        }
        m(l3Var);
        this.f21979e.e(l3Var.c(), aVar);
        this.f21975a.e0();
    }

    public final void m(l3 l3Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f21978d.m(l3Var);
        } else {
            this.f21978d.k(l3Var);
        }
    }
}
