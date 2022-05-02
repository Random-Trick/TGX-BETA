package p255s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.AbstractC0615m;
import androidx.camera.core.C0662u1;
import androidx.lifecycle.C0855n;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import p015b0.C1111f;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;
import p255s.C8564t;
import p266t.C8927z;
import p351z.C11202l;

public final class C8601z2 {
    public final C8564t f27865a;
    public final C0855n<Integer> f27866b;
    public final boolean f27867c;
    public final Executor f27868d;
    public boolean f27869e;
    public C6287c.C6288a<Void> f27870f;
    public boolean f27871g;

    public C8601z2(C8564t tVar, C8927z zVar, Executor executor) {
        this.f27865a = tVar;
        this.f27868d = executor;
        Boolean bool = (Boolean) zVar.m10952a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        this.f27867c = bool != null && bool.booleanValue();
        this.f27866b = new C0855n<>(0);
        tVar.m12115s(new C8564t.AbstractC8567c() {
            @Override
            public final boolean mo6115a(TotalCaptureResult totalCaptureResult) {
                boolean i;
                i = C8601z2.this.m11995i(totalCaptureResult);
                return i;
            }
        });
    }

    public Object m11996h(final boolean z, final C6287c.C6288a aVar) {
        this.f27868d.execute(new Runnable() {
            @Override
            public final void run() {
                C8601z2.this.m11997g(aVar, z);
            }
        });
        return "enableTorch: " + z;
    }

    public boolean m11995i(TotalCaptureResult totalCaptureResult) {
        if (this.f27870f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f27871g) {
                this.f27870f.m20716c(null);
                this.f27870f = null;
            }
        }
        return false;
    }

    public AbstractFutureC1291a<Void> m12000d(final boolean z) {
        if (!this.f27867c) {
            C0662u1.m40653a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return C1111f.m38353f(new IllegalStateException("No flash unit"));
        }
        m11993k(this.f27866b, Integer.valueOf(z ? 1 : 0));
        return C6287c.m20719a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object h;
                h = C8601z2.this.m11996h(z, aVar);
                return h;
            }
        });
    }

    public void m11997g(C6287c.C6288a<Void> aVar, boolean z) {
        if (!this.f27867c) {
            if (aVar != null) {
                aVar.m20713f(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f27869e) {
            m11993k(this.f27866b, 0);
            if (aVar != null) {
                aVar.m20713f(new AbstractC0615m.C0616a("Camera is not active."));
            }
        } else {
            this.f27871g = z;
            this.f27865a.m12112v(z);
            m11993k(this.f27866b, Integer.valueOf(z ? 1 : 0));
            C6287c.C6288a<Void> aVar2 = this.f27870f;
            if (aVar2 != null) {
                aVar2.m20713f(new AbstractC0615m.C0616a("There is a new enableTorch being set"));
            }
            this.f27870f = aVar;
        }
    }

    public LiveData<Integer> m11998f() {
        return this.f27866b;
    }

    public void m11994j(boolean z) {
        if (this.f27869e != z) {
            this.f27869e = z;
            if (!z) {
                if (this.f27871g) {
                    this.f27871g = false;
                    this.f27865a.m12112v(false);
                    m11993k(this.f27866b, 0);
                }
                C6287c.C6288a<Void> aVar = this.f27870f;
                if (aVar != null) {
                    aVar.m20713f(new AbstractC0615m.C0616a("Camera is not active."));
                    this.f27870f = null;
                }
            }
        }
    }

    public final <T> void m11993k(C0855n<T> nVar, T t) {
        if (C11202l.m1235b()) {
            nVar.mo15730m(t);
        } else {
            nVar.mo39634k(t);
        }
    }
}
