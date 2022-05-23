package pc;

import ae.j;
import ae.t;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ce.a0;
import java.util.ArrayList;
import java.util.Iterator;
import oc.v0;
import org.thunderdog.challegram.R;
import pc.l;
import qc.a;
import rc.g;

public abstract class f<T extends qc.a, L extends rc.g> extends View implements l.b, t {
    public static final boolean H1;
    public static final boolean I1;
    public static l1.a J1;
    public int A1;
    public int B1;
    public int C1;
    public Animator D0;
    public long D1;
    public ValueAnimator E0;
    public boolean E1;
    public ValueAnimator F0;
    public ValueAnimator G0;
    public g G1;
    public T J0;
    public rc.b K0;
    public float L0;
    public float M0;
    public int N0;
    public int O0;
    public int P0;
    public Bitmap Q0;
    public Canvas R0;
    public rc.f V0;
    public i f21012a;
    public final int f21017b1;
    public float f21019c0;
    public float f21021d0;
    public int f21022d1;
    public int f21023e0;
    public int f21024e1;
    public int f21025f0;
    public int f21026f1;
    public int f21027g0;
    public int f21028g1;
    public float f21030h1;
    public int f21039m0;
    public int f21041n0;
    public h f21048q1;
    public float f21050r1;
    public float f21052s1;
    public float f21054t1;
    public float f21056u1;
    public float f21058v1;
    public int f21066z1;
    public ArrayList<rc.e> f21015b = new ArrayList<>(10);
    public ArrayList<rc.b> f21018c = new ArrayList<>(25);
    public ArrayList<L> M = new ArrayList<>();
    public final int N = 400;
    public final float O = a0.k(1.5f);
    public final float P = a0.k(12.0f);
    public final int Q = a0.i(14.0f);
    public final int R = a0.i(24.0f);
    public final int S = a0.i(10.0f);
    public final int T = a0.i(12.0f);
    public final int U = a0.i(6.0f);
    public final int V = a0.i(5.0f);
    public final int W = a0.i(2.0f);
    public final int f21013a0 = a0.i(1.0f);
    public boolean f21016b0 = true;
    public float f21029h0 = 250.0f;
    public float f21031i0 = 0.0f;
    public float f21033j0 = 0.0f;
    public float f21035k0 = 0.0f;
    public float f21037l0 = 0.0f;
    public boolean f21043o0 = true;
    public boolean f21045p0 = true;
    public Paint f21047q0 = new Paint();
    public Paint f21049r0 = new Paint();
    public Paint f21051s0 = new Paint();
    public Paint f21053t0 = new TextPaint(1);
    public Paint f21055u0 = new TextPaint(1);
    public Paint f21057v0 = new TextPaint(1);
    public Paint f21059w0 = new Paint(1);
    public Paint f21061x0 = new Paint();
    public Paint f21063y0 = new Paint(1);
    public Paint f21065z0 = new Paint(1);
    public Paint A0 = new Paint(1);
    public Rect B0 = new Rect();
    public Path C0 = new Path();
    public boolean H0 = false;
    public l I0 = new l(this);
    public boolean S0 = false;
    public int T0 = -1;
    public float U0 = -1.0f;
    public boolean W0 = false;
    public float X0 = 0.0f;
    public boolean Y0 = false;
    public boolean Z0 = false;
    public int f21014a1 = 0;
    public int f21020c1 = a0.i(46.0f);
    public Rect f21032i1 = new Rect();
    public ValueAnimator.AnimatorUpdateListener f21034j1 = new a();
    public ValueAnimator.AnimatorUpdateListener f21036k1 = new b();
    public ValueAnimator.AnimatorUpdateListener f21038l1 = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.A(valueAnimator);
        }
    };
    public ValueAnimator.AnimatorUpdateListener f21040m1 = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.B(valueAnimator);
        }
    };
    public ValueAnimator.AnimatorUpdateListener f21042n1 = new c();
    public Animator.AnimatorListener f21044o1 = new d();
    public boolean f21046p1 = false;
    public int f21060w1 = 0;
    public int f21062x1 = 0;
    public long f21064y1 = 0;
    public boolean F1 = false;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            f fVar = f.this;
            fVar.f21043o0 = true;
            fVar.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.M0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            f fVar = f.this;
            fVar.f21043o0 = true;
            fVar.invalidate();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.X0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            f fVar = f.this;
            fVar.V0.setAlpha(fVar.X0);
            f.this.invalidate();
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            f fVar = f.this;
            if (!fVar.F1) {
                fVar.W0 = false;
                fVar.V0.setVisibility(8);
                f.this.invalidate();
            }
            f.this.H0 = false;
        }
    }

    public class e extends AnimatorListenerAdapter {
        public final rc.e f21071a;

        public e(rc.e eVar) {
            this.f21071a = eVar;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            f.this.f21015b.clear();
            f.this.f21015b.add(this.f21071a);
        }
    }

    public class C0187f extends AnimatorListenerAdapter {
        public final rc.b f21073a;

        public C0187f(rc.b bVar) {
            this.f21073a = bVar;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            f.this.f21018c.clear();
            f.this.f21018c.add(this.f21073a);
        }
    }

    public interface g {
        void a(f<?, ?> fVar, long j10, long j11);
    }

    public interface h {
        void a(long j10);
    }

    public static class i {
        public Bitmap f21075a;
        public Canvas f21076b;
        public Paint f21078d;
        public RectF f21077c = new RectF();
        public int f21079e = 0;
        public boolean f21080f = true;

        public i() {
            Paint paint = new Paint(1);
            this.f21078d = paint;
            paint.setColor(0);
            this.f21078d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public Bitmap a(int i10, int i11) {
            int i12 = (i10 + i11) << 10;
            if (i12 != this.f21079e || this.f21080f) {
                this.f21080f = false;
                this.f21079e = i12;
                if (!(v0.A1(this.f21075a) && this.f21075a.getWidth() == i11 && this.f21075a.getHeight() == i10)) {
                    this.f21075a = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    this.f21076b = new Canvas(this.f21075a);
                    this.f21077c.set(0.0f, 0.0f, i11, i10);
                }
                this.f21076b.drawColor(j.u());
                this.f21076b.drawRoundRect(this.f21077c, a0.i(4.0f), a0.i(4.0f), this.f21078d);
            }
            return this.f21075a;
        }

        public void b() {
            this.f21080f = true;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        H1 = i10 < 28;
        if (i10 <= 21) {
            z10 = false;
        }
        I1 = z10;
        J1 = new l1.a();
    }

    public f(Context context) {
        super(context);
        y();
        this.f21017b1 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public void A(ValueAnimator valueAnimator) {
        this.f21029h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void B(ValueAnimator valueAnimator) {
        this.f21031i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void C(rc.e eVar, ValueAnimator valueAnimator) {
        eVar.f21837d = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator<rc.e> it = this.f21015b.iterator();
        while (it.hasNext()) {
            rc.e next = it.next();
            if (next != eVar) {
                next.f21837d = (int) ((next.f21838e / 255.0f) * (255 - eVar.f21837d));
            }
        }
        invalidate();
    }

    public void D(rc.b bVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator<rc.b> it = this.f21018c.iterator();
        while (it.hasNext()) {
            rc.b next = it.next();
            if (next == bVar) {
                bVar.f21827d = (int) (255.0f * floatValue);
            } else {
                next.f21827d = (int) ((1.0f - floatValue) * next.f21828e);
            }
        }
        invalidate();
    }

    public static int getBottomSignatureStartAlpha() {
        return a0.i(10.0f);
    }

    public static int getHorizontalPadding() {
        return a0.i(16.0f);
    }

    public static int getPickerPadding() {
        return a0.i(16.0f);
    }

    public static int getSignatureTextHeight() {
        return a0.i(18.0f);
    }

    public static Path h(Path path, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11, boolean z12, boolean z13) {
        path.reset();
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f17 / 2.0f;
        if (f15 > f19) {
            f15 = f19;
        }
        float f20 = f16 - (f14 * 2.0f);
        float f21 = f17 - (2.0f * f15);
        path.moveTo(f12, f11 + f15);
        if (z11) {
            float f22 = -f15;
            path.rQuadTo(0.0f, f22, -f14, f22);
        } else {
            path.rLineTo(0.0f, -f15);
            path.rLineTo(-f14, 0.0f);
        }
        path.rLineTo(-f20, 0.0f);
        if (z10) {
            float f23 = -f14;
            path.rQuadTo(f23, 0.0f, f23, f15);
        } else {
            path.rLineTo(-f14, 0.0f);
            path.rLineTo(0.0f, f15);
        }
        path.rLineTo(0.0f, f21);
        if (z13) {
            path.rQuadTo(0.0f, f15, f14, f15);
        } else {
            path.rLineTo(0.0f, f15);
            path.rLineTo(f14, 0.0f);
        }
        path.rLineTo(f20, 0.0f);
        if (z12) {
            path.rQuadTo(f14, 0.0f, f14, -f15);
        } else {
            path.rLineTo(f14, 0.0f);
            path.rLineTo(0.0f, -f15);
        }
        path.rLineTo(0.0f, -f21);
        path.close();
        return path;
    }

    public final void E() {
        int measuredHeight = getMeasuredHeight() - this.f21027g0;
        float f10 = this.f21033j0;
        if (f10 != 0.0f && measuredHeight != 0) {
            this.f21037l0 = (f10 / measuredHeight) * this.P;
        }
    }

    public final void F() {
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            this.f21022d1 = getMeasuredWidth() - (getHorizontalPadding() * 2);
            this.f21024e1 = getHorizontalPadding();
            int measuredWidth = getMeasuredWidth() - getHorizontalPadding();
            this.f21026f1 = measuredWidth;
            int i10 = measuredWidth - this.f21024e1;
            this.f21028g1 = i10;
            l lVar = this.I0;
            this.f21030h1 = i10 / (lVar.f21116m - lVar.f21115l);
            R();
            this.f21027g0 = a0.i(100.0f);
            this.f21032i1.set(this.f21024e1 - getHorizontalPadding(), 0, this.f21026f1 + getHorizontalPadding(), getMeasuredHeight() - this.f21027g0);
            if (this.J0 != null) {
                this.P0 = (int) (a0.i(20.0f) / (this.f21022d1 / this.J0.f21507a.length));
            }
            E();
        }
    }

    public void G() {
        H((this.f21030h1 * this.I0.f21115l) - getHorizontalPadding());
    }

    public void H(float f10) {
        int i10;
        float f11;
        T t10 = this.J0;
        if (t10 != null && (i10 = this.T0) != -1 && this.W0) {
            this.V0.f(i10, t10.f21507a[i10], this.M, false);
            this.V0.setVisibility(0);
            this.V0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            float f12 = (this.J0.f21508b[this.T0] * this.f21030h1) - f10;
            if (f12 > ((this.f21024e1 + this.f21028g1) >> 1)) {
                f11 = f12 - (this.V0.getWidth() + this.V);
            } else {
                f11 = f12 + this.V;
            }
            if (f11 < 0.0f) {
                f11 = 0.0f;
            } else if (this.V0.getMeasuredWidth() + f11 > getMeasuredWidth()) {
                f11 = getMeasuredWidth() - this.V0.getMeasuredWidth();
            }
            this.V0.setTranslationX(f11);
        }
    }

    public void I() {
    }

    public void J(boolean z10, boolean z11, boolean z12) {
        if (this.J0 != null) {
            l lVar = this.I0;
            this.f21030h1 = this.f21028g1 / (lVar.f21116m - lVar.f21115l);
            Q();
            M(w(this.f21039m0, this.f21041n0), this.f21046p1 ? x(this.f21039m0, this.f21041n0) : 0, z10, z11, z12);
            if (this.W0 && !z11) {
                i(false);
                H((this.f21030h1 * this.I0.f21115l) - getHorizontalPadding());
            }
            invalidate();
        }
    }

    public void K(int i10, int i11) {
        if (this.J0 != null) {
            float horizontalPadding = (this.f21030h1 * this.I0.f21115l) - getHorizontalPadding();
            float f10 = (i10 + horizontalPadding) / this.f21030h1;
            this.U0 = f10;
            if (f10 < 0.0f) {
                this.T0 = 0;
                this.U0 = 0.0f;
            } else if (f10 > 1.0f) {
                this.T0 = this.J0.f21507a.length - 1;
                this.U0 = 1.0f;
            } else {
                int b10 = this.J0.b(this.f21039m0, this.f21041n0, f10);
                this.T0 = b10;
                int i12 = b10 + 1;
                float[] fArr = this.J0.f21508b;
                if (i12 < fArr.length) {
                    if (Math.abs(this.J0.f21508b[this.T0 + 1] - f10) < Math.abs(fArr[b10] - f10)) {
                        this.T0++;
                    }
                }
            }
            int i13 = this.T0;
            int i14 = this.f21041n0;
            if (i13 > i14) {
                this.T0 = i14;
            }
            int i15 = this.T0;
            int i16 = this.f21039m0;
            if (i15 < i16) {
                this.T0 = i16;
            }
            this.W0 = true;
            i(true);
            H(horizontalPadding);
            h hVar = this.f21048q1;
            if (hVar != null) {
                hVar.a(getSelectedDate());
            }
            invalidate();
        }
    }

    public final void L(int i10, int i11, boolean z10) {
        M(i10, i11, z10, false, false);
    }

    public void M(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        if ((Math.abs(((float) rc.e.c(i10)) - this.f21033j0) >= this.f21037l0 && i10 != 0) || i10 != this.f21035k0) {
            final rc.e l10 = l(i10, i11);
            int[] iArr = l10.f21834a;
            int i12 = iArr[iArr.length - 1];
            int i13 = iArr[0];
            if (!z12) {
                float f10 = this.f21029h0;
                float f11 = this.f21031i0;
                float f12 = i12 - i13;
                float f13 = (f10 - f11) / f12;
                if (f13 > 1.0f) {
                    f13 = f12 / (f10 - f11);
                }
                float f14 = 0.045f;
                double d10 = f13;
                if (d10 > 0.7d) {
                    f14 = 0.1f;
                } else if (d10 < 0.1d) {
                    f14 = 0.03f;
                }
                boolean z13 = ((float) i12) != this.f21033j0;
                if (this.f21046p1 && i13 != this.f21035k0) {
                    z13 = true;
                }
                if (z13) {
                    Animator animator = this.D0;
                    if (animator != null) {
                        animator.removeAllListeners();
                        this.D0.cancel();
                    }
                    this.f21054t1 = this.f21029h0;
                    this.f21056u1 = this.f21031i0;
                    this.f21050r1 = 0.0f;
                    this.f21052s1 = 0.0f;
                    this.f21058v1 = f14;
                }
            }
            float f15 = i12;
            this.f21033j0 = f15;
            float f16 = i13;
            this.f21035k0 = f16;
            E();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f21064y1 >= 320 || z11) {
                this.f21064y1 = currentTimeMillis;
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.E0.cancel();
                }
                if (!z10) {
                    this.f21029h0 = f15;
                    this.f21031i0 = f16;
                    this.f21015b.clear();
                    this.f21015b.add(l10);
                    l10.f21837d = 255;
                    return;
                }
                this.f21015b.add(l10);
                if (z12) {
                    Animator animator2 = this.D0;
                    if (animator2 != null) {
                        animator2.removeAllListeners();
                        this.D0.cancel();
                    }
                    this.f21058v1 = 0.0f;
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(k(this.f21029h0, f15, this.f21038l1));
                    if (this.f21046p1) {
                        animatorSet.playTogether(k(this.f21031i0, f16, this.f21040m1));
                    }
                    this.D0 = animatorSet;
                    animatorSet.start();
                }
                int size = this.f21015b.size();
                for (int i14 = 0; i14 < size; i14++) {
                    rc.e eVar = this.f21015b.get(i14);
                    if (eVar != l10) {
                        eVar.f21838e = eVar.f21837d;
                    }
                }
                ValueAnimator k10 = k(0.0f, 255.0f, new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        f.this.C(l10, valueAnimator2);
                    }
                });
                this.E0 = k10;
                k10.addListener(new e(l10));
                this.E0.start();
            }
        }
    }

    public void N() {
        float f10 = this.f21058v1;
        if (f10 != 0.0f) {
            float f11 = this.f21029h0;
            float f12 = this.f21033j0;
            if (f11 != f12) {
                float f13 = this.f21050r1 + f10;
                this.f21050r1 = f13;
                if (f13 > 1.0f) {
                    this.f21050r1 = 1.0f;
                    this.f21029h0 = f12;
                } else {
                    float f14 = this.f21054t1;
                    this.f21029h0 = f14 + ((f12 - f14) * n.f21132g.getInterpolation(f13));
                }
                invalidate();
            }
            if (this.f21046p1) {
                float f15 = this.f21031i0;
                float f16 = this.f21035k0;
                if (f15 != f16) {
                    float f17 = this.f21052s1 + this.f21058v1;
                    this.f21052s1 = f17;
                    if (f17 > 1.0f) {
                        this.f21052s1 = 1.0f;
                        this.f21031i0 = f16;
                    } else {
                        float f18 = this.f21056u1;
                        this.f21031i0 = f18 + ((f16 - f18) * n.f21132g.getInterpolation(f17));
                    }
                    invalidate();
                }
            }
        }
    }

    public void O() {
        if (this.Z0) {
            this.f21053t0.setColor(j.R0());
        } else {
            this.f21053t0.setColor(j.R0());
        }
        i iVar = this.f21012a;
        if (iVar != null) {
            iVar.b();
        }
        this.f21057v0.setColor(j.R0());
        this.f21049r0.setColor(j.M0());
        this.f21051s0.setColor(j.M0());
        this.f21059w0.setColor(j.L(R.id.theme_color_fillingPositive));
        this.f21061x0.setColor(ib.d.a(0.5f, t0.a.d(j.L(R.id.theme_color_fillingPositive), j.u(), 0.6f)));
        this.f21063y0.setColor(j.u());
        this.f21065z0.setColor(ib.d.a(0.2f, j.L(R.id.theme_color_fillingPositive)));
        this.V0.e();
        this.f21023e0 = this.f21049r0.getAlpha();
        this.f21025f0 = this.f21051s0.getAlpha();
        this.f21019c0 = this.f21053t0.getAlpha() / 255.0f;
        this.f21021d0 = this.f21057v0.getAlpha() / 255.0f;
        Iterator<L> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        if (this.W0) {
            int i10 = this.T0;
            long[] jArr = this.J0.f21507a;
            if (i10 < jArr.length) {
                this.V0.f(i10, jArr[i10], this.M, false);
            }
        }
        this.f21043o0 = true;
    }

    public final void P(int i10) {
        rc.b bVar = this.K0;
        if (bVar == null || i10 >= bVar.f21825b || i10 <= bVar.f21826c) {
            int highestOneBit = Integer.highestOneBit(i10) << 1;
            rc.b bVar2 = this.K0;
            if (bVar2 == null || bVar2.f21824a != highestOneBit) {
                ValueAnimator valueAnimator = this.F0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.F0.cancel();
                }
                double d10 = highestOneBit;
                double d11 = 0.2d * d10;
                final rc.b bVar3 = new rc.b(highestOneBit, (int) (d10 + d11), (int) (d10 - d11));
                bVar3.f21827d = 255;
                if (this.K0 == null) {
                    this.K0 = bVar3;
                    bVar3.f21827d = 255;
                    this.f21018c.add(bVar3);
                    return;
                }
                this.K0 = bVar3;
                this.N0 = this.f21018c.size();
                for (int i11 = 0; i11 < this.N0; i11++) {
                    rc.b bVar4 = this.f21018c.get(i11);
                    bVar4.f21828e = bVar4.f21827d;
                }
                this.f21018c.add(bVar3);
                if (this.f21018c.size() > 2) {
                    this.f21018c.remove(0);
                }
                ValueAnimator duration = k(0.0f, 1.0f, new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        f.this.D(bVar3, valueAnimator2);
                    }
                }).setDuration(200L);
                this.F0 = duration;
                duration.addListener(new C0187f(bVar3));
                this.F0.start();
            }
        }
    }

    public void Q() {
        T t10 = this.J0;
        if (t10 != null) {
            int c10 = t10.c(Math.max(this.I0.f21115l, 0.0f));
            this.f21039m0 = c10;
            int a10 = this.J0.a(c10, Math.min(this.I0.f21116m, 1.0f));
            this.f21041n0 = a10;
            g gVar = this.G1;
            if (gVar != null) {
                long[] jArr = this.J0.f21507a;
                gVar.a(this, jArr[this.f21039m0], jArr[a10]);
            }
            R();
        }
    }

    public final void R() {
        int i10;
        T t10 = this.J0;
        if (t10 != null && (i10 = this.f21028g1) != 0) {
            P((int) ((i10 / (this.f21030h1 * t10.f21513g)) / 6.0f));
        }
    }

    @Override
    public void a(float f10, float f11, boolean z10) {
        T t10 = this.J0;
        if (t10 != null) {
            if (z10) {
                int c10 = t10.c(Math.max(f10, 0.0f));
                int a10 = this.J0.a(c10, Math.min(f11, 1.0f));
                M(w(c10, a10), x(c10, a10), true, true, false);
                i(false);
                return;
            }
            Q();
            invalidate();
        }
    }

    @Override
    public void b() {
        J(true, false, false);
    }

    @Override
    public void c(boolean z10) {
        O();
        invalidate();
    }

    public long getEndDate() {
        return this.J0.f21507a[this.f21041n0];
    }

    public float getMinDistance() {
        T t10 = this.J0;
        if (t10 == null) {
            return 0.1f;
        }
        int length = t10.f21507a.length;
        if (length < 5) {
            return 1.0f;
        }
        float f10 = 5.0f / length;
        if (f10 < 0.1f) {
            return 0.1f;
        }
        return f10;
    }

    public long getSelectedDate() {
        int i10 = this.T0;
        if (i10 < 0) {
            return -1L;
        }
        return this.J0.f21507a[i10];
    }

    public long getStartDate() {
        return this.J0.f21507a[this.f21039m0];
    }

    public void i(boolean z10) {
        G();
        if (this.F1 != z10) {
            this.F1 = z10;
            ValueAnimator valueAnimator = this.G0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.G0.cancel();
            }
            ValueAnimator duration = k(this.X0, z10 ? 1.0f : 0.0f, this.f21042n1).setDuration(200L);
            this.G0 = duration;
            duration.addListener(this.f21044o1);
            this.G0.start();
        }
    }

    public void j() {
        this.T0 = -1;
        this.W0 = false;
        this.F1 = false;
        this.V0.setVisibility(8);
        this.X0 = 0.0f;
    }

    public ValueAnimator k(float f10, float f11, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(J1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public rc.e l(int i10, int i11) {
        return new rc.e(i10, i11, this.f21046p1);
    }

    public rc.f m() {
        return new rc.f(getContext());
    }

    public abstract L n(a.C0200a aVar);

    public void o(Canvas canvas) {
        int measuredHeight;
        if (this.J0 != null) {
            int i10 = this.f21014a1;
            if (i10 == 2) {
                throw null;
            } else if (i10 == 1) {
                throw null;
            } else if (i10 != 3) {
                this.f21049r0.setAlpha((int) (this.f21023e0 * 1.0f));
                this.f21053t0.setAlpha((int) (this.f21019c0 * 255.0f * 1.0f));
                int signatureTextHeight = (int) (getSignatureTextHeight() - this.f21053t0.getTextSize());
                float measuredHeight2 = (getMeasuredHeight() - this.f21027g0) - 1;
                canvas.drawLine(this.f21024e1, measuredHeight2, this.f21026f1, measuredHeight2, this.f21049r0);
                if (!this.f21046p1) {
                    canvas.drawText("0", getHorizontalPadding(), measuredHeight - signatureTextHeight, this.f21053t0);
                }
            } else {
                throw null;
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.Y0) {
            super.onDraw(canvas);
            return;
        }
        N();
        int save = canvas.save();
        canvas.clipRect(0, this.f21032i1.top, getMeasuredWidth(), this.f21032i1.bottom);
        o(canvas);
        this.N0 = this.f21015b.size();
        this.O0 = 0;
        while (true) {
            int i10 = this.O0;
            if (i10 >= this.N0) {
                break;
            }
            r(canvas, this.f21015b.get(i10));
            this.O0++;
        }
        q(canvas);
        this.O0 = 0;
        while (true) {
            int i11 = this.O0;
            if (i11 < this.N0) {
                v(canvas, this.f21015b.get(i11));
                this.O0++;
            } else {
                canvas.restoreToCount(save);
                p(canvas);
                s(canvas);
                u(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        if (getMeasuredWidth() != this.f21060w1 || getMeasuredHeight() != this.f21062x1) {
            this.f21060w1 = getMeasuredWidth();
            this.f21062x1 = getMeasuredHeight();
            this.Q0 = Bitmap.createBitmap(getMeasuredWidth() - (getHorizontalPadding() << 1), this.f21020c1, Bitmap.Config.ARGB_4444);
            this.R0 = new Canvas(this.Q0);
            this.f21012a.a(this.f21020c1, getMeasuredWidth() - (getHorizontalPadding() * 2));
            F();
            if (this.W0) {
                H((this.f21030h1 * this.I0.f21115l) - getHorizontalPadding());
            }
            J(false, true, false);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (this.J0 == null) {
            return false;
        }
        if (!this.f21045p0) {
            this.I0.j(motionEvent, motionEvent.getActionIndex());
            getParent().requestDisallowInterceptTouchEvent(false);
            this.S0 = false;
            return false;
        }
        int x10 = (int) motionEvent.getX(motionEvent.getActionIndex());
        int y10 = (int) motionEvent.getY(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = x10 - this.f21066z1;
                    int i11 = y10 - this.A1;
                    if (this.I0.c()) {
                        boolean h10 = this.I0.h(x10, y10, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            this.I0.h((int) motionEvent.getX(1), (int) motionEvent.getY(1), 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(h10);
                        return true;
                    }
                    if (this.S0) {
                        if ((this.E1 && System.currentTimeMillis() - this.D1 > 200) || Math.abs(i10) > Math.abs(i11) || Math.abs(i11) < this.f21017b1) {
                            z10 = true;
                        }
                        this.f21066z1 = x10;
                        this.A1 = y10;
                        getParent().requestDisallowInterceptTouchEvent(z10);
                        K(x10, y10);
                    } else if (this.f21032i1.contains(this.B1, this.C1)) {
                        int i12 = this.B1 - x10;
                        int i13 = this.C1 - y10;
                        if (Math.sqrt((i12 * i12) + (i13 * i13)) > this.f21017b1 || System.currentTimeMillis() - this.D1 > 200) {
                            this.S0 = true;
                            K(x10, y10);
                        }
                    }
                    return true;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        return this.I0.b(x10, y10, motionEvent.getActionIndex());
                    }
                    if (actionMasked != 6) {
                        return false;
                    }
                    this.I0.j(motionEvent, motionEvent.getActionIndex());
                    return true;
                }
            }
            if (this.I0.j(motionEvent, motionEvent.getActionIndex())) {
                return true;
            }
            if (this.f21032i1.contains(this.B1, this.C1) && !this.S0) {
                i(false);
            }
            this.I0.i();
            R();
            getParent().requestDisallowInterceptTouchEvent(false);
            this.S0 = false;
            I();
            invalidate();
            M(w(this.f21039m0, this.f21041n0), this.f21046p1 ? x(this.f21039m0, this.f21041n0) : 0, true, true, false);
            return true;
        }
        this.D1 = System.currentTimeMillis();
        getParent().requestDisallowInterceptTouchEvent(true);
        if (this.I0.b(x10, y10, motionEvent.getActionIndex())) {
            return true;
        }
        this.f21066z1 = x10;
        this.B1 = x10;
        this.A1 = y10;
        this.C1 = y10;
        if (!this.f21032i1.contains(x10, y10)) {
            return false;
        }
        if (this.T0 < 0 || !this.F1) {
            this.S0 = true;
            K(x10, y10);
        }
        return true;
    }

    public void p(Canvas canvas) {
        if (this.J0 != null) {
            this.N0 = this.f21018c.size();
            int i10 = this.f21014a1;
            if (i10 == 2) {
                throw null;
            } else if (i10 == 1) {
                throw null;
            } else if (i10 != 3) {
                this.O0 = 0;
                while (true) {
                    int i11 = this.O0;
                    if (i11 < this.N0) {
                        int i12 = this.f21018c.get(i11).f21827d;
                        int i13 = this.f21018c.get(this.O0).f21824a;
                        if (i13 == 0) {
                            i13 = 1;
                        }
                        int i14 = this.f21039m0 - this.P0;
                        while (i14 % i13 != 0) {
                            i14--;
                        }
                        int i15 = this.f21041n0 - this.P0;
                        while (true) {
                            if (i15 % i13 == 0 && i15 >= this.J0.f21507a.length - 1) {
                                break;
                            }
                            i15++;
                        }
                        int i16 = this.P0;
                        int i17 = i15 + i16;
                        float horizontalPadding = (this.f21030h1 * this.I0.f21115l) - getHorizontalPadding();
                        for (int i18 = i14 + i16; i18 < i17; i18 += i13) {
                            if (i18 >= 0) {
                                long[] jArr = this.J0.f21507a;
                                if (i18 < jArr.length - 1) {
                                    float f10 = ((((float) (jArr[i18] - jArr[0])) / ((float) (jArr[jArr.length - 1] - jArr[0]))) * this.f21030h1) - horizontalPadding;
                                    float f11 = f10 - this.S;
                                    if (f11 > 0.0f && f11 <= this.f21028g1 + getHorizontalPadding()) {
                                        if (f11 < getBottomSignatureStartAlpha()) {
                                            this.f21057v0.setAlpha((int) (i12 * (1.0f - ((getBottomSignatureStartAlpha() - f11) / getBottomSignatureStartAlpha())) * this.f21021d0 * 1.0f));
                                        } else {
                                            int i19 = this.f21028g1;
                                            if (f11 > i19) {
                                                this.f21057v0.setAlpha((int) (i12 * (1.0f - ((f11 - i19) / getHorizontalPadding())) * this.f21021d0 * 1.0f));
                                            } else {
                                                this.f21057v0.setAlpha((int) (i12 * this.f21021d0 * 1.0f));
                                            }
                                        }
                                        canvas.drawText(this.J0.d(i18), f10, (getMeasuredHeight() - this.f21027g0) + this.Q + a0.i(3.0f), this.f21057v0);
                                    }
                                }
                            }
                        }
                        this.O0++;
                    } else {
                        return;
                    }
                }
            } else {
                throw null;
            }
        }
    }

    public void q(Canvas canvas) {
    }

    public void r(android.graphics.Canvas r13, rc.e r14) {
        throw new UnsupportedOperationException("Method not decompiled: pc.f.r(android.graphics.Canvas, rc.e):void");
    }

    @Override
    public void requestLayout() {
        super.requestLayout();
    }

    public void s(Canvas canvas) {
        int i10;
        int i11;
        Rect rect;
        int i12;
        Rect rect2;
        int i13;
        boolean z10;
        ValueAnimator valueAnimator;
        if (this.J0 != null) {
            this.I0.f21106c = this.f21022d1;
            int measuredHeight = getMeasuredHeight() - getPickerPadding();
            int measuredHeight2 = (getMeasuredHeight() - this.f21020c1) - getPickerPadding();
            int horizontalPadding = (int) (getHorizontalPadding() + (this.f21022d1 * this.I0.f21115l));
            int horizontalPadding2 = (int) (getHorizontalPadding() + (this.f21022d1 * this.I0.f21116m));
            int i14 = this.f21014a1;
            if (i14 == 1) {
                getHorizontalPadding();
                throw null;
            } else if (i14 != 3) {
                if (this.J0 != null) {
                    if (i14 == 0) {
                        for (int i15 = 0; i15 < this.M.size(); i15++) {
                            L l10 = this.M.get(i15);
                            ValueAnimator valueAnimator2 = l10.f21859h;
                            if ((valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = l10.f21860i) != null && valueAnimator.isRunning())) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        canvas.save();
                        canvas.clipRect(getHorizontalPadding(), (getMeasuredHeight() - getPickerPadding()) - this.f21020c1, getMeasuredWidth() - getHorizontalPadding(), getMeasuredHeight() - getPickerPadding());
                        canvas.translate(getHorizontalPadding(), (getMeasuredHeight() - getPickerPadding()) - this.f21020c1);
                        t(canvas);
                        canvas.restore();
                    } else if (this.f21043o0) {
                        this.Q0.eraseColor(0);
                        t(this.R0);
                        this.f21043o0 = false;
                    }
                    if (!z10) {
                        int i16 = this.f21014a1;
                        if (i16 == 2) {
                            getHorizontalPadding();
                            throw null;
                        } else if (i16 != 1) {
                            this.f21047q0.setAlpha((int) (1.0f * 255.0f));
                            canvas.drawBitmap(this.Q0, getHorizontalPadding(), (getMeasuredHeight() - getPickerPadding()) - this.f21020c1, this.f21047q0);
                        } else {
                            getHorizontalPadding();
                            throw null;
                        }
                    }
                    if (this.f21014a1 != 2) {
                        float f10 = measuredHeight2;
                        float f11 = measuredHeight;
                        canvas.drawRect(getHorizontalPadding(), f10, this.T + horizontalPadding, f11, this.f21061x0);
                        canvas.drawRect(horizontalPadding2 - this.T, f10, getMeasuredWidth() - getHorizontalPadding(), f11, this.f21061x0);
                    } else {
                        return;
                    }
                } else {
                    canvas.drawRect(getHorizontalPadding(), measuredHeight2, getMeasuredWidth() - getHorizontalPadding(), measuredHeight, this.f21061x0);
                }
                canvas.drawBitmap(this.f21012a.a(this.f21020c1, getMeasuredWidth() - (getHorizontalPadding() * 2)), getHorizontalPadding(), (getMeasuredHeight() - getPickerPadding()) - this.f21020c1, this.f21047q0);
                if (this.J0 != null) {
                    this.B0.set(horizontalPadding, measuredHeight2, horizontalPadding2, measuredHeight);
                    this.I0.f21114k.set(this.B0);
                    Path path = this.C0;
                    Rect rect3 = this.B0;
                    int i17 = rect3.left;
                    int i18 = rect3.top;
                    int i19 = this.f21013a0;
                    int i20 = this.U;
                    canvas.drawPath(h(path, i17, i18 - i19, i17 + this.T, rect3.bottom + i19, i20, i20, true, false, false, true), this.f21059w0);
                    Path path2 = this.C0;
                    Rect rect4 = this.B0;
                    int i21 = rect4.right;
                    float f12 = i21 - this.T;
                    int i22 = rect4.top;
                    int i23 = this.f21013a0;
                    int i24 = this.U;
                    canvas.drawPath(h(path2, f12, i22 - i23, i21, rect4.bottom + i23, i24, i24, false, true, true, false), this.f21059w0);
                    Rect rect5 = this.B0;
                    int i25 = rect5.left;
                    int i26 = this.T;
                    canvas.drawRect(i25 + i26, rect5.bottom, rect5.right - i26, i10 + this.f21013a0, this.f21059w0);
                    Rect rect6 = this.B0;
                    int i27 = rect6.left;
                    int i28 = this.T;
                    canvas.drawRect(i27 + i28, i11 - this.f21013a0, rect6.right - i28, rect6.top, this.f21059w0);
                    float centerY = this.B0.centerY() - this.U;
                    Rect rect7 = this.B0;
                    canvas.drawLine(rect.left + this.U, centerY, rect7.left + i12, rect7.centerY() + this.U, this.A0);
                    float centerY2 = this.B0.centerY() - this.U;
                    Rect rect8 = this.B0;
                    canvas.drawLine(rect2.right - this.U, centerY2, rect8.right - i13, rect8.centerY() + this.U, this.A0);
                    l.a e10 = this.I0.e();
                    Rect rect9 = this.B0;
                    int i29 = rect9.bottom;
                    int i30 = rect9.top;
                    int i31 = (i29 - i30) >> 1;
                    int i32 = i30 + i31;
                    if (e10 == null) {
                        l.a d10 = this.I0.d();
                        l.a f13 = this.I0.f();
                        if (d10 != null) {
                            canvas.drawCircle(this.B0.left + this.V, i32, (i31 * d10.f21126h) - this.W, this.f21065z0);
                        }
                        if (f13 != null) {
                            canvas.drawCircle(this.B0.right - this.V, i32, (i31 * f13.f21126h) - this.W, this.f21065z0);
                        }
                    }
                    Rect rect10 = this.I0.f21112i;
                    int i33 = this.R;
                    rect10.set(horizontalPadding - i33, measuredHeight2, horizontalPadding + (i33 >> 1), measuredHeight);
                    Rect rect11 = this.I0.f21113j;
                    int i34 = this.R;
                    rect11.set(horizontalPadding2 - (i34 >> 1), measuredHeight2, horizontalPadding2 + i34, measuredHeight);
                }
            } else {
                throw null;
            }
        }
    }

    public void setData(T t10) {
        if (this.J0 != t10) {
            invalidate();
            this.M.clear();
            if (!(t10 == null || t10.f21510d == null)) {
                for (int i10 = 0; i10 < t10.f21510d.size(); i10++) {
                    this.M.add(n(t10.f21510d.get(i10)));
                }
            }
            j();
            this.J0 = t10;
            if (t10 != null) {
                if (t10.f21507a[0] == 0) {
                    l lVar = this.I0;
                    lVar.f21115l = 0.0f;
                    lVar.f21116m = 1.0f;
                } else {
                    this.I0.f21117n = getMinDistance();
                    l lVar2 = this.I0;
                    float f10 = lVar2.f21116m;
                    float f11 = lVar2.f21117n;
                    if (f10 - lVar2.f21115l < f11) {
                        float f12 = f10 - f11;
                        lVar2.f21115l = f12;
                        if (f12 < 0.0f) {
                            lVar2.f21115l = 0.0f;
                            lVar2.f21116m = 1.0f;
                        }
                    }
                }
            }
        }
        F();
        if (t10 != null) {
            Q();
            L(w(this.f21039m0, this.f21041n0), this.f21046p1 ? x(this.f21039m0, this.f21041n0) : 0, false);
            this.L0 = 0.0f;
            this.M0 = 2.14748365E9f;
            z();
            this.V0.setSize(this.M.size());
            this.f21043o0 = true;
            R();
            return;
        }
        l lVar3 = this.I0;
        lVar3.f21115l = 0.7f;
        lVar3.f21116m = 1.0f;
        this.M0 = 0.0f;
        this.L0 = 0.0f;
        this.f21015b.clear();
        Animator animator = this.D0;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimator = this.E0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E0.cancel();
        }
    }

    public void setDateSelectionListener(h hVar) {
        this.f21048q1 = hVar;
    }

    public void setListener(g gVar) {
        this.G1 = gVar;
    }

    public void t(Canvas canvas) {
    }

    public void u(Canvas canvas) {
        if (this.T0 >= 0 && this.W0 && this.J0 != null) {
            int i10 = (int) (this.f21025f0 * this.X0);
            l lVar = this.I0;
            float f10 = lVar.f21116m;
            float f11 = lVar.f21115l;
            float f12 = this.f21028g1 / (f10 - f11);
            float horizontalPadding = (f11 * f12) - getHorizontalPadding();
            int i11 = this.T0;
            float[] fArr = this.J0.f21508b;
            if (i11 < fArr.length) {
                float f13 = (fArr[i11] * f12) - horizontalPadding;
                this.f21051s0.setAlpha(i10);
                canvas.drawLine(f13, 0.0f, f13, this.f21032i1.bottom, this.f21051s0);
                if (this.f21016b0) {
                    this.N0 = this.M.size();
                    int i12 = 0;
                    while (true) {
                        this.O0 = i12;
                        int i13 = this.O0;
                        if (i13 < this.N0) {
                            L l10 = this.M.get(i13);
                            if (l10.f21865n || l10.f21866o != 0.0f) {
                                float f14 = this.f21031i0;
                                float measuredHeight = (getMeasuredHeight() - this.f21027g0) - (((l10.f21852a.f21515a[this.T0] - f14) / (this.f21029h0 - f14)) * ((getMeasuredHeight() - this.f21027g0) - getSignatureTextHeight()));
                                l10.f21855d.setAlpha((int) (l10.f21866o * 255.0f * this.X0));
                                this.f21063y0.setAlpha((int) (l10.f21866o * 255.0f * this.X0));
                                canvas.drawPoint(f13, measuredHeight, l10.f21855d);
                                canvas.drawPoint(f13, measuredHeight, this.f21063y0);
                            }
                            i12 = this.O0 + 1;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public void v(android.graphics.Canvas r11, rc.e r12) {
        throw new UnsupportedOperationException("Method not decompiled: pc.f.v(android.graphics.Canvas, rc.e):void");
    }

    public int w(int i10, int i11) {
        int f10;
        int size = this.M.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            if (this.M.get(i13).f21865n && (f10 = this.M.get(i13).f21852a.f21516b.f(i10, i11)) > i12) {
                i12 = f10;
            }
        }
        return i12;
    }

    public int x(int i10, int i11) {
        int h10;
        int size = this.M.size();
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < size; i13++) {
            if (this.M.get(i13).f21865n && (h10 = this.M.get(i13).f21852a.f21516b.h(i10, i11)) < i12) {
                i12 = h10;
            }
        }
        return i12;
    }

    public void y() {
        this.f21049r0.setStrokeWidth(1.0f);
        this.f21051s0.setStrokeWidth(this.O);
        this.f21053t0.setTextSize(this.P);
        this.f21055u0.setTextSize(this.P);
        this.f21055u0.setTextAlign(Paint.Align.RIGHT);
        this.f21057v0.setTextSize(this.P);
        this.f21057v0.setTextAlign(Paint.Align.CENTER);
        this.f21063y0.setStrokeWidth(a0.k(6.0f));
        this.f21063y0.setStrokeCap(Paint.Cap.ROUND);
        setLayerType(2, null);
        setWillNotDraw(false);
        rc.f m10 = m();
        this.V0 = m10;
        m10.setVisibility(8);
        this.A0.setColor(-1);
        this.A0.setStrokeWidth(a0.k(3.0f));
        this.A0.setStrokeCap(Paint.Cap.ROUND);
        O();
    }

    public void z() {
        Iterator<L> it = this.M.iterator();
        while (it.hasNext()) {
            L next = it.next();
            boolean z10 = next.f21865n;
            if (z10) {
                int i10 = next.f21852a.f21519e;
                if (i10 > this.L0) {
                    this.L0 = i10;
                }
            }
            if (z10) {
                int i11 = next.f21852a.f21520f;
                if (i11 < this.M0) {
                    this.M0 = i11;
                }
            }
            float f10 = this.L0;
            float f11 = this.M0;
            if (f10 == f11) {
                this.L0 = f10 + 1.0f;
                this.M0 = f11 - 1.0f;
            }
        }
    }
}
