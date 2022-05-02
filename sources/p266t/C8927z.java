package p266t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

public class C8927z {
    public final Map<CameraCharacteristics.Key<?>, Object> f28787a = new HashMap();
    public final AbstractC8928a f28788b;

    public interface AbstractC8928a {
        <T> T mo10948a(CameraCharacteristics.Key<T> key);
    }

    public C8927z(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28788b = new C8925x(cameraCharacteristics);
        } else {
            this.f28788b = new C8926y(cameraCharacteristics);
        }
    }

    public static C8927z m10949c(CameraCharacteristics cameraCharacteristics) {
        return new C8927z(cameraCharacteristics);
    }

    public <T> T m10951a(CameraCharacteristics.Key<T> key) {
        if (m10950b(key)) {
            return (T) this.f28788b.mo10948a(key);
        }
        synchronized (this) {
            T t = (T) this.f28787a.get(key);
            if (t != null) {
                return t;
            }
            T t2 = (T) this.f28788b.mo10948a(key);
            if (t2 != null) {
                this.f28787a.put(key, t2);
            }
            return t2;
        }
    }

    public final boolean m10950b(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }
}
