package ae;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Paint;
import ce.j0;
import db.b;
import eb.k;
import gd.w;
import he.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb.d;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import zd.gc;
import zd.hj;
import zd.o6;
import zd.r0;
import zd.s0;
import zd.w6;
import zd.ya;

public class z implements k.b, s0 {
    public static volatile z P;
    public k O;
    public o6 f1072a;
    public p f1073b;
    public final List<u> f1074c = new ArrayList();
    public final d<l> M = new d<>();
    public final d<a> N = new d<>();

    public z() {
        ya.o1().b1().a(this);
    }

    public static boolean A(int i10) {
        return V(i10) != 0;
    }

    public static boolean B(int i10) {
        return i10 == R.id.theme_property_wallpaperId || i10 == R.id.theme_property_wallpaperUsageId;
    }

    public static boolean C(int i10, float f10) {
        return I(i10, f10) == f10;
    }

    public void D(o6 o6Var, p pVar, Runnable runnable, DialogInterface dialogInterface, int i10) {
        i.c2().f4(0);
        h(o6Var, pVar, false, runnable);
    }

    public static void F(int i10, Runnable runnable, int i11) {
        int h02 = j.h0(i10);
        i.c2().J3(V(i10));
        v0.D2(runnable);
        ya.o1().E2(i10, i11);
        if (h02 >= 2) {
            ya.o1().q0(h02);
        }
    }

    public static float I(int i10, float f10) {
        switch (i10) {
            case R.id.theme_property_bubbleCorner:
            case R.id.theme_property_bubbleCornerMerged:
            case R.id.theme_property_bubbleDateCorner:
            case R.id.theme_property_dateCorner:
                return Math.max(0.0f, f10);
            case R.id.theme_property_bubbleCornerLegacy:
                return Math.max(0.0f, Math.min(6.0f, f10));
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
                return Math.max(0, Math.min(1, (int) f10));
            case R.id.theme_property_bubbleOutlineSize:
            case R.id.theme_property_imageCorner:
                return Math.max(0.0f, f10);
            case R.id.theme_property_parentTheme:
                return X((int) f10, false);
            case R.id.theme_property_shadowDepth:
            case R.id.theme_property_subtitleAlpha:
                return Math.max(0.0f, Math.min(1.0f, f10));
            case R.id.theme_property_wallpaperId:
                return (int) f10;
            case R.id.theme_property_wallpaperUsageId:
                return Math.max(0, Math.min(2, (int) f10));
            default:
                throw j.B0(i10, "propertyId");
        }
    }

    public static int V(int i10) {
        if (i10 <= -2) {
            return (-2) - i10;
        }
        return 0;
    }

    public static int W(int i10) {
        if (i10 == 1 || i10 == 2) {
            return i10;
        }
        return 2;
    }

    public static int X(int i10, boolean z10) {
        return Z(i.c2(), i10, z10);
    }

    public static int Y(int i10, boolean z10, boolean z11) {
        return a0(i.c2(), i10, z10, z11);
    }

    public static int Z(i iVar, int i10, boolean z10) {
        int V;
        switch (i10) {
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
                if (!z10 || (V = V(i10)) == 0 || !iVar.V1(V)) {
                    return 10;
                }
                break;
        }
        return i10;
    }

    public static int a0(i iVar, int i10, boolean z10, boolean z11) {
        int Z = Z(iVar, i10, z10);
        return (Z <= -2 || j.z0(iVar, Z) == z11) ? Z : z11 ? 10 : 11;
    }

    public static int b0(int i10) {
        switch (i10) {
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
                int V = V(i10);
                if (V == 0 || !i.c2().V1(V)) {
                    return 10;
                }
                break;
        }
        return i10;
    }

    public static int c0(int i10) {
        if (i10 >= 0) {
            return (-2) - i10;
        }
        throw new IllegalArgumentException("customThemeId == " + i10);
    }

    public static void f(Paint paint, int i10) {
        u().f1074c.add(new u(5, i10, paint));
    }

    public static p m() {
        if (P != null) {
            return P.k(true, true);
        }
        return null;
    }

    public static int p(int i10) {
        if (i10 == -2) {
            return R.string.ThemeCustom;
        }
        switch (i10) {
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
                throw j.B0(i10, "themeId");
        }
    }

    public static z u() {
        if (P == null) {
            synchronized (z.class) {
                if (P == null) {
                    P = new z();
                }
            }
        }
        return P;
    }

    public static boolean v(int i10) {
        if (i10 != 1) {
            switch (i10) {
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

    public static boolean w(int i10) {
        switch (i10) {
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

    @Override
    public void D4(w6 w6Var, boolean z10, boolean z11) {
        r0.b(this, w6Var, z10, z11);
    }

    public boolean G() {
        return j(false).f();
    }

    public int H(String str, int i10, int i11) {
        return c0(i.c2().n(str, i10, (i11 == 0 || !A(i11)) ? 0 : V(i11), null));
    }

    public void J(int i10) {
        Iterator<l> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().q0(i10);
        }
    }

    public void K(o6 o6Var, int i10) {
        Iterator<a> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().c(o6Var, i10);
        }
    }

    public void L(o6 o6Var, h hVar, long j10, int i10) {
        Iterator<a> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().a(o6Var, hVar, i10);
        }
    }

    public void M(int i10, b bVar, boolean z10) {
        if (n() == i10) {
            P(z10, bVar);
        }
    }

    public void N(int i10, int i11, float f10, float f11) {
        if (n() == i10) {
            Iterator<l> it = this.M.iterator();
            while (true) {
                boolean z10 = false;
                if (it.hasNext()) {
                    l next = it.next();
                    if (f10 == f11) {
                        z10 = true;
                    }
                    next.C4(i10, i11, f10, z10);
                } else {
                    P(false, null);
                    return;
                }
            }
        }
    }

    @Override
    public void N6(w6 w6Var, int i10) {
        r0.f(this, w6Var, i10);
    }

    public final void O(p pVar, p pVar2) {
        Iterator<l> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().i3(pVar, pVar2);
        }
    }

    public final void P(boolean z10, b bVar) {
        for (int size = this.f1074c.size() - 1; size >= 0; size--) {
            if (!this.f1074c.get(size).a(z10)) {
                this.f1074c.remove(size);
            }
        }
        Iterator<l> it = this.M.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if (!z10 || next.V0()) {
                next.j6(z10, bVar);
            }
        }
    }

    public p Q() {
        p j10 = j(true);
        return j10 instanceof d0 ? ((d0) j10).h() : j10;
    }

    public void R(a aVar) {
        this.N.remove(aVar);
    }

    @Override
    public void S(w6 w6Var, int i10) {
        r0.d(this, w6Var, i10);
    }

    public void T(o6 o6Var, final int i10, final int i11, final Runnable runnable) {
        if (A(i10)) {
            Runnable yVar = new Runnable() {
                @Override
                public final void run() {
                    z.F(i10, runnable, i11);
                }
            };
            if (x(i10)) {
                h(o6Var, r(i11), false, yVar);
            } else {
                yVar.run();
            }
        }
    }

    public void U(l lVar) {
        this.M.remove(lVar);
    }

    @Override
    public void V1(w6 w6Var, TdApi.User user, int i10, w6 w6Var2) {
        o6 o6Var = this.f1072a;
        if (o6Var != null && o6Var != w6Var.i0()) {
            o6 i02 = w6Var.i0();
            this.f1072a = i02;
            int M = i02.tc().M();
            if (i.c2().m1() != 0) {
                M = i().c() ? this.f1072a.tc().L() : this.f1072a.tc().K();
                this.f1072a.tc().n0(M);
            }
            if (!x(M)) {
                h(this.f1072a, r(M), true, null);
            }
        }
    }

    public void d(a aVar) {
        this.N.add(aVar);
    }

    public void d0(boolean z10, boolean z11) {
        if (this.f1073b != null && this.f1072a != null && y() != z10) {
            if (z10) {
                o6 o6Var = this.f1072a;
                h(o6Var, r(o6Var.tc().L()), z11, null);
                return;
            }
            o6 o6Var2 = this.f1072a;
            h(o6Var2, r(o6Var2.tc().K()), z11, null);
        }
    }

    public void e(l lVar) {
        this.M.add(lVar);
    }

    public void e0() {
        d0(!y(), false);
    }

    public final void f0(d0 d0Var) {
        this.f1073b = d0Var.i();
    }

    public p g() {
        return j(false);
    }

    public boolean h(final o6 o6Var, final p pVar, boolean z10, final Runnable runnable) {
        if (pVar == null || x(pVar.a())) {
            return false;
        }
        if (!(z10 || y() == pVar.c() || i.c2().m1() == 0)) {
            a E = j0.E();
            if (E == null || E.L0() != 0) {
                i.c2().f4(0);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(E, j.t());
                builder.setTitle(w.i1(R.string.DisableAutoNightMode));
                builder.setMessage(w.i1(R.string.DisableAutoNightModeDesc));
                builder.setPositiveButton(w.P0(), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        z.this.D(o6Var, pVar, runnable, dialogInterface, i10);
                    }
                });
                builder.setNegativeButton(w.i1(R.string.Cancel), x.f1068a);
                E.x3(builder);
                return false;
            }
        }
        o6Var.tc().n0(pVar.a());
        d0 d0Var = new d0(j(true), pVar);
        this.f1073b = d0Var;
        if (j0.G0(1000L) || j0.F() == 0) {
            k kVar = this.O;
            if (kVar == null) {
                this.O = new k(0, this, b.f7287b, 200L);
            } else {
                kVar.l(0.0f);
            }
            O(d0Var.h(), pVar);
            this.O.i(1.0f);
        } else {
            k kVar2 = this.O;
            if (kVar2 != null) {
                kVar2.k();
            }
            d0Var.j(1.0f);
            O(d0Var.h(), pVar);
            P(false, null);
            f0(d0Var);
        }
        v0.D2(runnable);
        return true;
    }

    public p i() {
        return j(true);
    }

    public p j(boolean z10) {
        return k(z10, false);
    }

    public p k(boolean z10, boolean z11) {
        p o10 = o(z11);
        return (o10 == null || o10.a() != -1 || (z10 && ((d0) o10).g() != 1.0f)) ? o10 : ((d0) o10).i();
    }

    @Override
    public void l(w6 w6Var, TdApi.AuthorizationState authorizationState, int i10) {
        r0.g(this, w6Var, authorizationState, i10);
    }

    public int n() {
        return j(false).a();
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        p o10 = o(false);
        if ((o10 instanceof d0) && ((d0) o10).j(f10)) {
            P(true, null);
        }
    }

    public final p o(boolean z10) {
        int i10;
        if (this.f1073b == null && !z10) {
            o6 l02 = ya.o1().l0();
            int M = l02.tc().M();
            if (i.c2().m1() == 2) {
                if (i.c2().a2()) {
                    gc tc2 = l02.tc();
                    i10 = l02.tc().L();
                    tc2.n0(i10);
                } else {
                    gc tc3 = l02.tc();
                    i10 = l02.tc().K();
                    tc3.n0(i10);
                }
                M = i10;
            }
            this.f1072a = l02;
            this.f1073b = r(M);
        }
        return this.f1073b;
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        P(false, null);
        p o10 = o(false);
        if (o10 instanceof d0) {
            f0((d0) o10);
        }
    }

    public List<r> q() {
        int[] iArr = {11, 1, 5, 6, 7, 8, 9, 10, 2};
        ArrayList arrayList = new ArrayList(9);
        for (int i10 = 0; i10 < 9; i10++) {
            arrayList.add(new r(iArr[i10]));
        }
        return arrayList;
    }

    public p r(int i10) {
        return c0.d(i10, true);
    }

    public boolean s(int i10) {
        p o10 = o(false);
        int a10 = o10.a();
        if (a10 == -1) {
            d0 d0Var = (d0) o10;
            return d0Var.h().e(i10) != d0Var.i().e(i10);
        } else if (A(a10)) {
            return ((n) o10).i(i10);
        } else {
            return false;
        }
    }

    public int t(hj.m mVar) {
        int b22 = i.c2().b2(mVar);
        if (b22 != 0) {
            return c0(b22);
        }
        return 0;
    }

    @Override
    public void v0(w6 w6Var, TdApi.User user, boolean z10, boolean z11) {
        r0.a(this, w6Var, user, z10, z11);
    }

    public boolean x(int i10) {
        return n() == i10;
    }

    public boolean y() {
        return j(false).c();
    }

    @Override
    public void z(o6 o6Var, boolean z10) {
        r0.h(this, o6Var, z10);
    }

    @Override
    public void z5(w6 w6Var, int i10, int i11) {
        r0.e(this, w6Var, i10, i11);
    }
}
