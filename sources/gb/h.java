package gb;

import android.graphics.Rect;
import android.view.View;
import db.g;

public class h implements j {
    public View f12191a;

    public h(View view) {
        this.f12191a = view;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void b(Rect rect) {
        View f10 = f();
        if (f10 != null) {
            f10.invalidate(rect);
        }
    }

    @Override
    public boolean c(View view) {
        return f() == view;
    }

    @Override
    public void d(int i10, int i11, int i12, int i13) {
        View f10 = f();
        if (f10 != null) {
            f10.invalidate(i10, i11, i12, i13);
        }
    }

    @Override
    public void e() {
        g.c(f());
    }

    @Override
    public View f() {
        return this.f12191a;
    }

    @Override
    public boolean g() {
        return f() != null;
    }

    @Override
    public void h() {
        View f10 = f();
        if (f10 != null) {
            f10.postInvalidate();
        }
    }

    @Override
    public void invalidate() {
        View f10 = f();
        if (f10 != null) {
            f10.invalidate();
        }
    }

    @Override
    public void requestLayout() {
        View f10 = f();
        if (f10 != null) {
            f10.requestLayout();
        }
    }
}
