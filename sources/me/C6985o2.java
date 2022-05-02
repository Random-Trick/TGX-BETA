package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1410y;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5069h;
import p364zd.C11524j;

public class C6985o2 extends View implements C3950k.AbstractC3952b {
    public int f22145M;
    public boolean f22146N;
    public Paint f22147a;
    public final C3940f f22148b;
    public final C3940f f22149c;

    public C6985o2(Context context) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f22148b = new C3940f(0, this, decelerateInterpolator, 192L, false);
        this.f22149c = new C3940f(1, this, decelerateInterpolator, 180L, true);
        Paint paint = new Paint(5);
        this.f22147a = paint;
        paint.setStrokeWidth(C1357a0.m37544i(2.0f));
        this.f22147a.setStyle(Paint.Style.STROKE);
    }

    public static C6985o2 m18177d(Context context) {
        return m18176e(context, C4403w.m27986G2());
    }

    public static C6985o2 m18176e(Context context, boolean z) {
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(C1357a0.m37544i(22.0f), C1357a0.m37544i(22.0f));
        s1.gravity = (z ? 3 : 5) | 16;
        int i = C1357a0.m37544i(18.0f);
        s1.leftMargin = i;
        s1.rightMargin = i;
        C6985o2 o2Var = new C6985o2(context);
        o2Var.setLayoutParams(s1);
        return o2Var;
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        invalidate();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        invalidate();
    }

    public boolean m18180a() {
        return this.f22148b.m29585h();
    }

    public void m18179b(boolean z, boolean z2) {
        this.f22149c.m29577p(z, z2);
    }

    public void m18178c(boolean z, boolean z2) {
        this.f22148b.m29577p(z, z2);
    }

    public boolean m18175f() {
        m18178c(!this.f22148b.m29585h(), true);
        return m18180a();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float measuredWidth = paddingLeft + (((getMeasuredWidth() - paddingLeft) - getPaddingRight()) / 2);
        float measuredHeight = paddingTop + (((getMeasuredHeight() - paddingTop) - getPaddingBottom()) / 2);
        float i = C1357a0.m37544i(9.0f);
        float i2 = C1357a0.m37544i(5.0f);
        int i3 = this.f22145M;
        if (i3 == 0) {
            i3 = R.id.theme_color_controlInactive;
        }
        int N = C11524j.m228N(i3);
        int d = C5064d.m24129d(N, (this.f22145M == 0 || !this.f22146N) ? C11524j.m235J0() : N, this.f22149c.m29586g());
        float g = this.f22148b.m29586g();
        if (g == 0.0f || g == 1.0f) {
            this.f22147a.setColor(C5064d.m24129d(N, d, g));
            canvas.drawCircle(measuredWidth, measuredHeight, i, this.f22147a);
        }
        float f = 1.0f - g;
        if (f == 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, i2, C1410y.m37042g(d));
        } else if (f != 1.0f) {
            float i4 = C1357a0.m37544i(4.0f);
            float f2 = i2 + i;
            float f3 = f * f2;
            float max = Math.max(0.0f, f3 - i4);
            int d2 = C5064d.m24129d(N, d, C2057b.f7280b.getInterpolation(1.0f - C5069h.m24090d(max / (f2 - i4))));
            canvas.drawCircle(measuredWidth, measuredHeight, i2 + Math.min(i4, f3), C1410y.m37042g(d2));
            canvas.drawCircle(measuredWidth, measuredHeight, max, C1410y.m37042g(C11524j.m148w()));
            this.f22147a.setColor(d2);
            canvas.drawCircle(measuredWidth, measuredHeight, i, this.f22147a);
        }
    }

    public void setApplyColor(boolean z) {
        if (this.f22146N != z) {
            this.f22146N = z;
            invalidate();
        }
    }

    public void setColorId(int i) {
        if (this.f22145M != i) {
            this.f22145M = i;
            invalidate();
        }
    }
}
