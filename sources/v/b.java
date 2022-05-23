package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import t.z;
import y.w1;

public class b implements w1 {
    public static boolean a(z zVar) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
