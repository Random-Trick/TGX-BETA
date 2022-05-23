package de;

import ae.b;
import ae.j;
import ae.r;
import ae.z;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import ce.a0;
import ce.j0;
import de.d40;
import gd.w;
import he.i;
import ie.g0;
import ie.h0;
import ie.u0;
import jb.c;
import k0.h;
import kb.k;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.c0;
import ne.y1;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.ViewPager;
import ud.d1;
import ud.v4;
import ud.x4;
import zd.o6;

public class t30 extends x4<a> implements ClipboardManager.OnPrimaryClipChangedListener {
    public boolean A0;
    public final int[] f9609x0 = {R.id.theme_category_main, R.id.theme_category_content, R.id.theme_category_navigation, R.id.theme_category_controls, R.id.theme_category_colors, R.id.theme_category_chat, R.id.theme_category_bubbles, R.id.theme_category_iv, R.id.theme_category_other, R.id.theme_category_internal};
    public String f9610y0;
    public boolean f9611z0;

    public static class a {
        public final r f9612a;
        public Runnable f9613b;
        public fz f9614c;

        public a(r rVar, Runnable runnable, fz fzVar) {
            this.f9612a = rVar;
            this.f9613b = runnable;
            this.f9614c = fzVar;
        }
    }

    public t30(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static int Eg(int i10) {
        switch (i10) {
            case R.id.theme_category_bubbles:
                return R.string.ThemeCategoryBubbles;
            case R.id.theme_category_chat:
                return R.string.ThemeCategoryChats;
            case R.id.theme_category_colors:
                return R.string.ThemeCategoryColors;
            case R.id.theme_category_content:
                return R.string.ThemeCategoryContent;
            case R.id.theme_category_controls:
                return R.string.ThemeCategoryControls;
            case R.id.theme_category_internal:
                return R.string.ThemeCategoryInternal;
            case R.id.theme_category_iv:
                return R.string.ThemeCategoryIV;
            case R.id.theme_category_main:
                return R.string.ThemeCategoryAccent;
            case R.id.theme_category_navigation:
                return R.string.ThemeCategoryNavigation;
            case R.id.theme_category_other:
                return R.string.ThemeCategoryOther;
            default:
                throw j.B0(i10, "sectionId");
        }
    }

    public void Hg(View view) {
        t().z0(this);
        t().Q1().h0(this);
    }

    public boolean Ig(y1 y1Var, String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return false;
        }
        if (x9().f9612a.d().equals(trim)) {
            return true;
        }
        a x92 = x9();
        x92.f9612a.o(trim);
        Yf(trim);
        i.c2().s4(z.V(x92.f9612a.c()), trim);
        if (x92.f9614c != null && !x92.f9614c.Sa()) {
            x92.f9614c.hi(x92.f9612a);
        }
        return true;
    }

    public boolean Jg(y1 y1Var, String str) {
        String o62 = this.f24495b.o6(str.trim());
        if (ib.i.c(x9().f9612a.f(), o62)) {
            return true;
        }
        a x92 = x9();
        x92.f9612a.p(o62);
        i.c2().u4(z.V(x92.f9612a.c()), o62);
        if (x92.f9614c != null && !x92.f9614c.Sa()) {
            x92.f9614c.hi(x92.f9612a);
        }
        this.f24495b.Ue().t(x92.f9612a.c());
        return true;
    }

    public boolean Kg(View view, int i10) {
        int i11;
        h<v4<?>> Zf;
        switch (i10) {
            case R.id.btn_colorFormatHex:
                i11 = 0;
                break;
            case R.id.btn_colorFormatHsl:
                i11 = 2;
                break;
            case R.id.btn_colorFormatRgb:
                i11 = 1;
                break;
            default:
                return false;
        }
        if (i.c2().o4(i11) && (Zf = Zf()) != null && Zf.n() > 0) {
            for (int i12 = 0; i12 < Zf.n(); i12++) {
                v4<?> o10 = Zf.o(i12);
                if (o10 instanceof vo) {
                    ((vo) o10).kg().getAdapter().H();
                }
            }
        }
        return true;
    }

    public void Lg() {
        Zb();
        if (x9().f9614c != null && !x9().f9614c.Sa()) {
            x9().f9614c.ih(x9().f9612a, false);
        }
    }

    public void Mg(SparseIntArray sparseIntArray, int i10, int i11, int i12) {
        sparseIntArray.put(i10, i12);
        if (sparseIntArray.size() == i11 && sparseIntArray.get(dg()) == 0) {
            for (int i13 = 0; i13 < i11; i13++) {
                if (sparseIntArray.valueAt(i13) > 0) {
                    ug(sparseIntArray.keyAt(i13), true);
                    return;
                }
            }
        }
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public void Cc(String str) {
        super.Cc(str);
        Ng(str);
    }

    public void Dg(d40 d40Var, int i10) {
        h<v4<?>> Zf = Zf();
        if (Zf != null) {
            for (int i11 = 0; i11 < Zf.n(); i11++) {
                v4<?> o10 = Zf.o(i11);
                if (o10 != d40Var && (o10 instanceof d40)) {
                    ((d40) o10).wh(i10);
                }
            }
        }
    }

    @Override
    public boolean E8() {
        return false;
    }

    @Override
    public void Fd(View view, boolean z10) {
        super.Fd(view, z10);
        v4<?> bg = bg(dg());
        if (bg instanceof d40) {
            ((d40) bg).xg(view != null);
        }
    }

    public void Fg(int i10) {
        h<v4<?>> Zf = Zf();
        if (Zf != null) {
            int dg = dg();
            if (dg > 0) {
                v4<?> e10 = Zf.e(dg);
                if ((e10 instanceof d40) && ((d40) e10).Eh(i10)) {
                    return;
                }
            }
            for (int n10 = Zf.n() - 1; n10 >= 0; n10--) {
                v4<?> o10 = Zf.o(n10);
                if ((o10 instanceof d40) && ((d40) o10).Eh(i10)) {
                    ug(Zf.i(n10), false);
                    return;
                }
            }
        }
    }

    public boolean Gg() {
        return this.A0;
    }

    @Override
    public boolean He() {
        return false;
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_more) {
            int i11 = this.A0 ? 4 : 7;
            c cVar = new c(i11);
            u0 u0Var = new u0(i11);
            if (!this.A0) {
                cVar.a(R.id.btn_edit);
                u0Var.a(R.string.ThemeEditName);
                cVar.a(R.id.btn_wallpaper);
                u0Var.a(R.string.Wallpaper);
            }
            cVar.a(R.id.btn_showAdvanced);
            u0Var.a(R.string.ThemeAdvanced);
            cVar.a(R.id.btn_color);
            u0Var.a(R.string.ThemeColorFormat);
            cVar.a(R.id.btn_share);
            u0Var.a(i.c2().z(z.V(((a) x9()).f9612a.c())) ? R.string.ThemeExport : R.string.Share);
            if (!this.A0) {
                cVar.a(R.id.btn_delete);
                u0Var.a(R.string.ThemeRemove);
            }
            cVar.a(R.id.btn_close);
            u0Var.a(this.A0 ? R.string.ThemeClose : R.string.ThemeMinimize);
            Yd(cVar.e(), u0Var.d(), 0);
        } else if (i10 == R.id.menu_btn_search) {
            d40 d40Var = new d40(this.f24493a, this.f24495b);
            d40Var.di(new d40.n(((a) x9()).f9612a, 0).d(this));
            ac(d40Var);
        }
    }

    public final void Ng(String str) {
        if (!ib.i.i(str)) {
            str = str.trim().toLowerCase();
        }
        if (ib.i.i(str)) {
            str = null;
        }
        String str2 = this.f9610y0;
        if (!(str2 == null && str == null)) {
            if (str == null || !str.equals(str2)) {
                this.f9610y0 = str;
                h<v4<?>> Zf = Zf();
                if (Zf != null) {
                    final int n10 = Zf.n();
                    final SparseIntArray sparseIntArray = new SparseIntArray(n10);
                    for (int i10 = 0; i10 < n10; i10++) {
                        final int i11 = Zf.i(i10);
                        v4<?> o10 = Zf.o(i10);
                        if (o10 instanceof d40) {
                            ((d40) o10).ci(str, new k() {
                                @Override
                                public final void a(int i12) {
                                    t30.this.Mg(sparseIntArray, i11, n10, i12);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    @Override
    public void P0(int i10) {
        switch (i10) {
            case R.id.btn_close:
                this.A0 = !this.A0;
                ((a) x9()).f9614c = null;
                Zb();
                return;
            case R.id.btn_color:
                je(new int[]{R.id.btn_colorFormatHex, R.id.btn_colorFormatRgb, R.id.btn_colorFormatHsl}, new String[]{w.i1(R.string.ColorTypeHex), w.i1(R.string.ColorTypeRGBA), w.i1(R.string.ColorTypeHSLA)}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i11) {
                        return g0.b(this, i11);
                    }

                    @Override
                    public final boolean r3(View view, int i11) {
                        boolean Kg;
                        Kg = t30.this.Kg(view, i11);
                        return Kg;
                    }
                });
                return;
            case R.id.btn_delete:
                this.f24495b.hd().y8(this, ((a) x9()).f9612a, new Runnable() {
                    @Override
                    public final void run() {
                        t30.this.Lg();
                    }
                });
                return;
            case R.id.btn_edit:
                Pc(w.i1(R.string.ThemeEditName), w.i1(R.string.ThemeName), R.string.Save, R.string.Cancel, ((a) x9()).f9612a.d(), new v4.m() {
                    @Override
                    public final boolean a(y1 y1Var, String str) {
                        boolean Ig;
                        Ig = t30.this.Ig(y1Var, str);
                        return Ig;
                    }
                }, true);
                return;
            case R.id.btn_share:
                r rVar = ((a) x9()).f9612a;
                this.f24495b.hd().V2(this, rVar, true ^ rVar.i(), false);
                return;
            case R.id.btn_showAdvanced:
                d40 d40Var = new d40(this.f24493a, this.f24495b);
                d40Var.di(new d40.n(((a) x9()).f9612a, R.id.theme_category_settings));
                ac(d40Var);
                return;
            case R.id.btn_wallpaper:
                Pc(w.i1(R.string.ThemeEditWallpaper), w.i1(R.string.ThemeWallpaper), R.string.Save, R.string.Cancel, ((a) x9()).f9612a.g(this.f24495b), new v4.m() {
                    @Override
                    public final boolean a(y1 y1Var, String str) {
                        boolean Jg;
                        Jg = t30.this.Jg(y1Var, str);
                        return Jg;
                    }
                }, true);
                return;
            default:
                return;
        }
    }

    @Override
    public int R9() {
        return R.id.controller_theme;
    }

    @Override
    public int W9() {
        return R.id.menu_theme;
    }

    @Override
    public CharSequence X9() {
        return x9().f9612a.d();
    }

    @Override
    public void Z8() {
        if (this.A0) {
            t().i2(this);
            return;
        }
        super.Z8();
        if (this.f9611z0) {
            try {
                ClipboardManager clipboardManager = (ClipboardManager) this.f24493a.getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.removePrimaryClipChangedListener(this);
                    this.f9611z0 = false;
                }
            } catch (Throwable unused) {
            }
        }
        t().p0();
    }

    @Override
    public int eg() {
        return R.id.theme_color_background;
    }

    @Override
    public int gg() {
        return this.f9609x0.length;
    }

    @Override
    public String[] hg() {
        int[] iArr = this.f9609x0;
        String[] strArr = new String[iArr.length];
        int i10 = 0;
        for (int i11 : iArr) {
            strArr[i10] = w.i1(Eg(i11)).toUpperCase();
            i10++;
        }
        return strArr;
    }

    @Override
    public void j6(boolean z10, b bVar) {
        super.j6(z10, bVar);
        if (!(z10 || bVar == null || !d40.Gh(bVar.g()))) {
            int dg = dg();
            h<v4<?>> Zf = Zf();
            if (Zf != null) {
                for (int i10 = 0; i10 < Zf.n(); i10++) {
                    if (dg != Zf.i(i10)) {
                        v4<?> o10 = Zf.o(i10);
                        if (o10 instanceof d40) {
                            ((d40) o10).ii(bVar.g(), true);
                        }
                    }
                }
            }
        }
    }

    @Override
    public int jg() {
        return 3;
    }

    @Override
    public void kc() {
        super.kc();
        j0.l0(t(), 18);
    }

    @Override
    public v4<?> mg(Context context, int i10) {
        d40 d40Var = new d40(context, this.f24495b);
        d40Var.di(new d40.n(x9().f9612a, this.f9609x0[i10]));
        String str = this.f9610y0;
        if (str != null) {
            d40Var.ci(str, null);
        }
        return d40Var;
    }

    @Override
    public View nc(Context context) {
        c0 c0Var = new c0(context);
        int i10 = a0.i(52.0f) + a0.i(24.0f);
        c0Var.setLayoutParams(FrameLayoutFix.r1(i10, i10, i.c2().j1()));
        c0Var.d(R.drawable.baseline_palette_24, 52.0f, 12.0f, R.id.theme_color_circleButtonTheme, R.id.theme_color_circleButtonThemeIcon);
        c0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                t30.this.Hg(view);
            }
        });
        return c0Var;
    }

    @Override
    public void ng(Context context, FrameLayoutFix frameLayoutFix, ViewPager viewPager) {
        viewPager.setOffscreenPageLimit(1);
        try {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.addPrimaryClipChangedListener(this);
                this.f9611z0 = true;
            }
        } catch (Throwable unused) {
        }
        t().A0(t30.class);
    }

    @Override
    public void o6() {
        super.o6();
        if (Ta()) {
            j0.l0(t(), 32);
        }
    }

    @Override
    public void onPrimaryClipChanged() {
        h<v4<?>> Zf = Zf();
        if (Zf != null) {
            for (int n10 = Zf.n() - 1; n10 >= 0; n10--) {
                v4<?> o10 = Zf.o(n10);
                if (o10 instanceof ClipboardManager.OnPrimaryClipChangedListener) {
                    ((ClipboardManager.OnPrimaryClipChangedListener) o10).onPrimaryClipChanged();
                }
            }
        }
    }

    @Override
    public void sc() {
        super.sc();
        a x92 = x9();
        if (x92.f9613b != null) {
            x92.f9613b.run();
            x92.f9613b = null;
        }
        z.u().h(this.f24495b, x92.f9612a.e(), true, null);
        kg().setOffscreenPageLimit(gg());
        j0.l0(t(), 32);
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_theme) {
            d1Var.g2(linearLayout, this);
            d1Var.a2(linearLayout, this);
        }
    }
}
