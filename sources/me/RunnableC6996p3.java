package me;

import android.content.Context;
import android.os.Build;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import be.C1356a;
import be.C1399s0;
import org.thunderdog.challegram.Log;
import p037cb.C2057b;

public class RunnableC6996p3 extends ImageView implements Runnable {
    public boolean f22188a;
    public RotateAnimation f22189b;

    public RunnableC6996p3(Context context) {
        super(context);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public void m18134a() {
        if (!this.f22188a && getVisibility() != 8) {
            this.f22188a = true;
            if (!C1356a.f4950a || Build.VERSION.SDK_INT < 14) {
                m18132c();
            } else {
                m18133b();
            }
        }
    }

    public final void m18133b() {
        try {
            C1399s0.m37203U(this, -360000.0f, 1000000L, C2057b.f7283e, null);
        } catch (Throwable th) {
            Log.m14725e("Cannot animate SpinnerView, applying simple Animation", th, new Object[0]);
            m18132c();
        }
    }

    public final void m18132c() {
        try {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -360.0f, 1, 0.5f, 1, 0.5f);
            this.f22189b = rotateAnimation;
            rotateAnimation.setDuration(1000L);
            this.f22189b.setRepeatCount(-1);
            this.f22189b.setInterpolator(C2057b.f7283e);
            this.f22189b.setFillAfter(true);
            startAnimation(this.f22189b);
        } catch (Throwable th) {
            Log.m14725e("Cannot start simple animation on SpinnerView", th, new Object[0]);
        }
    }

    public void m18131d() {
        if (this.f22188a) {
            this.f22188a = false;
            if (!C1356a.f4950a || Build.VERSION.SDK_INT < 14) {
                m18129f();
            } else {
                m18130e();
            }
        }
    }

    public final void m18130e() {
        try {
            C1399s0.m37171n(this);
        } catch (Throwable th) {
            Log.m14725e("Cannot cancel pending animator on SpinnerView", th, new Object[0]);
        }
    }

    public final void m18129f() {
        if (this.f22189b != null) {
            try {
                clearAnimation();
                this.f22189b.cancel();
                this.f22189b = null;
            } catch (Throwable th) {
                Log.m14725e("Cannot cancel simple animation in SpinnerView", th, new Object[0]);
            }
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        postDelayed(this, 200L);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m18131d();
    }

    @Override
    public void run() {
        m18134a();
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            m18131d();
        } else if (i == 0) {
            m18134a();
        }
    }
}
