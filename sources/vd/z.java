package vd;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import ce.p0;

public class z extends View {
    public View.OnClickListener M;
    public int f25674a = -1;
    public int f25675b = -1;
    public float f25676c = -1.0f;

    public z(Context context) {
        super(context);
    }

    public void a(int i10, int i11) {
        if (this.f25674a != i10 || this.f25675b != i11) {
            this.f25674a = i10;
            this.f25675b = i11;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return p0.z(this) && (this.M == null || super.onTouchEvent(motionEvent));
    }

    public void setFactor(float f10) {
        if (this.f25676c != f10) {
            this.f25676c = f10;
            setAlpha(f10);
        }
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.M = onClickListener;
    }
}
