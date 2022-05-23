package ce;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewConfiguration;
import hd.i7;
import hd.s4;
import java.util.Iterator;
import lb.d;
import ne.b0;
import ne.i3;
import vc.r3;
import vd.c0;

public class a0 {
    public static float f5218a = -1.0f;
    public static Point f5219b;
    public static int f5220c;
    public static int f5221d;
    public static Integer f5222e;
    public static d<a> f5223f;

    public interface a {
        void k1(int i10);
    }

    public static int A() {
        DisplayMetrics displayMetrics = j0.q().getResources().getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels - o());
    }

    public static int B() {
        DisplayMetrics displayMetrics = j0.q().getResources().getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static int C(float f10) {
        DisplayMetrics displayMetrics = j0.B().getDisplayMetrics();
        y(displayMetrics.density);
        return (int) TypedValue.applyDimension(2, f10, displayMetrics);
    }

    public static int D() {
        DisplayMetrics displayMetrics = j0.q().getResources().getDisplayMetrics();
        return Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static float E() {
        return D() / h();
    }

    public static void a(a aVar) {
        if (f5223f == null) {
            f5223f = new d<>();
        }
        f5223f.add(aVar);
    }

    public static int b(int i10, int i11) {
        return (int) Math.ceil(Math.max(i11, (D() / i10) + 1.0f));
    }

    public static int c(int i10, int i11, int i12) {
        return i12 <= 0 ? i11 : (int) Math.ceil(Math.max(i11, (i12 / i10) + 1.0f));
    }

    public static boolean d() {
        return y(j0.B().getDisplayMetrics().density);
    }

    public static int e() {
        return j0.q().getResources().getDisplayMetrics().heightPixels - o();
    }

    public static int f() {
        org.thunderdog.challegram.a E = j0.E();
        if (E == null) {
            return j0.q().getResources().getDisplayMetrics().heightPixels;
        }
        if (Build.VERSION.SDK_INT < 24 || !E.isInMultiWindowMode()) {
            return E.N0().getMeasuredHeight();
        }
        return E.getWindow().getDecorView().getMeasuredHeight();
    }

    public static int g() {
        return j0.q().getResources().getDisplayMetrics().widthPixels;
    }

    public static float h() {
        d();
        return f5218a;
    }

    public static int i(float f10) {
        float k10 = k(f10);
        return (int) (k10 >= 0.0f ? k10 + 0.5f : k10 - 0.5f);
    }

    public static int j(float f10, float f11) {
        float h10 = h();
        if (h10 <= f11) {
            return i(f10);
        }
        float min = f10 * Math.min(h10, f11);
        return (int) (min >= 0.0f ? min + 0.5f : min - 0.5f);
    }

    public static float k(float f10) {
        DisplayMetrics displayMetrics = j0.B().getDisplayMetrics();
        y(displayMetrics.density);
        return TypedValue.applyDimension(1, f10, displayMetrics);
    }

    public static int l() {
        org.thunderdog.challegram.a E = j0.E();
        if (E == null) {
            return 0;
        }
        Display defaultDisplay = E.getWindowManager().getDefaultDisplay();
        if (f5219b == null) {
            f5219b = new Point();
        }
        defaultDisplay.getSize(f5219b);
        return f5219b.y;
    }

    public static int m() {
        int i10 = f5221d;
        if (i10 != 0) {
            return i10;
        }
        int identifier = j0.B().getIdentifier("navigation_bar_frame_height", "dimen", "android");
        if (identifier > 0) {
            f5221d = j0.B().getDimensionPixelSize(identifier);
        }
        return f5221d;
    }

    public static int n() {
        int i10 = f5220c;
        if (i10 != 0) {
            return i10;
        }
        int identifier = j0.B().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            f5220c = j0.B().getDimensionPixelSize(identifier);
        }
        return f5220c;
    }

    public static int o() {
        Integer num = f5222e;
        if (num != null) {
            return num.intValue();
        }
        int identifier = j0.B().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(j0.B().getDimensionPixelSize(identifier));
        f5222e = valueOf;
        return valueOf.intValue();
    }

    public static float p() {
        return ViewConfiguration.get(j0.q()).getScaledTouchSlop();
    }

    public static float q() {
        return p() * 1.89f;
    }

    public static float r() {
        return h() >= 2.0f ? q() : p();
    }

    public static boolean s() {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        try {
            int identifier = j0.B().getIdentifier("config_navBarInteractionMode", "integer", "android");
            if (identifier > 0) {
                return j0.B().getInteger(identifier) == 2;
            }
            return false;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public static boolean t(org.thunderdog.challegram.a aVar) {
        return aVar.w1() && s() && n() > 0;
    }

    public static float u(float f10) {
        return (f10 / h()) - 0.5f;
    }

    public static void v(a aVar) {
        d<a> dVar = f5223f;
        if (dVar != null) {
            dVar.remove(aVar);
        }
    }

    public static void w() {
        y.y0();
        p.o();
        s4.O8();
        wc.a.A1();
        r3.R();
        b0.t();
        c0.j();
        i7.h0();
        i3.k();
    }

    public static int x() {
        return Math.max(1, i(0.5f));
    }

    public static boolean y(float f10) {
        float f11 = f5218a;
        boolean z10 = false;
        if (f10 != f11) {
            if (f11 != -1.0f) {
                z10 = true;
            }
            f5218a = f10;
            if (z10) {
                w();
            }
        }
        return z10;
    }

    public static void z(int i10) {
        Integer num = f5222e;
        if (num == null || num.intValue() != i10) {
            f5222e = Integer.valueOf(i10);
            d<a> dVar = f5223f;
            if (dVar != null) {
                Iterator<a> it = dVar.iterator();
                while (it.hasNext()) {
                    it.next().k1(i10);
                }
            }
        }
    }
}
