package pc;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import ce.a0;

public class s extends View {
    public boolean M;
    public float N;
    public boolean P;
    public Paint T;
    public long f21143a;
    public float f21144b;
    public float f21145c;
    public RectF O = new RectF();
    public int U = a0.i(40.0f);
    public int Q = j.F0();
    public DecelerateInterpolator R = new DecelerateInterpolator();
    public AccelerateInterpolator S = new AccelerateInterpolator();

    public s(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.T = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.T.setStrokeCap(Paint.Cap.ROUND);
        this.T.setStrokeWidth(a0.i(3.0f));
        this.T.setColor(this.Q);
    }

    public final void a() {
        float f10;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f21143a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f21143a = currentTimeMillis;
        this.f21144b = (this.f21144b + (((float) (360 * j10)) / 2000.0f)) - (((int) (f10 / 360.0f)) * 360);
        float f11 = this.N + ((float) j10);
        this.N = f11;
        if (f11 >= 500.0f) {
            this.N = 500.0f;
        }
        if (this.M) {
            this.f21145c = (this.S.getInterpolation(this.N / 500.0f) * 266.0f) + 4.0f;
        } else {
            this.f21145c = 4.0f - ((1.0f - this.R.getInterpolation(this.N / 500.0f)) * 270.0f);
        }
        if (this.N == 500.0f) {
            boolean z10 = this.M;
            if (z10) {
                this.f21144b += 270.0f;
                this.f21145c = -266.0f;
            }
            this.M = !z10;
            this.N = 0.0f;
        }
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = (getMeasuredWidth() - this.U) / 2;
        int measuredHeight = getMeasuredHeight();
        int i10 = this.U;
        int i11 = (measuredHeight - i10) / 2;
        this.O.set(measuredWidth, i11, measuredWidth + i10, i11 + i10);
        canvas.drawArc(this.O, this.f21144b, this.f21145c, false, this.T);
        a();
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (this.P) {
            Drawable background = getBackground();
            int i10 = (int) (f10 * 255.0f);
            if (background != null) {
                background.setAlpha(i10);
            }
            this.T.setAlpha(i10);
        }
    }

    public void setProgressColor(int i10) {
        this.Q = i10;
        this.T.setColor(i10);
    }

    public void setSize(int i10) {
        this.U = i10;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.T.setStrokeWidth(a0.i(f10));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.P = z10;
    }
}
