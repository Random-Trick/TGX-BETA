package vc;

import ae.j;
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
import ce.a0;
import ce.c0;
import ce.j0;
import ce.o;
import ce.p0;
import eb.k;
import gb.c;
import gd.l;
import gd.w;
import hd.l6;
import kd.j1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.N;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.d;
import yd.g;
import zd.r1;

public class d4 extends FrameLayoutFix implements View.OnClickListener, r1.a, c.a, k.b {
    public static final AnticipateOvershootInterpolator f24899i0 = new AnticipateOvershootInterpolator(3.0f);
    public Paint M;
    public c Q;
    public ImageView S;
    public boolean U;
    public l6 V;
    public boolean W;
    public float f24901b0;
    public String f24904e0;
    public boolean f24905f0;
    public float f24906g0;
    public ValueAnimator f24907h0;
    public final k f24900a0 = new k(0, this, f24899i0, 350);
    public int f24902c0 = -1;
    public int f24903d0 = -1;
    public int N = a0.i(5.0f);
    public int O = a0.i(39.0f);
    public int P = a0.i(66.0f);
    public gb.c T = new gb.c(this);
    public n4 R = new n4(null, 1, false);

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            d4.this.f24907h0 = null;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            d4.this.setVisibility(8);
        }
    }

    public interface c {
        void J6();
    }

    public d4(Context context) {
        super(context);
        int i10 = 5;
        Paint paint = new Paint(5);
        this.M = paint;
        paint.setTypeface(o.k());
        this.M.setTextSize(a0.i(15.0f));
        ImageView imageView = new ImageView(context);
        this.S = imageView;
        imageView.setId(R.id.btn_discard_record);
        this.S.setScaleType(ImageView.ScaleType.CENTER);
        this.S.setImageResource(R.drawable.baseline_delete_24);
        this.S.setColorFilter(j.o0());
        this.S.setOnClickListener(this);
        this.S.setLayoutParams(FrameLayoutFix.r1(a0.i(58.0f), -1, !w.G2() ? 3 : i10));
        p0.T(this.S);
        d.j(this.S);
        addView(this.S);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, a0.i(48.0f));
        layoutParams.addRule(12);
        if (w.G2()) {
            layoutParams.addRule(11);
            layoutParams.leftMargin = a0.i(55.0f);
        } else {
            layoutParams.addRule(9);
            layoutParams.rightMargin = a0.i(55.0f);
        }
        setWillNotDraw(false);
        setLayoutParams(layoutParams);
    }

    public void P1(float f10, float f11, ValueAnimator valueAnimator) {
        setCollapse(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void S1(final l6 l6Var) {
        final byte[] g10 = l6Var.g() != null ? l6Var.g() : N.getWaveform(l6Var.f());
        if (g10 != null) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    d4.this.R1(l6Var, g10);
                }
            });
        }
    }

    private void setRecord(l6 l6Var) {
        l6 l6Var2 = this.V;
        if (l6Var2 != l6Var) {
            if (l6Var2 != null) {
                r1.a().c(this.V.b().b(), this);
            }
            this.V = l6Var;
            if (l6Var != null) {
                r1.a().b(l6Var.b().b(), this);
            }
        }
    }

    @Override
    public boolean B(float f10, float f11) {
        return gb.b.d(this, f10, f11);
    }

    @Override
    public void C(View view, float f10, float f11) {
        n4 n4Var = this.R;
        if (n4Var != null && this.V != null) {
            int i10 = this.P;
            if (f10 >= i10 && f10 < i10 + n4Var.i()) {
                T1();
            }
        }
    }

    @Override
    public boolean D0(int i10) {
        return true;
    }

    public void D1(v4<?> v4Var) {
        v4Var.q8(this.S, R.id.theme_color_icon);
        v4Var.t8(this);
        g.j(this, R.id.theme_color_filling);
    }

    public void E1() {
        long j10;
        this.f24906g0 = 0.0f;
        n4 n4Var = this.R;
        if (n4Var == null || n4Var.h() == 0) {
            this.f24907h0 = null;
            j10 = 0;
        } else {
            final float collapse = getCollapse();
            final float f10 = 1.0f - collapse;
            ValueAnimator b10 = db.b.b();
            this.f24907h0 = b10;
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    d4.this.P1(collapse, f10, valueAnimator);
                }
            });
            this.f24907h0.setDuration(350L);
            this.f24907h0.setInterpolator(db.b.f7290e);
            this.f24907h0.addListener(new a());
            j10 = 200;
        }
        p0.g(this, 0.0f, 150L, j10, db.b.f7287b, new b());
        ValueAnimator valueAnimator = this.f24907h0;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override
    public boolean E4() {
        return gb.b.a(this);
    }

    @Override
    public void G(View view, float f10, float f11) {
        gb.b.h(this, view, f10, f11);
    }

    public final int G1() {
        return ((getMeasuredWidth() - this.P) - a0.i(110.0f)) + a0.i(55.0f);
    }

    public void H1() {
        ValueAnimator valueAnimator = this.f24907h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f24907h0 = null;
        }
        p0.k(this);
    }

    public void I1() {
        K1();
        this.U = false;
        this.f24901b0 = 0.0f;
        this.W = false;
        this.R.n(null);
        invalidate();
    }

    public void K1() {
        if (this.V != null) {
            j1.y().r(this.V);
            setRecord(null);
        }
    }

    public void L1() {
        this.U = true;
    }

    public final void O1() {
        int i10 = this.P;
        invalidate(i10, 0, this.R.i() + i10, getMeasuredHeight());
    }

    public final void T1() {
        if (!this.W) {
            this.W = true;
            Y1();
            invalidate();
            V1(this.V);
        }
    }

    @Override
    public void U2(View view, float f10, float f11) {
        gb.b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        gb.b.f(this, view, f10, f11);
    }

    public final void V1(l6 l6Var) {
        l6 l6Var2 = this.V;
        if (l6Var2 != null) {
            l6Var2.equals(l6Var);
        }
    }

    public void W1(final l6 l6Var) {
        setRecord(l6Var);
        setDuration(l6Var.c());
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                d4.this.S1(l6Var);
            }
        });
    }

    public final void R1(l6 l6Var, byte[] bArr) {
        l6 l6Var2 = this.V;
        if (l6Var2 != null && l6Var2.equals(l6Var)) {
            l6Var.h(bArr);
            this.R.n(bArr);
            this.f24900a0.l(0.0f);
            this.f24900a0.F(80L);
            this.f24900a0.i(1.0f);
            this.W = false;
            invalidate();
        }
    }

    @Override
    public boolean X6(float f10, float f11) {
        return gb.b.c(this, f10, f11);
    }

    public final boolean Y1() {
        int i10 = (int) (this.f24902c0 * (this.W ? this.f24901b0 : 1.0f));
        if (this.f24903d0 == i10) {
            return false;
        }
        this.f24903d0 = i10;
        this.f24904e0 = c0.h(i10);
        invalidate();
        return true;
    }

    @Override
    public void e1(int i10, boolean z10, boolean z11) {
        l6 l6Var = this.V;
        if (l6Var != null && l6Var.e() == i10 && !z10 && !this.f24905f0 && !this.U) {
            this.f24901b0 = 1.0f;
            Y1();
            invalidate();
        }
    }

    public float getCollapse() {
        return this.f24906g0;
    }

    public float getExpand() {
        return this.R.g();
    }

    @Override
    public long getLongPressDuration() {
        return gb.b.b(this);
    }

    public l6 getRecord() {
        l6 l6Var = this.V;
        setRecord(null);
        return l6Var;
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        n4 n4Var = this.R;
        if (!(n4Var == null || this.V == null)) {
            int i10 = this.P;
            if (f10 >= i10 && f10 < i10 + n4Var.i()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        setExpand(f10);
    }

    @Override
    public void o(View view, float f10, float f11) {
        gb.b.i(this, view, f10, f11);
    }

    @Override
    public void o2(View view, float f10, float f11) {
        gb.b.g(this, view, f10, f11);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onClick(View view) {
        c cVar;
        if (view.getId() == R.id.btn_discard_record && (cVar = this.Q) != null) {
            cVar.J6();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = (int) (getMeasuredHeight() * 0.5f);
        if (this.f24904e0 != null) {
            this.M.setColor(j.P0());
            canvas.drawText(this.f24904e0, measuredWidth - this.O, this.N + measuredHeight, this.M);
        }
        this.R.f(canvas, !this.W ? 1.0f : this.f24901b0, this.P, measuredHeight);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() != 0) {
            this.R.j(G1());
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f24905f0 = false;
            if (w.G2()) {
                if (motionEvent.getX() > getMeasuredWidth()) {
                    return false;
                }
            } else if (motionEvent.getX() < ((RelativeLayout.LayoutParams) getLayoutParams()).leftMargin) {
                return false;
            }
        }
        return this.T.e(this, motionEvent);
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        return gb.b.k(this, view, f10, f11);
    }

    public void setCallback(c cVar) {
        this.Q = cVar;
    }

    public void setCollapse(float f10) {
        if (this.f24906g0 != f10) {
            this.f24906g0 = f10;
            n4 n4Var = this.R;
            if (n4Var != null) {
                n4Var.o(1.0f - f24899i0.getInterpolation(f10));
                O1();
            }
        }
    }

    public void setDuration(int i10) {
        if (this.f24902c0 != i10) {
            this.f24902c0 = i10;
            Y1();
        }
    }

    public void setExpand(float f10) {
        this.R.o(f10);
        O1();
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        gb.b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
