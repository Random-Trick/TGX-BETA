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
    public View$OnClickListenerC9170d1 f29945M;
    public C6879f3 f29946N;
    public C6879f3 f29947O;
    public View f29948P;
    public C9290s0 f29949Q;
    public boolean f29950R;
    public ArrayList<AbstractC9323v4<?>> f29951S;
    public final Context f29952T;
    public View f29953U;
    public boolean f29954V;
    public C11537v f29955W;
    public boolean f29956X;
    public int f29957Y;
    public boolean f29958Z;
    public HandlerC9298t1 f29959a = new HandlerC9298t1(this);
    public float f29960a0;
    public C9153b2 f29961b;
    public float f29962b0;
    public C9292s1 f29963c;
    public float f29964c0;
    public float f29965d0;
    public float f29966e0;
    public float f29967f0;
    public AbstractC9323v4<?> f29968g0;
    public AbstractC9323v4<?> f29969h0;
    public View f29970i0;
    public View f29971j0;
    public float f29972k0;
    public float f29973l0;
    public boolean f29974m0;
    public float f29975n0;
    public Object f29976o0;

    public class View$OnAttachStateChangeListenerC9271a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC9271a() {
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            C9270q1.this.f29954V = true;
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            C9270q1.this.f29954V = false;
        }
    }

    public class RunnableC9272b implements Runnable {
        public final int f29978M;
        public final boolean f29979N;
        public final AbstractC9323v4 f29981a;
        public final int f29982b;
        public final boolean f29983c;

        public RunnableC9272b(AbstractC9323v4 v4Var, int i, boolean z, int i2, boolean z2) {
            this.f29981a = v4Var;
            this.f29982b = i;
            this.f29983c = z;
            this.f29978M = i2;
            this.f29979N = z2;
        }

        @Override
        public void run() {
            if (this.f29981a.m9279ca() == this) {
                this.f29981a.m9173rd();
                if (C9270q1.this.f29956X) {
                    this.f29981a.mo417Z8();
                    return;
                }
                this.f29981a.m9218l9();
                C9270q1.this.m9709m(this.f29981a, this.f29982b, this.f29983c, this.f29978M, this.f29979N);
            }
        }
    }

    public class C9273c extends AnimatorListenerAdapter {
        public final Runnable f29984a;

        public C9273c(Runnable runnable) {
            this.f29984a = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f29984a.run();
        }
    }

    public class C9274d extends AnimatorListenerAdapter {
        public C9274d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C9270q1.this.m9772A(2);
        }
    }

    public class C9275e extends AnimatorListenerAdapter {
        public C9275e() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C9270q1.this.m9772A(1);
        }
    }

    public C9270q1(Context context) {
        this.f29952T = context;
    }

    public void m9735Y(boolean z, int i, AbstractC9323v4 v4Var, AbstractC9323v4 v4Var2, AbstractC9323v4 v4Var3) {
        boolean z2 = true;
        if (z) {
            m9769B0();
            if (i != 0) {
                this.f29945M.m10042n2(v4Var);
                HandlerC9298t1 t1Var = this.f29959a;
                if ((i & 16) != 16) {
                    z2 = false;
                }
                t1Var.m9598l(v4Var, z2);
            } else {
                this.f29945M.m10042n2(m9748M().m9501l());
                this.f29959a.m9594p();
            }
            m9688x();
            m9757H0(0, v4Var2, v4Var3);
            m9746N0();
            return;
        }
        m9772A(1);
    }

    public void m9734Z(ValueAnimator valueAnimator) {
        m9761F0(1.0f - C2057b.m35738a(valueAnimator));
    }

    public void m9732a0(ValueAnimator valueAnimator) {
        m9761F0(C2057b.m35738a(valueAnimator));
    }

    public void m9730b0(float f, float f2, ValueAnimator valueAnimator) {
        m9761F0(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public void m9728c0(float f, ValueAnimator valueAnimator) {
        m9761F0(f - (C2057b.m35738a(valueAnimator) * f));
    }

    public void m9726d0(View view) {
        AbstractC9323v4<?> l = this.f29959a.m9603g().m9501l();
        if (l != null) {
            l.mo9174rc();
        }
    }

    public static int m9701q(float f, float f2, int i, int i2) {
        return f2 <= 0.0f ? i : Math.min(Math.max(Math.round(f / (f2 / 1000.0f)), i2), i);
    }

    public final void m9772A(int i) {
        m9688x();
        m9691v0();
        AbstractC9323v4<?> n = m9748M().m9499n();
        m9769B0();
        m9757H0(0, this.f29968g0, this.f29969h0);
        if (i == 1) {
            this.f29945M.m10042n2(n);
            if (n != null && n.mo9386Me()) {
                m9705o(n);
            }
            this.f29959a.m9593q();
        } else if (i == 2) {
            this.f29945M.m10033r2();
            AbstractC9323v4<?> l = m9748M().m9501l();
            if (l != null) {
                l.mo9166sc();
            }
            this.f29959a.m9597m(n);
        } else if (i == 3) {
            m9694u();
            this.f29959a.m9597m(n);
        }
        m9724e0();
        this.f29968g0 = null;
        this.f29969h0 = null;
        this.f29970i0 = null;
        this.f29971j0 = null;
        m9746N0();
    }

    public void m9771A0() {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29951S;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                m9683z0(this.f29951S.get(size));
            }
        }
        this.f29963c.removeAllViews();
        m9698s();
    }

    public void m9770B() {
        m9772A(3);
    }

    public void m9769B0() {
        this.f29948P.setVisibility(8);
        this.f29963c.removeView(this.f29948P);
    }

    public boolean m9768C() {
        return m9699r0(0.0f, true);
    }

    public void m9767C0() {
        m9748M().m9511b(this);
        m9696t();
    }

    public View get() {
        if (this.f29953U == null) {
            View l0 = m9710l0(this.f29952T);
            this.f29953U = l0;
            l0.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC9271a());
            this.f29953U.setTag(this);
            C11541z.m7t().m23f(this);
        }
        return this.f29953U;
    }

    public final void m9765D0(AbstractC9323v4<?> v4Var) {
        if (!this.f29950R && v4Var != null) {
            if (m9748M().m9496q()) {
                m9743Q(v4Var);
            } else {
                this.f29959a.m9596n(v4Var);
            }
        }
    }

    public Context m9764E() {
        return this.f29952T;
    }

    public void m9763E0(AbstractC9323v4<?> v4Var, boolean z, boolean z2) {
        if (v4Var == null) {
            return;
        }
        if (m9748M().m9496q()) {
            m9743Q(v4Var);
        } else {
            this.f29959a.m9595o(v4Var, z, z2);
        }
    }

    public AbstractC9323v4<?> m9762F() {
        return m9748M().m9501l();
    }

    public void m9761F0(float f) {
        float f2;
        if (this.f29975n0 != f) {
            float d = C5069h.m24090d(f);
            this.f29975n0 = d;
            if (this.f29957Y == 2) {
                f2 = Math.round(this.f29964c0 * d);
            } else {
                f2 = this.f29962b0 * d;
            }
            this.f29966e0 = f2;
            int i = this.f29957Y;
            if (i == 1) {
                this.f29945M.setTranslation(d);
                float f3 = 1.0f - d;
                float f4 = this.f29965d0 * f3;
                if (C4403w.m27986G2()) {
                    this.f29971j0.setTranslationX(-f2);
                    this.f29968g0.get().setTranslationX(-f4);
                } else {
                    this.f29971j0.setTranslationX(f2);
                    this.f29968g0.get().setTranslationX(f4);
                }
                if (this.f29968g0.mo9386Me()) {
                    this.f29945M.getFilling().m9044W(-f4);
                }
                if (!this.f29968g0.mo9386Me()) {
                    this.f29948P.setAlpha(0.08f * f3);
                }
                this.f29946N.setTranslationX(C4403w.m27986G2() ? (-f2) + this.f29962b0 : f2 - C4896n.m24475i());
                this.f29946N.setAlpha((f3 * 0.45f) + 0.65f);
            } else if (i == 2) {
                this.f29971j0.setTranslationY(f2);
                if (!this.f29968g0.mo9386Me()) {
                    this.f29948P.setAlpha((1.0f - d) * 0.08f);
                }
                this.f29947O.setTranslationY(f2 - C4896n.m24474j());
                this.f29947O.setAlpha(1.0f);
                this.f29945M.getFilling().m9026i(f2);
                if (f2 < this.f29960a0 + View$OnClickListenerC9170d1.getTopOffset()) {
                    if (this.f29969h0.mo9293aa() == -16777216) {
                        this.f29970i0.setAlpha(0.0f);
                    }
                    View$OnClickListenerC9170d1 d1Var = this.f29945M;
                    float topOffset = f2 / (this.f29960a0 + View$OnClickListenerC9170d1.getTopOffset());
                    this.f29967f0 = topOffset;
                    d1Var.setTranslation(topOffset);
                } else if (this.f29967f0 != 1.0f) {
                    this.f29970i0.setAlpha(1.0f);
                    this.f29967f0 = 1.0f;
                    this.f29945M.setTranslation(1.0f);
                }
            } else if (i == 3) {
                this.f29945M.setTranslation(d);
                this.f29971j0.setAlpha(1.0f - d);
            }
            m9746N0();
        }
    }

    public float m9760G() {
        return this.f29975n0;
    }

    public void m9759G0(boolean z) {
        if (this.f29950R != z) {
            this.f29950R = z;
            ((AbstractView$OnTouchListenerC7889a) this.f29952T).m14491f3(z);
            C1379j0.m37310r(this.f29952T).m14463m3(1, z);
            Object obj = this.f29976o0;
            if (obj != null) {
                ((ActionMode) obj).finish();
            }
            if (!z) {
                this.f29959a.m9608b();
            }
        }
    }

    public C9290s0 m9758H() {
        return this.f29949Q;
    }

    public void m9757H0(int i, AbstractC9323v4<?> v4Var, AbstractC9323v4<?> v4Var2) {
        boolean z;
        C6879f3 f3Var = this.f29946N;
        if (f3Var != null) {
            C1399s0.m37186f0(f3Var, i);
        }
        View view = this.f29948P;
        if (view != null) {
            C1399s0.m37186f0(view, i);
        }
        C6879f3 f3Var2 = this.f29947O;
        if (f3Var2 != null) {
            C1399s0.m37186f0(f3Var2, i);
        }
        C9290s0 s0Var = this.f29949Q;
        if (s0Var != null && !(z = AbstractC10190e.f32935O)) {
            C1399s0.m37186f0(s0Var, (i != 2 || !z) ? i : 1);
        }
        if (v4Var != null && v4Var.mo9473B8()) {
            C1399s0.m37186f0(v4Var.get(), i);
        }
        if (v4Var2 != null && v4Var2.mo9473B8()) {
            C1399s0.m37186f0(v4Var2.get(), i);
        }
    }

    public View$OnClickListenerC9170d1 m9756I() {
        return this.f29945M;
    }

    public void m9755I0(int i) {
        this.f29947O.setVisibility(i);
        this.f29946N.setVisibility(i);
    }

    public int m9754J() {
        if (!this.f29950R || this.f29957Y != 1) {
            return 0;
        }
        return (int) (this.f29961b.getMeasuredWidth() * this.f29975n0);
    }

    public boolean m9753J0() {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29951S;
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

    public AbstractC9323v4<?> m9752K() {
        return this.f29959a.m9604f();
    }

    public void m9751K0() {
        if (this.f29948P.getParent() != null) {
            this.f29963c.removeView(this.f29948P);
        }
        this.f29948P.setVisibility(0);
        this.f29963c.addView(this.f29948P, 1);
    }

    public AbstractC9323v4<?> m9750L() {
        return m9748M().m9499n();
    }

    public final void m9749L0(float f) {
        if (!this.f29950R) {
            return;
        }
        if (!C4403w.m27986G2() || this.f29957Y != 1) {
            m9761F0(f / this.f29962b0);
        } else {
            m9761F0((-f) / this.f29962b0);
        }
    }

    public C9312u1 m9748M() {
        return this.f29959a.m9603g();
    }

    public int m9747N() {
        return this.f29959a.m9602h();
    }

    public final void m9746N0() {
        ((AbstractView$OnTouchListenerC7889a) this.f29952T).m14579I3();
    }

    public C11537v m9745O() {
        if (this.f29955W == null) {
            this.f29955W = new C11537v();
        }
        return this.f29955W;
    }

    public final void m9744P() {
        C1379j0.m37310r(this.f29952T).m14477j1(true);
        View$OnClickListenerC9218k0 u = C1379j0.m37304u(this.f29952T);
        if (u != null) {
            u.m9895pf(0.0f, null);
        }
    }

    public void m9743Q(AbstractC9323v4<?> v4Var) {
        if (!this.f29950R && v4Var != null) {
            C9312u1 M = m9748M();
            v4Var.get();
            M.m9511b(this);
            M.m9493t(v4Var, true);
            m9771A0();
            m9715j(v4Var);
            this.f29959a.m9609a(v4Var);
            m9756I().setTitle(v4Var);
            if (v4Var.mo9386Me()) {
                v4Var.mo9435G8(1.0f);
            }
        }
    }

    public void m9742R(AbstractC9323v4<?> v4Var, int i) {
        if (!this.f29950R && v4Var != null) {
            this.f29959a.m9601i(v4Var, i);
        }
    }

    public boolean m9741S() {
        return this.f29950R;
    }

    public boolean m9740T() {
        if (this.f29950R && !this.f29958Z) {
            float f = this.f29966e0;
            if (f != 0.0f && f != 1.0f && this.f29974m0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mo9343T5(int i, int i2) {
        if (C4403w.m27983H1(i, i2)) {
            if (C1399s0.m37192c0(this.f29949Q, (C4403w.m27986G2() ? 3 : 5) | 48)) {
                C1399s0.m37148y0(this.f29949Q);
            }
            if (this.f29946N != null) {
                if (C4403w.m27986G2()) {
                    this.f29946N.setSimpleRightShadow(false);
                } else {
                    this.f29946N.setSimpleLeftShadow(false);
                }
            }
        }
        View$OnClickListenerC9170d1 d1Var = this.f29945M;
        if (d1Var != null) {
            d1Var.mo9343T5(i, i2);
        }
    }

    public boolean m9739U() {
        return this.f29950R && this.f29957Y != 4;
    }

    public final boolean m9738V() {
        AbstractC9323v4<?> l = m9748M().m9501l();
        return l != null && l.m9278cb();
    }

    public boolean m9737W() {
        return this.f29956X;
    }

    @Override
    public boolean mo136W0() {
        return true;
    }

    public boolean m9736X() {
        return this.f29959a.m9603g().m9513C() == 0;
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        C11525k.m139b(this, pVar, pVar2);
    }

    public void m9724e0() {
        this.f29961b.m10173D1();
        this.f29945M.m10025v3();
        this.f29963c.m9613D1();
    }

    public void m9722f0(AbstractC9323v4<?> v4Var, int i) {
        boolean z;
        int i2;
        boolean z2;
        m9744P();
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
                AbstractC9323v4<?> l = m9748M().m9501l();
                boolean s9 = v4Var.mo9169s9();
                if (s9 || l == null || l.mo9177r9()) {
                    i4 = 3;
                } else if (!l.mo9386Me()) {
                    i4 = 1;
                }
                z2 = s9;
            }
            if (!C4868i.m24727c2().m24827O2() || i4 != 1) {
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
        if (!v4Var.mo9270dc() || !this.f29954V) {
            v4Var.m9218l9();
            m9709m(v4Var, i2, z3, i3, z);
            return;
        }
        v4Var.m9114zd(new RunnableC9272b(v4Var, i2, z3, i3, z), v4Var.mo9125y9(z));
    }

    public final boolean m9720g0() {
        if (this.f29950R || m9748M().m9500m() <= 0 || m9738V()) {
            return false;
        }
        this.f29959a.m9600j();
        return true;
    }

    public final boolean m9718h0(AbstractC9323v4<?> v4Var) {
        if (this.f29950R || m9747N() <= 0 || v4Var == null || m9738V()) {
            return false;
        }
        this.f29950R = true;
        this.f29959a.m9599k(v4Var);
        return true;
    }

    public final void m9716i0() {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29951S;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f29951S.get(size).m9242hc();
            }
        }
    }

    public void m9715j(AbstractC9323v4<?> v4Var) {
        if (this.f29951S == null) {
            this.f29951S = new ArrayList<>();
        }
        this.f29951S.add(v4Var);
        v4Var.mo9421I8(this.f29972k0, this.f29973l0);
        if (!v4Var.mo9386Me()) {
            this.f29963c.addView(v4Var.get());
        } else if (v4Var.mo9228jd()) {
            this.f29961b.addView(v4Var.get(), 0);
        } else {
            this.f29961b.addView(v4Var.get(), this.f29961b.getChildCount() - 2);
        }
        v4Var.mo9384N8(this);
        v4Var.mo9477Ac();
        v4Var.m9235ic(this, true);
        m9698s();
    }

    public boolean m9714j0(boolean z) {
        if (this.f29945M.m10048k3()) {
            this.f29945M.m10026v2(true, true);
            return true;
        }
        AbstractC9323v4<?> l = m9748M().m9501l();
        if (this.f29945M.m10051j3()) {
            if (l != null && l.mo9314X8(z)) {
                return true;
            }
            this.f29945M.m10029t2(true, null);
            return true;
        } else if (l == null) {
            return false;
        } else {
            if (l.mo404jc(z)) {
                return true;
            }
            if (m9747N() <= 1) {
                return false;
            }
            m9720g0();
            return true;
        }
    }

    public void m9713k(AbstractC9323v4<?> v4Var, int i) {
        if (this.f29951S == null) {
            this.f29951S = new ArrayList<>();
        }
        this.f29951S.add(i, v4Var);
        if (v4Var.mo9386Me()) {
            this.f29961b.addView(v4Var.get(), 0);
        } else {
            this.f29963c.addView(v4Var.get(), i);
        }
        v4Var.mo9384N8(this);
        v4Var.mo9477Ac();
        v4Var.m9235ic(this, true);
        m9698s();
    }

    public void m9712k0() {
        AbstractC9323v4<?> l = m9748M().m9501l();
        if (l != null) {
            l.mo9222kc();
        }
    }

    public void m9711l(View view) {
        C9153b2 b2Var = this.f29961b;
        b2Var.addView(view, b2Var.indexOfChild(this.f29945M));
    }

    public View m9710l0(Context context) {
        C9153b2 b2Var = new C9153b2(context);
        this.f29961b = b2Var;
        b2Var.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f29961b.setId(R.id.nav_root);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C4896n.m24475i(), -1, 3);
        t1.setMargins(0, View$OnClickListenerC9170d1.m10065c3(true), 0, 0);
        C6879f3 f3Var = new C6879f3(context);
        this.f29946N = f3Var;
        f3Var.setLayoutParams(t1);
        if (C4403w.m27986G2()) {
            this.f29946N.setSimpleRightShadow(false);
        } else {
            this.f29946N.setSimpleLeftShadow(false);
        }
        this.f29946N.setVisibility(8);
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-1, C4896n.m24474j(), 48);
        C6879f3 f3Var2 = new C6879f3(context);
        this.f29947O = f3Var2;
        f3Var2.setSimpleTopShadow(true);
        this.f29947O.setVisibility(8);
        this.f29947O.setLayoutParams(t12);
        View view = new View(context);
        this.f29948P = view;
        view.setBackgroundColor(-16777216);
        this.f29948P.setVisibility(8);
        this.f29948P.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        C9292s1 s1Var = new C9292s1(context);
        this.f29963c = s1Var;
        s1Var.setController(this);
        this.f29963c.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f29963c.setId(R.id.nav_wrapper);
        View$OnClickListenerC9170d1 d1Var = new View$OnClickListenerC9170d1(context);
        this.f29945M = d1Var;
        d1Var.m10046l3(this);
        this.f29945M.setId(R.id.nav_header);
        this.f29961b.addView(this.f29963c);
        this.f29961b.addView(this.f29946N);
        this.f29961b.addView(this.f29947O);
        this.f29961b.addView(this.f29945M);
        C9290s0 s0Var = new C9290s0(context);
        this.f29949Q = s0Var;
        s0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                C9270q1.this.m9726d0(view2);
            }
        });
        this.f29961b.addView(this.f29949Q);
        C4403w.m27877h(this);
        return this.f29961b;
    }

    public void m9709m(final AbstractC9323v4<?> v4Var, int i, final boolean z, final int i2, boolean z2) {
        AbstractC9323v4<?> v4Var2;
        AbstractC9323v4<?> v4Var3;
        if (z) {
            AbstractC9323v4<?> n = m9748M().m9499n();
            m9695t0(n, v4Var, true, i);
            v4Var3 = n;
            v4Var2 = v4Var;
        } else {
            AbstractC9323v4<?> l = m9748M().m9501l();
            m9695t0(v4Var, l, false, i);
            v4Var2 = l;
            v4Var3 = v4Var;
        }
        final AbstractC9323v4<?> v4Var4 = v4Var3;
        final AbstractC9323v4<?> v4Var5 = v4Var2;
        Runnable p1Var = new Runnable() {
            @Override
            public final void run() {
                C9270q1.this.m9735Y(z, i2, v4Var, v4Var4, v4Var5);
            }
        };
        if (!this.f29954V) {
            m9761F0(z ? 0.0f : 1.0f);
            p1Var.run();
            return;
        }
        this.f29974m0 = true;
        ValueAnimator b = C2057b.m35737b();
        if (z) {
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9270q1.this.m9734Z(valueAnimator);
                }
            });
        } else {
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9270q1.this.m9732a0(valueAnimator);
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
        C2057b.m35736c(z ? v4Var2.get() : v4Var3.get(), b);
    }

    public void m9708m0() {
        AbstractC9323v4<?> l = m9748M().m9501l();
        if (l != null) {
            l.mo9166sc();
        }
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        AbstractC9323v4<?> v4Var;
        boolean z2;
        if (!this.f29950R || ((!(z2 = this.f29958Z) || this.f29975n0 != 1.0f) && (z2 || this.f29975n0 != 0.0f))) {
            v4Var = m9762F();
        } else {
            v4Var = m9750L();
        }
        if (v4Var != null) {
            this.f29945M.m10123E3(v4Var, null);
        }
        C11537v vVar = this.f29955W;
        if (vVar != null) {
            vVar.m66n(z);
        }
    }

    public boolean m9707n(float f, float f2) {
        if (this.f29972k0 == f) {
            return false;
        }
        this.f29972k0 = f;
        this.f29973l0 = f2;
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29951S;
        if (arrayList == null) {
            return true;
        }
        Iterator<AbstractC9323v4<?>> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo9421I8(f, f2);
        }
        return true;
    }

    public void m9706n0(boolean z) {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29951S;
        if (arrayList != null) {
            Iterator<AbstractC9323v4<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo9136wc(z);
            }
        }
    }

    public final void m9705o(AbstractC9323v4<?> v4Var) {
        if (!v4Var.mo9228jd()) {
            this.f29961b.removeView(v4Var.get());
            this.f29961b.addView(v4Var.get(), this.f29961b.getChildCount() - 2);
        }
        this.f29945M.getFilling().m9025i0(true);
    }

    public void m9704o0() {
        AbstractC9323v4<?> l = m9748M().m9501l();
        if (l != null) {
            l.mo9477Ac();
        }
    }

    public void m9703p(float f) {
        if (this.f29950R && m9748M().m9500m() > 0) {
            if (this.f29957Y == 2) {
                this.f29975n0 = this.f29966e0 / this.f29964c0;
            } else {
                this.f29975n0 = this.f29966e0 / this.f29962b0;
            }
            final float G = m9760G();
            final float f2 = 1.0f - G;
            ValueAnimator b = C2057b.m35737b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9270q1.this.m9730b0(G, f2, valueAnimator);
                }
            });
            b.setInterpolator(C2057b.f7280b);
            b.addListener(new C9275e());
            if (this.f29957Y == 2) {
                b.setDuration(m9701q(this.f29964c0 - this.f29966e0, f, 300, 160));
            } else {
                b.setDuration(m9701q(this.f29962b0 - this.f29966e0, f, 200, 60));
            }
            b.start();
        }
    }

    public boolean m9702p0(float f) {
        return m9699r0(f, false);
    }

    @Override
    public void mo133q0(int i) {
        C11525k.m140a(this, i);
    }

    public void m9700r() {
        this.f29961b.m10174C1();
        this.f29945M.m10038p2();
        this.f29963c.m9614C1();
    }

    public final boolean m9699r0(float f, boolean z) {
        AbstractC9323v4<?> l;
        if (m9748M().m9500m() <= 0) {
            this.f29959a.m9606d();
            return false;
        } else if (this.f29950R || (l = m9748M().m9501l()) == null) {
            return false;
        } else {
            m9759G0(true);
            int i = 4;
            if (l.mo9386Me()) {
                AbstractC9323v4<?> n = m9748M().m9499n();
                if (!z) {
                    i = 2;
                }
                m9695t0(n, l, false, i);
            } else {
                AbstractC9323v4<?> n2 = m9748M().m9499n();
                if (!z) {
                    i = 1;
                }
                m9695t0(n2, l, false, i);
            }
            return true;
        }
    }

    public final void m9698s() {
        C1379j0.m37310r(this.f29952T).m14470l0();
    }

    public boolean m9697s0(boolean z) {
        AbstractC9323v4<?> l = m9748M().m9501l();
        return l != null && l.mo9276cd(z);
    }

    public final void m9696t() {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29951S;
        if (arrayList != null) {
            arrayList.clear();
            this.f29951S = null;
        }
    }

    public void m9695t0(AbstractC9323v4<?> v4Var, AbstractC9323v4<?> v4Var2, boolean z, int i) {
        m9691v0();
        int i2 = 2;
        m9757H0(2, v4Var, v4Var2);
        int i3 = 0;
        if (z) {
            v4Var2.mo9421I8(this.f29972k0, this.f29973l0);
            m9715j(v4Var2);
            if (v4Var.mo9386Me()) {
                m9687x0(v4Var);
            }
        } else {
            v4Var.mo9421I8(this.f29972k0, this.f29973l0);
            m9713k(v4Var, 0);
        }
        if (!(i == 3 || i == 4 || v4Var.mo9386Me())) {
            m9751K0();
        }
        this.f29975n0 = z ? 1.0f : 0.0f;
        this.f29968g0 = v4Var;
        this.f29969h0 = v4Var2;
        this.f29970i0 = v4Var.get();
        this.f29971j0 = v4Var2.get();
        this.f29957Y = i;
        this.f29958Z = z;
        this.f29962b0 = this.f29961b.getMeasuredWidth();
        this.f29964c0 = this.f29961b.getMeasuredHeight();
        this.f29965d0 = -(this.f29962b0 / 3.5f);
        if (z) {
            this.f29968g0.mo9222kc();
            int i4 = this.f29957Y;
            if (i4 == 1) {
                this.f29966e0 = this.f29962b0;
                this.f29970i0.setTranslationX(0.0f);
                this.f29971j0.setTranslationX(this.f29962b0);
                this.f29971j0.setTranslationY(0.0f);
                this.f29971j0.setAlpha(1.0f);
                this.f29945M.getFilling().m9011q0(v4Var.mo9386Me(), 0.0f, v4Var.mo9293aa());
                if (!v4Var.mo9386Me()) {
                    this.f29948P.setAlpha(0.0f);
                    this.f29948P.setVisibility(0);
                }
                this.f29946N.setTranslationX(this.f29962b0 - C4896n.m24475i());
                this.f29946N.setAlpha(0.92f);
                this.f29946N.setVisibility(0);
            } else if (i4 == 2) {
                this.f29966e0 = this.f29964c0;
                this.f29970i0.setTranslationX(0.0f);
                this.f29971j0.setTranslationX(0.0f);
                this.f29971j0.setTranslationY(this.f29964c0);
                this.f29945M.getFilling().m9011q0(false, 0.0f, 0);
                if (!v4Var.mo9386Me()) {
                    this.f29948P.setAlpha(0.0f);
                    this.f29948P.setVisibility(0);
                }
                this.f29947O.setTranslationY(this.f29964c0 - C4896n.m24474j());
                this.f29947O.setAlpha(1.0f);
                C6879f3 f3Var = this.f29947O;
                if (!v4Var2.mo9416Ie()) {
                    i3 = 8;
                }
                f3Var.setVisibility(i3);
            } else if (i4 == 3) {
                this.f29966e0 = 0.0f;
                this.f29970i0.setTranslationX(0.0f);
                this.f29971j0.setTranslationX(0.0f);
                this.f29971j0.setTranslationY(0.0f);
                this.f29971j0.setAlpha(0.0f);
                this.f29945M.getFilling().m9011q0(false, 0.0f, 0);
            } else if (i4 == 4) {
                this.f29966e0 = 0.0f;
                this.f29970i0.setTranslationX(0.0f);
                this.f29971j0.setTranslationX(0.0f);
                this.f29971j0.setTranslationY(0.0f);
                this.f29971j0.setAlpha(1.0f);
                this.f29970i0.setAlpha(1.0f);
                this.f29945M.getFilling().m9011q0(false, 0.0f, 0);
            }
        } else {
            this.f29966e0 = 0.0f;
            this.f29969h0.mo9222kc();
            this.f29970i0.setVisibility(0);
            int i5 = this.f29957Y;
            if (i5 == 1) {
                this.f29971j0.setTranslationX(0.0f);
                this.f29970i0.setTranslationX(this.f29965d0);
                this.f29970i0.setAlpha(1.0f);
                this.f29945M.getFilling().m9011q0(v4Var.mo9386Me(), -this.f29965d0, v4Var.mo9293aa());
                if (!v4Var.mo9386Me()) {
                    this.f29948P.setAlpha(0.08f);
                    this.f29948P.setVisibility(0);
                }
                this.f29946N.setAlpha(1.0f);
                this.f29946N.setTranslationX(-C4896n.m24475i());
                this.f29946N.setVisibility(0);
            } else if (i5 == 2) {
                this.f29971j0.setTranslationY(0.0f);
                this.f29971j0.setTranslationX(0.0f);
                this.f29970i0.setTranslationX(0.0f);
                this.f29970i0.setTranslationY(0.0f);
                this.f29945M.getFilling().m9011q0(false, 0.0f, 0);
                if (!v4Var.mo9386Me()) {
                    this.f29948P.setAlpha(0.08f);
                    this.f29948P.setVisibility(0);
                }
                this.f29947O.setAlpha(1.0f);
                this.f29947O.setTranslationY(-C4896n.m24474j());
                C6879f3 f3Var2 = this.f29947O;
                if (!v4Var2.mo9416Ie()) {
                    i3 = 8;
                }
                f3Var2.setVisibility(i3);
            } else if (i5 == 3) {
                this.f29970i0.setTranslationX(0.0f);
                this.f29971j0.setTranslationX(0.0f);
                this.f29971j0.setTranslationY(0.0f);
                this.f29945M.getFilling().m9011q0(false, 0.0f, 0);
            } else if (i5 == 4) {
                this.f29970i0.setTranslationX(0.0f);
                this.f29971j0.setTranslationX(0.0f);
                this.f29971j0.setTranslationY(0.0f);
                this.f29971j0.setAlpha(1.0f);
                this.f29970i0.setAlpha(1.0f);
                this.f29945M.getFilling().m9011q0(false, 0.0f, 0);
            }
        }
        m9693u0(v4Var, v4Var2, z, i);
        m9724e0();
        m9716i0();
        if (z) {
            i2 = 1;
        }
        m9689w0(i2);
    }

    public final void m9694u() {
        m9761F0(0.0f);
        this.f29945M.m10033r2();
        m9683z0(this.f29968g0);
        int i = this.f29957Y;
        if (i == 1) {
            this.f29946N.setVisibility(8);
        } else if (i == 2) {
            this.f29947O.setVisibility(8);
        }
        if (!this.f29968g0.mo9386Me()) {
            m9769B0();
        }
        this.f29969h0.mo9166sc();
        this.f29968g0 = null;
        this.f29969h0 = null;
        this.f29970i0 = null;
        this.f29971j0 = null;
    }

    public final void m9693u0(AbstractC9323v4<?> v4Var, AbstractC9323v4<?> v4Var2, boolean z, int i) {
        float f = z ? 1.0f : 0.0f;
        this.f29967f0 = f;
        this.f29945M.m10020y3(v4Var, v4Var2, z, i, f);
        if (z || !v4Var2.mo9386Me()) {
            this.f29960a0 = this.f29945M.getCurrentHeight();
        } else {
            this.f29960a0 = v4Var.mo8865M9();
        }
    }

    public void m9692v(float f) {
        int i;
        if (this.f29950R && m9748M().m9500m() > 0) {
            float f2 = this.f29966e0;
            if (f2 == 0.0f || (i = this.f29957Y) == 4) {
                m9770B();
                return;
            }
            if (i == 2) {
                this.f29975n0 = f2 / this.f29964c0;
            } else {
                this.f29975n0 = f2 / this.f29962b0;
            }
            final float G = m9760G();
            ValueAnimator b = C2057b.m35737b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9270q1.this.m9728c0(G, valueAnimator);
                }
            });
            b.setInterpolator(C2057b.f7280b);
            b.addListener(new C9274d());
            if (this.f29957Y == 2) {
                b.setDuration(m9701q(this.f29966e0, f, 300, 160));
            } else {
                b.setDuration(m9701q(this.f29966e0, f, 200, 60));
            }
            b.start();
        }
    }

    public void m9691v0() {
        this.f29961b.m10172E1();
        this.f29945M.m10130B3();
        this.f29963c.m9612E1();
    }

    public void m9690w() {
        m9692v(0.0f);
    }

    public void m9689w0(int i) {
    }

    public void m9688x() {
    }

    public final void m9687x0(AbstractC9323v4<?> v4Var) {
        if (!v4Var.mo9228jd()) {
            this.f29961b.removeView(v4Var.get());
            this.f29961b.addView(v4Var.get(), 0);
        }
        this.f29945M.getFilling().m9025i0(false);
    }

    public final void m9686y(Configuration configuration) {
        Iterator<AbstractC9323v4<?>> it = m9748M().m9502k().iterator();
        while (it.hasNext()) {
            it.next().mo9208mc(configuration);
        }
    }

    public void m9685y0(AbstractC9323v4<?> v4Var, boolean z, boolean z2) {
        if (z) {
            m9722f0(v4Var, z2 ? 20 : 4);
        } else {
            m9722f0(v4Var, z2 ? 28 : 12);
        }
    }

    public void m9684z() {
        this.f29956X = true;
        C11541z.m7t().m42S(this);
        m9748M().m9511b(this);
        m9696t();
        C4403w.m27990F2(this);
        View$OnClickListenerC9170d1 d1Var = this.f29945M;
        if (d1Var != null) {
            d1Var.mo4501a3();
        }
        C9292s1 s1Var = this.f29963c;
        if (s1Var != null) {
            s1Var.mo4501a3();
        }
        C9290s0 s0Var = this.f29949Q;
        if (s0Var != null) {
            s0Var.mo4501a3();
        }
    }

    public void m9683z0(AbstractC9323v4<?> v4Var) {
        ArrayList<AbstractC9323v4<?>> arrayList = this.f29951S;
        if (arrayList != null) {
            arrayList.remove(v4Var);
        }
        if (v4Var.mo9386Me()) {
            this.f29961b.removeView(v4Var.get());
        } else {
            this.f29963c.removeView(v4Var.get());
        }
        v4Var.mo9216lc();
        v4Var.mo9266e9();
        v4Var.m9235ic(this, false);
        m9698s();
    }
}
