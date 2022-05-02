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
    public final C8564t f27432a;
    public final Executor f27433b;
    public final C8461d3 f27434c;
    public final C0855n<AbstractC0620m3> f27435d;
    public final AbstractC8455b f27436e;
    public boolean f27437f = false;
    public C8564t.AbstractC8567c f27438g = new C8454a();

    public class C8454a implements C8564t.AbstractC8567c {
        public C8454a() {
        }

        @Override
        public boolean mo6115a(TotalCaptureResult totalCaptureResult) {
            C8453c3.this.f27436e.mo12064a(totalCaptureResult);
            return false;
        }
    }

    public interface AbstractC8455b {
        void mo12064a(TotalCaptureResult totalCaptureResult);

        void mo12063b(C8333a.C8334a aVar);

        float mo12062c();

        float mo12061d();

        void mo12060e(float f, C6287c.C6288a<Void> aVar);

        void mo12059f();
    }

    public C8453c3(C8564t tVar, C8927z zVar, Executor executor) {
        this.f27432a = tVar;
        this.f27433b = executor;
        AbstractC8455b d = m12432d(zVar);
        this.f27436e = d;
        C8461d3 d3Var = new C8461d3(d.mo12062c(), d.mo12061d());
        this.f27434c = d3Var;
        d3Var.m12417f(1.0f);
        this.f27435d = new C0855n<>(AbstractC1421f.m36964e(d3Var));
        tVar.m12114s(this.f27438g);
    }

    public static AbstractC8455b m12432d(C8927z zVar) {
        if (m12429g(zVar)) {
            return new C8436a(zVar);
        }
        return new C8575u1(zVar);
    }

    public static AbstractC0620m3 m12431e(C8927z zVar) {
        AbstractC8455b d = m12432d(zVar);
        C8461d3 d3Var = new C8461d3(d.mo12062c(), d.mo12061d());
        d3Var.m12417f(1.0f);
        return AbstractC1421f.m36964e(d3Var);
    }

    public static boolean m12429g(C8927z zVar) {
        return Build.VERSION.SDK_INT >= 30 && zVar.m10951a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) != null;
    }

    public Object m12427i(final AbstractC0620m3 m3Var, final C6287c.C6288a aVar) {
        this.f27433b.execute(new Runnable() {
            @Override
            public final void run() {
                C8453c3.this.m12428h(aVar, m3Var);
            }
        });
        return "setZoomRatio";
    }

    public void m12433c(C8333a.C8334a aVar) {
        this.f27436e.mo12063b(aVar);
    }

    public LiveData<AbstractC0620m3> m12430f() {
        return this.f27435d;
    }

    public void m12426j(boolean z) {
        AbstractC0620m3 e;
        if (this.f27437f != z) {
            this.f27437f = z;
            if (!z) {
                synchronized (this.f27434c) {
                    this.f27434c.m12417f(1.0f);
                    e = AbstractC1421f.m36964e(this.f27434c);
                }
                m12423m(e);
                this.f27436e.mo12059f();
                this.f27432a.m12126e0();
            }
        }
    }

    public AbstractFutureC1291a<Void> m12425k(float f) {
        final AbstractC0620m3 e;
        synchronized (this.f27434c) {
            try {
                this.f27434c.m12417f(f);
                e = AbstractC1421f.m36964e(this.f27434c);
            } catch (IllegalArgumentException e2) {
                return C1111f.m38356f(e2);
            }
        }
        m12423m(e);
        return C6287c.m20720a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object i;
                i = C8453c3.this.m12427i(e, aVar);
                return i;
            }
        });
    }

    public final void m12428h(C6287c.C6288a<Void> aVar, AbstractC0620m3 m3Var) {
        AbstractC0620m3 e;
        if (!this.f27437f) {
            synchronized (this.f27434c) {
                this.f27434c.m12417f(1.0f);
                e = AbstractC1421f.m36964e(this.f27434c);
            }
            m12423m(e);
            aVar.m20714f(new AbstractC0615m.C0616a("Camera is not active."));
            return;
        }
        m12423m(m3Var);
        this.f27436e.mo12060e(m3Var.mo12420c(), aVar);
        this.f27432a.m12126e0();
    }

    public final void m12423m(AbstractC0620m3 m3Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f27435d.mo15730m(m3Var);
        } else {
            this.f27435d.mo39637k(m3Var);
        }
    }
}
