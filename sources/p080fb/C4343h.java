package p080fb;

import android.graphics.Rect;
import android.view.View;
import p037cb.C2065g;

public class C4343h implements AbstractC4345j {
    public View f14422a;

    public C4343h(View view) {
        this.f14422a = view;
    }

    @Override
    public boolean mo18573a() {
        return false;
    }

    @Override
    public void mo28230b(Rect rect) {
        View f = mo28226f();
        if (f != null) {
            f.invalidate(rect);
        }
    }

    @Override
    public boolean mo28229c(View view) {
        return mo28226f() == view;
    }

    @Override
    public void mo28228d(int i, int i2, int i3, int i4) {
        View f = mo28226f();
        if (f != null) {
            f.invalidate(i, i2, i3, i4);
        }
    }

    @Override
    public void mo28227e() {
        C2065g.m35719c(mo28226f());
    }

    @Override
    public View mo28226f() {
        return this.f14422a;
    }

    @Override
    public boolean mo28225g() {
        return mo28226f() != null;
    }

    @Override
    public void mo28224h() {
        View f = mo28226f();
        if (f != null) {
            f.postInvalidate();
        }
    }

    @Override
    public void invalidate() {
        View f = mo28226f();
        if (f != null) {
            f.invalidate();
        }
    }

    @Override
    public void requestLayout() {
        View f = mo28226f();
        if (f != null) {
            f.requestLayout();
        }
    }
}
