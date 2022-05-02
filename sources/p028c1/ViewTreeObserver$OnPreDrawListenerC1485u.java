package p028c1;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

public final class ViewTreeObserver$OnPreDrawListenerC1485u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View f5352a;
    public ViewTreeObserver f5353b;
    public final Runnable f5354c;

    public ViewTreeObserver$OnPreDrawListenerC1485u(View view, Runnable runnable) {
        this.f5352a = view;
        this.f5353b = view.getViewTreeObserver();
        this.f5354c = runnable;
    }

    public static ViewTreeObserver$OnPreDrawListenerC1485u m36776a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        ViewTreeObserver$OnPreDrawListenerC1485u uVar = new ViewTreeObserver$OnPreDrawListenerC1485u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(uVar);
        view.addOnAttachStateChangeListener(uVar);
        return uVar;
    }

    public void m36775b() {
        if (this.f5353b.isAlive()) {
            this.f5353b.removeOnPreDrawListener(this);
        } else {
            this.f5352a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f5352a.removeOnAttachStateChangeListener(this);
    }

    @Override
    public boolean onPreDraw() {
        m36775b();
        this.f5354c.run();
        return true;
    }

    @Override
    public void onViewAttachedToWindow(View view) {
        this.f5353b = view.getViewTreeObserver();
    }

    @Override
    public void onViewDetachedFromWindow(View view) {
        m36775b();
    }
}
