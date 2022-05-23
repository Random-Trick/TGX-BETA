package db;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import eb.c;

public final class b {
    public static final AnticipateOvershootInterpolator f7286a = new AnticipateOvershootInterpolator();
    public static final DecelerateInterpolator f7287b = new DecelerateInterpolator();
    public static final AccelerateInterpolator f7288c = new AccelerateInterpolator();
    public static final DecelerateInterpolator f7289d = new DecelerateInterpolator(1.78f);
    public static final LinearInterpolator f7290e = new LinearInterpolator();
    public static final OvershootInterpolator f7291f = new OvershootInterpolator(3.2f);
    public static final AccelerateDecelerateInterpolator f7292g = new AccelerateDecelerateInterpolator();

    public class a implements View.OnLayoutChangeListener {
        public final View f7293a;
        public final Animator f7294b;

        public a(View view, Animator animator) {
            this.f7293a = view;
            this.f7294b = animator;
        }

        @Override
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f7293a.removeOnLayoutChangeListener(this);
            this.f7294b.start();
        }
    }

    public static float a(ValueAnimator valueAnimator) {
        return valueAnimator.getAnimatedFraction();
    }

    public static ValueAnimator b() {
        return ValueAnimator.ofFloat(0.0f, 1.0f);
    }

    public static void c(View view, Animator animator) {
        d(view, animator, false);
    }

    public static void d(View view, final Animator animator, boolean z10) {
        if (view == null) {
            throw new IllegalArgumentException("view must be not null");
        } else if (animator == null) {
            throw new IllegalArgumentException("animator must be not null");
        } else if (view.getMeasuredWidth() != 0 && view.getMeasuredHeight() != 0 && !z10) {
            animator.start();
        } else if (view instanceof c) {
            ((c) view).S(view, new Runnable() {
                @Override
                public final void run() {
                    animator.start();
                }
            });
        } else {
            view.addOnLayoutChangeListener(new a(view, animator));
        }
    }
}
