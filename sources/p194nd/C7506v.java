package p194nd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1410y;
import p335xd.C10192g;
import td.View$OnClickListenerC9170d1;

public class C7506v extends RecyclerView {
    public Path f24025u1 = null;
    public float f24026v1;

    public C7506v(Context context) {
        super(context);
    }

    public final void m15760G1() {
        if (this.f24025u1 != null) {
            int measuredWidth = getMeasuredWidth();
            int i = (measuredWidth - C1357a0.m37544i(78.0f)) + C1357a0.m37544i(15.0f);
            int i2 = C1357a0.m37544i(26.0f) + View$OnClickListenerC9170d1.getTopOffset() + C1357a0.m37544i(15.0f);
            int i3 = C1357a0.m37544i(15.0f);
            float f = this.f24026v1;
            int i4 = i + ((int) ((measuredWidth - i) * f));
            int i5 = i2 - ((int) (i2 * f));
            int i6 = ((int) ((measuredWidth - i3) * f)) + i3;
            float f2 = this.f24026v1;
            int measuredHeight = ((int) ((getMeasuredHeight() - i3) * f2)) + i3;
            float f3 = i3 * (1.0f - f2);
            RectF a0 = C1410y.m37053a0();
            int i7 = i6 / 2;
            int i8 = measuredHeight / 2;
            a0.set(i4 - i7, i5 - i8, i4 + i7, i5 + i8);
            this.f24025u1.reset();
            this.f24025u1.addRoundRect(a0, f3, f3, Path.Direction.CCW);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        boolean z = this.f24026v1 < 1.0f;
        int b = z ? C10192g.m5789b(canvas, this.f24025u1) : Integer.MIN_VALUE;
        super.draw(canvas);
        if (z) {
            C10192g.m5785f(canvas, b);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (Build.VERSION.SDK_INT >= 19 && this.f24025u1 != null) {
            m15760G1();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setFactor(float f) {
        if (Build.VERSION.SDK_INT < 19 || this.f24025u1 == null) {
            setAlpha(f);
        } else if (this.f24026v1 != f) {
            this.f24026v1 = f;
            m15760G1();
            invalidate();
        }
    }
}
