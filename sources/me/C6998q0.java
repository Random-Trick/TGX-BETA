package me;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import be.C1357a0;
import be.C1399s0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2065g;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C6998q0 extends FrameLayoutFix {
    public final ImageView f22187M;
    public final C6992p0 f22188N;

    public C6998q0(Context context) {
        super(context);
        int i = C1357a0.m37541i(56.0f);
        ImageView imageView = new ImageView(context);
        this.f22187M = imageView;
        C6992p0 p0Var = new C6992p0(context);
        this.f22188N = p0Var;
        p0Var.m18144e(true);
        p0Var.setLayoutParams(FrameLayoutFix.m18006u1(-1, C1357a0.m37541i(72.0f), 0, i, 0, 0, 0));
        imageView.setLayoutParams(FrameLayoutFix.m18008s1(i, C1357a0.m37541i(72.0f)));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(C11524j.m228N(R.id.theme_color_icon));
        addView(imageView);
        addView(p0Var);
        setBackgroundColor(C11524j.m148w());
    }

    public void m18127C1(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            this.f22188N.m18148a(v4Var);
            v4Var.m9197o8(this, R.id.theme_color_filling);
            v4Var.m9184q8(this.f22187M, R.id.theme_color_icon);
        }
    }

    public ImageView m18126D1() {
        return this.f22187M;
    }

    public C6992p0 m18125E1() {
        return this.f22188N;
    }

    public void m18124b() {
        this.f22188N.m18145d();
    }

    public void m18123f() {
        this.f22188N.m18147b();
    }

    public void m18122s() {
        this.f22188N.mo8255s();
    }

    public void setIconClickListener(View.OnClickListener onClickListener) {
        C1399s0.m37193a0(this.f22187M);
        C2065g.m35718d(this.f22187M, C11524j.m182g1());
        this.f22187M.setOnClickListener(onClickListener);
    }

    public void setTextClickListener(View.OnClickListener onClickListener) {
        C1399s0.m37193a0(this.f22188N);
        C2065g.m35718d(this.f22188N, C11524j.m182g1());
        this.f22188N.setOnClickListener(onClickListener);
    }
}
