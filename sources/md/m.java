package md;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import ce.a0;
import ce.y;
import hd.t2;
import ib.h;
import ld.u;
import ld.v;
import org.thunderdog.challegram.N;
import org.thunderdog.challegram.loader.gif.GifBridge;

public class m implements r, Runnable, v {
    public static l f17440n0;
    public o M;
    public j N;
    public j O;
    public boolean P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public Matrix X;
    public View f17441a;
    public int f17445c;
    public Object f17446c0;
    public float f17447d0;
    public float f17448e0;
    public long f17449f0;
    public float f17450g0;
    public float f17451h0;
    public float f17452i0;
    public float f17453j0;
    public long f17454k0;
    public int f17455l0;
    public int f17456m0;
    public float V = 1.0f;
    public final int f17442a0 = a0.i(1.0f);
    public final int f17444b0 = a0.i(10.0f);
    public s f17443b = new s(this);
    public Rect Y = new Rect();
    public Rect Z = new Rect();
    public RectF W = new RectF();

    public m(View view) {
        this.f17441a = view;
    }

    public static l i() {
        if (f17440n0 == null) {
            synchronized (m.class) {
                if (f17440n0 == null) {
                    f17440n0 = new l();
                }
            }
        }
        return f17440n0;
    }

    @Override
    public void D() {
        u.a(this);
    }

    @Override
    public void E0(int i10) {
    }

    @Override
    public void F0(Canvas canvas, Path path, float f10) {
        u.c(this, canvas, path, f10);
    }

    @Override
    public int J0() {
        return (int) ((this.R + this.T) * 0.5f);
    }

    @Override
    public boolean K0(int i10, int i11, int i12, int i13) {
        if (this.R == i10 && this.S == i11 && this.T == i12 && this.U == i13) {
            return false;
        }
        this.R = i10;
        this.S = i11;
        this.T = i12;
        this.U = i13;
        this.Z.set(i10, i11, i12, i13);
        m();
        return true;
    }

    @Override
    public void O(Canvas canvas) {
        if (this.f17445c != 1) {
            canvas.drawCircle(this.f17455l0, this.f17456m0, this.f17444b0, y.U());
            p();
            if (this.f17454k0 != 0) {
                q();
                if (this.f17453j0 == 1.0f) {
                    this.f17454k0 = 0L;
                    this.f17450g0 = 0.0f;
                    g(canvas, -100.0f, (this.Q * 350.0f) + 10.0f);
                    return;
                }
                g(canvas, -100.0f, (this.f17450g0 * 350.0f) + 10.0f);
                return;
            }
            g(canvas, -100.0f, (this.Q * 350.0f) + 10.0f);
        }
    }

    @Override
    public void P(Canvas canvas, Path path) {
        u.b(this, canvas, path);
    }

    @Override
    public void Q() {
        this.V = this.f17447d0;
        this.f17447d0 = 0.0f;
    }

    @Override
    public float R0() {
        return this.V;
    }

    @Override
    public void S0(boolean z10) {
    }

    @Override
    public void V(float f10) {
        this.f17447d0 = this.V;
        this.V = f10;
    }

    @Override
    public void Z0(Rect rect) {
        u.i(this, rect);
    }

    @Override
    public View a(j jVar) {
        j jVar2 = this.N;
        if (jVar2 == null || jVar2.e() != jVar.e()) {
            return null;
        }
        return this.f17441a;
    }

    @Override
    public void b() {
        if (!this.P) {
            this.P = true;
            j jVar = this.N;
            if (jVar != null) {
                this.O = jVar;
                this.P = false;
                r(null);
                this.P = true;
            }
        }
    }

    @Override
    public void b0() {
        clear();
    }

    @Override
    public void c(j jVar, o oVar) {
        i().b(this, jVar, oVar);
    }

    @Override
    public void clear() {
        r(null);
    }

    @Override
    public void d(j jVar) {
        j jVar2 = this.N;
        if (jVar.e() == (jVar2 == null ? 0 : jVar2.e())) {
            invalidate();
        }
    }

    @Override
    public void d1(View view, Rect rect) {
        u.f(this, view, rect);
    }

    @Override
    public void draw(Canvas canvas) {
        o oVar;
        if (this.N != null && (oVar = this.M) != null) {
            synchronized (oVar.f()) {
                if (this.M.i()) {
                    this.M.c();
                    int d10 = (int) (h.d(this.V) * 255.0f);
                    Paint j10 = y.j();
                    int alpha = j10.getAlpha();
                    if (d10 != alpha) {
                        j10.setAlpha(d10);
                    }
                    if (this.N.j() != 0) {
                        canvas.save();
                        canvas.clipRect(this.R, this.S, this.T, this.U);
                        int i10 = this.R;
                        if (!(i10 == 0 && this.S == 0)) {
                            canvas.translate(i10, this.S);
                        }
                        int h10 = this.M.h();
                        if (h10 != 0) {
                            canvas.rotate(h10, (this.T - this.R) / 2, (this.U - this.S) / 2);
                        }
                        canvas.concat(this.X);
                        canvas.drawBitmap(this.M.e(true), 0.0f, 0.0f, j10);
                        canvas.restore();
                    } else {
                        canvas.drawBitmap(this.M.e(true), this.Y, this.Z, j10);
                    }
                    if (d10 != alpha) {
                        j10.setAlpha(alpha);
                    }
                }
            }
        }
    }

    @Override
    public void e() {
        if (this.P) {
            this.P = false;
            j jVar = this.O;
            if (jVar != null) {
                r(jVar);
                this.O = null;
            }
        }
    }

    @Override
    public boolean e0() {
        o oVar;
        return this.f17445c != 1 || (oVar = this.M) == null || !oVar.i();
    }

    @Override
    public void f(j jVar, float f10) {
        i().c(this, jVar, f10);
    }

    public final void g(Canvas canvas, float f10, float f11) {
        Paint Y = y.Y(-1, a0.i(2.0f));
        float f12 = this.f17448e0;
        if (f12 == 0.0f) {
            canvas.drawArc(this.W, f10, Math.max(f11, 12.0f), false, Y);
        } else {
            canvas.drawArc(this.W, f10 + (f12 * 360.0f), Math.max(f11, 12.0f), false, Y);
        }
    }

    @Override
    public float getAlpha() {
        return this.V;
    }

    @Override
    public int getBottom() {
        return this.U;
    }

    @Override
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override
    public int getLeft() {
        return this.R;
    }

    @Override
    public int getRight() {
        return this.T;
    }

    @Override
    public Object getTag() {
        return this.f17446c0;
    }

    @Override
    public int getTop() {
        return this.S;
    }

    @Override
    public int getWidth() {
        return getRight() - getLeft();
    }

    public j h() {
        return this.P ? this.O : this.N;
    }

    @Override
    public boolean h1(float f10, float f11, int i10, int i11) {
        j jVar = this.N;
        if (!(jVar == null && (i10 == 0 || i11 == 0))) {
            if ((jVar != null ? jVar.j() : 1) == 1) {
                int i12 = this.T - this.R;
                int i13 = this.U - this.S;
                if (this.N != null) {
                    i10 = i12;
                    i11 = i13;
                }
                float f12 = i10;
                float f13 = i11;
                float min = Math.min(i12 / f12, i13 / f13);
                int i14 = (int) (f13 * min);
                int i15 = (this.R + this.T) / 2;
                int i16 = (this.S + this.U) / 2;
                int i17 = ((int) (f12 * min)) / 2;
                if (f10 < i15 - i17 || f10 > i15 + i17) {
                    return false;
                }
                int i18 = i14 / 2;
                return f11 >= ((float) (i16 - i18)) && f11 <= ((float) (i16 + i18));
            }
        }
        return false;
    }

    @Override
    public void invalidate() {
        this.f17441a.invalidate(this.R, this.S, this.T, this.U);
    }

    @Override
    public boolean isEmpty() {
        return h() == null;
    }

    public final void j() {
        View view = this.f17441a;
        RectF rectF = this.W;
        int i10 = this.f17442a0;
        view.invalidate(((int) rectF.left) - i10, ((int) rectF.top) - i10, ((int) rectF.right) + i10, ((int) rectF.bottom) + i10);
    }

    @Override
    public void j1(Canvas canvas, int i10, int i11) {
        u.e(this, canvas, i10, i11);
    }

    public final void k() {
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        if (this.M != null && this.N != null) {
            Matrix matrix = this.X;
            if (matrix != null) {
                matrix.reset();
            }
            this.Y.right = this.M.u();
            this.Y.bottom = this.M.k();
            j jVar = this.N;
            if (jVar != null) {
                int j10 = jVar.j();
                if (j10 == 1) {
                    if (this.X == null) {
                        this.X = new Matrix();
                    }
                    if (this.M.n()) {
                        i11 = this.M.k();
                        i10 = this.M.u();
                    } else {
                        i11 = this.M.u();
                        i10 = this.M.k();
                    }
                    int width = this.Z.width();
                    int height = this.Z.height();
                    float f14 = i11;
                    float f15 = i10;
                    float min = Math.min(width / f14, height / f15);
                    int i14 = (int) (f14 * min);
                    int i15 = (int) (f15 * min);
                    if (this.M.n()) {
                        f10 = (width - i15) / 2;
                        f11 = (height - i14) / 2;
                    } else {
                        f10 = (width - i14) / 2;
                        f11 = (height - i15) / 2;
                    }
                    this.X.setScale(min, min);
                    this.X.postTranslate((int) (f10 + 0.5f), (int) (f11 + 0.5f));
                } else if (j10 == 2) {
                    if (this.X == null) {
                        this.X = new Matrix();
                    }
                    if (this.M.n()) {
                        i13 = this.M.k();
                        i12 = this.M.u();
                    } else {
                        i13 = this.M.u();
                        i12 = this.M.k();
                    }
                    int width2 = this.Z.width();
                    int height2 = this.Z.height();
                    float f16 = i13;
                    float f17 = i12;
                    float max = Math.max(width2 / f16, height2 / f17);
                    int i16 = (int) (f16 * max);
                    int i17 = (int) (f17 * max);
                    if (this.M.n()) {
                        f12 = (width2 - i17) / 2;
                        f13 = (height2 - i16) / 2;
                    } else {
                        f12 = (width2 - i16) / 2;
                        f13 = (height2 - i17) / 2;
                    }
                    this.X.setScale(max, max);
                    this.X.postTranslate((int) f12, (int) f13);
                }
            }
        }
    }

    @Override
    public void l() {
        m();
    }

    public final void m() {
        int i10 = (int) ((this.R + this.T) * 0.5f);
        this.f17455l0 = i10;
        int i11 = (int) ((this.S + this.U) * 0.5f);
        this.f17456m0 = i11;
        RectF rectF = this.W;
        int i12 = this.f17444b0;
        int i13 = this.f17442a0;
        rectF.left = (i10 - i12) + i13;
        rectF.right = (i10 + i12) - i13;
        rectF.top = (i11 - i12) + i13;
        rectF.bottom = (i11 + i12) - i13;
        k();
    }

    public void n(j jVar, o oVar) {
        j jVar2 = this.N;
        if (jVar.e() == (jVar2 == null ? 0 : jVar2.e())) {
            this.M = oVar;
            this.f17445c = 1;
            k();
            invalidate();
        }
    }

    public void o(j jVar, float f10) {
        j jVar2 = this.N;
        if (jVar.e() == (jVar2 == null ? 0 : jVar2.e())) {
            float f11 = this.Q;
            this.Q = f10;
            t(f11);
        }
    }

    public final void p() {
        long j10 = 0;
        if (this.f17449f0 == 0) {
            this.f17448e0 = 0.0f;
            this.f17449f0 = System.currentTimeMillis();
        } else {
            j10 = System.currentTimeMillis();
            this.f17448e0 = ((float) (j10 - this.f17449f0)) / 2400.0f;
        }
        float f10 = this.f17448e0;
        if (f10 >= 1.0f) {
            this.f17449f0 = j10;
            this.f17448e0 = f10 - 1.0f;
        }
    }

    public final void q() {
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f17454k0)) / 140.0f;
        if (currentTimeMillis <= 0.0f) {
            this.f17453j0 = 0.0f;
        } else if (currentTimeMillis >= 1.0f) {
            this.f17453j0 = 1.0f;
        } else {
            this.f17453j0 = N.iimg(currentTimeMillis);
        }
        this.f17450g0 = this.f17451h0 + (this.f17452i0 * this.f17453j0);
    }

    public void r(j jVar) {
        if (this.P) {
            this.O = jVar;
            return;
        }
        j jVar2 = this.N;
        int i10 = 0;
        int e10 = jVar2 == null ? 0 : jVar2.e();
        int e11 = jVar == null ? 0 : jVar.e();
        if (e10 != e11) {
            if (e10 != 0) {
                GifBridge.f().o(this.f17443b);
            }
            this.N = jVar;
            if (jVar != null && t2.T2(jVar.d())) {
                i10 = 1;
            }
            this.f17445c = i10;
            this.M = null;
            if (e11 != 0) {
                if (i10 != 1) {
                    s();
                }
                GifBridge.f().p(jVar, this.f17443b);
                return;
            }
            invalidate();
        }
    }

    @Override
    public void run() {
        j();
        if (this.f17445c != 1 && this.N != null) {
            this.f17441a.postDelayed(this, 16L);
        }
    }

    public final void s() {
        this.Q = 0.0f;
        this.f17454k0 = 0L;
        this.f17451h0 = 0.0f;
        this.f17452i0 = 0.0f;
        this.f17453j0 = 0.0f;
        this.f17450g0 = 0.0f;
        this.f17449f0 = System.currentTimeMillis();
        this.f17441a.removeCallbacks(this);
        this.f17441a.postDelayed(this, 16L);
    }

    @Override
    public void setAlpha(float f10) {
        if (this.V != f10) {
            this.V = f10;
            invalidate();
        }
    }

    @Override
    public void setColorFilter(int i10) {
        u.h(this, i10);
    }

    @Override
    public void setTag(Object obj) {
        this.f17446c0 = obj;
    }

    public final void t(float f10) {
        this.f17454k0 = System.currentTimeMillis();
        float f11 = this.f17450g0;
        if (f11 == 0.0f) {
            this.f17450g0 = f10;
            this.f17451h0 = f10;
        } else {
            this.f17451h0 = f11;
        }
        this.f17453j0 = 0.0f;
        this.f17452i0 = this.Q - this.f17451h0;
        j();
    }

    @Override
    public void u0(Canvas canvas, int i10) {
        u.d(this, canvas, i10);
    }

    @Override
    public int x0() {
        return (int) ((this.U + this.S) * 0.5f);
    }
}
