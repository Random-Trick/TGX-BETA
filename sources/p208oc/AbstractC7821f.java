package p208oc;

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
import be.C1357a0;
import java.util.ArrayList;
import java.util.Iterator;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p108hb.C5064d;
import p159l1.C6295b;
import p208oc.C7838l;
import p224pc.C8105a;
import p238qc.C8313b;
import p238qc.C8316e;
import p238qc.C8317f;
import p238qc.C8321g;
import p267t0.C8929a;
import p364zd.AbstractC11535t;
import p364zd.C11524j;

public abstract class AbstractC7821f<T extends C8105a, L extends C8321g> extends View implements C7838l.AbstractC7840b, AbstractC11535t {
    public static final boolean f25062H1;
    public static final boolean f25063I1;
    public static C6295b f25064J1;
    public int f25066A1;
    public int f25068B1;
    public int f25070C1;
    public Animator f25071D0;
    public long f25072D1;
    public ValueAnimator f25073E0;
    public boolean f25074E1;
    public ValueAnimator f25075F0;
    public ValueAnimator f25077G0;
    public AbstractC7828g f25078G1;
    public T f25081J0;
    public C8313b f25082K0;
    public float f25083L0;
    public float f25085M0;
    public int f25087N0;
    public int f25089O0;
    public int f25091P0;
    public Bitmap f25093Q0;
    public Canvas f25095R0;
    public C8317f f25103V0;
    public C7830i f25109a;
    public final int f25114b1;
    public float f25116c0;
    public float f25118d0;
    public int f25119d1;
    public int f25120e0;
    public int f25121e1;
    public int f25122f0;
    public int f25123f1;
    public int f25124g0;
    public int f25125g1;
    public float f25127h1;
    public int f25136m0;
    public int f25138n0;
    public AbstractC7829h f25145q1;
    public float f25147r1;
    public float f25149s1;
    public float f25151t1;
    public float f25153u1;
    public float f25155v1;
    public int f25163z1;
    public ArrayList<C8316e> f25112b = new ArrayList<>(10);
    public ArrayList<C8313b> f25115c = new ArrayList<>(25);
    public ArrayList<L> f25084M = new ArrayList<>();
    public final int f25086N = 400;
    public final float f25088O = C1357a0.m37539k(1.5f);
    public final float f25090P = C1357a0.m37539k(12.0f);
    public final int f25092Q = C1357a0.m37541i(14.0f);
    public final int f25094R = C1357a0.m37541i(24.0f);
    public final int f25096S = C1357a0.m37541i(10.0f);
    public final int f25098T = C1357a0.m37541i(12.0f);
    public final int f25100U = C1357a0.m37541i(6.0f);
    public final int f25102V = C1357a0.m37541i(5.0f);
    public final int f25104W = C1357a0.m37541i(2.0f);
    public final int f25110a0 = C1357a0.m37541i(1.0f);
    public boolean f25113b0 = true;
    public float f25126h0 = 250.0f;
    public float f25128i0 = 0.0f;
    public float f25130j0 = 0.0f;
    public float f25132k0 = 0.0f;
    public float f25134l0 = 0.0f;
    public boolean f25140o0 = true;
    public boolean f25142p0 = true;
    public Paint f25144q0 = new Paint();
    public Paint f25146r0 = new Paint();
    public Paint f25148s0 = new Paint();
    public Paint f25150t0 = new TextPaint(1);
    public Paint f25152u0 = new TextPaint(1);
    public Paint f25154v0 = new TextPaint(1);
    public Paint f25156w0 = new Paint(1);
    public Paint f25158x0 = new Paint();
    public Paint f25160y0 = new Paint(1);
    public Paint f25162z0 = new Paint(1);
    public Paint f25065A0 = new Paint(1);
    public Rect f25067B0 = new Rect();
    public Path f25069C0 = new Path();
    public boolean f25079H0 = false;
    public C7838l f25080I0 = new C7838l(this);
    public boolean f25097S0 = false;
    public int f25099T0 = -1;
    public float f25101U0 = -1.0f;
    public boolean f25105W0 = false;
    public float f25106X0 = 0.0f;
    public boolean f25107Y0 = false;
    public boolean f25108Z0 = false;
    public int f25111a1 = 0;
    public int f25117c1 = C1357a0.m37541i(46.0f);
    public Rect f25129i1 = new Rect();
    public ValueAnimator.AnimatorUpdateListener f25131j1 = new C7822a();
    public ValueAnimator.AnimatorUpdateListener f25133k1 = new C7823b();
    public ValueAnimator.AnimatorUpdateListener f25135l1 = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC7821f.this.m14961A(valueAnimator);
        }
    };
    public ValueAnimator.AnimatorUpdateListener f25137m1 = new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC7821f.this.m14960B(valueAnimator);
        }
    };
    public ValueAnimator.AnimatorUpdateListener f25139n1 = new C7824c();
    public Animator.AnimatorListener f25141o1 = new C7825d();
    public boolean f25143p1 = false;
    public int f25157w1 = 0;
    public int f25159x1 = 0;
    public long f25161y1 = 0;
    public boolean f25076F1 = false;

    public class C7822a implements ValueAnimator.AnimatorUpdateListener {
        public C7822a() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC7821f.this.f25083L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            AbstractC7821f fVar = AbstractC7821f.this;
            fVar.f25140o0 = true;
            fVar.invalidate();
        }
    }

    public class C7823b implements ValueAnimator.AnimatorUpdateListener {
        public C7823b() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC7821f.this.f25085M0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            AbstractC7821f fVar = AbstractC7821f.this;
            fVar.f25140o0 = true;
            fVar.invalidate();
        }
    }

    public class C7824c implements ValueAnimator.AnimatorUpdateListener {
        public C7824c() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC7821f.this.f25106X0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            AbstractC7821f fVar = AbstractC7821f.this;
            fVar.f25103V0.setAlpha(fVar.f25106X0);
            AbstractC7821f.this.invalidate();
        }
    }

    public class C7825d extends AnimatorListenerAdapter {
        public C7825d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC7821f fVar = AbstractC7821f.this;
            if (!fVar.f25076F1) {
                fVar.f25105W0 = false;
                fVar.f25103V0.setVisibility(8);
                AbstractC7821f.this.invalidate();
            }
            AbstractC7821f.this.f25079H0 = false;
        }
    }

    public class C7826e extends AnimatorListenerAdapter {
        public final C8316e f25168a;

        public C7826e(C8316e eVar) {
            this.f25168a = eVar;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AbstractC7821f.this.f25112b.clear();
            AbstractC7821f.this.f25112b.add(this.f25168a);
        }
    }

    public class C7827f extends AnimatorListenerAdapter {
        public final C8313b f25170a;

        public C7827f(C8313b bVar) {
            this.f25170a = bVar;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC7821f.this.f25115c.clear();
            AbstractC7821f.this.f25115c.add(this.f25170a);
        }
    }

    public interface AbstractC7828g {
        void mo14928a(AbstractC7821f<?, ?> fVar, long j, long j2);
    }

    public interface AbstractC7829h {
        void m14931a(long j);
    }

    public static class C7830i {
        public Bitmap f25172a;
        public Canvas f25173b;
        public Paint f25175d;
        public RectF f25174c = new RectF();
        public int f25176e = 0;
        public boolean f25177f = true;

        public C7830i() {
            Paint paint = new Paint(1);
            this.f25175d = paint;
            paint.setColor(0);
            this.f25175d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public Bitmap m14930a(int i, int i2) {
            int i3 = (i + i2) << 10;
            if (i3 != this.f25176e || this.f25177f) {
                this.f25177f = false;
                this.f25176e = i3;
                if (!(C7389v0.m16756A1(this.f25172a) && this.f25172a.getWidth() == i2 && this.f25172a.getHeight() == i)) {
                    this.f25172a = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                    this.f25173b = new Canvas(this.f25172a);
                    this.f25174c.set(0.0f, 0.0f, i2, i);
                }
                this.f25173b.drawColor(C11524j.m148w());
                this.f25173b.drawRoundRect(this.f25174c, C1357a0.m37541i(4.0f), C1357a0.m37541i(4.0f), this.f25175d);
            }
            return this.f25172a;
        }

        public void m14929b() {
            this.f25177f = true;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f25062H1 = i < 28;
        if (i <= 21) {
            z = false;
        }
        f25063I1 = z;
        f25064J1 = new C6295b();
    }

    public AbstractC7821f(Context context) {
        super(context);
        mo14876y();
        this.f25114b1 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public void m14961A(ValueAnimator valueAnimator) {
        this.f25126h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void m14960B(ValueAnimator valueAnimator) {
        this.f25128i0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void m14959C(C8316e eVar, ValueAnimator valueAnimator) {
        eVar.f26812d = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator<C8316e> it = this.f25112b.iterator();
        while (it.hasNext()) {
            C8316e next = it.next();
            if (next != eVar) {
                next.f26812d = (int) ((next.f26813e / 255.0f) * (255 - eVar.f26812d));
            }
        }
        invalidate();
    }

    public void m14958D(C8313b bVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator<C8313b> it = this.f25115c.iterator();
        while (it.hasNext()) {
            C8313b next = it.next();
            if (next == bVar) {
                bVar.f26797d = (int) (255.0f * floatValue);
            } else {
                next.f26797d = (int) ((1.0f - floatValue) * next.f26798e);
            }
        }
        invalidate();
    }

    public static int getBottomSignatureStartAlpha() {
        return C1357a0.m37541i(10.0f);
    }

    public static int getHorizontalPadding() {
        return C1357a0.m37541i(16.0f);
    }

    public static int getPickerPadding() {
        return C1357a0.m37541i(16.0f);
    }

    public static int getSignatureTextHeight() {
        return C1357a0.m37541i(18.0f);
    }

    public static Path m14940h(Path path, float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, boolean z3, boolean z4) {
        path.reset();
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = f7 / 2.0f;
        if (f5 > f9) {
            f5 = f9;
        }
        float f10 = f8 / 2.0f;
        if (f6 > f10) {
            f6 = f10;
        }
        float f11 = f7 - (f5 * 2.0f);
        float f12 = f8 - (2.0f * f6);
        path.moveTo(f3, f2 + f6);
        if (z2) {
            float f13 = -f6;
            path.rQuadTo(0.0f, f13, -f5, f13);
        } else {
            path.rLineTo(0.0f, -f6);
            path.rLineTo(-f5, 0.0f);
        }
        path.rLineTo(-f11, 0.0f);
        if (z) {
            float f14 = -f5;
            path.rQuadTo(f14, 0.0f, f14, f6);
        } else {
            path.rLineTo(-f5, 0.0f);
            path.rLineTo(0.0f, f6);
        }
        path.rLineTo(0.0f, f12);
        if (z4) {
            path.rQuadTo(0.0f, f6, f5, f6);
        } else {
            path.rLineTo(0.0f, f6);
            path.rLineTo(f5, 0.0f);
        }
        path.rLineTo(f11, 0.0f);
        if (z3) {
            path.rQuadTo(f5, 0.0f, f5, -f6);
        } else {
            path.rLineTo(f5, 0.0f);
            path.rLineTo(0.0f, -f6);
        }
        path.rLineTo(0.0f, -f12);
        path.close();
        return path;
    }

    public final void m14957E() {
        int measuredHeight = getMeasuredHeight() - this.f25124g0;
        float f = this.f25130j0;
        if (f != 0.0f && measuredHeight != 0) {
            this.f25134l0 = (f / measuredHeight) * this.f25090P;
        }
    }

    public final void m14956F() {
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            this.f25119d1 = getMeasuredWidth() - (getHorizontalPadding() * 2);
            this.f25121e1 = getHorizontalPadding();
            int measuredWidth = getMeasuredWidth() - getHorizontalPadding();
            this.f25123f1 = measuredWidth;
            int i = measuredWidth - this.f25121e1;
            this.f25125g1 = i;
            C7838l lVar = this.f25080I0;
            this.f25127h1 = i / (lVar.f25215m - lVar.f25214l);
            m14945R();
            this.f25124g0 = C1357a0.m37541i(100.0f);
            this.f25129i1.set(this.f25121e1 - getHorizontalPadding(), 0, this.f25123f1 + getHorizontalPadding(), getMeasuredHeight() - this.f25124g0);
            if (this.f25081J0 != null) {
                this.f25091P0 = (int) (C1357a0.m37541i(20.0f) / (this.f25119d1 / this.f25081J0.f26321a.length));
            }
            m14957E();
        }
    }

    public void m14955G() {
        m14954H((this.f25127h1 * this.f25080I0.f25214l) - getHorizontalPadding());
    }

    public void m14954H(float f) {
        int i;
        float f2;
        T t = this.f25081J0;
        if (t != null && (i = this.f25099T0) != -1 && this.f25105W0) {
            this.f25103V0.m12886f(i, t.f26321a[i], this.f25084M, false);
            this.f25103V0.setVisibility(0);
            this.f25103V0.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            float f3 = (this.f25081J0.f26322b[this.f25099T0] * this.f25127h1) - f;
            if (f3 > ((this.f25121e1 + this.f25125g1) >> 1)) {
                f2 = f3 - (this.f25103V0.getWidth() + this.f25102V);
            } else {
                f2 = f3 + this.f25102V;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (this.f25103V0.getMeasuredWidth() + f2 > getMeasuredWidth()) {
                f2 = getMeasuredWidth() - this.f25103V0.getMeasuredWidth();
            }
            this.f25103V0.setTranslationX(f2);
        }
    }

    public void m14953I() {
    }

    public void m14952J(boolean z, boolean z2, boolean z3) {
        if (this.f25081J0 != null) {
            C7838l lVar = this.f25080I0;
            this.f25127h1 = this.f25125g1 / (lVar.f25215m - lVar.f25214l);
            m14946Q();
            m14950M(mo14858w(this.f25136m0, this.f25138n0), this.f25143p1 ? mo14882x(this.f25136m0, this.f25138n0) : 0, z, z2, z3);
            if (this.f25105W0 && !z2) {
                m14939i(false);
                m14954H((this.f25127h1 * this.f25080I0.f25214l) - getHorizontalPadding());
            }
            invalidate();
        }
    }

    public void mo14864K(int i, int i2) {
        if (this.f25081J0 != null) {
            float horizontalPadding = (this.f25127h1 * this.f25080I0.f25214l) - getHorizontalPadding();
            float f = (i + horizontalPadding) / this.f25127h1;
            this.f25101U0 = f;
            if (f < 0.0f) {
                this.f25099T0 = 0;
                this.f25101U0 = 0.0f;
            } else if (f > 1.0f) {
                this.f25099T0 = this.f25081J0.f26321a.length - 1;
                this.f25101U0 = 1.0f;
            } else {
                int b = this.f25081J0.m13592b(this.f25136m0, this.f25138n0, f);
                this.f25099T0 = b;
                int i3 = b + 1;
                float[] fArr = this.f25081J0.f26322b;
                if (i3 < fArr.length) {
                    if (Math.abs(this.f25081J0.f26322b[this.f25099T0 + 1] - f) < Math.abs(fArr[b] - f)) {
                        this.f25099T0++;
                    }
                }
            }
            int i4 = this.f25099T0;
            int i5 = this.f25138n0;
            if (i4 > i5) {
                this.f25099T0 = i5;
            }
            int i6 = this.f25099T0;
            int i7 = this.f25136m0;
            if (i6 < i7) {
                this.f25099T0 = i7;
            }
            this.f25105W0 = true;
            m14939i(true);
            m14954H(horizontalPadding);
            AbstractC7829h hVar = this.f25145q1;
            if (hVar != null) {
                hVar.m14931a(getSelectedDate());
            }
            invalidate();
        }
    }

    public final void m14951L(int i, int i2, boolean z) {
        m14950M(i, i2, z, false, false);
    }

    public void m14950M(int i, int i2, boolean z, boolean z2, boolean z3) {
        if ((Math.abs(((float) C8316e.m12893c(i)) - this.f25130j0) >= this.f25134l0 && i != 0) || i != this.f25132k0) {
            final C8316e l = mo14884l(i, i2);
            int[] iArr = l.f26809a;
            int i3 = iArr[iArr.length - 1];
            int i4 = iArr[0];
            if (!z3) {
                float f = this.f25126h0;
                float f2 = this.f25128i0;
                float f3 = i3 - i4;
                float f4 = (f - f2) / f3;
                if (f4 > 1.0f) {
                    f4 = f3 / (f - f2);
                }
                float f5 = 0.045f;
                double d = f4;
                if (d > 0.7d) {
                    f5 = 0.1f;
                } else if (d < 0.1d) {
                    f5 = 0.03f;
                }
                boolean z4 = ((float) i3) != this.f25130j0;
                if (this.f25143p1 && i4 != this.f25132k0) {
                    z4 = true;
                }
                if (z4) {
                    Animator animator = this.f25071D0;
                    if (animator != null) {
                        animator.removeAllListeners();
                        this.f25071D0.cancel();
                    }
                    this.f25151t1 = this.f25126h0;
                    this.f25153u1 = this.f25128i0;
                    this.f25147r1 = 0.0f;
                    this.f25149s1 = 0.0f;
                    this.f25155v1 = f5;
                }
            }
            float f6 = i3;
            this.f25130j0 = f6;
            float f7 = i4;
            this.f25132k0 = f7;
            m14957E();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f25161y1 >= 320 || z2) {
                this.f25161y1 = currentTimeMillis;
                ValueAnimator valueAnimator = this.f25073E0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f25073E0.cancel();
                }
                if (!z) {
                    this.f25126h0 = f6;
                    this.f25128i0 = f7;
                    this.f25112b.clear();
                    this.f25112b.add(l);
                    l.f26812d = 255;
                    return;
                }
                this.f25112b.add(l);
                if (z3) {
                    Animator animator2 = this.f25071D0;
                    if (animator2 != null) {
                        animator2.removeAllListeners();
                        this.f25071D0.cancel();
                    }
                    this.f25155v1 = 0.0f;
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(m14937k(this.f25126h0, f6, this.f25135l1));
                    if (this.f25143p1) {
                        animatorSet.playTogether(m14937k(this.f25128i0, f7, this.f25137m1));
                    }
                    this.f25071D0 = animatorSet;
                    animatorSet.start();
                }
                int size = this.f25112b.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C8316e eVar = this.f25112b.get(i5);
                    if (eVar != l) {
                        eVar.f26813e = eVar.f26812d;
                    }
                }
                ValueAnimator k = m14937k(0.0f, 255.0f, new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        AbstractC7821f.this.m14959C(l, valueAnimator2);
                    }
                });
                this.f25073E0 = k;
                k.addListener(new C7826e(l));
                this.f25073E0.start();
            }
        }
    }

    public void m14949N() {
        float f = this.f25155v1;
        if (f != 0.0f) {
            float f2 = this.f25126h0;
            float f3 = this.f25130j0;
            if (f2 != f3) {
                float f4 = this.f25147r1 + f;
                this.f25147r1 = f4;
                if (f4 > 1.0f) {
                    this.f25147r1 = 1.0f;
                    this.f25126h0 = f3;
                } else {
                    float f5 = this.f25151t1;
                    this.f25126h0 = f5 + ((f3 - f5) * animationInterpolatorC7842n.f25239g.getInterpolation(f4));
                }
                invalidate();
            }
            if (this.f25143p1) {
                float f6 = this.f25128i0;
                float f7 = this.f25132k0;
                if (f6 != f7) {
                    float f8 = this.f25149s1 + this.f25155v1;
                    this.f25149s1 = f8;
                    if (f8 > 1.0f) {
                        this.f25149s1 = 1.0f;
                        this.f25128i0 = f7;
                    } else {
                        float f9 = this.f25153u1;
                        this.f25128i0 = f9 + ((f7 - f9) * animationInterpolatorC7842n.f25239g.getInterpolation(f8));
                    }
                    invalidate();
                }
            }
        }
    }

    public void m14948O() {
        if (this.f25108Z0) {
            this.f25150t0.setColor(C11524j.m213U0());
        } else {
            this.f25150t0.setColor(C11524j.m213U0());
        }
        C7830i iVar = this.f25109a;
        if (iVar != null) {
            iVar.m14929b();
        }
        this.f25154v0.setColor(C11524j.m213U0());
        this.f25146r0.setColor(C11524j.m223P0());
        this.f25148s0.setColor(C11524j.m223P0());
        this.f25156w0.setColor(C11524j.m228N(R.id.theme_color_fillingPositive));
        this.f25158x0.setColor(C5064d.m24131a(0.5f, C8929a.m10945d(C11524j.m228N(R.id.theme_color_fillingPositive), C11524j.m148w(), 0.6f)));
        this.f25160y0.setColor(C11524j.m148w());
        this.f25162z0.setColor(C5064d.m24131a(0.2f, C11524j.m228N(R.id.theme_color_fillingPositive)));
        this.f25103V0.m12887e();
        this.f25120e0 = this.f25146r0.getAlpha();
        this.f25122f0 = this.f25148s0.getAlpha();
        this.f25116c0 = this.f25150t0.getAlpha() / 255.0f;
        this.f25118d0 = this.f25154v0.getAlpha() / 255.0f;
        Iterator<L> it = this.f25084M.iterator();
        while (it.hasNext()) {
            it.next().mo12884a();
        }
        if (this.f25105W0) {
            int i = this.f25099T0;
            long[] jArr = this.f25081J0.f26321a;
            if (i < jArr.length) {
                this.f25103V0.m12886f(i, jArr[i], this.f25084M, false);
            }
        }
        this.f25140o0 = true;
    }

    public final void m14947P(int i) {
        C8313b bVar = this.f25082K0;
        if (bVar == null || i >= bVar.f26795b || i <= bVar.f26796c) {
            int highestOneBit = Integer.highestOneBit(i) << 1;
            C8313b bVar2 = this.f25082K0;
            if (bVar2 == null || bVar2.f26794a != highestOneBit) {
                ValueAnimator valueAnimator = this.f25075F0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f25075F0.cancel();
                }
                double d = highestOneBit;
                double d2 = 0.2d * d;
                final C8313b bVar3 = new C8313b(highestOneBit, (int) (d + d2), (int) (d - d2));
                bVar3.f26797d = 255;
                if (this.f25082K0 == null) {
                    this.f25082K0 = bVar3;
                    bVar3.f26797d = 255;
                    this.f25115c.add(bVar3);
                    return;
                }
                this.f25082K0 = bVar3;
                this.f25087N0 = this.f25115c.size();
                for (int i2 = 0; i2 < this.f25087N0; i2++) {
                    C8313b bVar4 = this.f25115c.get(i2);
                    bVar4.f26798e = bVar4.f26797d;
                }
                this.f25115c.add(bVar3);
                if (this.f25115c.size() > 2) {
                    this.f25115c.remove(0);
                }
                ValueAnimator duration = m14937k(0.0f, 1.0f, new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        AbstractC7821f.this.m14958D(bVar3, valueAnimator2);
                    }
                }).setDuration(200L);
                this.f25075F0 = duration;
                duration.addListener(new C7827f(bVar3));
                this.f25075F0.start();
            }
        }
    }

    public void m14946Q() {
        T t = this.f25081J0;
        if (t != null) {
            int c = t.m13591c(Math.max(this.f25080I0.f25214l, 0.0f));
            this.f25136m0 = c;
            int a = this.f25081J0.m13593a(c, Math.min(this.f25080I0.f25215m, 1.0f));
            this.f25138n0 = a;
            AbstractC7828g gVar = this.f25078G1;
            if (gVar != null) {
                long[] jArr = this.f25081J0.f26321a;
                gVar.mo14928a(this, jArr[this.f25136m0], jArr[a]);
            }
            m14945R();
        }
    }

    public final void m14945R() {
        int i;
        T t = this.f25081J0;
        if (t != null && (i = this.f25125g1) != 0) {
            m14947P((int) ((i / (this.f25127h1 * t.f26327g)) / 6.0f));
        }
    }

    @Override
    public void mo14891a(float f, float f2, boolean z) {
        T t = this.f25081J0;
        if (t != null) {
            if (z) {
                int c = t.m13591c(Math.max(f, 0.0f));
                int a = this.f25081J0.m13593a(c, Math.min(f2, 1.0f));
                m14950M(mo14858w(c, a), mo14882x(c, a), true, true, false);
                m14939i(false);
                return;
            }
            m14946Q();
            invalidate();
        }
    }

    @Override
    public void mo14890b() {
        m14952J(true, false, false);
    }

    @Override
    public void mo90c(boolean z) {
        m14948O();
        invalidate();
    }

    public long getEndDate() {
        return this.f25081J0.f26321a[this.f25138n0];
    }

    public float getMinDistance() {
        T t = this.f25081J0;
        if (t == null) {
            return 0.1f;
        }
        int length = t.f26321a.length;
        if (length < 5) {
            return 1.0f;
        }
        float f = 5.0f / length;
        if (f < 0.1f) {
            return 0.1f;
        }
        return f;
    }

    public long getSelectedDate() {
        int i = this.f25099T0;
        if (i < 0) {
            return -1L;
        }
        return this.f25081J0.f26321a[i];
    }

    public long getStartDate() {
        return this.f25081J0.f26321a[this.f25136m0];
    }

    public void m14939i(boolean z) {
        m14955G();
        if (this.f25076F1 != z) {
            this.f25076F1 = z;
            ValueAnimator valueAnimator = this.f25077G0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25077G0.cancel();
            }
            ValueAnimator duration = m14937k(this.f25106X0, z ? 1.0f : 0.0f, this.f25139n1).setDuration(200L);
            this.f25077G0 = duration;
            duration.addListener(this.f25141o1);
            this.f25077G0.start();
        }
    }

    public void m14938j() {
        this.f25099T0 = -1;
        this.f25105W0 = false;
        this.f25076F1 = false;
        this.f25103V0.setVisibility(8);
        this.f25106X0 = 0.0f;
    }

    public ValueAnimator m14937k(float f, float f2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(f25064J1);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    public C8316e mo14884l(int i, int i2) {
        return new C8316e(i, i2, this.f25143p1);
    }

    public C8317f m14936m() {
        return new C8317f(getContext());
    }

    public abstract L mo14862n(C8105a.C8106a aVar);

    public void m14935o(Canvas canvas) {
        int measuredHeight;
        if (this.f25081J0 != null) {
            int i = this.f25111a1;
            if (i == 2) {
                throw null;
            } else if (i == 1) {
                throw null;
            } else if (i != 3) {
                this.f25146r0.setAlpha((int) (this.f25120e0 * 1.0f));
                this.f25150t0.setAlpha((int) (this.f25116c0 * 255.0f * 1.0f));
                int signatureTextHeight = (int) (getSignatureTextHeight() - this.f25150t0.getTextSize());
                float measuredHeight2 = (getMeasuredHeight() - this.f25124g0) - 1;
                canvas.drawLine(this.f25121e1, measuredHeight2, this.f25123f1, measuredHeight2, this.f25146r0);
                if (!this.f25143p1) {
                    canvas.drawText("0", getHorizontalPadding(), measuredHeight - signatureTextHeight, this.f25150t0);
                }
            } else {
                throw null;
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f25107Y0) {
            super.onDraw(canvas);
            return;
        }
        m14949N();
        int save = canvas.save();
        canvas.clipRect(0, this.f25129i1.top, getMeasuredWidth(), this.f25129i1.bottom);
        m14935o(canvas);
        this.f25087N0 = this.f25112b.size();
        this.f25089O0 = 0;
        while (true) {
            int i = this.f25089O0;
            if (i >= this.f25087N0) {
                break;
            }
            m14933r(canvas, this.f25112b.get(i));
            this.f25089O0++;
        }
        mo14861q(canvas);
        this.f25089O0 = 0;
        while (true) {
            int i2 = this.f25089O0;
            if (i2 < this.f25087N0) {
                mo14883v(canvas, this.f25112b.get(i2));
                this.f25089O0++;
            } else {
                canvas.restoreToCount(save);
                m14934p(canvas);
                m14932s(canvas);
                mo14859u(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (getMeasuredWidth() != this.f25157w1 || getMeasuredHeight() != this.f25159x1) {
            this.f25157w1 = getMeasuredWidth();
            this.f25159x1 = getMeasuredHeight();
            this.f25093Q0 = Bitmap.createBitmap(getMeasuredWidth() - (getHorizontalPadding() << 1), this.f25117c1, Bitmap.Config.ARGB_4444);
            this.f25095R0 = new Canvas(this.f25093Q0);
            this.f25109a.m14930a(this.f25117c1, getMeasuredWidth() - (getHorizontalPadding() * 2));
            m14956F();
            if (this.f25105W0) {
                m14954H((this.f25127h1 * this.f25080I0.f25214l) - getHorizontalPadding());
            }
            m14952J(false, true, false);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f25081J0 == null) {
            return false;
        }
        if (!this.f25142p0) {
            this.f25080I0.m14896j(motionEvent, motionEvent.getActionIndex());
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f25097S0 = false;
            return false;
        }
        int x = (int) motionEvent.getX(motionEvent.getActionIndex());
        int y = (int) motionEvent.getY(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = x - this.f25163z1;
                    int i2 = y - this.f25066A1;
                    if (this.f25080I0.m14903c()) {
                        boolean h = this.f25080I0.m14898h(x, y, motionEvent.getActionIndex());
                        if (motionEvent.getPointerCount() > 1) {
                            this.f25080I0.m14898h((int) motionEvent.getX(1), (int) motionEvent.getY(1), 1);
                        }
                        getParent().requestDisallowInterceptTouchEvent(h);
                        return true;
                    }
                    if (this.f25097S0) {
                        if ((this.f25074E1 && System.currentTimeMillis() - this.f25072D1 > 200) || Math.abs(i) > Math.abs(i2) || Math.abs(i2) < this.f25114b1) {
                            z = true;
                        }
                        this.f25163z1 = x;
                        this.f25066A1 = y;
                        getParent().requestDisallowInterceptTouchEvent(z);
                        mo14864K(x, y);
                    } else if (this.f25129i1.contains(this.f25068B1, this.f25070C1)) {
                        int i3 = this.f25068B1 - x;
                        int i4 = this.f25070C1 - y;
                        if (Math.sqrt((i3 * i3) + (i4 * i4)) > this.f25114b1 || System.currentTimeMillis() - this.f25072D1 > 200) {
                            this.f25097S0 = true;
                            mo14864K(x, y);
                        }
                    }
                    return true;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        return this.f25080I0.m14904b(x, y, motionEvent.getActionIndex());
                    }
                    if (actionMasked != 6) {
                        return false;
                    }
                    this.f25080I0.m14896j(motionEvent, motionEvent.getActionIndex());
                    return true;
                }
            }
            if (this.f25080I0.m14896j(motionEvent, motionEvent.getActionIndex())) {
                return true;
            }
            if (this.f25129i1.contains(this.f25068B1, this.f25070C1) && !this.f25097S0) {
                m14939i(false);
            }
            this.f25080I0.m14897i();
            m14945R();
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f25097S0 = false;
            m14953I();
            invalidate();
            m14950M(mo14858w(this.f25136m0, this.f25138n0), this.f25143p1 ? mo14882x(this.f25136m0, this.f25138n0) : 0, true, true, false);
            return true;
        }
        this.f25072D1 = System.currentTimeMillis();
        getParent().requestDisallowInterceptTouchEvent(true);
        if (this.f25080I0.m14904b(x, y, motionEvent.getActionIndex())) {
            return true;
        }
        this.f25163z1 = x;
        this.f25068B1 = x;
        this.f25066A1 = y;
        this.f25070C1 = y;
        if (!this.f25129i1.contains(x, y)) {
            return false;
        }
        if (this.f25099T0 < 0 || !this.f25076F1) {
            this.f25097S0 = true;
            mo14864K(x, y);
        }
        return true;
    }

    public void m14934p(Canvas canvas) {
        if (this.f25081J0 != null) {
            this.f25087N0 = this.f25115c.size();
            int i = this.f25111a1;
            if (i == 2) {
                throw null;
            } else if (i == 1) {
                throw null;
            } else if (i != 3) {
                this.f25089O0 = 0;
                while (true) {
                    int i2 = this.f25089O0;
                    if (i2 < this.f25087N0) {
                        int i3 = this.f25115c.get(i2).f26797d;
                        int i4 = this.f25115c.get(this.f25089O0).f26794a;
                        if (i4 == 0) {
                            i4 = 1;
                        }
                        int i5 = this.f25136m0 - this.f25091P0;
                        while (i5 % i4 != 0) {
                            i5--;
                        }
                        int i6 = this.f25138n0 - this.f25091P0;
                        while (true) {
                            if (i6 % i4 == 0 && i6 >= this.f25081J0.f26321a.length - 1) {
                                break;
                            }
                            i6++;
                        }
                        int i7 = this.f25091P0;
                        int i8 = i6 + i7;
                        float horizontalPadding = (this.f25127h1 * this.f25080I0.f25214l) - getHorizontalPadding();
                        for (int i9 = i5 + i7; i9 < i8; i9 += i4) {
                            if (i9 >= 0) {
                                long[] jArr = this.f25081J0.f26321a;
                                if (i9 < jArr.length - 1) {
                                    float f = ((((float) (jArr[i9] - jArr[0])) / ((float) (jArr[jArr.length - 1] - jArr[0]))) * this.f25127h1) - horizontalPadding;
                                    float f2 = f - this.f25096S;
                                    if (f2 > 0.0f && f2 <= this.f25125g1 + getHorizontalPadding()) {
                                        if (f2 < getBottomSignatureStartAlpha()) {
                                            this.f25154v0.setAlpha((int) (i3 * (1.0f - ((getBottomSignatureStartAlpha() - f2) / getBottomSignatureStartAlpha())) * this.f25118d0 * 1.0f));
                                        } else {
                                            int i10 = this.f25125g1;
                                            if (f2 > i10) {
                                                this.f25154v0.setAlpha((int) (i3 * (1.0f - ((f2 - i10) / getHorizontalPadding())) * this.f25118d0 * 1.0f));
                                            } else {
                                                this.f25154v0.setAlpha((int) (i3 * this.f25118d0 * 1.0f));
                                            }
                                        }
                                        canvas.drawText(this.f25081J0.m13590d(i9), f, (getMeasuredHeight() - this.f25124g0) + this.f25092Q + C1357a0.m37541i(3.0f), this.f25154v0);
                                    }
                                }
                            }
                        }
                        this.f25089O0++;
                    } else {
                        return;
                    }
                }
            } else {
                throw null;
            }
        }
    }

    public void mo14861q(Canvas canvas) {
    }

    public void m14933r(android.graphics.Canvas r13, p238qc.C8316e r14) {
        throw new UnsupportedOperationException("Method not decompiled: p208oc.AbstractC7821f.m14933r(android.graphics.Canvas, qc.e):void");
    }

    @Override
    public void requestLayout() {
        super.requestLayout();
    }

    public void m14932s(Canvas canvas) {
        int i;
        int i2;
        Rect rect;
        int i3;
        Rect rect2;
        int i4;
        boolean z;
        ValueAnimator valueAnimator;
        if (this.f25081J0 != null) {
            this.f25080I0.f25205c = this.f25119d1;
            int measuredHeight = getMeasuredHeight() - getPickerPadding();
            int measuredHeight2 = (getMeasuredHeight() - this.f25117c1) - getPickerPadding();
            int horizontalPadding = (int) (getHorizontalPadding() + (this.f25119d1 * this.f25080I0.f25214l));
            int horizontalPadding2 = (int) (getHorizontalPadding() + (this.f25119d1 * this.f25080I0.f25215m));
            int i5 = this.f25111a1;
            if (i5 == 1) {
                getHorizontalPadding();
                throw null;
            } else if (i5 != 3) {
                if (this.f25081J0 != null) {
                    if (i5 == 0) {
                        for (int i6 = 0; i6 < this.f25084M.size(); i6++) {
                            L l = this.f25084M.get(i6);
                            ValueAnimator valueAnimator2 = l.f26845h;
                            if ((valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = l.f26846i) != null && valueAnimator.isRunning())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        canvas.save();
                        canvas.clipRect(getHorizontalPadding(), (getMeasuredHeight() - getPickerPadding()) - this.f25117c1, getMeasuredWidth() - getHorizontalPadding(), getMeasuredHeight() - getPickerPadding());
                        canvas.translate(getHorizontalPadding(), (getMeasuredHeight() - getPickerPadding()) - this.f25117c1);
                        mo14860t(canvas);
                        canvas.restore();
                    } else if (this.f25140o0) {
                        this.f25093Q0.eraseColor(0);
                        mo14860t(this.f25095R0);
                        this.f25140o0 = false;
                    }
                    if (!z) {
                        int i7 = this.f25111a1;
                        if (i7 == 2) {
                            getHorizontalPadding();
                            throw null;
                        } else if (i7 != 1) {
                            this.f25144q0.setAlpha((int) (1.0f * 255.0f));
                            canvas.drawBitmap(this.f25093Q0, getHorizontalPadding(), (getMeasuredHeight() - getPickerPadding()) - this.f25117c1, this.f25144q0);
                        } else {
                            getHorizontalPadding();
                            throw null;
                        }
                    }
                    if (this.f25111a1 != 2) {
                        float f = measuredHeight2;
                        float f2 = measuredHeight;
                        canvas.drawRect(getHorizontalPadding(), f, this.f25098T + horizontalPadding, f2, this.f25158x0);
                        canvas.drawRect(horizontalPadding2 - this.f25098T, f, getMeasuredWidth() - getHorizontalPadding(), f2, this.f25158x0);
                    } else {
                        return;
                    }
                } else {
                    canvas.drawRect(getHorizontalPadding(), measuredHeight2, getMeasuredWidth() - getHorizontalPadding(), measuredHeight, this.f25158x0);
                }
                canvas.drawBitmap(this.f25109a.m14930a(this.f25117c1, getMeasuredWidth() - (getHorizontalPadding() * 2)), getHorizontalPadding(), (getMeasuredHeight() - getPickerPadding()) - this.f25117c1, this.f25144q0);
                if (this.f25081J0 != null) {
                    this.f25067B0.set(horizontalPadding, measuredHeight2, horizontalPadding2, measuredHeight);
                    this.f25080I0.f25213k.set(this.f25067B0);
                    Path path = this.f25069C0;
                    Rect rect3 = this.f25067B0;
                    int i8 = rect3.left;
                    int i9 = rect3.top;
                    int i10 = this.f25110a0;
                    int i11 = this.f25100U;
                    canvas.drawPath(m14940h(path, i8, i9 - i10, i8 + this.f25098T, rect3.bottom + i10, i11, i11, true, false, false, true), this.f25156w0);
                    Path path2 = this.f25069C0;
                    Rect rect4 = this.f25067B0;
                    int i12 = rect4.right;
                    float f3 = i12 - this.f25098T;
                    int i13 = rect4.top;
                    int i14 = this.f25110a0;
                    int i15 = this.f25100U;
                    canvas.drawPath(m14940h(path2, f3, i13 - i14, i12, rect4.bottom + i14, i15, i15, false, true, true, false), this.f25156w0);
                    Rect rect5 = this.f25067B0;
                    int i16 = rect5.left;
                    int i17 = this.f25098T;
                    canvas.drawRect(i16 + i17, rect5.bottom, rect5.right - i17, i + this.f25110a0, this.f25156w0);
                    Rect rect6 = this.f25067B0;
                    int i18 = rect6.left;
                    int i19 = this.f25098T;
                    canvas.drawRect(i18 + i19, i2 - this.f25110a0, rect6.right - i19, rect6.top, this.f25156w0);
                    float centerY = this.f25067B0.centerY() - this.f25100U;
                    Rect rect7 = this.f25067B0;
                    canvas.drawLine(rect.left + this.f25100U, centerY, rect7.left + i3, rect7.centerY() + this.f25100U, this.f25065A0);
                    float centerY2 = this.f25067B0.centerY() - this.f25100U;
                    Rect rect8 = this.f25067B0;
                    canvas.drawLine(rect2.right - this.f25100U, centerY2, rect8.right - i4, rect8.centerY() + this.f25100U, this.f25065A0);
                    C7838l.C7839a e = this.f25080I0.m14901e();
                    Rect rect9 = this.f25067B0;
                    int i20 = rect9.bottom;
                    int i21 = rect9.top;
                    int i22 = (i20 - i21) >> 1;
                    int i23 = i21 + i22;
                    if (e == null) {
                        C7838l.C7839a d = this.f25080I0.m14902d();
                        C7838l.C7839a f4 = this.f25080I0.m14900f();
                        if (d != null) {
                            canvas.drawCircle(this.f25067B0.left + this.f25102V, i23, (i22 * d.f25225h) - this.f25104W, this.f25162z0);
                        }
                        if (f4 != null) {
                            canvas.drawCircle(this.f25067B0.right - this.f25102V, i23, (i22 * f4.f25225h) - this.f25104W, this.f25162z0);
                        }
                    }
                    Rect rect10 = this.f25080I0.f25211i;
                    int i24 = this.f25094R;
                    rect10.set(horizontalPadding - i24, measuredHeight2, horizontalPadding + (i24 >> 1), measuredHeight);
                    Rect rect11 = this.f25080I0.f25212j;
                    int i25 = this.f25094R;
                    rect11.set(horizontalPadding2 - (i25 >> 1), measuredHeight2, horizontalPadding2 + i25, measuredHeight);
                }
            } else {
                throw null;
            }
        }
    }

    public void setData(T t) {
        if (this.f25081J0 != t) {
            invalidate();
            this.f25084M.clear();
            if (!(t == null || t.f26324d == null)) {
                for (int i = 0; i < t.f26324d.size(); i++) {
                    this.f25084M.add(mo14862n(t.f26324d.get(i)));
                }
            }
            m14938j();
            this.f25081J0 = t;
            if (t != null) {
                if (t.f26321a[0] == 0) {
                    C7838l lVar = this.f25080I0;
                    lVar.f25214l = 0.0f;
                    lVar.f25215m = 1.0f;
                } else {
                    this.f25080I0.f25216n = getMinDistance();
                    C7838l lVar2 = this.f25080I0;
                    float f = lVar2.f25215m;
                    float f2 = lVar2.f25216n;
                    if (f - lVar2.f25214l < f2) {
                        float f3 = f - f2;
                        lVar2.f25214l = f3;
                        if (f3 < 0.0f) {
                            lVar2.f25214l = 0.0f;
                            lVar2.f25215m = 1.0f;
                        }
                    }
                }
            }
        }
        m14956F();
        if (t != null) {
            m14946Q();
            m14951L(mo14858w(this.f25136m0, this.f25138n0), this.f25143p1 ? mo14882x(this.f25136m0, this.f25138n0) : 0, false);
            this.f25083L0 = 0.0f;
            this.f25085M0 = 2.14748365E9f;
            mo14857z();
            this.f25103V0.setSize(this.f25084M.size());
            this.f25140o0 = true;
            m14945R();
            return;
        }
        C7838l lVar3 = this.f25080I0;
        lVar3.f25214l = 0.7f;
        lVar3.f25215m = 1.0f;
        this.f25085M0 = 0.0f;
        this.f25083L0 = 0.0f;
        this.f25112b.clear();
        Animator animator = this.f25071D0;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimator = this.f25073E0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f25073E0.cancel();
        }
    }

    public void setDateSelectionListener(AbstractC7829h hVar) {
        this.f25145q1 = hVar;
    }

    public void setListener(AbstractC7828g gVar) {
        this.f25078G1 = gVar;
    }

    public void mo14860t(Canvas canvas) {
    }

    public void mo14859u(Canvas canvas) {
        if (this.f25099T0 >= 0 && this.f25105W0 && this.f25081J0 != null) {
            int i = (int) (this.f25122f0 * this.f25106X0);
            C7838l lVar = this.f25080I0;
            float f = lVar.f25215m;
            float f2 = lVar.f25214l;
            float f3 = this.f25125g1 / (f - f2);
            float horizontalPadding = (f2 * f3) - getHorizontalPadding();
            int i2 = this.f25099T0;
            float[] fArr = this.f25081J0.f26322b;
            if (i2 < fArr.length) {
                float f4 = (fArr[i2] * f3) - horizontalPadding;
                this.f25148s0.setAlpha(i);
                canvas.drawLine(f4, 0.0f, f4, this.f25129i1.bottom, this.f25148s0);
                if (this.f25113b0) {
                    this.f25087N0 = this.f25084M.size();
                    int i3 = 0;
                    while (true) {
                        this.f25089O0 = i3;
                        int i4 = this.f25089O0;
                        if (i4 < this.f25087N0) {
                            L l = this.f25084M.get(i4);
                            if (l.f26851n || l.f26852o != 0.0f) {
                                float f5 = this.f25128i0;
                                float measuredHeight = (getMeasuredHeight() - this.f25124g0) - (((l.f26838a.f26329a[this.f25099T0] - f5) / (this.f25126h0 - f5)) * ((getMeasuredHeight() - this.f25124g0) - getSignatureTextHeight()));
                                l.f26841d.setAlpha((int) (l.f26852o * 255.0f * this.f25106X0));
                                this.f25160y0.setAlpha((int) (l.f26852o * 255.0f * this.f25106X0));
                                canvas.drawPoint(f4, measuredHeight, l.f26841d);
                                canvas.drawPoint(f4, measuredHeight, this.f25160y0);
                            }
                            i3 = this.f25089O0 + 1;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public void mo14883v(android.graphics.Canvas r11, p238qc.C8316e r12) {
        throw new UnsupportedOperationException("Method not decompiled: p208oc.AbstractC7821f.mo14883v(android.graphics.Canvas, qc.e):void");
    }

    public int mo14858w(int i, int i2) {
        int f;
        int size = this.f25084M.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f25084M.get(i4).f26851n && (f = this.f25084M.get(i4).f26838a.f26330b.m14869f(i, i2)) > i3) {
                i3 = f;
            }
        }
        return i3;
    }

    public int mo14882x(int i, int i2) {
        int h;
        int size = this.f25084M.size();
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f25084M.get(i4).f26851n && (h = this.f25084M.get(i4).f26838a.f26330b.m14867h(i, i2)) < i3) {
                i3 = h;
            }
        }
        return i3;
    }

    public void mo14876y() {
        this.f25146r0.setStrokeWidth(1.0f);
        this.f25148s0.setStrokeWidth(this.f25088O);
        this.f25150t0.setTextSize(this.f25090P);
        this.f25152u0.setTextSize(this.f25090P);
        this.f25152u0.setTextAlign(Paint.Align.RIGHT);
        this.f25154v0.setTextSize(this.f25090P);
        this.f25154v0.setTextAlign(Paint.Align.CENTER);
        this.f25160y0.setStrokeWidth(C1357a0.m37539k(6.0f));
        this.f25160y0.setStrokeCap(Paint.Cap.ROUND);
        setLayerType(2, null);
        setWillNotDraw(false);
        C8317f m = m14936m();
        this.f25103V0 = m;
        m.setVisibility(8);
        this.f25065A0.setColor(-1);
        this.f25065A0.setStrokeWidth(C1357a0.m37539k(3.0f));
        this.f25065A0.setStrokeCap(Paint.Cap.ROUND);
        m14948O();
    }

    public void mo14857z() {
        Iterator<L> it = this.f25084M.iterator();
        while (it.hasNext()) {
            L next = it.next();
            boolean z = next.f26851n;
            if (z) {
                int i = next.f26838a.f26333e;
                if (i > this.f25083L0) {
                    this.f25083L0 = i;
                }
            }
            if (z) {
                int i2 = next.f26838a.f26334f;
                if (i2 < this.f25085M0) {
                    this.f25085M0 = i2;
                }
            }
            float f = this.f25083L0;
            float f2 = this.f25085M0;
            if (f == f2) {
                this.f25083L0 = f + 1.0f;
                this.f25085M0 = f2 - 1.0f;
            }
        }
    }
}
