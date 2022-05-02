package me;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1389o;
import be.C1410y;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p082fd.C4403w;
import p108hb.C5064d;
import p364zd.C11524j;

public class RunnableC6832a3 extends RecyclerView implements Runnable {
    public int f21385B1;
    public int f21386C1;
    public float f21391H1;
    public boolean f21392I1;
    public int f21393J1;
    public int f21394K1;
    public final int f21396M1;
    public final int f21397N1;
    public int f21400Q1;
    public int f21401R1;
    public int f21402S1;
    public boolean f21403T1;
    public float f21408Y1;
    public String f21409Z1;
    public int f21410a2;
    public boolean f21411b2;
    public float f21412c2;
    public LinearLayoutManager f21413u1;
    public AbstractC6836d f21414v1;
    public final Paint f21415w1;
    public final Paint f21416x1;
    public boolean f21384A1 = true;
    public char[] f21387D1 = new char[5];
    public int[] f21388E1 = new int[5];
    public String[] f21389F1 = new String[5];
    public float[] f21390G1 = new float[5];
    public final RectF f21395L1 = new RectF();
    public final int f21398O1 = C1357a0.m37541i(9.0f);
    public final int f21399P1 = C1357a0.m37541i(32.0f);
    public final RectF f21404U1 = new RectF();
    public final int f21405V1 = C1357a0.m37541i(44.0f);
    public final int f21406W1 = C1357a0.m37541i(13.0f);
    public final int f21407X1 = C1357a0.m37541i(3.0f);
    public int f21417y1 = C1357a0.m37541i(25.0f);
    public int f21418z1 = C1357a0.m37541i(7.0f);

    public class C6833a extends RecyclerView.AbstractC0910t {
        public C6833a() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            RunnableC6832a3.this.f21400Q1 += i2;
            RunnableC6832a3.this.m18850R1();
        }
    }

    public static class C6834b {
        public int f21420a;
        public int f21421b;

        public C6834b() {
        }
    }

    public static class C6835c extends RecyclerView.AbstractC0886d0 {
        public C6835c(View view) {
            super(view);
        }
    }

    public static abstract class AbstractC6836d extends RecyclerView.AbstractC0890h<C6835c> {
        public C6834b[] f21422M;
        public int f21423N;
        public RunnableC6832a3 f21424O;
        public Context f21425P;
        public boolean f21426Q;

        public class C6837a extends RecyclerView.AbstractC0893j {
            public C6837a() {
            }

            @Override
            public void mo18824a() {
                AbstractC6836d.this.m18826u0();
                m18821g();
            }

            @Override
            public void mo18823d(int i, int i2) {
                m18821g();
            }

            @Override
            public void mo18822f(int i, int i2) {
                m18821g();
            }

            public final void m18821g() {
                RunnableC6832a3 a3Var = AbstractC6836d.this.f21424O;
                a3Var.post(a3Var);
            }
        }

        public AbstractC6836d(RunnableC6832a3 a3Var) {
            this.f21424O = a3Var;
            this.f21425P = a3Var.getContext();
            m39303Y(new C6837a());
        }

        @Override
        public final int mo6153D() {
            return this.f21423N;
        }

        @Override
        public int mo6150F(int i) {
            return !m18831p0(i);
        }

        public void mo18843d0(C6835c cVar) {
        }

        public abstract View mo18842e0(int i);

        public void mo18841f0(C6835c cVar) {
        }

        public abstract int mo18840g0();

        public int mo18839h0(int i) {
            return mo18840g0();
        }

        public abstract int mo18838i0(int i);

        public abstract int mo18837j0();

        public int m18836k0(int i) {
            C6834b[] bVarArr;
            int i2 = 0;
            for (C6834b bVar : this.f21422M) {
                int i3 = bVar.f21420a;
                if (i == i3) {
                    return this.f21426Q ? i2 == 0 ? 0 : -1 : i2;
                }
                if (i > i3 && i < i3 + bVar.f21421b) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }

        public abstract String mo18835l0(int i);

        public int m18834m0(int i) {
            int k0 = m18836k0(i);
            if (k0 == -1) {
                return -1;
            }
            if (k0 == 0) {
                return i;
            }
            if (this.f21426Q) {
                return (i - this.f21422M[k0].f21420a) - 1;
            }
            return i - this.f21422M[k0].f21420a;
        }

        public final int m18833n0() {
            return C1357a0.m37541i(22.0f);
        }

        public boolean m18832o0() {
            C6834b[] bVarArr = this.f21422M;
            return bVarArr != null && bVarArr.length == mo18837j0();
        }

        public boolean m18831p0(int i) {
            return this.f21426Q && m18834m0(i) == -1;
        }

        public void mo6146Q(C6835c cVar, int i) {
            if (!m18831p0(i)) {
                mo18825w0(cVar, i);
            }
        }

        public C6835c mo6145S(ViewGroup viewGroup, int i) {
            if (i != 0) {
                return new C6835c(mo18842e0(i));
            }
            C6862d3 d3Var = new C6862d3(this.f21425P);
            d3Var.setLayoutParams(new RecyclerView.LayoutParams(-1, m18833n0()));
            d3Var.m18735c(C1357a0.m37539k(72.0f), C1357a0.m37539k(22.0f));
            return new C6835c(d3Var);
        }

        public void mo6144V(C6835c cVar) {
            if (cVar.m39332n() == 0) {
                mo18843d0(cVar);
            }
        }

        public void mo6143W(C6835c cVar) {
            if (cVar.m39332n() == 0) {
                mo18841f0(cVar);
            }
        }

        public void m18826u0() {
            boolean z;
            C6834b[] bVarArr;
            C6834b[] bVarArr2 = this.f21422M;
            if (bVarArr2 == null || bVarArr2.length != mo18837j0()) {
                this.f21422M = new C6834b[mo18837j0()];
                z = true;
            } else {
                z = false;
            }
            int i = 0;
            int i2 = 0;
            for (C6834b bVar : this.f21422M) {
                if (z) {
                    bVar = new C6834b();
                    this.f21422M[i2] = bVar;
                }
                int i0 = mo18838i0(i2);
                bVar.f21420a = i;
                if (i != 0 && this.f21426Q) {
                    i0++;
                }
                bVar.f21421b = i0;
                i += i0;
                i2++;
            }
            this.f21423N = i;
        }

        public abstract void mo18825w0(C6835c cVar, int i);
    }

    public RunnableC6832a3(Context context) {
        super(context);
        int i = C1357a0.m37541i(2.0f);
        this.f21396M1 = i;
        this.f21397N1 = i + i;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.f21413u1 = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        m39422k(new C6833a());
        Paint paint = new Paint(5);
        this.f21415w1 = paint;
        paint.setTypeface(C1389o.m37262g());
        paint.setTextSize(C1357a0.m37541i(20.0f));
        Paint paint2 = new Paint(5);
        this.f21416x1 = paint2;
        paint2.setColor(C11524j.m161p0());
        paint2.setTypeface(C1389o.m37260i());
        paint2.setTextSize(C1357a0.m37541i(32.0f));
    }

    public void m18853O1(float f, ValueAnimator valueAnimator) {
        setFactor(f - (C2057b.m35735a(valueAnimator) * f));
    }

    public void m18852P1(float f, float f2, ValueAnimator valueAnimator) {
        setFactor(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public final float m18857K1() {
        if (this.f21413u1.m39549X1() == 0) {
            View C = this.f21413u1.mo39262C(0);
            if (C != null) {
                this.f21400Q1 = -C.getTop();
            } else {
                this.f21400Q1 = 0;
            }
        }
        int D = this.f21414v1.mo6153D();
        if (D != this.f21402S1 || this.f21403T1) {
            this.f21403T1 = false;
            int n0 = this.f21414v1.m18833n0();
            this.f21402S1 = D;
            this.f21401R1 = 0;
            int i = 0;
            for (int i2 = 0; i2 < D; i2++) {
                if (this.f21414v1.m18831p0(i2)) {
                    this.f21401R1 += n0;
                } else {
                    this.f21401R1 += this.f21414v1.mo18839h0(i);
                    i++;
                }
            }
        }
        return this.f21400Q1 / (this.f21401R1 - getMeasuredHeight());
    }

    public final boolean m18856L1(float f, float f2) {
        if (this.f21386C1 > 0 && this.f21392I1) {
            RectF rectF = this.f21395L1;
            float f3 = rectF.left;
            int i = this.f21398O1;
            if (f >= f3 - i && f <= rectF.right + i && f2 >= rectF.top - i && f2 <= rectF.bottom + i) {
                return true;
            }
        }
        return false;
    }

    public final void m18855M1(boolean z) {
        if (z) {
            ValueAnimator b = C2057b.m35734b();
            final float factor = getFactor();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RunnableC6832a3.this.m18853O1(factor, valueAnimator);
                }
            });
            b.setDuration(150L);
            b.setInterpolator(C2057b.f7280b);
            b.start();
            return;
        }
        setFactor(0.0f);
    }

    public void m18854N1() {
        this.f21403T1 = true;
    }

    public final void m18851Q1() {
        AbstractC6836d dVar = this.f21414v1;
        if (dVar == null || dVar.mo18837j0() == 0) {
            this.f21392I1 = false;
            return;
        }
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight <= 0) {
            this.f21392I1 = false;
            return;
        }
        int T1 = this.f21413u1.m39553T1();
        int Y1 = this.f21413u1.m39548Y1();
        if (T1 == 0 && Y1 == this.f21414v1.mo6153D() - 1) {
            this.f21392I1 = false;
            return;
        }
        this.f21392I1 = true;
        int measuredWidth = getMeasuredWidth();
        float K1 = m18857K1();
        int i = this.f21398O1;
        int i2 = (measuredHeight - i) - i;
        int max = Math.max((int) (i2 * Math.min(1.0f, measuredHeight / this.f21401R1)), this.f21399P1);
        this.f21394K1 = max;
        int i3 = i2 - max;
        this.f21393J1 = i3;
        RectF rectF = this.f21395L1;
        float f = this.f21398O1 + ((int) (i3 * K1));
        rectF.top = f;
        rectF.bottom = f + max;
        rectF.right = C4403w.m27984G2() ? this.f21398O1 + this.f21397N1 : measuredWidth - this.f21398O1;
        RectF rectF2 = this.f21395L1;
        rectF2.left = rectF2.right - this.f21397N1;
    }

    public void m18850R1() {
        m18849S1();
        m18851Q1();
    }

    public final void m18849S1() {
        int k0;
        int k02;
        AbstractC6836d dVar = this.f21414v1;
        if (dVar == null || dVar.mo18837j0() == 0) {
            this.f21386C1 = 0;
            return;
        }
        int X1 = this.f21413u1.m39549X1();
        int a2 = this.f21413u1.m39546a2();
        int i = X1;
        while (true) {
            k0 = this.f21414v1.m18836k0(i);
            if (k0 != -1 || i > a2) {
                break;
            }
            i++;
        }
        while (true) {
            k02 = this.f21414v1.m18836k0(a2);
            if (k02 != -1 || a2 < X1) {
                break;
            }
            a2--;
        }
        if (k0 == -1 || k02 == -1) {
            this.f21386C1 = 0;
            return;
        }
        int i2 = (k02 - k0) + 1;
        this.f21386C1 = i2;
        if (this.f21389F1.length < i2) {
            this.f21389F1 = new String[i2];
            this.f21388E1 = new int[i2];
            this.f21390G1 = new float[i2];
        }
        for (int i3 = 0; i3 < this.f21386C1; i3++) {
            int i4 = k0 + i3;
            this.f21389F1[i3] = this.f21414v1.mo18835l0(i4);
            this.f21390G1[i3] = C7389v0.m16680T1(this.f21389F1[i3], this.f21415w1);
            C6834b bVar = this.f21414v1.f21422M[i4];
            View C = this.f21413u1.mo39262C((bVar.f21420a == 0 || !this.f21414v1.f21426Q) ? bVar.f21420a : bVar.f21420a + 1);
            if (i3 == 0) {
                int i5 = (int) (this.f21385B1 * 0.5f);
                int top = C == null ? 0 : C.getTop() + i5;
                if (i5 < top || ((this.f21414v1.f21426Q && bVar.f21421b == 2) || (!this.f21414v1.f21426Q && bVar.f21421b == 1))) {
                    this.f21388E1[i3] = top;
                    this.f21391H1 = 1.0f;
                } else {
                    View C2 = this.f21413u1.mo39262C((bVar.f21420a + bVar.f21421b) - 1);
                    if (C2 == null) {
                        this.f21388E1[i3] = i5;
                        this.f21391H1 = 1.0f;
                    } else {
                        int top2 = C2.getTop() + i5;
                        if (i5 < top2) {
                            this.f21388E1[i3] = i5;
                            this.f21391H1 = 1.0f;
                        } else if ((!this.f21414v1.f21426Q || bVar.f21421b != 2) && (this.f21414v1.f21426Q || bVar.f21421b != 1)) {
                            this.f21388E1[i3] = top2;
                            this.f21391H1 = 1.0f - (Math.abs(top2 - i5) / this.f21385B1);
                        } else {
                            this.f21388E1[i3] = top2;
                            this.f21391H1 = 1.0f;
                        }
                    }
                }
            } else {
                this.f21388E1[i3] = C == null ? -1 : C.getTop() + ((int) (this.f21385B1 * 0.5f));
            }
        }
    }

    public final void m18848T1(float f) {
        this.f21412c2 = f;
        int measuredHeight = (int) ((f - this.f21412c2) * (this.f21401R1 / getMeasuredHeight()));
        if (measuredHeight != 0) {
            scrollBy(0, measuredHeight);
        }
    }

    public final void m18847U1() {
        final float factor = getFactor();
        final float f = 1.0f - factor;
        ValueAnimator b = C2057b.m35734b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RunnableC6832a3.this.m18852P1(factor, f, valueAnimator);
            }
        });
        b.setDuration(150L);
        b.setInterpolator(C2057b.f7280b);
        b.start();
        m39496D1();
    }

    public void m18846V1() {
        this.f21384A1 = false;
    }

    @Override
    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        super.draw(canvas);
        if (this.f21384A1) {
            this.f21415w1.setColor(C11524j.m213U0());
            boolean G2 = C4403w.m27984G2();
            int measuredWidth = getMeasuredWidth();
            float f = this.f21391H1;
            if (f == 1.0f || this.f21386C1 <= 0) {
                for (int i9 = 0; i9 < this.f21386C1; i9++) {
                    canvas.drawText(this.f21389F1[i9], G2 ? (measuredWidth - i6) - this.f21390G1[i9] : this.f21417y1, this.f21388E1[i9] + this.f21418z1, this.f21415w1);
                }
            } else {
                this.f21415w1.setAlpha((int) (f * 255.0f));
                canvas.drawText(this.f21389F1[0], G2 ? (measuredWidth - i7) - this.f21390G1[0] : this.f21417y1, this.f21388E1[0] + this.f21418z1, this.f21415w1);
                this.f21415w1.setAlpha(255);
                for (int i10 = 1; i10 < this.f21386C1; i10++) {
                    canvas.drawText(this.f21389F1[i10], G2 ? (measuredWidth - i8) - this.f21390G1[i10] : this.f21417y1, this.f21388E1[i10] + this.f21418z1, this.f21415w1);
                }
            }
        }
        if (this.f21392I1 && this.f21393J1 > 0) {
            int N = C11524j.m228N(R.id.theme_color_sectionedScrollBar);
            int c = C5064d.m24129c(C11524j.m167m0(), C11524j.m228N(R.id.theme_color_sectionedScrollBarActive));
            int c2 = C5064d.m24129c(C11524j.m161p0(), C11524j.m228N(R.id.theme_color_sectionedScrollBarActiveContent));
            RectF rectF = this.f21395L1;
            int i11 = this.f21396M1;
            canvas.drawRoundRect(rectF, i11, i11, C1410y.m37039g(C5064d.m24128d(N, c, this.f21408Y1)));
            if (this.f21386C1 > 0 && this.f21408Y1 > 0.0f) {
                String[] strArr = this.f21389F1;
                if (!(strArr[0] == null || strArr[0].length() == 0)) {
                    String str = this.f21409Z1;
                    if (str == null || !str.equals(this.f21389F1[0])) {
                        String str2 = this.f21389F1[0];
                        this.f21409Z1 = str2;
                        this.f21410a2 = (int) C7389v0.m16680T1(str2, this.f21416x1);
                    }
                    int i12 = this.f21394K1;
                    int i13 = this.f21405V1;
                    if (i12 >= i13) {
                        i12 = i13;
                    }
                    int i14 = (int) (C4403w.m27984G2() ? this.f21395L1.right + this.f21398O1 + this.f21405V1 : (this.f21395L1.left - this.f21398O1) - this.f21405V1);
                    float f2 = i12;
                    int max = (int) Math.max((this.f21395L1.top + f2) - this.f21405V1, i + this.f21398O1);
                    int i15 = C4403w.m27984G2() ? i14 - this.f21405V1 : i14;
                    float f3 = this.f21395L1.top;
                    float f4 = f2 * 0.5f;
                    int i16 = (int) (f3 + f4);
                    if (i16 < max) {
                        i3 = (int) f3;
                        i2 = max;
                    } else {
                        i2 = ((int) f3) + i12;
                        i3 = max;
                    }
                    int i17 = i2 - i3;
                    int i18 = this.f21405V1;
                    float min = i17 < i18 ? 1.0f - Math.min(1.0f, (i18 - i17) / (i18 * 0.5f)) : 1.0f;
                    float f5 = this.f21408Y1;
                    boolean z = f5 != 1.0f;
                    if (z) {
                        float f6 = this.f21395L1.top + f4;
                        canvas.save();
                        canvas.translate((C4403w.m27984G2() ? -this.f21398O1 : this.f21398O1) * (1.0f - this.f21408Y1), 0.0f);
                        canvas.scale(f5, f5, C4403w.m27984G2() ? i15 : this.f21405V1 + i15, f6);
                        min *= this.f21408Y1;
                    }
                    int d = C5064d.m24128d(C5064d.m24129c(C11524j.m148w(), N), c, this.f21408Y1);
                    if (min != 0.0f) {
                        RectF rectF2 = this.f21404U1;
                        int i19 = this.f21405V1;
                        rectF2.top = max - i19;
                        rectF2.bottom = max + i19;
                        rectF2.left = i14 - i19;
                        rectF2.right = i19 + i14;
                        canvas.save();
                        if (i16 < max) {
                            int i20 = this.f21405V1;
                            canvas.clipRect(i15, max - i20, i20 + i15, max);
                        } else {
                            int i21 = this.f21405V1;
                            canvas.clipRect(i15, max, i15 + i21, i21 + max);
                        }
                        float max2 = Math.max(this.f21407X1, this.f21405V1 * (1.0f - min));
                        canvas.drawRoundRect(this.f21404U1, max2, max2, C1410y.m37039g(d));
                        canvas.restore();
                    }
                    float f7 = i14;
                    float f8 = max;
                    canvas.drawCircle(f7, f8, this.f21405V1, C1410y.m37039g(d));
                    this.f21416x1.setColor(C5064d.m24131a(this.f21408Y1, c2));
                    if (this.f21409Z1.length() <= 2 || (i4 = this.f21410a2) <= (i5 = this.f21405V1)) {
                        canvas.drawText(this.f21409Z1, i14 - ((int) (this.f21410a2 * 0.5f)), max + this.f21406W1, this.f21416x1);
                    } else {
                        float f9 = i5 / i4;
                        canvas.save();
                        canvas.scale(f9, f9, f7, f8);
                        canvas.drawText(this.f21409Z1, i14 - ((int) (this.f21410a2 * 0.5f)), max + this.f21406W1, this.f21416x1);
                        canvas.restore();
                    }
                    if (z) {
                        canvas.restore();
                    }
                }
            }
        }
    }

    public float getFactor() {
        return this.f21408Y1;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() == 0 ? m18856L1(motionEvent.getX(), motionEvent.getY()) || super.onInterceptTouchEvent(motionEvent) : this.f21411b2 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        AbstractC6836d dVar = this.f21414v1;
        if (dVar != null && dVar.m18832o0()) {
            post(this);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f21412c2 = y;
            boolean L1 = m18856L1(x, y);
            this.f21411b2 = L1;
            if (L1) {
                m18847U1();
            }
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3 && this.f21411b2) {
                    m18855M1(false);
                    this.f21411b2 = false;
                    return true;
                }
            } else if (this.f21411b2) {
                m18848T1(motionEvent.getY());
            }
        } else if (this.f21411b2) {
            m18855M1(true);
            this.f21411b2 = false;
            return true;
        }
        return this.f21411b2 || super.onTouchEvent(motionEvent);
    }

    @Override
    public void run() {
        m18850R1();
        invalidate();
    }

    public void setFactor(float f) {
        if (this.f21408Y1 != f) {
            this.f21408Y1 = f;
            invalidate();
        }
    }

    public void setSectionedAdapter(AbstractC6836d dVar) {
        this.f21414v1 = dVar;
        this.f21385B1 = dVar.mo18840g0();
        setAdapter(dVar);
    }
}
