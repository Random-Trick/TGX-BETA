package p293v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p266t.C8927z;
import p336y.AbstractC10311w1;

public class C9807b implements AbstractC10311w1 {
    public static boolean m6825a(C8927z zVar) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && ((Integer) zVar.m10952a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
