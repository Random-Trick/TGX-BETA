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
    public void mo20261D() {
        this.f19674b.mo20261D();
        this.f19675c.mo20261D();
    }

    @Override
    public void mo20260D0(int i) {
        if (!this.f19673a) {
            this.f19674b.mo20260D0(i);
            m20983d().mo20260D0(i);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public void mo20259E0(Canvas canvas, Path path, float f) {
        C6263u.m20759c(this, canvas, path, f);
    }

    @Override
    public int mo20258I0() {
        return this.f19675c.mo20258I0();
    }

    @Override
    public boolean mo20257K0(int i, int i2, int i3, int i4) {
        this.f19674b.mo20257K0(i, i2, i3, i4);
        return this.f19675c.mo20257K0(i, i2, i3, i4);
    }

    @Override
    public void mo20256N(Canvas canvas) {
        this.f19674b.mo20256N(canvas);
    }

    @Override
    public void mo20255O(Canvas canvas, Path path) {
        C6263u.m20760b(this, canvas, path);
    }

    @Override
    public void mo20254P() {
        this.f19674b.mo20254P();
        this.f19675c.mo20254P();
    }

    @Override
    public float mo20253R0() {
        return this.f19675c.mo20253R0();
    }

    @Override
    public void mo20252S0(boolean z) {
        this.f19674b.mo20252S0(z);
        this.f19675c.mo20252S0(z);
    }

    @Override
    public void mo20251U(float f) {
        C6257p pVar = this.f19674b;
        pVar.mo20251U(pVar.mo20253R0() * f);
        AbstractC6264v vVar = this.f19675c;
        vVar.mo20251U(f * vVar.mo20253R0());
    }

    @Override
    public void mo20250Z() {
        this.f19674b.mo20250Z();
        this.f19675c.mo20250Z();
    }

    public void m20985a(Canvas canvas, float f) {
        if (f == 0.0f) {
            this.f19674b.draw(canvas);
        } else if (f == 1.0f) {
            draw(canvas);
        } else {
            this.f19674b.draw(canvas);
            AbstractC6264v vVar = this.f19675c;
            vVar.mo20251U(vVar.mo20253R0() * f);
            this.f19675c.draw(canvas);
            this.f19675c.mo20254P();
        }
    }

    @Override
    public void mo20249a1(Rect rect) {
        C6263u.m20753i(this, rect);
    }

    @Override
    public void mo20248b() {
        this.f19674b.mo20248b();
        this.f19675c.mo20248b();
    }

    public float m20984c() {
        if (this.f19673a || !this.f19675c.mo20247c0()) {
            return 1.0f;
        }
        return m20983d().m20798s();
    }

    @Override
    public boolean mo20247c0() {
        return this.f19674b.mo20247c0() && this.f19675c.mo20247c0();
    }

    @Override
    public void clear() {
        this.f19674b.clear();
        this.f19675c.clear();
    }

    public C6257p m20983d() {
        if (!this.f19673a) {
            return (C6257p) this.f19675c;
        }
        throw new IllegalStateException();
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.f19675c.mo20247c0()) {
            this.f19674b.draw(canvas);
        }
        this.f19675c.draw(canvas);
    }

    public C6257p m20982e() {
        return this.f19674b;
    }

    @Override
    public void mo20246f() {
        this.f19674b.mo20246f();
        this.f19675c.mo20246f();
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        C6263u.m20756f(this, view, rect);
    }

    public int m20981g() {
        if (this.f19673a) {
            return 0;
        }
        return m20983d().m20797t();
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

    public AbstractC6264v m20980h() {
        return this.f19675c;
    }

    public boolean m20979i(float f, float f2) {
        return C6263u.m20755g(this, f, f2);
    }

    @Override
    public void invalidate() {
        this.f19675c.invalidate();
    }

    @Override
    public boolean isEmpty() {
        return this.f19674b.isEmpty() && this.f19675c.isEmpty();
    }

    public void m20978j(C6246h hVar, C6246h hVar2) {
        this.f19674b.m20820G(hVar);
        m20983d().m20820G(hVar2);
    }

    @Override
    public boolean mo20240k1(float f, float f2, int i, int i2) {
        return this.f19675c.mo20240k1(f, f2, i, i2);
    }

    @Override
    public void mo20239l() {
        this.f19674b.mo20239l();
        this.f19675c.mo20239l();
    }

    @Override
    public void mo20237m1(Canvas canvas, int i, int i2) {
        C6263u.m20757e(this, canvas, i, i2);
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
    public void mo20229u0(Canvas canvas, int i) {
        C6263u.m20758d(this, canvas, i);
    }

    @Override
    public int mo20228y0() {
        return this.f19675c.mo20228y0();
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
