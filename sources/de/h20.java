package de;

import android.content.Context;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.ViewPager;
import ud.v4;
import ud.x4;
import ud.y1;
import zd.o6;

public class h20 extends x4<Object> {
    public final v4<?>[] f8163x0;
    public final String[] f8164y0;
    public final boolean f8165z0;

    public h20(Context context, o6 o6Var, v4<?>[] v4VarArr, String[] strArr, boolean z10) {
        super(context, o6Var);
        this.f8163x0 = v4VarArr;
        if (strArr == null || strArr.length == v4VarArr.length) {
            this.f8164y0 = strArr;
            this.f8165z0 = z10;
            return;
        }
        throw new IllegalArgumentException(strArr.length + " != " + v4VarArr.length);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public int L9() {
        return this.f8165z0 ? R.id.theme_color_filling : super.L9();
    }

    @Override
    public int O9() {
        return this.f8165z0 ? R.id.theme_color_headerLightIcon : super.O9();
    }

    @Override
    public int Q9() {
        return this.f8165z0 ? R.id.theme_color_text : super.Q9();
    }

    @Override
    public int R9() {
        return R.id.controller_simplePager;
    }

    @Override
    public boolean dc() {
        v4<?> bg = bg(0);
        return bg != null ? bg.dc() : super.dc();
    }

    @Override
    public int gg() {
        return this.f8163x0.length;
    }

    @Override
    public String[] hg() {
        String[] strArr = this.f8164y0;
        if (strArr != null) {
            return strArr;
        }
        int length = this.f8163x0.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr2[i10] = this.f8163x0[i10].X9().toString().toUpperCase();
        }
        return strArr2;
    }

    @Override
    public v4<?> mg(Context context, int i10) {
        return this.f8163x0[i10];
    }

    @Override
    public void ng(Context context, FrameLayoutFix frameLayoutFix, ViewPager viewPager) {
        y1 y1Var;
        if (this.f8165z0 && (y1Var = this.f24645v0) != null) {
            y1Var.getTopView().Z1(0, R.id.theme_color_text);
        }
        rg(0, new Runnable() {
            @Override
            public final void run() {
                h20.this.n9();
            }
        });
    }

    @Override
    public boolean wg() {
        return true;
    }

    @Override
    public long y9(boolean z10) {
        v4<?> bg = bg(0);
        return bg != null ? bg.y9(z10) : super.y9(z10);
    }
}
