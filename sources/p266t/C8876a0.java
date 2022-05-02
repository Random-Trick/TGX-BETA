package p266t;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import p266t.C8876a0;
import p279u.C9407g;

public final class C8876a0 {
    public final AbstractC8877a f28697a;

    public interface AbstractC8877a {
        void mo10987a(C9407g gVar);
    }

    public static final class C8878b extends CameraDevice.StateCallback {
        public final CameraDevice.StateCallback f28698a;
        public final Executor f28699b;

        public C8878b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f28699b = executor;
            this.f28698a = stateCallback;
        }

        public void m11035e(CameraDevice cameraDevice) {
            this.f28698a.onClosed(cameraDevice);
        }

        public void m11034f(CameraDevice cameraDevice) {
            this.f28698a.onDisconnected(cameraDevice);
        }

        public void m11033g(CameraDevice cameraDevice, int i) {
            this.f28698a.onError(cameraDevice, i);
        }

        public void m11032h(CameraDevice cameraDevice) {
            this.f28698a.onOpened(cameraDevice);
        }

        @Override
        public void onClosed(final CameraDevice cameraDevice) {
            this.f28699b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8876a0.C8878b.this.m11035e(cameraDevice);
                }
            });
        }

        @Override
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f28699b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8876a0.C8878b.this.m11034f(cameraDevice);
                }
            });
        }

        @Override
        public void onError(final CameraDevice cameraDevice, final int i) {
            this.f28699b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8876a0.C8878b.this.m11033g(cameraDevice, i);
                }
            });
        }

        @Override
        public void onOpened(final CameraDevice cameraDevice) {
            this.f28699b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8876a0.C8878b.this.m11032h(cameraDevice);
                }
            });
        }
    }

    public C8876a0(CameraDevice cameraDevice, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f28697a = new C8895h0(cameraDevice);
        } else if (i >= 24) {
            this.f28697a = C8893g0.m10988h(cameraDevice, handler);
        } else if (i >= 23) {
            this.f28697a = C8888f0.m11021g(cameraDevice, handler);
        } else {
            this.f28697a = C8897i0.m10984d(cameraDevice, handler);
        }
    }

    public static C8876a0 m11040b(CameraDevice cameraDevice, Handler handler) {
        return new C8876a0(cameraDevice, handler);
    }

    public void m11041a(C9407g gVar) {
        this.f28697a.mo10987a(gVar);
    }
}
