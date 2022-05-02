package p364zd;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Paint;
import be.C1379j0;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p082fd.C4403w;
import p154kb.C6227d;
import p350yd.AbstractC11030u0;
import p350yd.C10536ab;
import p350yd.C10733ic;
import p350yd.C10930q6;
import p350yd.C11008t0;
import p350yd.C11131y6;
import p350yd.HandlerC10770jj;

public class C11541z implements C3950k.AbstractC3952b, AbstractC11030u0 {
    public static volatile C11541z f36988P;
    public C3950k f36991O;
    public C10930q6 f36992a;
    public AbstractC11531p f36993b;
    public final List<C11536u> f36994c = new ArrayList();
    public final C6227d<AbstractC11526l> f36989M = new C6227d<>();
    public final C6227d<AbstractC11508a> f36990N = new C6227d<>();

    public C11541z() {
        C10536ab.m4667o1().m4716b1().m1554a(this);
    }

    public static boolean m64A(int i, float f) {
        return m57G(i, f) == f;
    }

    public void m63B(C10930q6 q6Var, AbstractC11531p pVar, Runnable runnable, DialogInterface dialogInterface, int i) {
        C4868i.m24726c2().m24700f4(0);
        m21h(q6Var, pVar, false, runnable);
    }

    public static void m60D(int i, Runnable runnable, int i2) {
        int j0 = C11524j.m174j0(i);
        C4868i.m24726c2().m24860J3(m41T(i));
        C7389v0.m16743D2(runnable);
        C10536ab.m4667o1().m4806E2(i, i2);
        if (j0 >= 2) {
            C10536ab.m4667o1().m4662q0(j0);
        }
    }

    public static float m57G(int i, float f) {
        switch (i) {
            case R.id.theme_property_bubbleCorner:
            case R.id.theme_property_bubbleCornerMerged:
            case R.id.theme_property_bubbleDateCorner:
            case R.id.theme_property_dateCorner:
                return Math.max(0.0f, f);
            case R.id.theme_property_bubbleCornerLegacy:
                return Math.max(0.0f, Math.min(6.0f, f));
            case R.id.theme_property_bubbleOuterMargin:
                return 8.0f;
            case R.id.theme_property_bubbleOutline:
            case R.id.theme_property_bubbleUnreadShadow:
            case R.id.theme_property_dark:
            case R.id.theme_property_lightStatusBar:
            case R.id.theme_property_replaceShadowsWithSeparators:
            case R.id.theme_property_wallpaperOverrideButton:
            case R.id.theme_property_wallpaperOverrideDate:
            case R.id.theme_property_wallpaperOverrideMediaReply:
            case R.id.theme_property_wallpaperOverrideOverlay:
            case R.id.theme_property_wallpaperOverrideTime:
            case R.id.theme_property_wallpaperOverrideUnread:
                return Math.max(0, Math.min(1, (int) f));
            case R.id.theme_property_bubbleOutlineSize:
            case R.id.theme_property_imageCorner:
                return Math.max(0.0f, f);
            case R.id.theme_property_parentTheme:
                return m39V((int) f, false);
            case R.id.theme_property_shadowDepth:
            case R.id.theme_property_subtitleAlpha:
                return Math.max(0.0f, Math.min(1.0f, f));
            case R.id.theme_property_wallpaperId:
                return (int) f;
            case R.id.theme_property_wallpaperUsageId:
                return Math.max(0, Math.min(2, (int) f));
            default:
                throw C11524j.m247D0(i, "propertyId");
        }
    }

    public static int m41T(int i) {
        if (i <= -2) {
            return (-2) - i;
        }
        return 0;
    }

    public static int m40U(int i) {
        if (i == 1 || i == 2) {
            return i;
        }
        return 2;
    }

    public static int m39V(int i, boolean z) {
        return m37X(C4868i.m24726c2(), i, z);
    }

    public static int m38W(int i, boolean z, boolean z2) {
        return m36Y(C4868i.m24726c2(), i, z, z2);
    }

    public static int m37X(C4868i iVar, int i, boolean z) {
        int T;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                if (!z || (T = m41T(i)) == 0 || !iVar.m24778V1(T)) {
                    return 10;
                }
                break;
        }
        return i;
    }

    public static int m36Y(C4868i iVar, int i, boolean z, boolean z2) {
        int X = m37X(iVar, i, z);
        return (X <= -2 || C11524j.m251B0(iVar, X) == z2) ? X : z2 ? 10 : 11;
    }

    public static int m34Z(int i) {
        switch (i) {
            case -1:
            case 0:
                return 10;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                int T = m41T(i);
                if (T == 0 || !C4868i.m24726c2().m24778V1(T)) {
                    return 10;
                }
                break;
        }
        return i;
    }

    public static int m32a0(int i) {
        if (i >= 0) {
            return (-2) - i;
        }
        throw new IllegalArgumentException("customThemeId == " + i);
    }

    public static void m24e(Paint paint, int i) {
        m7t().f36994c.add(new C11536u(5, i, paint));
    }

    public static AbstractC11531p m17l() {
        if (f36988P != null) {
            return f36988P.m18k(true, true);
        }
        return null;
    }

    public static int m14o(int i) {
        if (i == -2) {
            return R.string.ThemeCustom;
        }
        switch (i) {
            case 1:
                return R.string.ThemeBlue;
            case 2:
                return R.string.ThemeNight;
            case 3:
                return R.string.ThemeBlackWhite;
            case 4:
                return R.string.ThemeWhiteBlack;
            case 5:
                return R.string.ThemeRed;
            case 6:
                return R.string.ThemeOrange;
            case 7:
                return R.string.ThemeGreen;
            case 8:
                return R.string.ThemePink;
            case 9:
                return R.string.ThemeCyan;
            case 10:
                return R.string.ThemeNightBlue;
            case 11:
                return R.string.ThemeClassic;
            default:
                throw C11524j.m247D0(i, "themeId");
        }
    }

    public static C11541z m7t() {
        if (f36988P == null) {
            synchronized (C11541z.class) {
                if (f36988P == null) {
                    f36988P = new C11541z();
                }
            }
        }
        return f36988P;
    }

    public static boolean m6u(int i) {
        if (i != 1) {
            switch (i) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean m5v(int i) {
        switch (i) {
            case R.id.theme_property_bubbleOutline:
            case R.id.theme_property_bubbleUnreadShadow:
            case R.id.theme_property_dark:
            case R.id.theme_property_lightStatusBar:
            case R.id.theme_property_replaceShadowsWithSeparators:
            case R.id.theme_property_wallpaperOverrideButton:
            case R.id.theme_property_wallpaperOverrideDate:
            case R.id.theme_property_wallpaperOverrideMediaReply:
            case R.id.theme_property_wallpaperOverrideOverlay:
            case R.id.theme_property_wallpaperOverrideTime:
            case R.id.theme_property_wallpaperOverrideUnread:
                return true;
            case R.id.theme_property_bubbleOutlineSize:
            case R.id.theme_property_dateCorner:
            case R.id.theme_property_imageCorner:
            case R.id.theme_property_parentTheme:
            case R.id.theme_property_shadowDepth:
            case R.id.theme_property_subtitleAlpha:
            case R.id.theme_property_wallpaperId:
            default:
                return false;
        }
    }

    public static boolean m1y(int i) {
        return m41T(i) != 0;
    }

    public static boolean m0z(int i) {
        return i == R.id.theme_property_wallpaperId || i == R.id.theme_property_wallpaperUsageId;
    }

    @Override
    public void mo61C4(C11131y6 y6Var, int i, int i2) {
        C11008t0.m1997e(this, y6Var, i, i2);
    }

    public boolean m59E() {
        return m19j(false).mo91f();
    }

    public int m58F(String str, int i, int i2) {
        return m32a0(C4868i.m24726c2().m24641n(str, i, (i2 == 0 || !m1y(i2)) ? 0 : m41T(i2), null));
    }

    @Override
    public void mo56G2(C11131y6 y6Var, TdApi.AuthorizationState authorizationState, int i) {
        C11008t0.m1995g(this, y6Var, authorizationState, i);
    }

    public void m55H(int i) {
        Iterator<AbstractC11526l> it = this.f36989M.iterator();
        while (it.hasNext()) {
            it.next().mo133q0(i);
        }
    }

    public void m54I(C10930q6 q6Var, int i) {
        Iterator<AbstractC11508a> it = this.f36990N.iterator();
        while (it.hasNext()) {
            it.next().mo378b(q6Var, i);
        }
    }

    public void m53J(C10930q6 q6Var, C11520h hVar, long j, int i) {
        Iterator<AbstractC11508a> it = this.f36990N.iterator();
        while (it.hasNext()) {
            it.next().mo377q(q6Var, hVar, i);
        }
    }

    public void m52K(int i, C11510b bVar, boolean z) {
        if (m16m() == i) {
            m49N(z, bVar);
        }
    }

    public void m51L(int i, int i2, float f, float f2) {
        if (m16m() == i) {
            Iterator<AbstractC11526l> it = this.f36989M.iterator();
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    AbstractC11526l next = it.next();
                    if (f == f2) {
                        z = true;
                    }
                    next.mo137J4(i, i2, f, z);
                } else {
                    m49N(false, null);
                    return;
                }
            }
        }
    }

    public final void m50M(AbstractC11531p pVar, AbstractC11531p pVar2) {
        Iterator<AbstractC11526l> it = this.f36989M.iterator();
        while (it.hasNext()) {
            it.next().mo135a7(pVar, pVar2);
        }
    }

    public final void m49N(boolean z, C11510b bVar) {
        for (int size = this.f36994c.size() - 1; size >= 0; size--) {
            if (!this.f36994c.get(size).m89a(z)) {
                this.f36994c.remove(size);
            }
        }
        Iterator<AbstractC11526l> it = this.f36989M.iterator();
        while (it.hasNext()) {
            AbstractC11526l next = it.next();
            if (!z || next.mo136W0()) {
                next.mo134m7(z, bVar);
            }
        }
    }

    @Override
    public void mo48O(C11131y6 y6Var, boolean z, boolean z2) {
        C11008t0.m2000b(this, y6Var, z, z2);
    }

    @Override
    public void mo47O6(C10930q6 q6Var, boolean z) {
        C11008t0.m1994h(this, q6Var, z);
    }

    public AbstractC11531p m46P() {
        AbstractC11531p j = m19j(true);
        return j instanceof C11516d0 ? ((C11516d0) j).m339h() : j;
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        AbstractC11531p n = m15n(false);
        if ((n instanceof C11516d0) && ((C11516d0) n).m337j(f)) {
            m49N(true, null);
        }
    }

    public void m44Q(AbstractC11508a aVar) {
        this.f36990N.remove(aVar);
    }

    public void m43R(C10930q6 q6Var, final int i, final int i2, final Runnable runnable) {
        if (m1y(i)) {
            Runnable yVar = new Runnable() {
                @Override
                public final void run() {
                    C11541z.m60D(i, runnable, i2);
                }
            };
            if (m3w(i)) {
                m21h(q6Var, m10q(i2), false, yVar);
            } else {
                yVar.run();
            }
        }
    }

    public void m42S(AbstractC11526l lVar) {
        this.f36989M.remove(lVar);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        m49N(false, null);
        AbstractC11531p n = m15n(false);
        if (n instanceof C11516d0) {
            m25d0((C11516d0) n);
        }
    }

    public void m30b0(boolean z, boolean z2) {
        if (this.f36993b != null && this.f36992a != null && m2x() != z) {
            if (z) {
                C10930q6 q6Var = this.f36992a;
                m21h(q6Var, m10q(q6Var.m2294pc().m4145L()), z2, null);
                return;
            }
            C10930q6 q6Var2 = this.f36992a;
            m21h(q6Var2, m10q(q6Var2.m2294pc().m4146K()), z2, null);
        }
    }

    @Override
    public void mo29b1(C11131y6 y6Var, int i) {
        C11008t0.m1996f(this, y6Var, i);
    }

    public void m27c0() {
        m30b0(!m2x(), false);
    }

    public void m26d(AbstractC11508a aVar) {
        this.f36990N.add(aVar);
    }

    public final void m25d0(C11516d0 d0Var) {
        this.f36993b = d0Var.m338i();
    }

    public void m23f(AbstractC11526l lVar) {
        this.f36989M.add(lVar);
    }

    public AbstractC11531p m22g() {
        return m19j(false);
    }

    public boolean m21h(final C10930q6 q6Var, final AbstractC11531p pVar, boolean z, final Runnable runnable) {
        if (pVar == null || m3w(pVar.mo96a())) {
            return false;
        }
        if (!(z || m2x() == pVar.mo94c() || C4868i.m24726c2().m24647m1() == 0)) {
            AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
            if (E == null || E.m14582I0() != 0) {
                C4868i.m24726c2().m24700f4(0);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(E, C11524j.m150v());
                builder.setTitle(C4403w.m27869i1(R.string.DisableAutoNightMode));
                builder.setMessage(C4403w.m27869i1(R.string.DisableAutoNightModeDesc));
                builder.setPositiveButton(C4403w.m27950P0(), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C11541z.this.m63B(q6Var, pVar, runnable, dialogInterface, i);
                    }
                });
                builder.setNegativeButton(C4403w.m27869i1(R.string.Cancel), DialogInterface$OnClickListenerC11539x.f36984a);
                E.m14422w3(builder);
                return false;
            }
        }
        q6Var.m2294pc().m4106n0(pVar.mo96a());
        C11516d0 d0Var = new C11516d0(m19j(true), pVar);
        this.f36993b = d0Var;
        if (C1379j0.m37361G0(1000L) || C1379j0.m37364F() == 0) {
            C3950k kVar = this.f36991O;
            if (kVar == null) {
                this.f36991O = new C3950k(0, this, C2057b.f7280b, 200L);
            } else {
                kVar.m29541l(0.0f);
            }
            m50M(d0Var.m339h(), pVar);
            this.f36991O.m29544i(1.0f);
        } else {
            C3950k kVar2 = this.f36991O;
            if (kVar2 != null) {
                kVar2.m29542k();
            }
            d0Var.m337j(1.0f);
            m50M(d0Var.m339h(), pVar);
            m49N(false, null);
            m25d0(d0Var);
        }
        C7389v0.m16743D2(runnable);
        return true;
    }

    public AbstractC11531p m20i() {
        return m19j(true);
    }

    public AbstractC11531p m19j(boolean z) {
        return m18k(z, false);
    }

    public AbstractC11531p m18k(boolean z, boolean z2) {
        AbstractC11531p n = m15n(z2);
        return (n == null || n.mo96a() != -1 || (z && ((C11516d0) n).m340g() != 1.0f)) ? n : ((C11516d0) n).m338i();
    }

    public int m16m() {
        return m19j(false).mo96a();
    }

    public final AbstractC11531p m15n(boolean z) {
        int i;
        if (this.f36993b == null && !z) {
            C10930q6 l0 = C10536ab.m4667o1().m4678l0();
            int M = l0.m2294pc().m4144M();
            if (C4868i.m24726c2().m24647m1() == 2) {
                if (C4868i.m24726c2().m24742a2()) {
                    C10733ic pc = l0.m2294pc();
                    i = l0.m2294pc().m4145L();
                    pc.m4106n0(i);
                } else {
                    C10733ic pc2 = l0.m2294pc();
                    i = l0.m2294pc().m4146K();
                    pc2.m4106n0(i);
                }
                M = i;
            }
            this.f36992a = l0;
            this.f36993b = m10q(M);
        }
        return this.f36993b;
    }

    public List<C11533r> m13p() {
        int[] iArr = {11, 1, 5, 6, 7, 8, 9, 10, 2};
        ArrayList arrayList = new ArrayList(9);
        for (int i = 0; i < 9; i++) {
            arrayList.add(new C11533r(iArr[i]));
        }
        return arrayList;
    }

    @Override
    public void mo12p4(C11131y6 y6Var, TdApi.User user, boolean z, boolean z2) {
        C11008t0.m2001a(this, y6Var, user, z, z2);
    }

    @Override
    public void mo11p6(C11131y6 y6Var, int i) {
        C11008t0.m1998d(this, y6Var, i);
    }

    public AbstractC11531p m10q(int i) {
        return C11514c0.m345d(i, true);
    }

    public boolean m9r(int i) {
        AbstractC11531p n = m15n(false);
        int a = n.mo96a();
        if (a == -1) {
            C11516d0 d0Var = (C11516d0) n;
            return d0Var.m339h().mo92e(i) != d0Var.m338i().mo92e(i);
        } else if (m1y(a)) {
            return ((C11529n) n).m122i(i);
        } else {
            return false;
        }
    }

    public int m8s(HandlerC10770jj.C10783m mVar) {
        int b2 = C4868i.m24726c2().m24734b2(mVar);
        if (b2 != 0) {
            return m32a0(b2);
        }
        return 0;
    }

    @Override
    public void mo4v4(C11131y6 y6Var, TdApi.User user, int i, C11131y6 y6Var2) {
        C10930q6 q6Var = this.f36992a;
        if (q6Var != null && q6Var != y6Var.m1467i0()) {
            C10930q6 i0 = y6Var.m1467i0();
            this.f36992a = i0;
            int M = i0.m2294pc().m4144M();
            if (C4868i.m24726c2().m24647m1() != 0) {
                M = m20i().mo94c() ? this.f36992a.m2294pc().m4145L() : this.f36992a.m2294pc().m4146K();
                this.f36992a.m2294pc().m4106n0(M);
            }
            if (!m3w(M)) {
                m21h(this.f36992a, m10q(M), true, null);
            }
        }
    }

    public boolean m3w(int i) {
        return m16m() == i;
    }

    public boolean m2x() {
        return m19j(false).mo94c();
    }
}
