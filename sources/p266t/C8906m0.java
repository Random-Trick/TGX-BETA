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
    public final AbstractC8908b f28750a;
    public final Map<String, C8927z> f28751b = new ArrayMap(4);

    public static final class C8907a extends CameraManager.AvailabilityCallback {
        public final Executor f28752a;
        public final CameraManager.AvailabilityCallback f28753b;
        public final Object f28754c = new Object();
        public boolean f28755d = false;

        public C8907a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f28752a = executor;
            this.f28753b = availabilityCallback;
        }

        public void m10971d() {
            C8885e.m11027a(this.f28753b);
        }

        public void m10970e(String str) {
            this.f28753b.onCameraAvailable(str);
        }

        public void m10969f(String str) {
            this.f28753b.onCameraUnavailable(str);
        }

        public void m10968g() {
            synchronized (this.f28754c) {
                this.f28755d = true;
            }
        }

        @Override
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f28754c) {
                if (!this.f28755d) {
                    this.f28752a.execute(new Runnable() {
                        @Override
                        public final void run() {
                            C8906m0.C8907a.this.m10971d();
                        }
                    });
                }
            }
        }

        @Override
        public void onCameraAvailable(final String str) {
            synchronized (this.f28754c) {
                if (!this.f28755d) {
                    this.f28752a.execute(new Runnable() {
                        @Override
                        public final void run() {
                            C8906m0.C8907a.this.m10970e(str);
                        }
                    });
                }
            }
        }

        @Override
        public void onCameraUnavailable(final String str) {
            synchronized (this.f28754c) {
                if (!this.f28755d) {
                    this.f28752a.execute(new Runnable() {
                        @Override
                        public final void run() {
                            C8906m0.C8907a.this.m10969f(str);
                        }
                    });
                }
            }
        }
    }

    public interface AbstractC8908b {
        void mo10962a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void mo10961b(CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics mo10960c(String str);

        void mo10959d(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] mo10958e();
    }

    public C8906m0(AbstractC8908b bVar) {
        this.f28750a = bVar;
    }

    public static C8906m0 m10981a(Context context) {
        return m10980b(context, C11201k.m1237a());
    }

    public static C8906m0 m10980b(Context context, Handler handler) {
        return new C8906m0(C8910n0.m10967a(context, handler));
    }

    public C8927z m10979c(String str) {
        C8927z zVar;
        synchronized (this.f28751b) {
            zVar = this.f28751b.get(str);
            if (zVar == null) {
                try {
                    zVar = C8927z.m10950c(this.f28750a.mo10960c(str));
                    this.f28751b.put(str, zVar);
                } catch (AssertionError e) {
                    throw new C8887f(10002, e.getMessage(), e);
                }
            }
        }
        return zVar;
    }

    public String[] m10978d() {
        return this.f28750a.mo10958e();
    }

    public void m10977e(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f28750a.mo10959d(str, executor, stateCallback);
    }

    public void m10976f(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f28750a.mo10962a(executor, availabilityCallback);
    }

    public void m10975g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f28750a.mo10961b(availabilityCallback);
    }
}
