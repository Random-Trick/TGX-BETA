package ne;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import ce.a0;
import ce.j0;
import ce.y;
import db.b;
import eb.k;
import gb.g;
import gb.j;
import ib.d;
import ib.h;
import ie.w0;
import kb.c;
import org.thunderdog.challegram.a;

public class m2 implements Runnable, k.b, c, a.m {
    public static boolean f18239k0 = true;
    public static final float f18240l0 = 8.0f;
    public static final Interpolator f18241m0 = new DecelerateInterpolator(0.72f);
    public int N;
    public int Q;
    public boolean R;
    public final g T;
    public j U;
    public long V;
    public boolean W;
    public boolean X;
    public float Y;
    public final a Z;
    public boolean f18248d0;
    public boolean f18249e0;
    public boolean f18250f0;
    public float f18251g0;
    public k f18252h0;
    public boolean f18253i0;
    public w0 f18254j0;
    public long f18242a = 1600;
    public long f18244b = 200;
    public long f18246c = 32000;
    public long M = 600;
    public float S = 1.0f;
    public boolean f18243a0 = true;
    public long f18245b0 = -1;
    public long f18247c0 = -1;
    public final Rect O = new Rect();
    public final RectF P = new RectF();

    public m2(a aVar, int i10) {
        this.N = i10;
        g gVar = new g();
        this.T = gVar;
        this.U = gVar;
        this.Z = aVar;
    }

    public static m2 F(View view, float f10, int i10, int i11, int i12, int i13) {
        m2 m2Var = new m2(j0.r(view.getContext()), a0.i(f10));
        m2Var.B();
        m2Var.y();
        m2Var.d(-1);
        m2Var.o(0.0f);
        m2Var.p(i10, i11, i12 + i10, i13 + i11);
        m2Var.a(view);
        return m2Var;
    }

    public static long g() {
        return Math.max(8L, ValueAnimator.getFrameDelay());
    }

    public final void A(boolean z10) {
        if (this.f18243a0 != z10) {
            boolean k10 = k();
            this.f18243a0 = z10;
            n(false, k10);
        }
    }

    public void B() {
        C(a0.i(2.0f));
    }

    public void C(float f10) {
        this.X = true;
        this.Y = f10;
    }

    public void D() {
        this.f18249e0 = true;
    }

    public void E(j jVar) {
        if (jVar == null) {
            jVar = this.T;
        }
        this.U = jVar;
    }

    @Override
    public void Q2() {
        this.Z.A2(this);
        A(false);
    }

    @Override
    public void V(a aVar, int i10, int i11) {
        A(i10 == 0);
    }

    public void a(View view) {
        boolean k10 = k();
        this.T.j(view);
        n(false, k10);
    }

    public void b(View view) {
        this.T.l(view);
    }

    public void c(Canvas canvas) {
        long j10;
        float f10;
        float f11;
        float f12;
        float f13 = 0.0f;
        if (this.S > 0.0f) {
            boolean z10 = this.W;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z10) {
                uptimeMillis -= this.V;
            }
            if (this.f18253i0) {
                long j11 = this.f18244b;
                j10 = this.M + j11 + j11;
            } else {
                j10 = 0;
            }
            long j12 = uptimeMillis + j10;
            boolean l10 = l();
            if (l10) {
                f11 = i() * 360.0f;
                f10 = 270.0f - f11;
            } else {
                float f14 = 10.0f;
                if (this.f18248d0) {
                    long j13 = this.f18246c;
                    f10 = ((((float) (j12 % j13)) / ((float) j13)) * 360.0f) % 360.0f;
                    f11 = (this.f18251g0 * 350.0f) + 10.0f;
                } else {
                    long j14 = j12 % this.f18242a;
                    long j15 = this.f18244b;
                    long j16 = this.M;
                    long j17 = j16 + j15 + j15;
                    if (j14 >= j15) {
                        f13 = j14 > j15 + j16 ? 1.0f : b.f7287b.getInterpolation(((float) (j14 - j15)) / ((float) j16));
                    }
                    if (j14 < j17) {
                        f12 = 0.0f;
                    } else {
                        long j18 = this.M;
                        f12 = j14 > j17 + j18 ? 1.0f : b.f7287b.getInterpolation(((float) (j14 - j17)) / ((float) j18));
                    }
                    float f15 = (f12 * 270.0f) + ((((float) j14) / ((float) this.f18242a)) * 450.0f);
                    long j19 = this.f18246c;
                    f10 = (f15 + ((((float) (j12 % j19)) / ((float) j19)) * 360.0f)) % 360.0f;
                    if (this.N >= a0.i(18.0f)) {
                        f14 = f18240l0;
                    } else if (this.N < a0.i(10.0f)) {
                        f14 = 25.0f;
                    }
                    f11 = (f13 * 270.0f * (1.0f - f12)) + f14;
                }
            }
            int a10 = d.a(this.S, this.R ? this.Q : ae.j.F0());
            canvas.drawArc(this.P, f10, f11, false, this.X ? y.Y(a10, this.Y) : y.X(a10));
            if (l10) {
                double radians = Math.toRadians(h.k(f10, 360.0f));
                canvas.drawCircle((float) (this.P.centerX() + ((this.P.width() / 2.0f) * Math.cos(radians))), (float) (this.P.centerY() + ((this.P.height() / 2.0f) * Math.sin(radians))), this.Y / 2.0f, y.g(a10));
                if (this.f18254j0 == null) {
                    this.f18254j0 = new w0();
                }
                this.f18254j0.a(canvas, a10, this.Y, this.P, 360.0f - f11, this.S);
            }
            if (!this.f18250f0 && k()) {
                n(true, true);
            }
        }
    }

    public void d(int i10) {
        if (this.Q != i10) {
            boolean k10 = k();
            this.Q = i10;
            this.R = true;
            n(false, k10);
        }
    }

    public float e() {
        return this.S;
    }

    public final int f() {
        return d.a(this.S, this.R ? this.Q : ae.j.F0());
    }

    public long h() {
        return ((float) (this.f18247c0 - this.f18245b0)) * i();
    }

    public final float i() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.f18245b0;
        if (uptimeMillis <= j10) {
            return 1.0f;
        }
        long j11 = this.f18247c0;
        if (uptimeMillis >= j11) {
            return 0.0f;
        }
        return 1.0f - (((float) (uptimeMillis - j10)) / ((float) (j11 - j10)));
    }

    public final void j() {
        if (this.f18249e0) {
            this.U.invalidate();
        } else {
            this.U.b(this.O);
        }
    }

    public final boolean k() {
        return this.U.g() && (Color.alpha(this.Q) > 0 || !this.R) && this.f18243a0;
    }

    public final boolean l() {
        return (this.f18245b0 == -1 || this.f18247c0 == -1) ? false : true;
    }

    public void m() {
        n(false, true);
    }

    public final void n(boolean z10, boolean z11) {
        if (this.U.g()) {
            if (k() && !z11) {
                this.V = SystemClock.uptimeMillis();
            }
            if (!z10) {
                j();
            }
            if (Color.alpha(f()) > 0) {
                if (!z10 || this.f18250f0) {
                    j0.A().removeCallbacks(this);
                }
                this.f18250f0 = true;
                j0.A().postDelayed(this, this.W ? 3L : g());
            }
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            u(f10);
        }
    }

    public void o(float f10) {
        if (this.S != f10) {
            boolean k10 = k();
            this.S = f10;
            n(false, k10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    public void p(int i10, int i11, int i12, int i13) {
        this.O.set(i10, i11, i12, i13);
        int centerX = this.O.centerX();
        int centerY = this.O.centerY();
        RectF rectF = this.P;
        int i14 = this.N;
        rectF.set(centerX - i14, centerY - i14, centerX + i14, centerY + i14);
    }

    public void q(long j10, long j11) {
        this.f18242a = j10;
        this.M = j11;
        this.f18244b = (j10 - (j11 * 2)) / 2;
        x(j10 * 10);
    }

    public void r() {
        this.f18248d0 = true;
        this.f18246c = 1800L;
    }

    @Override
    public void run() {
        this.f18250f0 = false;
        j();
    }

    public void s(boolean z10) {
        this.W = z10;
    }

    public void t(boolean z10) {
        this.f18253i0 = z10;
    }

    public final void u(float f10) {
        if (this.f18251g0 != f10) {
            this.f18251g0 = f10;
        }
    }

    public void v(float f10, boolean z10) {
        float min = Math.min(1.0f, Math.max(0.0f, f10));
        if (z10 && k()) {
            float f11 = this.f18251g0;
            if (!(f11 == min && this.f18252h0 == null)) {
                if (this.f18252h0 == null) {
                    this.f18252h0 = new k(0, this, f18241m0, 180L, f11);
                }
                this.f18252h0.i(min);
                return;
            }
        }
        k kVar = this.f18252h0;
        if (kVar != null) {
            kVar.k();
            this.f18252h0.l(min);
        }
        this.f18251g0 = min;
        j();
    }

    public void w(int i10) {
        if (this.N != i10) {
            this.N = i10;
            Rect rect = this.O;
            p(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void x(long j10) {
        this.f18246c = j10;
    }

    public void y() {
        q(1700L, 600L);
    }

    public void z(long j10, long j11) {
        long currentTimeMillis = System.currentTimeMillis();
        long j12 = j11 - currentTimeMillis;
        long j13 = j10 - currentTimeMillis;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f18245b0 = j13 + uptimeMillis;
        this.f18247c0 = uptimeMillis + j12;
    }
}
