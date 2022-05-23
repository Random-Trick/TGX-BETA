package od;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.y;
import db.b;
import eb.k;
import ib.d;
import org.thunderdog.challegram.R;

public class p1 extends View implements k.b {
    public int M;
    public float N;
    public float O;
    public k P;
    public int Q;
    public int R;
    public k S;
    public int T;
    public int U;
    public boolean V;
    public k W;
    public float f19824a0;
    public int f19825b;
    public float f19826b0;
    public boolean f19827c;
    public k f19828c0;
    public k f19830e0;
    public long f19831f0;
    public a f19832g0;
    public float f19833h0;
    public int f19834i0;
    public int f19835j0;
    public int f19823a = R.id.theme_color_sliderActive;
    public float f19829d0 = -1.0f;

    public interface a {
        boolean A4(p1 p1Var);

        void O2(p1 p1Var, boolean z10);

        void Y0(p1 p1Var, float f10);
    }

    public p1(Context context) {
        super(context);
    }

    private float getSmallValue() {
        k kVar = this.f19830e0;
        return kVar != null ? kVar.o() : this.f19829d0;
    }

    private int getTotalPaddingLeft() {
        return getPaddingLeft() + this.f19834i0;
    }

    private int getTotalPaddingRight() {
        return getPaddingRight() + this.f19835j0;
    }

    private void setColorId(int i10) {
        if (this.f19823a != i10) {
            this.f19823a = i10;
            invalidate();
        }
    }

    private void setEnableFactor(float f10) {
        if (this.f19826b0 != f10) {
            this.f19826b0 = f10;
            invalidate();
        }
    }

    private void setIsUp(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            getParent().requestDisallowInterceptTouchEvent(z10);
            if (this.W == null) {
                this.W = new k(1, this, b.f7287b, 180L);
            }
            this.W.i(z10 ? 1.0f : 0.0f);
            a aVar = this.f19832g0;
            if (aVar != null) {
                aVar.O2(this, z10);
            }
        }
    }

    private void setUpFactor(float f10) {
        if (this.f19824a0 != f10) {
            this.f19824a0 = f10;
            invalidate();
        }
    }

    public final void a(float f10) {
        if (this.f19828c0 == null) {
            float f11 = this.f19826b0;
            if (f11 != f10) {
                this.f19828c0 = new k(2, this, b.f7287b, 180L, f11);
            } else {
                return;
            }
        }
        this.f19828c0.i(f10);
    }

    public void b(float f10) {
        k kVar = this.P;
        if (kVar != null) {
            kVar.k();
        }
        float f11 = this.N;
        if (f11 != f10) {
            k kVar2 = this.P;
            if (kVar2 == null) {
                this.P = new k(3, this, b.f7287b, 180L, f11);
            } else {
                kVar2.l(f11);
            }
            this.P.i(f10);
        }
    }

    public final void c(float f10) {
        if (this.N != f10) {
            this.N = f10;
            invalidate();
            a aVar = this.f19832g0;
            if (aVar != null) {
                aVar.Y0(this, f10);
            }
        }
    }

    public final int d() {
        float f10;
        float f11;
        int totalPaddingLeft = getTotalPaddingLeft();
        int measuredWidth = (getMeasuredWidth() - getTotalPaddingRight()) - totalPaddingLeft;
        if (this.f19825b == 1) {
            int i10 = measuredWidth / 2;
            totalPaddingLeft += i10;
            f10 = i10;
            f11 = this.N;
        } else {
            f10 = measuredWidth;
            f11 = this.N;
        }
        return totalPaddingLeft + ((int) (f10 * f11));
    }

    public final int e() {
        return getPaddingTop() + (((getMeasuredHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
    }

    public final void f(float f10) {
        k kVar = this.f19828c0;
        if (kVar != null) {
            kVar.l(f10);
        }
        setEnableFactor(f10);
    }

    public void g(int i10, boolean z10) {
        if (z10) {
            k kVar = this.S;
            if (kVar != null) {
                kVar.k();
            } else if (this.f19823a != i10) {
                this.S = new k(0, this, b.f7287b, 180L, 0.0f);
            } else {
                return;
            }
            int i11 = this.f19823a;
            if (i11 != i10) {
                this.T = i11;
                this.U = i10;
                this.S.l(0.0f);
                this.S.i(1.0f);
                return;
            }
            return;
        }
        k kVar2 = this.S;
        if (kVar2 != null) {
            kVar2.l(0.0f);
        }
        setColorId(i10);
    }

    public float getSecondaryValue() {
        return this.O;
    }

    public float getValue() {
        return this.N;
    }

    public void h(boolean z10, boolean z11) {
        if (this.f19827c != z10) {
            this.f19827c = z10;
            float f10 = 1.0f;
            if (z11) {
                if (!z10) {
                    f10 = 0.0f;
                }
                a(f10);
                return;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            f(f10);
        }
    }

    public void i(float r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: od.p1.i(float, boolean):void");
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            invalidate();
        } else if (i10 == 1) {
            setUpFactor(f10);
        } else if (i10 == 2) {
            setEnableFactor(f10);
        } else if (i10 == 3) {
            setValue(f10);
        } else if (i10 == 4) {
            invalidate(getTotalPaddingLeft(), 0, getMeasuredWidth() - getTotalPaddingRight(), getMeasuredHeight());
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0 && f10 == 1.0f) {
            this.f19823a = this.U;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        int i14;
        float f12;
        int i15;
        int i16;
        int i17 = a0.i(1.0f);
        int totalPaddingLeft = getTotalPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getTotalPaddingRight();
        int e10 = e();
        int i18 = e10 - i17;
        int i19 = e10 + i17;
        int i20 = measuredWidth - totalPaddingLeft;
        float smallValue = getSmallValue();
        float f13 = (1.0f - this.f19826b0) * 0.65f;
        k kVar = this.S;
        int L = (kVar == null || !kVar.v()) ? j.L(this.f19823a) : d.d(j.L(this.T), j.L(this.U), this.S.o());
        if (f13 > 0.0f) {
            L = d.c(L, d.b((int) (f13 * 255.0f), 0));
        }
        int i21 = this.Q;
        int L2 = i21 != 0 ? j.L(i21) : d.b(68, L);
        int i22 = this.R;
        int L3 = i22 != 0 ? j.L(i22) : d.b(136, L);
        int i23 = a0.i(4.5f);
        int i24 = a0.i(2.5f);
        RectF a02 = y.a0();
        int i25 = i24;
        float f14 = totalPaddingLeft;
        float f15 = i18;
        float f16 = i19;
        a02.set(f14, f15, measuredWidth, f16);
        int i26 = this.M;
        if (i26 > 1) {
            int i27 = i20 / (i26 - 1);
            int i28 = totalPaddingLeft;
            f10 = smallValue;
            i11 = L;
            int i29 = 0;
            for (int i30 = 1; i29 < this.M - i30; i30 = 1) {
                i28 += i27;
                i27 = i27;
                i23 = i23;
                a02.set(i28 + i23, a02.top, i28 - i23, a02.bottom);
                float f17 = i17;
                canvas.drawRoundRect(a02, f17, f17, y.g(L2));
                i29++;
            }
            i10 = i23;
        } else {
            f10 = smallValue;
            i11 = L;
            i10 = i23;
            float f18 = i17;
            canvas.drawRoundRect(a02, f18, f18, y.g(L2));
        }
        if (this.O > 0.0f && this.f19825b == 0) {
            a02.set(f14, f15, ((int) (i20 * f11)) + totalPaddingLeft, f16);
            float f19 = i17;
            canvas.drawRoundRect(a02, f19, f19, y.g(L3));
        }
        if (this.f19825b == 1) {
            int i31 = i20 / 2;
            i12 = ((int) (i31 * this.N)) + totalPaddingLeft + i31;
            a02.set(Math.min(i16, i12), f15, Math.max(i16, i12), f16);
        } else {
            i12 = ((int) (i20 * this.N)) + totalPaddingLeft;
            a02.set(f14, f15, i12, f16);
        }
        int i32 = this.M;
        if (i32 > 1) {
            float f20 = a02.left;
            float f21 = a02.right;
            int i33 = i20 / (i32 - 1);
            int i34 = totalPaddingLeft;
            int i35 = 0;
            for (int i36 = 1; i35 < this.M - i36; i36 = 1) {
                float f22 = i34;
                if (f22 < f20 || f22 > f21) {
                    i15 = totalPaddingLeft;
                    f12 = f20;
                } else {
                    i15 = totalPaddingLeft;
                    float f23 = i10;
                    f12 = f20;
                    a02.set(Math.max(f20, f22) + f23, a02.top, Math.min(f21, i34 + i33) - f23, a02.bottom);
                    float f24 = i17;
                    canvas.drawRoundRect(a02, f24, f24, y.g(i11));
                }
                i34 += i33;
                i35++;
                totalPaddingLeft = i15;
                f20 = f12;
            }
            i13 = totalPaddingLeft;
        } else {
            i13 = totalPaddingLeft;
            float f25 = i17;
            canvas.drawRoundRect(a02, f25, f25, y.g(i11));
        }
        int i37 = f10 != -1.0f ? (int) (f14 + (i20 * f10)) : -1;
        int i38 = a0.i(3.5f);
        if (i37 != -1) {
            i14 = e10;
            canvas.drawCircle(i37, i14, i38, y.g(i37 > i12 ? L2 : i11));
        } else {
            i14 = e10;
        }
        int i39 = this.M;
        if (i39 > 1) {
            int i40 = i20 / (i39 - 1);
            int i41 = i13;
            int i42 = 0;
            while (i42 < this.M) {
                int i43 = i25;
                canvas.drawCircle(i41, i14, i43, y.g(i41 > i12 ? L2 : i11));
                i41 += i40;
                i42++;
                i25 = i43;
            }
        }
        int i44 = a0.i(6.0f) + ((int) (a0.i(4.0f) * this.f19824a0));
        float f26 = i14;
        canvas.drawCircle(i12, f26, i44, y.g(i11));
        if (i37 != -1 && Math.abs(i12 - i37) < i44 + i38) {
            canvas.save();
            int i45 = i12 + i44;
            canvas.clipRect(i12 - i44, i14 - i44, i45, i14 + i44);
            canvas.drawCircle(i37, f26, i38, y.g(d.d(j.u(), L2, (i37 <= i45 || i37 >= i45 + i38) ? 0.0f : ((i37 - i12) - i44) / i38)));
            canvas.restore();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k kVar;
        a aVar;
        float f10;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (!this.V) {
                            return false;
                        }
                        setIsUp(false);
                        return true;
                    }
                } else if (this.V) {
                    float f11 = x10 - this.f19833h0;
                    int totalPaddingLeft = getTotalPaddingLeft();
                    int measuredWidth = (getMeasuredWidth() - getTotalPaddingRight()) - totalPaddingLeft;
                    if (this.f19825b == 1) {
                        int i10 = measuredWidth / 2;
                        f10 = Math.max(-1.0f, Math.min(1.0f, (f11 - (totalPaddingLeft + i10)) / i10));
                    } else {
                        f10 = Math.max(0.0f, Math.min(1.0f, (f11 - totalPaddingLeft) / measuredWidth));
                    }
                    c(f10);
                    return true;
                }
            } else if (this.V) {
                setIsUp(false);
                return true;
            }
            return this.V;
        }
        int d10 = d();
        int e10 = e();
        int i11 = a0.i(24.0f);
        if (x10 < d10 - i11 || x10 > d10 + i11 || y10 < e10 - i11 || y10 > e10 + i11 || !this.f19827c || (((kVar = this.P) != null && kVar.v()) || ((aVar = this.f19832g0) != null && !aVar.A4(this)))) {
            return false;
        }
        this.f19833h0 = x10 - d10;
        setIsUp(true);
        return true;
    }

    public void setAddPaddingLeft(int i10) {
        if (this.f19834i0 != i10) {
            this.f19834i0 = i10;
            invalidate();
        }
    }

    public void setAddPaddingRight(int i10) {
        if (this.f19835j0 != i10) {
            this.f19835j0 = i10;
            invalidate();
        }
    }

    public void setAnchorMode(int i10) {
        this.f19825b = i10;
    }

    public void setForceBackgroundColorId(int i10) {
        this.Q = i10;
    }

    public void setForceSecondaryColorId(int i10) {
        this.R = i10;
    }

    public void setListener(a aVar) {
        this.f19832g0 = aVar;
    }

    public void setSecondaryValue(float f10) {
        if (this.O != f10) {
            this.O = f10;
            invalidate();
        }
    }

    public void setValue(float f10) {
        if (this.N != f10) {
            this.N = f10;
            invalidate();
        }
    }

    public void setValueCount(int i10) {
        if (this.M != i10) {
            this.M = i10;
            invalidate();
        }
    }
}
