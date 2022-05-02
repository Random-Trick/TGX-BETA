package tc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import be.C1357a0;
import be.C1362c;
import be.C1399s0;
import be.C1410y;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5064d;
import p364zd.C11524j;
import td.C9357x2;

public class C9139d extends View implements C3950k.AbstractC3952b, C9357x2.AbstractC9363f {
    public float f29466M;
    public C3950k f29467N;
    public boolean f29468O;
    public boolean f29469P;
    public Drawable f29470Q;
    public RectF f29471R;
    public float f29472S;
    public float f29473T;
    public float f29474U;
    public float f29475V;
    public float f29476W;
    public Paint f29477a;
    public float f29478a0;
    public boolean f29479b;
    public float f29480b0;
    public C3940f f29481c;
    public int f29482c0;

    public class C9140a extends ViewOutlineProvider {
        public C9140a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect((int) (C9139d.this.f29476W - C9139d.this.f29480b0), (int) (C9139d.this.f29478a0 - C9139d.this.f29480b0), (int) (C9139d.this.f29476W + C9139d.this.f29480b0), (int) (C9139d.this.f29478a0 + C9139d.this.f29480b0), C9139d.this.f29480b0);
        }
    }

    public class C9141b extends Drawable {
        public C9141b() {
        }

        @Override
        public void draw(Canvas canvas) {
            int i;
            int i2;
            if (C9139d.this.f29468O) {
                i2 = C11524j.m228N(R.id.theme_color_togglerNegativeBackground);
                i = C11524j.m228N(R.id.theme_color_togglerPositiveBackground);
            } else {
                i2 = C11524j.m191d1();
                i = C11524j.m197b1();
            }
            canvas.drawRoundRect(C9139d.this.f29471R, C9139d.this.f29472S, C9139d.this.f29472S, C1410y.m37042g(C5064d.m24129d(i2, i, !C9139d.this.f29468O && C9139d.this.m10187p() ? 0.0f : C9139d.this.f29466M)));
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public C9139d(Context context) {
        super(context);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setFactor(f);
        } else if (i == 1) {
            invalidate();
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        int i = C1357a0.m37544i(2.0f);
        float f = this.f29476W;
        float f2 = this.f29480b0;
        float f3 = i;
        float f4 = this.f29478a0;
        rect.set((int) ((f - f2) - f3), (int) ((f4 - f2) - f3), (int) (f + f2 + f3), (int) (f4 + f2 + f3));
    }

    public float getFactor() {
        return this.f29466M;
    }

    @Override
    public boolean isEnabled() {
        return this.f29479b;
    }

    public final void m10191k() {
        int i;
        if (this.f29471R == null) {
            this.f29471R = new RectF();
        }
        int i2 = C1357a0.m37544i(58.0f);
        int i3 = C1357a0.m37544i(34.0f) + C1357a0.m37544i(4.0f);
        RectF rectF = this.f29471R;
        int i4 = this.f29482c0;
        rectF.left = (i4 - i2) + i;
        rectF.right = (i4 - i2) + i3;
        int i5 = C1357a0.m37544i(20.0f);
        int i6 = C1357a0.m37544i(14.0f) + i5;
        RectF rectF2 = this.f29471R;
        rectF2.top = i5;
        rectF2.bottom = i6;
        this.f29480b0 = C1357a0.m37542k(10.0f);
        this.f29472S = C1357a0.m37544i(7.0f);
        float i7 = C1357a0.m37544i(3.0f);
        RectF rectF3 = this.f29471R;
        float f = this.f29480b0;
        float f2 = (rectF3.left - i7) + f;
        this.f29473T = f2;
        float f3 = (rectF3.right + i7) - f;
        this.f29474U = f3;
        this.f29475V = f3 - f2;
        this.f29478a0 = (rectF3.top - i7) + f;
        m10182u();
    }

    public void m10190m(boolean z) {
        if (C1399s0.m37192c0(this, (C4403w.m27986G2() ? 3 : 5) | 16) && z) {
            C1399s0.m37148y0(this);
            if (this.f29482c0 > 0) {
                m10191k();
                invalidate();
            }
        }
    }

    public void m10189n(boolean z) {
        m10185r(z, false);
        m10188o();
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C9140a());
            setElevation(Math.max(1, C1357a0.m37544i(0.5f)));
            setTranslationZ(Math.max(1, C1357a0.m37544i(0.5f)));
            C2065g.m35721d(this, new C9141b());
        } else {
            setLayerType(1, this.f29477a);
        }
        m10191k();
    }

    public final void m10188o() {
        Paint paint = new Paint(7);
        this.f29477a = paint;
        paint.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT < 21) {
            float max = Math.max(1.0f, C1357a0.m37542k(0.5f));
            this.f29477a.setShadowLayer(max, 0.0f, max, 2046820352);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Drawable drawable;
        C3940f fVar;
        if (this.f29468O) {
            i5 = C11524j.m228N(R.id.theme_color_togglerNegativeBackground);
            i4 = C11524j.m228N(R.id.theme_color_togglerNegative);
            i3 = C11524j.m228N(R.id.theme_color_togglerPositiveBackground);
            i2 = C11524j.m228N(R.id.theme_color_togglerPositive);
            i = C5064d.m24129d(C11524j.m228N(R.id.theme_color_togglerNegativeContent), C11524j.m228N(R.id.theme_color_togglerPositiveContent), this.f29466M);
        } else {
            i5 = C11524j.m191d1();
            i4 = C11524j.m194c1();
            i3 = C11524j.m197b1();
            i2 = C11524j.m200a1();
            i = 0;
        }
        float g = (this.f29468O || (fVar = this.f29481c) == null) ? 0.0f : fVar.m29586g();
        if (Build.VERSION.SDK_INT < 21) {
            RectF rectF = this.f29471R;
            float f = this.f29472S;
            canvas.drawRoundRect(rectF, f, f, C1410y.m37042g(C5064d.m24129d(i5, i3, this.f29466M * (1.0f - g))));
        }
        this.f29477a.setColor(C5064d.m24129d(i4, i2, this.f29466M * (1.0f - g)));
        canvas.drawCircle(this.f29476W, this.f29478a0, this.f29480b0, this.f29477a);
        if (this.f29469P) {
            C1362c.m37490b(canvas, this.f29470Q, this.f29476W - (drawable.getMinimumWidth() / 2), this.f29478a0 - (this.f29470Q.getMinimumHeight() / 2), C1410y.m37058W(i));
        } else if (this.f29468O) {
            Paint Y = C1410y.m37056Y(i, C1357a0.m37544i(2.0f));
            int i6 = (int) (C1357a0.m37544i(0.5f) * this.f29466M);
            float f2 = this.f29476W;
            float f3 = ((int) (this.f29480b0 * 0.75f)) / 2;
            float i7 = (int) (C1357a0.m37544i(1.5f) * this.f29466M);
            float f4 = this.f29478a0;
            float i8 = (int) (C1357a0.m37544i(0.5f) * this.f29466M);
            canvas.drawLine((f2 - f3) + i7, f4 + f3 + i8, f2 + f3 + i7, (f4 - f3) + i8, Y);
            float f5 = this.f29466M;
            float f6 = this.f29476W;
            float i9 = (int) (C1357a0.m37544i(-3.5f) * this.f29466M);
            float f7 = i6;
            float i10 = (int) (C1357a0.m37544i(0.5f) * f5);
            float f8 = this.f29478a0;
            float i11 = (int) (C1357a0.m37544i(3.0f) * this.f29466M);
            canvas.drawLine((f6 - f3) + i9 + f7 + i10, i10 + (f8 - f3) + i11 + i8, f6 + ((1.0f - f5) * f3) + i9 + f7, f8 + (f3 * (1.0f - f5)) + i11 + i8, Y);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.f29482c0 != measuredWidth) {
            this.f29482c0 = measuredWidth;
            m10191k();
        }
    }

    public final boolean m10187p() {
        C3940f fVar = this.f29481c;
        return fVar != null && fVar.m29585h();
    }

    public void m10186q(boolean z, boolean z2) {
        C3940f fVar = this.f29481c;
        if (fVar != null || z) {
            if (fVar == null) {
                this.f29481c = new C3940f(1, this, C2057b.f7280b, 168L);
            }
            this.f29481c.m29577p(z, z2);
        }
    }

    public void m10185r(boolean z, boolean z2) {
        if (this.f29479b != z) {
            this.f29479b = z;
            float f = 1.0f;
            if (z2) {
                if (this.f29467N == null) {
                    this.f29467N = new C3950k(0, this, C2057b.f7280b, 180L, this.f29466M);
                }
                C3950k kVar = this.f29467N;
                if (!z) {
                    f = 0.0f;
                }
                kVar.m29546i(f);
                return;
            }
            C3950k kVar2 = this.f29467N;
            if (kVar2 != null) {
                kVar2.m29543l(z ? 1.0f : 0.0f);
            }
            if (!z) {
                f = 0.0f;
            }
            setFactor(f);
        }
    }

    public C9139d m10184s(boolean z) {
        if (this.f29468O != z) {
            this.f29468O = z;
            invalidate();
        }
        return this;
    }

    public void setFactor(float f) {
        if (this.f29466M != f) {
            this.f29466M = f;
            m10182u();
            invalidate();
            if (Build.VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
        }
    }

    public void setShowLock(boolean z) {
        if (this.f29469P != z) {
            this.f29469P = z;
            if (this.f29470Q == null) {
                this.f29470Q = C1362c.m37485g(getResources(), R.drawable.baseline_lock_14);
            }
            invalidate();
        }
    }

    public boolean m10183t(boolean z) {
        m10185r(!this.f29479b, z);
        return this.f29479b;
    }

    public final void m10182u() {
        if (C4403w.m27986G2()) {
            float f = this.f29466M;
            this.f29476W = f == 0.0f ? this.f29474U : f == 1.0f ? this.f29473T : this.f29474U - (f * this.f29475V);
            return;
        }
        float f2 = this.f29466M;
        this.f29476W = f2 == 0.0f ? this.f29473T : f2 == 1.0f ? this.f29474U : (f2 * this.f29475V) + this.f29473T;
    }
}
