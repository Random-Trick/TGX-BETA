package p266t;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import p266t.C8876a0;
import p279u.C9407g;

public final class C8876a0 {
    public final AbstractC8877a f28700a;

    public interface AbstractC8877a {
        void mo10986a(C9407g gVar);
    }

    public static final class C8878b extends CameraDevice.StateCallback {
        public final CameraDevice.StateCallback f28701a;
        public final Executor f28702b;

        public C8878b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f28702b = executor;
            this.f28701a = stateCallback;
        }

        public void m11034e(CameraDevice cameraDevice) {
            this.f28701a.onClosed(cameraDevice);
        }

        public void m11033f(CameraDevice cameraDevice) {
            this.f28701a.onDisconnected(cameraDevice);
        }

        public void m11032g(CameraDevice cameraDevice, int i) {
            this.f28701a.onError(cameraDevice, i);
        }

        public void m11031h(CameraDevice cameraDevice) {
            this.f28701a.onOpened(cameraDevice);
        }

        @Override
        public void onClosed(final CameraDevice cameraDevice) {
            this.f28702b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8876a0.C8878b.this.m11034e(cameraDevice);
                }
            });
        }

        @Override
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f28702b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8876a0.C8878b.this.m11033f(cameraDevice);
                }
            });
        }

        @Override
        public void onError(final CameraDevice cameraDevice, final int i) {
            this.f28702b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8876a0.C8878b.this.m11032g(cameraDevice, i);
                }
            });
        }

        @Override
        public void onOpened(final CameraDevice cameraDevice) {
            this.f28702b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8876a0.C8878b.this.m11031h(cameraDevice);
                }
            });
        }
    }

    public C8876a0(CameraDevice cameraDevice, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f28700a = new C8895h0(cameraDevice);
        } else if (i >= 24) {
            this.f28700a = C8893g0.m10987h(cameraDevice, handler);
        } else if (i >= 23) {
            this.f28700a = C8888f0.m11020g(cameraDevice, handler);
        } else {
            this.f28700a = C8897i0.m10983d(cameraDevice, handler);
        }
    }

    public static C8876a0 m11039b(CameraDevice cameraDevice, Handler handler) {
        return new C8876a0(cameraDevice, handler);
    }

    public void m11040a(C9407g gVar) {
        this.f28700a.mo10986a(gVar);
    }
}
