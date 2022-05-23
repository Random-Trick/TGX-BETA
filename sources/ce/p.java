package ce;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import ib.c;
import k0.e;
import org.thunderdog.challegram.R;

public class p {
    public static Bitmap f5326a = null;
    public static Drawable f5327b = null;
    public static Drawable f5328c = null;
    public static Drawable f5329d = null;
    public static Drawable f5330e = null;
    public static e<Drawable> f5331f = null;
    public static float f5332g = 6.0f;
    public static float f5333h = 6.0f;
    public static float f5334i = 3.0f;
    public static float f5335j = 6.0f;

    public static Drawable a(int i10) {
        return n(R.drawable.deproko_baseline_notifications_off_24, i10);
    }

    public static int b() {
        return a0.i(18.0f);
    }

    public static Drawable c() {
        if (f5327b == null) {
            f5327b = c.g(j0.B(), R.drawable.baseline_bookmark_24);
        }
        return f5327b;
    }

    public static Drawable d() {
        if (f5328c == null) {
            f5328c = c.g(j0.B(), R.drawable.deproko_baseline_verify_chat_24);
        }
        return f5328c;
    }

    public static Drawable e(int i10) {
        return n(R.drawable.deproko_baseline_clock_24, i10);
    }

    public static int f() {
        return a0.i(12.0f);
    }

    public static Drawable g(int i10) {
        return n(R.drawable.deproko_baseline_check_double_24, i10);
    }

    public static int h() {
        return a0.i(12.0f);
    }

    public static Bitmap i() {
        if (f5326a == null) {
            f5326a = BitmapFactory.decodeResource(j0.B(), R.drawable.bg_livepin);
        }
        return f5326a;
    }

    public static Drawable j() {
        if (f5329d == null) {
            f5329d = c.g(j0.B(), R.drawable.deproko_baseline_lock_24);
        }
        return f5329d;
    }

    public static Drawable k() {
        if (f5330e == null) {
            f5330e = c.g(j0.B(), R.drawable.deproko_baseline_lock_18);
        }
        return f5330e;
    }

    public static Drawable l(int i10) {
        return n(R.drawable.deproko_baseline_check_single_24, i10);
    }

    public static int m() {
        return a0.i(18.0f);
    }

    public static Drawable n(int i10, int i11) {
        if (i11 == 0) {
            return null;
        }
        if (i10 != R.drawable.deproko_baseline_notifications_off_24) {
            switch (i10) {
                case R.drawable.deproko_baseline_check_double_24:
                case R.drawable.deproko_baseline_check_single_24:
                case R.drawable.deproko_baseline_clock_24:
                    break;
                default:
                    return null;
            }
        }
        long f10 = c.f(i10, i11);
        e<Drawable> eVar = f5331f;
        if (eVar == null) {
            f5331f = new e<>();
            Drawable g10 = c.g(j0.B(), i10);
            f5331f.k(f10, g10);
            return g10;
        }
        Drawable f11 = eVar.f(f10);
        if (f11 != null) {
            return f11;
        }
        Drawable g11 = c.g(j0.B(), i10);
        f5331f.k(f10, g11);
        return g11;
    }

    public static void o() {
        f5326a = null;
        f5327b = null;
        f5328c = null;
        f5329d = null;
        f5330e = null;
        e<Drawable> eVar = f5331f;
        if (eVar != null) {
            eVar.b();
        }
        f5326a = null;
    }
}
