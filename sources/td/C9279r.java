package td;

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
import be.C1357a0;
import be.C1363c0;
import be.C1410y;
import ie.RunnableC5390g;
import java.util.ArrayList;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import p037cb.C2057b;
import p108hb.C5070i;
import p364zd.C11524j;

public class C9279r extends View {
    public int f29992M;
    public int f29995P;
    public boolean f29996Q;
    public int f29997R;
    public float f29999T;
    public int f30000U;
    public float f30001V;
    public int f30002W;
    public int f30003a;
    public C9283d f30004a0;
    public int f30005b;
    public C9283d f30006b0;
    public int f30007c;
    public int f30008c0;
    public int f30009d0;
    public float f30010e0;
    public int f30011f0;
    public int f30012g0;
    public boolean f30013h0;
    public boolean f30014i0;
    public ValueAnimator f30015j0;
    public float f30016k0;
    public AbstractC9282c f30017l0;
    public final C9281b[] f29994O = new C9281b[5];
    public final float[] f29998S = new float[10];
    public ArrayList<Integer> f29993N = new ArrayList<>();

    public class C9280a extends AnimatorListenerAdapter {
        public C9280a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (C9279r.this.f30013h0) {
                C9279r.this.m9664l();
                C9279r.this.f30016k0 = 0.0f;
                C9279r.this.f30013h0 = false;
            }
            C9279r.this.m9665k();
        }
    }

    public static class C9281b {
        public float[] f30019a;
        public int f30020b;
        public int f30021c = -1;
        public int f30022d;
        public String f30023e;
        public String f30024f;

        public C9281b(float[] fArr, int i) {
            this.f30019a = fArr;
            this.f30020b = i;
        }

        public void m9649a() {
            this.f30021c = this.f30022d;
            this.f30023e = this.f30024f;
            this.f30022d = -1;
            this.f30024f = null;
        }

        public void m9648b(C9279r rVar, Canvas canvas, int i, float f, float f2, float f3, boolean z) {
            TextPaint u = rVar.m9655u(false, false);
            u.setColor(i);
            if (f3 == 0.0f || this.f30021c == this.f30022d) {
                String str = this.f30023e;
                if (str != null) {
                    canvas.drawText(str, f, f2, u);
                }
            } else if (f3 == 1.0f) {
                String str2 = this.f30024f;
                if (str2 != null) {
                    canvas.drawText(str2, f, f2, u);
                }
            } else {
                float f4 = this.f30020b * f3;
                float f5 = z ? f2 + f4 : f2 - f4;
                if (this.f30023e != null) {
                    u.setAlpha((int) ((1.0f - f3) * 255.0f));
                    canvas.drawText(this.f30023e, f, f5, u);
                }
                if (this.f30024f != null) {
                    u.setAlpha((int) (f3 * 255.0f));
                    if (z) {
                        canvas.drawText(this.f30024f, f, f5 - this.f30020b, u);
                    } else {
                        canvas.drawText(this.f30024f, f, f5 + this.f30020b, u);
                    }
                }
            }
        }

        public float m9647c() {
            int i = this.f30021c;
            float f = i == -1 ? 0.0f : this.f30019a[i];
            int i2 = this.f30022d;
            return i2 != -1 ? Math.max(this.f30019a[i2], f) : f;
        }

        public void m9646d() {
            this.f30021c = -1;
            this.f30023e = null;
            this.f30022d = -1;
            this.f30024f = null;
        }

        public void m9645e(int i) {
            this.f30022d = i;
            this.f30024f = i == -1 ? null : C9279r.m9676H(i);
        }
    }

    public interface AbstractC9282c {
        void mo9644a(C9279r rVar);
    }

    public static class C9283d {
        public final String f30025a;
        public final int f30026b;
        public final int f30027c;
        public final boolean f30028d;

        public C9283d(C9279r rVar, String str) {
            this.f30025a = str;
            boolean M0 = RunnableC5390g.m22983M0(str);
            this.f30028d = M0;
            this.f30027c = C1363c0.m37468F(str);
            this.f30026b = (int) C7389v0.m16680T1(str, rVar.m9655u(M0, false));
        }

        public int m9643a() {
            return this.f30025a.length();
        }
    }

    public C9279r(Context context) {
        super(context);
    }

    public void m9682B(float f, float f2, ValueAnimator valueAnimator) {
        setFactor(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public static String m9676H(int i) {
        return String.valueOf(i);
    }

    private int getTextWidth() {
        C9283d dVar = this.f30004a0;
        int i = 0;
        int i2 = dVar != null ? dVar.f30026b : 0;
        C9283d dVar2 = this.f30006b0;
        if (dVar2 != null) {
            i = dVar2.f30026b;
        }
        return Math.max(i2, i);
    }

    private void setDrawingSize(int i) {
        if (this.f29995P != i) {
            this.f29995P = i;
        }
    }

    public final boolean m9683A() {
        return getLayoutParams() == null || getLayoutParams().width == -2;
    }

    public boolean mo9681C() {
        return false;
    }

    public void mo9680D(Canvas canvas) {
    }

    public boolean m9679E(int i) {
        int i2 = this.f30011f0;
        boolean z = false;
        if (i2 == i || i < 0 || i >= 99999) {
            return false;
        }
        if (i2 < i) {
            z = true;
        }
        this.f30012g0 = i2;
        this.f30011f0 = i;
        m9666j(z);
        return true;
    }

    public void m9678F(String str, boolean z) {
        String trim = str.trim();
        C9283d dVar = this.f30004a0;
        if (dVar == null || !z) {
            this.f30004a0 = new C9283d(this, trim);
            this.f30006b0 = null;
            m9659q();
            invalidate();
        } else if (!C5070i.m24067c(dVar.f30025a, trim)) {
            this.f30006b0 = new C9283d(this, trim);
            if (trim.startsWith(this.f30004a0.f30025a)) {
                this.f30008c0 = 1;
            } else if (this.f30004a0.f30025a.startsWith(trim)) {
                this.f30008c0 = 2;
            } else {
                this.f30009d0 = 0;
                this.f30008c0 = 3;
                int min = Math.min(this.f30004a0.m9643a(), this.f30006b0.m9643a());
                for (int i = 0; i < min && this.f30004a0.f30025a.charAt(i) == this.f30006b0.f30025a.charAt(i); i++) {
                    this.f30009d0++;
                }
                int i2 = this.f30009d0;
                if (i2 > 0) {
                    C9283d dVar2 = this.f30004a0;
                    this.f30010e0 = C7389v0.m16684S1(dVar2.f30025a, 0, i2, m9655u(dVar2.f30028d, false));
                } else {
                    this.f30010e0 = 0.0f;
                }
            }
            m9659q();
            invalidate();
        } else if (this.f30006b0 != null) {
            this.f30006b0 = null;
            m9659q();
            invalidate();
        }
    }

    public final void m9677G() {
        float f = 0.0f;
        for (int i = 0; i < 10; i++) {
            this.f29998S[i] = C7389v0.m16680T1(m9676H(i), m9655u(false, false));
            f = Math.max(f, this.f29998S[i]);
        }
        this.f29999T = f;
    }

    public int getCounter() {
        return this.f30011f0;
    }

    public float getFactor() {
        return this.f30016k0;
    }

    public int getMaxDigitWidth() {
        return (int) this.f29999T;
    }

    public float getMultipleFactor() {
        return this.f30013h0 ? this.f30014i0 ? (this.f30012g0 == 1 && this.f30011f0 == 2) ? this.f30016k0 : this.f30011f0 >= 2 ? 1.0f : 0.0f : (this.f30012g0 == 2 && this.f30011f0 == 1) ? 1.0f - this.f30016k0 : this.f30011f0 >= 2 ? 1.0f : 0.0f : this.f30011f0 >= 2 ? 1.0f : 0.0f;
    }

    public boolean mo9667i() {
        if (!m9683A()) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & 7) == 5;
    }

    public final void m9666j(boolean z) {
        ValueAnimator valueAnimator;
        this.f30014i0 = z;
        if (this.f30013h0 && (valueAnimator = this.f30015j0) != null) {
            this.f30013h0 = false;
            valueAnimator.cancel();
        }
        m9663m();
        this.f30013h0 = true;
        this.f30014i0 = z;
        final float factor = getFactor();
        final float f = 1.0f - factor;
        ValueAnimator b = C2057b.m35734b();
        this.f30015j0 = b;
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C9279r.this.m9682B(factor, f, valueAnimator2);
            }
        });
        this.f30015j0.setDuration(180L);
        this.f30015j0.setInterpolator(C2057b.f7280b);
        this.f30015j0.addListener(new C9280a());
        this.f30015j0.start();
    }

    public final void m9665k() {
        for (int i = 0; i < this.f29995P; i++) {
            this.f29994O[i].m9649a();
        }
        setDrawingSize(this.f29993N.size());
        this.f29996Q = false;
        invalidate();
    }

    public final void m9664l() {
        C9283d dVar = this.f30006b0;
        if (dVar != null) {
            this.f30004a0 = dVar;
            this.f30006b0 = null;
            m9659q();
            invalidate();
        }
    }

    public final void m9663m() {
        int i;
        int size = this.f29993N.size();
        this.f29993N.clear();
        int i2 = this.f30011f0;
        do {
            i = 0;
            this.f29993N.add(0, Integer.valueOf(i2 % 10));
            i2 /= 10;
        } while (i2 != 0);
        int size2 = this.f29993N.size();
        setDrawingSize(Math.max(size, size2));
        this.f29996Q = size != size2;
        while (i < this.f29995P) {
            int i3 = -1;
            int intValue = i >= size2 ? -1 : this.f29993N.get(i).intValue();
            C9281b bVar = this.f29994O[i];
            if (intValue != 0 || size2 != 1) {
                i3 = intValue;
            }
            bVar.m9645e(i3);
            i++;
        }
    }

    public final float m9662n() {
        int i;
        int i2 = 0;
        float f = 0.0f;
        if (this.f30013h0) {
            while (true) {
                i = this.f29995P;
                if (i2 >= i) {
                    break;
                }
                f += this.f29994O[i2].m9647c();
                i2++;
            }
            if (!this.f29996Q) {
                return f;
            }
            return f - Math.round((this.f30014i0 ? 1.0f - this.f30016k0 : this.f30016k0) * this.f29994O[i].m9647c());
        }
        while (i2 < this.f29995P) {
            f += this.f29994O[i2].m9647c();
            i2++;
        }
        return f;
    }

    public final float m9661o() {
        return this.f30007c + getPaddingLeft() + m9662n() + m9660p();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        if (mo9667i()) {
            f = (getMeasuredWidth() - m9661o()) - getPaddingRight();
            if (f != 0.0f) {
                canvas.save();
                canvas.translate(f, 0.0f);
            }
        } else {
            f = 0.0f;
        }
        boolean C = mo9681C();
        if (C) {
            if (this.f30013h0) {
                int i3 = 0;
                i = 0;
                while (true) {
                    i2 = this.f29995P;
                    if (i3 >= i2) {
                        break;
                    }
                    i = (int) (i + this.f29994O[i3].m9647c());
                    i3++;
                }
                if (this.f29996Q) {
                    i -= Math.round((this.f30014i0 ? 1.0f - this.f30016k0 : this.f30016k0) * this.f29994O[i2].m9647c());
                }
            } else {
                i = 0;
                for (int i4 = 0; i4 < this.f29995P; i4++) {
                    i = (int) (i + this.f29994O[i4].m9647c());
                }
            }
            mo9657s(canvas, i, (int) (i - this.f29994O[0].m9647c()));
        }
        float paddingLeft = this.f30007c + getPaddingLeft();
        C9283d dVar = this.f30004a0;
        if (dVar == null) {
            m9658r(canvas, paddingLeft);
        } else if (dVar.f30027c == 2) {
            m9658r(canvas, m9656t(canvas, paddingLeft, true));
        } else {
            m9656t(canvas, m9658r(canvas, paddingLeft), false);
        }
        if (C) {
            mo9680D(canvas);
        }
        if (f != 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (m9683A()) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f30007c + this.f30003a + getTextWidth(), Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final float m9660p() {
        C9283d dVar = this.f30004a0;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.f30005b + 0.0f;
        C9283d dVar2 = this.f30006b0;
        if (dVar2 == null) {
            return f + dVar.f30026b;
        }
        int i = dVar.f30026b;
        return f + i + ((dVar2.f30026b - i) * this.f30016k0);
    }

    public final void m9659q() {
        int textWidth = getTextWidth();
        if (this.f30002W != textWidth) {
            this.f30002W = textWidth;
            if (m9683A()) {
                requestLayout();
            }
        }
    }

    public final float m9658r(Canvas canvas, float f) {
        int i;
        int i2 = 0;
        if (this.f30013h0) {
            while (true) {
                i = this.f29995P;
                if (i2 >= i) {
                    break;
                }
                C9281b bVar = this.f29994O[i2];
                bVar.m9648b(this, canvas, C11524j.m228N(this.f30000U), f, this.f29992M, this.f30016k0, this.f30014i0);
                f += bVar.m9647c();
                i2++;
            }
            if (!this.f29996Q) {
                return f;
            }
            return f - Math.round((this.f30014i0 ? 1.0f - this.f30016k0 : this.f30016k0) * this.f29994O[i].m9647c());
        }
        for (int i3 = 0; i3 < this.f29995P; i3++) {
            C9281b bVar2 = this.f29994O[i3];
            bVar2.m9648b(this, canvas, C11524j.m228N(this.f30000U), f, this.f29992M, 0.0f, false);
            f += bVar2.m9647c();
        }
        return f;
    }

    public void mo9657s(Canvas canvas, int i, int i2) {
    }

    public void setFactor(float f) {
        if (this.f30016k0 != f && this.f30013h0) {
            this.f30016k0 = f;
            AbstractC9282c cVar = this.f30017l0;
            if (cVar != null && (this.f30011f0 == 2 || this.f30012g0 == 2)) {
                cVar.mo9644a(this);
            }
            invalidate();
        }
    }

    public void setFactorChangeListener(AbstractC9282c cVar) {
        this.f30017l0 = cVar;
    }

    public void setTextColorId(int i) {
        if (this.f30000U != i) {
            this.f30000U = i;
            invalidate();
        }
    }

    public void setTextTop(int i) {
        this.f29992M = i;
    }

    public final float m9656t(Canvas canvas, float f, boolean z) {
        float f2;
        C9283d dVar = this.f30004a0;
        if (dVar == null) {
            return f;
        }
        float f3 = !z ? f + this.f30005b : f;
        TextPaint u = m9655u(dVar.f30028d, true);
        C9283d dVar2 = this.f30006b0;
        if (dVar2 == null) {
            canvas.drawText(this.f30004a0.f30025a, f3, this.f29992M, u);
            f2 = f3 + this.f30004a0.f30026b;
        } else {
            TextPaint u2 = m9655u(dVar2.f30028d, true);
            if (z) {
                C9283d dVar3 = this.f30004a0;
                int i = dVar3.f30026b;
                C9283d dVar4 = this.f30006b0;
                int i2 = dVar4.f30026b;
                f2 = f3 + i + ((i2 - i) * this.f30016k0);
                int i3 = this.f30008c0;
                if (i3 == 1) {
                    canvas.drawText(dVar3.f30025a, f2 - i, this.f29992M, u);
                    u2.setAlpha((int) (this.f30016k0 * 255.0f));
                    canvas.drawText(this.f30006b0.f30025a, this.f30004a0.m9643a(), this.f30006b0.m9643a(), f2 - this.f30006b0.f30026b, this.f29992M, (Paint) u2);
                } else if (i3 == 2) {
                    canvas.drawText(dVar4.f30025a, f2 - i2, this.f29992M, u2);
                    u.setAlpha((int) ((1.0f - this.f30016k0) * 255.0f));
                    canvas.drawText(this.f30004a0.f30025a, this.f30006b0.m9643a(), this.f30004a0.m9643a(), f2 - this.f30004a0.f30026b, this.f29992M, (Paint) u);
                } else if (i3 == 3) {
                    if (this.f30009d0 > 0) {
                        u.setAlpha(255);
                        canvas.drawText(this.f30004a0.f30025a, 0, this.f30009d0, f2 - this.f30010e0, this.f29992M, (Paint) u);
                    }
                    u.setAlpha((int) ((1.0f - this.f30016k0) * 255.0f));
                    String str = this.f30004a0.f30025a;
                    canvas.drawText(str, this.f30009d0, str.length(), f2 - this.f30004a0.f30026b, this.f29992M, (Paint) u);
                    u2.setAlpha((int) (this.f30016k0 * 255.0f));
                    String str2 = this.f30006b0.f30025a;
                    canvas.drawText(str2, this.f30009d0, str2.length(), f2 - this.f30006b0.f30026b, this.f29992M, (Paint) u2);
                }
            } else {
                int i4 = this.f30008c0;
                if (i4 == 1) {
                    canvas.drawText(this.f30004a0.f30025a, f3, this.f29992M, u);
                    u2.setAlpha((int) (this.f30016k0 * 255.0f));
                    canvas.drawText(this.f30006b0.f30025a, this.f30004a0.m9643a(), this.f30006b0.m9643a(), f3 + this.f30004a0.f30026b, this.f29992M, (Paint) u2);
                } else if (i4 == 2) {
                    canvas.drawText(this.f30006b0.f30025a, f3, this.f29992M, u2);
                    u.setAlpha((int) ((1.0f - this.f30016k0) * 255.0f));
                    canvas.drawText(this.f30004a0.f30025a, this.f30006b0.m9643a(), this.f30004a0.m9643a(), f3 + this.f30006b0.f30026b, this.f29992M, (Paint) u);
                } else if (i4 == 3) {
                    if (this.f30009d0 > 0) {
                        u.setAlpha(255);
                        canvas.drawText(this.f30004a0.f30025a, 0, this.f30009d0, f3, this.f29992M, (Paint) u);
                    }
                    u.setAlpha((int) ((1.0f - this.f30016k0) * 255.0f));
                    String str3 = this.f30004a0.f30025a;
                    canvas.drawText(str3, this.f30009d0, str3.length(), f3 + this.f30010e0, this.f29992M, (Paint) u);
                    u2.setAlpha((int) (this.f30016k0 * 255.0f));
                    String str4 = this.f30006b0.f30025a;
                    canvas.drawText(str4, this.f30009d0, str4.length(), f3 + this.f30010e0, this.f29992M, (Paint) u2);
                }
                int i5 = this.f30004a0.f30026b;
                f2 = f3 + i5 + ((this.f30006b0.f30026b - i5) * this.f30016k0);
            }
        }
        return z ? f2 + this.f30005b : f2;
    }

    public final TextPaint m9655u(boolean z, boolean z2) {
        if (z2) {
            return C1410y.m37063O(this.f30001V, C11524j.m228N(this.f30000U), z);
        }
        return C1410y.m37062P(this.f30001V, z);
    }

    public void m9654v(float f, int i, int i2, int i3, int i4) {
        this.f30001V = f;
        this.f30000U = i;
        this.f29997R = i2;
        this.f30007c = i3;
        this.f29992M = i4;
        m9650z();
    }

    public void m9653w(int i, boolean z) {
        int i2 = this.f30011f0;
        if (i2 != i && i >= 0 && i < 99999) {
            if (i2 != 0) {
                for (int i3 = 0; i3 < this.f29995P; i3++) {
                    this.f29994O[i3].m9646d();
                }
            }
            this.f30011f0 = i;
            if (z) {
                m9666j(true);
                return;
            }
            m9663m();
            m9665k();
        }
    }

    public void m9652x(float f, int i) {
        m9654v(f, i, C1357a0.m37541i(20.0f), 0, C1357a0.m37541i(20.0f) + C1357a0.m37541i(15.0f));
    }

    public void m9651y(int i) {
        m9652x(19.0f, i);
    }

    public final void m9650z() {
        m9677G();
        int i = 0;
        while (true) {
            C9281b[] bVarArr = this.f29994O;
            if (i < bVarArr.length) {
                bVarArr[i] = new C9281b(this.f29998S, this.f29997R);
                i++;
            } else {
                this.f30003a = (int) Math.ceil(this.f29999T * bVarArr.length);
                this.f30005b = (int) C7389v0.m16680T1(" ", C1410y.m37062P(this.f30001V, false));
                return;
            }
        }
    }
}
