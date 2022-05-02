package p038ce;

import android.content.Context;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.ViewPager;
import p350yd.C10930q6;
import td.AbstractC9323v4;
import td.AbstractC9376x4;
import td.AbstractC9382y1;

public class g20 extends AbstractC9376x4<Object> {
    public final AbstractC9323v4<?>[] f8286x0;
    public final String[] f8287y0;
    public final boolean f8288z0;

    public g20(Context context, C10930q6 q6Var, AbstractC9323v4<?>[] v4VarArr, String[] strArr, boolean z) {
        super(context, q6Var);
        this.f8286x0 = v4VarArr;
        if (strArr == null || strArr.length == v4VarArr.length) {
            this.f8287y0 = strArr;
            this.f8288z0 = z;
            return;
        }
        throw new IllegalArgumentException(strArr.length + " != " + v4VarArr.length);
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public int mo9398L9() {
        return this.f8288z0 ? R.id.theme_color_filling : super.mo9398L9();
    }

    @Override
    public int mo9375O9() {
        return this.f8288z0 ? R.id.theme_color_headerLightIcon : super.mo9375O9();
    }

    @Override
    public int mo9360Q9() {
        return this.f8288z0 ? R.id.theme_color_text : super.mo9360Q9();
    }

    @Override
    public int mo407R9() {
        return R.id.controller_simplePager;
    }

    @Override
    public boolean mo9270dc() {
        AbstractC9323v4<?> bg = m8859bg(0);
        return bg != null ? bg.mo9270dc() : super.mo9270dc();
    }

    @Override
    public int mo8854gg() {
        return this.f8286x0.length;
    }

    @Override
    public String[] mo8852hg() {
        String[] strArr = this.f8287y0;
        if (strArr != null) {
            return strArr;
        }
        int length = this.f8286x0.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = this.f8286x0[i].mo9313X9().toString().toUpperCase();
        }
        return strArr2;
    }

    @Override
    public AbstractC9323v4<?> mo8846mg(Context context, int i) {
        return this.f8286x0[i];
    }

    @Override
    public void mo8845ng(Context context, FrameLayoutFix frameLayoutFix, ViewPager viewPager) {
        AbstractC9382y1 y1Var;
        if (this.f8288z0 && (y1Var = this.f30411v0) != null) {
            y1Var.getTopView().m10151a2(0, R.id.theme_color_text);
        }
        m8840rg(0, new Runnable() {
            @Override
            public final void run() {
                g20.this.m9204n9();
            }
        });
    }

    @Override
    public boolean mo8834wg() {
        return true;
    }

    @Override
    public long mo9125y9(boolean z) {
        AbstractC9323v4<?> bg = m8859bg(0);
        return bg != null ? bg.mo9125y9(z) : super.mo9125y9(z);
    }
}
