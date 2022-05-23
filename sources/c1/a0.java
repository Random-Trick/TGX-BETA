package c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class a0 {
    public WeakReference<View> f4225a;
    public Runnable f4226b = null;
    public Runnable f4227c = null;
    public int f4228d = -1;

    public class a extends AnimatorListenerAdapter {
        public final b0 f4229a;
        public final View f4230b;

        public a(b0 b0Var, View view) {
            this.f4229a = b0Var;
            this.f4230b = view;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            this.f4229a.a(this.f4230b);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f4229a.b(this.f4230b);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            this.f4229a.c(this.f4230b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final d0 f4232a;
        public final View f4233b;

        public b(d0 d0Var, View view) {
            this.f4232a = d0Var;
            this.f4233b = view;
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f4232a.a(this.f4233b);
        }
    }

    public a0(View view) {
        this.f4225a = new WeakReference<>(view);
    }

    public a0 a(float f10) {
        View view = this.f4225a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void b() {
        View view = this.f4225a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.f4225a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public a0 d(long j10) {
        View view = this.f4225a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public a0 e(Interpolator interpolator) {
        View view = this.f4225a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public a0 f(b0 b0Var) {
        View view = this.f4225a.get();
        if (view != null) {
            g(view, b0Var);
        }
        return this;
    }

    public final void g(View view, b0 b0Var) {
        if (b0Var != null) {
            view.animate().setListener(new a(b0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public a0 h(long j10) {
        View view = this.f4225a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public a0 i(d0 d0Var) {
        View view = this.f4225a.get();
        if (view != null) {
            b bVar = null;
            if (d0Var != null) {
                bVar = new b(d0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void j() {
        View view = this.f4225a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public a0 k(float f10) {
        View view = this.f4225a.get();
        if (view != null) {
            view.animate().translationX(f10);
        }
        return this;
    }

    public a0 l(float f10) {
        View view = this.f4225a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
