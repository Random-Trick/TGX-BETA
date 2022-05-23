package od;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import ce.a0;
import ce.p0;
import ce.y;
import fd.a;
import org.thunderdog.challegram.R;
import ud.r;

public class h extends r {
    public Path f19515m0 = new Path();
    public float f19516n0;
    public float f19517o0;

    public h(Context context) {
        super(context);
        v(14.0f, R.id.theme_color_white, a0.i(16.0f), 0, a0.i(9.0f) + a0.i(10.0f));
        if (a.f11882d) {
            p0.Y(this, 2);
        }
    }

    @Override
    public boolean C() {
        return true;
    }

    @Override
    public void D(Canvas canvas) {
        canvas.restore();
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12 = getLayoutParams().height;
        setMeasuredDimension(this.f24388a + i12, i11);
        setPivotX(getMeasuredWidth() - (i12 / 2));
        setPivotY(getMeasuredHeight() / 2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return p0.z(this) && super.onTouchEvent(motionEvent);
    }

    @Override
    public void s(Canvas canvas, int i10, int i11) {
        int i12;
        canvas.save();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF a02 = y.a0();
        float i13 = a0.i(2.0f);
        float f10 = i13 / 2.0f;
        float f11 = (((measuredWidth - i12) - i12) - (i11 / 2)) + f10;
        float f12 = measuredWidth - f10;
        a02.set(f11, f10, f12, measuredHeight - f10);
        float f13 = measuredHeight / 2;
        canvas.drawRoundRect(a02, f13, f13, y.g(-1610612736));
        canvas.drawRoundRect(a02, f13, f13, y.Y(-1, i13));
        Path path = this.f19515m0;
        if (path != null) {
            if (!(this.f19516n0 == f11 && this.f19517o0 == f12)) {
                this.f19516n0 = f11;
                this.f19517o0 = f12;
                path.reset();
                this.f19515m0.addRoundRect(a02, f13, f13, Path.Direction.CCW);
            }
            try {
                canvas.clipPath(this.f19515m0);
            } catch (Throwable unused) {
            }
        }
        canvas.translate((((int) (f11 + f12)) / 2) - (i10 / 2), 0.0f);
    }
}
