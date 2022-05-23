package ud;

import ae.k;
import ae.l;
import ae.p;
import ae.v;
import ae.z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.view.ActionMode;
import android.view.View;
import android.widget.FrameLayout;
import ce.j0;
import ce.p0;
import gd.w;
import he.i;
import he.n;
import ib.h;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.f3;
import org.thunderdog.challegram.R;

public class q1 implements kb.e<View>, l, w.a {
    public d1 M;
    public f3 N;
    public f3 O;
    public View P;
    public s0 Q;
    public boolean R;
    public ArrayList<v4<?>> S;
    public final Context T;
    public View U;
    public boolean V;
    public v W;
    public boolean X;
    public int Y;
    public boolean Z;
    public t1 f24356a = new t1(this);
    public float f24357a0;
    public b2 f24358b;
    public float f24359b0;
    public s1 f24360c;
    public float f24361c0;
    public float f24362d0;
    public float f24363e0;
    public float f24364f0;
    public v4<?> f24365g0;
    public v4<?> f24366h0;
    public View f24367i0;
    public View f24368j0;
    public float f24369k0;
    public float f24370l0;
    public boolean f24371m0;
    public float f24372n0;
    public Object f24373o0;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            q1.this.V = true;
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            q1.this.V = false;
        }
    }

    public class b implements Runnable {
        public final int M;
        public final boolean N;
        public final v4 f24375a;
        public final int f24376b;
        public final boolean f24377c;

        public b(v4 v4Var, int i10, boolean z10, int i11, boolean z11) {
            this.f24375a = v4Var;
            this.f24376b = i10;
            this.f24377c = z10;
            this.M = i11;
            this.N = z11;
        }

        @Override
        public void run() {
            if (this.f24375a.ca() == this) {
                this.f24375a.rd();
                if (q1.this.X) {
                    this.f24375a.Z8();
                    return;
                }
                this.f24375a.l9();
                q1.this.m(this.f24375a, this.f24376b, this.f24377c, this.M, this.N);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {
        public final Runnable f24378a;

        public c(Runnable runnable) {
            this.f24378a = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f24378a.run();
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            q1.this.A(2);
        }
    }

    public class e extends AnimatorListenerAdapter {
        public e() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            q1.this.A(1);
        }
    }

    public q1(Context context) {
        this.T = context;
    }

    public void Y(boolean z10, int i10, v4 v4Var, v4 v4Var2, v4 v4Var3) {
        boolean z11 = true;
        if (z10) {
            B0();
            if (i10 != 0) {
                this.M.k2(v4Var);
                t1 t1Var = this.f24356a;
                if ((i10 & 16) != 16) {
                    z11 = false;
                }
                t1Var.l(v4Var, z11);
            } else {
                this.M.k2(M().l());
                this.f24356a.p();
            }
            x();
            H0(0, v4Var2, v4Var3);
            M0();
            return;
        }
        A(1);
    }

    public void Z(ValueAnimator valueAnimator) {
        F0(1.0f - db.b.a(valueAnimator));
    }

    public void a0(ValueAnimator valueAnimator) {
        F0(db.b.a(valueAnimator));
    }

    public void b0(float f10, float f11, ValueAnimator valueAnimator) {
        F0(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void c0(float f10, ValueAnimator valueAnimator) {
        F0(f10 - (db.b.a(valueAnimator) * f10));
    }

    public void d0(View view) {
        v4<?> l10 = this.f24356a.g().l();
        if (l10 != null) {
            l10.rc();
        }
    }

    public static int q(float f10, float f11, int i10, int i11) {
        return f11 <= 0.0f ? i10 : Math.min(Math.max(Math.round(f10 / (f11 / 1000.0f)), i11), i10);
    }

    public final void A(int i10) {
        x();
        v0();
        v4<?> n10 = M().n();
        B0();
        H0(0, this.f24365g0, this.f24366h0);
        if (i10 == 1) {
            this.M.k2(n10);
            if (n10 != null && n10.Me()) {
                o(n10);
            }
            this.f24356a.q();
        } else if (i10 == 2) {
            this.M.m2();
            v4<?> l10 = M().l();
            if (l10 != null) {
                l10.sc();
            }
            this.f24356a.m(n10);
        } else if (i10 == 3) {
            u();
            this.f24356a.m(n10);
        }
        e0();
        this.f24365g0 = null;
        this.f24366h0 = null;
        this.f24367i0 = null;
        this.f24368j0 = null;
        M0();
    }

    public void A0() {
        ArrayList<v4<?>> arrayList = this.S;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                z0(this.S.get(size));
            }
        }
        this.f24360c.removeAllViews();
        s();
    }

    public void B() {
        A(3);
    }

    public void B0() {
        this.P.setVisibility(8);
        this.f24360c.removeView(this.P);
    }

    public boolean C() {
        return r0(0.0f, true);
    }

    public void C0() {
        M().b(this);
        t();
    }

    @Override
    public void C4(int i10, int i11, float f10, boolean z10) {
        k.c(this, i10, i11, f10, z10);
    }

    public View get() {
        if (this.U == null) {
            View l02 = l0(this.T);
            this.U = l02;
            l02.addOnAttachStateChangeListener(new a());
            this.U.setTag(this);
            z.u().e(this);
        }
        return this.U;
    }

    public final void D0(v4<?> v4Var) {
        if (!this.R && v4Var != null) {
            if (M().q()) {
                Q(v4Var);
            } else {
                this.f24356a.n(v4Var);
            }
        }
    }

    public Context E() {
        return this.T;
    }

    public void E0(v4<?> v4Var, boolean z10, boolean z11) {
        if (v4Var == null) {
            return;
        }
        if (M().q()) {
            Q(v4Var);
        } else {
            this.f24356a.o(v4Var, z10, z11);
        }
    }

    public v4<?> F() {
        return M().l();
    }

    public void F0(float f10) {
        float f11;
        if (this.f24372n0 != f10) {
            float d10 = h.d(f10);
            this.f24372n0 = d10;
            if (this.Y == 2) {
                f11 = Math.round(this.f24361c0 * d10);
            } else {
                f11 = this.f24359b0 * d10;
            }
            this.f24363e0 = f11;
            int i10 = this.Y;
            if (i10 == 1) {
                this.M.setTranslation(d10);
                float f12 = 1.0f - d10;
                float f13 = this.f24362d0 * f12;
                if (w.G2()) {
                    this.f24368j0.setTranslationX(-f11);
                    this.f24365g0.get().setTranslationX(-f13);
                } else {
                    this.f24368j0.setTranslationX(f11);
                    this.f24365g0.get().setTranslationX(f13);
                }
                if (this.f24365g0.Me()) {
                    this.M.getFilling().X(-f13);
                }
                if (!this.f24365g0.Me()) {
                    this.P.setAlpha(0.08f * f12);
                }
                this.N.setTranslationX(w.G2() ? (-f11) + this.f24359b0 : f11 - n.i());
                this.N.setAlpha((f12 * 0.45f) + 0.65f);
            } else if (i10 == 2) {
                this.f24368j0.setTranslationY(f11);
                if (!this.f24365g0.Me()) {
                    this.P.setAlpha((1.0f - d10) * 0.08f);
                }
                this.O.setTranslationY(f11 - n.j());
                this.O.setAlpha(1.0f);
                this.M.getFilling().j(f11);
                if (f11 < this.f24357a0 + d1.getTopOffset()) {
                    if (this.f24366h0.aa() == -16777216) {
                        this.f24367i0.setAlpha(0.0f);
                    }
                    d1 d1Var = this.M;
                    float topOffset = f11 / (this.f24357a0 + d1.getTopOffset());
                    this.f24364f0 = topOffset;
                    d1Var.setTranslation(topOffset);
                } else if (this.f24364f0 != 1.0f) {
                    this.f24367i0.setAlpha(1.0f);
                    this.f24364f0 = 1.0f;
                    this.M.setTranslation(1.0f);
                }
            } else if (i10 == 3) {
                this.M.setTranslation(d10);
                this.f24368j0.setAlpha(1.0f - d10);
            }
            M0();
        }
    }

    public float G() {
        return this.f24372n0;
    }

    public void G0(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            ((org.thunderdog.challegram.a) this.T).f3(z10);
            j0.r(this.T).n3(1, z10);
            Object obj = this.f24373o0;
            if (obj != null) {
                ((ActionMode) obj).finish();
            }
            if (!z10) {
                this.f24356a.b();
            }
        }
    }

    public s0 H() {
        return this.Q;
    }

    public void H0(int i10, v4<?> v4Var, v4<?> v4Var2) {
        boolean z10;
        f3 f3Var = this.N;
        if (f3Var != null) {
            p0.Y(f3Var, i10);
        }
        View view = this.P;
        if (view != null) {
            p0.Y(view, i10);
        }
        f3 f3Var2 = this.O;
        if (f3Var2 != null) {
            p0.Y(f3Var2, i10);
        }
        s0 s0Var = this.Q;
        if (s0Var != null && !(z10 = yd.e.O)) {
            p0.Y(s0Var, (i10 != 2 || !z10) ? i10 : 1);
        }
        if (v4Var != null && v4Var.B8()) {
            p0.Y(v4Var.get(), i10);
        }
        if (v4Var2 != null && v4Var2.B8()) {
            p0.Y(v4Var2.get(), i10);
        }
    }

    public d1 I() {
        return this.M;
    }

    public void I0(int i10) {
        this.O.setVisibility(i10);
        this.N.setVisibility(i10);
    }

    public int J() {
        if (!this.R || this.Y != 1) {
            return 0;
        }
        return (int) (this.f24358b.getMeasuredWidth() * this.f24372n0);
    }

    public boolean J0() {
        ArrayList<v4<?>> arrayList = this.S;
        if (arrayList == null) {
            return false;
        }
        Iterator<v4<?>> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().Rd()) {
                return true;
            }
        }
        return false;
    }

    public v4<?> K() {
        return this.f24356a.f();
    }

    public void K0() {
        if (this.P.getParent() != null) {
            this.f24360c.removeView(this.P);
        }
        this.P.setVisibility(0);
        this.f24360c.addView(this.P, 1);
    }

    public v4<?> L() {
        return M().n();
    }

    public final void L0(float f10) {
        if (!this.R) {
            return;
        }
        if (!w.G2() || this.Y != 1) {
            F0(f10 / this.f24359b0);
        } else {
            F0((-f10) / this.f24359b0);
        }
    }

    public u1 M() {
        return this.f24356a.g();
    }

    public final void M0() {
        ((org.thunderdog.challegram.a) this.T).J3();
    }

    public int N() {
        return this.f24356a.h();
    }

    public v O() {
        if (this.W == null) {
            this.W = new v();
        }
        return this.W;
    }

    public final void P() {
        j0.r(this.T).k1(true);
        k0 u10 = j0.u(this.T);
        if (u10 != null) {
            u10.pf(0.0f, null);
        }
    }

    public void Q(v4<?> v4Var) {
        if (!this.R && v4Var != null) {
            u1 M = M();
            v4Var.get();
            M.b(this);
            M.t(v4Var, true);
            A0();
            j(v4Var);
            this.f24356a.a(v4Var);
            I().setTitle(v4Var);
            if (v4Var.Me()) {
                v4Var.G8(1.0f);
            }
        }
    }

    @Override
    public void Q5(int i10, int i11) {
        if (w.H1(i10, i11)) {
            if (p0.V(this.Q, (w.G2() ? 3 : 5) | 48)) {
                p0.r0(this.Q);
            }
            if (this.N != null) {
                if (w.G2()) {
                    this.N.setSimpleRightShadow(false);
                } else {
                    this.N.setSimpleLeftShadow(false);
                }
            }
        }
        d1 d1Var = this.M;
        if (d1Var != null) {
            d1Var.Q5(i10, i11);
        }
    }

    public void R(v4<?> v4Var, int i10) {
        if (!this.R && v4Var != null) {
            this.f24356a.i(v4Var, i10);
        }
    }

    public boolean S() {
        return this.R;
    }

    public boolean T() {
        if (this.R && !this.Z) {
            float f10 = this.f24363e0;
            if (f10 != 0.0f && f10 != 1.0f && this.f24371m0) {
                return true;
            }
        }
        return false;
    }

    public boolean U() {
        return this.R && this.Y != 4;
    }

    public final boolean V() {
        v4<?> l10 = M().l();
        return l10 != null && l10.cb();
    }

    @Override
    public boolean V0() {
        return true;
    }

    public boolean W() {
        return this.X;
    }

    public boolean X() {
        return this.f24356a.g().C() == 0;
    }

    public void e0() {
        this.f24358b.A1();
        this.M.w3();
        this.f24360c.A1();
    }

    public void f0(v4<?> v4Var, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        P();
        int i12 = 0;
        boolean z12 = (i10 & 1) != 1;
        if ((i10 & 8) == 8) {
            i11 = 3;
            z10 = false;
        } else {
            int i13 = 2;
            if (z12) {
                z11 = v4Var.s9();
                if (z11 || v4Var.r9()) {
                    i13 = 3;
                } else if (!v4Var.Me()) {
                    i13 = 1;
                }
            } else {
                v4<?> l10 = M().l();
                boolean s92 = v4Var.s9();
                if (s92 || l10 == null || l10.r9()) {
                    i13 = 3;
                } else if (!l10.Me()) {
                    i13 = 1;
                }
                z11 = s92;
            }
            if (!i.c2().O2() || i13 != 1) {
                i11 = i13;
                z10 = z11;
            } else {
                z10 = z11;
                i11 = 3;
            }
        }
        if ((i10 & 4) == 4) {
            i12 = (i10 & 16) == 16 ? 20 : 4;
        }
        if (!v4Var.dc() || !this.V) {
            v4Var.l9();
            m(v4Var, i11, z12, i12, z10);
            return;
        }
        v4Var.zd(new b(v4Var, i11, z12, i12, z10), v4Var.y9(z10));
    }

    public final boolean g0() {
        if (this.R || M().m() <= 0 || V()) {
            return false;
        }
        this.f24356a.j();
        return true;
    }

    public final boolean h0(v4<?> v4Var) {
        if (this.R || N() <= 0 || v4Var == null || V()) {
            return false;
        }
        this.R = true;
        this.f24356a.k(v4Var);
        return true;
    }

    public final void i0() {
        ArrayList<v4<?>> arrayList = this.S;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.S.get(size).hc();
            }
        }
    }

    @Override
    public void i3(p pVar, p pVar2) {
        k.b(this, pVar, pVar2);
    }

    public void j(v4<?> v4Var) {
        if (this.S == null) {
            this.S = new ArrayList<>();
        }
        this.S.add(v4Var);
        v4Var.I8(this.f24369k0, this.f24370l0);
        if (!v4Var.Me()) {
            this.f24360c.addView(v4Var.get());
        } else if (v4Var.jd()) {
            this.f24358b.addView(v4Var.get(), 0);
        } else {
            this.f24358b.addView(v4Var.get(), this.f24358b.getChildCount() - 2);
        }
        v4Var.N8(this);
        v4Var.Ac();
        v4Var.ic(this, true);
        s();
    }

    public boolean j0(boolean z10) {
        if (this.M.l3()) {
            this.M.r2(true, true);
            return true;
        }
        v4<?> l10 = M().l();
        if (this.M.j3()) {
            if (l10 != null && l10.X8(z10)) {
                return true;
            }
            this.M.n2(true, null);
            return true;
        } else if (l10 == null) {
            return false;
        } else {
            if (l10.jc(z10)) {
                return true;
            }
            if (N() <= 1) {
                return false;
            }
            g0();
            return true;
        }
    }

    @Override
    public void j6(boolean z10, ae.b bVar) {
        v4<?> v4Var;
        boolean z11;
        if (!this.R || ((!(z11 = this.Z) || this.f24372n0 != 1.0f) && (z11 || this.f24372n0 != 0.0f))) {
            v4Var = F();
        } else {
            v4Var = L();
        }
        if (v4Var != null) {
            this.M.G3(v4Var, null);
        }
        v vVar = this.W;
        if (vVar != null) {
            vVar.n(z10);
        }
    }

    public void k(v4<?> v4Var, int i10) {
        if (this.S == null) {
            this.S = new ArrayList<>();
        }
        this.S.add(i10, v4Var);
        if (v4Var.Me()) {
            this.f24358b.addView(v4Var.get(), 0);
        } else {
            this.f24360c.addView(v4Var.get(), i10);
        }
        v4Var.N8(this);
        v4Var.Ac();
        v4Var.ic(this, true);
        s();
    }

    public void k0() {
        v4<?> l10 = M().l();
        if (l10 != null) {
            l10.kc();
        }
    }

    public void l(View view) {
        b2 b2Var = this.f24358b;
        b2Var.addView(view, b2Var.indexOfChild(this.M));
    }

    public View l0(Context context) {
        b2 b2Var = new b2(context);
        this.f24358b = b2Var;
        b2Var.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f24358b.setId(R.id.nav_root);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(n.i(), -1, 3);
        r12.setMargins(0, d1.a3(true), 0, 0);
        f3 f3Var = new f3(context);
        this.N = f3Var;
        f3Var.setLayoutParams(r12);
        if (w.G2()) {
            this.N.setSimpleRightShadow(false);
        } else {
            this.N.setSimpleLeftShadow(false);
        }
        this.N.setVisibility(8);
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(-1, n.j(), 48);
        f3 f3Var2 = new f3(context);
        this.O = f3Var2;
        f3Var2.setSimpleTopShadow(true);
        this.O.setVisibility(8);
        this.O.setLayoutParams(r13);
        View view = new View(context);
        this.P = view;
        view.setBackgroundColor(-16777216);
        this.P.setVisibility(8);
        this.P.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        s1 s1Var = new s1(context);
        this.f24360c = s1Var;
        s1Var.setController(this);
        this.f24360c.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f24360c.setId(R.id.nav_wrapper);
        d1 d1Var = new d1(context);
        this.M = d1Var;
        d1Var.m3(this);
        this.M.setId(R.id.nav_header);
        this.f24358b.addView(this.f24360c);
        this.f24358b.addView(this.N);
        this.f24358b.addView(this.O);
        this.f24358b.addView(this.M);
        s0 s0Var = new s0(context);
        this.Q = s0Var;
        s0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                q1.this.d0(view2);
            }
        });
        this.f24358b.addView(this.Q);
        w.h(this);
        return this.f24358b;
    }

    public void m(final v4<?> v4Var, int i10, final boolean z10, final int i11, boolean z11) {
        v4<?> v4Var2;
        v4<?> v4Var3;
        if (z10) {
            v4<?> n10 = M().n();
            t0(n10, v4Var, true, i10);
            v4Var3 = n10;
            v4Var2 = v4Var;
        } else {
            v4<?> l10 = M().l();
            t0(v4Var, l10, false, i10);
            v4Var2 = l10;
            v4Var3 = v4Var;
        }
        final v4<?> v4Var4 = v4Var3;
        final v4<?> v4Var5 = v4Var2;
        Runnable p1Var = new Runnable() {
            @Override
            public final void run() {
                q1.this.Y(z10, i11, v4Var, v4Var4, v4Var5);
            }
        };
        if (!this.V) {
            F0(z10 ? 0.0f : 1.0f);
            p1Var.run();
            return;
        }
        this.f24371m0 = true;
        ValueAnimator b10 = db.b.b();
        if (z10) {
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    q1.this.Z(valueAnimator);
                }
            });
        } else {
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    q1.this.a0(valueAnimator);
                }
            });
        }
        long j10 = 400;
        long j11 = 120;
        if (i10 == 1) {
            b10.setDuration(400L);
            b10.setInterpolator(db.b.f7289d);
        } else if (i10 == 2) {
            if (!z10) {
                j10 = 500;
            }
            b10.setDuration(j10);
            b10.setInterpolator(db.b.f7289d);
        } else if (i10 == 3) {
            b10.setDuration(z11 ? 120L : 180L);
            b10.setInterpolator(db.b.f7287b);
        }
        b10.addListener(new c(p1Var));
        if (!z11) {
            if (z10) {
                if (v4Var3 == null || !v4Var3.Me()) {
                    j11 = v4Var.za(true);
                }
                b10.setStartDelay(j11);
            } else {
                if (v4Var2 == null || !v4Var2.Me()) {
                    j11 = v4Var.za(false);
                }
                b10.setStartDelay(j11);
            }
        }
        db.b.c(z10 ? v4Var2.get() : v4Var3.get(), b10);
    }

    public void m0() {
        v4<?> l10 = M().l();
        if (l10 != null) {
            l10.sc();
        }
    }

    public boolean n(float f10, float f11) {
        if (this.f24369k0 == f10) {
            return false;
        }
        this.f24369k0 = f10;
        this.f24370l0 = f11;
        ArrayList<v4<?>> arrayList = this.S;
        if (arrayList == null) {
            return true;
        }
        Iterator<v4<?>> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().I8(f10, f11);
        }
        return true;
    }

    public void n0(boolean z10) {
        ArrayList<v4<?>> arrayList = this.S;
        if (arrayList != null) {
            Iterator<v4<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().wc(z10);
            }
        }
    }

    public final void o(v4<?> v4Var) {
        if (!v4Var.jd()) {
            this.f24358b.removeView(v4Var.get());
            this.f24358b.addView(v4Var.get(), this.f24358b.getChildCount() - 2);
        }
        this.M.getFilling().j0(true);
    }

    public void o0() {
        v4<?> l10 = M().l();
        if (l10 != null) {
            l10.Ac();
        }
    }

    public void p(float f10) {
        if (this.R && M().m() > 0) {
            if (this.Y == 2) {
                this.f24372n0 = this.f24363e0 / this.f24361c0;
            } else {
                this.f24372n0 = this.f24363e0 / this.f24359b0;
            }
            final float G = G();
            final float f11 = 1.0f - G;
            ValueAnimator b10 = db.b.b();
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    q1.this.b0(G, f11, valueAnimator);
                }
            });
            b10.setInterpolator(db.b.f7287b);
            b10.addListener(new e());
            if (this.Y == 2) {
                b10.setDuration(q(this.f24361c0 - this.f24363e0, f10, 300, 160));
            } else {
                b10.setDuration(q(this.f24359b0 - this.f24363e0, f10, 200, 60));
            }
            b10.start();
        }
    }

    public boolean p0(float f10) {
        return r0(f10, false);
    }

    @Override
    public void q0(int i10) {
        k.a(this, i10);
    }

    public void r() {
        this.f24358b.z1();
        this.M.l2();
        this.f24360c.z1();
    }

    public final boolean r0(float f10, boolean z10) {
        v4<?> l10;
        if (M().m() <= 0) {
            this.f24356a.d();
            return false;
        } else if (this.R || (l10 = M().l()) == null) {
            return false;
        } else {
            G0(true);
            int i10 = 4;
            if (l10.Me()) {
                v4<?> n10 = M().n();
                if (!z10) {
                    i10 = 2;
                }
                t0(n10, l10, false, i10);
            } else {
                v4<?> n11 = M().n();
                if (!z10) {
                    i10 = 1;
                }
                t0(n11, l10, false, i10);
            }
            return true;
        }
    }

    public final void s() {
        j0.r(this.T).m0();
    }

    public boolean s0(boolean z10) {
        v4<?> l10 = M().l();
        return l10 != null && l10.cd(z10);
    }

    public final void t() {
        ArrayList<v4<?>> arrayList = this.S;
        if (arrayList != null) {
            arrayList.clear();
            this.S = null;
        }
    }

    public void t0(v4<?> v4Var, v4<?> v4Var2, boolean z10, int i10) {
        v0();
        int i11 = 2;
        H0(2, v4Var, v4Var2);
        int i12 = 0;
        if (z10) {
            v4Var2.I8(this.f24369k0, this.f24370l0);
            j(v4Var2);
            if (v4Var.Me()) {
                x0(v4Var);
            }
        } else {
            v4Var.I8(this.f24369k0, this.f24370l0);
            k(v4Var, 0);
        }
        if (!(i10 == 3 || i10 == 4 || v4Var.Me())) {
            K0();
        }
        this.f24372n0 = z10 ? 1.0f : 0.0f;
        this.f24365g0 = v4Var;
        this.f24366h0 = v4Var2;
        this.f24367i0 = v4Var.get();
        this.f24368j0 = v4Var2.get();
        this.Y = i10;
        this.Z = z10;
        this.f24359b0 = this.f24358b.getMeasuredWidth();
        this.f24361c0 = this.f24358b.getMeasuredHeight();
        this.f24362d0 = -(this.f24359b0 / 3.5f);
        if (z10) {
            this.f24365g0.kc();
            int i13 = this.Y;
            if (i13 == 1) {
                this.f24363e0 = this.f24359b0;
                this.f24367i0.setTranslationX(0.0f);
                this.f24368j0.setTranslationX(this.f24359b0);
                this.f24368j0.setTranslationY(0.0f);
                this.f24368j0.setAlpha(1.0f);
                this.M.getFilling().r0(v4Var.Me(), 0.0f, v4Var.aa());
                if (!v4Var.Me()) {
                    this.P.setAlpha(0.0f);
                    this.P.setVisibility(0);
                }
                this.N.setTranslationX(this.f24359b0 - n.i());
                this.N.setAlpha(0.92f);
                this.N.setVisibility(0);
            } else if (i13 == 2) {
                this.f24363e0 = this.f24361c0;
                this.f24367i0.setTranslationX(0.0f);
                this.f24368j0.setTranslationX(0.0f);
                this.f24368j0.setTranslationY(this.f24361c0);
                this.M.getFilling().r0(false, 0.0f, 0);
                if (!v4Var.Me()) {
                    this.P.setAlpha(0.0f);
                    this.P.setVisibility(0);
                }
                this.O.setTranslationY(this.f24361c0 - n.j());
                this.O.setAlpha(1.0f);
                f3 f3Var = this.O;
                if (!v4Var2.Ie()) {
                    i12 = 8;
                }
                f3Var.setVisibility(i12);
            } else if (i13 == 3) {
                this.f24363e0 = 0.0f;
                this.f24367i0.setTranslationX(0.0f);
                this.f24368j0.setTranslationX(0.0f);
                this.f24368j0.setTranslationY(0.0f);
                this.f24368j0.setAlpha(0.0f);
                this.M.getFilling().r0(false, 0.0f, 0);
            } else if (i13 == 4) {
                this.f24363e0 = 0.0f;
                this.f24367i0.setTranslationX(0.0f);
                this.f24368j0.setTranslationX(0.0f);
                this.f24368j0.setTranslationY(0.0f);
                this.f24368j0.setAlpha(1.0f);
                this.f24367i0.setAlpha(1.0f);
                this.M.getFilling().r0(false, 0.0f, 0);
            }
        } else {
            this.f24363e0 = 0.0f;
            this.f24366h0.kc();
            this.f24367i0.setVisibility(0);
            int i14 = this.Y;
            if (i14 == 1) {
                this.f24368j0.setTranslationX(0.0f);
                this.f24367i0.setTranslationX(this.f24362d0);
                this.f24367i0.setAlpha(1.0f);
                this.M.getFilling().r0(v4Var.Me(), -this.f24362d0, v4Var.aa());
                if (!v4Var.Me()) {
                    this.P.setAlpha(0.08f);
                    this.P.setVisibility(0);
                }
                this.N.setAlpha(1.0f);
                this.N.setTranslationX(-n.i());
                this.N.setVisibility(0);
            } else if (i14 == 2) {
                this.f24368j0.setTranslationY(0.0f);
                this.f24368j0.setTranslationX(0.0f);
                this.f24367i0.setTranslationX(0.0f);
                this.f24367i0.setTranslationY(0.0f);
                this.M.getFilling().r0(false, 0.0f, 0);
                if (!v4Var.Me()) {
                    this.P.setAlpha(0.08f);
                    this.P.setVisibility(0);
                }
                this.O.setAlpha(1.0f);
                this.O.setTranslationY(-n.j());
                f3 f3Var2 = this.O;
                if (!v4Var2.Ie()) {
                    i12 = 8;
                }
                f3Var2.setVisibility(i12);
            } else if (i14 == 3) {
                this.f24367i0.setTranslationX(0.0f);
                this.f24368j0.setTranslationX(0.0f);
                this.f24368j0.setTranslationY(0.0f);
                this.M.getFilling().r0(false, 0.0f, 0);
            } else if (i14 == 4) {
                this.f24367i0.setTranslationX(0.0f);
                this.f24368j0.setTranslationX(0.0f);
                this.f24368j0.setTranslationY(0.0f);
                this.f24368j0.setAlpha(1.0f);
                this.f24367i0.setAlpha(1.0f);
                this.M.getFilling().r0(false, 0.0f, 0);
            }
        }
        u0(v4Var, v4Var2, z10, i10);
        e0();
        i0();
        if (z10) {
            i11 = 1;
        }
        w0(i11);
    }

    public final void u() {
        F0(0.0f);
        this.M.m2();
        z0(this.f24365g0);
        int i10 = this.Y;
        if (i10 == 1) {
            this.N.setVisibility(8);
        } else if (i10 == 2) {
            this.O.setVisibility(8);
        }
        if (!this.f24365g0.Me()) {
            B0();
        }
        this.f24366h0.sc();
        this.f24365g0 = null;
        this.f24366h0 = null;
        this.f24367i0 = null;
        this.f24368j0 = null;
    }

    public final void u0(v4<?> v4Var, v4<?> v4Var2, boolean z10, int i10) {
        float f10 = z10 ? 1.0f : 0.0f;
        this.f24364f0 = f10;
        this.M.z3(v4Var, v4Var2, z10, i10, f10);
        if (z10 || !v4Var2.Me()) {
            this.f24357a0 = this.M.getCurrentHeight();
        } else {
            this.f24357a0 = v4Var.M9();
        }
    }

    public void v(float f10) {
        int i10;
        if (this.R && M().m() > 0) {
            float f11 = this.f24363e0;
            if (f11 == 0.0f || (i10 = this.Y) == 4) {
                B();
                return;
            }
            if (i10 == 2) {
                this.f24372n0 = f11 / this.f24361c0;
            } else {
                this.f24372n0 = f11 / this.f24359b0;
            }
            final float G = G();
            ValueAnimator b10 = db.b.b();
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    q1.this.c0(G, valueAnimator);
                }
            });
            b10.setInterpolator(db.b.f7287b);
            b10.addListener(new d());
            if (this.Y == 2) {
                b10.setDuration(q(this.f24363e0, f10, 300, 160));
            } else {
                b10.setDuration(q(this.f24363e0, f10, 200, 60));
            }
            b10.start();
        }
    }

    public void v0() {
        this.f24358b.B1();
        this.M.E3();
        this.f24360c.B1();
    }

    public void w() {
        v(0.0f);
    }

    public void w0(int i10) {
    }

    public void x() {
    }

    public final void x0(v4<?> v4Var) {
        if (!v4Var.jd()) {
            this.f24358b.removeView(v4Var.get());
            this.f24358b.addView(v4Var.get(), 0);
        }
        this.M.getFilling().j0(false);
    }

    public final void y(Configuration configuration) {
        Iterator<v4<?>> it = M().k().iterator();
        while (it.hasNext()) {
            it.next().mc(configuration);
        }
    }

    public void y0(v4<?> v4Var, boolean z10, boolean z11) {
        if (z10) {
            f0(v4Var, z11 ? 20 : 4);
        } else {
            f0(v4Var, z11 ? 28 : 12);
        }
    }

    public void z() {
        this.X = true;
        z.u().U(this);
        M().b(this);
        t();
        w.F2(this);
        d1 d1Var = this.M;
        if (d1Var != null) {
            d1Var.Q2();
        }
        s1 s1Var = this.f24360c;
        if (s1Var != null) {
            s1Var.Q2();
        }
        s0 s0Var = this.Q;
        if (s0Var != null) {
            s0Var.Q2();
        }
    }

    public void z0(v4<?> v4Var) {
        ArrayList<v4<?>> arrayList = this.S;
        if (arrayList != null) {
            arrayList.remove(v4Var);
        }
        if (v4Var.Me()) {
            this.f24358b.removeView(v4Var.get());
        } else {
            this.f24360c.removeView(v4Var.get());
        }
        v4Var.lc();
        v4Var.e9();
        v4Var.ic(this, false);
        s();
    }
}
