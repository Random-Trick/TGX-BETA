package ne;

import ae.j;
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
import ce.a0;
import ce.o;
import ce.y;
import gd.w;
import oc.v0;
import org.thunderdog.challegram.R;

public class a3 extends RecyclerView implements Runnable {
    public int A1;
    public int B1;
    public float G1;
    public boolean H1;
    public int I1;
    public int J1;
    public final int L1;
    public final int M1;
    public int P1;
    public int Q1;
    public int R1;
    public boolean S1;
    public float X1;
    public String Y1;
    public int Z1;
    public boolean f17858a2;
    public float f17859b2;
    public LinearLayoutManager f17860t1;
    public d f17861u1;
    public final Paint f17862v1;
    public final Paint f17863w1;
    public boolean f17866z1 = true;
    public char[] C1 = new char[5];
    public int[] D1 = new int[5];
    public String[] E1 = new String[5];
    public float[] F1 = new float[5];
    public final RectF K1 = new RectF();
    public final int N1 = a0.i(9.0f);
    public final int O1 = a0.i(32.0f);
    public final RectF T1 = new RectF();
    public final int U1 = a0.i(44.0f);
    public final int V1 = a0.i(13.0f);
    public final int W1 = a0.i(3.0f);
    public int f17864x1 = a0.i(25.0f);
    public int f17865y1 = a0.i(7.0f);

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            a3.this.P1 += i11;
            a3.this.Q1();
        }
    }

    public static class b {
        public int f17868a;
        public int f17869b;

        public b() {
        }
    }

    public static class c extends RecyclerView.c0 {
        public c(View view) {
            super(view);
        }
    }

    public static abstract class d extends RecyclerView.h<c> {
        public b[] M;
        public int N;
        public a3 O;
        public Context P;
        public boolean Q;

        public class a extends RecyclerView.j {
            public a() {
            }

            @Override
            public void a() {
                d.this.t0();
                g();
            }

            @Override
            public void d(int i10, int i11) {
                g();
            }

            @Override
            public void f(int i10, int i11) {
                g();
            }

            public final void g() {
                a3 a3Var = d.this.O;
                a3Var.post(a3Var);
            }
        }

        public d(a3 a3Var) {
            this.O = a3Var;
            this.P = a3Var.getContext();
            Y(new a());
        }

        @Override
        public final int D() {
            return this.N;
        }

        @Override
        public int F(int i10) {
            return !o0(i10);
        }

        public void c0(c cVar) {
        }

        public abstract View d0(int i10);

        public void e0(c cVar) {
        }

        public abstract int f0();

        public int g0(int i10) {
            return f0();
        }

        public abstract int h0(int i10);

        public abstract int i0();

        public int j0(int i10) {
            b[] bVarArr;
            int i11 = 0;
            for (b bVar : this.M) {
                int i12 = bVar.f17868a;
                if (i10 == i12) {
                    return this.Q ? i11 == 0 ? 0 : -1 : i11;
                }
                if (i10 > i12 && i10 < i12 + bVar.f17869b) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }

        public abstract String k0(int i10);

        public int l0(int i10) {
            int j02 = j0(i10);
            if (j02 == -1) {
                return -1;
            }
            if (j02 == 0) {
                return i10;
            }
            if (this.Q) {
                return (i10 - this.M[j02].f17868a) - 1;
            }
            return i10 - this.M[j02].f17868a;
        }

        public final int m0() {
            return a0.i(22.0f);
        }

        public boolean n0() {
            b[] bVarArr = this.M;
            return bVarArr != null && bVarArr.length == i0();
        }

        public boolean o0(int i10) {
            return this.Q && l0(i10) == -1;
        }

        public void Q(c cVar, int i10) {
            if (!o0(i10)) {
                u0(cVar, i10);
            }
        }

        public c S(ViewGroup viewGroup, int i10) {
            if (i10 != 0) {
                return new c(d0(i10));
            }
            d3 d3Var = new d3(this.P);
            d3Var.setLayoutParams(new RecyclerView.LayoutParams(-1, m0()));
            d3Var.c(a0.k(72.0f), a0.k(22.0f));
            return new c(d3Var);
        }

        public void V(c cVar) {
            if (cVar.n() == 0) {
                c0(cVar);
            }
        }

        public void W(c cVar) {
            if (cVar.n() == 0) {
                e0(cVar);
            }
        }

        public void t0() {
            boolean z10;
            b[] bVarArr;
            b[] bVarArr2 = this.M;
            if (bVarArr2 == null || bVarArr2.length != i0()) {
                this.M = new b[i0()];
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = 0;
            int i11 = 0;
            for (b bVar : this.M) {
                if (z10) {
                    bVar = new b();
                    this.M[i11] = bVar;
                }
                int h02 = h0(i11);
                bVar.f17868a = i10;
                if (i10 != 0 && this.Q) {
                    h02++;
                }
                bVar.f17869b = h02;
                i10 += h02;
                i11++;
            }
            this.N = i10;
        }

        public abstract void u0(c cVar, int i10);
    }

    public a3(Context context) {
        super(context);
        int i10 = a0.i(2.0f);
        this.L1 = i10;
        this.M1 = i10 + i10;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.f17860t1 = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        k(new a());
        Paint paint = new Paint(5);
        this.f17862v1 = paint;
        paint.setTypeface(o.g());
        paint.setTextSize(a0.i(20.0f));
        Paint paint2 = new Paint(5);
        this.f17863w1 = paint2;
        paint2.setColor(j.n0());
        paint2.setTypeface(o.i());
        paint2.setTextSize(a0.i(32.0f));
    }

    public void N1(float f10, ValueAnimator valueAnimator) {
        setFactor(f10 - (db.b.a(valueAnimator) * f10));
    }

    public void O1(float f10, float f11, ValueAnimator valueAnimator) {
        setFactor(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public final float J1() {
        if (this.f17860t1.X1() == 0) {
            View C = this.f17860t1.C(0);
            if (C != null) {
                this.P1 = -C.getTop();
            } else {
                this.P1 = 0;
            }
        }
        int D = this.f17861u1.D();
        if (D != this.R1 || this.S1) {
            this.S1 = false;
            int m02 = this.f17861u1.m0();
            this.R1 = D;
            this.Q1 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < D; i11++) {
                if (this.f17861u1.o0(i11)) {
                    this.Q1 += m02;
                } else {
                    this.Q1 += this.f17861u1.g0(i10);
                    i10++;
                }
            }
        }
        return this.P1 / (this.Q1 - getMeasuredHeight());
    }

    public final boolean K1(float f10, float f11) {
        if (this.B1 > 0 && this.H1) {
            RectF rectF = this.K1;
            float f12 = rectF.left;
            int i10 = this.N1;
            if (f10 >= f12 - i10 && f10 <= rectF.right + i10 && f11 >= rectF.top - i10 && f11 <= rectF.bottom + i10) {
                return true;
            }
        }
        return false;
    }

    public final void L1(boolean z10) {
        if (z10) {
            ValueAnimator b10 = db.b.b();
            final float factor = getFactor();
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    a3.this.N1(factor, valueAnimator);
                }
            });
            b10.setDuration(150L);
            b10.setInterpolator(db.b.f7287b);
            b10.start();
            return;
        }
        setFactor(0.0f);
    }

    public void M1() {
        this.S1 = true;
    }

    public final void P1() {
        d dVar = this.f17861u1;
        if (dVar == null || dVar.i0() == 0) {
            this.H1 = false;
            return;
        }
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight <= 0) {
            this.H1 = false;
            return;
        }
        int T1 = this.f17860t1.T1();
        int Y1 = this.f17860t1.Y1();
        if (T1 == 0 && Y1 == this.f17861u1.D() - 1) {
            this.H1 = false;
            return;
        }
        this.H1 = true;
        int measuredWidth = getMeasuredWidth();
        float J1 = J1();
        int i10 = this.N1;
        int i11 = (measuredHeight - i10) - i10;
        int max = Math.max((int) (i11 * Math.min(1.0f, measuredHeight / this.Q1)), this.O1);
        this.J1 = max;
        int i12 = i11 - max;
        this.I1 = i12;
        RectF rectF = this.K1;
        float f10 = this.N1 + ((int) (i12 * J1));
        rectF.top = f10;
        rectF.bottom = f10 + max;
        rectF.right = w.G2() ? this.N1 + this.M1 : measuredWidth - this.N1;
        RectF rectF2 = this.K1;
        rectF2.left = rectF2.right - this.M1;
    }

    public void Q1() {
        R1();
        P1();
    }

    public final void R1() {
        int j02;
        int j03;
        d dVar = this.f17861u1;
        if (dVar == null || dVar.i0() == 0) {
            this.B1 = 0;
            return;
        }
        int X1 = this.f17860t1.X1();
        int a22 = this.f17860t1.a2();
        int i10 = X1;
        while (true) {
            j02 = this.f17861u1.j0(i10);
            if (j02 != -1 || i10 > a22) {
                break;
            }
            i10++;
        }
        while (true) {
            j03 = this.f17861u1.j0(a22);
            if (j03 != -1 || a22 < X1) {
                break;
            }
            a22--;
        }
        if (j02 == -1 || j03 == -1) {
            this.B1 = 0;
            return;
        }
        int i11 = (j03 - j02) + 1;
        this.B1 = i11;
        if (this.E1.length < i11) {
            this.E1 = new String[i11];
            this.D1 = new int[i11];
            this.F1 = new float[i11];
        }
        for (int i12 = 0; i12 < this.B1; i12++) {
            int i13 = j02 + i12;
            this.E1[i12] = this.f17861u1.k0(i13);
            this.F1[i12] = v0.T1(this.E1[i12], this.f17862v1);
            b bVar = this.f17861u1.M[i13];
            View C = this.f17860t1.C((bVar.f17868a == 0 || !this.f17861u1.Q) ? bVar.f17868a : bVar.f17868a + 1);
            if (i12 == 0) {
                int i14 = (int) (this.A1 * 0.5f);
                int top = C == null ? 0 : C.getTop() + i14;
                if (i14 < top || ((this.f17861u1.Q && bVar.f17869b == 2) || (!this.f17861u1.Q && bVar.f17869b == 1))) {
                    this.D1[i12] = top;
                    this.G1 = 1.0f;
                } else {
                    View C2 = this.f17860t1.C((bVar.f17868a + bVar.f17869b) - 1);
                    if (C2 == null) {
                        this.D1[i12] = i14;
                        this.G1 = 1.0f;
                    } else {
                        int top2 = C2.getTop() + i14;
                        if (i14 < top2) {
                            this.D1[i12] = i14;
                            this.G1 = 1.0f;
                        } else if ((!this.f17861u1.Q || bVar.f17869b != 2) && (this.f17861u1.Q || bVar.f17869b != 1)) {
                            this.D1[i12] = top2;
                            this.G1 = 1.0f - (Math.abs(top2 - i14) / this.A1);
                        } else {
                            this.D1[i12] = top2;
                            this.G1 = 1.0f;
                        }
                    }
                }
            } else {
                this.D1[i12] = C == null ? -1 : C.getTop() + ((int) (this.A1 * 0.5f));
            }
        }
    }

    public final void S1(float f10) {
        this.f17859b2 = f10;
        int measuredHeight = (int) ((f10 - this.f17859b2) * (this.Q1 / getMeasuredHeight()));
        if (measuredHeight != 0) {
            scrollBy(0, measuredHeight);
        }
    }

    public final void T1() {
        final float factor = getFactor();
        final float f10 = 1.0f - factor;
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                a3.this.O1(factor, f10, valueAnimator);
            }
        });
        b10.setDuration(150L);
        b10.setInterpolator(db.b.f7287b);
        b10.start();
        C1();
    }

    public void U1() {
        this.f17866z1 = false;
    }

    @Override
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        super.draw(canvas);
        if (this.f17866z1) {
            this.f17862v1.setColor(j.R0());
            boolean G2 = w.G2();
            int measuredWidth = getMeasuredWidth();
            float f10 = this.G1;
            if (f10 == 1.0f || this.B1 <= 0) {
                for (int i18 = 0; i18 < this.B1; i18++) {
                    canvas.drawText(this.E1[i18], G2 ? (measuredWidth - i15) - this.F1[i18] : this.f17864x1, this.D1[i18] + this.f17865y1, this.f17862v1);
                }
            } else {
                this.f17862v1.setAlpha((int) (f10 * 255.0f));
                canvas.drawText(this.E1[0], G2 ? (measuredWidth - i16) - this.F1[0] : this.f17864x1, this.D1[0] + this.f17865y1, this.f17862v1);
                this.f17862v1.setAlpha(255);
                for (int i19 = 1; i19 < this.B1; i19++) {
                    canvas.drawText(this.E1[i19], G2 ? (measuredWidth - i17) - this.F1[i19] : this.f17864x1, this.D1[i19] + this.f17865y1, this.f17862v1);
                }
            }
        }
        if (this.H1 && this.I1 > 0) {
            int L = j.L(R.id.theme_color_sectionedScrollBar);
            int c10 = ib.d.c(j.k0(), j.L(R.id.theme_color_sectionedScrollBarActive));
            int c11 = ib.d.c(j.n0(), j.L(R.id.theme_color_sectionedScrollBarActiveContent));
            RectF rectF = this.K1;
            int i20 = this.L1;
            canvas.drawRoundRect(rectF, i20, i20, y.g(ib.d.d(L, c10, this.X1)));
            if (this.B1 > 0 && this.X1 > 0.0f) {
                String[] strArr = this.E1;
                if (!(strArr[0] == null || strArr[0].length() == 0)) {
                    String str = this.Y1;
                    if (str == null || !str.equals(this.E1[0])) {
                        String str2 = this.E1[0];
                        this.Y1 = str2;
                        this.Z1 = (int) v0.T1(str2, this.f17863w1);
                    }
                    int i21 = this.J1;
                    int i22 = this.U1;
                    if (i21 >= i22) {
                        i21 = i22;
                    }
                    int i23 = (int) (w.G2() ? this.K1.right + this.N1 + this.U1 : (this.K1.left - this.N1) - this.U1);
                    float f11 = i21;
                    int max = (int) Math.max((this.K1.top + f11) - this.U1, i10 + this.N1);
                    int i24 = w.G2() ? i23 - this.U1 : i23;
                    float f12 = this.K1.top;
                    float f13 = f11 * 0.5f;
                    int i25 = (int) (f12 + f13);
                    if (i25 < max) {
                        i12 = (int) f12;
                        i11 = max;
                    } else {
                        i11 = ((int) f12) + i21;
                        i12 = max;
                    }
                    int i26 = i11 - i12;
                    int i27 = this.U1;
                    float min = i26 < i27 ? 1.0f - Math.min(1.0f, (i27 - i26) / (i27 * 0.5f)) : 1.0f;
                    float f14 = this.X1;
                    boolean z10 = f14 != 1.0f;
                    if (z10) {
                        float f15 = this.K1.top + f13;
                        canvas.save();
                        canvas.translate((w.G2() ? -this.N1 : this.N1) * (1.0f - this.X1), 0.0f);
                        canvas.scale(f14, f14, w.G2() ? i24 : this.U1 + i24, f15);
                        min *= this.X1;
                    }
                    int d10 = ib.d.d(ib.d.c(j.u(), L), c10, this.X1);
                    if (min != 0.0f) {
                        RectF rectF2 = this.T1;
                        int i28 = this.U1;
                        rectF2.top = max - i28;
                        rectF2.bottom = max + i28;
                        rectF2.left = i23 - i28;
                        rectF2.right = i28 + i23;
                        canvas.save();
                        if (i25 < max) {
                            int i29 = this.U1;
                            canvas.clipRect(i24, max - i29, i29 + i24, max);
                        } else {
                            int i30 = this.U1;
                            canvas.clipRect(i24, max, i24 + i30, i30 + max);
                        }
                        float max2 = Math.max(this.W1, this.U1 * (1.0f - min));
                        canvas.drawRoundRect(this.T1, max2, max2, y.g(d10));
                        canvas.restore();
                    }
                    float f16 = i23;
                    float f17 = max;
                    canvas.drawCircle(f16, f17, this.U1, y.g(d10));
                    this.f17863w1.setColor(ib.d.a(this.X1, c11));
                    if (this.Y1.length() <= 2 || (i13 = this.Z1) <= (i14 = this.U1)) {
                        canvas.drawText(this.Y1, i23 - ((int) (this.Z1 * 0.5f)), max + this.V1, this.f17863w1);
                    } else {
                        float f18 = i14 / i13;
                        canvas.save();
                        canvas.scale(f18, f18, f16, f17);
                        canvas.drawText(this.Y1, i23 - ((int) (this.Z1 * 0.5f)), max + this.V1, this.f17863w1);
                        canvas.restore();
                    }
                    if (z10) {
                        canvas.restore();
                    }
                }
            }
        }
    }

    public float getFactor() {
        return this.X1;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() == 0 ? K1(motionEvent.getX(), motionEvent.getY()) || super.onInterceptTouchEvent(motionEvent) : this.f17858a2 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d dVar = this.f17861u1;
        if (dVar != null && dVar.n0()) {
            post(this);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f17859b2 = y10;
            boolean K1 = K1(x10, y10);
            this.f17858a2 = K1;
            if (K1) {
                T1();
            }
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3 && this.f17858a2) {
                    L1(false);
                    this.f17858a2 = false;
                    return true;
                }
            } else if (this.f17858a2) {
                S1(motionEvent.getY());
            }
        } else if (this.f17858a2) {
            L1(true);
            this.f17858a2 = false;
            return true;
        }
        return this.f17858a2 || super.onTouchEvent(motionEvent);
    }

    @Override
    public void run() {
        Q1();
        invalidate();
    }

    public void setFactor(float f10) {
        if (this.X1 != f10) {
            this.X1 = f10;
            invalidate();
        }
    }

    public void setSectionedAdapter(d dVar) {
        this.f17861u1 = dVar;
        this.A1 = dVar.f0();
        setAdapter(dVar);
    }
}
