package p028c1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class C1446d0 {
    public WeakReference<View> f5291a;
    public Runnable f5292b = null;
    public Runnable f5293c = null;
    public int f5294d = -1;

    public class C1447a extends AnimatorListenerAdapter {
        public final AbstractC1451e0 f5295a;
        public final View f5296b;

        public C1447a(AbstractC1451e0 e0Var, View view) {
            this.f5295a = e0Var;
            this.f5296b = view;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            this.f5295a.mo11616a(this.f5296b);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f5295a.mo11618b(this.f5296b);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            this.f5295a.mo11617c(this.f5296b);
        }
    }

    public class C1448b implements ValueAnimator.AnimatorUpdateListener {
        public final AbstractC1456g0 f5298a;
        public final View f5299b;

        public C1448b(AbstractC1456g0 g0Var, View view) {
            this.f5298a = g0Var;
            this.f5299b = view;
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f5298a.mo36880a(this.f5299b);
        }
    }

    public static class C1449c implements AbstractC1451e0 {
        public C1446d0 f5301a;
        public boolean f5302b;

        public C1449c(C1446d0 d0Var) {
            this.f5301a = d0Var;
        }

        @Override
        public void mo11616a(View view) {
            Object tag = view.getTag(2113929216);
            AbstractC1451e0 e0Var = tag instanceof AbstractC1451e0 ? (AbstractC1451e0) tag : null;
            if (e0Var != null) {
                e0Var.mo11616a(view);
            }
        }

        @Override
        @SuppressLint({"WrongConstant"})
        public void mo11618b(View view) {
            int i = this.f5301a.f5294d;
            AbstractC1451e0 e0Var = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f5301a.f5294d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f5302b) {
                C1446d0 d0Var = this.f5301a;
                Runnable runnable = d0Var.f5293c;
                if (runnable != null) {
                    d0Var.f5293c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof AbstractC1451e0) {
                    e0Var = (AbstractC1451e0) tag;
                }
                if (e0Var != null) {
                    e0Var.mo11618b(view);
                }
                this.f5302b = true;
            }
        }

        @Override
        public void mo11617c(View view) {
            this.f5302b = false;
            AbstractC1451e0 e0Var = null;
            if (this.f5301a.f5294d > -1) {
                view.setLayerType(2, null);
            }
            C1446d0 d0Var = this.f5301a;
            Runnable runnable = d0Var.f5292b;
            if (runnable != null) {
                d0Var.f5292b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof AbstractC1451e0) {
                e0Var = (AbstractC1451e0) tag;
            }
            if (e0Var != null) {
                e0Var.mo11617c(view);
            }
        }
    }

    public C1446d0(View view) {
        this.f5291a = new WeakReference<>(view);
    }

    public C1446d0 m36902a(float f) {
        View view = this.f5291a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void m36901b() {
        View view = this.f5291a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long m36900c() {
        View view = this.f5291a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C1446d0 m36899d(long j) {
        View view = this.f5291a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public C1446d0 m36898e(Interpolator interpolator) {
        View view = this.f5291a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C1446d0 m36897f(AbstractC1451e0 e0Var) {
        View view = this.f5291a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m36896g(view, e0Var);
            } else {
                view.setTag(2113929216, e0Var);
                m36896g(view, new C1449c(this));
            }
        }
        return this;
    }

    public final void m36896g(View view, AbstractC1451e0 e0Var) {
        if (e0Var != null) {
            view.animate().setListener(new C1447a(e0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C1446d0 m36895h(long j) {
        View view = this.f5291a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public C1446d0 m36894i(AbstractC1456g0 g0Var) {
        View view = this.f5291a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C1448b bVar = null;
            if (g0Var != null) {
                bVar = new C1448b(g0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void m36893j() {
        View view = this.f5291a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C1446d0 m36892k(float f) {
        View view = this.f5291a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public C1446d0 m36891l(float f) {
        View view = this.f5291a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
