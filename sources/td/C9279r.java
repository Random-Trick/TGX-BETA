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
    public int f29995M;
    public int f29998P;
    public boolean f29999Q;
    public int f30000R;
    public float f30002T;
    public int f30003U;
    public float f30004V;
    public int f30005W;
    public int f30006a;
    public C9283d f30007a0;
    public int f30008b;
    public C9283d f30009b0;
    public int f30010c;
    public int f30011c0;
    public int f30012d0;
    public float f30013e0;
    public int f30014f0;
    public int f30015g0;
    public boolean f30016h0;
    public boolean f30017i0;
    public ValueAnimator f30018j0;
    public float f30019k0;
    public AbstractC9282c f30020l0;
    public final C9281b[] f29997O = new C9281b[5];
    public final float[] f30001S = new float[10];
    public ArrayList<Integer> f29996N = new ArrayList<>();

    public class C9280a extends AnimatorListenerAdapter {
        public C9280a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (C9279r.this.f30016h0) {
                C9279r.this.m9663l();
                C9279r.this.f30019k0 = 0.0f;
                C9279r.this.f30016h0 = false;
            }
            C9279r.this.m9664k();
        }
    }

    public static class C9281b {
        public float[] f30022a;
        public int f30023b;
        public int f30024c = -1;
        public int f30025d;
        public String f30026e;
        public String f30027f;

        public C9281b(float[] fArr, int i) {
            this.f30022a = fArr;
            this.f30023b = i;
        }

        public void m9648a() {
            this.f30024c = this.f30025d;
            this.f30026e = this.f30027f;
            this.f30025d = -1;
            this.f30027f = null;
        }

        public void m9647b(C9279r rVar, Canvas canvas, int i, float f, float f2, float f3, boolean z) {
            TextPaint u = rVar.m9654u(false, false);
            u.setColor(i);
            if (f3 == 0.0f || this.f30024c == this.f30025d) {
                String str = this.f30026e;
                if (str != null) {
                    canvas.drawText(str, f, f2, u);
                }
            } else if (f3 == 1.0f) {
                String str2 = this.f30027f;
                if (str2 != null) {
                    canvas.drawText(str2, f, f2, u);
                }
            } else {
                float f4 = this.f30023b * f3;
                float f5 = z ? f2 + f4 : f2 - f4;
                if (this.f30026e != null) {
                    u.setAlpha((int) ((1.0f - f3) * 255.0f));
                    canvas.drawText(this.f30026e, f, f5, u);
                }
                if (this.f30027f != null) {
                    u.setAlpha((int) (f3 * 255.0f));
                    if (z) {
                        canvas.drawText(this.f30027f, f, f5 - this.f30023b, u);
                    } else {
                        canvas.drawText(this.f30027f, f, f5 + this.f30023b, u);
                    }
                }
            }
        }

        public float m9646c() {
            int i = this.f30024c;
            float f = i == -1 ? 0.0f : this.f30022a[i];
            int i2 = this.f30025d;
            return i2 != -1 ? Math.max(this.f30022a[i2], f) : f;
        }

        public void m9645d() {
            this.f30024c = -1;
            this.f30026e = null;
            this.f30025d = -1;
            this.f30027f = null;
        }

        public void m9644e(int i) {
            this.f30025d = i;
            this.f30027f = i == -1 ? null : C9279r.m9675H(i);
        }
    }

    public interface AbstractC9282c {
        void mo9643a(C9279r rVar);
    }

    public static class C9283d {
        public final String f30028a;
        public final int f30029b;
        public final int f30030c;
        public final boolean f30031d;

        public C9283d(C9279r rVar, String str) {
            this.f30028a = str;
            boolean M0 = RunnableC5390g.m22984M0(str);
            this.f30031d = M0;
            this.f30030c = C1363c0.m37471F(str);
            this.f30029b = (int) C7389v0.m16680T1(str, rVar.m9654u(M0, false));
        }

        public int m9642a() {
            return this.f30028a.length();
        }
    }

    public C9279r(Context context) {
        super(context);
    }

    public void m9681B(float f, float f2, ValueAnimator valueAnimator) {
        setFactor(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public static String m9675H(int i) {
        return String.valueOf(i);
    }

    private int getTextWidth() {
        C9283d dVar = this.f30007a0;
        int i = 0;
        int i2 = dVar != null ? dVar.f30029b : 0;
        C9283d dVar2 = this.f30009b0;
        if (dVar2 != null) {
            i = dVar2.f30029b;
        }
        return Math.max(i2, i);
    }

    private void setDrawingSize(int i) {
        if (this.f29998P != i) {
            this.f29998P = i;
        }
    }

    public final boolean m9682A() {
        return getLayoutParams() == null || getLayoutParams().width == -2;
    }

    public boolean mo9680C() {
        return false;
    }

    public void mo9679D(Canvas canvas) {
    }

    public boolean m9678E(int i) {
        int i2 = this.f30014f0;
        boolean z = false;
        if (i2 == i || i < 0 || i >= 99999) {
            return false;
        }
        if (i2 < i) {
            z = true;
        }
        this.f30015g0 = i2;
        this.f30014f0 = i;
        m9665j(z);
        return true;
    }

    public void m9677F(String str, boolean z) {
        String trim = str.trim();
        C9283d dVar = this.f30007a0;
        if (dVar == null || !z) {
            this.f30007a0 = new C9283d(this, trim);
            this.f30009b0 = null;
            m9658q();
            invalidate();
        } else if (!C5070i.m24068c(dVar.f30028a, trim)) {
            this.f30009b0 = new C9283d(this, trim);
            if (trim.startsWith(this.f30007a0.f30028a)) {
                this.f30011c0 = 1;
            } else if (this.f30007a0.f30028a.startsWith(trim)) {
                this.f30011c0 = 2;
            } else {
                this.f30012d0 = 0;
                this.f30011c0 = 3;
                int min = Math.min(this.f30007a0.m9642a(), this.f30009b0.m9642a());
                for (int i = 0; i < min && this.f30007a0.f30028a.charAt(i) == this.f30009b0.f30028a.charAt(i); i++) {
                    this.f30012d0++;
                }
                int i2 = this.f30012d0;
                if (i2 > 0) {
                    C9283d dVar2 = this.f30007a0;
                    this.f30013e0 = C7389v0.m16684S1(dVar2.f30028a, 0, i2, m9654u(dVar2.f30031d, false));
                } else {
                    this.f30013e0 = 0.0f;
                }
            }
            m9658q();
            invalidate();
        } else if (this.f30009b0 != null) {
            this.f30009b0 = null;
            m9658q();
            invalidate();
        }
    }

    public final void m9676G() {
        float f = 0.0f;
        for (int i = 0; i < 10; i++) {
            this.f30001S[i] = C7389v0.m16680T1(m9675H(i), m9654u(false, false));
            f = Math.max(f, this.f30001S[i]);
        }
        this.f30002T = f;
    }

    public int getCounter() {
        return this.f30014f0;
    }

    public float getFactor() {
        return this.f30019k0;
    }

    public int getMaxDigitWidth() {
        return (int) this.f30002T;
    }

    public float getMultipleFactor() {
        return this.f30016h0 ? this.f30017i0 ? (this.f30015g0 == 1 && this.f30014f0 == 2) ? this.f30019k0 : this.f30014f0 >= 2 ? 1.0f : 0.0f : (this.f30015g0 == 2 && this.f30014f0 == 1) ? 1.0f - this.f30019k0 : this.f30014f0 >= 2 ? 1.0f : 0.0f : this.f30014f0 >= 2 ? 1.0f : 0.0f;
    }

    public boolean mo9666i() {
        if (!m9682A()) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & 7) == 5;
    }

    public final void m9665j(boolean z) {
        ValueAnimator valueAnimator;
        this.f30017i0 = z;
        if (this.f30016h0 && (valueAnimator = this.f30018j0) != null) {
            this.f30016h0 = false;
            valueAnimator.cancel();
        }
        m9662m();
        this.f30016h0 = true;
        this.f30017i0 = z;
        final float factor = getFactor();
        final float f = 1.0f - factor;
        ValueAnimator b = C2057b.m35737b();
        this.f30018j0 = b;
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C9279r.this.m9681B(factor, f, valueAnimator2);
            }
        });
        this.f30018j0.setDuration(180L);
        this.f30018j0.setInterpolator(C2057b.f7280b);
        this.f30018j0.addListener(new C9280a());
        this.f30018j0.start();
    }

    public final void m9664k() {
        for (int i = 0; i < this.f29998P; i++) {
            this.f29997O[i].m9648a();
        }
        setDrawingSize(this.f29996N.size());
        this.f29999Q = false;
        invalidate();
    }

    public final void m9663l() {
        C9283d dVar = this.f30009b0;
        if (dVar != null) {
            this.f30007a0 = dVar;
            this.f30009b0 = null;
            m9658q();
            invalidate();
        }
    }

    public final void m9662m() {
        int i;
        int size = this.f29996N.size();
        this.f29996N.clear();
        int i2 = this.f30014f0;
        do {
            i = 0;
            this.f29996N.add(0, Integer.valueOf(i2 % 10));
            i2 /= 10;
        } while (i2 != 0);
        int size2 = this.f29996N.size();
        setDrawingSize(Math.max(size, size2));
        this.f29999Q = size != size2;
        while (i < this.f29998P) {
            int i3 = -1;
            int intValue = i >= size2 ? -1 : this.f29996N.get(i).intValue();
            C9281b bVar = this.f29997O[i];
            if (intValue != 0 || size2 != 1) {
                i3 = intValue;
            }
            bVar.m9644e(i3);
            i++;
        }
    }

    public final float m9661n() {
        int i;
        int i2 = 0;
        float f = 0.0f;
        if (this.f30016h0) {
            while (true) {
                i = this.f29998P;
                if (i2 >= i) {
                    break;
                }
                f += this.f29997O[i2].m9646c();
                i2++;
            }
            if (!this.f29999Q) {
                return f;
            }
            return f - Math.round((this.f30017i0 ? 1.0f - this.f30019k0 : this.f30019k0) * this.f29997O[i].m9646c());
        }
        while (i2 < this.f29998P) {
            f += this.f29997O[i2].m9646c();
            i2++;
        }
        return f;
    }

    public final float m9660o() {
        return this.f30010c + getPaddingLeft() + m9661n() + m9659p();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        if (mo9666i()) {
            f = (getMeasuredWidth() - m9660o()) - getPaddingRight();
            if (f != 0.0f) {
                canvas.save();
                canvas.translate(f, 0.0f);
            }
        } else {
            f = 0.0f;
        }
        boolean C = mo9680C();
        if (C) {
            if (this.f30016h0) {
                int i3 = 0;
                i = 0;
                while (true) {
                    i2 = this.f29998P;
                    if (i3 >= i2) {
                        break;
                    }
                    i = (int) (i + this.f29997O[i3].m9646c());
                    i3++;
                }
                if (this.f29999Q) {
                    i -= Math.round((this.f30017i0 ? 1.0f - this.f30019k0 : this.f30019k0) * this.f29997O[i2].m9646c());
                }
            } else {
                i = 0;
                for (int i4 = 0; i4 < this.f29998P; i4++) {
                    i = (int) (i + this.f29997O[i4].m9646c());
                }
            }
            mo9656s(canvas, i, (int) (i - this.f29997O[0].m9646c()));
        }
        float paddingLeft = this.f30010c + getPaddingLeft();
        C9283d dVar = this.f30007a0;
        if (dVar == null) {
            m9657r(canvas, paddingLeft);
        } else if (dVar.f30030c == 2) {
            m9657r(canvas, m9655t(canvas, paddingLeft, true));
        } else {
            m9655t(canvas, m9657r(canvas, paddingLeft), false);
        }
        if (C) {
            mo9679D(canvas);
        }
        if (f != 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (m9682A()) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f30010c + this.f30006a + getTextWidth(), Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final float m9659p() {
        C9283d dVar = this.f30007a0;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.f30008b + 0.0f;
        C9283d dVar2 = this.f30009b0;
        if (dVar2 == null) {
            return f + dVar.f30029b;
        }
        int i = dVar.f30029b;
        return f + i + ((dVar2.f30029b - i) * this.f30019k0);
    }

    public final void m9658q() {
        int textWidth = getTextWidth();
        if (this.f30005W != textWidth) {
            this.f30005W = textWidth;
            if (m9682A()) {
                requestLayout();
            }
        }
    }

    public final float m9657r(Canvas canvas, float f) {
        int i;
        int i2 = 0;
        if (this.f30016h0) {
            while (true) {
                i = this.f29998P;
                if (i2 >= i) {
                    break;
                }
                C9281b bVar = this.f29997O[i2];
                bVar.m9647b(this, canvas, C11524j.m228N(this.f30003U), f, this.f29995M, this.f30019k0, this.f30017i0);
                f += bVar.m9646c();
                i2++;
            }
            if (!this.f29999Q) {
                return f;
            }
            return f - Math.round((this.f30017i0 ? 1.0f - this.f30019k0 : this.f30019k0) * this.f29997O[i].m9646c());
        }
        for (int i3 = 0; i3 < this.f29998P; i3++) {
            C9281b bVar2 = this.f29997O[i3];
            bVar2.m9647b(this, canvas, C11524j.m228N(this.f30003U), f, this.f29995M, 0.0f, false);
            f += bVar2.m9646c();
        }
        return f;
    }

    public void mo9656s(Canvas canvas, int i, int i2) {
    }

    public void setFactor(float f) {
        if (this.f30019k0 != f && this.f30016h0) {
            this.f30019k0 = f;
            AbstractC9282c cVar = this.f30020l0;
            if (cVar != null && (this.f30014f0 == 2 || this.f30015g0 == 2)) {
                cVar.mo9643a(this);
            }
            invalidate();
        }
    }

    public void setFactorChangeListener(AbstractC9282c cVar) {
        this.f30020l0 = cVar;
    }

    public void setTextColorId(int i) {
        if (this.f30003U != i) {
            this.f30003U = i;
            invalidate();
        }
    }

    public void setTextTop(int i) {
        this.f29995M = i;
    }

    public final float m9655t(Canvas canvas, float f, boolean z) {
        float f2;
        C9283d dVar = this.f30007a0;
        if (dVar == null) {
            return f;
        }
        float f3 = !z ? f + this.f30008b : f;
        TextPaint u = m9654u(dVar.f30031d, true);
        C9283d dVar2 = this.f30009b0;
        if (dVar2 == null) {
            canvas.drawText(this.f30007a0.f30028a, f3, this.f29995M, u);
            f2 = f3 + this.f30007a0.f30029b;
        } else {
            TextPaint u2 = m9654u(dVar2.f30031d, true);
            if (z) {
                C9283d dVar3 = this.f30007a0;
                int i = dVar3.f30029b;
                C9283d dVar4 = this.f30009b0;
                int i2 = dVar4.f30029b;
                f2 = f3 + i + ((i2 - i) * this.f30019k0);
                int i3 = this.f30011c0;
                if (i3 == 1) {
                    canvas.drawText(dVar3.f30028a, f2 - i, this.f29995M, u);
                    u2.setAlpha((int) (this.f30019k0 * 255.0f));
                    canvas.drawText(this.f30009b0.f30028a, this.f30007a0.m9642a(), this.f30009b0.m9642a(), f2 - this.f30009b0.f30029b, this.f29995M, (Paint) u2);
                } else if (i3 == 2) {
                    canvas.drawText(dVar4.f30028a, f2 - i2, this.f29995M, u2);
                    u.setAlpha((int) ((1.0f - this.f30019k0) * 255.0f));
                    canvas.drawText(this.f30007a0.f30028a, this.f30009b0.m9642a(), this.f30007a0.m9642a(), f2 - this.f30007a0.f30029b, this.f29995M, (Paint) u);
                } else if (i3 == 3) {
                    if (this.f30012d0 > 0) {
                        u.setAlpha(255);
                        canvas.drawText(this.f30007a0.f30028a, 0, this.f30012d0, f2 - this.f30013e0, this.f29995M, (Paint) u);
                    }
                    u.setAlpha((int) ((1.0f - this.f30019k0) * 255.0f));
                    String str = this.f30007a0.f30028a;
                    canvas.drawText(str, this.f30012d0, str.length(), f2 - this.f30007a0.f30029b, this.f29995M, (Paint) u);
                    u2.setAlpha((int) (this.f30019k0 * 255.0f));
                    String str2 = this.f30009b0.f30028a;
                    canvas.drawText(str2, this.f30012d0, str2.length(), f2 - this.f30009b0.f30029b, this.f29995M, (Paint) u2);
                }
            } else {
                int i4 = this.f30011c0;
                if (i4 == 1) {
                    canvas.drawText(this.f30007a0.f30028a, f3, this.f29995M, u);
                    u2.setAlpha((int) (this.f30019k0 * 255.0f));
                    canvas.drawText(this.f30009b0.f30028a, this.f30007a0.m9642a(), this.f30009b0.m9642a(), f3 + this.f30007a0.f30029b, this.f29995M, (Paint) u2);
                } else if (i4 == 2) {
                    canvas.drawText(this.f30009b0.f30028a, f3, this.f29995M, u2);
                    u.setAlpha((int) ((1.0f - this.f30019k0) * 255.0f));
                    canvas.drawText(this.f30007a0.f30028a, this.f30009b0.m9642a(), this.f30007a0.m9642a(), f3 + this.f30009b0.f30029b, this.f29995M, (Paint) u);
                } else if (i4 == 3) {
                    if (this.f30012d0 > 0) {
                        u.setAlpha(255);
                        canvas.drawText(this.f30007a0.f30028a, 0, this.f30012d0, f3, this.f29995M, (Paint) u);
                    }
                    u.setAlpha((int) ((1.0f - this.f30019k0) * 255.0f));
                    String str3 = this.f30007a0.f30028a;
                    canvas.drawText(str3, this.f30012d0, str3.length(), f3 + this.f30013e0, this.f29995M, (Paint) u);
                    u2.setAlpha((int) (this.f30019k0 * 255.0f));
                    String str4 = this.f30009b0.f30028a;
                    canvas.drawText(str4, this.f30012d0, str4.length(), f3 + this.f30013e0, this.f29995M, (Paint) u2);
                }
                int i5 = this.f30007a0.f30029b;
                f2 = f3 + i5 + ((this.f30009b0.f30029b - i5) * this.f30019k0);
            }
        }
        return z ? f2 + this.f30008b : f2;
    }

    public final TextPaint m9654u(boolean z, boolean z2) {
        if (z2) {
            return C1410y.m37066O(this.f30004V, C11524j.m228N(this.f30003U), z);
        }
        return C1410y.m37065P(this.f30004V, z);
    }

    public void m9653v(float f, int i, int i2, int i3, int i4) {
        this.f30004V = f;
        this.f30003U = i;
        this.f30000R = i2;
        this.f30010c = i3;
        this.f29995M = i4;
        m9649z();
    }

    public void m9652w(int i, boolean z) {
        int i2 = this.f30014f0;
        if (i2 != i && i >= 0 && i < 99999) {
            if (i2 != 0) {
                for (int i3 = 0; i3 < this.f29998P; i3++) {
                    this.f29997O[i3].m9645d();
                }
            }
            this.f30014f0 = i;
            if (z) {
                m9665j(true);
                return;
            }
            m9662m();
            m9664k();
        }
    }

    public void m9651x(float f, int i) {
        m9653v(f, i, C1357a0.m37544i(20.0f), 0, C1357a0.m37544i(20.0f) + C1357a0.m37544i(15.0f));
    }

    public void m9650y(int i) {
        m9651x(19.0f, i);
    }

    public final void m9649z() {
        m9676G();
        int i = 0;
        while (true) {
            C9281b[] bVarArr = this.f29997O;
            if (i < bVarArr.length) {
                bVarArr[i] = new C9281b(this.f30001S, this.f30000R);
                i++;
            } else {
                this.f30006a = (int) Math.ceil(this.f30002T * bVarArr.length);
                this.f30008b = (int) C7389v0.m16680T1(" ", C1410y.m37065P(this.f30004V, false));
                return;
            }
        }
    }
}
