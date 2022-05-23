package s;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.List;

public final class g1 {

    public static final class a extends CameraDevice.StateCallback {
        public final List<CameraDevice.StateCallback> f22052a = new ArrayList();

        public a(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof b)) {
                    this.f22052a.add(stateCallback);
                }
            }
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f22052a) {
                stateCallback.onClosed(cameraDevice);
            }
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f22052a) {
                stateCallback.onDisconnected(cameraDevice);
            }
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i10) {
            for (CameraDevice.StateCallback stateCallback : this.f22052a) {
                stateCallback.onError(cameraDevice, i10);
            }
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f22052a) {
                stateCallback.onOpened(cameraDevice);
            }
        }
    }

    public static final class b extends CameraDevice.StateCallback {
        @Override
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i10) {
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public static CameraDevice.StateCallback a(List<CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return b();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new a(list);
    }

    public static CameraDevice.StateCallback b() {
        return new b();
    }
}
