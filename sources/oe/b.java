package oe;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.View;
import ce.a0;
import ib.d;
import ib.h;

public class b extends View implements Runnable {
    public boolean f19886a;

    public b(Context context) {
        super(context);
    }

    private void setIsLooping(boolean z10) {
        if (this.f19886a != z10) {
            this.f19886a = z10;
            if (z10) {
                postDelayed(this, 18L);
            } else {
                removeCallbacks(this);
            }
        }
    }

    public final void a() {
        setIsLooping(getVisibility() == 0 && getAlpha() > 0.0f && getMeasuredWidth() != 0 && getMeasuredHeight() != 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        long elapsedRealtime = SystemClock.elapsedRealtime() % 1200;
        float interpolation = elapsedRealtime <= 300 ? 0.0f : db.b.f7287b.getInterpolation(((float) (elapsedRealtime - 300)) / 900.0f);
        int i10 = a0.i(22.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        float f10 = (interpolation * 8.0f) - 2.0f;
        for (int i11 = 0; i11 < 3; i11++) {
            int b10 = d.b((int) (((0.6f * (1.0f - h.d(Math.abs((f10 - i11) - 1.0f) / 3.0f))) + 0.4f) * 255.0f), 16777215);
            float f11 = measuredHeight;
            ce.b.m(canvas, i10, f11, b10, true);
            ce.b.m(canvas, getMeasuredWidth() - i10, f11, b10, false);
            i10 += a0.i(16.0f);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a();
    }

    @Override
    public void run() {
        invalidate();
        if (this.f19886a) {
            postDelayed(this, 18L);
        }
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        a();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        a();
    }
}
