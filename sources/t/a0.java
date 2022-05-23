package t;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import t.a0;
import u.g;

public final class a0 {
    public final a f22752a;

    public interface a {
        void a(g gVar);
    }

    public static final class b extends CameraDevice.StateCallback {
        public final CameraDevice.StateCallback f22753a;
        public final Executor f22754b;

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f22754b = executor;
            this.f22753a = stateCallback;
        }

        public void e(CameraDevice cameraDevice) {
            this.f22753a.onClosed(cameraDevice);
        }

        public void f(CameraDevice cameraDevice) {
            this.f22753a.onDisconnected(cameraDevice);
        }

        public void g(CameraDevice cameraDevice, int i10) {
            this.f22753a.onError(cameraDevice, i10);
        }

        public void h(CameraDevice cameraDevice) {
            this.f22753a.onOpened(cameraDevice);
        }

        @Override
        public void onClosed(final CameraDevice cameraDevice) {
            this.f22754b.execute(new Runnable() {
                @Override
                public final void run() {
                    a0.b.this.e(cameraDevice);
                }
            });
        }

        @Override
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f22754b.execute(new Runnable() {
                @Override
                public final void run() {
                    a0.b.this.f(cameraDevice);
                }
            });
        }

        @Override
        public void onError(final CameraDevice cameraDevice, final int i10) {
            this.f22754b.execute(new Runnable() {
                @Override
                public final void run() {
                    a0.b.this.g(cameraDevice, i10);
                }
            });
        }

        @Override
        public void onOpened(final CameraDevice cameraDevice) {
            this.f22754b.execute(new Runnable() {
                @Override
                public final void run() {
                    a0.b.this.h(cameraDevice);
                }
            });
        }
    }

    public a0(CameraDevice cameraDevice, Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f22752a = new h0(cameraDevice);
        } else if (i10 >= 24) {
            this.f22752a = g0.h(cameraDevice, handler);
        } else if (i10 >= 23) {
            this.f22752a = f0.g(cameraDevice, handler);
        } else {
            this.f22752a = i0.d(cameraDevice, handler);
        }
    }

    public static a0 b(CameraDevice cameraDevice, Handler handler) {
        return new a0(cameraDevice, handler);
    }

    public void a(g gVar) {
        this.f22752a.a(gVar);
    }
}
