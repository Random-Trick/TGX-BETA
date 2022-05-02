package be;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import org.thunderdog.challegram.R;
import p108hb.C5063c;
import p143k0.C6035e;

public class C1392p {
    public static Bitmap f5061a = null;
    public static Drawable f5062b = null;
    public static Drawable f5063c = null;
    public static Drawable f5064d = null;
    public static Drawable f5065e = null;
    public static C6035e<Drawable> f5066f = null;
    public static float f5067g = 6.0f;
    public static float f5068h = 6.0f;
    public static float f5069i = 3.0f;
    public static float f5070j = 6.0f;

    public static Drawable m37238a(int i) {
        return m37225n(R.drawable.deproko_baseline_notifications_off_24, i);
    }

    public static int m37237b() {
        return C1357a0.m37544i(18.0f);
    }

    public static Drawable m37236c() {
        if (f5062b == null) {
            f5062b = C1362c.m37485g(C1379j0.m37375B(), R.drawable.baseline_bookmark_24);
        }
        return f5062b;
    }

    public static Drawable m37235d() {
        if (f5063c == null) {
            f5063c = C1362c.m37485g(C1379j0.m37375B(), R.drawable.deproko_baseline_verify_chat_24);
        }
        return f5063c;
    }

    public static Drawable m37234e(int i) {
        return m37225n(R.drawable.deproko_baseline_clock_24, i);
    }

    public static int m37233f() {
        return C1357a0.m37544i(12.0f);
    }

    public static Drawable m37232g(int i) {
        return m37225n(R.drawable.deproko_baseline_check_double_24, i);
    }

    public static int m37231h() {
        return C1357a0.m37544i(12.0f);
    }

    public static Bitmap m37230i() {
        if (f5061a == null) {
            f5061a = BitmapFactory.decodeResource(C1379j0.m37375B(), R.drawable.bg_livepin);
        }
        return f5061a;
    }

    public static Drawable m37229j() {
        if (f5064d == null) {
            f5064d = C1362c.m37485g(C1379j0.m37375B(), R.drawable.deproko_baseline_lock_24);
        }
        return f5064d;
    }

    public static Drawable m37228k() {
        if (f5065e == null) {
            f5065e = C1362c.m37485g(C1379j0.m37375B(), R.drawable.deproko_baseline_lock_18);
        }
        return f5065e;
    }

    public static Drawable m37227l(int i) {
        return m37225n(R.drawable.deproko_baseline_check_single_24, i);
    }

    public static int m37226m() {
        return C1357a0.m37544i(18.0f);
    }

    public static Drawable m37225n(int i, int i2) {
        if (i2 == 0) {
            return null;
        }
        if (i != R.drawable.deproko_baseline_notifications_off_24) {
            switch (i) {
                case R.drawable.deproko_baseline_check_double_24:
                case R.drawable.deproko_baseline_check_single_24:
                case R.drawable.deproko_baseline_clock_24:
                    break;
                default:
                    return null;
            }
        }
        long f = C5063c.m24141f(i, i2);
        C6035e<Drawable> eVar = f5066f;
        if (eVar == null) {
            f5066f = new C6035e<>();
            Drawable g = C1362c.m37485g(C1379j0.m37375B(), i);
            f5066f.m21501k(f, g);
            return g;
        }
        Drawable f2 = eVar.m21506f(f);
        if (f2 != null) {
            return f2;
        }
        Drawable g2 = C1362c.m37485g(C1379j0.m37375B(), i);
        f5066f.m21501k(f, g2);
        return g2;
    }

    public static void m37224o() {
        f5061a = null;
        f5062b = null;
        f5063c = null;
        f5064d = null;
        f5065e = null;
        C6035e<Drawable> eVar = f5066f;
        if (eVar != null) {
            eVar.m21510b();
        }
        f5061a = null;
    }
}
