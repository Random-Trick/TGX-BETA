package p266t;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p266t.C8906m0;
import p351z.C11201k;

public final class C8906m0 {
    public final AbstractC8908b f28753a;
    public final Map<String, C8927z> f28754b = new ArrayMap(4);

    public static final class C8907a extends CameraManager.AvailabilityCallback {
        public final Executor f28755a;
        public final CameraManager.AvailabilityCallback f28756b;
        public final Object f28757c = new Object();
        public boolean f28758d = false;

        public C8907a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f28755a = executor;
            this.f28756b = availabilityCallback;
        }

        public void m10970d() {
            C8885e.m11026a(this.f28756b);
        }

        public void m10969e(String str) {
            this.f28756b.onCameraAvailable(str);
        }

        public void m10968f(String str) {
            this.f28756b.onCameraUnavailable(str);
        }

        public void m10967g() {
            synchronized (this.f28757c) {
                this.f28758d = true;
            }
        }

        @Override
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f28757c) {
                if (!this.f28758d) {
                    this.f28755a.execute(new Runnable() {
                        @Override
                        public final void run() {
                            C8906m0.C8907a.this.m10970d();
                        }
                    });
                }
            }
        }

        @Override
        public void onCameraAvailable(final String str) {
            synchronized (this.f28757c) {
                if (!this.f28758d) {
                    this.f28755a.execute(new Runnable() {
                        @Override
                        public final void run() {
                            C8906m0.C8907a.this.m10969e(str);
                        }
                    });
                }
            }
        }

        @Override
        public void onCameraUnavailable(final String str) {
            synchronized (this.f28757c) {
                if (!this.f28758d) {
                    this.f28755a.execute(new Runnable() {
                        @Override
                        public final void run() {
                            C8906m0.C8907a.this.m10968f(str);
                        }
                    });
                }
            }
        }
    }

    public interface AbstractC8908b {
        void mo10961a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void mo10960b(CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics mo10959c(String str);

        void mo10958d(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] mo10957e();
    }

    public C8906m0(AbstractC8908b bVar) {
        this.f28753a = bVar;
    }

    public static C8906m0 m10980a(Context context) {
        return m10979b(context, C11201k.m1237a());
    }

    public static C8906m0 m10979b(Context context, Handler handler) {
        return new C8906m0(C8910n0.m10966a(context, handler));
    }

    public C8927z m10978c(String str) {
        C8927z zVar;
        synchronized (this.f28754b) {
            zVar = this.f28754b.get(str);
            if (zVar == null) {
                try {
                    zVar = C8927z.m10949c(this.f28753a.mo10959c(str));
                    this.f28754b.put(str, zVar);
                } catch (AssertionError e) {
                    throw new C8887f(10002, e.getMessage(), e);
                }
            }
        }
        return zVar;
    }

    public String[] m10977d() {
        return this.f28753a.mo10957e();
    }

    public void m10976e(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f28753a.mo10958d(str, executor, stateCallback);
    }

    public void m10975f(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f28753a.mo10961a(executor, availabilityCallback);
    }

    public void m10974g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f28753a.mo10960b(availabilityCallback);
    }
}
