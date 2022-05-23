package ld;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import md.m;

public class c implements v {
    public final boolean f16344a;
    public final p f16345b;
    public final v f16346c;

    public c(View view, int i10) {
        this(view, i10, false);
    }

    @Override
    public void D() {
        this.f16345b.D();
        this.f16346c.D();
    }

    @Override
    public void E0(int i10) {
        if (!this.f16344a) {
            this.f16345b.E0(i10);
            d().E0(i10);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public void F0(Canvas canvas, Path path, float f10) {
        u.c(this, canvas, path, f10);
    }

    @Override
    public int J0() {
        return this.f16346c.J0();
    }

    @Override
    public boolean K0(int i10, int i11, int i12, int i13) {
        this.f16345b.K0(i10, i11, i12, i13);
        return this.f16346c.K0(i10, i11, i12, i13);
    }

    @Override
    public void O(Canvas canvas) {
        this.f16345b.O(canvas);
    }

    @Override
    public void P(Canvas canvas, Path path) {
        u.b(this, canvas, path);
    }

    @Override
    public void Q() {
        this.f16345b.Q();
        this.f16346c.Q();
    }

    @Override
    public float R0() {
        return this.f16346c.R0();
    }

    @Override
    public void S0(boolean z10) {
        this.f16345b.S0(z10);
        this.f16346c.S0(z10);
    }

    @Override
    public void V(float f10) {
        p pVar = this.f16345b;
        pVar.V(pVar.R0() * f10);
        v vVar = this.f16346c;
        vVar.V(f10 * vVar.R0());
    }

    @Override
    public void Z0(Rect rect) {
        u.i(this, rect);
    }

    public void a(Canvas canvas, float f10) {
        if (f10 == 0.0f) {
            this.f16345b.draw(canvas);
        } else if (f10 == 1.0f) {
            draw(canvas);
        } else {
            this.f16345b.draw(canvas);
            v vVar = this.f16346c;
            vVar.V(vVar.R0() * f10);
            this.f16346c.draw(canvas);
            this.f16346c.Q();
        }
    }

    @Override
    public void b() {
        this.f16345b.b();
        this.f16346c.b();
    }

    @Override
    public void b0() {
        this.f16345b.b0();
        this.f16346c.b0();
    }

    public float c() {
        if (this.f16344a || !this.f16346c.e0()) {
            return 1.0f;
        }
        return d().s();
    }

    @Override
    public void clear() {
        this.f16345b.clear();
        this.f16346c.clear();
    }

    public p d() {
        if (!this.f16344a) {
            return (p) this.f16346c;
        }
        throw new IllegalStateException();
    }

    @Override
    public void d1(View view, Rect rect) {
        u.f(this, view, rect);
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.f16346c.e0()) {
            this.f16345b.draw(canvas);
        }
        this.f16346c.draw(canvas);
    }

    @Override
    public void e() {
        this.f16345b.e();
        this.f16346c.e();
    }

    @Override
    public boolean e0() {
        return this.f16345b.e0() && this.f16346c.e0();
    }

    public p f() {
        return this.f16345b;
    }

    public int g() {
        if (this.f16344a) {
            return 0;
        }
        return d().t();
    }

    @Override
    public float getAlpha() {
        return this.f16346c.getAlpha();
    }

    @Override
    public int getBottom() {
        return this.f16346c.getBottom();
    }

    @Override
    public int getHeight() {
        return this.f16346c.getHeight();
    }

    @Override
    public int getLeft() {
        return this.f16346c.getLeft();
    }

    @Override
    public int getRight() {
        return this.f16346c.getRight();
    }

    @Override
    public Object getTag() {
        return this.f16346c.getTag();
    }

    @Override
    public int getTop() {
        return this.f16346c.getTop();
    }

    @Override
    public int getWidth() {
        return this.f16346c.getWidth();
    }

    public v h() {
        return this.f16346c;
    }

    @Override
    public boolean h1(float f10, float f11, int i10, int i11) {
        return this.f16346c.h1(f10, f11, i10, i11);
    }

    public boolean i(float f10, float f11) {
        return u.g(this, f10, f11);
    }

    @Override
    public void invalidate() {
        this.f16346c.invalidate();
    }

    @Override
    public boolean isEmpty() {
        return this.f16345b.isEmpty() && this.f16346c.isEmpty();
    }

    public void j(h hVar, h hVar2) {
        this.f16345b.G(hVar);
        d().G(hVar2);
    }

    @Override
    public void j1(Canvas canvas, int i10, int i11) {
        u.e(this, canvas, i10, i11);
    }

    @Override
    public void l() {
        this.f16345b.l();
        this.f16346c.l();
    }

    @Override
    public void setAlpha(float f10) {
        this.f16345b.setAlpha(f10);
        this.f16346c.setAlpha(f10);
    }

    @Override
    public void setColorFilter(int i10) {
        this.f16345b.setColorFilter(i10);
        this.f16346c.setColorFilter(i10);
    }

    @Override
    public void setTag(Object obj) {
        this.f16346c.setTag(obj);
    }

    @Override
    public void u0(Canvas canvas, int i10) {
        u.d(this, canvas, i10);
    }

    @Override
    public int x0() {
        return this.f16346c.x0();
    }

    public c(View view, int i10, boolean z10) {
        this.f16344a = z10;
        this.f16345b = new p(view, i10);
        if (z10) {
            this.f16346c = new m(view);
        } else {
            this.f16346c = new p(view, i10);
        }
    }
}
