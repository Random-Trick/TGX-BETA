package td;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import be.C1357a0;
import be.C1399s0;
import be.C1410y;
import ge.C4896n;
import me.C7045v2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p057e2.AbstractC4117a;
import p082fd.C4403w;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p143k0.C6038h;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.View$OnClickListenerC9156b5;

public abstract class AbstractC9376x4<T> extends AbstractC9299t2<T> implements ViewPager.AbstractC1054i, View$OnClickListenerC9156b5.AbstractC9159c, AbstractC5117h0, AbstractC9174d2, AbstractC9201h1, AbstractC9213j1 {
    public C7045v2 f30406t0;
    public C9379c f30407u0;
    public AbstractC9382y1 f30408v0;
    public int f30409w0;

    public class C9377a extends FrameLayoutFix {
        public C9377a(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), C4896n.m24480c(), C1410y.m37039g(C11524j.m228N(AbstractC9376x4.this.mo8856eg())));
        }
    }

    public interface AbstractC9378b {
        void mo8829I();
    }

    public static class C9379c extends AbstractC4117a {
        public final AbstractC9376x4<?> f30411M;
        public final C6038h<AbstractC9323v4<?>> f30412N;
        public final Context f30413c;

        public C9379c(Context context, AbstractC9376x4<?> x4Var) {
            this.f30413c = context;
            this.f30411M = x4Var;
            this.f30412N = new C6038h<>(x4Var.mo8854gg());
        }

        public AbstractC9323v4<?> m8828A(int i) {
            AbstractC9323v4<?> e = this.f30412N.m21471e(i);
            if (e != null) {
                return e;
            }
            AbstractC9323v4<?> mg = this.f30411M.mo8846mg(this.f30413c, i);
            mg.mo9417Id(this.f30411M);
            mg.m9354R8(this.f30411M);
            this.f30412N.m21466j(i, mg);
            return mg;
        }

        public final int m8827B(int i) {
            return i;
        }

        @Override
        public void mo8826b(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView(((AbstractC9323v4) obj).get());
        }

        @Override
        public int mo8825e() {
            return this.f30411M.mo8854gg();
        }

        @Override
        public int mo8824f(Object obj) {
            int n = this.f30412N.m21463n();
            for (int i = 0; i < n; i++) {
                if (this.f30412N.m21462o(i) == obj) {
                    return m8827B(this.f30412N.m21467i(i));
                }
            }
            return -2;
        }

        @Override
        public Object mo8823j(ViewGroup viewGroup, int i) {
            AbstractC9323v4<?> A = m8828A(m8827B(i));
            viewGroup.addView(A.get());
            return A;
        }

        @Override
        public boolean mo8822k(View view, Object obj) {
            return (obj instanceof AbstractC9323v4) && ((AbstractC9323v4) obj).m9427Ha() == view;
        }

        public void m8819x() {
            int n = this.f30412N.m21463n();
            for (int i = 0; i < n; i++) {
                AbstractC9323v4<?> o = this.f30412N.m21462o(i);
                if (!o.m9347Sa()) {
                    o.mo417Z8();
                }
            }
            this.f30412N.m21474b();
        }

        public AbstractC9323v4<?> m8818y(int i) {
            int n = this.f30412N.m21463n();
            for (int i2 = 0; i2 < n; i2++) {
                AbstractC9323v4<?> o = this.f30412N.m21462o(i2);
                if (o.mo407R9() == i) {
                    return o;
                }
            }
            return null;
        }

        public AbstractC9323v4<?> m8817z(int i) {
            return this.f30412N.m21471e(i);
        }
    }

    public AbstractC9376x4(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    private void m8835vg() {
        if (this.f30408v0 != null) {
            String[] hg = mo8852hg();
            if (hg == null || hg.length == mo8854gg()) {
                this.f30408v0.getTopView().setItems(hg);
                return;
            }
            throw new IllegalArgumentException("sections.length != " + mo8854gg());
        }
    }

    @Override
    public boolean mo493A3(View view, int i) {
        AbstractC9323v4<?> z = this.f30407u0.m8817z(this.f30406t0.getCurrentItem());
        return (z instanceof AbstractC5117h0) && ((AbstractC5117h0) z).mo493A3(view, i);
    }

    @Override
    public int mo8870Ea() {
        return mo8865M9();
    }

    @Override
    public View mo8869G9() {
        return (View) this.f30408v0;
    }

    @Override
    public View mo8868Ga() {
        if (mo8850jg() != 1) {
            return null;
        }
        return this.f30406t0;
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        C7045v2 v2Var = this.f30406t0;
        if (v2Var != null) {
            v2Var.mo8255s();
        }
        int i = 3;
        if (mo8850jg() == 3) {
            AbstractC9382y1 y1Var = this.f30408v0;
            TextView textView = (TextView) ((ViewGroup) y1Var).getChildAt(((ViewGroup) y1Var).getChildCount() - 1);
            if (C4403w.m27984G2()) {
                i = 5;
            }
            if (C1399s0.m37189c0(textView, i | 48)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                if (C4403w.m27984G2()) {
                    layoutParams.rightMargin = C1357a0.m37541i(68.0f);
                    layoutParams.leftMargin = 0;
                } else {
                    layoutParams.leftMargin = C1357a0.m37541i(68.0f);
                    layoutParams.rightMargin = 0;
                }
                C1399s0.m37145y0(textView);
            }
        }
    }

    public void mo419J(int i, View view) {
        AbstractC9323v4<?> cg = m8858cg();
        if (cg instanceof AbstractC9201h1) {
            ((AbstractC9201h1) cg).mo419J(i, view);
        }
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        if (i == 0) {
            m8835vg();
        } else if (i == 2) {
            m8835vg();
        }
    }

    @Override
    public final int mo8865M9() {
        int jg = mo8850jg();
        if (jg == 1) {
            return C4896n.m24478e();
        }
        if (jg == 2 || jg == 3) {
            return C4896n.m24478e() + C4896n.m24480c();
        }
        return super.mo8865M9();
    }

    public void mo8864N0(int i) {
        AbstractC9323v4<?> cg = m8858cg();
        if (cg instanceof AbstractC9213j1) {
            ((AbstractC9213j1) cg).mo8864N0(i);
        }
    }

    @Override
    public boolean mo492Q() {
        return C5115g0.m23935a(this);
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        return f2 <= ((float) ((View$OnClickListenerC9170d1.getTopOffset() + mo8865M9()) - C4896n.m24480c())) || (this.f30406t0 != null && m8847lg() && this.f30409w0 == 0);
    }

    public final void m8862Yf(CharSequence charSequence) {
        AbstractC9382y1 y1Var;
        TextView textView;
        if (mo8850jg() == 3 && (y1Var = this.f30408v0) != null && (textView = (TextView) ((View) y1Var).findViewById(R.id.text_title)) != null) {
            C1399s0.m37175j0(textView, charSequence);
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C9379c cVar = this.f30407u0;
        if (cVar != null) {
            cVar.m8819x();
        }
    }

    public final C6038h<AbstractC9323v4<?>> m8861Zf() {
        C9379c cVar = this.f30407u0;
        if (cVar != null) {
            return cVar.f30412N;
        }
        return null;
    }

    public final AbstractC9323v4<?> m8860ag(int i) {
        C9379c cVar = this.f30407u0;
        if (cVar != null) {
            return cVar.m8818y(i);
        }
        return null;
    }

    @Override
    public Object mo491b2(int i) {
        return C5115g0.m23934b(this, i);
    }

    public final AbstractC9323v4<?> m8859bg(int i) {
        C9379c cVar = this.f30407u0;
        if (cVar != null) {
            return cVar.m8817z(i);
        }
        return null;
    }

    public final AbstractC9323v4<?> m8858cg() {
        return m8859bg(m8857dg());
    }

    public final int m8857dg() {
        return this.f30407u0.m8827B(this.f30406t0.getCurrentItem());
    }

    public int mo8856eg() {
        return R.id.theme_color_filling;
    }

    public int mo8855fg() {
        return 0;
    }

    public abstract int mo8854gg();

    @Override
    public final void mo8853h4(int i) {
        this.f30409w0 = i;
    }

    public abstract String[] mo8852hg();

    public final AbstractC9323v4<?> m8851ig(int i) {
        if (this.f30407u0 == null) {
            get();
        }
        AbstractC9323v4<?> A = this.f30407u0.m8828A(i);
        A.get();
        return A;
    }

    public int mo8850jg() {
        return 1;
    }

    @Override
    public void mo8849k2(int i) {
        if (m8857dg() == i) {
            AbstractC9323v4<?> z = this.f30407u0.m8817z(this.f30406t0.getCurrentItem());
            if (z instanceof AbstractC9378b) {
                ((AbstractC9378b) z).mo8829I();
            }
        } else if (this.f30406t0.m14041T()) {
            m8836ug(i, true);
        }
    }

    public final org.thunderdog.challegram.widget.ViewPager m8848kg() {
        return this.f30406t0;
    }

    public final boolean m8847lg() {
        return this.f30407u0.m8827B(this.f30406t0.getCurrentItem()) == 0;
    }

    public abstract AbstractC9323v4<?> mo8846mg(Context context, int i);

    public abstract void mo8845ng(Context context, FrameLayoutFix frameLayoutFix, org.thunderdog.challegram.widget.ViewPager viewPager);

    @Override
    public final android.view.View mo403oc(android.content.Context r10) {
        throw new UnsupportedOperationException("Method not decompiled: td.AbstractC9376x4.mo403oc(android.content.Context):android.view.View");
    }

    public void mo8844og(int i, int i2, float f, int i3) {
    }

    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        AbstractC9323v4<?> cg = m8858cg();
        if (cg instanceof AbstractC9201h1) {
            ((AbstractC9201h1) cg).mo414p0(i, d1Var, linearLayout);
        }
    }

    public void mo8843pg(int i, int i2) {
    }

    @Override
    public void mo8842qc() {
        super.mo8842qc();
        m8848kg().setPagingEnabled(false);
        m8858cg().mo8842qc();
    }

    public boolean mo8841qg() {
        return false;
    }

    public final void m8840rg(int i, Runnable runnable) {
        AbstractC9323v4<?> A;
        C9379c cVar = this.f30407u0;
        if (cVar != null) {
            C6038h hVar = cVar.f30412N;
            int B = this.f30407u0.m8827B(i);
            if (hVar.m21471e(B) == null && (A = this.f30407u0.m8828A(B)) != null) {
                if (runnable != null) {
                    A.m9255fd(runnable);
                }
                A.get();
                return;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void m8839sg(int i, AbstractC9323v4<?> v4Var) {
        AbstractC9323v4<?> z = this.f30407u0.m8817z(i);
        if (z != null) {
            this.f30407u0.f30412N.m21465k(i);
            z.mo417Z8();
            v4Var.mo9417Id(this);
            v4Var.m9354R8(this);
            this.f30407u0.f30412N.m21466j(i, v4Var);
            this.f30407u0.m28888l();
        }
    }

    public final boolean m8838tg() {
        if (m8847lg()) {
            return false;
        }
        this.f30406t0.mo18027N(this.f30407u0.m8827B(0), true);
        return true;
    }

    @Override
    public void mo8837u5(int i) {
        AbstractC9323v4<?> cg = m8858cg();
        if (cg instanceof AbstractC9174d2) {
            ((AbstractC9174d2) cg).mo8837u5(i);
        }
    }

    public final void m8836ug(int i, boolean z) {
        AbstractC9382y1 y1Var = this.f30408v0;
        if (y1Var != null && z) {
            y1Var.getTopView().m10156W1(this.f30406t0.getCurrentItem(), i);
        }
        this.f30406t0.mo18027N(i, z);
    }

    public boolean mo8834wg() {
        return false;
    }

    @Override
    public final void mo8833x(int i, float f, int i2) {
        AbstractC9382y1 y1Var = this.f30408v0;
        if (y1Var != null) {
            y1Var.getTopView().setSelectionFactor(i + f);
        }
        mo8844og(this.f30407u0.m8827B(i), i, f, i2);
        if (m9348S9()) {
            mo9397La();
        }
    }

    @Override
    public final void mo8832x4(int i) {
        mo8843pg(this.f30407u0.m8827B(i), i);
    }

    @Override
    public int mo8831xa() {
        AbstractC9323v4<?> cg = m8858cg();
        return cg != null ? cg.mo8831xa() : super.mo8831xa();
    }

    @Override
    public void mo8830yc() {
        super.mo8830yc();
        m8848kg().setPagingEnabled(true);
        m8858cg().mo8830yc();
    }
}
