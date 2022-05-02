package sc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1399s0;
import java.util.List;
import me.C6860d1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p082fd.C4403w;
import p111he.View$OnTouchListenerC5103c0;
import p335xd.C10192g;
import td.AbstractC9323v4;
import td.View$OnClickListenerC9170d1;

public abstract class AbstractC8809o<T> extends AbstractC9323v4<T> {
    public boolean f28432A0;
    public ValueAnimator f28433B0;
    public int f28434C0;
    public boolean f28435D0;
    public boolean f28436E0;
    public int f28437F0;
    public int f28438G0;
    public boolean f28439H0;
    public final View$OnClickListenerC8851y1 f28440n0;
    public final int f28441o0;
    public String f28442p0;
    public int f28443q0;
    public int f28444r0;
    public int f28445s0;
    public int f28446t0;
    public boolean f28447u0;
    public GestureDetector$OnGestureListenerC8741d1 f28448v0;
    public View f28449w0;
    public C8817p f28450x0;
    public C6860d1 f28451y0;
    public boolean f28452z0;

    public class C8810a extends RecyclerView.AbstractC0901o {
        public C8810a() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int k0 = recyclerView.m39421k0(view);
            if (k0 == -1 || AbstractC8809o.this.f28450x0.getAdapter() == null || k0 != AbstractC8809o.this.f28450x0.getAdapter().mo6153D() - 1 || AbstractC8809o.this.f28440n0.getCounterFactor() != 1.0f) {
                rect.setEmpty();
            } else {
                rect.set(0, 0, 0, GestureDetector$OnGestureListenerC8768h.getBarHeight());
            }
        }
    }

    public class C8811b extends RecyclerView.AbstractC0910t {
        public C8811b() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (i != 0) {
                AbstractC8809o.this.mo9397La();
            }
        }
    }

    public class C8812c extends AnimatorListenerAdapter {
        public C8812c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AbstractC8809o oVar = AbstractC8809o.this;
            oVar.f28448v0.removeView(oVar.f28449w0);
            AbstractC8809o.this.f28449w0 = null;
        }
    }

    public class C8813d extends AnimatorListenerAdapter {
        public final Runnable f28456a;

        public C8813d(Runnable runnable) {
            this.f28456a = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AbstractC8809o oVar = AbstractC8809o.this;
            oVar.f28448v0.removeView(oVar.f28449w0);
            AbstractC8809o.this.f28449w0 = null;
            Runnable runnable = this.f28456a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public class C8814e extends AnimatorListenerAdapter {
        public C8814e() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AbstractC8809o.this.f28432A0 = false;
        }
    }

    public AbstractC8809o(View$OnClickListenerC8851y1 y1Var, int i) {
        super(y1Var.getContext(), y1Var.m11109v3());
        this.f28441o0 = i;
        this.f28442p0 = "";
        this.f28440n0 = y1Var;
        m11327Jf();
    }

    public static int m11332Df() {
        return C1357a0.m37544f() - View$OnClickListenerC9170d1.getTopOffset();
    }

    public void m11323Nf(float f, float f2, ValueAnimator valueAnimator) {
        if (this.f28432A0) {
            m11291ig(Math.round(f + (f2 * C2057b.m35735a(valueAnimator))), true);
        }
    }

    public void m11320Pf(float f, float f2, ValueAnimator valueAnimator) {
        m11303af(Math.round(f + (f2 * C2057b.m35735a(valueAnimator))));
    }

    public void m11318Qf(ValueAnimator valueAnimator) {
        this.f28449w0.setAlpha(1.0f - C2057b.m35735a(valueAnimator));
    }

    public void m11316Rf(ValueAnimator valueAnimator) {
        float a = C2057b.m35735a(valueAnimator);
        if (a <= 0.5f) {
            this.f28449w0.setAlpha(1.0f - C2057b.f7280b.getInterpolation(a / 0.5f));
            return;
        }
        if (this.f28449w0.getAlpha() != 0.0f) {
            this.f28449w0.setAlpha(0.0f);
        }
        this.f28451y0.setAlpha(C2057b.f7280b.getInterpolation((a - 0.5f) / 0.5f));
    }

    public static int m11273vf() {
        return m11332Df();
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    public int mo11335Af() {
        return 0;
    }

    public int m11334Bf() {
        int X1;
        if (this.f28450x0 == null) {
            return 0;
        }
        RecyclerView.AbstractC0902p uf = m11274uf();
        if (!(uf instanceof LinearLayoutManager)) {
            return 0;
        }
        RecyclerView.AbstractC0890h adapter = this.f28450x0.getAdapter();
        if (!(adapter instanceof AbstractC8749f) || (X1 = ((LinearLayoutManager) uf).m39549X1()) == -1) {
            return 0;
        }
        int r = ((AbstractC8749f) adapter).mo11422r(X1);
        View C = uf.mo39262C(X1);
        return C != null ? r - C.getTop() : r;
    }

    public final int m11333Cf() {
        return this.f28444r0;
    }

    public boolean m11331Ef(boolean z) {
        if (!this.f28435D0) {
            return false;
        }
        this.f28435D0 = false;
        this.f28436E0 = false;
        float vf = this.f28445s0 < this.f28444r0 ? 0.0f : 1.0f - ((m11273vf() - this.f28445s0) / (m11273vf() - this.f28444r0));
        this.f28440n0.m11139e3();
        if (z) {
            if (mo406cf()) {
                m11305Ze(m11273vf(), true);
            } else {
                m11305Ze(this.f28444r0, true);
            }
        } else if (vf >= 0.2f || !mo11216df()) {
            m11305Ze(this.f28444r0, false);
        } else {
            this.f28436E0 = true;
            int i = this.f28445s0;
            this.f28437F0 = i;
            this.f28438G0 = -i;
            this.f28440n0.m11110v2();
        }
        return true;
    }

    public void m11330Ff() {
        C6860d1 d1Var = this.f28451y0;
        if (d1Var != null) {
            d1Var.setAlpha(0.0f);
        }
    }

    public void m11329Gf() {
        m11328Hf(null);
    }

    public void m11328Hf(Runnable runnable) {
        if (this.f28449w0 != null) {
            ValueAnimator b = C2057b.m35734b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC8809o.this.m11318Qf(valueAnimator);
                }
            });
            b.addListener(new C8813d(runnable));
            b.setInterpolator(C2057b.f7280b);
            b.setDuration(140L);
            b.start();
        }
    }

    public boolean mo514If() {
        return false;
    }

    @Override
    public boolean mo9409Je() {
        return true;
    }

    public final void m11327Jf() {
        this.f28443q0 = mo401tf();
        m11296fg(true);
    }

    public boolean m11326Kf() {
        return this.f28432A0 || this.f28436E0;
    }

    @Override
    public final int mo9398L9() {
        return R.id.theme_color_filling;
    }

    public boolean m11325Lf() {
        return this.f28445s0 == m11273vf();
    }

    public boolean m11324Mf(float f, float f2) {
        return f2 >= this.f28450x0.getTranslationY() && f2 <= this.f28450x0.getTranslationY() + ((float) this.f28450x0.getMeasuredHeight());
    }

    @Override
    public final int mo9375O9() {
        return R.id.theme_color_headerLightIcon;
    }

    @Override
    public final int mo9360Q9() {
        return R.id.theme_color_text;
    }

    public boolean m11314Sf(float f) {
        int vf = mo406cf() ? m11273vf() : this.f28444r0;
        int min = Math.min(vf, this.f28434C0 - ((int) f));
        if (min < this.f28444r0 && !mo11216df()) {
            return false;
        }
        if (this.f28445s0 == min) {
            return min == vf;
        }
        if (!this.f28439H0 && min > this.f28444r0) {
            this.f28439H0 = true;
            mo11304Zf();
        }
        if (this.f28445s0 > this.f28444r0) {
            this.f28440n0.m11139e3();
        }
        m11291ig(min, true);
        return min == vf;
    }

    public void m11312Tf() {
        this.f28436E0 = false;
    }

    public void m11310Uf(float f) {
        if (this.f28436E0) {
            m11291ig(this.f28437F0 + ((int) (this.f28438G0 * f)), false);
        }
    }

    public void m11308Vf(boolean z) {
        if (z) {
            this.f28436E0 = true;
            int i = this.f28445s0;
            this.f28437F0 = i;
            this.f28438G0 = -i;
        }
    }

    public void mo11232Wf() {
    }

    @Override
    public CharSequence mo9313X9() {
        int i = this.f28441o0;
        return i != 0 ? C4403w.m27869i1(i) : this.f28442p0;
    }

    public void mo11230Xe(List<View$OnTouchListenerC5103c0.C5104a> list) {
    }

    public void mo11229Xf(boolean z) {
    }

    public final void m11306Ye(RecyclerView.AbstractC0901o oVar) {
        this.f28450x0.m39434g(oVar);
    }

    public void mo11226Yf(TdApi.MessageSendOptions messageSendOptions, boolean z) {
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C8817p pVar = this.f28450x0;
        if (pVar != null) {
            C1399s0.m37162q(pVar);
        }
    }

    public void m11305Ze(int i, boolean z) {
        if (this.f28432A0) {
            this.f28432A0 = false;
            ValueAnimator valueAnimator = this.f28433B0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f28433B0 = null;
            }
        }
        int i2 = this.f28445s0;
        if (i2 != i) {
            this.f28432A0 = true;
            final float f = i2;
            final float f2 = i - f;
            ValueAnimator b = C2057b.m35734b();
            this.f28433B0 = b;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AbstractC8809o.this.m11323Nf(f, f2, valueAnimator2);
                }
            });
            this.f28433B0.addListener(new C8814e());
            this.f28433B0.setInterpolator(C2057b.f7280b);
            this.f28433B0.setDuration(z ? 150L : 220L);
            this.f28433B0.start();
        }
    }

    public void mo11304Zf() {
    }

    public final void m11303af(int i) {
        if (this.f28444r0 != i) {
            this.f28445s0 = i;
            this.f28444r0 = i;
            m11278qg();
            this.f28440n0.m11154V2();
        }
    }

    public void m11302ag() {
        if (this.f28435D0) {
            this.f28435D0 = false;
            this.f28436E0 = false;
            int i = this.f28445s0;
            int i2 = this.f28444r0;
            float f = i >= i2 ? 1.0f : i / i2;
            float vf = i < i2 ? 0.0f : 1.0f - ((m11273vf() - this.f28445s0) / (m11273vf() - this.f28444r0));
            this.f28440n0.m11139e3();
            if (f <= 0.45f && !this.f28447u0) {
                this.f28436E0 = true;
                int i3 = this.f28445s0;
                this.f28437F0 = i3;
                this.f28438G0 = -i3;
                this.f28440n0.m11110v2();
            } else if (vf < 0.35f || !this.f28447u0) {
                m11305Ze(this.f28444r0, false);
            } else {
                m11305Ze(m11273vf(), true);
            }
        }
    }

    public final GestureDetector$OnGestureListenerC8741d1 m11301bf(boolean z) {
        GestureDetector$OnGestureListenerC8741d1 d1Var = new GestureDetector$OnGestureListenerC8741d1(mo4347s());
        this.f28448v0 = d1Var;
        d1Var.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f28448v0.setBoundController(this);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -1);
        s1.topMargin = View$OnClickListenerC9170d1.m10066c3(false);
        s1.bottomMargin = View$OnClickListenerC9170d1.getTopOffset();
        C8817p pVar = new C8817p(mo4347s());
        this.f28450x0 = pVar;
        pVar.m39434g(new C8810a());
        this.f28450x0.setOverScrollMode(2);
        C10192g.m5781j(this.f28450x0, mo11192zf());
        m9163t8(this.f28450x0);
        this.f28450x0.setItemAnimator(new C8731d(C2057b.f7280b, 150L));
        this.f28450x0.setLayoutParams(s1);
        this.f28450x0.m39422k(new C8811b());
        this.f28448v0.addView(this.f28450x0);
        if (z) {
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37541i(48.0f), C1357a0.m37541i(48.0f), 49);
            t1.topMargin = View$OnClickListenerC9170d1.m10066c3(false);
            View v0 = C1399s0.m37151v0(mo4347s(), t1);
            this.f28449w0 = v0;
            v0.setTranslationY(m11284mf(C1357a0.m37541i(48.0f)));
            this.f28448v0.addView(this.f28449w0);
        }
        m11278qg();
        return this.f28448v0;
    }

    public void m11300bg() {
        this.f28434C0 = this.f28445s0;
        this.f28435D0 = true;
    }

    public boolean mo406cf() {
        return true;
    }

    public void mo11299cg(float f) {
        View view = this.f28449w0;
        if (view != null) {
            view.setTranslationY(m11284mf(view.getLayoutParams().height));
        }
        C6860d1 d1Var = this.f28451y0;
        if (d1Var != null) {
            d1Var.setTranslationY(m11284mf(C1357a0.m37541i(18.0f)));
        }
    }

    public boolean mo11216df() {
        return true;
    }

    public void mo11215dg(int i, int i2) {
        if (this.f28450x0 != null) {
            m11296fg(false);
            m11276rg(i2);
        }
    }

    public boolean mo11298ef() {
        return !m9366Pa();
    }

    public void mo11213eg(Runnable runnable, long j) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean m11297ff() {
        return false;
    }

    public final void m11296fg(boolean z) {
        this.f28444r0 = Math.min(this.f28443q0 + m11281of() + View$OnClickListenerC9170d1.m10066c3(false), Math.min(m11271xf(), m11273vf()));
        m11291ig((m11334Bf() > 0 || this.f28452z0) ? m11273vf() : this.f28444r0, !z);
    }

    public void m11295gf() {
        int Bf = m11334Bf();
        if (Bf != 0) {
            this.f28450x0.mo8024v1(0, -Bf);
        }
        m11305Ze(this.f28444r0, false);
    }

    public final void m11294gg() {
    }

    public ViewGroup mo405hf() {
        return null;
    }

    public final void m11293hg(RecyclerView.AbstractC0890h<?> hVar) {
        this.f28450x0.setAdapter(hVar);
    }

    public final void m11292if(final String str, final boolean z) {
        m9151ud(new Runnable() {
            @Override
            public final void run() {
                AbstractC8809o.this.m11322Of(str, z);
            }
        });
    }

    public final void m11291ig(int i, boolean z) {
        if (this.f28445s0 != i) {
            this.f28445s0 = i;
            int vf = m11273vf();
            boolean z2 = true;
            this.f28452z0 = i == vf;
            if (Math.abs(i - this.f28446t0) >= C1357a0.m37534p()) {
                this.f28447u0 = i > this.f28446t0;
                this.f28446t0 = i;
            }
            m11278qg();
            View$OnClickListenerC8851y1 y1Var = this.f28440n0;
            if (this.f28445s0 >= vf) {
                z2 = false;
            }
            y1Var.setContentVisible(z2);
            if (z) {
                int i2 = this.f28445s0;
                int i3 = this.f28444r0;
                if (i2 == i3) {
                    this.f28440n0.setBottomBarFactor(1.0f);
                    this.f28440n0.setHeaderFactor(0.0f);
                } else if (i2 < i3) {
                    this.f28440n0.setBottomBarFactor(i2 / i3);
                    this.f28440n0.setHeaderFactor(0.0f);
                } else {
                    float vf2 = (m11273vf() - this.f28445s0) / (vf - this.f28444r0);
                    this.f28440n0.setBottomBarFactor(vf2);
                    this.f28440n0.setHeaderFactor(1.0f - vf2);
                }
            }
        }
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (!m9382Na()) {
            return false;
        }
        this.f28440n0.getHeaderView().m10030t2(true, null);
        return true;
    }

    public void m11290jf(MotionEvent motionEvent) {
        this.f28450x0.m11269G1(motionEvent);
    }

    public final void m11289jg(RecyclerView.AbstractC0902p pVar) {
        this.f28450x0.setLayoutManager(pVar);
    }

    public void m11288kf() {
        this.f28440n0.m11139e3();
        m11305Ze(m11273vf(), false);
    }

    public void m11287kg(String str) {
        this.f28442p0 = str;
        this.f28440n0.getHeaderView().setTitle(this);
    }

    public void m11286lf(AbstractC8749f fVar) {
        this.f28443q0 = fVar.mo11421v(-1);
        int xf = m11271xf();
        int i = this.f28444r0;
        if (xf > i) {
            if (this.f28435D0 || this.f28432A0 || this.f28445s0 > i) {
                this.f28444r0 = xf;
                return;
            }
            final float f = i;
            final float f2 = xf - i;
            ValueAnimator b = C2057b.m35734b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC8809o.this.m11320Pf(f, f2, valueAnimator);
                }
            });
            b.setInterpolator(C2057b.f7280b);
            b.setDuration(150L);
            b.start();
        }
    }

    public final void m11285lg(int i, boolean z) {
        m11322Of(C4403w.m27869i1(i), z);
    }

    public final int m11284mf(int i) {
        return (((((int) this.f28450x0.getTranslationY()) + mo11335Af()) + ((Math.max(this.f28444r0, m11277rf()) - mo11335Af()) / 2)) - m11281of()) - (i / 2);
    }

    public void m11322Of(String str, boolean z) {
        if (this.f28451y0 == null) {
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, 49);
            t1.topMargin = View$OnClickListenerC9170d1.m10066c3(false);
            C6860d1 d1Var = new C6860d1(mo4347s());
            this.f28451y0 = d1Var;
            d1Var.setLayoutParams(t1);
            this.f28451y0.setTranslationY(m11284mf(C1357a0.m37541i(18.0f)));
            this.f28448v0.addView(this.f28451y0);
        } else {
            z = false;
        }
        this.f28451y0.setText(str);
        if (!z || this.f28449w0 == null) {
            this.f28451y0.setAlpha(1.0f);
            return;
        }
        this.f28451y0.setAlpha(0.0f);
        ValueAnimator b = C2057b.m35734b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AbstractC8809o.this.m11316Rf(valueAnimator);
            }
        });
        b.addListener(new C8812c());
        b.setDuration(300L);
        b.start();
    }

    public void m11282nf() {
        RecyclerView.AbstractC0902p uf = m11274uf();
        if (uf != null && (uf instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) uf).m39522z2(0, 0);
        }
    }

    public boolean mo11204ng(boolean z) {
        return false;
    }

    public final int m11281of() {
        if (this.f28440n0.m11106x2()) {
            return 0;
        }
        return GestureDetector$OnGestureListenerC8768h.getBarHeight();
    }

    public boolean mo11203og() {
        return false;
    }

    public int mo11268pf() {
        return TdApi.ChatActionCancel.CONSTRUCTOR;
    }

    public void m11280pg() {
        this.f28450x0.m39504A0();
    }

    public final int m11279qf() {
        return this.f28443q0;
    }

    public final void m11278qg() {
        GestureDetector$OnGestureListenerC8741d1 d1Var = this.f28448v0;
        if (d1Var != null) {
            int measuredHeight = d1Var.getMeasuredHeight();
            if (measuredHeight == 0) {
                measuredHeight = m11332Df();
            }
            m11276rg(measuredHeight);
        }
    }

    public final int m11277rf() {
        return this.f28445s0;
    }

    public final void m11276rg(int i) {
        C8817p pVar = this.f28450x0;
        if (pVar != null) {
            float f = i - this.f28445s0;
            pVar.setTranslationY(f);
            mo11299cg(f);
        }
    }

    public final int m11275sf() {
        return this.f28440n0.getCurrentContentWidth();
    }

    public int mo401tf() {
        return m11272wf();
    }

    public final RecyclerView.AbstractC0902p m11274uf() {
        return this.f28450x0.getLayoutManager();
    }

    public final int m11272wf() {
        return C1357a0.m37553B() - View$OnClickListenerC9170d1.m10066c3(false);
    }

    public final int m11271xf() {
        if (mo514If()) {
            return Integer.MAX_VALUE;
        }
        return Math.min(m11279qf() + m11281of() + View$OnClickListenerC9170d1.m10066c3(false), Math.min(m11275sf() + m11281of(), m11270yf()));
    }

    public int m11270yf() {
        if (mo514If()) {
            return Integer.MAX_VALUE;
        }
        return m11273vf() - (GestureDetector$OnGestureListenerC8768h.getBarHeight() / 4);
    }

    public int mo11192zf() {
        return R.id.theme_color_filling;
    }

    public AbstractC8809o(View$OnClickListenerC8851y1 y1Var, String str) {
        super(y1Var.getContext(), y1Var.m11109v3());
        this.f28441o0 = 0;
        this.f28442p0 = str;
        this.f28440n0 = y1Var;
        m11327Jf();
    }
}
