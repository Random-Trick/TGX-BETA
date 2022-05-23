package ud;

import ae.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ce.a0;
import ce.c0;
import ce.y;
import ib.i;
import java.util.ArrayList;
import je.g;
import oc.v0;
import org.thunderdog.challegram.Log;

public class r extends View {
    public int M;
    public int P;
    public boolean Q;
    public int R;
    public float T;
    public int U;
    public float V;
    public int W;
    public int f24388a;
    public d f24389a0;
    public int f24390b;
    public d f24391b0;
    public int f24392c;
    public int f24393c0;
    public int f24394d0;
    public float f24395e0;
    public int f24396f0;
    public int f24397g0;
    public boolean f24398h0;
    public boolean f24399i0;
    public ValueAnimator f24400j0;
    public float f24401k0;
    public c f24402l0;
    public final b[] O = new b[5];
    public final float[] S = new float[10];
    public ArrayList<Integer> N = new ArrayList<>();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (r.this.f24398h0) {
                r.this.l();
                r.this.f24401k0 = 0.0f;
                r.this.f24398h0 = false;
            }
            r.this.k();
        }
    }

    public static class b {
        public float[] f24404a;
        public int f24405b;
        public int f24406c = -1;
        public int f24407d;
        public String f24408e;
        public String f24409f;

        public b(float[] fArr, int i10) {
            this.f24404a = fArr;
            this.f24405b = i10;
        }

        public void a() {
            this.f24406c = this.f24407d;
            this.f24408e = this.f24409f;
            this.f24407d = -1;
            this.f24409f = null;
        }

        public void b(r rVar, Canvas canvas, int i10, float f10, float f11, float f12, boolean z10) {
            TextPaint u10 = rVar.u(false, false);
            u10.setColor(i10);
            if (f12 == 0.0f || this.f24406c == this.f24407d) {
                String str = this.f24408e;
                if (str != null) {
                    canvas.drawText(str, f10, f11, u10);
                }
            } else if (f12 == 1.0f) {
                String str2 = this.f24409f;
                if (str2 != null) {
                    canvas.drawText(str2, f10, f11, u10);
                }
            } else {
                float f13 = this.f24405b * f12;
                float f14 = z10 ? f11 + f13 : f11 - f13;
                if (this.f24408e != null) {
                    u10.setAlpha((int) ((1.0f - f12) * 255.0f));
                    canvas.drawText(this.f24408e, f10, f14, u10);
                }
                if (this.f24409f != null) {
                    u10.setAlpha((int) (f12 * 255.0f));
                    if (z10) {
                        canvas.drawText(this.f24409f, f10, f14 - this.f24405b, u10);
                    } else {
                        canvas.drawText(this.f24409f, f10, f14 + this.f24405b, u10);
                    }
                }
            }
        }

        public float c() {
            int i10 = this.f24406c;
            float f10 = i10 == -1 ? 0.0f : this.f24404a[i10];
            int i11 = this.f24407d;
            return i11 != -1 ? Math.max(this.f24404a[i11], f10) : f10;
        }

        public void d() {
            this.f24406c = -1;
            this.f24408e = null;
            this.f24407d = -1;
            this.f24409f = null;
        }

        public void e(int i10) {
            this.f24407d = i10;
            this.f24409f = i10 == -1 ? null : r.H(i10);
        }
    }

    public interface c {
        void a(r rVar);
    }

    public static class d {
        public final String f24410a;
        public final int f24411b;
        public final int f24412c;
        public final boolean f24413d;

        public d(r rVar, String str) {
            this.f24410a = str;
            boolean M0 = g.M0(str);
            this.f24413d = M0;
            this.f24412c = c0.F(str);
            this.f24411b = (int) v0.T1(str, rVar.u(M0, false));
        }

        public int a() {
            return this.f24410a.length();
        }
    }

    public r(Context context) {
        super(context);
    }

    public void B(float f10, float f11, ValueAnimator valueAnimator) {
        setFactor(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public static String H(int i10) {
        return String.valueOf(i10);
    }

    private int getTextWidth() {
        d dVar = this.f24389a0;
        int i10 = 0;
        int i11 = dVar != null ? dVar.f24411b : 0;
        d dVar2 = this.f24391b0;
        if (dVar2 != null) {
            i10 = dVar2.f24411b;
        }
        return Math.max(i11, i10);
    }

    private void setDrawingSize(int i10) {
        if (this.P != i10) {
            this.P = i10;
        }
    }

    public final boolean A() {
        return getLayoutParams() == null || getLayoutParams().width == -2;
    }

    public boolean C() {
        return false;
    }

    public void D(Canvas canvas) {
    }

    public boolean E(int i10) {
        int i11 = this.f24396f0;
        boolean z10 = false;
        if (i11 == i10 || i10 < 0 || i10 >= 99999) {
            return false;
        }
        if (i11 < i10) {
            z10 = true;
        }
        this.f24397g0 = i11;
        this.f24396f0 = i10;
        j(z10);
        return true;
    }

    public void F(String str, boolean z10) {
        String trim = str.trim();
        d dVar = this.f24389a0;
        if (dVar == null || !z10) {
            this.f24389a0 = new d(this, trim);
            this.f24391b0 = null;
            q();
            invalidate();
        } else if (!i.c(dVar.f24410a, trim)) {
            this.f24391b0 = new d(this, trim);
            if (trim.startsWith(this.f24389a0.f24410a)) {
                this.f24393c0 = 1;
            } else if (this.f24389a0.f24410a.startsWith(trim)) {
                this.f24393c0 = 2;
            } else {
                this.f24394d0 = 0;
                this.f24393c0 = 3;
                int min = Math.min(this.f24389a0.a(), this.f24391b0.a());
                for (int i10 = 0; i10 < min && this.f24389a0.f24410a.charAt(i10) == this.f24391b0.f24410a.charAt(i10); i10++) {
                    this.f24394d0++;
                }
                int i11 = this.f24394d0;
                if (i11 > 0) {
                    d dVar2 = this.f24389a0;
                    this.f24395e0 = v0.S1(dVar2.f24410a, 0, i11, u(dVar2.f24413d, false));
                } else {
                    this.f24395e0 = 0.0f;
                }
            }
            q();
            invalidate();
        } else if (this.f24391b0 != null) {
            this.f24391b0 = null;
            q();
            invalidate();
        }
    }

    public final void G() {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < 10; i10++) {
            this.S[i10] = v0.T1(H(i10), u(false, false));
            f10 = Math.max(f10, this.S[i10]);
        }
        this.T = f10;
    }

    public int getCounter() {
        return this.f24396f0;
    }

    public float getFactor() {
        return this.f24401k0;
    }

    public int getMaxDigitWidth() {
        return (int) this.T;
    }

    public float getMultipleFactor() {
        return this.f24398h0 ? this.f24399i0 ? (this.f24397g0 == 1 && this.f24396f0 == 2) ? this.f24401k0 : this.f24396f0 >= 2 ? 1.0f : 0.0f : (this.f24397g0 == 2 && this.f24396f0 == 1) ? 1.0f - this.f24401k0 : this.f24396f0 >= 2 ? 1.0f : 0.0f : this.f24396f0 >= 2 ? 1.0f : 0.0f;
    }

    public boolean i() {
        if (!A()) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & 7) == 5;
    }

    public final void j(boolean z10) {
        ValueAnimator valueAnimator;
        this.f24399i0 = z10;
        if (this.f24398h0 && (valueAnimator = this.f24400j0) != null) {
            this.f24398h0 = false;
            valueAnimator.cancel();
        }
        m();
        this.f24398h0 = true;
        this.f24399i0 = z10;
        final float factor = getFactor();
        final float f10 = 1.0f - factor;
        ValueAnimator b10 = db.b.b();
        this.f24400j0 = b10;
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                r.this.B(factor, f10, valueAnimator2);
            }
        });
        this.f24400j0.setDuration(180L);
        this.f24400j0.setInterpolator(db.b.f7287b);
        this.f24400j0.addListener(new a());
        this.f24400j0.start();
    }

    public final void k() {
        for (int i10 = 0; i10 < this.P; i10++) {
            this.O[i10].a();
        }
        setDrawingSize(this.N.size());
        this.Q = false;
        invalidate();
    }

    public final void l() {
        d dVar = this.f24391b0;
        if (dVar != null) {
            this.f24389a0 = dVar;
            this.f24391b0 = null;
            q();
            invalidate();
        }
    }

    public final void m() {
        int i10;
        int size = this.N.size();
        this.N.clear();
        int i11 = this.f24396f0;
        do {
            i10 = 0;
            this.N.add(0, Integer.valueOf(i11 % 10));
            i11 /= 10;
        } while (i11 != 0);
        int size2 = this.N.size();
        setDrawingSize(Math.max(size, size2));
        this.Q = size != size2;
        while (i10 < this.P) {
            int i12 = -1;
            int intValue = i10 >= size2 ? -1 : this.N.get(i10).intValue();
            b bVar = this.O[i10];
            if (intValue != 0 || size2 != 1) {
                i12 = intValue;
            }
            bVar.e(i12);
            i10++;
        }
    }

    public final float n() {
        int i10;
        int i11 = 0;
        float f10 = 0.0f;
        if (this.f24398h0) {
            while (true) {
                i10 = this.P;
                if (i11 >= i10) {
                    break;
                }
                f10 += this.O[i11].c();
                i11++;
            }
            if (!this.Q) {
                return f10;
            }
            return f10 - Math.round((this.f24399i0 ? 1.0f - this.f24401k0 : this.f24401k0) * this.O[i10].c());
        }
        while (i11 < this.P) {
            f10 += this.O[i11].c();
            i11++;
        }
        return f10;
    }

    public final float o() {
        return this.f24392c + getPaddingLeft() + n() + p();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        if (i()) {
            f10 = (getMeasuredWidth() - o()) - getPaddingRight();
            if (f10 != 0.0f) {
                canvas.save();
                canvas.translate(f10, 0.0f);
            }
        } else {
            f10 = 0.0f;
        }
        boolean C = C();
        if (C) {
            if (this.f24398h0) {
                int i12 = 0;
                i10 = 0;
                while (true) {
                    i11 = this.P;
                    if (i12 >= i11) {
                        break;
                    }
                    i10 = (int) (i10 + this.O[i12].c());
                    i12++;
                }
                if (this.Q) {
                    i10 -= Math.round((this.f24399i0 ? 1.0f - this.f24401k0 : this.f24401k0) * this.O[i11].c());
                }
            } else {
                i10 = 0;
                for (int i13 = 0; i13 < this.P; i13++) {
                    i10 = (int) (i10 + this.O[i13].c());
                }
            }
            s(canvas, i10, (int) (i10 - this.O[0].c()));
        }
        float paddingLeft = this.f24392c + getPaddingLeft();
        d dVar = this.f24389a0;
        if (dVar == null) {
            r(canvas, paddingLeft);
        } else if (dVar.f24412c == 2) {
            r(canvas, t(canvas, paddingLeft, true));
        } else {
            t(canvas, r(canvas, paddingLeft), false);
        }
        if (C) {
            D(canvas);
        }
        if (f10 != 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (A()) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f24392c + this.f24388a + getTextWidth(), Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public final float p() {
        d dVar = this.f24389a0;
        if (dVar == null) {
            return 0.0f;
        }
        float f10 = this.f24390b + 0.0f;
        d dVar2 = this.f24391b0;
        if (dVar2 == null) {
            return f10 + dVar.f24411b;
        }
        int i10 = dVar.f24411b;
        return f10 + i10 + ((dVar2.f24411b - i10) * this.f24401k0);
    }

    public final void q() {
        int textWidth = getTextWidth();
        if (this.W != textWidth) {
            this.W = textWidth;
            if (A()) {
                requestLayout();
            }
        }
    }

    public final float r(Canvas canvas, float f10) {
        int i10;
        int i11 = 0;
        if (this.f24398h0) {
            while (true) {
                i10 = this.P;
                if (i11 >= i10) {
                    break;
                }
                b bVar = this.O[i11];
                bVar.b(this, canvas, j.L(this.U), f10, this.M, this.f24401k0, this.f24399i0);
                f10 += bVar.c();
                i11++;
            }
            if (!this.Q) {
                return f10;
            }
            return f10 - Math.round((this.f24399i0 ? 1.0f - this.f24401k0 : this.f24401k0) * this.O[i10].c());
        }
        for (int i12 = 0; i12 < this.P; i12++) {
            b bVar2 = this.O[i12];
            bVar2.b(this, canvas, j.L(this.U), f10, this.M, 0.0f, false);
            f10 += bVar2.c();
        }
        return f10;
    }

    public void s(Canvas canvas, int i10, int i11) {
    }

    public void setFactor(float f10) {
        if (this.f24401k0 != f10 && this.f24398h0) {
            this.f24401k0 = f10;
            c cVar = this.f24402l0;
            if (cVar != null && (this.f24396f0 == 2 || this.f24397g0 == 2)) {
                cVar.a(this);
            }
            invalidate();
        }
    }

    public void setFactorChangeListener(c cVar) {
        this.f24402l0 = cVar;
    }

    public void setTextColorId(int i10) {
        if (this.U != i10) {
            this.U = i10;
            invalidate();
        }
    }

    public void setTextTop(int i10) {
        this.M = i10;
    }

    public final float t(Canvas canvas, float f10, boolean z10) {
        float f11;
        d dVar = this.f24389a0;
        if (dVar == null) {
            return f10;
        }
        float f12 = !z10 ? f10 + this.f24390b : f10;
        TextPaint u10 = u(dVar.f24413d, true);
        d dVar2 = this.f24391b0;
        if (dVar2 == null) {
            canvas.drawText(this.f24389a0.f24410a, f12, this.M, u10);
            f11 = f12 + this.f24389a0.f24411b;
        } else {
            TextPaint u11 = u(dVar2.f24413d, true);
            if (z10) {
                d dVar3 = this.f24389a0;
                int i10 = dVar3.f24411b;
                d dVar4 = this.f24391b0;
                int i11 = dVar4.f24411b;
                f11 = f12 + i10 + ((i11 - i10) * this.f24401k0);
                int i12 = this.f24393c0;
                if (i12 == 1) {
                    canvas.drawText(dVar3.f24410a, f11 - i10, this.M, u10);
                    u11.setAlpha((int) (this.f24401k0 * 255.0f));
                    canvas.drawText(this.f24391b0.f24410a, this.f24389a0.a(), this.f24391b0.a(), f11 - this.f24391b0.f24411b, this.M, (Paint) u11);
                } else if (i12 == 2) {
                    canvas.drawText(dVar4.f24410a, f11 - i11, this.M, u11);
                    u10.setAlpha((int) ((1.0f - this.f24401k0) * 255.0f));
                    canvas.drawText(this.f24389a0.f24410a, this.f24391b0.a(), this.f24389a0.a(), f11 - this.f24389a0.f24411b, this.M, (Paint) u10);
                } else if (i12 == 3) {
                    if (this.f24394d0 > 0) {
                        u10.setAlpha(255);
                        canvas.drawText(this.f24389a0.f24410a, 0, this.f24394d0, f11 - this.f24395e0, this.M, (Paint) u10);
                    }
                    u10.setAlpha((int) ((1.0f - this.f24401k0) * 255.0f));
                    String str = this.f24389a0.f24410a;
                    canvas.drawText(str, this.f24394d0, str.length(), f11 - this.f24389a0.f24411b, this.M, (Paint) u10);
                    u11.setAlpha((int) (this.f24401k0 * 255.0f));
                    String str2 = this.f24391b0.f24410a;
                    canvas.drawText(str2, this.f24394d0, str2.length(), f11 - this.f24391b0.f24411b, this.M, (Paint) u11);
                }
            } else {
                int i13 = this.f24393c0;
                if (i13 == 1) {
                    canvas.drawText(this.f24389a0.f24410a, f12, this.M, u10);
                    u11.setAlpha((int) (this.f24401k0 * 255.0f));
                    canvas.drawText(this.f24391b0.f24410a, this.f24389a0.a(), this.f24391b0.a(), f12 + this.f24389a0.f24411b, this.M, (Paint) u11);
                } else if (i13 == 2) {
                    canvas.drawText(this.f24391b0.f24410a, f12, this.M, u11);
                    u10.setAlpha((int) ((1.0f - this.f24401k0) * 255.0f));
                    canvas.drawText(this.f24389a0.f24410a, this.f24391b0.a(), this.f24389a0.a(), f12 + this.f24391b0.f24411b, this.M, (Paint) u10);
                } else if (i13 == 3) {
                    if (this.f24394d0 > 0) {
                        u10.setAlpha(255);
                        canvas.drawText(this.f24389a0.f24410a, 0, this.f24394d0, f12, this.M, (Paint) u10);
                    }
                    u10.setAlpha((int) ((1.0f - this.f24401k0) * 255.0f));
                    String str3 = this.f24389a0.f24410a;
                    canvas.drawText(str3, this.f24394d0, str3.length(), f12 + this.f24395e0, this.M, (Paint) u10);
                    u11.setAlpha((int) (this.f24401k0 * 255.0f));
                    String str4 = this.f24391b0.f24410a;
                    canvas.drawText(str4, this.f24394d0, str4.length(), f12 + this.f24395e0, this.M, (Paint) u11);
                }
                int i14 = this.f24389a0.f24411b;
                f11 = f12 + i14 + ((this.f24391b0.f24411b - i14) * this.f24401k0);
            }
        }
        return z10 ? f11 + this.f24390b : f11;
    }

    public final TextPaint u(boolean z10, boolean z11) {
        if (z11) {
            return y.O(this.V, j.L(this.U), z10);
        }
        return y.P(this.V, z10);
    }

    public void v(float f10, int i10, int i11, int i12, int i13) {
        this.V = f10;
        this.U = i10;
        this.R = i11;
        this.f24392c = i12;
        this.M = i13;
        z();
    }

    public void w(int i10, boolean z10) {
        int i11 = this.f24396f0;
        if (i11 != i10 && i10 >= 0 && i10 < 99999) {
            if (i11 != 0) {
                for (int i12 = 0; i12 < this.P; i12++) {
                    this.O[i12].d();
                }
            }
            this.f24396f0 = i10;
            if (z10) {
                j(true);
                return;
            }
            m();
            k();
        }
    }

    public void x(float f10, int i10) {
        v(f10, i10, a0.i(20.0f), 0, a0.i(20.0f) + a0.i(15.0f));
    }

    public void y(int i10) {
        x(19.0f, i10);
    }

    public final void z() {
        G();
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.O;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = new b(this.S, this.R);
                i10++;
            } else {
                this.f24388a = (int) Math.ceil(this.T * bVarArr.length);
                this.f24390b = (int) v0.T1(" ", y.P(this.V, false));
                return;
            }
        }
    }
}
