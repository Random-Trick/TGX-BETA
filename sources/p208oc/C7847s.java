package p208oc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import be.C1357a0;
import p364zd.C11524j;

public class C7847s extends View {
    public boolean f25250M;
    public float f25251N;
    public boolean f25253P;
    public Paint f25257T;
    public long f25259a;
    public float f25260b;
    public float f25261c;
    public RectF f25252O = new RectF();
    public int f25258U = C1357a0.m37541i(40.0f);
    public int f25254Q = C11524j.m239H0();
    public DecelerateInterpolator f25255R = new DecelerateInterpolator();
    public AccelerateInterpolator f25256S = new AccelerateInterpolator();

    public C7847s(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f25257T = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f25257T.setStrokeCap(Paint.Cap.ROUND);
        this.f25257T.setStrokeWidth(C1357a0.m37541i(3.0f));
        this.f25257T.setColor(this.f25254Q);
    }

    public final void m14875a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f25259a;
        if (j > 17) {
            j = 17;
        }
        this.f25259a = currentTimeMillis;
        float f = this.f25260b + (((float) (360 * j)) / 2000.0f);
        this.f25260b = f;
        this.f25260b = f - (((int) (f / 360.0f)) * 360);
        float f2 = this.f25251N + ((float) j);
        this.f25251N = f2;
        if (f2 >= 500.0f) {
            this.f25251N = 500.0f;
        }
        if (this.f25250M) {
            this.f25261c = (this.f25256S.getInterpolation(this.f25251N / 500.0f) * 266.0f) + 4.0f;
        } else {
            this.f25261c = 4.0f - ((1.0f - this.f25255R.getInterpolation(this.f25251N / 500.0f)) * 270.0f);
        }
        if (this.f25251N == 500.0f) {
            boolean z = this.f25250M;
            if (z) {
                this.f25260b += 270.0f;
                this.f25261c = -266.0f;
            }
            this.f25250M = !z;
            this.f25251N = 0.0f;
        }
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = (getMeasuredWidth() - this.f25258U) / 2;
        int measuredHeight = getMeasuredHeight();
        int i = this.f25258U;
        int i2 = (measuredHeight - i) / 2;
        this.f25252O.set(measuredWidth, i2, measuredWidth + i, i2 + i);
        canvas.drawArc(this.f25252O, this.f25260b, this.f25261c, false, this.f25257T);
        m14875a();
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (this.f25253P) {
            Drawable background = getBackground();
            int i = (int) (f * 255.0f);
            if (background != null) {
                background.setAlpha(i);
            }
            this.f25257T.setAlpha(i);
        }
    }

    public void setProgressColor(int i) {
        this.f25254Q = i;
        this.f25257T.setColor(i);
    }

    public void setSize(int i) {
        this.f25258U = i;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f25257T.setStrokeWidth(C1357a0.m37541i(f));
    }

    public void setUseSelfAlpha(boolean z) {
        this.f25253P = z;
    }
}
