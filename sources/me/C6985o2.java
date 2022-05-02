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
    public int f22142M;
    public boolean f22143N;
    public Paint f22144a;
    public final C3940f f22145b;
    public final C3940f f22146c;

    public C6985o2(Context context) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f22145b = new C3940f(0, this, decelerateInterpolator, 192L, false);
        this.f22146c = new C3940f(1, this, decelerateInterpolator, 180L, true);
        Paint paint = new Paint(5);
        this.f22144a = paint;
        paint.setStrokeWidth(C1357a0.m37541i(2.0f));
        this.f22144a.setStyle(Paint.Style.STROKE);
    }

    public static C6985o2 m18177d(Context context) {
        return m18176e(context, C4403w.m27984G2());
    }

    public static C6985o2 m18176e(Context context, boolean z) {
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(C1357a0.m37541i(22.0f), C1357a0.m37541i(22.0f));
        s1.gravity = (z ? 3 : 5) | 16;
        int i = C1357a0.m37541i(18.0f);
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
        return this.f22145b.m29583h();
    }

    public void m18179b(boolean z, boolean z2) {
        this.f22146c.m29575p(z, z2);
    }

    public void m18178c(boolean z, boolean z2) {
        this.f22145b.m29575p(z, z2);
    }

    public boolean m18175f() {
        m18178c(!this.f22145b.m29583h(), true);
        return m18180a();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float measuredWidth = paddingLeft + (((getMeasuredWidth() - paddingLeft) - getPaddingRight()) / 2);
        float measuredHeight = paddingTop + (((getMeasuredHeight() - paddingTop) - getPaddingBottom()) / 2);
        float i = C1357a0.m37541i(9.0f);
        float i2 = C1357a0.m37541i(5.0f);
        int i3 = this.f22142M;
        if (i3 == 0) {
            i3 = R.id.theme_color_controlInactive;
        }
        int N = C11524j.m228N(i3);
        int d = C5064d.m24128d(N, (this.f22142M == 0 || !this.f22143N) ? C11524j.m235J0() : N, this.f22146c.m29584g());
        float g = this.f22145b.m29584g();
        if (g == 0.0f || g == 1.0f) {
            this.f22144a.setColor(C5064d.m24128d(N, d, g));
            canvas.drawCircle(measuredWidth, measuredHeight, i, this.f22144a);
        }
        float f = 1.0f - g;
        if (f == 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, i2, C1410y.m37039g(d));
        } else if (f != 1.0f) {
            float i4 = C1357a0.m37541i(4.0f);
            float f2 = i2 + i;
            float f3 = f * f2;
            float max = Math.max(0.0f, f3 - i4);
            int d2 = C5064d.m24128d(N, d, C2057b.f7280b.getInterpolation(1.0f - C5069h.m24089d(max / (f2 - i4))));
            canvas.drawCircle(measuredWidth, measuredHeight, i2 + Math.min(i4, f3), C1410y.m37039g(d2));
            canvas.drawCircle(measuredWidth, measuredHeight, max, C1410y.m37039g(C11524j.m148w()));
            this.f22144a.setColor(d2);
            canvas.drawCircle(measuredWidth, measuredHeight, i, this.f22144a);
        }
    }

    public void setApplyColor(boolean z) {
        if (this.f22143N != z) {
            this.f22143N = z;
            invalidate();
        }
    }

    public void setColorId(int i) {
        if (this.f22142M != i) {
            this.f22142M = i;
            invalidate();
        }
    }
}
