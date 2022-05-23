package uc;

import ae.j;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import ce.a0;
import ce.c;
import ce.p0;
import ce.y;
import db.g;
import eb.f;
import eb.k;
import gd.w;
import org.thunderdog.challegram.R;
import ud.x2;

public class d extends View implements k.b, x2.f {
    public float M;
    public k N;
    public boolean O;
    public boolean P;
    public Drawable Q;
    public RectF R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public Paint f24031a;
    public float f24032a0;
    public boolean f24033b;
    public float f24034b0;
    public f f24035c;
    public int f24036c0;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect((int) (d.this.W - d.this.f24034b0), (int) (d.this.f24032a0 - d.this.f24034b0), (int) (d.this.W + d.this.f24034b0), (int) (d.this.f24032a0 + d.this.f24034b0), d.this.f24034b0);
        }
    }

    public class b extends Drawable {
        public b() {
        }

        @Override
        public void draw(Canvas canvas) {
            int i10;
            int i11;
            if (d.this.O) {
                i11 = j.L(R.id.theme_color_togglerNegativeBackground);
                i10 = j.L(R.id.theme_color_togglerPositiveBackground);
            } else {
                i11 = j.a1();
                i10 = j.Y0();
            }
            canvas.drawRoundRect(d.this.R, d.this.S, d.this.S, y.g(ib.d.d(i11, i10, !d.this.O && d.this.p() ? 0.0f : d.this.M)));
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i10) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public d(Context context) {
        super(context);
    }

    @Override
    public void d1(View view, Rect rect) {
        int i10 = a0.i(2.0f);
        float f10 = this.W;
        float f11 = this.f24034b0;
        float f12 = i10;
        float f13 = this.f24032a0;
        rect.set((int) ((f10 - f11) - f12), (int) ((f13 - f11) - f12), (int) (f10 + f11 + f12), (int) (f13 + f11 + f12));
    }

    public float getFactor() {
        return this.M;
    }

    @Override
    public boolean isEnabled() {
        return this.f24033b;
    }

    public final void k() {
        int i10;
        if (this.R == null) {
            this.R = new RectF();
        }
        int i11 = a0.i(58.0f);
        int i12 = a0.i(34.0f) + a0.i(4.0f);
        RectF rectF = this.R;
        int i13 = this.f24036c0;
        rectF.left = (i13 - i11) + i10;
        rectF.right = (i13 - i11) + i12;
        int i14 = a0.i(20.0f);
        int i15 = a0.i(14.0f) + i14;
        RectF rectF2 = this.R;
        rectF2.top = i14;
        rectF2.bottom = i15;
        this.f24034b0 = a0.k(10.0f);
        this.S = a0.i(7.0f);
        float i16 = a0.i(3.0f);
        RectF rectF3 = this.R;
        float f10 = this.f24034b0;
        float f11 = (rectF3.left - i16) + f10;
        this.T = f11;
        float f12 = (rectF3.right + i16) - f10;
        this.U = f12;
        this.V = f12 - f11;
        this.f24032a0 = (rectF3.top - i16) + f10;
        u();
    }

    public void m(boolean z10) {
        if (p0.V(this, (w.G2() ? 3 : 5) | 16) && z10) {
            p0.r0(this);
            if (this.f24036c0 > 0) {
                k();
                invalidate();
            }
        }
    }

    public void n(boolean z10) {
        r(z10, false);
        o();
        setOutlineProvider(new a());
        setElevation(Math.max(1, a0.i(0.5f)));
        setTranslationZ(Math.max(1, a0.i(0.5f)));
        g.d(this, new b());
        k();
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setFactor(f10);
        } else if (i10 == 1) {
            invalidate();
        }
    }

    public final void o() {
        Paint paint = new Paint(7);
        this.f24031a = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        Drawable drawable;
        f fVar;
        if (this.O) {
            j.L(R.id.theme_color_togglerNegativeBackground);
            i12 = j.L(R.id.theme_color_togglerNegative);
            j.L(R.id.theme_color_togglerPositiveBackground);
            i11 = j.L(R.id.theme_color_togglerPositive);
            i10 = ib.d.d(j.L(R.id.theme_color_togglerNegativeContent), j.L(R.id.theme_color_togglerPositiveContent), this.M);
        } else {
            j.a1();
            i12 = j.Z0();
            j.Y0();
            i11 = j.X0();
            i10 = 0;
        }
        this.f24031a.setColor(ib.d.d(i12, i11, this.M * (1.0f - ((this.O || (fVar = this.f24035c) == null) ? 0.0f : fVar.g()))));
        canvas.drawCircle(this.W, this.f24032a0, this.f24034b0, this.f24031a);
        if (this.P) {
            c.b(canvas, this.Q, this.W - (drawable.getMinimumWidth() / 2), this.f24032a0 - (this.Q.getMinimumHeight() / 2), y.W(i10));
        } else if (this.O) {
            Paint Y = y.Y(i10, a0.i(2.0f));
            float f10 = this.W;
            float f11 = ((int) (this.f24034b0 * 0.75f)) / 2;
            float i13 = (int) (a0.i(1.5f) * this.M);
            float f12 = this.f24032a0;
            float i14 = (int) (a0.i(0.5f) * this.M);
            canvas.drawLine((f10 - f11) + i13, f12 + f11 + i14, i13 + f10 + f11, (f12 - f11) + i14, Y);
            float f13 = this.M;
            float f14 = this.W;
            float i15 = (int) (a0.i(-3.5f) * this.M);
            float i16 = (int) (a0.i(0.5f) * this.M);
            float i17 = (int) (a0.i(0.5f) * f13);
            float f15 = this.f24032a0;
            float i18 = (int) (a0.i(3.0f) * this.M);
            canvas.drawLine((f14 - f11) + i15 + i16 + i17, i17 + (f15 - f11) + i18 + i14, i16 + f14 + ((1.0f - f13) * f11) + i15, f15 + (f11 * (1.0f - f13)) + i18 + i14, Y);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        if (this.f24036c0 != measuredWidth) {
            this.f24036c0 = measuredWidth;
            k();
        }
    }

    public final boolean p() {
        f fVar = this.f24035c;
        return fVar != null && fVar.h();
    }

    public void q(boolean z10, boolean z11) {
        f fVar = this.f24035c;
        if (fVar != null || z10) {
            if (fVar == null) {
                this.f24035c = new f(1, this, db.b.f7287b, 168L);
            }
            this.f24035c.p(z10, z11);
        }
    }

    public void r(boolean z10, boolean z11) {
        if (this.f24033b != z10) {
            this.f24033b = z10;
            float f10 = 1.0f;
            if (z11) {
                if (this.N == null) {
                    this.N = new k(0, this, db.b.f7287b, 180L, this.M);
                }
                k kVar = this.N;
                if (!z10) {
                    f10 = 0.0f;
                }
                kVar.i(f10);
                return;
            }
            k kVar2 = this.N;
            if (kVar2 != null) {
                kVar2.l(z10 ? 1.0f : 0.0f);
            }
            if (!z10) {
                f10 = 0.0f;
            }
            setFactor(f10);
        }
    }

    public d s(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            invalidate();
        }
        return this;
    }

    public void setFactor(float f10) {
        if (this.M != f10) {
            this.M = f10;
            u();
            invalidate();
            invalidateOutline();
        }
    }

    public void setShowLock(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (this.Q == null) {
                this.Q = c.g(getResources(), R.drawable.baseline_lock_14);
            }
            invalidate();
        }
    }

    public boolean t(boolean z10) {
        r(!this.f24033b, z10);
        return this.f24033b;
    }

    public final void u() {
        if (w.G2()) {
            float f10 = this.M;
            this.W = f10 == 0.0f ? this.U : f10 == 1.0f ? this.T : this.U - (f10 * this.V);
            return;
        }
        float f11 = this.M;
        this.W = f11 == 0.0f ? this.T : f11 == 1.0f ? this.U : (f11 * this.V) + this.T;
    }
}
