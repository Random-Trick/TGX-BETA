package tc;

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
import ce.a0;
import ce.p0;
import gd.w;
import ie.c0;
import java.util.List;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.d1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.g;

public abstract class o<T> extends v4<T> {
    public boolean A0;
    public ValueAnimator B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public int G0;
    public boolean H0;
    public final y1 f23267n0;
    public final int f23268o0;
    public String f23269p0;
    public int f23270q0;
    public int f23271r0;
    public int f23272s0;
    public int f23273t0;
    public boolean f23274u0;
    public d1 f23275v0;
    public View f23276w0;
    public p f23277x0;
    public d1 f23278y0;
    public boolean f23279z0;

    public class a extends RecyclerView.o {
        public a() {
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int k02 = recyclerView.k0(view);
            if (k02 == -1 || o.this.f23277x0.getAdapter() == null || k02 != o.this.f23277x0.getAdapter().D() - 1 || o.this.f23267n0.getCounterFactor() != 1.0f) {
                rect.setEmpty();
            } else {
                rect.set(0, 0, 0, h.getBarHeight());
            }
        }
    }

    public class b extends RecyclerView.t {
        public b() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 != 0) {
                o.this.La();
            }
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            o oVar = o.this;
            oVar.f23275v0.removeView(oVar.f23276w0);
            o.this.f23276w0 = null;
        }
    }

    public class d extends AnimatorListenerAdapter {
        public final Runnable f23283a;

        public d(Runnable runnable) {
            this.f23283a = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            o oVar = o.this;
            oVar.f23275v0.removeView(oVar.f23276w0);
            o.this.f23276w0 = null;
            Runnable runnable = this.f23283a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public class e extends AnimatorListenerAdapter {
        public e() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            o.this.A0 = false;
        }
    }

    public o(y1 y1Var, int i10) {
        super(y1Var.getContext(), y1Var.w3());
        this.f23268o0 = i10;
        this.f23269p0 = "";
        this.f23267n0 = y1Var;
        Jf();
    }

    public static int Df() {
        return a0.f() - ud.d1.getTopOffset();
    }

    public void Nf(float f10, float f11, ValueAnimator valueAnimator) {
        if (this.A0) {
            ig(Math.round(f10 + (f11 * db.b.a(valueAnimator))), true);
        }
    }

    public void Pf(float f10, float f11, ValueAnimator valueAnimator) {
        af(Math.round(f10 + (f11 * db.b.a(valueAnimator))));
    }

    public void Qf(ValueAnimator valueAnimator) {
        this.f23276w0.setAlpha(1.0f - db.b.a(valueAnimator));
    }

    public void Rf(ValueAnimator valueAnimator) {
        float a10 = db.b.a(valueAnimator);
        if (a10 <= 0.5f) {
            this.f23276w0.setAlpha(1.0f - db.b.f7287b.getInterpolation(a10 / 0.5f));
            return;
        }
        if (this.f23276w0.getAlpha() != 0.0f) {
            this.f23276w0.setAlpha(0.0f);
        }
        this.f23278y0.setAlpha(db.b.f7287b.getInterpolation((a10 - 0.5f) / 0.5f));
    }

    public static int vf() {
        return Df();
    }

    @Override
    public int A9() {
        return 3;
    }

    public int Af() {
        return 0;
    }

    public int Bf() {
        int X1;
        if (this.f23277x0 == null) {
            return 0;
        }
        RecyclerView.p uf = uf();
        if (!(uf instanceof LinearLayoutManager)) {
            return 0;
        }
        RecyclerView.h adapter = this.f23277x0.getAdapter();
        if (!(adapter instanceof f) || (X1 = ((LinearLayoutManager) uf).X1()) == -1) {
            return 0;
        }
        int s10 = ((f) adapter).s(X1);
        View C = uf.C(X1);
        return C != null ? s10 - C.getTop() : s10;
    }

    public final int Cf() {
        return this.f23271r0;
    }

    public boolean Ef(boolean z10) {
        if (!this.D0) {
            return false;
        }
        this.D0 = false;
        this.E0 = false;
        float vf = this.f23272s0 < this.f23271r0 ? 0.0f : 1.0f - ((vf() - this.f23272s0) / (vf() - this.f23271r0));
        this.f23267n0.d3();
        if (z10) {
            if (cf()) {
                Ze(vf(), true);
            } else {
                Ze(this.f23271r0, true);
            }
        } else if (vf >= 0.2f || !df()) {
            Ze(this.f23271r0, false);
        } else {
            this.E0 = true;
            int i10 = this.f23272s0;
            this.F0 = i10;
            this.G0 = -i10;
            this.f23267n0.r2();
        }
        return true;
    }

    public void Ff() {
        d1 d1Var = this.f23278y0;
        if (d1Var != null) {
            d1Var.setAlpha(0.0f);
        }
    }

    public void Gf() {
        Hf(null);
    }

    public void Hf(Runnable runnable) {
        if (this.f23276w0 != null) {
            ValueAnimator b10 = db.b.b();
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    o.this.Qf(valueAnimator);
                }
            });
            b10.addListener(new d(runnable));
            b10.setInterpolator(db.b.f7287b);
            b10.setDuration(140L);
            b10.start();
        }
    }

    public boolean If() {
        return false;
    }

    @Override
    public boolean Je() {
        return true;
    }

    public final void Jf() {
        this.f23270q0 = tf();
        fg(true);
    }

    public boolean Kf() {
        return this.A0 || this.E0;
    }

    @Override
    public final int L9() {
        return R.id.theme_color_filling;
    }

    public boolean Lf() {
        return this.f23272s0 == vf();
    }

    public boolean Mf(float f10, float f11) {
        return f11 >= this.f23277x0.getTranslationY() && f11 <= this.f23277x0.getTranslationY() + ((float) this.f23277x0.getMeasuredHeight());
    }

    @Override
    public final int O9() {
        return R.id.theme_color_headerLightIcon;
    }

    @Override
    public final int Q9() {
        return R.id.theme_color_text;
    }

    public boolean Sf(float f10) {
        int vf = cf() ? vf() : this.f23271r0;
        int min = Math.min(vf, this.C0 - ((int) f10));
        if (min < this.f23271r0 && !df()) {
            return false;
        }
        if (this.f23272s0 == min) {
            return min == vf;
        }
        if (!this.H0 && min > this.f23271r0) {
            this.H0 = true;
            Zf();
        }
        if (this.f23272s0 > this.f23271r0) {
            this.f23267n0.d3();
        }
        ig(min, true);
        return min == vf;
    }

    public void Tf() {
        this.E0 = false;
    }

    public void Uf(float f10) {
        if (this.E0) {
            ig(this.F0 + ((int) (this.G0 * f10)), false);
        }
    }

    public void Vf(boolean z10) {
        if (z10) {
            this.E0 = true;
            int i10 = this.f23272s0;
            this.F0 = i10;
            this.G0 = -i10;
        }
    }

    public void Wf() {
    }

    @Override
    public CharSequence X9() {
        int i10 = this.f23268o0;
        return i10 != 0 ? w.i1(i10) : this.f23269p0;
    }

    public void Xe(List<c0.a> list) {
    }

    public void Xf(boolean z10) {
    }

    public final void Ye(RecyclerView.o oVar) {
        this.f23277x0.g(oVar);
    }

    public void Yf(TdApi.MessageSendOptions messageSendOptions, boolean z10) {
    }

    @Override
    public void Z8() {
        super.Z8();
        p pVar = this.f23277x0;
        if (pVar != null) {
            p0.n(pVar);
        }
    }

    public void Ze(int i10, boolean z10) {
        if (this.A0) {
            this.A0 = false;
            ValueAnimator valueAnimator = this.B0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.B0 = null;
            }
        }
        int i11 = this.f23272s0;
        if (i11 != i10) {
            this.A0 = true;
            final float f10 = i11;
            final float f11 = i10 - f10;
            ValueAnimator b10 = db.b.b();
            this.B0 = b10;
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    o.this.Nf(f10, f11, valueAnimator2);
                }
            });
            this.B0.addListener(new e());
            this.B0.setInterpolator(db.b.f7287b);
            this.B0.setDuration(z10 ? 150L : 220L);
            this.B0.start();
        }
    }

    public void Zf() {
    }

    public final void af(int i10) {
        if (this.f23271r0 != i10) {
            this.f23272s0 = i10;
            this.f23271r0 = i10;
            qg();
            this.f23267n0.T2();
        }
    }

    public void ag() {
        if (this.D0) {
            this.D0 = false;
            this.E0 = false;
            int i10 = this.f23272s0;
            int i11 = this.f23271r0;
            float f10 = i10 >= i11 ? 1.0f : i10 / i11;
            float vf = i10 < i11 ? 0.0f : 1.0f - ((vf() - this.f23272s0) / (vf() - this.f23271r0));
            this.f23267n0.d3();
            if (f10 <= 0.45f && !this.f23274u0) {
                this.E0 = true;
                int i12 = this.f23272s0;
                this.F0 = i12;
                this.G0 = -i12;
                this.f23267n0.r2();
            } else if (vf < 0.35f || !this.f23274u0) {
                Ze(this.f23271r0, false);
            } else {
                Ze(vf(), true);
            }
        }
    }

    public final d1 bf(boolean z10) {
        d1 d1Var = new d1(t());
        this.f23275v0 = d1Var;
        d1Var.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f23275v0.setBoundController(this);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, -1);
        q12.topMargin = ud.d1.a3(false);
        q12.bottomMargin = ud.d1.getTopOffset();
        p pVar = new p(t());
        this.f23277x0 = pVar;
        pVar.g(new a());
        this.f23277x0.setOverScrollMode(2);
        g.j(this.f23277x0, zf());
        t8(this.f23277x0);
        this.f23277x0.setItemAnimator(new tc.d(db.b.f7287b, 150L));
        this.f23277x0.setLayoutParams(q12);
        this.f23277x0.k(new b());
        this.f23275v0.addView(this.f23277x0);
        if (z10) {
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(48.0f), a0.i(48.0f), 49);
            r12.topMargin = ud.d1.a3(false);
            View o02 = p0.o0(t(), r12);
            this.f23276w0 = o02;
            o02.setTranslationY(mf(a0.i(48.0f)));
            this.f23275v0.addView(this.f23276w0);
        }
        qg();
        return this.f23275v0;
    }

    public void bg() {
        this.C0 = this.f23272s0;
        this.D0 = true;
    }

    public boolean cf() {
        return true;
    }

    public void cg(float f10) {
        View view = this.f23276w0;
        if (view != null) {
            view.setTranslationY(mf(view.getLayoutParams().height));
        }
        d1 d1Var = this.f23278y0;
        if (d1Var != null) {
            d1Var.setTranslationY(mf(a0.i(18.0f)));
        }
    }

    public boolean df() {
        return true;
    }

    public void dg(int i10, int i11) {
        if (this.f23277x0 != null) {
            fg(false);
            rg(i11);
        }
    }

    public boolean ef() {
        return !Pa();
    }

    public void eg(Runnable runnable, long j10) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean ff() {
        return false;
    }

    public final void fg(boolean z10) {
        this.f23271r0 = Math.min(this.f23270q0 + of() + ud.d1.a3(false), Math.min(xf(), vf()));
        ig((Bf() > 0 || this.f23279z0) ? vf() : this.f23271r0, !z10);
    }

    public void gf() {
        int Bf = Bf();
        if (Bf != 0) {
            this.f23277x0.u1(0, -Bf);
        }
        Ze(this.f23271r0, false);
    }

    public final void gg() {
    }

    public ViewGroup hf() {
        return null;
    }

    public final void hg(RecyclerView.h<?> hVar) {
        this.f23277x0.setAdapter(hVar);
    }

    public final void m35if(final String str, final boolean z10) {
        ud(new Runnable() {
            @Override
            public final void run() {
                o.this.Of(str, z10);
            }
        });
    }

    public final void ig(int i10, boolean z10) {
        if (this.f23272s0 != i10) {
            this.f23272s0 = i10;
            int vf = vf();
            boolean z11 = true;
            this.f23279z0 = i10 == vf;
            if (Math.abs(i10 - this.f23273t0) >= a0.p()) {
                this.f23274u0 = i10 > this.f23273t0;
                this.f23273t0 = i10;
            }
            qg();
            y1 y1Var = this.f23267n0;
            if (this.f23272s0 >= vf) {
                z11 = false;
            }
            y1Var.setContentVisible(z11);
            if (z10) {
                int i11 = this.f23272s0;
                int i12 = this.f23271r0;
                if (i11 == i12) {
                    this.f23267n0.setBottomBarFactor(1.0f);
                    this.f23267n0.setHeaderFactor(0.0f);
                } else if (i11 < i12) {
                    this.f23267n0.setBottomBarFactor(i11 / i12);
                    this.f23267n0.setHeaderFactor(0.0f);
                } else {
                    float vf2 = (vf() - this.f23272s0) / (vf - this.f23271r0);
                    this.f23267n0.setBottomBarFactor(vf2);
                    this.f23267n0.setHeaderFactor(1.0f - vf2);
                }
            }
        }
    }

    @Override
    public boolean jc(boolean z10) {
        if (!Na()) {
            return false;
        }
        this.f23267n0.getHeaderView().n2(true, null);
        return true;
    }

    public void jf(MotionEvent motionEvent) {
        this.f23277x0.F1(motionEvent);
    }

    public final void jg(RecyclerView.p pVar) {
        this.f23277x0.setLayoutManager(pVar);
    }

    public void kf() {
        this.f23267n0.d3();
        Ze(vf(), false);
    }

    public void kg(String str) {
        this.f23269p0 = str;
        this.f23267n0.getHeaderView().setTitle(this);
    }

    public void lf(f fVar) {
        this.f23270q0 = fVar.v(-1);
        int xf = xf();
        int i10 = this.f23271r0;
        if (xf > i10) {
            if (this.D0 || this.A0 || this.f23272s0 > i10) {
                this.f23271r0 = xf;
                return;
            }
            final float f10 = i10;
            final float f11 = xf - i10;
            ValueAnimator b10 = db.b.b();
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    o.this.Pf(f10, f11, valueAnimator);
                }
            });
            b10.setInterpolator(db.b.f7287b);
            b10.setDuration(150L);
            b10.start();
        }
    }

    public final void lg(int i10, boolean z10) {
        Of(w.i1(i10), z10);
    }

    public final int mf(int i10) {
        return (((((int) this.f23277x0.getTranslationY()) + Af()) + ((Math.max(this.f23271r0, rf()) - Af()) / 2)) - of()) - (i10 / 2);
    }

    public void Of(String str, boolean z10) {
        if (this.f23278y0 == null) {
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, -2, 49);
            r12.topMargin = ud.d1.a3(false);
            d1 d1Var = new d1(t());
            this.f23278y0 = d1Var;
            d1Var.setLayoutParams(r12);
            this.f23278y0.setTranslationY(mf(a0.i(18.0f)));
            this.f23275v0.addView(this.f23278y0);
        } else {
            z10 = false;
        }
        this.f23278y0.setText(str);
        if (!z10 || this.f23276w0 == null) {
            this.f23278y0.setAlpha(1.0f);
            return;
        }
        this.f23278y0.setAlpha(0.0f);
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o.this.Rf(valueAnimator);
            }
        });
        b10.addListener(new c());
        b10.setDuration(300L);
        b10.start();
    }

    public void nf() {
        RecyclerView.p uf = uf();
        if (uf != null && (uf instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) uf).z2(0, 0);
        }
    }

    public boolean ng(boolean z10) {
        return false;
    }

    public final int of() {
        if (this.f23267n0.s2()) {
            return 0;
        }
        return h.getBarHeight();
    }

    public boolean og() {
        return false;
    }

    public int pf() {
        return TdApi.ChatActionCancel.CONSTRUCTOR;
    }

    public void pg() {
        this.f23277x0.A0();
    }

    public final int qf() {
        return this.f23270q0;
    }

    public final void qg() {
        d1 d1Var = this.f23275v0;
        if (d1Var != null) {
            int measuredHeight = d1Var.getMeasuredHeight();
            if (measuredHeight == 0) {
                measuredHeight = Df();
            }
            rg(measuredHeight);
        }
    }

    public final int rf() {
        return this.f23272s0;
    }

    public final void rg(int i10) {
        p pVar = this.f23277x0;
        if (pVar != null) {
            float f10 = i10 - this.f23272s0;
            pVar.setTranslationY(f10);
            cg(f10);
        }
    }

    public final int sf() {
        return this.f23267n0.getCurrentContentWidth();
    }

    public int tf() {
        return wf();
    }

    public final RecyclerView.p uf() {
        return this.f23277x0.getLayoutManager();
    }

    public final int wf() {
        return a0.B() - ud.d1.a3(false);
    }

    public final int xf() {
        if (If()) {
            return Integer.MAX_VALUE;
        }
        return Math.min(qf() + of() + ud.d1.a3(false), Math.min(sf() + of(), yf()));
    }

    public int yf() {
        if (If()) {
            return Integer.MAX_VALUE;
        }
        return vf() - (h.getBarHeight() / 4);
    }

    public int zf() {
        return R.id.theme_color_filling;
    }

    public o(y1 y1Var, String str) {
        super(y1Var.getContext(), y1Var.w3());
        this.f23268o0 = 0;
        this.f23269p0 = str;
        this.f23267n0 = y1Var;
        Jf();
    }
}
