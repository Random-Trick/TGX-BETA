package od;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.y;
import ud.d1;
import yd.g;

public class v extends RecyclerView {
    public Path f19871t1 = null;
    public float f19872u1;

    public v(Context context) {
        super(context);
    }

    public final void F1() {
        if (this.f19871t1 != null) {
            int measuredWidth = getMeasuredWidth();
            int i10 = (measuredWidth - a0.i(78.0f)) + a0.i(15.0f);
            int i11 = a0.i(26.0f) + d1.getTopOffset() + a0.i(15.0f);
            int i12 = a0.i(15.0f);
            float f10 = this.f19872u1;
            int i13 = i10 + ((int) ((measuredWidth - i10) * f10));
            int i14 = i11 - ((int) (i11 * f10));
            int i15 = ((int) ((measuredWidth - i12) * f10)) + i12;
            float f11 = this.f19872u1;
            int measuredHeight = ((int) ((getMeasuredHeight() - i12) * f11)) + i12;
            float f12 = i12 * (1.0f - f11);
            RectF a02 = y.a0();
            int i16 = i15 / 2;
            int i17 = measuredHeight / 2;
            a02.set(i13 - i16, i14 - i17, i13 + i16, i14 + i17);
            this.f19871t1.reset();
            this.f19871t1.addRoundRect(a02, f12, f12, Path.Direction.CCW);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        boolean z10 = this.f19872u1 < 1.0f;
        int b10 = z10 ? g.b(canvas, this.f19871t1) : Integer.MIN_VALUE;
        super.draw(canvas);
        if (z10) {
            g.f(canvas, b10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f19871t1 != null) {
            F1();
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

    public void setFactor(float f10) {
        if (this.f19871t1 == null) {
            setAlpha(f10);
        } else if (this.f19872u1 != f10) {
            this.f19872u1 = f10;
            F1();
            invalidate();
        }
    }
}
