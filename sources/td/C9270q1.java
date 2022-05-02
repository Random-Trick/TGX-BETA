package td;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.view.ActionMode;
import android.view.View;
import android.widget.FrameLayout;
import be.C1379j0;
import be.C1399s0;
import ge.C4868i;
import ge.C4896n;
import java.util.ArrayList;
import java.util.Iterator;
import me.C6879f3;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p082fd.C4403w;
import p108hb.C5069h;
import p139jb.AbstractC5913e;
import p335xd.AbstractC10190e;
import p364zd.AbstractC11526l;
import p364zd.AbstractC11531p;
import p364zd.C11510b;
import p364zd.C11525k;
import p364zd.C11537v;
import p364zd.C11541z;

public class C9270q1 implements AbstractC5913e<View>, AbstractC11526l, C4403w.AbstractC4404a {
    public View$OnClickListenerC9170d1 f29942M;
    public C6879f3 f29943N;
    public C6879f3 f29944O;
    public View f29945P;
    public C9290s0 f29946Q;
    public boolean f29947R;
    public ArrayList<AbstractC9323v4<?>> f29948S;
    public final Context f29949T;
    public View f29950U;
    public boolean f29951V;
    public C11537v f29952W;
    public boolean f29953X;
    public int f29954Y;
    public boolean f29955Z;
    public HandlerC9298t1 f29956a = new HandlerC9298t1(this);
    public float f29957a0;
    public C9153b2 f29958b;
    public float f29959b0;
    public C9292s1 f29960c;
    public float f29961c0;
    public float f29962d0;
    public float f29963e0;
    public float f29964f0;
    public AbstractC9323v4<?> f29965g0;
    public AbstractC9323v4<?> f29966h0;
    public View f29967i0;
    public View f29968j0;
    public float f29969k0;
    public float f29970l0;
    public boolean f29971m0;
    public float f29972n0;
    public Object f29973o0;

    public class View$OnAttachStateChangeListenerC9271a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC9271a() {
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            C9270q1.this.f29951V = true;
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            C9270q1.this.f29951V = false;
        }
    }

    public class RunnableC9272b implements Runnable {
        public final int f29975M;
        public final boolean f29976N;
        public final AbstractC9323v4 f29978a;
        public final int f29979b;
        public final boolean f29980c;

        public RunnableC9272b(AbstractC9323v4 v4Var, int i, boolean z, int i2, boolean z2) {
            this.f29978a = v4Var;
            this.f29979b = i;
            this.f29980c = z;
            this.f29975M = i2;
            this.f29976N = z2;
        }

        @Override
        public void run() {
            if (this.f29978a.m9279ca() == this) {
                this.f29978a.m9173rd();
                if (C9270q1.this.f29953X) {
                    this.f29978a.mo417Z8();
                    return;
                }
                this.f29978a.m9218l9();
                C9270q1.this.m9710m(this.f29978a, this.f29979b, this.f29980c, this.f29975M, this.f29976N);
            }
        }
    }

    public class C9273c extends AnimatorListenerAdapter {
        public final Runnable f29981a;

        public C9273c(Runnable runnable) {
            this.f29981a = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f29981a.run();
        }
    }

    public class C9274d extends AnimatorListenerAdapter {
        public C9274d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C9270q1.this.m9773A(2);
        }
    }

    public class C9275e extends AnimatorListenerAdapter {
        public C9275e() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C9270q1.this.m9773A(1);
        }
    }

    public C9270q1(Context context) {
        this.f29949T = context;
    }

    public void m9736Y(boolean z, int i, AbstractC9323v4 v4Var, AbstractC9323v4 v4Var2, AbstractC9323v4 v4Var3) {
        boolean z2 = true;
        if (z) {
            m9770B0();
            if (i != 0) {
                this.f29942M.m10043n2(v4Var);
                HandlerC9298t1 t1Var = this.f29956a;
                if ((i & 16) != 16) {
                    z2 = false;
                }
                t1Var.m9599l(v4Var, z2);
            } else {
                this.f29942M.m10043n2(m9749M().m9501l());
                this.f29956a.m9595p();
            }
            m9689x();
            m9758H0(0, v4Var2, v4Var3);
            m9747N0();
            return;
        }
        m9773A(1);
    }

    public void m9735Z(ValueAnimator valueAnimator) {
        m9762F0(1.0f - C2057b.m35735a(valueAnimator));
    }

    public void m9733a0(ValueAnimator valueAnimator) {
        m9762F0(C2057b.m35735a(valueAnimator));
    }

    public void m9731b0(float f, float f2, ValueAnimator valueAnimator) {
        m9762F0(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public void m9729c0(float f, ValueAnimator valueAnimator) {
        m9762F0(f - (C2057b.m35735a(valueAnimator) * f));
    }

    public void m9727d0(View view) {
        AbstractC9323v4<?> l = this.f29956a.m9604g().m9501l();
        if (l != null) {
            l.mo9174rc();
        }
    }

    public static int m9702q(float f, float f2, int i, int i2) {
        return f2 <= 0.0f ? i : Math.min(Math.max(Math.round(f / (f2 / 1000.0f)), i2), i);
    }

    public final void m9773A(int i) {
        m9689x();
        m9692v0();
        AbstractC9323v4<?> n = m9749M().m9499n();
        m9770B0();
        m9758H0(0, this.f29965g0, this.f29966h0);
        if (i == 1) {
            this.f29942M.m10043n2(n);
            if (n != null && n.mo9386Me()) {
                m9706o(n);
            }
            this.f29956a.m9594q();
        } else if (i == 2) {
            this.f29942M.m10034r2();
            AbstractC9323v4<?> l = m9749M().m9501l();
            if (l != null) {
                l.mo9166sc();
            }
            this.f29956a.m9598m(n);
        } else if (i == 3) {
            m9695u();
            this.f29956a.m9598m(n);
        }
        m9725e0();
        this.f29965g0 = null;
        this.f29966h0 = null;
        this.f29967i0 = null;
        this.f29968j0 = null;
        m9747N0();
    }

    public void m9772A0() {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29948S;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                m9684z0(this.f29948S.get(size));
            }
        }
        this.f29960c.removeAllViews();
        m9699s();
    }

    public void m9771B() {
        m9773A(3);
    }

    public void m9770B0() {
        this.f29945P.setVisibility(8);
        this.f29960c.removeView(this.f29945P);
    }

    public boolean m9769C() {
        return m9700r0(0.0f, true);
    }

    public void m9768C0() {
        m9749M().m9511b(this);
        m9697t();
    }

    public View get() {
        if (this.f29950U == null) {
            View l0 = m9711l0(this.f29949T);
            this.f29950U = l0;
            l0.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC9271a());
            this.f29950U.setTag(this);
            C11541z.m7t().m23f(this);
        }
        return this.f29950U;
    }

    public final void m9766D0(AbstractC9323v4<?> v4Var) {
        if (!this.f29947R && v4Var != null) {
            if (m9749M().m9496q()) {
                m9744Q(v4Var);
            } else {
                this.f29956a.m9597n(v4Var);
            }
        }
    }

    public Context m9765E() {
        return this.f29949T;
    }

    public void m9764E0(AbstractC9323v4<?> v4Var, boolean z, boolean z2) {
        if (v4Var == null) {
            return;
        }
        if (m9749M().m9496q()) {
            m9744Q(v4Var);
        } else {
            this.f29956a.m9596o(v4Var, z, z2);
        }
    }

    public AbstractC9323v4<?> m9763F() {
        return m9749M().m9501l();
    }

    public void m9762F0(float f) {
        float f2;
        if (this.f29972n0 != f) {
            float d = C5069h.m24089d(f);
            this.f29972n0 = d;
            if (this.f29954Y == 2) {
                f2 = Math.round(this.f29961c0 * d);
            } else {
                f2 = this.f29959b0 * d;
            }
            this.f29963e0 = f2;
            int i = this.f29954Y;
            if (i == 1) {
                this.f29942M.setTranslation(d);
                float f3 = 1.0f - d;
                float f4 = this.f29962d0 * f3;
                if (C4403w.m27984G2()) {
                    this.f29968j0.setTranslationX(-f2);
                    this.f29965g0.get().setTranslationX(-f4);
                } else {
                    this.f29968j0.setTranslationX(f2);
                    this.f29965g0.get().setTranslationX(f4);
                }
                if (this.f29965g0.mo9386Me()) {
                    this.f29942M.getFilling().m9044W(-f4);
                }
                if (!this.f29965g0.mo9386Me()) {
                    this.f29945P.setAlpha(0.08f * f3);
                }
                this.f29943N.setTranslationX(C4403w.m27984G2() ? (-f2) + this.f29959b0 : f2 - C4896n.m24474i());
                this.f29943N.setAlpha((f3 * 0.45f) + 0.65f);
            } else if (i == 2) {
                this.f29968j0.setTranslationY(f2);
                if (!this.f29965g0.mo9386Me()) {
                    this.f29945P.setAlpha((1.0f - d) * 0.08f);
                }
                this.f29944O.setTranslationY(f2 - C4896n.m24473j());
                this.f29944O.setAlpha(1.0f);
                this.f29942M.getFilling().m9026i(f2);
                if (f2 < this.f29957a0 + View$OnClickListenerC9170d1.getTopOffset()) {
                    if (this.f29966h0.mo9293aa() == -16777216) {
                        this.f29967i0.setAlpha(0.0f);
                    }
                    View$OnClickListenerC9170d1 d1Var = this.f29942M;
                    float topOffset = f2 / (this.f29957a0 + View$OnClickListenerC9170d1.getTopOffset());
                    this.f29964f0 = topOffset;
                    d1Var.setTranslation(topOffset);
                } else if (this.f29964f0 != 1.0f) {
                    this.f29967i0.setAlpha(1.0f);
                    this.f29964f0 = 1.0f;
                    this.f29942M.setTranslation(1.0f);
                }
            } else if (i == 3) {
                this.f29942M.setTranslation(d);
                this.f29968j0.setAlpha(1.0f - d);
            }
            m9747N0();
        }
    }

    public float m9761G() {
        return this.f29972n0;
    }

    public void m9760G0(boolean z) {
        if (this.f29947R != z) {
            this.f29947R = z;
            ((AbstractView$OnTouchListenerC7889a) this.f29949T).m14492f3(z);
            C1379j0.m37307r(this.f29949T).m14464m3(1, z);
            Object obj = this.f29973o0;
            if (obj != null) {
                ((ActionMode) obj).finish();
            }
            if (!z) {
                this.f29956a.m9609b();
            }
        }
    }

    public C9290s0 m9759H() {
        return this.f29946Q;
    }

    public void m9758H0(int i, AbstractC9323v4<?> v4Var, AbstractC9323v4<?> v4Var2) {
        boolean z;
        C6879f3 f3Var = this.f29943N;
        if (f3Var != null) {
            C1399s0.m37183f0(f3Var, i);
        }
        View view = this.f29945P;
        if (view != null) {
            C1399s0.m37183f0(view, i);
        }
        C6879f3 f3Var2 = this.f29944O;
        if (f3Var2 != null) {
            C1399s0.m37183f0(f3Var2, i);
        }
        C9290s0 s0Var = this.f29946Q;
        if (s0Var != null && !(z = AbstractC10190e.f32932O)) {
            C1399s0.m37183f0(s0Var, (i != 2 || !z) ? i : 1);
        }
        if (v4Var != null && v4Var.mo9473B8()) {
            C1399s0.m37183f0(v4Var.get(), i);
        }
        if (v4Var2 != null && v4Var2.mo9473B8()) {
            C1399s0.m37183f0(v4Var2.get(), i);
        }
    }

    public View$OnClickListenerC9170d1 m9757I() {
        return this.f29942M;
    }

    public void m9756I0(int i) {
        this.f29944O.setVisibility(i);
        this.f29943N.setVisibility(i);
    }

    public int m9755J() {
        if (!this.f29947R || this.f29954Y != 1) {
            return 0;
        }
        return (int) (this.f29958b.getMeasuredWidth() * this.f29972n0);
    }

    public boolean m9754J0() {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29948S;
        if (arrayList == null) {
            return false;
        }
        Iterator<AbstractC9323v4<?>> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().mo9350Rd()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mo137J4(int i, int i2, float f, boolean z) {
        C11525k.m138c(this, i, i2, f, z);
    }

    public AbstractC9323v4<?> m9753K() {
        return this.f29956a.m9605f();
    }

    public void m9752K0() {
        if (this.f29945P.getParent() != null) {
            this.f29960c.removeView(this.f29945P);
        }
        this.f29945P.setVisibility(0);
        this.f29960c.addView(this.f29945P, 1);
    }

    public AbstractC9323v4<?> m9751L() {
        return m9749M().m9499n();
    }

    public final void m9750L0(float f) {
        if (!this.f29947R) {
            return;
        }
        if (!C4403w.m27984G2() || this.f29954Y != 1) {
            m9762F0(f / this.f29959b0);
        } else {
            m9762F0((-f) / this.f29959b0);
        }
    }

    public C9312u1 m9749M() {
        return this.f29956a.m9604g();
    }

    public int m9748N() {
        return this.f29956a.m9603h();
    }

    public final void m9747N0() {
        ((AbstractView$OnTouchListenerC7889a) this.f29949T).m14579I3();
    }

    public C11537v m9746O() {
        if (this.f29952W == null) {
            this.f29952W = new C11537v();
        }
        return this.f29952W;
    }

    public final void m9745P() {
        C1379j0.m37307r(this.f29949T).m14478j1(true);
        View$OnClickListenerC9218k0 u = C1379j0.m37301u(this.f29949T);
        if (u != null) {
            u.m9896pf(0.0f, null);
        }
    }

    public void m9744Q(AbstractC9323v4<?> v4Var) {
        if (!this.f29947R && v4Var != null) {
            C9312u1 M = m9749M();
            v4Var.get();
            M.m9511b(this);
            M.m9493t(v4Var, true);
            m9772A0();
            m9716j(v4Var);
            this.f29956a.m9610a(v4Var);
            m9757I().setTitle(v4Var);
            if (v4Var.mo9386Me()) {
                v4Var.mo9435G8(1.0f);
            }
        }
    }

    public void m9743R(AbstractC9323v4<?> v4Var, int i) {
        if (!this.f29947R && v4Var != null) {
            this.f29956a.m9602i(v4Var, i);
        }
    }

    public boolean m9742S() {
        return this.f29947R;
    }

    public boolean m9741T() {
        if (this.f29947R && !this.f29955Z) {
            float f = this.f29963e0;
            if (f != 0.0f && f != 1.0f && this.f29971m0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mo9343T5(int i, int i2) {
        if (C4403w.m27981H1(i, i2)) {
            if (C1399s0.m37189c0(this.f29946Q, (C4403w.m27984G2() ? 3 : 5) | 48)) {
                C1399s0.m37145y0(this.f29946Q);
            }
            if (this.f29943N != null) {
                if (C4403w.m27984G2()) {
                    this.f29943N.setSimpleRightShadow(false);
                } else {
                    this.f29943N.setSimpleLeftShadow(false);
                }
            }
        }
        View$OnClickListenerC9170d1 d1Var = this.f29942M;
        if (d1Var != null) {
            d1Var.mo9343T5(i, i2);
        }
    }

    public boolean m9740U() {
        return this.f29947R && this.f29954Y != 4;
    }

    public final boolean m9739V() {
        AbstractC9323v4<?> l = m9749M().m9501l();
        return l != null && l.m9278cb();
    }

    public boolean m9738W() {
        return this.f29953X;
    }

    @Override
    public boolean mo136W0() {
        return true;
    }

    public boolean m9737X() {
        return this.f29956a.m9604g().m9513C() == 0;
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        C11525k.m139b(this, pVar, pVar2);
    }

    public void m9725e0() {
        this.f29958b.m10174D1();
        this.f29942M.m10026v3();
        this.f29960c.m9614D1();
    }

    public void m9723f0(AbstractC9323v4<?> v4Var, int i) {
        boolean z;
        int i2;
        boolean z2;
        m9745P();
        int i3 = 0;
        boolean z3 = (i & 1) != 1;
        if ((i & 8) == 8) {
            i2 = 3;
            z = false;
        } else {
            int i4 = 2;
            if (z3) {
                z2 = v4Var.mo9169s9();
                if (z2 || v4Var.mo9177r9()) {
                    i4 = 3;
                } else if (!v4Var.mo9386Me()) {
                    i4 = 1;
                }
            } else {
                AbstractC9323v4<?> l = m9749M().m9501l();
                boolean s9 = v4Var.mo9169s9();
                if (s9 || l == null || l.mo9177r9()) {
                    i4 = 3;
                } else if (!l.mo9386Me()) {
                    i4 = 1;
                }
                z2 = s9;
            }
            if (!C4868i.m24726c2().m24826O2() || i4 != 1) {
                i2 = i4;
                z = z2;
            } else {
                z = z2;
                i2 = 3;
            }
        }
        if ((i & 4) == 4) {
            i3 = (i & 16) == 16 ? 20 : 4;
        }
        if (!v4Var.mo9270dc() || !this.f29951V) {
            v4Var.m9218l9();
            m9710m(v4Var, i2, z3, i3, z);
            return;
        }
        v4Var.m9114zd(new RunnableC9272b(v4Var, i2, z3, i3, z), v4Var.mo9125y9(z));
    }

    public final boolean m9721g0() {
        if (this.f29947R || m9749M().m9500m() <= 0 || m9739V()) {
            return false;
        }
        this.f29956a.m9601j();
        return true;
    }

    public final boolean m9719h0(AbstractC9323v4<?> v4Var) {
        if (this.f29947R || m9748N() <= 0 || v4Var == null || m9739V()) {
            return false;
        }
        this.f29947R = true;
        this.f29956a.m9600k(v4Var);
        return true;
    }

    public final void m9717i0() {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29948S;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f29948S.get(size).m9242hc();
            }
        }
    }

    public void m9716j(AbstractC9323v4<?> v4Var) {
        if (this.f29948S == null) {
            this.f29948S = new ArrayList<>();
        }
        this.f29948S.add(v4Var);
        v4Var.mo9421I8(this.f29969k0, this.f29970l0);
        if (!v4Var.mo9386Me()) {
            this.f29960c.addView(v4Var.get());
        } else if (v4Var.mo9228jd()) {
            this.f29958b.addView(v4Var.get(), 0);
        } else {
            this.f29958b.addView(v4Var.get(), this.f29958b.getChildCount() - 2);
        }
        v4Var.mo9384N8(this);
        v4Var.mo9477Ac();
        v4Var.m9235ic(this, true);
        m9699s();
    }

    public boolean m9715j0(boolean z) {
        if (this.f29942M.m10049k3()) {
            this.f29942M.m10027v2(true, true);
            return true;
        }
        AbstractC9323v4<?> l = m9749M().m9501l();
        if (this.f29942M.m10052j3()) {
            if (l != null && l.mo9314X8(z)) {
                return true;
            }
            this.f29942M.m10030t2(true, null);
            return true;
        } else if (l == null) {
            return false;
        } else {
            if (l.mo404jc(z)) {
                return true;
            }
            if (m9748N() <= 1) {
                return false;
            }
            m9721g0();
            return true;
        }
    }

    public void m9714k(AbstractC9323v4<?> v4Var, int i) {
        if (this.f29948S == null) {
            this.f29948S = new ArrayList<>();
        }
        this.f29948S.add(i, v4Var);
        if (v4Var.mo9386Me()) {
            this.f29958b.addView(v4Var.get(), 0);
        } else {
            this.f29960c.addView(v4Var.get(), i);
        }
        v4Var.mo9384N8(this);
        v4Var.mo9477Ac();
        v4Var.m9235ic(this, true);
        m9699s();
    }

    public void m9713k0() {
        AbstractC9323v4<?> l = m9749M().m9501l();
        if (l != null) {
            l.mo9222kc();
        }
    }

    public void m9712l(View view) {
        C9153b2 b2Var = this.f29958b;
        b2Var.addView(view, b2Var.indexOfChild(this.f29942M));
    }

    public View m9711l0(Context context) {
        C9153b2 b2Var = new C9153b2(context);
        this.f29958b = b2Var;
        b2Var.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f29958b.setId(R.id.nav_root);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C4896n.m24474i(), -1, 3);
        t1.setMargins(0, View$OnClickListenerC9170d1.m10066c3(true), 0, 0);
        C6879f3 f3Var = new C6879f3(context);
        this.f29943N = f3Var;
        f3Var.setLayoutParams(t1);
        if (C4403w.m27984G2()) {
            this.f29943N.setSimpleRightShadow(false);
        } else {
            this.f29943N.setSimpleLeftShadow(false);
        }
        this.f29943N.setVisibility(8);
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-1, C4896n.m24473j(), 48);
        C6879f3 f3Var2 = new C6879f3(context);
        this.f29944O = f3Var2;
        f3Var2.setSimpleTopShadow(true);
        this.f29944O.setVisibility(8);
        this.f29944O.setLayoutParams(t12);
        View view = new View(context);
        this.f29945P = view;
        view.setBackgroundColor(-16777216);
        this.f29945P.setVisibility(8);
        this.f29945P.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        C9292s1 s1Var = new C9292s1(context);
        this.f29960c = s1Var;
        s1Var.setController(this);
        this.f29960c.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f29960c.setId(R.id.nav_wrapper);
        View$OnClickListenerC9170d1 d1Var = new View$OnClickListenerC9170d1(context);
        this.f29942M = d1Var;
        d1Var.m10047l3(this);
        this.f29942M.setId(R.id.nav_header);
        this.f29958b.addView(this.f29960c);
        this.f29958b.addView(this.f29943N);
        this.f29958b.addView(this.f29944O);
        this.f29958b.addView(this.f29942M);
        C9290s0 s0Var = new C9290s0(context);
        this.f29946Q = s0Var;
        s0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                C9270q1.this.m9727d0(view2);
            }
        });
        this.f29958b.addView(this.f29946Q);
        C4403w.m27875h(this);
        return this.f29958b;
    }

    public void m9710m(final AbstractC9323v4<?> v4Var, int i, final boolean z, final int i2, boolean z2) {
        AbstractC9323v4<?> v4Var2;
        AbstractC9323v4<?> v4Var3;
        if (z) {
            AbstractC9323v4<?> n = m9749M().m9499n();
            m9696t0(n, v4Var, true, i);
            v4Var3 = n;
            v4Var2 = v4Var;
        } else {
            AbstractC9323v4<?> l = m9749M().m9501l();
            m9696t0(v4Var, l, false, i);
            v4Var2 = l;
            v4Var3 = v4Var;
        }
        final AbstractC9323v4<?> v4Var4 = v4Var3;
        final AbstractC9323v4<?> v4Var5 = v4Var2;
        Runnable p1Var = new Runnable() {
            @Override
            public final void run() {
                C9270q1.this.m9736Y(z, i2, v4Var, v4Var4, v4Var5);
            }
        };
        if (!this.f29951V) {
            m9762F0(z ? 0.0f : 1.0f);
            p1Var.run();
            return;
        }
        this.f29971m0 = true;
        ValueAnimator b = C2057b.m35734b();
        if (z) {
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9270q1.this.m9735Z(valueAnimator);
                }
            });
        } else {
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9270q1.this.m9733a0(valueAnimator);
                }
            });
        }
        long j = 400;
        long j2 = 120;
        if (i == 1) {
            b.setDuration(400L);
            b.setInterpolator(C2057b.f7282d);
        } else if (i == 2) {
            if (!z) {
                j = 500;
            }
            b.setDuration(j);
            b.setInterpolator(C2057b.f7282d);
        } else if (i == 3) {
            b.setDuration(z2 ? 120L : 180L);
            b.setInterpolator(C2057b.f7280b);
        }
        b.addListener(new C9273c(p1Var));
        if (!z2) {
            if (z) {
                if (v4Var3 == null || !v4Var3.mo9386Me()) {
                    j2 = v4Var.mo9117za(true);
                }
                b.setStartDelay(j2);
            } else {
                if (v4Var2 == null || !v4Var2.mo9386Me()) {
                    j2 = v4Var.mo9117za(false);
                }
                b.setStartDelay(j2);
            }
        }
        C2057b.m35733c(z ? v4Var2.get() : v4Var3.get(), b);
    }

    public void m9709m0() {
        AbstractC9323v4<?> l = m9749M().m9501l();
        if (l != null) {
            l.mo9166sc();
        }
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        AbstractC9323v4<?> v4Var;
        boolean z2;
        if (!this.f29947R || ((!(z2 = this.f29955Z) || this.f29972n0 != 1.0f) && (z2 || this.f29972n0 != 0.0f))) {
            v4Var = m9763F();
        } else {
            v4Var = m9751L();
        }
        if (v4Var != null) {
            this.f29942M.m10124E3(v4Var, null);
        }
        C11537v vVar = this.f29952W;
        if (vVar != null) {
            vVar.m66n(z);
        }
    }

    public boolean m9708n(float f, float f2) {
        if (this.f29969k0 == f) {
            return false;
        }
        this.f29969k0 = f;
        this.f29970l0 = f2;
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29948S;
        if (arrayList == null) {
            return true;
        }
        Iterator<AbstractC9323v4<?>> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo9421I8(f, f2);
        }
        return true;
    }

    public void m9707n0(boolean z) {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29948S;
        if (arrayList != null) {
            Iterator<AbstractC9323v4<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo9136wc(z);
            }
        }
    }

    public final void m9706o(AbstractC9323v4<?> v4Var) {
        if (!v4Var.mo9228jd()) {
            this.f29958b.removeView(v4Var.get());
            this.f29958b.addView(v4Var.get(), this.f29958b.getChildCount() - 2);
        }
        this.f29942M.getFilling().m9025i0(true);
    }

    public void m9705o0() {
        AbstractC9323v4<?> l = m9749M().m9501l();
        if (l != null) {
            l.mo9477Ac();
        }
    }

    public void m9704p(float f) {
        if (this.f29947R && m9749M().m9500m() > 0) {
            if (this.f29954Y == 2) {
                this.f29972n0 = this.f29963e0 / this.f29961c0;
            } else {
                this.f29972n0 = this.f29963e0 / this.f29959b0;
            }
            final float G = m9761G();
            final float f2 = 1.0f - G;
            ValueAnimator b = C2057b.m35734b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9270q1.this.m9731b0(G, f2, valueAnimator);
                }
            });
            b.setInterpolator(C2057b.f7280b);
            b.addListener(new C9275e());
            if (this.f29954Y == 2) {
                b.setDuration(m9702q(this.f29961c0 - this.f29963e0, f, 300, 160));
            } else {
                b.setDuration(m9702q(this.f29959b0 - this.f29963e0, f, 200, 60));
            }
            b.start();
        }
    }

    public boolean m9703p0(float f) {
        return m9700r0(f, false);
    }

    @Override
    public void mo133q0(int i) {
        C11525k.m140a(this, i);
    }

    public void m9701r() {
        this.f29958b.m10175C1();
        this.f29942M.m10039p2();
        this.f29960c.m9615C1();
    }

    public final boolean m9700r0(float f, boolean z) {
        AbstractC9323v4<?> l;
        if (m9749M().m9500m() <= 0) {
            this.f29956a.m9607d();
            return false;
        } else if (this.f29947R || (l = m9749M().m9501l()) == null) {
            return false;
        } else {
            m9760G0(true);
            int i = 4;
            if (l.mo9386Me()) {
                AbstractC9323v4<?> n = m9749M().m9499n();
                if (!z) {
                    i = 2;
                }
                m9696t0(n, l, false, i);
            } else {
                AbstractC9323v4<?> n2 = m9749M().m9499n();
                if (!z) {
                    i = 1;
                }
                m9696t0(n2, l, false, i);
            }
            return true;
        }
    }

    public final void m9699s() {
        C1379j0.m37307r(this.f29949T).m14471l0();
    }

    public boolean m9698s0(boolean z) {
        AbstractC9323v4<?> l = m9749M().m9501l();
        return l != null && l.mo9276cd(z);
    }

    public final void m9697t() {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29948S;
        if (arrayList != null) {
            arrayList.clear();
            this.f29948S = null;
        }
    }

    public void m9696t0(AbstractC9323v4<?> v4Var, AbstractC9323v4<?> v4Var2, boolean z, int i) {
        m9692v0();
        int i2 = 2;
        m9758H0(2, v4Var, v4Var2);
        int i3 = 0;
        if (z) {
            v4Var2.mo9421I8(this.f29969k0, this.f29970l0);
            m9716j(v4Var2);
            if (v4Var.mo9386Me()) {
                m9688x0(v4Var);
            }
        } else {
            v4Var.mo9421I8(this.f29969k0, this.f29970l0);
            m9714k(v4Var, 0);
        }
        if (!(i == 3 || i == 4 || v4Var.mo9386Me())) {
            m9752K0();
        }
        this.f29972n0 = z ? 1.0f : 0.0f;
        this.f29965g0 = v4Var;
        this.f29966h0 = v4Var2;
        this.f29967i0 = v4Var.get();
        this.f29968j0 = v4Var2.get();
        this.f29954Y = i;
        this.f29955Z = z;
        this.f29959b0 = this.f29958b.getMeasuredWidth();
        this.f29961c0 = this.f29958b.getMeasuredHeight();
        this.f29962d0 = -(this.f29959b0 / 3.5f);
        if (z) {
            this.f29965g0.mo9222kc();
            int i4 = this.f29954Y;
            if (i4 == 1) {
                this.f29963e0 = this.f29959b0;
                this.f29967i0.setTranslationX(0.0f);
                this.f29968j0.setTranslationX(this.f29959b0);
                this.f29968j0.setTranslationY(0.0f);
                this.f29968j0.setAlpha(1.0f);
                this.f29942M.getFilling().m9011q0(v4Var.mo9386Me(), 0.0f, v4Var.mo9293aa());
                if (!v4Var.mo9386Me()) {
                    this.f29945P.setAlpha(0.0f);
                    this.f29945P.setVisibility(0);
                }
                this.f29943N.setTranslationX(this.f29959b0 - C4896n.m24474i());
                this.f29943N.setAlpha(0.92f);
                this.f29943N.setVisibility(0);
            } else if (i4 == 2) {
                this.f29963e0 = this.f29961c0;
                this.f29967i0.setTranslationX(0.0f);
                this.f29968j0.setTranslationX(0.0f);
                this.f29968j0.setTranslationY(this.f29961c0);
                this.f29942M.getFilling().m9011q0(false, 0.0f, 0);
                if (!v4Var.mo9386Me()) {
                    this.f29945P.setAlpha(0.0f);
                    this.f29945P.setVisibility(0);
                }
                this.f29944O.setTranslationY(this.f29961c0 - C4896n.m24473j());
                this.f29944O.setAlpha(1.0f);
                C6879f3 f3Var = this.f29944O;
                if (!v4Var2.mo9416Ie()) {
                    i3 = 8;
                }
                f3Var.setVisibility(i3);
            } else if (i4 == 3) {
                this.f29963e0 = 0.0f;
                this.f29967i0.setTranslationX(0.0f);
                this.f29968j0.setTranslationX(0.0f);
                this.f29968j0.setTranslationY(0.0f);
                this.f29968j0.setAlpha(0.0f);
                this.f29942M.getFilling().m9011q0(false, 0.0f, 0);
            } else if (i4 == 4) {
                this.f29963e0 = 0.0f;
                this.f29967i0.setTranslationX(0.0f);
                this.f29968j0.setTranslationX(0.0f);
                this.f29968j0.setTranslationY(0.0f);
                this.f29968j0.setAlpha(1.0f);
                this.f29967i0.setAlpha(1.0f);
                this.f29942M.getFilling().m9011q0(false, 0.0f, 0);
            }
        } else {
            this.f29963e0 = 0.0f;
            this.f29966h0.mo9222kc();
            this.f29967i0.setVisibility(0);
            int i5 = this.f29954Y;
            if (i5 == 1) {
                this.f29968j0.setTranslationX(0.0f);
                this.f29967i0.setTranslationX(this.f29962d0);
                this.f29967i0.setAlpha(1.0f);
                this.f29942M.getFilling().m9011q0(v4Var.mo9386Me(), -this.f29962d0, v4Var.mo9293aa());
                if (!v4Var.mo9386Me()) {
                    this.f29945P.setAlpha(0.08f);
                    this.f29945P.setVisibility(0);
                }
                this.f29943N.setAlpha(1.0f);
                this.f29943N.setTranslationX(-C4896n.m24474i());
                this.f29943N.setVisibility(0);
            } else if (i5 == 2) {
                this.f29968j0.setTranslationY(0.0f);
                this.f29968j0.setTranslationX(0.0f);
                this.f29967i0.setTranslationX(0.0f);
                this.f29967i0.setTranslationY(0.0f);
                this.f29942M.getFilling().m9011q0(false, 0.0f, 0);
                if (!v4Var.mo9386Me()) {
                    this.f29945P.setAlpha(0.08f);
                    this.f29945P.setVisibility(0);
                }
                this.f29944O.setAlpha(1.0f);
                this.f29944O.setTranslationY(-C4896n.m24473j());
                C6879f3 f3Var2 = this.f29944O;
                if (!v4Var2.mo9416Ie()) {
                    i3 = 8;
                }
                f3Var2.setVisibility(i3);
            } else if (i5 == 3) {
                this.f29967i0.setTranslationX(0.0f);
                this.f29968j0.setTranslationX(0.0f);
                this.f29968j0.setTranslationY(0.0f);
                this.f29942M.getFilling().m9011q0(false, 0.0f, 0);
            } else if (i5 == 4) {
                this.f29967i0.setTranslationX(0.0f);
                this.f29968j0.setTranslationX(0.0f);
                this.f29968j0.setTranslationY(0.0f);
                this.f29968j0.setAlpha(1.0f);
                this.f29967i0.setAlpha(1.0f);
                this.f29942M.getFilling().m9011q0(false, 0.0f, 0);
            }
        }
        m9694u0(v4Var, v4Var2, z, i);
        m9725e0();
        m9717i0();
        if (z) {
            i2 = 1;
        }
        m9690w0(i2);
    }

    public final void m9695u() {
        m9762F0(0.0f);
        this.f29942M.m10034r2();
        m9684z0(this.f29965g0);
        int i = this.f29954Y;
        if (i == 1) {
            this.f29943N.setVisibility(8);
        } else if (i == 2) {
            this.f29944O.setVisibility(8);
        }
        if (!this.f29965g0.mo9386Me()) {
            m9770B0();
        }
        this.f29966h0.mo9166sc();
        this.f29965g0 = null;
        this.f29966h0 = null;
        this.f29967i0 = null;
        this.f29968j0 = null;
    }

    public final void m9694u0(AbstractC9323v4<?> v4Var, AbstractC9323v4<?> v4Var2, boolean z, int i) {
        float f = z ? 1.0f : 0.0f;
        this.f29964f0 = f;
        this.f29942M.m10021y3(v4Var, v4Var2, z, i, f);
        if (z || !v4Var2.mo9386Me()) {
            this.f29957a0 = this.f29942M.getCurrentHeight();
        } else {
            this.f29957a0 = v4Var.mo8865M9();
        }
    }

    public void m9693v(float f) {
        int i;
        if (this.f29947R && m9749M().m9500m() > 0) {
            float f2 = this.f29963e0;
            if (f2 == 0.0f || (i = this.f29954Y) == 4) {
                m9771B();
                return;
            }
            if (i == 2) {
                this.f29972n0 = f2 / this.f29961c0;
            } else {
                this.f29972n0 = f2 / this.f29959b0;
            }
            final float G = m9761G();
            ValueAnimator b = C2057b.m35734b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9270q1.this.m9729c0(G, valueAnimator);
                }
            });
            b.setInterpolator(C2057b.f7280b);
            b.addListener(new C9274d());
            if (this.f29954Y == 2) {
                b.setDuration(m9702q(this.f29963e0, f, 300, 160));
            } else {
                b.setDuration(m9702q(this.f29963e0, f, 200, 60));
            }
            b.start();
        }
    }

    public void m9692v0() {
        this.f29958b.m10173E1();
        this.f29942M.m10131B3();
        this.f29960c.m9613E1();
    }

    public void m9691w() {
        m9693v(0.0f);
    }

    public void m9690w0(int i) {
    }

    public void m9689x() {
    }

    public final void m9688x0(AbstractC9323v4<?> v4Var) {
        if (!v4Var.mo9228jd()) {
            this.f29958b.removeView(v4Var.get());
            this.f29958b.addView(v4Var.get(), 0);
        }
        this.f29942M.getFilling().m9025i0(false);
    }

    public final void m9687y(Configuration configuration) {
        Iterator<AbstractC9323v4<?>> it = m9749M().m9502k().iterator();
        while (it.hasNext()) {
            it.next().mo9208mc(configuration);
        }
    }

    public void m9686y0(AbstractC9323v4<?> v4Var, boolean z, boolean z2) {
        if (z) {
            m9723f0(v4Var, z2 ? 20 : 4);
        } else {
            m9723f0(v4Var, z2 ? 28 : 12);
        }
    }

    public void m9685z() {
        this.f29953X = true;
        C11541z.m7t().m42S(this);
        m9749M().m9511b(this);
        m9697t();
        C4403w.m27988F2(this);
        View$OnClickListenerC9170d1 d1Var = this.f29942M;
        if (d1Var != null) {
            d1Var.mo4501a3();
        }
        C9292s1 s1Var = this.f29960c;
        if (s1Var != null) {
            s1Var.mo4501a3();
        }
        C9290s0 s0Var = this.f29946Q;
        if (s0Var != null) {
            s0Var.mo4501a3();
        }
    }

    public void m9684z0(AbstractC9323v4<?> v4Var) {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29948S;
        if (arrayList != null) {
            arrayList.remove(v4Var);
        }
        if (v4Var.mo9386Me()) {
            this.f29958b.removeView(v4Var.get());
        } else {
            this.f29960c.removeView(v4Var.get());
        }
        v4Var.mo9216lc();
        v4Var.mo9266e9();
        v4Var.m9235ic(this, false);
        m9699s();
    }
}
