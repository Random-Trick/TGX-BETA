package v;

import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import y.g2;
import y.w1;

public class s implements w1 {
    public static final List<String> f24675a = Arrays.asList("SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610M");

    public static class a {
        public static final int[] f24676a;

        static {
            int[] iArr = new int[g2.b.values().length];
            f24676a = iArr;
            try {
                iArr[g2.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24676a[g2.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24676a[g2.b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static boolean a() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && f24675a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean b() {
        return a();
    }

    public Size c(g2.b bVar) {
        if (!a()) {
            return null;
        }
        int i10 = a.f24676a[bVar.ordinal()];
        if (i10 == 1) {
            return new Size(1920, 1080);
        }
        if (i10 == 2) {
            return new Size(1280, 720);
        }
        if (i10 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
