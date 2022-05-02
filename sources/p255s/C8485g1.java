package p255s;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.List;

public final class C8485g1 {

    public static final class C8486a extends CameraDevice.StateCallback {
        public final List<CameraDevice.StateCallback> f27530a = new ArrayList();

        public C8486a(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof C8487b)) {
                    this.f27530a.add(stateCallback);
                }
            }
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f27530a) {
                stateCallback.onClosed(cameraDevice);
            }
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f27530a) {
                stateCallback.onDisconnected(cameraDevice);
            }
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i) {
            for (CameraDevice.StateCallback stateCallback : this.f27530a) {
                stateCallback.onError(cameraDevice, i);
            }
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f27530a) {
                stateCallback.onOpened(cameraDevice);
            }
        }
    }

    public static final class C8487b extends CameraDevice.StateCallback {
        @Override
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i) {
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public static CameraDevice.StateCallback m12323a(List<CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return m12322b();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new C8486a(list);
    }

    public static CameraDevice.StateCallback m12322b() {
        return new C8487b();
    }
}
