package c1;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f4288a;
    public ViewTreeObserver f4289b;
    public final Runnable f4290c;

    public s(View view, Runnable runnable) {
        this.f4288a = view;
        this.f4289b = view.getViewTreeObserver();
        this.f4290c = runnable;
    }

    public static s a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        s sVar = new s(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(sVar);
        view.addOnAttachStateChangeListener(sVar);
        return sVar;
    }

    public void b() {
        if (this.f4289b.isAlive()) {
            this.f4289b.removeOnPreDrawListener(this);
        } else {
            this.f4288a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f4288a.removeOnAttachStateChangeListener(this);
    }

    @Override
    public boolean onPreDraw() {
        b();
        this.f4290c.run();
        return true;
    }

    @Override
    public void onViewAttachedToWindow(View view) {
        this.f4289b = view.getViewTreeObserver();
    }

    @Override
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
