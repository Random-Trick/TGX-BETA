package t;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;
import t.m0;
import z.k;

public final class m0 {
    public final b f22798a;
    public final Map<String, z> f22799b = new ArrayMap(4);

    public static final class a extends CameraManager.AvailabilityCallback {
        public final Executor f22800a;
        public final CameraManager.AvailabilityCallback f22801b;
        public final Object f22802c = new Object();
        public boolean f22803d = false;

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f22800a = executor;
            this.f22801b = availabilityCallback;
        }

        public void d() {
            e.a(this.f22801b);
        }

        public void e(String str) {
            this.f22801b.onCameraAvailable(str);
        }

        public void f(String str) {
            this.f22801b.onCameraUnavailable(str);
        }

        public void g() {
            synchronized (this.f22802c) {
                this.f22803d = true;
            }
        }

        @Override
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f22802c) {
                if (!this.f22803d) {
                    this.f22800a.execute(new Runnable() {
                        @Override
                        public final void run() {
                            m0.a.this.d();
                        }
                    });
                }
            }
        }

        @Override
        public void onCameraAvailable(final String str) {
            synchronized (this.f22802c) {
                if (!this.f22803d) {
                    this.f22800a.execute(new Runnable() {
                        @Override
                        public final void run() {
                            m0.a.this.e(str);
                        }
                    });
                }
            }
        }

        @Override
        public void onCameraUnavailable(final String str) {
            synchronized (this.f22802c) {
                if (!this.f22803d) {
                    this.f22800a.execute(new Runnable() {
                        @Override
                        public final void run() {
                            m0.a.this.f(str);
                        }
                    });
                }
            }
        }
    }

    public interface b {
        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void b(CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics c(String str);

        void d(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] e();
    }

    public m0(b bVar) {
        this.f22798a = bVar;
    }

    public static m0 a(Context context) {
        return b(context, k.a());
    }

    public static m0 b(Context context, Handler handler) {
        return new m0(n0.a(context, handler));
    }

    public z c(String str) {
        z zVar;
        synchronized (this.f22799b) {
            zVar = this.f22799b.get(str);
            if (zVar == null) {
                try {
                    zVar = z.c(this.f22798a.c(str));
                    this.f22799b.put(str, zVar);
                } catch (AssertionError e10) {
                    throw new f(10002, e10.getMessage(), e10);
                }
            }
        }
        return zVar;
    }

    public String[] d() {
        return this.f22798a.e();
    }

    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f22798a.d(str, executor, stateCallback);
    }

    public void f(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f22798a.a(executor, availabilityCallback);
    }

    public void g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f22798a.b(availabilityCallback);
    }
}
