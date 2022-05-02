package p037cb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import p051db.AbstractC3937c;

public final class C2057b {
    public static final AnticipateOvershootInterpolator f7279a = new AnticipateOvershootInterpolator();
    public static final DecelerateInterpolator f7280b = new DecelerateInterpolator();
    public static final AccelerateInterpolator f7281c = new AccelerateInterpolator();
    public static final DecelerateInterpolator f7282d = new DecelerateInterpolator(1.78f);
    public static final LinearInterpolator f7283e = new LinearInterpolator();
    public static final OvershootInterpolator f7284f = new OvershootInterpolator(3.2f);
    public static final AccelerateDecelerateInterpolator f7285g = new AccelerateDecelerateInterpolator();

    public class View$OnLayoutChangeListenerC2058a implements View.OnLayoutChangeListener {
        public final View f7286a;
        public final Animator f7287b;

        public View$OnLayoutChangeListenerC2058a(View view, Animator animator) {
            this.f7286a = view;
            this.f7287b = animator;
        }

        @Override
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f7286a.removeOnLayoutChangeListener(this);
            this.f7287b.start();
        }
    }

    public static float m35738a(ValueAnimator valueAnimator) {
        if (Build.VERSION.SDK_INT >= 12) {
            return valueAnimator.getAnimatedFraction();
        }
        return ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static ValueAnimator m35737b() {
        return ValueAnimator.ofFloat(0.0f, 1.0f);
    }

    public static void m35736c(View view, Animator animator) {
        m35735d(view, animator, false);
    }

    public static void m35735d(View view, final Animator animator, boolean z) {
        if (view == null) {
            throw new IllegalArgumentException("view must be not null");
        } else if (animator == null) {
            throw new IllegalArgumentException("animator must be not null");
        } else if (view.getMeasuredWidth() != 0 && view.getMeasuredHeight() != 0 && !z) {
            animator.start();
        } else if (view instanceof AbstractC3937c) {
            ((AbstractC3937c) view).mo8061R(view, new Runnable() {
                @Override
                public final void run() {
                    animator.start();
                }
            });
        } else {
            view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC2058a(view, animator));
        }
    }
}
