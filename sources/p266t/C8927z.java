package p266t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

public class C8927z {
    public final Map<CameraCharacteristics.Key<?>, Object> f28784a = new HashMap();
    public final AbstractC8928a f28785b;

    public interface AbstractC8928a {
        <T> T mo10949a(CameraCharacteristics.Key<T> key);
    }

    public C8927z(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28785b = new C8925x(cameraCharacteristics);
        } else {
            this.f28785b = new C8926y(cameraCharacteristics);
        }
    }

    public static C8927z m10950c(CameraCharacteristics cameraCharacteristics) {
        return new C8927z(cameraCharacteristics);
    }

    public <T> T m10952a(CameraCharacteristics.Key<T> key) {
        if (m10951b(key)) {
            return (T) this.f28785b.mo10949a(key);
        }
        synchronized (this) {
            T t = (T) this.f28784a.get(key);
            if (t != null) {
                return t;
            }
            T t2 = (T) this.f28785b.mo10949a(key);
            if (t2 != null) {
                this.f28784a.put(key, t2);
            }
            return t2;
        }
    }

    public final boolean m10951b(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }
}
