package p156kd;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import p168ld.RunnableC6507m;

public class C6240c implements AbstractC6264v {
    public final boolean f19673a;
    public final C6257p f19674b;
    public final AbstractC6264v f19675c;

    public C6240c(View view, int i) {
        this(view, i, false);
    }

    @Override
    public void mo20260D() {
        this.f19674b.mo20260D();
        this.f19675c.mo20260D();
    }

    @Override
    public void mo20259D0(int i) {
        if (!this.f19673a) {
            this.f19674b.mo20259D0(i);
            m20982d().mo20259D0(i);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public void mo20258E0(Canvas canvas, Path path, float f) {
        C6263u.m20758c(this, canvas, path, f);
    }

    @Override
    public int mo20257I0() {
        return this.f19675c.mo20257I0();
    }

    @Override
    public boolean mo20256K0(int i, int i2, int i3, int i4) {
        this.f19674b.mo20256K0(i, i2, i3, i4);
        return this.f19675c.mo20256K0(i, i2, i3, i4);
    }

    @Override
    public void mo20255N(Canvas canvas) {
        this.f19674b.mo20255N(canvas);
    }

    @Override
    public void mo20254O(Canvas canvas, Path path) {
        C6263u.m20759b(this, canvas, path);
    }

    @Override
    public void mo20253P() {
        this.f19674b.mo20253P();
        this.f19675c.mo20253P();
    }

    @Override
    public float mo20252R0() {
        return this.f19675c.mo20252R0();
    }

    @Override
    public void mo20251S0(boolean z) {
        this.f19674b.mo20251S0(z);
        this.f19675c.mo20251S0(z);
    }

    @Override
    public void mo20250U(float f) {
        C6257p pVar = this.f19674b;
        pVar.mo20250U(pVar.mo20252R0() * f);
        AbstractC6264v vVar = this.f19675c;
        vVar.mo20250U(f * vVar.mo20252R0());
    }

    @Override
    public void mo20249Z() {
        this.f19674b.mo20249Z();
        this.f19675c.mo20249Z();
    }

    public void m20984a(Canvas canvas, float f) {
        if (f == 0.0f) {
            this.f19674b.draw(canvas);
        } else if (f == 1.0f) {
            draw(canvas);
        } else {
            this.f19674b.draw(canvas);
            AbstractC6264v vVar = this.f19675c;
            vVar.mo20250U(vVar.mo20252R0() * f);
            this.f19675c.draw(canvas);
            this.f19675c.mo20253P();
        }
    }

    @Override
    public void mo20248a1(Rect rect) {
        C6263u.m20752i(this, rect);
    }

    @Override
    public void mo20247b() {
        this.f19674b.mo20247b();
        this.f19675c.mo20247b();
    }

    public float m20983c() {
        if (this.f19673a || !this.f19675c.mo20246c0()) {
            return 1.0f;
        }
        return m20982d().m20797s();
    }

    @Override
    public boolean mo20246c0() {
        return this.f19674b.mo20246c0() && this.f19675c.mo20246c0();
    }

    @Override
    public void clear() {
        this.f19674b.clear();
        this.f19675c.clear();
    }

    public C6257p m20982d() {
        if (!this.f19673a) {
            return (C6257p) this.f19675c;
        }
        throw new IllegalStateException();
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.f19675c.mo20246c0()) {
            this.f19674b.draw(canvas);
        }
        this.f19675c.draw(canvas);
    }

    public C6257p m20981e() {
        return this.f19674b;
    }

    @Override
    public void mo20245f() {
        this.f19674b.mo20245f();
        this.f19675c.mo20245f();
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        C6263u.m20755f(this, view, rect);
    }

    public int m20980g() {
        if (this.f19673a) {
            return 0;
        }
        return m20982d().m20796t();
    }

    @Override
    public float getAlpha() {
        return this.f19675c.getAlpha();
    }

    @Override
    public int getBottom() {
        return this.f19675c.getBottom();
    }

    @Override
    public int getHeight() {
        return this.f19675c.getHeight();
    }

    @Override
    public int getLeft() {
        return this.f19675c.getLeft();
    }

    @Override
    public int getRight() {
        return this.f19675c.getRight();
    }

    @Override
    public Object getTag() {
        return this.f19675c.getTag();
    }

    @Override
    public int getTop() {
        return this.f19675c.getTop();
    }

    @Override
    public int getWidth() {
        return this.f19675c.getWidth();
    }

    public AbstractC6264v m20979h() {
        return this.f19675c;
    }

    public boolean m20978i(float f, float f2) {
        return C6263u.m20754g(this, f, f2);
    }

    @Override
    public void invalidate() {
        this.f19675c.invalidate();
    }

    @Override
    public boolean isEmpty() {
        return this.f19674b.isEmpty() && this.f19675c.isEmpty();
    }

    public void m20977j(C6246h hVar, C6246h hVar2) {
        this.f19674b.m20819G(hVar);
        m20982d().m20819G(hVar2);
    }

    @Override
    public boolean mo20239k1(float f, float f2, int i, int i2) {
        return this.f19675c.mo20239k1(f, f2, i, i2);
    }

    @Override
    public void mo20238l() {
        this.f19674b.mo20238l();
        this.f19675c.mo20238l();
    }

    @Override
    public void mo20236m1(Canvas canvas, int i, int i2) {
        C6263u.m20756e(this, canvas, i, i2);
    }

    @Override
    public void setAlpha(float f) {
        this.f19674b.setAlpha(f);
        this.f19675c.setAlpha(f);
    }

    @Override
    public void setColorFilter(int i) {
        this.f19674b.setColorFilter(i);
        this.f19675c.setColorFilter(i);
    }

    @Override
    public void setTag(Object obj) {
        this.f19675c.setTag(obj);
    }

    @Override
    public void mo20228u0(Canvas canvas, int i) {
        C6263u.m20757d(this, canvas, i);
    }

    @Override
    public int mo20227y0() {
        return this.f19675c.mo20227y0();
    }

    public C6240c(View view, int i, boolean z) {
        this.f19673a = z;
        this.f19674b = new C6257p(view, i);
        if (z) {
            this.f19675c = new RunnableC6507m(view);
        } else {
            this.f19675c = new C6257p(view, i);
        }
    }
}
