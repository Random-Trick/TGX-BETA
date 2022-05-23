package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import ce.a0;
import ce.y;
import db.b;
import eb.f;
import eb.k;
import gd.w;
import ib.d;
import ib.h;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;

public class o2 extends View implements k.b {
    public int M;
    public boolean N;
    public Paint f18300a;
    public final f f18301b;
    public final f f18302c;

    public o2(Context context) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = b.f7287b;
        this.f18301b = new f(0, this, decelerateInterpolator, 192L, false);
        this.f18302c = new f(1, this, decelerateInterpolator, 180L, true);
        Paint paint = new Paint(5);
        this.f18300a = paint;
        paint.setStrokeWidth(a0.i(2.0f));
        this.f18300a.setStyle(Paint.Style.STROKE);
    }

    public static o2 d(Context context) {
        return e(context, w.G2());
    }

    public static o2 e(Context context, boolean z10) {
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(a0.i(22.0f), a0.i(22.0f));
        q12.gravity = (z10 ? 3 : 5) | 16;
        int i10 = a0.i(18.0f);
        q12.leftMargin = i10;
        q12.rightMargin = i10;
        o2 o2Var = new o2(context);
        o2Var.setLayoutParams(q12);
        return o2Var;
    }

    public boolean a() {
        return this.f18301b.h();
    }

    public void b(boolean z10, boolean z11) {
        this.f18302c.p(z10, z11);
    }

    public void c(boolean z10, boolean z11) {
        this.f18301b.p(z10, z11);
    }

    public boolean f() {
        c(!this.f18301b.h(), true);
        return a();
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        invalidate();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float measuredWidth = paddingLeft + (((getMeasuredWidth() - paddingLeft) - getPaddingRight()) / 2);
        float measuredHeight = paddingTop + (((getMeasuredHeight() - paddingTop) - getPaddingBottom()) / 2);
        float i10 = a0.i(9.0f);
        float i11 = a0.i(5.0f);
        int i12 = this.M;
        if (i12 == 0) {
            i12 = R.id.theme_color_controlInactive;
        }
        int L = j.L(i12);
        int d10 = d.d(L, (this.M == 0 || !this.N) ? j.H0() : L, this.f18302c.g());
        float g10 = this.f18301b.g();
        if (g10 == 0.0f || g10 == 1.0f) {
            this.f18300a.setColor(d.d(L, d10, g10));
            canvas.drawCircle(measuredWidth, measuredHeight, i10, this.f18300a);
        }
        float f10 = 1.0f - g10;
        if (f10 == 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, i11, y.g(d10));
        } else if (f10 != 1.0f) {
            float i13 = a0.i(4.0f);
            float f11 = i11 + i10;
            float f12 = f10 * f11;
            float max = Math.max(0.0f, f12 - i13);
            int d11 = d.d(L, d10, b.f7287b.getInterpolation(1.0f - h.d(max / (f11 - i13))));
            canvas.drawCircle(measuredWidth, measuredHeight, i11 + Math.min(i13, f12), y.g(d11));
            canvas.drawCircle(measuredWidth, measuredHeight, max, y.g(j.u()));
            this.f18300a.setColor(d11);
            canvas.drawCircle(measuredWidth, measuredHeight, i10, this.f18300a);
        }
    }

    public void setApplyColor(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
            invalidate();
        }
    }

    public void setColorId(int i10) {
        if (this.M != i10) {
            this.M = i10;
            invalidate();
        }
    }
}
