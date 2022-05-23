package t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

public class z {
    public final Map<CameraCharacteristics.Key<?>, Object> f22830a = new HashMap();
    public final a f22831b;

    public interface a {
        <T> T a(CameraCharacteristics.Key<T> key);
    }

    public z(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f22831b = new x(cameraCharacteristics);
        } else {
            this.f22831b = new y(cameraCharacteristics);
        }
    }

    public static z c(CameraCharacteristics cameraCharacteristics) {
        return new z(cameraCharacteristics);
    }

    public <T> T a(CameraCharacteristics.Key<T> key) {
        if (b(key)) {
            return (T) this.f22831b.a(key);
        }
        synchronized (this) {
            T t10 = (T) this.f22830a.get(key);
            if (t10 != null) {
                return t10;
            }
            T t11 = (T) this.f22831b.a(key);
            if (t11 != null) {
                this.f22830a.put(key, t11);
            }
            return t11;
        }
    }

    public final boolean b(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }
}
