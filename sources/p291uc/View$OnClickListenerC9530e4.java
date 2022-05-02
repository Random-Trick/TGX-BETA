package p291uc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import gd.C4695l6;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4383l;
import p082fd.C4403w;
import p141jd.RunnableC5952j1;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.C11009t1;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class View$OnClickListenerC9530e4 extends FrameLayoutFix implements View.OnClickListener, C11009t1.AbstractC11010a, C4336c.AbstractC4337a, C3950k.AbstractC3952b {
    public static final AnticipateOvershootInterpolator f30860i0 = new AnticipateOvershootInterpolator(3.0f);
    public Paint f30861M;
    public AbstractC9533c f30865Q;
    public ImageView f30867S;
    public boolean f30869U;
    public C4695l6 f30870V;
    public boolean f30871W;
    public float f30873b0;
    public String f30876e0;
    public boolean f30877f0;
    public float f30878g0;
    public ValueAnimator f30879h0;
    public final C3950k f30872a0 = new C3950k(0, this, f30860i0, 350);
    public int f30874c0 = -1;
    public int f30875d0 = -1;
    public int f30862N = C1357a0.m37544i(5.0f);
    public int f30863O = C1357a0.m37544i(39.0f);
    public int f30864P = C1357a0.m37544i(66.0f);
    public C4336c f30868T = new C4336c(this);
    public C9626o4 f30866R = new C9626o4(null, 1, false);

    public class C9531a extends AnimatorListenerAdapter {
        public C9531a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC9530e4.this.f30879h0 = null;
        }
    }

    public class C9532b extends AnimatorListenerAdapter {
        public C9532b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC9530e4.this.setVisibility(8);
        }
    }

    public interface AbstractC9533c {
        void mo8407M6();
    }

    public View$OnClickListenerC9530e4(Context context) {
        super(context);
        int i = 5;
        Paint paint = new Paint(5);
        this.f30861M = paint;
        paint.setTypeface(C1389o.m37261k());
        this.f30861M.setTextSize(C1357a0.m37544i(15.0f));
        ImageView imageView = new ImageView(context);
        this.f30867S = imageView;
        imageView.setId(R.id.btn_discard_record);
        this.f30867S.setScaleType(ImageView.ScaleType.CENTER);
        this.f30867S.setImageResource(R.drawable.baseline_delete_24);
        this.f30867S.setColorFilter(C11524j.m159q0());
        this.f30867S.setOnClickListener(this);
        this.f30867S.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37544i(58.0f), -1, !C4403w.m27986G2() ? 3 : i));
        C1399s0.m37196a0(this.f30867S);
        C10189d.m5794j(this.f30867S);
        addView(this.f30867S);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1357a0.m37544i(48.0f));
        layoutParams.addRule(12);
        if (C4403w.m27986G2()) {
            layoutParams.addRule(11);
            layoutParams.leftMargin = C1357a0.m37544i(55.0f);
        } else {
            layoutParams.addRule(9);
            layoutParams.rightMargin = C1357a0.m37544i(55.0f);
        }
        setWillNotDraw(false);
        setLayoutParams(layoutParams);
    }

    public void m8415S1(float f, float f2, ValueAnimator valueAnimator) {
        setCollapse(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public void m8413U1(final C4695l6 l6Var) {
        final byte[] g = l6Var.m26469g() != null ? l6Var.m26469g() : C7888N.getWaveform(l6Var.m26470f());
        if (g != null) {
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC9530e4.this.m8414T1(l6Var, g);
                }
            });
        }
    }

    private void setRecord(C4695l6 l6Var) {
        C4695l6 l6Var2 = this.f30870V;
        if (l6Var2 != l6Var) {
            if (l6Var2 != null) {
                C11009t1.m1993a().m1991c(this.f30870V.m26474b().m25205b(), this);
            }
            this.f30870V = l6Var;
            if (l6Var != null) {
                C11009t1.m1993a().m1992b(l6Var.m26474b().m25205b(), this);
            }
        }
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return C4335b.m28260d(this, f, f2);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        C9626o4 o4Var = this.f30866R;
        if (o4Var != null && this.f30870V != null) {
            int i = this.f30864P;
            if (f >= i && f < i + o4Var.m7969i()) {
                m8412V1();
            }
        }
    }

    @Override
    public boolean mo1990C0(int i) {
        return true;
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28256h(this, view, f, f2);
    }

    public void m8423G1(AbstractC9323v4<?> v4Var) {
        v4Var.m9184q8(this.f30867S, R.id.theme_color_icon);
        v4Var.m9163t8(this);
        C10192g.m5781j(this, R.id.theme_color_filling);
    }

    public void m8422I1() {
        long j;
        this.f30878g0 = 0.0f;
        C9626o4 o4Var = this.f30866R;
        if (o4Var == null || o4Var.m7970h() == 0) {
            this.f30879h0 = null;
            j = 0;
        } else {
            final float collapse = getCollapse();
            final float f = 1.0f - collapse;
            ValueAnimator b = C2057b.m35737b();
            this.f30879h0 = b;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View$OnClickListenerC9530e4.this.m8415S1(collapse, f, valueAnimator);
                }
            });
            this.f30879h0.setDuration(350L);
            this.f30879h0.setInterpolator(C2057b.f7283e);
            this.f30879h0.addListener(new C9531a());
            j = 200;
        }
        C1399s0.m37179j(this, 0.0f, 150L, j, C2057b.f7280b, new C9532b());
        ValueAnimator valueAnimator = this.f30879h0;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public final int m8421J1() {
        return ((getMeasuredWidth() - this.f30864P) - C1357a0.m37544i(110.0f)) + C1357a0.m37544i(55.0f);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28263a(this);
    }

    public void m8420L1() {
        ValueAnimator valueAnimator = this.f30879h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f30879h0 = null;
        }
        C1399s0.m37171n(this);
    }

    public void m8419M1() {
        m8418N1();
        this.f30869U = false;
        this.f30873b0 = 0.0f;
        this.f30871W = false;
        this.f30866R.m7964n(null);
        invalidate();
    }

    public void m8418N1() {
        if (this.f30870V != null) {
            RunnableC5952j1.m21780y().m21787r(this.f30870V);
            setRecord(null);
        }
    }

    public void m8417O1() {
        this.f30869U = true;
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        setExpand(f);
    }

    public final void m8416Q1() {
        int i = this.f30864P;
        invalidate(i, 0, this.f30866R.m7969i() + i, getMeasuredHeight());
    }

    public final void m8412V1() {
        if (!this.f30871W) {
            this.f30871W = true;
            m8408Z1();
            invalidate();
            m8411W1(this.f30870V);
        }
    }

    public final void m8411W1(C4695l6 l6Var) {
        C4695l6 l6Var2 = this.f30870V;
        if (l6Var2 != null) {
            l6Var2.equals(l6Var);
        }
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28261c(this, f, f2);
    }

    public void m8410X1(final C4695l6 l6Var) {
        setRecord(l6Var);
        setDuration(l6Var.m26473c());
        C4383l.m28061a().m28060b(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC9530e4.this.m8413U1(l6Var);
            }
        });
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m8414T1(C4695l6 l6Var, byte[] bArr) {
        C4695l6 l6Var2 = this.f30870V;
        if (l6Var2 != null && l6Var2.equals(l6Var)) {
            l6Var.m26468h(bArr);
            this.f30866R.m7964n(bArr);
            this.f30872a0.m29543l(0.0f);
            this.f30872a0.m29555F(80L);
            this.f30872a0.m29546i(1.0f);
            this.f30871W = false;
            invalidate();
        }
    }

    public final boolean m8408Z1() {
        int i = (int) (this.f30874c0 * (this.f30871W ? this.f30873b0 : 1.0f));
        if (this.f30875d0 == i) {
            return false;
        }
        this.f30875d0 = i;
        this.f30876e0 = C1363c0.m37436h(i);
        invalidate();
        return true;
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28258f(this, view, f, f2);
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28259e(this, view, f, f2);
    }

    @Override
    public void mo1989g1(int i, boolean z, boolean z2) {
        C4695l6 l6Var = this.f30870V;
        if (l6Var != null && l6Var.m26471e() == i && !z && !this.f30877f0 && !this.f30869U) {
            this.f30873b0 = 1.0f;
            m8408Z1();
            invalidate();
        }
    }

    public float getCollapse() {
        return this.f30878g0;
    }

    public float getExpand() {
        return this.f30866R.m7971g();
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28262b(this);
    }

    public C4695l6 getRecord() {
        C4695l6 l6Var = this.f30870V;
        setRecord(null);
        return l6Var;
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        C9626o4 o4Var = this.f30866R;
        if (!(o4Var == null || this.f30870V == null)) {
            int i = this.f30864P;
            if (f >= i && f < i + o4Var.m7969i()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28257g(this, view, f, f2);
    }

    @Override
    public void onClick(View view) {
        AbstractC9533c cVar;
        if (view.getId() == R.id.btn_discard_record && (cVar = this.f30865Q) != null) {
            cVar.mo8407M6();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = (int) (getMeasuredHeight() * 0.5f);
        if (this.f30876e0 != null) {
            this.f30861M.setColor(C11524j.m217S0());
            canvas.drawText(this.f30876e0, measuredWidth - this.f30863O, this.f30862N + measuredHeight, this.f30861M);
        }
        this.f30866R.m7972f(canvas, !this.f30871W ? 1.0f : this.f30873b0, this.f30864P, measuredHeight);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != 0) {
            this.f30866R.m7968j(m8421J1());
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f30877f0 = false;
            if (C4403w.m27986G2()) {
                if (motionEvent.getX() > getMeasuredWidth()) {
                    return false;
                }
            } else if (motionEvent.getX() < ((RelativeLayout.LayoutParams) getLayoutParams()).leftMargin) {
                return false;
            }
        }
        return this.f30868T.m28248e(this, motionEvent);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28255i(this, view, f, f2);
    }

    public void setCallback(AbstractC9533c cVar) {
        this.f30865Q = cVar;
    }

    public void setCollapse(float f) {
        if (this.f30878g0 != f) {
            this.f30878g0 = f;
            C9626o4 o4Var = this.f30866R;
            if (o4Var != null) {
                o4Var.m7963o(1.0f - f30860i0.getInterpolation(f));
                m8416Q1();
            }
        }
    }

    public void setDuration(int i) {
        if (this.f30874c0 != i) {
            this.f30874c0 = i;
            m8408Z1();
        }
    }

    public void setExpand(float f) {
        this.f30866R.m7963o(f);
        m8416Q1();
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return C4335b.m28253k(this, view, f, f2);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28254j(this, view, motionEvent, f, f2, f3, f4);
    }
}
