package pd;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import ce.a0;
import ce.j0;
import eb.f;
import eb.k;

public class a extends View implements k.b {
    public double A0;
    public double B0;
    public double C0;
    public double D0;
    public int E0;
    public int F0;
    public boolean G0;
    public float O;
    public int P;
    public int Q;
    public int S;
    public int T;
    public double U;
    public double V;
    public b f21155a;
    public AbstractC0188a f21157b;
    public c f21159c;
    public int f21161d0;
    public int f21162e0;
    public int f21163f0;
    public int f21164g0;
    public int f21167j0;
    public int f21168k0;
    public boolean f21169l0;
    public float f21170m0;
    public float f21171n0;
    public float f21172o0;
    public float f21173p0;
    public double f21174q0;
    public double f21175r0;
    public double f21176s0;
    public double f21177t0;
    public k f21178u0;
    public float f21179v0;
    public double f21180w0;
    public double f21181x0;
    public double f21182y0;
    public double f21183z0;
    public final Rect M = new Rect();
    public final Paint N = new Paint(5);
    public final f R = new f(0, this, db.b.f7287b, 170);
    public double W = 0.0d;
    public double f21156a0 = 0.0d;
    public double f21158b0 = 1.0d;
    public double f21160c0 = 1.0d;
    public final Rect f21165h0 = new Rect();
    public final Rect f21166i0 = new Rect();

    public interface AbstractC0188a {
        void a();

        void b(float f10);
    }

    public interface b {
        void a(double d10, double d11, double d12, double d13);
    }

    public interface c {
        void a(boolean z10);
    }

    public a(Context context) {
        super(context);
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return Math.abs(h(f10, f11, f12, f13));
    }

    private float getProportion() {
        int i10;
        float f10;
        float f11;
        int targetWidth = getTargetWidth();
        int targetHeight = getTargetHeight();
        int i11 = this.E0;
        if (i11 <= 0 || (i10 = this.F0) <= 0) {
            return 0.0f;
        }
        float f12 = targetWidth / targetHeight;
        if (targetWidth < targetHeight) {
            f11 = i11;
            f10 = i10;
        } else {
            f11 = i10;
            f10 = i11;
        }
        return f12 * (f11 / f10);
    }

    private int getWorkAreaHeight() {
        return (getMeasuredHeight() - this.f21162e0) - this.f21164g0;
    }

    private int getWorkAreaWidth() {
        return (getMeasuredWidth() - this.f21161d0) - this.f21163f0;
    }

    public static float h(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    public static boolean k(float f10, float f11, int i10, int i11, int i12, int i13) {
        return f10 <= ((float) (i11 + i10)) && f10 > ((float) (i11 - i10)) && f11 <= ((float) (i13 + i10)) && f11 > ((float) (i12 - i10));
    }

    public static boolean l(float f10, float f11, int i10, int i11, int i12, int i13) {
        return f11 <= ((float) (i11 + i10)) && f11 > ((float) (i11 - i10)) && f10 <= ((float) (i13 + i10)) && f10 > ((float) (i12 - i10));
    }

    private void setActiveFactor(float f10) {
        if (this.O != f10) {
            this.O = f10;
            g();
            invalidate();
        }
    }

    private void setDragMode(int i10) {
        int i11 = this.f21167j0;
        if (i11 != i10) {
            int i12 = 0;
            if (i10 != 0) {
                i11 = 0;
            }
            this.f21168k0 = i11;
            this.f21167j0 = i10;
            if (i10 == 9) {
                i12 = 3;
            } else if (i10 != 0) {
                i12 = 1;
            }
            u(i12, true);
        }
    }

    private void setNormalizeFactor(float f10) {
        if (this.f21179v0 != f10) {
            this.f21179v0 = f10;
            double d10 = f10;
            r(this.f21180w0 + (this.A0 * d10), this.f21181x0 + (this.B0 * d10), this.f21182y0 + (this.C0 * d10), this.f21183z0 + (this.D0 * d10), true);
            AbstractC0188a aVar = this.f21157b;
            if (aVar != null) {
                aVar.b(f10);
            }
        }
    }

    public boolean b(double d10, double d11, double d12, double d13, boolean z10, boolean z11) {
        k kVar = this.f21178u0;
        if (kVar == null) {
            this.f21178u0 = new k(1, this, db.b.f7287b, 180L);
        } else {
            kVar.l(0.0f);
            this.f21179v0 = 0.0f;
        }
        if (!z10 && this.W == d10 && this.f21156a0 == d11 && this.f21158b0 == d12 && this.f21160c0 == d13) {
            return false;
        }
        double d14 = this.W;
        this.f21180w0 = d14;
        double d15 = this.f21156a0;
        this.f21181x0 = d15;
        double d16 = this.f21158b0;
        this.f21182y0 = d16;
        double d17 = this.f21160c0;
        this.f21183z0 = d17;
        this.A0 = d10 - d14;
        this.B0 = d11 - d15;
        this.C0 = d12 - d16;
        this.D0 = d13 - d17;
        this.f21178u0.y(z11 ? 120L : 180L);
        this.f21178u0.i(1.0f);
        return true;
    }

    public final void c(Rect rect, Rect rect2) {
        int i10 = this.f21161d0;
        int i11 = this.f21162e0;
        int workAreaWidth = getWorkAreaWidth();
        int workAreaHeight = getWorkAreaHeight();
        float targetWidth = getTargetWidth();
        float targetHeight = getTargetHeight();
        float min = Math.min(workAreaWidth / targetWidth, workAreaHeight / targetHeight);
        int i12 = (int) (targetWidth * min);
        int i13 = (int) (targetHeight * min);
        int i14 = (i10 + (workAreaWidth / 2)) - (i12 / 2);
        int i15 = (i11 + (workAreaHeight / 2)) - (i13 / 2);
        int i16 = i14 + i12;
        int i17 = i15 + i13;
        if (rect != null) {
            rect.set(i14, i15, i16, i17);
        }
        if (rect2 != null) {
            double d10 = i12;
            double d11 = i13;
            rect2.set(((int) Math.ceil(this.W * d10)) + i14, ((int) Math.ceil(this.f21156a0 * d11)) + i15, i14 + ((int) Math.floor(d10 * this.f21158b0)), i15 + ((int) Math.floor(d11 * this.f21160c0)));
        }
    }

    public boolean d() {
        return this.P == 0 && !this.R.i();
    }

    public final void e() {
        k kVar = this.f21178u0;
        if (kVar != null) {
            kVar.k();
        }
    }

    public final void f() {
        if (getWorkAreaWidth() > 0 && getWorkAreaHeight() > 0 && this.S > 0 && this.T > 0) {
            c(this.f21165h0, null);
            setPivotX(this.f21165h0.centerX());
            setPivotY(this.f21165h0.centerY());
        }
    }

    public final void g() {
        throw new UnsupportedOperationException("Method not decompiled: pd.a.g():void");
    }

    public float getFixedProportion() {
        int i10;
        int i11 = this.E0;
        if (i11 <= 0 || (i10 = this.F0) <= 0) {
            return 0.0f;
        }
        return i11 / i10;
    }

    public float getOriginalProportion() {
        return Math.max(this.S, this.T) / Math.min(this.S, this.T);
    }

    public int getTargetHeight() {
        return this.T;
    }

    public int getTargetWidth() {
        return this.S;
    }

    public void i(float f10) {
        setActiveFactor(f10);
        this.R.d(f10);
    }

    public final void j() {
        c(this.f21165h0, null);
        invalidate(this.f21165h0.left - a0.i(2.0f), this.f21165h0.top - a0.i(2.0f), this.f21165h0.right + a0.i(2.0f), this.f21165h0.bottom + a0.i(2.0f));
    }

    public final void m() {
        double d10;
        double d11;
        float proportion = getProportion();
        if (proportion == 0.0f) {
            e();
            return;
        }
        double d12 = this.W;
        double d13 = this.f21158b0;
        double d14 = (d12 + d13) / 2.0d;
        double d15 = this.f21156a0;
        double d16 = this.f21160c0;
        double d17 = (d15 + d16) / 2.0d;
        double d18 = d13 - d12;
        double d19 = d16 - d15;
        if (this.S < this.T) {
            d19 = d18 * proportion;
        } else {
            d18 = d19 / proportion;
        }
        double max = Math.max(1.0d, Math.max(((float) this.U) / d18, Math.max(((float) this.V) / d19, 1.0d))) * Math.min(1.0d, Math.min(1.0d / d18, 1.0d / d19));
        if (max != 1.0d) {
            d18 = Math.min(1.0d, Math.max(0.0d, d18 * max));
            d19 = Math.min(1.0d, Math.max(0.0d, d19 * max));
        }
        double d20 = d14 - (d18 / 2.0d);
        double d21 = d18 + d20;
        double d22 = d17 - (d19 / 2.0d);
        double d23 = d19 + d22;
        if (d22 < 0.0d) {
            d23 += -d22;
            d22 = 0.0d;
        } else if (d23 > 1.0d) {
            d22 -= d23 - 1.0d;
            d23 = 1.0d;
        }
        if (d20 < 0.0d) {
            d10 = d21 + (-d20);
            d11 = 0.0d;
        } else if (d21 > 1.0d) {
            d11 = d20 - (d21 - 1.0d);
            d10 = 1.0d;
        } else {
            d11 = d20;
            d10 = d21;
        }
        b(d11, d22, d10, d23, false, false);
    }

    public boolean n(boolean z10, boolean z11) {
        o();
        return b(0.0d, 0.0d, 1.0d, 1.0d, z10, z11);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setActiveFactor(f10);
        } else if (i10 == 1) {
            setNormalizeFactor(f10);
        }
    }

    public void o() {
        this.E0 = 0;
        this.F0 = 0;
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        AbstractC0188a aVar;
        if (i10 == 1 && (aVar = this.f21157b) != null) {
            aVar.a();
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: pd.a.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        f();
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r54) {
        throw new UnsupportedOperationException("Method not decompiled: pd.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(int i10, int i11, double d10, double d11, double d12, double d13, boolean z10) {
        if (this.S != i10 || this.T != i11 || this.W != d10 || this.f21156a0 != d11 || this.f21158b0 != d12 || this.f21160c0 != d13) {
            this.S = i10;
            this.T = i11;
            this.U = 18.0d / i10;
            this.V = 18.0d / i11;
            r(d10, d11, d12, d13, z10);
            f();
            invalidate();
        }
    }

    public void q(int i10) {
        double d10;
        double d11;
        double d12;
        double d13 = this.W;
        double d14 = this.f21156a0;
        double d15 = this.f21158b0;
        double d16 = this.f21160c0;
        int i11 = i10;
        int i12 = this.S;
        int i13 = this.T;
        double d17 = d16;
        double d18 = d15;
        double d19 = d13;
        double d20 = d14;
        while (i11 != 0) {
            if (d19 == 0.0d && d20 == 0.0d && d18 == 1.0d && d17 == 1.0d) {
                float f10 = i11;
                i11 = (int) (f10 + ((-Math.signum(f10)) * 90.0f));
            } else {
                if (i11 < 0) {
                    d12 = 1.0d - d19;
                    d11 = 1.0d - d18;
                    i11 += 90;
                    d10 = d17;
                    d19 = d20;
                } else {
                    d19 = 1.0d - d17;
                    d10 = 1.0d - d20;
                    i11 -= 90;
                    d12 = d18;
                    d11 = d19;
                }
                d17 = d12;
                d20 = d11;
                d18 = d10;
            }
            i12 = i13;
            i13 = i12;
        }
        p(i12, i13, d19, d20, d18, d17, true);
    }

    public final void r(double d10, double d11, double d12, double d13, boolean z10) {
        b bVar;
        if (this.W != d10 || this.f21156a0 != d11 || this.f21158b0 != d12 || this.f21160c0 != d13) {
            this.W = d10;
            this.f21156a0 = d11;
            this.f21158b0 = d12;
            this.f21160c0 = d13;
            if (z10 && (bVar = this.f21155a) != null) {
                bVar.a(d10, d11, d12, d13);
            }
            j();
        }
    }

    public final boolean s(boolean z10) {
        if (this.f21169l0 != z10) {
            this.f21169l0 = z10;
            j0.r(getContext()).n3(64, z10);
        }
        return z10;
    }

    public void setNormalizeListener(AbstractC0188a aVar) {
        this.f21157b = aVar;
    }

    public void setOffsetBottom(int i10) {
        if (this.f21164g0 != i10) {
            this.f21164g0 = i10;
            f();
            invalidate();
        }
    }

    public void setRectChangeListener(b bVar) {
        this.f21155a = bVar;
    }

    public void setRotateModeChangeListener(c cVar) {
        this.f21159c = cVar;
    }

    public void t(int i10, int i11) {
        if (this.E0 != i10 || this.F0 != i11) {
            this.E0 = i10;
            this.F0 = i11;
            m();
        }
    }

    public void u(int i10, boolean z10) {
        int i11 = this.P;
        if (i11 != i10) {
            boolean z11 = i10 != 0;
            if (z11) {
                i11 = 0;
            }
            this.Q = i11;
            this.P = i10;
            g();
            if (z10) {
                this.R.p(z11, true);
                return;
            }
            this.R.c();
            this.R.e(z11);
        }
    }

    public void v(int i10, int i11, int i12, int i13) {
        if (this.f21161d0 != i10 || this.f21162e0 != i11 || this.f21163f0 != i12 || this.f21164g0 != i13) {
            this.f21161d0 = i10;
            this.f21162e0 = i11;
            this.f21163f0 = i12;
            this.f21164g0 = i13;
            f();
            invalidate();
        }
    }

    public final void w(float f10, float f11) {
    }
}
