package p293v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p266t.C8927z;

public class C9818m implements AbstractC9827u {
    public static final List<String> f32084a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL");

    public static boolean m6799a(C8927z zVar) {
        return f32084a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) zVar.m10952a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
