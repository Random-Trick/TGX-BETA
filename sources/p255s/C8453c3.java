package p255s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import androidx.camera.core.AbstractC0615m;
import androidx.camera.core.AbstractC0620m3;
import androidx.lifecycle.C0855n;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import p015b0.C1111f;
import p022b7.AbstractFutureC1291a;
import p027c0.AbstractC1421f;
import p158l0.C6287c;
import p240r.C8333a;
import p255s.C8564t;
import p266t.C8927z;

public final class C8453c3 {
    public final C8564t f27429a;
    public final Executor f27430b;
    public final C8461d3 f27431c;
    public final C0855n<AbstractC0620m3> f27432d;
    public final AbstractC8455b f27433e;
    public boolean f27434f = false;
    public C8564t.AbstractC8567c f27435g = new C8454a();

    public class C8454a implements C8564t.AbstractC8567c {
        public C8454a() {
        }

        @Override
        public boolean mo6115a(TotalCaptureResult totalCaptureResult) {
            C8453c3.this.f27433e.mo12065a(totalCaptureResult);
            return false;
        }
    }

    public interface AbstractC8455b {
        void mo12065a(TotalCaptureResult totalCaptureResult);

        void mo12064b(C8333a.C8334a aVar);

        float mo12063c();

        float mo12062d();

        void mo12061e(float f, C6287c.C6288a<Void> aVar);

        void mo12060f();
    }

    public C8453c3(C8564t tVar, C8927z zVar, Executor executor) {
        this.f27429a = tVar;
        this.f27430b = executor;
        AbstractC8455b d = m12433d(zVar);
        this.f27433e = d;
        C8461d3 d3Var = new C8461d3(d.mo12063c(), d.mo12062d());
        this.f27431c = d3Var;
        d3Var.m12418f(1.0f);
        this.f27432d = new C0855n<>(AbstractC1421f.m36961e(d3Var));
        tVar.m12115s(this.f27435g);
    }

    public static AbstractC8455b m12433d(C8927z zVar) {
        if (m12430g(zVar)) {
            return new C8436a(zVar);
        }
        return new C8575u1(zVar);
    }

    public static AbstractC0620m3 m12432e(C8927z zVar) {
        AbstractC8455b d = m12433d(zVar);
        C8461d3 d3Var = new C8461d3(d.mo12063c(), d.mo12062d());
        d3Var.m12418f(1.0f);
        return AbstractC1421f.m36961e(d3Var);
    }

    public static boolean m12430g(C8927z zVar) {
        return Build.VERSION.SDK_INT >= 30 && zVar.m10952a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) != null;
    }

    public Object m12428i(final AbstractC0620m3 m3Var, final C6287c.C6288a aVar) {
        this.f27430b.execute(new Runnable() {
            @Override
            public final void run() {
                C8453c3.this.m12429h(aVar, m3Var);
            }
        });
        return "setZoomRatio";
    }

    public void m12434c(C8333a.C8334a aVar) {
        this.f27433e.mo12064b(aVar);
    }

    public LiveData<AbstractC0620m3> m12431f() {
        return this.f27432d;
    }

    public void m12427j(boolean z) {
        AbstractC0620m3 e;
        if (this.f27434f != z) {
            this.f27434f = z;
            if (!z) {
                synchronized (this.f27431c) {
                    this.f27431c.m12418f(1.0f);
                    e = AbstractC1421f.m36961e(this.f27431c);
                }
                m12424m(e);
                this.f27433e.mo12060f();
                this.f27429a.m12127e0();
            }
        }
    }

    public AbstractFutureC1291a<Void> m12426k(float f) {
        final AbstractC0620m3 e;
        synchronized (this.f27431c) {
            try {
                this.f27431c.m12418f(f);
                e = AbstractC1421f.m36961e(this.f27431c);
            } catch (IllegalArgumentException e2) {
                return C1111f.m38353f(e2);
            }
        }
        m12424m(e);
        return C6287c.m20719a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object i;
                i = C8453c3.this.m12428i(e, aVar);
                return i;
            }
        });
    }

    public final void m12429h(C6287c.C6288a<Void> aVar, AbstractC0620m3 m3Var) {
        AbstractC0620m3 e;
        if (!this.f27434f) {
            synchronized (this.f27431c) {
                this.f27431c.m12418f(1.0f);
                e = AbstractC1421f.m36961e(this.f27431c);
            }
            m12424m(e);
            aVar.m20713f(new AbstractC0615m.C0616a("Camera is not active."));
            return;
        }
        m12424m(m3Var);
        this.f27433e.mo12061e(m3Var.mo12421c(), aVar);
        this.f27429a.m12127e0();
    }

    public final void m12424m(AbstractC0620m3 m3Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f27432d.mo15730m(m3Var);
        } else {
            this.f27432d.mo39634k(m3Var);
        }
    }
}
