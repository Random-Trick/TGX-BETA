package p293v;

import android.os.Build;
import android.util.Size;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p336y.AbstractC10231g2;
import p336y.AbstractC10311w1;

public class C9824s implements AbstractC10311w1 {
    public static final List<String> f32090a = Arrays.asList("SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610M");

    public static class C9825a {
        public static final int[] f32091a;

        static {
            int[] iArr = new int[AbstractC10231g2.EnumC10233b.values().length];
            f32091a = iArr;
            try {
                iArr[AbstractC10231g2.EnumC10233b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32091a[AbstractC10231g2.EnumC10233b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32091a[AbstractC10231g2.EnumC10233b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static boolean m6792a() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && f32090a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean m6791b() {
        return m6792a();
    }

    public Size m6790c(AbstractC10231g2.EnumC10233b bVar) {
        if (!m6792a()) {
            return null;
        }
        int i = C9825a.f32091a[bVar.ordinal()];
        if (i == 1) {
            return new Size(1920, 1080);
        }
        if (i == 2) {
            return new Size(1280, 720);
        }
        if (i != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
