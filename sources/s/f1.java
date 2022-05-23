package s;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import t.d;

public final class f1 {

    public static final class a extends CameraCaptureSession.StateCallback {
        public final List<CameraCaptureSession.StateCallback> f22013a = new ArrayList();

        public a(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof b)) {
                    this.f22013a.add(stateCallback);
                }
            }
        }

        @Override
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f22013a) {
                stateCallback.onActive(cameraCaptureSession);
            }
        }

        @Override
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f22013a) {
                d.b(stateCallback, cameraCaptureSession);
            }
        }

        @Override
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f22013a) {
                stateCallback.onClosed(cameraCaptureSession);
            }
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f22013a) {
                stateCallback.onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f22013a) {
                stateCallback.onConfigured(cameraCaptureSession);
            }
        }

        @Override
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f22013a) {
                stateCallback.onReady(cameraCaptureSession);
            }
        }

        @Override
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            for (CameraCaptureSession.StateCallback stateCallback : this.f22013a) {
                t.b.a(stateCallback, cameraCaptureSession, surface);
            }
        }
    }

    public static final class b extends CameraCaptureSession.StateCallback {
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

    public static CameraCaptureSession.StateCallback a(List<CameraCaptureSession.StateCallback> list) {
        if (list.isEmpty()) {
            return b();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new a(list);
    }

    public static CameraCaptureSession.StateCallback b() {
        return new b();
    }
}
