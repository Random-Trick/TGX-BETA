package p293v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p266t.C8927z;
import p336y.AbstractC10311w1;

public class C9808c implements AbstractC10311w1 {
    public static boolean m6823b(C8927z zVar) {
        Integer num = (Integer) zVar.m10952a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2 && Build.VERSION.SDK_INT == 21;
    }

    public int m6824a() {
        return 2;
    }
}
