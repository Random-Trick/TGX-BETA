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
    public boolean f28435A0;
    public ValueAnimator f28436B0;
    public int f28437C0;
    public boolean f28438D0;
    public boolean f28439E0;
    public int f28440F0;
    public int f28441G0;
    public boolean f28442H0;
    public final View$OnClickListenerC8851y1 f28443n0;
    public final int f28444o0;
    public String f28445p0;
    public int f28446q0;
    public int f28447r0;
    public int f28448s0;
    public int f28449t0;
    public boolean f28450u0;
    public GestureDetector$OnGestureListenerC8741d1 f28451v0;
    public View f28452w0;
    public C8817p f28453x0;
    public C6860d1 f28454y0;
    public boolean f28455z0;

    public class C8810a extends RecyclerView.AbstractC0901o {
        public C8810a() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int k0 = recyclerView.m39424k0(view);
            if (k0 == -1 || AbstractC8809o.this.f28453x0.getAdapter() == null || k0 != AbstractC8809o.this.f28453x0.getAdapter().mo6153D() - 1 || AbstractC8809o.this.f28443n0.getCounterFactor() != 1.0f) {
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
            oVar.f28451v0.removeView(oVar.f28452w0);
            AbstractC8809o.this.f28452w0 = null;
        }
    }

    public class C8813d extends AnimatorListenerAdapter {
        public final Runnable f28459a;

        public C8813d(Runnable runnable) {
            this.f28459a = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AbstractC8809o oVar = AbstractC8809o.this;
            oVar.f28451v0.removeView(oVar.f28452w0);
            AbstractC8809o.this.f28452w0 = null;
            Runnable runnable = this.f28459a;
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
            AbstractC8809o.this.f28435A0 = false;
        }
    }

    public AbstractC8809o(View$OnClickListenerC8851y1 y1Var, int i) {
        super(y1Var.getContext(), y1Var.m11108v3());
        this.f28444o0 = i;
        this.f28445p0 = "";
        this.f28443n0 = y1Var;
        m11326Jf();
    }

    public static int m11331Df() {
        return C1357a0.m37547f() - View$OnClickListenerC9170d1.getTopOffset();
    }

    public void m11322Nf(float f, float f2, ValueAnimator valueAnimator) {
        if (this.f28435A0) {
            m11290ig(Math.round(f + (f2 * C2057b.m35738a(valueAnimator))), true);
        }
    }

    public void m11319Pf(float f, float f2, ValueAnimator valueAnimator) {
        m11302af(Math.round(f + (f2 * C2057b.m35738a(valueAnimator))));
    }

    public void m11317Qf(ValueAnimator valueAnimator) {
        this.f28452w0.setAlpha(1.0f - C2057b.m35738a(valueAnimator));
    }

    public void m11315Rf(ValueAnimator valueAnimator) {
        float a = C2057b.m35738a(valueAnimator);
        if (a <= 0.5f) {
            this.f28452w0.setAlpha(1.0f - C2057b.f7280b.getInterpolation(a / 0.5f));
            return;
        }
        if (this.f28452w0.getAlpha() != 0.0f) {
            this.f28452w0.setAlpha(0.0f);
        }
        this.f28454y0.setAlpha(C2057b.f7280b.getInterpolation((a - 0.5f) / 0.5f));
    }

    public static int m11272vf() {
        return m11331Df();
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    public int mo11334Af() {
        return 0;
    }

    public int m11333Bf() {
        int X1;
        if (this.f28453x0 == null) {
            return 0;
        }
        RecyclerView.AbstractC0902p uf = m11273uf();
        if (!(uf instanceof LinearLayoutManager)) {
            return 0;
        }
        RecyclerView.AbstractC0890h adapter = this.f28453x0.getAdapter();
        if (!(adapter instanceof AbstractC8749f) || (X1 = ((LinearLayoutManager) uf).m39552X1()) == -1) {
            return 0;
        }
        int r = ((AbstractC8749f) adapter).mo11421r(X1);
        View C = uf.mo39265C(X1);
        return C != null ? r - C.getTop() : r;
    }

    public final int m11332Cf() {
        return this.f28447r0;
    }

    public boolean m11330Ef(boolean z) {
        if (!this.f28438D0) {
            return false;
        }
        this.f28438D0 = false;
        this.f28439E0 = false;
        float vf = this.f28448s0 < this.f28447r0 ? 0.0f : 1.0f - ((m11272vf() - this.f28448s0) / (m11272vf() - this.f28447r0));
        this.f28443n0.m11138e3();
        if (z) {
            if (mo406cf()) {
                m11304Ze(m11272vf(), true);
            } else {
                m11304Ze(this.f28447r0, true);
            }
        } else if (vf >= 0.2f || !mo11215df()) {
            m11304Ze(this.f28447r0, false);
        } else {
            this.f28439E0 = true;
            int i = this.f28448s0;
            this.f28440F0 = i;
            this.f28441G0 = -i;
            this.f28443n0.m11109v2();
        }
        return true;
    }

    public void m11329Ff() {
        C6860d1 d1Var = this.f28454y0;
        if (d1Var != null) {
            d1Var.setAlpha(0.0f);
        }
    }

    public void m11328Gf() {
        m11327Hf(null);
    }

    public void m11327Hf(Runnable runnable) {
        if (this.f28452w0 != null) {
            ValueAnimator b = C2057b.m35737b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC8809o.this.m11317Qf(valueAnimator);
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

    public final void m11326Jf() {
        this.f28446q0 = mo401tf();
        m11295fg(true);
    }

    public boolean m11325Kf() {
        return this.f28435A0 || this.f28439E0;
    }

    @Override
    public final int mo9398L9() {
        return R.id.theme_color_filling;
    }

    public boolean m11324Lf() {
        return this.f28448s0 == m11272vf();
    }

    public boolean m11323Mf(float f, float f2) {
        return f2 >= this.f28453x0.getTranslationY() && f2 <= this.f28453x0.getTranslationY() + ((float) this.f28453x0.getMeasuredHeight());
    }

    @Override
    public final int mo9375O9() {
        return R.id.theme_color_headerLightIcon;
    }

    @Override
    public final int mo9360Q9() {
        return R.id.theme_color_text;
    }

    public boolean m11313Sf(float f) {
        int vf = mo406cf() ? m11272vf() : this.f28447r0;
        int min = Math.min(vf, this.f28437C0 - ((int) f));
        if (min < this.f28447r0 && !mo11215df()) {
            return false;
        }
        if (this.f28448s0 == min) {
            return min == vf;
        }
        if (!this.f28442H0 && min > this.f28447r0) {
            this.f28442H0 = true;
            mo11303Zf();
        }
        if (this.f28448s0 > this.f28447r0) {
            this.f28443n0.m11138e3();
        }
        m11290ig(min, true);
        return min == vf;
    }

    public void m11311Tf() {
        this.f28439E0 = false;
    }

    public void m11309Uf(float f) {
        if (this.f28439E0) {
            m11290ig(this.f28440F0 + ((int) (this.f28441G0 * f)), false);
        }
    }

    public void m11307Vf(boolean z) {
        if (z) {
            this.f28439E0 = true;
            int i = this.f28448s0;
            this.f28440F0 = i;
            this.f28441G0 = -i;
        }
    }

    public void mo11231Wf() {
    }

    @Override
    public CharSequence mo9313X9() {
        int i = this.f28444o0;
        return i != 0 ? C4403w.m27871i1(i) : this.f28445p0;
    }

    public void mo11229Xe(List<View$OnTouchListenerC5103c0.C5104a> list) {
    }

    public void mo11228Xf(boolean z) {
    }

    public final void m11305Ye(RecyclerView.AbstractC0901o oVar) {
        this.f28453x0.m39437g(oVar);
    }

    public void mo11225Yf(TdApi.MessageSendOptions messageSendOptions, boolean z) {
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C8817p pVar = this.f28453x0;
        if (pVar != null) {
            C1399s0.m37165q(pVar);
        }
    }

    public void m11304Ze(int i, boolean z) {
        if (this.f28435A0) {
            this.f28435A0 = false;
            ValueAnimator valueAnimator = this.f28436B0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f28436B0 = null;
            }
        }
        int i2 = this.f28448s0;
        if (i2 != i) {
            this.f28435A0 = true;
            final float f = i2;
            final float f2 = i - f;
            ValueAnimator b = C2057b.m35737b();
            this.f28436B0 = b;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AbstractC8809o.this.m11322Nf(f, f2, valueAnimator2);
                }
            });
            this.f28436B0.addListener(new C8814e());
            this.f28436B0.setInterpolator(C2057b.f7280b);
            this.f28436B0.setDuration(z ? 150L : 220L);
            this.f28436B0.start();
        }
    }

    public void mo11303Zf() {
    }

    public final void m11302af(int i) {
        if (this.f28447r0 != i) {
            this.f28448s0 = i;
            this.f28447r0 = i;
            m11277qg();
            this.f28443n0.m11153V2();
        }
    }

    public void m11301ag() {
        if (this.f28438D0) {
            this.f28438D0 = false;
            this.f28439E0 = false;
            int i = this.f28448s0;
            int i2 = this.f28447r0;
            float f = i >= i2 ? 1.0f : i / i2;
            float vf = i < i2 ? 0.0f : 1.0f - ((m11272vf() - this.f28448s0) / (m11272vf() - this.f28447r0));
            this.f28443n0.m11138e3();
            if (f <= 0.45f && !this.f28450u0) {
                this.f28439E0 = true;
                int i3 = this.f28448s0;
                this.f28440F0 = i3;
                this.f28441G0 = -i3;
                this.f28443n0.m11109v2();
            } else if (vf < 0.35f || !this.f28450u0) {
                m11304Ze(this.f28447r0, false);
            } else {
                m11304Ze(m11272vf(), true);
            }
        }
    }

    public final GestureDetector$OnGestureListenerC8741d1 m11300bf(boolean z) {
        GestureDetector$OnGestureListenerC8741d1 d1Var = new GestureDetector$OnGestureListenerC8741d1(mo4347s());
        this.f28451v0 = d1Var;
        d1Var.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f28451v0.setBoundController(this);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -1);
        s1.topMargin = View$OnClickListenerC9170d1.m10065c3(false);
        s1.bottomMargin = View$OnClickListenerC9170d1.getTopOffset();
        C8817p pVar = new C8817p(mo4347s());
        this.f28453x0 = pVar;
        pVar.m39437g(new C8810a());
        this.f28453x0.setOverScrollMode(2);
        C10192g.m5781j(this.f28453x0, mo11191zf());
        m9163t8(this.f28453x0);
        this.f28453x0.setItemAnimator(new C8731d(C2057b.f7280b, 150L));
        this.f28453x0.setLayoutParams(s1);
        this.f28453x0.m39425k(new C8811b());
        this.f28451v0.addView(this.f28453x0);
        if (z) {
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37544i(48.0f), C1357a0.m37544i(48.0f), 49);
            t1.topMargin = View$OnClickListenerC9170d1.m10065c3(false);
            View v0 = C1399s0.m37154v0(mo4347s(), t1);
            this.f28452w0 = v0;
            v0.setTranslationY(m11283mf(C1357a0.m37544i(48.0f)));
            this.f28451v0.addView(this.f28452w0);
        }
        m11277qg();
        return this.f28451v0;
    }

    public void m11299bg() {
        this.f28437C0 = this.f28448s0;
        this.f28438D0 = true;
    }

    public boolean mo406cf() {
        return true;
    }

    public void mo11298cg(float f) {
        View view = this.f28452w0;
        if (view != null) {
            view.setTranslationY(m11283mf(view.getLayoutParams().height));
        }
        C6860d1 d1Var = this.f28454y0;
        if (d1Var != null) {
            d1Var.setTranslationY(m11283mf(C1357a0.m37544i(18.0f)));
        }
    }

    public boolean mo11215df() {
        return true;
    }

    public void mo11214dg(int i, int i2) {
        if (this.f28453x0 != null) {
            m11295fg(false);
            m11275rg(i2);
        }
    }

    public boolean mo11297ef() {
        return !m9366Pa();
    }

    public void mo11212eg(Runnable runnable, long j) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean m11296ff() {
        return false;
    }

    public final void m11295fg(boolean z) {
        this.f28447r0 = Math.min(this.f28446q0 + m11280of() + View$OnClickListenerC9170d1.m10065c3(false), Math.min(m11270xf(), m11272vf()));
        m11290ig((m11333Bf() > 0 || this.f28455z0) ? m11272vf() : this.f28447r0, !z);
    }

    public void m11294gf() {
        int Bf = m11333Bf();
        if (Bf != 0) {
            this.f28453x0.mo8024v1(0, -Bf);
        }
        m11304Ze(this.f28447r0, false);
    }

    public final void m11293gg() {
    }

    public ViewGroup mo405hf() {
        return null;
    }

    public final void m11292hg(RecyclerView.AbstractC0890h<?> hVar) {
        this.f28453x0.setAdapter(hVar);
    }

    public final void m11291if(final String str, final boolean z) {
        m9151ud(new Runnable() {
            @Override
            public final void run() {
                AbstractC8809o.this.m11321Of(str, z);
            }
        });
    }

    public final void m11290ig(int i, boolean z) {
        if (this.f28448s0 != i) {
            this.f28448s0 = i;
            int vf = m11272vf();
            boolean z2 = true;
            this.f28455z0 = i == vf;
            if (Math.abs(i - this.f28449t0) >= C1357a0.m37537p()) {
                this.f28450u0 = i > this.f28449t0;
                this.f28449t0 = i;
            }
            m11277qg();
            View$OnClickListenerC8851y1 y1Var = this.f28443n0;
            if (this.f28448s0 >= vf) {
                z2 = false;
            }
            y1Var.setContentVisible(z2);
            if (z) {
                int i2 = this.f28448s0;
                int i3 = this.f28447r0;
                if (i2 == i3) {
                    this.f28443n0.setBottomBarFactor(1.0f);
                    this.f28443n0.setHeaderFactor(0.0f);
                } else if (i2 < i3) {
                    this.f28443n0.setBottomBarFactor(i2 / i3);
                    this.f28443n0.setHeaderFactor(0.0f);
                } else {
                    float vf2 = (m11272vf() - this.f28448s0) / (vf - this.f28447r0);
                    this.f28443n0.setBottomBarFactor(vf2);
                    this.f28443n0.setHeaderFactor(1.0f - vf2);
                }
            }
        }
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (!m9382Na()) {
            return false;
        }
        this.f28443n0.getHeaderView().m10029t2(true, null);
        return true;
    }

    public void m11289jf(MotionEvent motionEvent) {
        this.f28453x0.m11268G1(motionEvent);
    }

    public final void m11288jg(RecyclerView.AbstractC0902p pVar) {
        this.f28453x0.setLayoutManager(pVar);
    }

    public void m11287kf() {
        this.f28443n0.m11138e3();
        m11304Ze(m11272vf(), false);
    }

    public void m11286kg(String str) {
        this.f28445p0 = str;
        this.f28443n0.getHeaderView().setTitle(this);
    }

    public void m11285lf(AbstractC8749f fVar) {
        this.f28446q0 = fVar.mo11420v(-1);
        int xf = m11270xf();
        int i = this.f28447r0;
        if (xf > i) {
            if (this.f28438D0 || this.f28435A0 || this.f28448s0 > i) {
                this.f28447r0 = xf;
                return;
            }
            final float f = i;
            final float f2 = xf - i;
            ValueAnimator b = C2057b.m35737b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC8809o.this.m11319Pf(f, f2, valueAnimator);
                }
            });
            b.setInterpolator(C2057b.f7280b);
            b.setDuration(150L);
            b.start();
        }
    }

    public final void m11284lg(int i, boolean z) {
        m11321Of(C4403w.m27871i1(i), z);
    }

    public final int m11283mf(int i) {
        return (((((int) this.f28453x0.getTranslationY()) + mo11334Af()) + ((Math.max(this.f28447r0, m11276rf()) - mo11334Af()) / 2)) - m11280of()) - (i / 2);
    }

    public void m11321Of(String str, boolean z) {
        if (this.f28454y0 == null) {
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, 49);
            t1.topMargin = View$OnClickListenerC9170d1.m10065c3(false);
            C6860d1 d1Var = new C6860d1(mo4347s());
            this.f28454y0 = d1Var;
            d1Var.setLayoutParams(t1);
            this.f28454y0.setTranslationY(m11283mf(C1357a0.m37544i(18.0f)));
            this.f28451v0.addView(this.f28454y0);
        } else {
            z = false;
        }
        this.f28454y0.setText(str);
        if (!z || this.f28452w0 == null) {
            this.f28454y0.setAlpha(1.0f);
            return;
        }
        this.f28454y0.setAlpha(0.0f);
        ValueAnimator b = C2057b.m35737b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AbstractC8809o.this.m11315Rf(valueAnimator);
            }
        });
        b.addListener(new C8812c());
        b.setDuration(300L);
        b.start();
    }

    public void m11281nf() {
        RecyclerView.AbstractC0902p uf = m11273uf();
        if (uf != null && (uf instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) uf).m39525z2(0, 0);
        }
    }

    public boolean mo11203ng(boolean z) {
        return false;
    }

    public final int m11280of() {
        if (this.f28443n0.m11105x2()) {
            return 0;
        }
        return GestureDetector$OnGestureListenerC8768h.getBarHeight();
    }

    public boolean mo11202og() {
        return false;
    }

    public int mo11267pf() {
        return TdApi.ChatActionCancel.CONSTRUCTOR;
    }

    public void m11279pg() {
        this.f28453x0.m39507A0();
    }

    public final int m11278qf() {
        return this.f28446q0;
    }

    public final void m11277qg() {
        GestureDetector$OnGestureListenerC8741d1 d1Var = this.f28451v0;
        if (d1Var != null) {
            int measuredHeight = d1Var.getMeasuredHeight();
            if (measuredHeight == 0) {
                measuredHeight = m11331Df();
            }
            m11275rg(measuredHeight);
        }
    }

    public final int m11276rf() {
        return this.f28448s0;
    }

    public final void m11275rg(int i) {
        C8817p pVar = this.f28453x0;
        if (pVar != null) {
            float f = i - this.f28448s0;
            pVar.setTranslationY(f);
            mo11298cg(f);
        }
    }

    public final int m11274sf() {
        return this.f28443n0.getCurrentContentWidth();
    }

    public int mo401tf() {
        return m11271wf();
    }

    public final RecyclerView.AbstractC0902p m11273uf() {
        return this.f28453x0.getLayoutManager();
    }

    public final int m11271wf() {
        return C1357a0.m37556B() - View$OnClickListenerC9170d1.m10065c3(false);
    }

    public final int m11270xf() {
        if (mo514If()) {
            return Integer.MAX_VALUE;
        }
        return Math.min(m11278qf() + m11280of() + View$OnClickListenerC9170d1.m10065c3(false), Math.min(m11274sf() + m11280of(), m11269yf()));
    }

    public int m11269yf() {
        if (mo514If()) {
            return Integer.MAX_VALUE;
        }
        return m11272vf() - (GestureDetector$OnGestureListenerC8768h.getBarHeight() / 4);
    }

    public int mo11191zf() {
        return R.id.theme_color_filling;
    }

    public AbstractC8809o(View$OnClickListenerC8851y1 y1Var, String str) {
        super(y1Var.getContext(), y1Var.m11108v3());
        this.f28444o0 = 0;
        this.f28445p0 = str;
        this.f28443n0 = y1Var;
        m11326Jf();
    }
}
