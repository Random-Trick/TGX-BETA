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
    public boolean f25253M;
    public float f25254N;
    public boolean f25256P;
    public Paint f25260T;
    public long f25262a;
    public float f25263b;
    public float f25264c;
    public RectF f25255O = new RectF();
    public int f25261U = C1357a0.m37544i(40.0f);
    public int f25257Q = C11524j.m239H0();
    public DecelerateInterpolator f25258R = new DecelerateInterpolator();
    public AccelerateInterpolator f25259S = new AccelerateInterpolator();

    public C7847s(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f25260T = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f25260T.setStrokeCap(Paint.Cap.ROUND);
        this.f25260T.setStrokeWidth(C1357a0.m37544i(3.0f));
        this.f25260T.setColor(this.f25257Q);
    }

    public final void m14875a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f25262a;
        if (j > 17) {
            j = 17;
        }
        this.f25262a = currentTimeMillis;
        float f = this.f25263b + (((float) (360 * j)) / 2000.0f);
        this.f25263b = f;
        this.f25263b = f - (((int) (f / 360.0f)) * 360);
        float f2 = this.f25254N + ((float) j);
        this.f25254N = f2;
        if (f2 >= 500.0f) {
            this.f25254N = 500.0f;
        }
        if (this.f25253M) {
            this.f25264c = (this.f25259S.getInterpolation(this.f25254N / 500.0f) * 266.0f) + 4.0f;
        } else {
            this.f25264c = 4.0f - ((1.0f - this.f25258R.getInterpolation(this.f25254N / 500.0f)) * 270.0f);
        }
        if (this.f25254N == 500.0f) {
            boolean z = this.f25253M;
            if (z) {
                this.f25263b += 270.0f;
                this.f25264c = -266.0f;
            }
            this.f25253M = !z;
            this.f25254N = 0.0f;
        }
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = (getMeasuredWidth() - this.f25261U) / 2;
        int measuredHeight = getMeasuredHeight();
        int i = this.f25261U;
        int i2 = (measuredHeight - i) / 2;
        this.f25255O.set(measuredWidth, i2, measuredWidth + i, i2 + i);
        canvas.drawArc(this.f25255O, this.f25263b, this.f25264c, false, this.f25260T);
        m14875a();
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (this.f25256P) {
            Drawable background = getBackground();
            int i = (int) (f * 255.0f);
            if (background != null) {
                background.setAlpha(i);
            }
            this.f25260T.setAlpha(i);
        }
    }

    public void setProgressColor(int i) {
        this.f25257Q = i;
        this.f25260T.setColor(i);
    }

    public void setSize(int i) {
        this.f25261U = i;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f25260T.setStrokeWidth(C1357a0.m37544i(f));
    }

    public void setUseSelfAlpha(boolean z) {
        this.f25256P = z;
    }
}
