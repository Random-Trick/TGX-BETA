package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import t.z;

public class f implements u {
    public static final List<String> f24663a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    public static boolean a(z zVar) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && f24663a.contains(Build.MODEL.toUpperCase(locale)) && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
