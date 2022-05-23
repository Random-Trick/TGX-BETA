package oc;

import ae.j;
import ae.p;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ce.a0;
import ce.y;
import ib.d;

public class l extends Drawable {
    public int f19402a;
    public p f19403b;
    public float f19404c;
    public float f19405d = 1.0f;

    public l(int i10) {
        this.f19402a = i10;
    }

    public final int a() {
        return this.f19402a;
    }

    public int b() {
        float f10 = this.f19405d;
        p pVar = this.f19403b;
        return d.a(f10, pVar != null ? pVar.e(this.f19402a) : j.L(this.f19402a));
    }

    public void c(float f10) {
        if (this.f19405d != f10) {
            this.f19405d = f10;
            invalidateSelf();
        }
    }

    public final void d(int i10) {
        if (this.f19402a != i10) {
            this.f19402a = i10;
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f19402a == 0) {
            return;
        }
        if (this.f19404c != 0.0f) {
            RectF a02 = y.a0();
            a02.set(getBounds());
            float i10 = a0.i(this.f19404c);
            canvas.drawRoundRect(a02, i10, i10, y.g(b()));
            return;
        }
        canvas.drawRect(getBounds(), y.g(b()));
    }

    public void e(float f10) {
        if (this.f19404c != f10) {
            this.f19404c = f10;
            invalidateSelf();
        }
    }

    public final void f(p pVar) {
        if (this.f19403b != pVar) {
            this.f19403b = pVar;
            invalidateSelf();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
