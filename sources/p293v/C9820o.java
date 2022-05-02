package p293v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p266t.C8927z;

public class C9820o implements AbstractC9827u {
    public static final List<String> f32089a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    public static boolean m6797a(C8927z zVar) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && f32089a.contains(Build.MODEL.toUpperCase(locale)) && ((Integer) zVar.m10951a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
