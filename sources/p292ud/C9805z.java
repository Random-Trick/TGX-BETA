package p292ud;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import be.C1399s0;

public class C9805z extends View {
    public View.OnClickListener f32072M;
    public int f32073a = -1;
    public int f32074b = -1;
    public float f32075c = -1.0f;

    public C9805z(Context context) {
        super(context);
    }

    public void m6830a(int i, int i2) {
        if (this.f32073a != i || this.f32074b != i2) {
            this.f32073a = i;
            this.f32074b = i2;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return C1399s0.m37218C(this) && (this.f32072M == null || super.onTouchEvent(motionEvent));
    }

    public void setFactor(float f) {
        if (this.f32075c != f) {
            this.f32075c = f;
            setAlpha(f);
        }
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f32072M = onClickListener;
    }
}
