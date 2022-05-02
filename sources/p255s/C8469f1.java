package p255s;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import p266t.C8879b;
import p266t.C8883d;

public final class C8469f1 {

    public static final class C8470a extends CameraCaptureSession.StateCallback {
        public final List<CameraCaptureSession.StateCallback> f27468a = new ArrayList();

        public C8470a(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof C8471b)) {
                    this.f27468a.add(stateCallback);
                }
            }
        }

        @Override
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f27468a) {
                stateCallback.onActive(cameraCaptureSession);
            }
        }

        @Override
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f27468a) {
                C8883d.m11028b(stateCallback, cameraCaptureSession);
            }
        }

        @Override
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f27468a) {
                stateCallback.onClosed(cameraCaptureSession);
            }
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f27468a) {
                stateCallback.onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f27468a) {
                stateCallback.onConfigured(cameraCaptureSession);
            }
        }

        @Override
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f27468a) {
                stateCallback.onReady(cameraCaptureSession);
            }
        }

        @Override
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f27468a) {
                C8879b.m11031a(stateCallback, cameraCaptureSession, surface);
            }
        }
    }

    public static final class C8471b extends CameraCaptureSession.StateCallback {
        @Override
        public void onActive(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onReady(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        }
    }

    public static CameraCaptureSession.StateCallback m12410a(List<CameraCaptureSession.StateCallback> list) {
        if (list.isEmpty()) {
            return m12409b();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new C8470a(list);
    }

    public static CameraCaptureSession.StateCallback m12409b() {
        return new C8471b();
    }
}
