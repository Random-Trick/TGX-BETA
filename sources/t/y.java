package t;

import android.hardware.camera2.CameraCharacteristics;
import t.z;

public class y implements z.a {
    public final CameraCharacteristics f22829a;

    public y(CameraCharacteristics cameraCharacteristics) {
        this.f22829a = cameraCharacteristics;
    }

    @Override
    public <T> T a(CameraCharacteristics.Key<T> key) {
        return (T) this.f22829a.get(key);
    }
}
