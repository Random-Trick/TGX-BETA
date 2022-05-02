package p038ce;

import android.content.ClipboardManager;
import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import be.C1357a0;
import be.C1379j0;
import ge.C4868i;
import me.C6851c0;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.ViewPager;
import p038ce.c40;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5919k;
import p143k0.C6038h;
import p350yd.C10930q6;
import p364zd.C11510b;
import p364zd.C11524j;
import p364zd.C11533r;
import p364zd.C11541z;
import td.AbstractC9323v4;
import td.AbstractC9376x4;
import td.View$OnClickListenerC9170d1;

public class s30 extends AbstractC9376x4<C3032a> implements ClipboardManager.OnPrimaryClipChangedListener {
    public boolean f10179A0;
    public final int[] f10180x0 = {R.id.theme_category_main, R.id.theme_category_content, R.id.theme_category_navigation, R.id.theme_category_controls, R.id.theme_category_colors, R.id.theme_category_chat, R.id.theme_category_bubbles, R.id.theme_category_iv, R.id.theme_category_other, R.id.theme_category_internal};
    public String f10181y0;
    public boolean f10182z0;

    public static class C3032a {
        public final C11533r f10183a;
        public Runnable f10184b;
        public View$OnClickListenerC2364ez f10185c;

        public C3032a(C11533r rVar, Runnable runnable, View$OnClickListenerC2364ez ezVar) {
            this.f10183a = rVar;
            this.f10184b = runnable;
            this.f10185c = ezVar;
        }
    }

    public s30(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static int m32040Eg(int i) {
        switch (i) {
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
                throw C11524j.m247D0(i, "sectionId");
        }
    }

    public void m32037Hg(View view) {
        mo4347s().m14425w0(this);
        mo4347s().m14552P1().m9719h0(this);
    }

    public boolean m32036Ig(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return false;
        }
        if (m9131x9().f10183a.m109d().equals(trim)) {
            return true;
        }
        C3032a x9 = m9131x9();
        x9.f10183a.m98o(trim);
        m8862Yf(trim);
        C4868i.m24726c2().m24596s4(C11541z.m41T(x9.f10183a.m110c()), trim);
        if (x9.f10185c != null && !x9.f10185c.m9347Sa()) {
            x9.f10185c.m34809hi(x9.f10183a);
        }
        return true;
    }

    public boolean m32035Jg(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        String k6 = this.f30167b.m2380k6(str.trim());
        if (C5070i.m24067c(m9131x9().f10183a.m107f(), k6)) {
            return true;
        }
        C3032a x9 = m9131x9();
        x9.f10183a.m97p(k6);
        C4868i.m24726c2().m24580u4(C11541z.m41T(x9.f10183a.m110c()), k6);
        if (x9.f10185c != null && !x9.f10185c.m9347Sa()) {
            x9.f10185c.m34809hi(x9.f10183a);
        }
        this.f30167b.m2712Oe().m2004t(x9.f10183a.m110c());
        return true;
    }

    public boolean m32034Kg(View view, int i) {
        int i2;
        C6038h<AbstractC9323v4<?>> Zf;
        switch (i) {
            case R.id.btn_colorFormatHex:
                i2 = 0;
                break;
            case R.id.btn_colorFormatHsl:
                i2 = 2;
                break;
            case R.id.btn_colorFormatRgb:
                i2 = 1;
                break;
            default:
                return false;
        }
        if (C4868i.m24726c2().m24628o4(i2) && (Zf = m8861Zf()) != null && Zf.m21463n() > 0) {
            for (int i3 = 0; i3 < Zf.m21463n(); i3++) {
                AbstractC9323v4<?> o = Zf.m21462o(i3);
                if (o instanceof AbstractC3204vo) {
                    ((AbstractC3204vo) o).m31303kg().getAdapter().m39313H();
                }
            }
        }
        return true;
    }

    public void m32033Lg() {
        m9298Zb();
        if (m9131x9().f10185c != null && !m9131x9().f10185c.m9347Sa()) {
            m9131x9().f10185c.m34808ih(m9131x9().f10183a, false);
        }
    }

    public void m32032Mg(SparseIntArray sparseIntArray, int i, int i2, int i3) {
        sparseIntArray.put(i, i3);
        if (sparseIntArray.size() == i2 && sparseIntArray.get(m8857dg()) == 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (sparseIntArray.valueAt(i4) > 0) {
                    m8836ug(sparseIntArray.keyAt(i4), true);
                    return;
                }
            }
        }
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public void mo420Cc(String str) {
        super.mo420Cc(str);
        m32031Ng(str);
    }

    public void m32041Dg(c40 c40Var, int i) {
        C6038h<AbstractC9323v4<?>> Zf = m8861Zf();
        if (Zf != null) {
            for (int i2 = 0; i2 < Zf.m21463n(); i2++) {
                AbstractC9323v4<?> o = Zf.m21462o(i2);
                if (o != c40Var && (o instanceof c40)) {
                    ((c40) o).m35233wh(i);
                }
            }
        }
    }

    @Override
    public boolean mo9450E8() {
        return false;
    }

    @Override
    public void mo9438Fd(View view, boolean z) {
        super.mo9438Fd(view, z);
        AbstractC9323v4<?> bg = m8859bg(m8857dg());
        if (bg instanceof c40) {
            ((c40) bg).m31292xg(view != null);
        }
    }

    public void m32039Fg(int i) {
        C6038h<AbstractC9323v4<?>> Zf = m8861Zf();
        if (Zf != null) {
            int dg = m8857dg();
            if (dg > 0) {
                AbstractC9323v4<?> e = Zf.m21471e(dg);
                if ((e instanceof c40) && ((c40) e).m35307Eh(i)) {
                    return;
                }
            }
            for (int n = Zf.m21463n() - 1; n >= 0; n--) {
                AbstractC9323v4<?> o = Zf.m21462o(n);
                if ((o instanceof c40) && ((c40) o).m35307Eh(i)) {
                    m8836ug(Zf.m21467i(n), false);
                    return;
                }
            }
        }
    }

    public boolean m32038Gg() {
        return this.f10179A0;
    }

    @Override
    public boolean mo9423He() {
        return false;
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_more) {
            int i2 = this.f10179A0 ? 4 : 7;
            C5320c cVar = new C5320c(i2);
            C5146u0 u0Var = new C5146u0(i2);
            if (!this.f10179A0) {
                cVar.m23284a(R.id.btn_edit);
                u0Var.m23816a(R.string.ThemeEditName);
                cVar.m23284a(R.id.btn_wallpaper);
                u0Var.m23816a(R.string.Wallpaper);
            }
            cVar.m23284a(R.id.btn_showAdvanced);
            u0Var.m23816a(R.string.ThemeAdvanced);
            cVar.m23284a(R.id.btn_color);
            u0Var.m23816a(R.string.ThemeColorFormat);
            cVar.m23284a(R.id.btn_share);
            u0Var.m23816a(C4868i.m24726c2().m24549z(C11541z.m41T(((C3032a) m9131x9()).f10183a.m110c())) ? R.string.ThemeExport : R.string.Share);
            if (!this.f10179A0) {
                cVar.m23284a(R.id.btn_delete);
                u0Var.m23816a(R.string.ThemeRemove);
            }
            cVar.m23284a(R.id.btn_close);
            u0Var.m23816a(this.f10179A0 ? R.string.ThemeClose : R.string.ThemeMinimize);
            m9302Yd(cVar.m23280e(), u0Var.m23813d(), 0);
        } else if (i == R.id.menu_btn_search) {
            c40 c40Var = new c40(this.f30165a, this.f30167b);
            c40Var.m35257di(new c40.C2234n(((C3032a) m9131x9()).f10183a, 0).m35225d(this));
            m9291ac(c40Var);
        }
    }

    @Override
    public void mo8864N0(int i) {
        switch (i) {
            case R.id.btn_close:
                this.f10179A0 = !this.f10179A0;
                ((C3032a) m9131x9()).f10185c = null;
                m9298Zb();
                return;
            case R.id.btn_color:
                m9227je(new int[]{R.id.btn_colorFormatHex, R.id.btn_colorFormatRgb, R.id.btn_colorFormatHsl}, new String[]{C4403w.m27869i1(R.string.ColorTypeHex), C4403w.m27869i1(R.string.ColorTypeRGBA), C4403w.m27869i1(R.string.ColorTypeHSLA)}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i2) {
                        boolean Kg;
                        Kg = s30.this.m32034Kg(view, i2);
                        return Kg;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i2) {
                        return C5115g0.m23934b(this, i2);
                    }
                });
                return;
            case R.id.btn_delete:
                this.f30167b.m2485dd().m3398y8(this, ((C3032a) m9131x9()).f10183a, new Runnable() {
                    @Override
                    public final void run() {
                        s30.this.m32033Lg();
                    }
                });
                return;
            case R.id.btn_edit:
                m9364Pc(C4403w.m27869i1(R.string.ThemeEditName), C4403w.m27869i1(R.string.ThemeName), R.string.Save, R.string.Cancel, ((C3032a) m9131x9()).f10183a.m109d(), new AbstractC9323v4.AbstractC9336m() {
                    @Override
                    public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                        boolean Ig;
                        Ig = s30.this.m32036Ig(y1Var, str);
                        return Ig;
                    }
                }, true);
                return;
            case R.id.btn_share:
                C11533r rVar = ((C3032a) m9131x9()).f10183a;
                this.f30167b.m2485dd().m3693V2(this, rVar, true ^ rVar.m104i(), false);
                return;
            case R.id.btn_showAdvanced:
                c40 c40Var = new c40(this.f30165a, this.f30167b);
                c40Var.m35257di(new c40.C2234n(((C3032a) m9131x9()).f10183a, R.id.theme_category_settings));
                m9291ac(c40Var);
                return;
            case R.id.btn_wallpaper:
                m9364Pc(C4403w.m27869i1(R.string.ThemeEditWallpaper), C4403w.m27869i1(R.string.ThemeWallpaper), R.string.Save, R.string.Cancel, ((C3032a) m9131x9()).f10183a.m106g(this.f30167b), new AbstractC9323v4.AbstractC9336m() {
                    @Override
                    public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                        boolean Jg;
                        Jg = s30.this.m32035Jg(y1Var, str);
                        return Jg;
                    }
                }, true);
                return;
            default:
                return;
        }
    }

    public final void m32031Ng(String str) {
        if (!C5070i.m24061i(str)) {
            str = str.trim().toLowerCase();
        }
        if (C5070i.m24061i(str)) {
            str = null;
        }
        String str2 = this.f10181y0;
        if (!(str2 == null && str == null)) {
            if (str == null || !str.equals(str2)) {
                this.f10181y0 = str;
                C6038h<AbstractC9323v4<?>> Zf = m8861Zf();
                if (Zf != null) {
                    final int n = Zf.m21463n();
                    final SparseIntArray sparseIntArray = new SparseIntArray(n);
                    for (int i = 0; i < n; i++) {
                        final int i2 = Zf.m21467i(i);
                        AbstractC9323v4<?> o = Zf.m21462o(i);
                        if (o instanceof c40) {
                            ((c40) o).m35259ci(str, new AbstractC5919k() {
                                @Override
                                public final void mo3250a(int i3) {
                                    s30.this.m32032Mg(sparseIntArray, i2, n, i3);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_theme;
    }

    @Override
    public int mo418W9() {
        return R.id.menu_theme;
    }

    @Override
    public CharSequence mo9313X9() {
        return m9131x9().f10183a.m109d();
    }

    @Override
    public void mo417Z8() {
        if (this.f10179A0) {
            mo4347s().m14486h2(this);
            return;
        }
        super.mo417Z8();
        if (this.f10182z0) {
            try {
                ClipboardManager clipboardManager = (ClipboardManager) this.f30165a.getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.removePrimaryClipChangedListener(this);
                    this.f10182z0 = false;
                }
            } catch (Throwable unused) {
            }
        }
        mo4347s().m14463n0();
    }

    @Override
    public int mo8856eg() {
        return R.id.theme_color_background;
    }

    @Override
    public int mo8854gg() {
        return this.f10180x0.length;
    }

    @Override
    public String[] mo8852hg() {
        int[] iArr = this.f10180x0;
        String[] strArr = new String[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            strArr[i] = C4403w.m27869i1(m32040Eg(i2)).toUpperCase();
            i++;
        }
        return strArr;
    }

    @Override
    public int mo8850jg() {
        return 3;
    }

    @Override
    public void mo9222kc() {
        super.mo9222kc();
        C1379j0.m37318l0(mo4347s(), 18);
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        super.mo134m7(z, bVar);
        if (!(z || bVar == null || !c40.m35303Gh(bVar.m370g()))) {
            int dg = m8857dg();
            C6038h<AbstractC9323v4<?>> Zf = m8861Zf();
            if (Zf != null) {
                for (int i = 0; i < Zf.m21463n(); i++) {
                    if (dg != Zf.m21467i(i)) {
                        AbstractC9323v4<?> o = Zf.m21462o(i);
                        if (o instanceof c40) {
                            ((c40) o).m35247ii(bVar.m370g(), true);
                        }
                    }
                }
            }
        }
    }

    @Override
    public AbstractC9323v4<?> mo8846mg(Context context, int i) {
        c40 c40Var = new c40(context, this.f30167b);
        c40Var.m35257di(new c40.C2234n(m9131x9().f10183a, this.f10180x0[i]));
        String str = this.f10181y0;
        if (str != null) {
            c40Var.m35259ci(str, null);
        }
        return c40Var;
    }

    @Override
    public View mo9201nc(Context context) {
        C6851c0 c0Var = new C6851c0(context);
        int i = C1357a0.m37541i(52.0f) + C1357a0.m37541i(24.0f);
        c0Var.setLayoutParams(FrameLayoutFix.m18007t1(i, i, C4868i.m24726c2().m24671j1()));
        c0Var.m18789d(R.drawable.baseline_palette_24, 52.0f, 12.0f, R.id.theme_color_circleButtonTheme, R.id.theme_color_circleButtonThemeIcon);
        c0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                s30.this.m32037Hg(view);
            }
        });
        return c0Var;
    }

    @Override
    public void mo8845ng(Context context, FrameLayoutFix frameLayoutFix, ViewPager viewPager) {
        viewPager.setOffscreenPageLimit(1);
        try {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.addPrimaryClipChangedListener(this);
                this.f10182z0 = true;
            }
        } catch (Throwable unused) {
        }
        mo4347s().m14420x0(s30.class);
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        if (m9339Ta()) {
            C1379j0.m37318l0(mo4347s(), 32);
        }
    }

    @Override
    public void onPrimaryClipChanged() {
        C6038h<AbstractC9323v4<?>> Zf = m8861Zf();
        if (Zf != null) {
            for (int n = Zf.m21463n() - 1; n >= 0; n--) {
                AbstractC9323v4<?> o = Zf.m21462o(n);
                if (o instanceof ClipboardManager.OnPrimaryClipChangedListener) {
                    ((ClipboardManager.OnPrimaryClipChangedListener) o).onPrimaryClipChanged();
                }
            }
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_theme) {
            d1Var.m10054i2(linearLayout, this);
            d1Var.m10069b2(linearLayout, this);
        }
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        C3032a x9 = m9131x9();
        if (x9.f10184b != null) {
            x9.f10184b.run();
            x9.f10184b = null;
        }
        C11541z.m7t().m21h(this.f30167b, x9.f10183a.m108e(), true, null);
        m8848kg().setOffscreenPageLimit(mo8854gg());
        C1379j0.m37318l0(mo4347s(), 32);
    }
}
