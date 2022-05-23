package s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.m;
import androidx.camera.core.t1;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import b0.f;
import c7.a;
import java.util.concurrent.Executor;
import l0.c;
import s.t;
import t.z;
import z.l;

public final class z2 {
    public final t f22381a;
    public final n<Integer> f22382b;
    public final boolean f22383c;
    public final Executor f22384d;
    public boolean f22385e;
    public c.a<Void> f22386f;
    public boolean f22387g;

    public z2(t tVar, z zVar, Executor executor) {
        this.f22381a = tVar;
        this.f22384d = executor;
        Boolean bool = (Boolean) zVar.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        this.f22383c = bool != null && bool.booleanValue();
        this.f22382b = new n<>(0);
        tVar.s(new t.c() {
            @Override
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                boolean i10;
                i10 = z2.this.i(totalCaptureResult);
                return i10;
            }
        });
    }

    public Object h(final boolean z10, final c.a aVar) {
        this.f22384d.execute(new Runnable() {
            @Override
            public final void run() {
                z2.this.g(aVar, z10);
            }
        });
        return "enableTorch: " + z10;
    }

    public boolean i(TotalCaptureResult totalCaptureResult) {
        if (this.f22386f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f22387g) {
                this.f22386f.c(null);
                this.f22386f = null;
            }
        }
        return false;
    }

    public a<Void> d(final boolean z10) {
        if (!this.f22383c) {
            t1.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return f.f(new IllegalStateException("No flash unit"));
        }
        k(this.f22382b, Integer.valueOf(z10 ? 1 : 0));
        return c.a(new c.AbstractC0147c() {
            @Override
            public final Object a(c.a aVar) {
                Object h10;
                h10 = z2.this.h(z10, aVar);
                return h10;
            }
        });
    }

    public void g(c.a<Void> aVar, boolean z10) {
        if (!this.f22383c) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f22385e) {
            k(this.f22382b, 0);
            if (aVar != null) {
                aVar.f(new m.a("Camera is not active."));
            }
        } else {
            this.f22387g = z10;
            this.f22381a.v(z10);
            k(this.f22382b, Integer.valueOf(z10 ? 1 : 0));
            c.a<Void> aVar2 = this.f22386f;
            if (aVar2 != null) {
                aVar2.f(new m.a("There is a new enableTorch being set"));
            }
            this.f22386f = aVar;
        }
    }

    public LiveData<Integer> f() {
        return this.f22382b;
    }

    public void j(boolean z10) {
        if (this.f22385e != z10) {
            this.f22385e = z10;
            if (!z10) {
                if (this.f22387g) {
                    this.f22387g = false;
                    this.f22381a.v(false);
                    k(this.f22382b, 0);
                }
                c.a<Void> aVar = this.f22386f;
                if (aVar != null) {
                    aVar.f(new m.a("Camera is not active."));
                    this.f22386f = null;
                }
            }
        }
    }

    public final <T> void k(n<T> nVar, T t10) {
        if (l.b()) {
            nVar.m(t10);
        } else {
            nVar.k(t10);
        }
    }
}
