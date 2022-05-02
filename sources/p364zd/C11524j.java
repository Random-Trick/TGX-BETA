package p364zd;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import ge.C4868i;
import java.util.Iterator;
import nc.C7368l;
import org.thunderdog.challegram.R;
import p037cb.C2065g;
import p082fd.C4403w;
import p108hb.C5064d;
import p111he.C5130n;
import p335xd.C10186a;
import p335xd.C10188c;
import p335xd.C10192g;
import td.AbstractC9323v4;

public class C11524j {
    public static float f36591a = 0.6f;
    public static final boolean f36592b;

    static {
        f36592b = Build.VERSION.SDK_INT >= 19;
    }

    public static Drawable m254A(int i) {
        return C1362c.m37483i(new C7368l(i), new C7368l(R.id.theme_color_fillingPressed));
    }

    public static boolean m253A0(int i) {
        return m198b0(R.id.theme_property_dark, i) == 1.0f;
    }

    public static int m252B() {
        return m228N(R.id.theme_color_textSelectionHighlight);
    }

    public static boolean m251B0(C4868i iVar, int i) {
        return m195c0(iVar, R.id.theme_property_dark, i) == 1.0f;
    }

    public static Drawable m250C(int i, int i2, AbstractC9323v4<?> v4Var) {
        Drawable d = C10192g.m5787d(C1379j0.m37318n(), i, new PorterDuffColorFilter(m228N(i2), PorterDuff.Mode.MULTIPLY));
        if (v4Var != null) {
            v4Var.m9132x8(d, i2);
        }
        return d;
    }

    public static boolean m249C0() {
        return C11541z.m7t().m59E();
    }

    public static C7368l m248D(View view) {
        if (view == null) {
            return null;
        }
        Drawable background = view.getBackground();
        if (Build.VERSION.SDK_INT >= 21 && (background instanceof RippleDrawable)) {
            RippleDrawable rippleDrawable = (RippleDrawable) background;
            int numberOfLayers = rippleDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable = rippleDrawable.getDrawable(i);
                if (drawable instanceof C7368l) {
                    C7368l lVar = (C7368l) drawable;
                    if (lVar.m16763a() != R.id.theme_color_fillingPressed) {
                        return lVar;
                    }
                }
            }
            return null;
        } else if (background instanceof C5130n) {
            Iterator<Drawable> it = ((C5130n) background).m23863a().iterator();
            while (it.hasNext()) {
                Drawable next = it.next();
                if (next instanceof C7368l) {
                    C7368l lVar2 = (C7368l) next;
                    if (lVar2.m16763a() != R.id.theme_color_fillingPressed) {
                        return lVar2;
                    }
                }
            }
            return null;
        } else if (background instanceof C7368l) {
            return (C7368l) background;
        } else {
            return null;
        }
    }

    public static RuntimeException m247D0(int i, String str) {
        return new IllegalArgumentException(str + " == " + i + " / 0x" + Integer.toHexString(i) + " (" + C4403w.m27887e1(i) + ")");
    }

    public static void m246E(View view, AbstractC11531p pVar) {
        if (view != null) {
            Drawable background = view.getBackground();
            if (Build.VERSION.SDK_INT >= 21 && (background instanceof RippleDrawable)) {
                RippleDrawable rippleDrawable = (RippleDrawable) background;
                int numberOfLayers = rippleDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    Drawable drawable = rippleDrawable.getDrawable(i);
                    if (drawable instanceof C7368l) {
                        C7368l lVar = (C7368l) drawable;
                        if (lVar.m16763a() != R.id.theme_color_fillingPressed) {
                            lVar.m16759f(pVar);
                        }
                    }
                }
            } else if (background instanceof C5130n) {
                Iterator<Drawable> it = ((C5130n) background).m23863a().iterator();
                while (it.hasNext()) {
                    Drawable next = it.next();
                    if (next instanceof C7368l) {
                        C7368l lVar2 = (C7368l) next;
                        if (lVar2.m16763a() != R.id.theme_color_fillingPressed) {
                            lVar2.m16759f(pVar);
                        }
                    }
                }
            } else if (background instanceof C7368l) {
                ((C7368l) background).m16759f(pVar);
            }
        }
    }

    public static int m245E0() {
        return m228N(R.id.theme_color_previewBackground);
    }

    public static int m244F(View view) {
        if (view == null) {
            return 0;
        }
        Drawable background = view.getBackground();
        if (Build.VERSION.SDK_INT >= 21 && (background instanceof RippleDrawable)) {
            RippleDrawable rippleDrawable = (RippleDrawable) background;
            int numberOfLayers = rippleDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable = rippleDrawable.getDrawable(i);
                if (drawable instanceof C7368l) {
                    C7368l lVar = (C7368l) drawable;
                    if (lVar.m16763a() != R.id.theme_color_fillingPressed) {
                        return lVar.m16763a();
                    }
                }
            }
            return 0;
        } else if (background instanceof C5130n) {
            Iterator<Drawable> it = ((C5130n) background).m23863a().iterator();
            while (it.hasNext()) {
                Drawable next = it.next();
                if (next instanceof C7368l) {
                    C7368l lVar2 = (C7368l) next;
                    if (lVar2.m16763a() != R.id.theme_color_fillingPressed) {
                        return lVar2.m16763a();
                    }
                }
            }
            return 0;
        } else if (background instanceof C7368l) {
            return ((C7368l) background).m16763a();
        } else {
            return 0;
        }
    }

    public static int m243F0() {
        return C5064d.m24132a(m180h0(), m228N(R.id.theme_color_passcodeText));
    }

    public static float m242G() {
        return m201a0(R.id.theme_property_bubbleDateCorner);
    }

    public static int m241G0() {
        return m228N(R.id.theme_color_placeholder);
    }

    public static float m240H() {
        return m201a0(f36592b ? R.id.theme_property_bubbleCorner : R.id.theme_property_bubbleCornerLegacy);
    }

    public static int m239H0() {
        return m228N(R.id.theme_color_progress);
    }

    public static float m238I() {
        return m201a0(f36592b ? R.id.theme_property_bubbleCornerMerged : R.id.theme_property_bubbleCornerLegacy);
    }

    public static int m237I0() {
        return m228N(R.id.theme_color_controlContent);
    }

    public static float m236J() {
        return m201a0(R.id.theme_property_bubbleOutline);
    }

    public static int m235J0() {
        return m228N(R.id.theme_color_controlActive);
    }

    public static float m234K() {
        return m201a0(R.id.theme_property_bubbleOutlineSize);
    }

    public static int m233K0() {
        return m228N(R.id.theme_color_controlInactive);
    }

    public static float m232L() {
        return m201a0(R.id.theme_property_bubbleUnreadShadow);
    }

    @TargetApi(21)
    public static Drawable m231L0(float f, float f2, int i) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{1621139616}), new C10188c(i, f, f2, false), null);
    }

    public static int m230M(int i) {
        switch (i) {
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
                throw m247D0(i, "themeId");
        }
    }

    public static Drawable m229M0(float f, float f2, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m231L0(f, f2, i);
        }
        return m227N0(f, f2, i);
    }

    public static int m228N(int i) {
        return C11541z.m7t().m20i().mo92e(i);
    }

    public static Drawable m227N0(float f, float f2, int i) {
        return C1362c.m37483i(new C10188c(i, f, f2, false), new C10188c(i, f, f2, true));
    }

    public static int m226O(int i, int i2) {
        AbstractC11531p l = C11541z.m17l();
        if (l == null || i2 != l.mo96a()) {
            return C11514c0.m347b(i2, i);
        }
        return l.mo92e(i);
    }

    public static int m225O0(int i) {
        return i + 2;
    }

    public static int m224P(int i) {
        AbstractC11531p l = C11541z.m17l();
        if (l != null) {
            return l.mo92e(i);
        }
        return C11514c0.m347b(1, i);
    }

    public static int m223P0() {
        return m228N(R.id.theme_color_separator);
    }

    public static String m222Q(int i) {
        return C11527m.m129d(i);
    }

    public static int m221Q0(int i) {
        return C5064d.m24132a(m180h0(), i);
    }

    public static int m220R(int i) {
        return m225O0(C11541z.m41T(i));
    }

    public static int m219R0() {
        return m228N(R.id.theme_color_background_text);
    }

    public static float m218S() {
        return m201a0(R.id.theme_property_dark);
    }

    public static int m217S0() {
        return m228N(R.id.theme_color_text);
    }

    public static float m216T() {
        return m201a0(R.id.theme_property_dateCorner);
    }

    public static int m215T0() {
        return m228N(R.id.theme_color_background_textLight);
    }

    public static String m214U() {
        return C11541z.m7t().m20i().mo95b();
    }

    public static int m213U0() {
        return m228N(R.id.theme_color_textLight);
    }

    public static String m212V(int i) {
        AbstractC11531p l = C11541z.m17l();
        if (l == null || i != l.mo96a()) {
            return C11514c0.m346c(i);
        }
        return l.mo95b();
    }

    public static int m211V0() {
        return m228N(R.id.theme_color_textLink);
    }

    public static int m210W(String str) {
        try {
            Context n = C1379j0.m37318n();
            return n.getResources().getIdentifier(str, "id", n.getPackageName());
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int m209W0() {
        return m228N(R.id.theme_color_textLinkPressHighlight);
    }

    public static float m208X() {
        return m201a0(R.id.theme_property_imageCorner);
    }

    public static int m207X0() {
        return m228N(R.id.theme_color_textPlaceholder);
    }

    public static float m206Y(int i) {
        return m201a0(i);
    }

    public static int m205Y0() {
        return m228N(R.id.theme_color_textNegative);
    }

    public static float m204Z() {
        return (m218S() * 0.25f) + 0.3f;
    }

    public static int m203Z0() {
        return m228N(R.id.theme_color_textSecure);
    }

    public static int m202a(int i) {
        switch (i) {
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

    public static float m201a0(int i) {
        return C11541z.m7t().m20i().mo93d(i);
    }

    public static int m200a1() {
        return m228N(R.id.theme_color_togglerActive);
    }

    public static int m199b() {
        return m228N(R.id.theme_color_background);
    }

    public static float m198b0(int i, int i2) {
        AbstractC11531p l = C11541z.m17l();
        if (l == null || i2 != l.mo96a()) {
            return C11514c0.m343f(i2, i);
        }
        return l.mo93d(i);
    }

    public static int m197b1() {
        return m228N(R.id.theme_color_togglerActiveBackground);
    }

    public static int m196c() {
        return m228N(R.id.theme_color_background_icon);
    }

    public static float m195c0(C4868i iVar, int i, int i2) {
        AbstractC11531p l = C11541z.m17l();
        if (l == null || i2 != l.mo96a()) {
            return C11514c0.m342g(iVar, i2, i);
        }
        return l.mo93d(i);
    }

    public static int m194c1() {
        return m228N(R.id.theme_color_togglerInactive);
    }

    public static void m193d(View view, int i) {
        if (view != null) {
            Drawable background = view.getBackground();
            if (Build.VERSION.SDK_INT >= 21 && (background instanceof RippleDrawable)) {
                RippleDrawable rippleDrawable = (RippleDrawable) background;
                int numberOfLayers = rippleDrawable.getNumberOfLayers();
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    Drawable drawable = rippleDrawable.getDrawable(i2);
                    if (drawable instanceof C7368l) {
                        C7368l lVar = (C7368l) drawable;
                        if (lVar.m16763a() != R.id.theme_color_fillingPressed) {
                            lVar.m16761d(i);
                        }
                    }
                }
            } else if (background instanceof C5130n) {
                Iterator<Drawable> it = ((C5130n) background).m23863a().iterator();
                while (it.hasNext()) {
                    Drawable next = it.next();
                    if (next instanceof C7368l) {
                        C7368l lVar2 = (C7368l) next;
                        if (lVar2.m16763a() != R.id.theme_color_fillingPressed) {
                            lVar2.m16761d(i);
                        }
                    }
                }
            } else if (background instanceof C7368l) {
                ((C7368l) background).m16761d(i);
            }
        }
    }

    public static String m192d0(int i) {
        return C11511b0.m354c(i);
    }

    public static int m191d1() {
        return m228N(R.id.theme_color_togglerInactiveBackground);
    }

    public static void m190e(View view, boolean z, int i) {
        if (Build.VERSION.SDK_INT >= 21 && view != null) {
            Drawable background = view.getBackground();
            if (background instanceof RippleDrawable) {
                if (z) {
                    C2065g.m35721d(view, m254A(i));
                }
            } else if ((background instanceof C5130n) && !z) {
                C2065g.m35721d(view, m146x(i));
            }
        }
    }

    public static Drawable m189e0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i & 16777215) | 419430400}), null, m160q(C1357a0.m37544i(3.0f), -1));
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        int i2 = (i & 16777215) | 419430400;
        stateListDrawable.addState(new int[]{16842919}, m160q(C1357a0.m37544i(3.0f), i2));
        stateListDrawable.addState(new int[]{16842913}, m160q(C1357a0.m37544i(3.0f), i2));
        stateListDrawable.addState(StateSet.WILD_CARD, new ColorDrawable(0));
        return stateListDrawable;
    }

    public static Drawable m188e1() {
        return m179h1(1084268704);
    }

    public static int m187f() {
        return m228N(R.id.theme_color_chatListAction);
    }

    public static float m186f0() {
        return m201a0(R.id.theme_property_replaceShadowsWithSeparators);
    }

    @TargetApi(21)
    public static Drawable m185f1(int i) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new ColorDrawable(-1));
    }

    public static int m184g() {
        return m228N(R.id.theme_color_messageSwipeBackground);
    }

    public static float m183g0() {
        return m201a0(R.id.theme_property_shadowDepth);
    }

    public static Drawable m182g1() {
        return m179h1(1352704160);
    }

    public static int m181h() {
        return m228N(R.id.theme_color_messageSwipeContent);
    }

    public static float m180h0() {
        return m201a0(R.id.theme_property_subtitleAlpha);
    }

    public static Drawable m179h1(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m185f1(i);
        }
        return m176i1(i);
    }

    public static int m178i() {
        return m228N(R.id.theme_color_messageSelection);
    }

    public static int m177i0() {
        int a0 = (int) m201a0(R.id.theme_property_wallpaperUsageId);
        return a0 == 2 ? m220R(C11541z.m7t().m16m()) : a0;
    }

    public static Drawable m176i1(int i) {
        return C1362c.m37483i(null, new ColorDrawable(i));
    }

    public static int m175j() {
        return m228N(R.id.theme_color_chatSendButton);
    }

    public static int m174j0(int i) {
        int b0 = (int) m198b0(R.id.theme_property_wallpaperUsageId, i);
        return b0 == 2 ? m220R(i) : b0;
    }

    public static Drawable m173j1() {
        return m179h1(822083583);
    }

    public static int m172k() {
        return m228N(R.id.theme_color_messageVerticalLine);
    }

    public static int m171k0(AbstractC11531p pVar) {
        int d = (int) pVar.mo93d(R.id.theme_property_wallpaperUsageId);
        return d == 2 ? m220R(pVar.mo96a()) : d;
    }

    public static int m170l() {
        return m228N(R.id.theme_color_checkContent);
    }

    public static int m169l0() {
        return m228N(R.id.theme_color_headerIcon);
    }

    public static int m168m() {
        return m228N(R.id.theme_color_checkActive);
    }

    public static int m167m0() {
        return m228N(R.id.theme_color_headerBackground);
    }

    @TargetApi(21)
    public static Drawable m166n(float f, int i) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{1084268704}), new C10186a(i, f, false), null);
    }

    public static int m165n0() {
        return m228N(R.id.theme_color_overlayFilling);
    }

    public static Drawable m164o(float f, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m166n(f, i);
        }
        return m162p(f, i);
    }

    public static int m163o0() {
        return m228N(R.id.theme_color_placeholder);
    }

    public static Drawable m162p(float f, int i) {
        return C1362c.m37483i(new C10186a(i, f, false), new C10186a(i, f, true));
    }

    public static int m161p0() {
        return m228N(R.id.theme_color_headerText);
    }

    public static Drawable m160q(int i, int i2) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        return shapeDrawable;
    }

    public static int m159q0() {
        return m228N(R.id.theme_color_icon);
    }

    public static Drawable m158r(int i, int i2, int i3, int i4) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable2.getPaint().setColor(i4);
        if (Build.VERSION.SDK_INT >= 21) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i3}), shapeDrawable, shapeDrawable2);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, shapeDrawable2);
        stateListDrawable.addState(new int[]{16842913}, shapeDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, shapeDrawable);
        return stateListDrawable;
    }

    public static int m157r0() {
        return m228N(R.id.theme_color_iconLight);
    }

    @TargetApi(21)
    public static Drawable m156s(Drawable drawable) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{1084268704}), drawable, null);
    }

    public static int m155s0(boolean z) {
        return m228N(z ? R.id.theme_color_bubbleOut_inlineIcon : R.id.theme_color_inlineIcon);
    }

    public static Drawable m154t(Drawable drawable, Drawable drawable2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m156s(drawable);
        }
        return m152u(drawable, drawable2);
    }

    public static int m153t0(boolean z) {
        return m228N(z ? R.id.theme_color_bubbleOut_inlineOutline : R.id.theme_color_inlineOutline);
    }

    public static Drawable m152u(Drawable drawable, Drawable drawable2) {
        return C1362c.m37483i(drawable, drawable2);
    }

    public static int m151u0() {
        return m228N(R.id.theme_color_inlineContentActive);
    }

    public static int m150v() {
        return m141z0() ? R.style.DialogThemeDark : R.style.DialogTheme;
    }

    public static int m149v0(boolean z) {
        return m228N(z ? R.id.theme_color_bubbleOut_inlineText : R.id.theme_color_inlineText);
    }

    public static int m148w() {
        return m228N(R.id.theme_color_filling);
    }

    public static int m147w0() {
        return m228N(R.id.theme_color_introSectionActive);
    }

    @TargetApi(21)
    public static Drawable m146x(int i) {
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{1352704160}), new C7368l(i), new ColorDrawable(-1));
    }

    public static int m145x0() {
        return m228N(R.id.theme_color_introSection);
    }

    public static Drawable m144y() {
        return m142z(R.id.theme_color_filling);
    }

    public static boolean m143y0(float f) {
        return f36592b && f == ((float) C1357a0.m37544i(18.0f));
    }

    public static Drawable m142z(int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return m146x(i);
        }
        return m254A(i);
    }

    public static boolean m141z0() {
        return C11541z.m7t().m2x();
    }
}
