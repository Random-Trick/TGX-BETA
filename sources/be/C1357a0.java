package be;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewConfiguration;
import gd.AbstractC4761s4;
import gd.C4666i7;
import java.util.Iterator;
import me.C6840b0;
import me.C6918i3;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p154kb.C6227d;
import p291uc.RunnableC9651s3;
import p292ud.C9733d0;
import vc.C9903a;

public class C1357a0 {
    public static float f4951a = -1.0f;
    public static Point f4952b;
    public static int f4953c;
    public static int f4954d;
    public static Integer f4955e;
    public static C6227d<AbstractC1358a> f4956f;

    public interface AbstractC1358a {
        void mo9612n1(int i);
    }

    public static int m37554A() {
        if (Build.VERSION.SDK_INT < 21) {
            return m37553B();
        }
        DisplayMetrics displayMetrics = C1379j0.m37309q().getResources().getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels - m37535o());
    }

    public static int m37553B() {
        DisplayMetrics displayMetrics = C1379j0.m37309q().getResources().getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static int m37552C(float f) {
        DisplayMetrics displayMetrics = C1379j0.m37372B().getDisplayMetrics();
        m37525y(displayMetrics.density);
        return (int) TypedValue.applyDimension(2, f, displayMetrics);
    }

    public static int m37551D() {
        DisplayMetrics displayMetrics = C1379j0.m37309q().getResources().getDisplayMetrics();
        return Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static float m37550E() {
        return m37551D() / m37542h();
    }

    public static void m37549a(AbstractC1358a aVar) {
        if (f4956f == null) {
            f4956f = new C6227d<>();
        }
        f4956f.add(aVar);
    }

    public static int m37548b(int i, int i2) {
        return (int) Math.ceil(Math.max(i2, (m37551D() / i) + 1.0f));
    }

    public static int m37547c(int i, int i2, int i3) {
        return i3 <= 0 ? i2 : (int) Math.ceil(Math.max(i2, (i3 / i) + 1.0f));
    }

    public static boolean m37546d() {
        return m37525y(C1379j0.m37372B().getDisplayMetrics().density);
    }

    public static int m37545e() {
        return C1379j0.m37309q().getResources().getDisplayMetrics().heightPixels - m37535o();
    }

    public static int m37544f() {
        AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
        if (E == null) {
            return C1379j0.m37309q().getResources().getDisplayMetrics().heightPixels;
        }
        if (Build.VERSION.SDK_INT < 24 || !E.isInMultiWindowMode()) {
            return E.m14572K0().getMeasuredHeight();
        }
        return E.getWindow().getDecorView().getMeasuredHeight();
    }

    public static int m37543g() {
        return C1379j0.m37309q().getResources().getDisplayMetrics().widthPixels;
    }

    public static float m37542h() {
        m37546d();
        return f4951a;
    }

    public static int m37541i(float f) {
        float k = m37539k(f);
        return (int) (k >= 0.0f ? k + 0.5f : k - 0.5f);
    }

    public static int m37540j(float f, float f2) {
        float h = m37542h();
        if (h <= f2) {
            return m37541i(f);
        }
        float min = f * Math.min(h, f2);
        return (int) (min >= 0.0f ? min + 0.5f : min - 0.5f);
    }

    public static float m37539k(float f) {
        DisplayMetrics displayMetrics = C1379j0.m37372B().getDisplayMetrics();
        m37525y(displayMetrics.density);
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    public static int m37538l() {
        AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
        if (E == null) {
            return 0;
        }
        Display defaultDisplay = E.getWindowManager().getDefaultDisplay();
        if (Build.VERSION.SDK_INT < 13) {
            return defaultDisplay.getHeight();
        }
        if (f4952b == null) {
            f4952b = new Point();
        }
        defaultDisplay.getSize(f4952b);
        return f4952b.y;
    }

    public static int m37537m() {
        int i = f4954d;
        if (i != 0) {
            return i;
        }
        int identifier = C1379j0.m37372B().getIdentifier("navigation_bar_frame_height", "dimen", "android");
        if (identifier > 0) {
            f4954d = C1379j0.m37372B().getDimensionPixelSize(identifier);
        }
        return f4954d;
    }

    public static int m37536n() {
        int i = f4953c;
        if (i != 0) {
            return i;
        }
        int identifier = C1379j0.m37372B().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            f4953c = C1379j0.m37372B().getDimensionPixelSize(identifier);
        }
        return f4953c;
    }

    public static int m37535o() {
        Integer num = f4955e;
        if (num != null) {
            return num.intValue();
        }
        int identifier = C1379j0.m37372B().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(C1379j0.m37372B().getDimensionPixelSize(identifier));
        f4955e = valueOf;
        return valueOf.intValue();
    }

    public static float m37534p() {
        return ViewConfiguration.get(C1379j0.m37309q()).getScaledTouchSlop();
    }

    public static float m37533q() {
        return m37534p() * 1.89f;
    }

    public static float m37532r() {
        return m37542h() >= 2.0f ? m37533q() : m37534p();
    }

    public static boolean m37531s() {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        try {
            int identifier = C1379j0.m37372B().getIdentifier("config_navBarInteractionMode", "integer", "android");
            if (identifier > 0) {
                return C1379j0.m37372B().getInteger(identifier) == 2;
            }
            return false;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public static boolean m37530t(AbstractView$OnTouchListenerC7889a aVar) {
        return aVar.m14429v1() && m37531s() && m37536n() > 0;
    }

    public static float m37529u(float f) {
        return (f / m37542h()) - 0.5f;
    }

    public static void m37528v(AbstractC1358a aVar) {
        C6227d<AbstractC1358a> dVar = f4956f;
        if (dVar != null) {
            dVar.remove(aVar);
        }
    }

    public static void m37527w() {
        C1410y.m37002y0();
        C1392p.m37221o();
        AbstractC4761s4.m26099O8();
        C9903a.m6663C1();
        RunnableC9651s3.m7895R();
        C6840b0.m18801t();
        C9733d0.m7324l();
        C4666i7.m26554h0();
        C6918i3.m18457k();
    }

    public static int m37526x() {
        return Math.max(1, m37541i(0.5f));
    }

    public static boolean m37525y(float f) {
        float f2 = f4951a;
        boolean z = false;
        if (f != f2) {
            if (f2 != -1.0f) {
                z = true;
            }
            f4951a = f;
            if (z) {
                m37527w();
            }
        }
        return z;
    }

    public static void m37524z(int i) {
        Integer num = f4955e;
        if (num == null || num.intValue() != i) {
            f4955e = Integer.valueOf(i);
            C6227d<AbstractC1358a> dVar = f4956f;
            if (dVar != null) {
                Iterator<AbstractC1358a> it = dVar.iterator();
                while (it.hasNext()) {
                    it.next().mo9612n1(i);
                }
            }
        }
    }
}
