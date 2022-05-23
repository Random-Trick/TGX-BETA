package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import t.z;

public class m implements u {
    public static final List<String> f24669a = Arrays.asList("PIXEL 3A", "PIXEL 3A XL");

    public static boolean a(z zVar) {
        return f24669a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
