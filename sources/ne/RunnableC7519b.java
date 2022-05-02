package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import p037cb.C2057b;
import p108hb.C5064d;
import p108hb.C5069h;

public class RunnableC7519b extends View implements Runnable {
    public boolean f24053a;

    public RunnableC7519b(Context context) {
        super(context);
    }

    private void setIsLooping(boolean z) {
        if (this.f24053a != z) {
            this.f24053a = z;
            if (z) {
                postDelayed(this, 18L);
            } else {
                removeCallbacks(this);
            }
        }
    }

    public final void m15742a() {
        setIsLooping(getVisibility() == 0 && getAlpha() > 0.0f && getMeasuredWidth() != 0 && getMeasuredHeight() != 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        long elapsedRealtime = SystemClock.elapsedRealtime() % 1200;
        float interpolation = elapsedRealtime <= 300 ? 0.0f : C2057b.f7280b.getInterpolation(((float) (elapsedRealtime - 300)) / 900.0f);
        int i = C1357a0.m37544i(22.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        float f = (interpolation * 8.0f) - 2.0f;
        for (int i2 = 0; i2 < 3; i2++) {
            int b = C5064d.m24131b((int) (((0.6f * (1.0f - C5069h.m24090d(Math.abs((f - i2) - 1.0f) / 3.0f))) + 0.4f) * 255.0f), 16777215);
            float f2 = measuredHeight;
            C1359b.m37509m(canvas, i, f2, b, true);
            C1359b.m37509m(canvas, getMeasuredWidth() - i, f2, b, false);
            i += C1357a0.m37544i(16.0f);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m15742a();
    }

    @Override
    public void run() {
        invalidate();
        if (this.f24053a) {
            postDelayed(this, 18L);
        }
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        m15742a();
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        m15742a();
    }
}
