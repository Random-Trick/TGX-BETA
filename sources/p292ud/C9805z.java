package p292ud;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import be.C1399s0;

public class C9805z extends View {
    public View.OnClickListener f32075M;
    public int f32076a = -1;
    public int f32077b = -1;
    public float f32078c = -1.0f;

    public C9805z(Context context) {
        super(context);
    }

    public void m6830a(int i, int i2) {
        if (this.f32076a != i || this.f32077b != i2) {
            this.f32076a = i;
            this.f32077b = i2;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return C1399s0.m37221C(this) && (this.f32075M == null || super.onTouchEvent(motionEvent));
    }

    public void setFactor(float f) {
        if (this.f32078c != f) {
            this.f32078c = f;
            setAlpha(f);
        }
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f32075M = onClickListener;
    }
}
