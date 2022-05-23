package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c;
import ce.j0;
import ce.p0;
import ce.y;
import db.b;
import eb.k;
import ib.h;
import ib.i;
import oc.v0;
import yd.d;

public class c0 extends View implements k.b {
    public boolean M;
    public int N;
    public int O;
    public int P;
    public String Q;
    public float R;
    public boolean S;
    public float T;
    public float U;
    public Drawable V;
    public float W;
    public Drawable f17889a;
    public int f17890a0;
    public int f17891b;
    public k f17892b0;
    public int f17893c;
    public float f17894c0;
    public boolean f17895d0;
    public k f17896e0;
    public float f17897f0 = 1.0f;
    public float f17898g0;
    public boolean f17899h0;
    public k f17900i0;
    public m2 f17901j0;
    public k f17902k0;
    public float f17903l0;
    public boolean f17904m0;
    public float f17905n0;
    public k f17906o0;
    public Paint f17907p0;

    public c0(Context context) {
        super(context);
        p0.T(this);
    }

    private void setDragFactor(float f10) {
        if (this.f17898g0 != f10) {
            this.f17898g0 = f10;
            o();
        }
    }

    private void setIconRotationInternal(float f10) {
        float f11 = f10 % 360.0f;
        if (this.f17905n0 != f11) {
            this.f17905n0 = f11;
            invalidate();
        }
    }

    public final void a() {
        Drawable drawable = this.V;
        if (drawable != null) {
            this.f17889a = drawable;
            this.f17891b = this.f17890a0;
            this.V = null;
        }
    }

    public void b() {
        m2 m2Var = this.f17901j0;
        if (m2Var != null) {
            m2Var.b(this);
        }
    }

    public final Paint c(int i10) {
        Paint paint = this.f17907p0;
        if (paint == null || paint.getColor() != i10) {
            this.f17907p0 = y.c(this.f17907p0, i10);
        }
        return this.f17907p0;
    }

    public final void d(int i10, float f10, float f11, int i11, int i12) {
        e(i10, 0, f10, f11, i11, i12);
    }

    public void e(int i10, int i11, float f10, float f11, int i12, int i13) {
        this.f17889a = c.f(i10);
        this.f17891b = i11;
        this.N = i12;
        this.M = true;
        this.f17893c = i13;
        d.c(this, f10, f11, i12);
    }

    public boolean f() {
        return this.f17904m0;
    }

    public void g(int i10) {
        h(i10, 0);
    }

    public void h(int i10, int i11) {
        this.V = c.f(i10);
        this.f17890a0 = i11;
        if (this.f17892b0 == null) {
            this.f17892b0 = new k(0, this, b.f7287b, 220L);
        }
        if (!this.f17892b0.v()) {
            k kVar = this.f17892b0;
            this.W = 0.0f;
            kVar.l(0.0f);
        } else if (this.f17892b0.o() >= 0.5f) {
            k kVar2 = this.f17892b0;
            float o10 = kVar2.o() - 0.5f;
            this.W = o10;
            kVar2.l(o10);
        }
        this.f17892b0.i(1.0f);
    }

    public void i(int i10, int i11) {
        this.O = i10;
        this.P = i11;
    }

    public void j(int i10, int i11, float f10) {
        d.a(this, i10, i11, f10);
    }

    public void k(int i10, int i11) {
        this.f17889a = c.f(i10);
        this.f17891b = i11;
        invalidate();
    }

    public void l(float f10, boolean z10) {
        if (z10) {
            if (this.f17906o0 == null) {
                float f11 = this.f17905n0;
                if (f11 != f10) {
                    this.f17906o0 = new k(3, this, b.f7287b, 180L, f11);
                } else {
                    return;
                }
            }
            this.f17906o0.i(f10);
            return;
        }
        k kVar = this.f17906o0;
        if (kVar != null) {
            kVar.l(f10);
        }
        setIconRotationInternal(f10);
    }

    public void m(boolean z10, boolean z11) {
        if (this.f17895d0 != z10) {
            this.f17895d0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.f17896e0 == null) {
                    this.f17896e0 = new k(2, this, b.f7287b, 100L, this.f17894c0);
                }
                if (f10 == 0.0f && this.f17894c0 == 1.0f) {
                    this.f17896e0.B(b.f7291f);
                    this.f17896e0.y(290L);
                } else {
                    this.f17896e0.B(b.f7287b);
                    this.f17896e0.y(140L);
                }
                this.f17896e0.i(f10);
                return;
            }
            k kVar = this.f17896e0;
            if (kVar != null) {
                kVar.l(f10);
            }
            setHideFactor(f10);
        }
    }

    public void n(boolean z10, float f10) {
        if (this.T != f10) {
            this.T = f10;
            this.S = z10;
            d.a(this, this.N, this.O, f10);
            invalidate();
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    setHideFactor(f10);
                } else if (i10 == 3) {
                    setDragFactor(f10);
                }
            } else if (this.f17903l0 != f10) {
                this.f17903l0 = f10;
                this.f17901j0.o(h.d(f10 < 0.5f ? 0.0f : (f10 - 0.5f) / 0.5f));
                invalidate();
            }
        } else if (this.W != f10) {
            this.W = f10;
            if (f10 > 0.5f) {
                a();
            }
            invalidate();
        }
    }

    public final void o() {
        float f10 = this.f17894c0;
        float f11 = (((1.0f - f10) * 0.4f) + 0.6f + (this.f17898g0 * 0.2f * (1.0f - f10))) * this.f17897f0;
        setScaleX(f11);
        setScaleY(f11);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0) {
            a();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        int measuredWidth = ((int) (getMeasuredWidth() * 0.5f)) + this.f17891b;
        int measuredHeight = (int) (getMeasuredHeight() * 0.5f);
        boolean z10 = !i.i(this.Q);
        if (this.f17889a != null) {
            int L = this.M ? j.L(this.f17893c) : this.f17893c;
            int i10 = this.P;
            int d10 = ib.d.d(L, i10 != 0 ? j.L(i10) : L, this.T);
            Paint c10 = c(L);
            int alpha = c10.getAlpha();
            float f10 = this.T;
            if (f10 == 0.0f) {
                float f11 = this.W;
                float f12 = (1.0f - (f11 <= 0.5f ? f11 / 0.5f : 1.0f - ((f11 - 0.5f) / 0.5f))) * (1.0f - this.f17903l0);
                boolean z11 = f12 != 1.0f;
                if (z11) {
                    canvas.save();
                    float f13 = (0.4f * f12) + 0.6f;
                    canvas.scale(f13, f13, measuredWidth, measuredHeight);
                    c10.setAlpha((int) (alpha * f12));
                }
                boolean z12 = this.f17905n0 != 0.0f;
                if (z12) {
                    canvas.save();
                    canvas.rotate(this.f17905n0, measuredWidth, measuredHeight);
                }
                if (z10) {
                    canvas.drawText(this.Q, measuredWidth - (this.R / 2.0f), a0.i(17.0f) + measuredHeight, y.c0(14.0f, ib.d.a(f12, L)));
                }
                c.b(canvas, this.f17889a, measuredWidth - (drawable2.getMinimumWidth() / 2), (measuredHeight - (this.f17889a.getMinimumHeight() / 2)) - (z10 ? a0.i(8.0f) : 0), c10);
                if (z12) {
                    canvas.restore();
                }
                if (z11) {
                    c10.setAlpha(alpha);
                    canvas.restore();
                }
                m2 m2Var = this.f17901j0;
                if (m2Var != null && this.f17903l0 >= 0.5f) {
                    m2Var.d(L);
                    this.f17901j0.c(canvas);
                }
            } else {
                float f14 = f10 * (this.S ? -135.0f : 135.0f);
                boolean z13 = f14 != 0.0f;
                if (z13) {
                    canvas.save();
                    canvas.rotate(f14, measuredWidth, measuredHeight);
                }
                float f15 = this.T;
                if (f15 <= 0.85f) {
                    c10.setAlpha((int) (alpha * (1.0f - (f15 / 0.85f))));
                    c.b(canvas, this.f17889a, measuredWidth - (drawable.getMinimumWidth() / 2), measuredHeight - (this.f17889a.getMinimumHeight() / 2), c10);
                    c10.setAlpha(alpha);
                }
                float f16 = this.T;
                if (f16 >= 0.15f) {
                    float f17 = (f16 - 0.15f) / 0.85f;
                    int i11 = a0.i(1.0f);
                    int i12 = (int) (a0.i(7.0f) * f17);
                    Paint g10 = y.g(ib.d.a(f17, d10));
                    canvas.drawRect(measuredWidth - i11, measuredHeight - i12, measuredWidth + i11, measuredHeight + i12, g10);
                    canvas.drawRect(measuredWidth - i12, measuredHeight - i11, i12 + measuredWidth, i11 + measuredHeight, g10);
                }
                if (z13) {
                    canvas.restore();
                }
            }
            if (this.U > 0.0f) {
                ce.b.j(canvas, measuredWidth, measuredHeight - a0.i(6.0f), this.U, L, d.b(this), a0.i(27.0f));
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() != 0 || (getAlpha() != 0.0f && isEnabled() && (getParent() == null || ((View) getParent()).getAlpha() != 0.0f))) && super.onTouchEvent(motionEvent);
    }

    public void setBaseScale(float f10) {
        if (this.f17897f0 != f10) {
            this.f17897f0 = f10;
            o();
        }
    }

    public void setBottomText(String str) {
        if (str != null && str.isEmpty()) {
            str = null;
        }
        if (!i.c(this.Q, str)) {
            this.Q = str;
            this.R = v0.T1(str, y.b0(14.0f));
            invalidate();
        }
    }

    public void setCrossFactor(float f10) {
        if (this.U != f10) {
            this.U = f10;
            invalidate();
        }
    }

    public void setCustomIconColor(int i10) {
        if (this.M || this.f17893c != i10) {
            this.M = false;
            this.f17893c = i10;
            invalidate();
        }
    }

    public void setHideFactor(float f10) {
        if (this.f17894c0 != f10) {
            this.f17894c0 = f10;
            o();
            setAlpha(h.d(1.0f - f10));
        }
    }

    public void setIcon(int i10) {
        k(i10, 0);
    }

    public void setIconColorId(int i10) {
        if (!this.M || this.f17893c != i10) {
            this.M = true;
            this.f17893c = i10;
            invalidate();
        }
    }

    public void setInProgress(boolean z10) {
        if (this.f17904m0 != z10) {
            this.f17904m0 = z10;
            float f10 = 0.0f;
            if (this.f17901j0 == null) {
                m2 m2Var = new m2(j0.r(getContext()), a0.i(8.0f));
                this.f17901j0 = m2Var;
                m2Var.B();
                this.f17901j0.y();
                this.f17901j0.d(-1);
                this.f17901j0.o(0.0f);
                this.f17901j0.p(0, 0, getLayoutParams().width, getLayoutParams().height);
                this.f17901j0.a(this);
            }
            if (this.f17902k0 == null) {
                this.f17902k0 = new k(1, this, b.f7287b, 220L);
            }
            k kVar = this.f17902k0;
            if (z10) {
                f10 = 1.0f;
            }
            kVar.i(f10);
        }
    }

    public void setIsDragging(boolean z10) {
        if (this.f17899h0 != z10) {
            this.f17899h0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (this.f17900i0 == null) {
                this.f17900i0 = new k(3, this, b.f7287b, 180L, this.f17898g0);
            }
            this.f17900i0.i(f10);
        }
    }
}
