package p168ld;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import gd.C4779t2;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.loader.gif.GifBridge;
import p108hb.C5069h;
import p156kd.AbstractC6264v;
import p156kd.C6263u;

public class RunnableC6507m implements AbstractC6515r, Runnable, AbstractC6264v {
    public static HandlerC6506l f20266n0;
    public C6509o f20267M;
    public C6503j f20268N;
    public C6503j f20269O;
    public boolean f20270P;
    public float f20271Q;
    public int f20272R;
    public int f20273S;
    public int f20274T;
    public int f20275U;
    public Matrix f20278X;
    public View f20281a;
    public int f20285c;
    public Object f20286c0;
    public float f20287d0;
    public float f20288e0;
    public long f20289f0;
    public float f20290g0;
    public float f20291h0;
    public float f20292i0;
    public float f20293j0;
    public long f20294k0;
    public int f20295l0;
    public int f20296m0;
    public float f20276V = 1.0f;
    public final int f20282a0 = C1357a0.m37541i(1.0f);
    public final int f20284b0 = C1357a0.m37541i(10.0f);
    public C6516s f20283b = new C6516s(this);
    public Rect f20279Y = new Rect();
    public Rect f20280Z = new Rect();
    public RectF f20277W = new RectF();

    public RunnableC6507m(View view) {
        this.f20281a = view;
    }

    public static HandlerC6506l m20242i() {
        if (f20266n0 == null) {
            synchronized (RunnableC6507m.class) {
                if (f20266n0 == null) {
                    f20266n0 = new HandlerC6506l();
                }
            }
        }
        return f20266n0;
    }

    @Override
    public void mo20260D() {
        C6263u.m20760a(this);
    }

    @Override
    public void mo20259D0(int i) {
    }

    @Override
    public void mo20258E0(Canvas canvas, Path path, float f) {
        C6263u.m20758c(this, canvas, path, f);
    }

    @Override
    public int mo20257I0() {
        return (int) ((this.f20272R + this.f20274T) * 0.5f);
    }

    @Override
    public boolean mo20256K0(int i, int i2, int i3, int i4) {
        if (this.f20272R == i && this.f20273S == i2 && this.f20274T == i3 && this.f20275U == i4) {
            return false;
        }
        this.f20272R = i;
        this.f20273S = i2;
        this.f20274T = i3;
        this.f20275U = i4;
        this.f20280Z.set(i, i2, i3, i4);
        m20237m();
        return true;
    }

    @Override
    public void mo20255N(Canvas canvas) {
        if (this.f20285c != 1) {
            canvas.drawCircle(this.f20295l0, this.f20296m0, this.f20284b0, C1410y.m37057U());
            m20233p();
            if (this.f20294k0 != 0) {
                m20232q();
                if (this.f20293j0 == 1.0f) {
                    this.f20294k0 = 0L;
                    this.f20290g0 = 0.0f;
                    m20244g(canvas, -100.0f, (this.f20271Q * 350.0f) + 10.0f);
                    return;
                }
                m20244g(canvas, -100.0f, (this.f20290g0 * 350.0f) + 10.0f);
                return;
            }
            m20244g(canvas, -100.0f, (this.f20271Q * 350.0f) + 10.0f);
        }
    }

    @Override
    public void mo20254O(Canvas canvas, Path path) {
        C6263u.m20759b(this, canvas, path);
    }

    @Override
    public void mo20253P() {
        this.f20276V = this.f20287d0;
        this.f20287d0 = 0.0f;
    }

    @Override
    public float mo20252R0() {
        return this.f20276V;
    }

    @Override
    public void mo20251S0(boolean z) {
    }

    @Override
    public void mo20250U(float f) {
        this.f20287d0 = this.f20276V;
        this.f20276V = f;
    }

    @Override
    public void mo20249Z() {
        clear();
    }

    @Override
    public View mo20184a(C6503j jVar) {
        C6503j jVar2 = this.f20268N;
        if (jVar2 == null || jVar2.m20286e() != jVar.m20286e()) {
            return null;
        }
        return this.f20281a;
    }

    @Override
    public void mo20248a1(Rect rect) {
        C6263u.m20752i(this, rect);
    }

    @Override
    public void mo20247b() {
        if (!this.f20270P) {
            this.f20270P = true;
            C6503j jVar = this.f20268N;
            if (jVar != null) {
                this.f20269O = jVar;
                this.f20270P = false;
                m20231r(null);
                this.f20270P = true;
            }
        }
    }

    @Override
    public void mo20183c(C6503j jVar) {
        C6503j jVar2 = this.f20268N;
        if (jVar.m20286e() == (jVar2 == null ? 0 : jVar2.m20286e())) {
            invalidate();
        }
    }

    @Override
    public boolean mo20246c0() {
        C6509o oVar;
        return this.f20285c != 1 || (oVar = this.f20267M) == null || !oVar.m20212i();
    }

    @Override
    public void clear() {
        m20231r(null);
    }

    @Override
    public void mo20182d(C6503j jVar, C6509o oVar) {
        m20242i().m20262b(this, jVar, oVar);
    }

    @Override
    public void draw(Canvas canvas) {
        C6509o oVar;
        if (this.f20268N != null && (oVar = this.f20267M) != null) {
            synchronized (oVar.m20215f()) {
                if (this.f20267M.m20212i()) {
                    this.f20267M.m20218c();
                    int d = (int) (C5069h.m24089d(this.f20276V) * 255.0f);
                    Paint j = C1410y.m37033j();
                    int alpha = j.getAlpha();
                    if (d != alpha) {
                        j.setAlpha(d);
                    }
                    if (this.f20268N.m20281j() != 0) {
                        canvas.save();
                        canvas.clipRect(this.f20272R, this.f20273S, this.f20274T, this.f20275U);
                        int i = this.f20272R;
                        if (!(i == 0 && this.f20273S == 0)) {
                            canvas.translate(i, this.f20273S);
                        }
                        int h = this.f20267M.m20213h();
                        if (h != 0) {
                            canvas.rotate(h, (this.f20274T - this.f20272R) / 2, (this.f20275U - this.f20273S) / 2);
                        }
                        canvas.concat(this.f20278X);
                        canvas.drawBitmap(this.f20267M.m20216e(true), 0.0f, 0.0f, j);
                        canvas.restore();
                    } else {
                        canvas.drawBitmap(this.f20267M.m20216e(true), this.f20279Y, this.f20280Z, j);
                    }
                    if (d != alpha) {
                        j.setAlpha(alpha);
                    }
                }
            }
        }
    }

    @Override
    public void mo20181e(C6503j jVar, float f) {
        m20242i().m20261c(this, jVar, f);
    }

    @Override
    public void mo20245f() {
        if (this.f20270P) {
            this.f20270P = false;
            C6503j jVar = this.f20269O;
            if (jVar != null) {
                m20231r(jVar);
                this.f20269O = null;
            }
        }
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        C6263u.m20755f(this, view, rect);
    }

    public final void m20244g(Canvas canvas, float f, float f2) {
        Paint Y = C1410y.m37053Y(-1, C1357a0.m37541i(2.0f));
        float f3 = this.f20288e0;
        if (f3 == 0.0f) {
            canvas.drawArc(this.f20277W, f, Math.max(f2, 12.0f), false, Y);
        } else {
            canvas.drawArc(this.f20277W, f + (f3 * 360.0f), Math.max(f2, 12.0f), false, Y);
        }
    }

    @Override
    public float getAlpha() {
        return this.f20276V;
    }

    @Override
    public int getBottom() {
        return this.f20275U;
    }

    @Override
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override
    public int getLeft() {
        return this.f20272R;
    }

    @Override
    public int getRight() {
        return this.f20274T;
    }

    @Override
    public Object getTag() {
        return this.f20286c0;
    }

    @Override
    public int getTop() {
        return this.f20273S;
    }

    @Override
    public int getWidth() {
        return getRight() - getLeft();
    }

    public C6503j m20243h() {
        return this.f20270P ? this.f20269O : this.f20268N;
    }

    @Override
    public void invalidate() {
        this.f20281a.invalidate(this.f20272R, this.f20273S, this.f20274T, this.f20275U);
    }

    @Override
    public boolean isEmpty() {
        return m20243h() == null;
    }

    public final void m20241j() {
        View view = this.f20281a;
        RectF rectF = this.f20277W;
        int i = this.f20282a0;
        view.invalidate(((int) rectF.left) - i, ((int) rectF.top) - i, ((int) rectF.right) + i, ((int) rectF.bottom) + i);
    }

    public final void m20240k() {
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        if (this.f20267M != null && this.f20268N != null) {
            Matrix matrix = this.f20278X;
            if (matrix != null) {
                matrix.reset();
            }
            this.f20279Y.right = this.f20267M.m20200u();
            this.f20279Y.bottom = this.f20267M.m20210k();
            C6503j jVar = this.f20268N;
            if (jVar != null) {
                int j = jVar.m20281j();
                if (j == 1) {
                    if (this.f20278X == null) {
                        this.f20278X = new Matrix();
                    }
                    if (this.f20267M.m20207n()) {
                        i2 = this.f20267M.m20210k();
                        i = this.f20267M.m20200u();
                    } else {
                        i2 = this.f20267M.m20200u();
                        i = this.f20267M.m20210k();
                    }
                    int width = this.f20280Z.width();
                    int height = this.f20280Z.height();
                    float f5 = i2;
                    float f6 = i;
                    float min = Math.min(width / f5, height / f6);
                    int i5 = (int) (f5 * min);
                    int i6 = (int) (f6 * min);
                    if (this.f20267M.m20207n()) {
                        f = (width - i6) / 2;
                        f2 = (height - i5) / 2;
                    } else {
                        f = (width - i5) / 2;
                        f2 = (height - i6) / 2;
                    }
                    this.f20278X.setScale(min, min);
                    this.f20278X.postTranslate((int) (f + 0.5f), (int) (f2 + 0.5f));
                } else if (j == 2) {
                    if (this.f20278X == null) {
                        this.f20278X = new Matrix();
                    }
                    if (this.f20267M.m20207n()) {
                        i4 = this.f20267M.m20210k();
                        i3 = this.f20267M.m20200u();
                    } else {
                        i4 = this.f20267M.m20200u();
                        i3 = this.f20267M.m20210k();
                    }
                    int width2 = this.f20280Z.width();
                    int height2 = this.f20280Z.height();
                    float f7 = i4;
                    float f8 = i3;
                    float max = Math.max(width2 / f7, height2 / f8);
                    int i7 = (int) (f7 * max);
                    int i8 = (int) (f8 * max);
                    if (this.f20267M.m20207n()) {
                        f3 = (width2 - i8) / 2;
                        f4 = (height2 - i7) / 2;
                    } else {
                        f3 = (width2 - i7) / 2;
                        f4 = (height2 - i8) / 2;
                    }
                    this.f20278X.setScale(max, max);
                    this.f20278X.postTranslate((int) f3, (int) f4);
                }
            }
        }
    }

    @Override
    public boolean mo20239k1(float f, float f2, int i, int i2) {
        C6503j jVar = this.f20268N;
        if (!(jVar == null && (i == 0 || i2 == 0))) {
            if ((jVar != null ? jVar.m20281j() : 1) == 1) {
                int i3 = this.f20274T - this.f20272R;
                int i4 = this.f20275U - this.f20273S;
                if (this.f20268N != null) {
                    i = i3;
                    i2 = i4;
                }
                float f3 = i;
                float f4 = i2;
                float min = Math.min(i3 / f3, i4 / f4);
                int i5 = (int) (f4 * min);
                int i6 = (this.f20272R + this.f20274T) / 2;
                int i7 = (this.f20273S + this.f20275U) / 2;
                int i8 = ((int) (f3 * min)) / 2;
                if (f < i6 - i8 || f > i6 + i8) {
                    return false;
                }
                int i9 = i5 / 2;
                return f2 >= ((float) (i7 - i9)) && f2 <= ((float) (i7 + i9));
            }
        }
        return false;
    }

    @Override
    public void mo20238l() {
        m20237m();
    }

    public final void m20237m() {
        int i = (int) ((this.f20272R + this.f20274T) * 0.5f);
        this.f20295l0 = i;
        int i2 = (int) ((this.f20273S + this.f20275U) * 0.5f);
        this.f20296m0 = i2;
        RectF rectF = this.f20277W;
        int i3 = this.f20284b0;
        int i4 = this.f20282a0;
        rectF.left = (i - i3) + i4;
        rectF.right = (i + i3) - i4;
        rectF.top = (i2 - i3) + i4;
        rectF.bottom = (i2 + i3) - i4;
        m20240k();
    }

    @Override
    public void mo20236m1(Canvas canvas, int i, int i2) {
        C6263u.m20756e(this, canvas, i, i2);
    }

    public void m20235n(C6503j jVar, C6509o oVar) {
        C6503j jVar2 = this.f20268N;
        if (jVar.m20286e() == (jVar2 == null ? 0 : jVar2.m20286e())) {
            this.f20267M = oVar;
            this.f20285c = 1;
            m20240k();
            invalidate();
        }
    }

    public void m20234o(C6503j jVar, float f) {
        C6503j jVar2 = this.f20268N;
        if (jVar.m20286e() == (jVar2 == null ? 0 : jVar2.m20286e())) {
            float f2 = this.f20271Q;
            this.f20271Q = f;
            m20229t(f2);
        }
    }

    public final void m20233p() {
        long j = 0;
        if (this.f20289f0 == 0) {
            this.f20288e0 = 0.0f;
            this.f20289f0 = System.currentTimeMillis();
        } else {
            j = System.currentTimeMillis();
            this.f20288e0 = ((float) (j - this.f20289f0)) / 2400.0f;
        }
        float f = this.f20288e0;
        if (f >= 1.0f) {
            this.f20289f0 = j;
            this.f20288e0 = f - 1.0f;
        }
    }

    public final void m20232q() {
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f20294k0)) / 140.0f;
        if (currentTimeMillis <= 0.0f) {
            this.f20293j0 = 0.0f;
        } else if (currentTimeMillis >= 1.0f) {
            this.f20293j0 = 1.0f;
        } else {
            this.f20293j0 = C7888N.iimg(currentTimeMillis);
        }
        this.f20290g0 = this.f20291h0 + (this.f20292i0 * this.f20293j0);
    }

    public void m20231r(C6503j jVar) {
        if (this.f20270P) {
            this.f20269O = jVar;
            return;
        }
        C6503j jVar2 = this.f20268N;
        int i = 0;
        int e = jVar2 == null ? 0 : jVar2.m20286e();
        int e2 = jVar == null ? 0 : jVar.m20286e();
        if (e != e2) {
            if (e != 0) {
                GifBridge.m14341f().m14332o(this.f20283b);
            }
            this.f20268N = jVar;
            if (jVar != null && C4779t2.m25598T2(jVar.m20287d())) {
                i = 1;
            }
            this.f20285c = i;
            this.f20267M = null;
            if (e2 != 0) {
                if (i != 1) {
                    m20230s();
                }
                GifBridge.m14341f().m14331p(jVar, this.f20283b);
                return;
            }
            invalidate();
        }
    }

    @Override
    public void run() {
        m20241j();
        if (this.f20285c != 1 && this.f20268N != null) {
            this.f20281a.postDelayed(this, 16L);
        }
    }

    public final void m20230s() {
        this.f20271Q = 0.0f;
        this.f20294k0 = 0L;
        this.f20291h0 = 0.0f;
        this.f20292i0 = 0.0f;
        this.f20293j0 = 0.0f;
        this.f20290g0 = 0.0f;
        this.f20289f0 = System.currentTimeMillis();
        this.f20281a.removeCallbacks(this);
        this.f20281a.postDelayed(this, 16L);
    }

    @Override
    public void setAlpha(float f) {
        if (this.f20276V != f) {
            this.f20276V = f;
            invalidate();
        }
    }

    @Override
    public void setColorFilter(int i) {
        C6263u.m20753h(this, i);
    }

    @Override
    public void setTag(Object obj) {
        this.f20286c0 = obj;
    }

    public final void m20229t(float f) {
        this.f20294k0 = System.currentTimeMillis();
        float f2 = this.f20290g0;
        if (f2 == 0.0f) {
            this.f20290g0 = f;
            this.f20291h0 = f;
        } else {
            this.f20291h0 = f2;
        }
        this.f20293j0 = 0.0f;
        this.f20292i0 = this.f20271Q - this.f20291h0;
        m20241j();
    }

    @Override
    public void mo20228u0(Canvas canvas, int i) {
        C6263u.m20757d(this, canvas, i);
    }

    @Override
    public int mo20227y0() {
        return (int) ((this.f20275U + this.f20273S) * 0.5f);
    }
}
