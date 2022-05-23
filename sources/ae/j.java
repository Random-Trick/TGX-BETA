package ae;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import ce.a0;
import ce.j0;
import gd.w;
import he.i;
import ib.d;
import ie.n;
import java.util.Iterator;
import oc.l;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.a;
import yd.c;
import yd.g;

public class j {
    public static float f856a = 0.6f;
    public static final boolean f857b = true;

    public static Drawable A(int i10, int i11, v4<?> v4Var) {
        Drawable d10 = g.d(j0.n(), i10, new PorterDuffColorFilter(L(i11), PorterDuff.Mode.MULTIPLY));
        if (v4Var != null) {
            v4Var.x8(d10, i11);
        }
        return d10;
    }

    public static boolean A0() {
        return z.u().G();
    }

    public static l B(View view) {
        if (view == null) {
            return null;
        }
        Drawable background = view.getBackground();
        if (background instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) background;
            int numberOfLayers = rippleDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = rippleDrawable.getDrawable(i10);
                if (drawable instanceof l) {
                    l lVar = (l) drawable;
                    if (lVar.a() != R.id.theme_color_fillingPressed) {
                        return lVar;
                    }
                }
            }
            return null;
        } else if (background instanceof n) {
            Iterator<Drawable> it = ((n) background).a().iterator();
            while (it.hasNext()) {
                Drawable next = it.next();
                if (next instanceof l) {
                    l lVar2 = (l) next;
                    if (lVar2.a() != R.id.theme_color_fillingPressed) {
                        return lVar2;
                    }
                }
            }
            return null;
        } else if (background instanceof l) {
            return (l) background;
        } else {
            return null;
        }
    }

    public static RuntimeException B0(int i10, String str) {
        return new IllegalArgumentException(str + " == " + i10 + " / 0x" + Integer.toHexString(i10) + " (" + w.e1(i10) + ")");
    }

    public static void C(View view, p pVar) {
        if (view != null) {
            Drawable background = view.getBackground();
            if (background instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) background;
                int numberOfLayers = rippleDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    Drawable drawable = rippleDrawable.getDrawable(i10);
                    if (drawable instanceof l) {
                        l lVar = (l) drawable;
                        if (lVar.a() != R.id.theme_color_fillingPressed) {
                            lVar.f(pVar);
                        }
                    }
                }
            } else if (background instanceof n) {
                Iterator<Drawable> it = ((n) background).a().iterator();
                while (it.hasNext()) {
                    Drawable next = it.next();
                    if (next instanceof l) {
                        l lVar2 = (l) next;
                        if (lVar2.a() != R.id.theme_color_fillingPressed) {
                            lVar2.f(pVar);
                        }
                    }
                }
            } else if (background instanceof l) {
                ((l) background).f(pVar);
            }
        }
    }

    public static int C0() {
        return L(R.id.theme_color_previewBackground);
    }

    public static int D(View view) {
        if (view == null) {
            return 0;
        }
        Drawable background = view.getBackground();
        if (background instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) background;
            int numberOfLayers = rippleDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable = rippleDrawable.getDrawable(i10);
                if (drawable instanceof l) {
                    l lVar = (l) drawable;
                    if (lVar.a() != R.id.theme_color_fillingPressed) {
                        return lVar.a();
                    }
                }
            }
            return 0;
        } else if (background instanceof n) {
            Iterator<Drawable> it = ((n) background).a().iterator();
            while (it.hasNext()) {
                Drawable next = it.next();
                if (next instanceof l) {
                    l lVar2 = (l) next;
                    if (lVar2.a() != R.id.theme_color_fillingPressed) {
                        return lVar2.a();
                    }
                }
            }
            return 0;
        } else if (background instanceof l) {
            return ((l) background).a();
        } else {
            return 0;
        }
    }

    public static int D0() {
        return d.a(f0(), L(R.id.theme_color_passcodeText));
    }

    public static float E() {
        return Y(R.id.theme_property_bubbleDateCorner);
    }

    public static int E0() {
        return L(R.id.theme_color_placeholder);
    }

    public static float F() {
        return Y(f857b ? R.id.theme_property_bubbleCorner : R.id.theme_property_bubbleCornerLegacy);
    }

    public static int F0() {
        return L(R.id.theme_color_progress);
    }

    public static float G() {
        return Y(f857b ? R.id.theme_property_bubbleCornerMerged : R.id.theme_property_bubbleCornerLegacy);
    }

    public static int G0() {
        return L(R.id.theme_color_controlContent);
    }

    public static float H() {
        return Y(R.id.theme_property_bubbleOutline);
    }

    public static int H0() {
        return L(R.id.theme_color_controlActive);
    }

    public static float I() {
        return Y(R.id.theme_property_bubbleOutlineSize);
    }

    public static int I0() {
        return L(R.id.theme_color_controlInactive);
    }

    public static float J() {
        return Y(R.id.theme_property_bubbleUnreadShadow);
    }

    @TargetApi(21)
    public static Drawable J0(float f10, float f11, int i10) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{1621139616}), new c(i10, f10, f11, false), null);
    }

    public static int K(int i10) {
        switch (i10) {
            case 1:
                return R.id.theme_color_themeBlue;
            case 2:
                return R.id.theme_color_themeNightBlack;
            case 3:
                return R.id.theme_color_themeBlackWhite;
            case 4:
                return R.id.theme_color_themeWhiteBlack;
            case 5:
                return R.id.theme_color_themeRed;
            case 6:
                return R.id.theme_color_themeOrange;
            case 7:
                return R.id.theme_color_themeGreen;
            case 8:
                return R.id.theme_color_themePink;
            case 9:
                return R.id.theme_color_themeCyan;
            case 10:
                return R.id.theme_color_themeNightBlue;
            case 11:
                return R.id.theme_color_themeClassic;
            default:
                throw B0(i10, "themeId");
        }
    }

    public static Drawable K0(float f10, float f11, int i10) {
        return J0(f10, f11, i10);
    }

    public static int L(int i10) {
        return z.u().i().e(i10);
    }

    public static int L0(int i10) {
        return i10 + 2;
    }

    public static int M(int i10, int i11) {
        p m10 = z.m();
        if (m10 == null || i11 != m10.a()) {
            return c0.b(i11, i10);
        }
        return m10.e(i10);
    }

    public static int M0() {
        return L(R.id.theme_color_separator);
    }

    public static int N(int i10) {
        p m10 = z.m();
        if (m10 != null) {
            return m10.e(i10);
        }
        return c0.b(1, i10);
    }

    public static int N0(int i10) {
        return d.a(f0(), i10);
    }

    public static String O(int i10) {
        return m.d(i10);
    }

    public static int O0() {
        return L(R.id.theme_color_background_text);
    }

    public static int P(int i10) {
        return L0(z.V(i10));
    }

    public static int P0() {
        return L(R.id.theme_color_text);
    }

    public static float Q() {
        return Y(R.id.theme_property_dark);
    }

    public static int Q0() {
        return L(R.id.theme_color_background_textLight);
    }

    public static float R() {
        return Y(R.id.theme_property_dateCorner);
    }

    public static int R0() {
        return L(R.id.theme_color_textLight);
    }

    public static String S() {
        return z.u().i().b();
    }

    public static int S0() {
        return L(R.id.theme_color_textLink);
    }

    public static String T(int i10) {
        p m10 = z.m();
        if (m10 == null || i10 != m10.a()) {
            return c0.c(i10);
        }
        return m10.b();
    }

    public static int T0() {
        return L(R.id.theme_color_textLinkPressHighlight);
    }

    public static int U(String str) {
        try {
            Context n10 = j0.n();
            return n10.getResources().getIdentifier(str, "id", n10.getPackageName());
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int U0() {
        return L(R.id.theme_color_textPlaceholder);
    }

    public static float V() {
        return Y(R.id.theme_property_imageCorner);
    }

    public static int V0() {
        return L(R.id.theme_color_textNegative);
    }

    public static float W(int i10) {
        return Y(i10);
    }

    public static int W0() {
        return L(R.id.theme_color_textSecure);
    }

    public static float X() {
        return (Q() * 0.25f) + 0.3f;
    }

    public static int X0() {
        return L(R.id.theme_color_togglerActive);
    }

    public static float Y(int i10) {
        return z.u().i().d(i10);
    }

    public static int Y0() {
        return L(R.id.theme_color_togglerActiveBackground);
    }

    public static float Z(int i10, int i11) {
        p m10 = z.m();
        if (m10 == null || i11 != m10.a()) {
            return c0.f(i11, i10);
        }
        return m10.d(i10);
    }

    public static int Z0() {
        return L(R.id.theme_color_togglerInactive);
    }

    public static int a(int i10) {
        switch (i10) {
            case R.id.theme_color_avatarBlue:
                return R.id.theme_color_avatarBlue_big;
            case R.id.theme_color_avatarBlue_big:
            case R.id.theme_color_avatarCyan_big:
            case R.id.theme_color_avatarGreen_big:
            case R.id.theme_color_avatarInactive_big:
            case R.id.theme_color_avatarOrange_big:
            case R.id.theme_color_avatarPink_big:
            case R.id.theme_color_avatarRed_big:
            case R.id.theme_color_avatarReplies_big:
            case R.id.theme_color_avatarSavedMessages_big:
            case R.id.theme_color_avatarViolet_big:
            default:
                return 0;
            case R.id.theme_color_avatarCyan:
                return R.id.theme_color_avatarCyan_big;
            case R.id.theme_color_avatarGreen:
                return R.id.theme_color_avatarGreen_big;
            case R.id.theme_color_avatarInactive:
                return R.id.theme_color_avatarInactive_big;
            case R.id.theme_color_avatarOrange:
                return R.id.theme_color_avatarOrange_big;
            case R.id.theme_color_avatarPink:
                return R.id.theme_color_avatarPink_big;
            case R.id.theme_color_avatarRed:
                return R.id.theme_color_avatarRed_big;
            case R.id.theme_color_avatarReplies:
                return R.id.theme_color_avatarReplies_big;
            case R.id.theme_color_avatarSavedMessages:
                return R.id.theme_color_avatarSavedMessages_big;
            case R.id.theme_color_avatarViolet:
                return R.id.theme_color_avatarViolet_big;
            case R.id.theme_color_avatarYellow:
                return R.id.theme_color_avatarYellow_big;
        }
    }

    public static float a0(i iVar, int i10, int i11) {
        p m10 = z.m();
        if (m10 == null || i11 != m10.a()) {
            return c0.g(iVar, i11, i10);
        }
        return m10.d(i10);
    }

    public static int a1() {
        return L(R.id.theme_color_togglerInactiveBackground);
    }

    public static int b() {
        return L(R.id.theme_color_background);
    }

    public static String b0(int i10) {
        return b0.c(i10);
    }

    public static Drawable b1() {
        return e1(1084268704);
    }

    public static int c() {
        return L(R.id.theme_color_background_icon);
    }

    public static Drawable c0(int i10) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i10 & 16777215) | 419430400}), null, p(a0.i(3.0f), -1));
    }

    @TargetApi(21)
    public static Drawable c1(int i10) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i10}), null, new ColorDrawable(-1));
    }

    public static void d(View view, int i10) {
        if (view != null) {
            Drawable background = view.getBackground();
            if (background instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) background;
                int numberOfLayers = rippleDrawable.getNumberOfLayers();
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    Drawable drawable = rippleDrawable.getDrawable(i11);
                    if (drawable instanceof l) {
                        l lVar = (l) drawable;
                        if (lVar.a() != R.id.theme_color_fillingPressed) {
                            lVar.d(i10);
                        }
                    }
                }
            } else if (background instanceof n) {
                Iterator<Drawable> it = ((n) background).a().iterator();
                while (it.hasNext()) {
                    Drawable next = it.next();
                    if (next instanceof l) {
                        l lVar2 = (l) next;
                        if (lVar2.a() != R.id.theme_color_fillingPressed) {
                            lVar2.d(i10);
                        }
                    }
                }
            } else if (background instanceof l) {
                ((l) background).d(i10);
            }
        }
    }

    public static float d0() {
        return Y(R.id.theme_property_replaceShadowsWithSeparators);
    }

    public static Drawable d1() {
        return e1(1352704160);
    }

    public static void e(View view, boolean z10, int i10) {
        if (view != null) {
            Drawable background = view.getBackground();
            if (background instanceof RippleDrawable) {
                if (z10) {
                    db.g.d(view, y(i10));
                }
            } else if ((background instanceof n) && !z10) {
                db.g.d(view, v(i10));
            }
        }
    }

    public static float e0() {
        return Y(R.id.theme_property_shadowDepth);
    }

    public static Drawable e1(int i10) {
        return c1(i10);
    }

    public static int f() {
        return L(R.id.theme_color_chatListAction);
    }

    public static float f0() {
        return Y(R.id.theme_property_subtitleAlpha);
    }

    public static Drawable f1() {
        return e1(822083583);
    }

    public static int g() {
        return L(R.id.theme_color_messageSwipeBackground);
    }

    public static int g0() {
        int Y = (int) Y(R.id.theme_property_wallpaperUsageId);
        return Y == 2 ? P(z.u().n()) : Y;
    }

    public static int h() {
        return L(R.id.theme_color_messageSwipeContent);
    }

    public static int h0(int i10) {
        int Z = (int) Z(R.id.theme_property_wallpaperUsageId, i10);
        return Z == 2 ? P(i10) : Z;
    }

    public static int i() {
        return L(R.id.theme_color_messageSelection);
    }

    public static int i0(p pVar) {
        int d10 = (int) pVar.d(R.id.theme_property_wallpaperUsageId);
        return d10 == 2 ? P(pVar.a()) : d10;
    }

    public static int j() {
        return L(R.id.theme_color_chatSendButton);
    }

    public static int j0() {
        return L(R.id.theme_color_headerIcon);
    }

    public static int k() {
        return L(R.id.theme_color_messageVerticalLine);
    }

    public static int k0() {
        return L(R.id.theme_color_headerBackground);
    }

    public static int l() {
        return L(R.id.theme_color_checkContent);
    }

    public static int l0() {
        return L(R.id.theme_color_overlayFilling);
    }

    public static int m() {
        return L(R.id.theme_color_checkActive);
    }

    public static int m0() {
        return L(R.id.theme_color_placeholder);
    }

    @TargetApi(21)
    public static Drawable n(float f10, int i10) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{1084268704}), new a(i10, f10, false), null);
    }

    public static int n0() {
        return L(R.id.theme_color_headerText);
    }

    public static Drawable o(float f10, int i10) {
        return n(f10, i10);
    }

    public static int o0() {
        return L(R.id.theme_color_icon);
    }

    public static Drawable p(int i10, int i11) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        return shapeDrawable;
    }

    public static int p0() {
        return L(R.id.theme_color_iconLight);
    }

    public static Drawable q(int i10, int i11, int i12, int i13) {
        float f10 = i10;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable.getPaint().setColor(i11);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, null, null));
        shapeDrawable2.getPaint().setColor(i13);
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i12}), shapeDrawable, shapeDrawable2);
    }

    public static int q0(boolean z10) {
        return L(z10 ? R.id.theme_color_bubbleOut_inlineIcon : R.id.theme_color_inlineIcon);
    }

    @TargetApi(21)
    public static Drawable r(Drawable drawable) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{1084268704}), drawable, null);
    }

    public static int r0(boolean z10) {
        return L(z10 ? R.id.theme_color_bubbleOut_inlineOutline : R.id.theme_color_inlineOutline);
    }

    public static Drawable s(Drawable drawable, Drawable drawable2) {
        return r(drawable);
    }

    public static int s0() {
        return L(R.id.theme_color_inlineContentActive);
    }

    public static int t() {
        return x0() ? R.style.DialogThemeDark : R.style.DialogTheme;
    }

    public static int t0(boolean z10) {
        return L(z10 ? R.id.theme_color_bubbleOut_inlineText : R.id.theme_color_inlineText);
    }

    public static int u() {
        return L(R.id.theme_color_filling);
    }

    public static int u0() {
        return L(R.id.theme_color_introSectionActive);
    }

    @TargetApi(21)
    public static Drawable v(int i10) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{1352704160}), new l(i10), new ColorDrawable(-1));
    }

    public static int v0() {
        return L(R.id.theme_color_introSection);
    }

    public static Drawable w() {
        return x(R.id.theme_color_filling);
    }

    public static boolean w0(float f10) {
        return f857b && f10 == ((float) a0.i(18.0f));
    }

    public static Drawable x(int i10) {
        if (Build.VERSION.SDK_INT > 21) {
            return v(i10);
        }
        return y(i10);
    }

    public static boolean x0() {
        return z.u().y();
    }

    public static Drawable y(int i10) {
        return ce.c.i(new l(i10), new l(R.id.theme_color_fillingPressed));
    }

    public static boolean y0(int i10) {
        return Z(R.id.theme_property_dark, i10) == 1.0f;
    }

    public static int z() {
        return L(R.id.theme_color_textSelectionHighlight);
    }

    public static boolean z0(i iVar, int i10) {
        return a0(iVar, R.id.theme_property_dark, i10) == 1.0f;
    }
}
