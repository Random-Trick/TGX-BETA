package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import t.z;
import y.w1;

public class c implements w1 {
    public static boolean b(z zVar) {
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2 && Build.VERSION.SDK_INT == 21;
    }

    public int a() {
        return 2;
    }
}
