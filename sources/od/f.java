package od;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ce.a0;
import ce.p0;
import ce.y;
import db.b;
import eb.k;

public class f extends View implements k.b {
    public static Paint N;
    public k M;
    public int f19507a;
    public boolean f19508b;
    public float f19509c;

    public f(Context context) {
        super(context);
        if (N == null) {
            Paint paint = new Paint(5);
            N = paint;
            paint.setStrokeWidth(a0.i(2.0f));
            N.setStyle(Paint.Style.STROKE);
        }
        p0.T(this);
    }

    private void setFactor(float f10) {
        if (this.f19509c != f10) {
            this.f19509c = f10;
            invalidate();
        }
    }

    public final void a(float f10) {
        if (this.M == null) {
            float f11 = this.f19509c;
            if (f11 != f10) {
                this.M = new k(0, this, b.f7287b, 180L, f11);
            } else {
                return;
            }
        }
        this.M.i(f10);
    }

    public final void b(float f10) {
        k kVar = this.M;
        if (kVar != null) {
            kVar.l(f10);
        }
        setFactor(f10);
    }

    public void c(boolean z10, boolean z11) {
        if (this.f19508b != z10) {
            this.f19508b = z10;
            float f10 = 1.0f;
            if (z11) {
                if (!z10) {
                    f10 = 0.0f;
                }
                a(f10);
                return;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            b(f10);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        setFactor(f10);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10 = a0.i(10.0f);
        int i11 = a0.i(5.0f);
        int i12 = a0.i(8.0f);
        int L = j.L(this.f19507a);
        N.setColor(L);
        float measuredWidth = getMeasuredWidth() / 2;
        float measuredHeight = getMeasuredHeight() / 2;
        canvas.drawCircle(measuredWidth, measuredHeight, i10 - (N.getStrokeWidth() / 2.0f), N);
        float f10 = 1.0f;
        float f11 = 1.0f - this.f19509c;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
        }
        float f12 = f11 > 0.5f ? (f11 - 0.5f) / 0.5f : 0.0f;
        canvas.drawCircle(measuredWidth, measuredHeight, i11 + ((i10 - i11) * f10), y.g(L));
        if (f12 > 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, (int) (i12 * f12), y.g(-16777216));
        }
    }

    public void setColorId(int i10) {
        this.f19507a = i10;
    }
}
