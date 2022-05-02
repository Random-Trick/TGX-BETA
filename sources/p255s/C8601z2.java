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
    public final C8564t f27868a;
    public final C0855n<Integer> f27869b;
    public final boolean f27870c;
    public final Executor f27871d;
    public boolean f27872e;
    public C6287c.C6288a<Void> f27873f;
    public boolean f27874g;

    public C8601z2(C8564t tVar, C8927z zVar, Executor executor) {
        this.f27868a = tVar;
        this.f27871d = executor;
        Boolean bool = (Boolean) zVar.m10951a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        this.f27870c = bool != null && bool.booleanValue();
        this.f27869b = new C0855n<>(0);
        tVar.m12114s(new C8564t.AbstractC8567c() {
            @Override
            public final boolean mo6115a(TotalCaptureResult totalCaptureResult) {
                boolean i;
                i = C8601z2.this.m11994i(totalCaptureResult);
                return i;
            }
        });
    }

    public Object m11995h(final boolean z, final C6287c.C6288a aVar) {
        this.f27871d.execute(new Runnable() {
            @Override
            public final void run() {
                C8601z2.this.m11996g(aVar, z);
            }
        });
        return "enableTorch: " + z;
    }

    public boolean m11994i(TotalCaptureResult totalCaptureResult) {
        if (this.f27873f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f27874g) {
                this.f27873f.m20717c(null);
                this.f27873f = null;
            }
        }
        return false;
    }

    public AbstractFutureC1291a<Void> m11999d(final boolean z) {
        if (!this.f27870c) {
            C0662u1.m40656a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return C1111f.m38356f(new IllegalStateException("No flash unit"));
        }
        m11992k(this.f27869b, Integer.valueOf(z ? 1 : 0));
        return C6287c.m20720a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object h;
                h = C8601z2.this.m11995h(z, aVar);
                return h;
            }
        });
    }

    public void m11996g(C6287c.C6288a<Void> aVar, boolean z) {
        if (!this.f27870c) {
            if (aVar != null) {
                aVar.m20714f(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f27872e) {
            m11992k(this.f27869b, 0);
            if (aVar != null) {
                aVar.m20714f(new AbstractC0615m.C0616a("Camera is not active."));
            }
        } else {
            this.f27874g = z;
            this.f27868a.m12111v(z);
            m11992k(this.f27869b, Integer.valueOf(z ? 1 : 0));
            C6287c.C6288a<Void> aVar2 = this.f27873f;
            if (aVar2 != null) {
                aVar2.m20714f(new AbstractC0615m.C0616a("There is a new enableTorch being set"));
            }
            this.f27873f = aVar;
        }
    }

    public LiveData<Integer> m11997f() {
        return this.f27869b;
    }

    public void m11993j(boolean z) {
        if (this.f27872e != z) {
            this.f27872e = z;
            if (!z) {
                if (this.f27874g) {
                    this.f27874g = false;
                    this.f27868a.m12111v(false);
                    m11992k(this.f27869b, 0);
                }
                C6287c.C6288a<Void> aVar = this.f27873f;
                if (aVar != null) {
                    aVar.m20714f(new AbstractC0615m.C0616a("Camera is not active."));
                    this.f27873f = null;
                }
            }
        }
    }

    public final <T> void m11992k(C0855n<T> nVar, T t) {
        if (C11202l.m1235b()) {
            nVar.mo15730m(t);
        } else {
            nVar.mo39637k(t);
        }
    }
}
