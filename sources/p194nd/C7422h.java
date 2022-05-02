package p194nd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import be.C1357a0;
import be.C1399s0;
import be.C1410y;
import org.thunderdog.challegram.R;
import p067ed.C4183a;
import td.C9279r;

public class C7422h extends C9279r {
    public Path f23428m0;
    public float f23429n0;
    public float f23430o0;

    public C7422h(Context context) {
        super(context);
        this.f23428m0 = Build.VERSION.SDK_INT >= 19 ? new Path() : null;
        m9654v(14.0f, R.id.theme_color_white, C1357a0.m37541i(16.0f), 0, C1357a0.m37541i(9.0f) + C1357a0.m37541i(10.0f));
        if (C4183a.f14086d) {
            C1399s0.m37183f0(this, 2);
        }
    }

    @Override
    public boolean mo9681C() {
        return true;
    }

    @Override
    public void mo9680D(Canvas canvas) {
        canvas.restore();
    }

    @Override
    public boolean mo9667i() {
        return false;
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3 = getLayoutParams().height;
        setMeasuredDimension(this.f30003a + i3, i2);
        setPivotX(getMeasuredWidth() - (i3 / 2));
        setPivotY(getMeasuredHeight() / 2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return C1399s0.m37218C(this) && super.onTouchEvent(motionEvent);
    }

    @Override
    public void mo9657s(Canvas canvas, int i, int i2) {
        int i3;
        Path path;
        canvas.save();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF a0 = C1410y.m37050a0();
        float i4 = C1357a0.m37541i(2.0f);
        float f = i4 / 2.0f;
        float f2 = (((measuredWidth - i3) - i3) - (i2 / 2)) + f;
        float f3 = measuredWidth - f;
        a0.set(f2, f, f3, measuredHeight - f);
        float f4 = measuredHeight / 2;
        canvas.drawRoundRect(a0, f4, f4, C1410y.m37039g(-1610612736));
        canvas.drawRoundRect(a0, f4, f4, C1410y.m37053Y(-1, i4));
        if (Build.VERSION.SDK_INT >= 19 && (path = this.f23428m0) != null) {
            if (!(this.f23429n0 == f2 && this.f23430o0 == f3)) {
                this.f23429n0 = f2;
                this.f23430o0 = f3;
                path.reset();
                this.f23428m0.addRoundRect(a0, f4, f4, Path.Direction.CCW);
            }
            try {
                canvas.clipPath(this.f23428m0);
            } catch (Throwable unused) {
            }
        }
        canvas.translate((((int) (f2 + f3)) / 2) - (i / 2), 0.0f);
    }
}
