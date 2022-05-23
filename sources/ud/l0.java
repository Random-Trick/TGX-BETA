package ud;

import ae.j;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c0;
import ce.y;
import db.e;
import eb.k;
import gb.c;
import gd.w;
import he.i;
import ib.d;
import je.g;
import kb.c;
import ld.h;
import ne.e1;
import oc.l;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import zd.o6;
import zd.r0;
import zd.s0;
import zd.s1;
import zd.t1;
import zd.v0;
import zd.w0;
import zd.w6;
import zd.x6;
import zd.ya;

public class l0 extends View implements c, s0, w0, k.b, c.a, t1.a {
    public final Drawable M;
    public final gb.c O;
    public b P;
    public b Q;
    public float R;
    public k S;
    public ld.c f24266b;
    public k0 f24267c;
    public final e1 N = new e1(this);
    public ld.c f24265a = new ld.c(this, 1);

    public class a extends l {
        public a(int i10) {
            super(i10);
        }

        @Override
        public int b() {
            return d.c(super.b(), j.L(R.id.theme_color_drawer));
        }
    }

    public static class b implements je.k {
        public final String M;
        public final String N;
        public h O;
        public h P;
        public final hd.b Q;
        public int R;
        public g S;
        public g T;
        public int U;
        public float V;
        public final l0 f24269a;
        public final w6 f24270b;
        public final long f24271c;

        public b(l0 l0Var, w6 w6Var) {
            this.f24269a = l0Var;
            this.f24270b = w6Var;
            this.f24271c = w6Var.r();
            if (w6Var.D()) {
                this.M = w6Var.u();
                if (i.c2().H2()) {
                    this.N = c0.b0(c0.w(w6Var.v()));
                } else {
                    this.N = c0.w(w6Var.v());
                }
            } else {
                this.M = w.i1(R.string.LoadingUser);
                this.N = w.i1(R.string.LoadingPhone);
            }
            this.Q = new hd.b(32.0f, w6Var.n(), null);
            j();
        }

        @Override
        public int R() {
            return je.j.d(this);
        }

        @Override
        public long W0(boolean z10) {
            return je.j.c(this, z10);
        }

        @Override
        public int a1() {
            return je.j.f(this);
        }

        @Override
        public int c() {
            return this.f24269a.i(this.V);
        }

        @Override
        public int d(boolean z10) {
            return je.j.b(this, z10);
        }

        public void f(b bVar) {
            boolean c10 = ib.i.c(bVar.N, this.N);
            if (ib.i.c(bVar.M, this.M)) {
                boolean z10 = c10 ? 1 : 0;
                char c11 = c10 ? 1 : 0;
                c10 = z10 | true;
            }
            int i10 = c10 ? 1 : 0;
            int i11 = c10 ? 1 : 0;
            this.U = i10;
        }

        @Override
        public int g(boolean z10) {
            return je.j.h(this, z10);
        }

        public boolean h(w6 w6Var, boolean z10) {
            return w6Var.J(this.f24270b) && (!z10 || this.f24271c == w6Var.r());
        }

        public void i(android.graphics.Canvas r18, ld.c r19, int r20, int r21, float r22, float r23, float r24, int r25, boolean r26, int r27, boolean r28) {
            throw new UnsupportedOperationException("Method not decompiled: ud.l0.b.i(android.graphics.Canvas, ld.c, int, int, float, float, float, int, boolean, int, boolean):void");
        }

        public final void j() {
            h m10 = this.f24270b.m(false);
            if (m10 != null) {
                h f10 = h.f(m10);
                this.O = f10;
                f10.t0(wc.a.getDefaultAvatarCacheSize());
                this.O.s0(2);
                h m11 = this.f24270b.m(true);
                if (m11 != null) {
                    m10 = m11;
                }
                h f11 = h.f(m10);
                this.P = f11;
                f11.s0(2);
                int Bf = this.f24269a.f24267c.Bf();
                if (Bf < 512) {
                    this.P.t0(Bf);
                    return;
                }
                return;
            }
            this.P = null;
            this.O = null;
        }

        public void l(int i10) {
            int h10 = i10 - (l0.h() * 2);
            if (h10 > 0 && this.R != h10) {
                this.R = h10;
                this.S = new g.b(this.M, h10, y.A0(15.0f), this).v().b().f();
                this.T = new g.b(this.N, h10, y.A0(13.0f), this).v().b().f();
            }
        }

        @Override
        public int o0(boolean z10) {
            return je.j.e(this, z10);
        }

        @Override
        public int r0(boolean z10) {
            return je.j.a(this, z10);
        }

        @Override
        public int t0(boolean z10) {
            return je.j.g(this, z10);
        }
    }

    public l0(Context context, k0 k0Var) {
        super(context);
        this.f24267c = k0Var;
        gb.c cVar = new gb.c(this);
        this.O = cVar;
        cVar.h(true);
        Drawable a10 = e.a(-16777216, 2, 80, false);
        this.M = a10;
        a10.setAlpha(90);
        ld.c cVar2 = new ld.c(this, 1);
        this.f24266b = cVar2;
        cVar2.S0(true);
        this.f24265a.E0(0);
        this.f24266b.E0(0);
        w6 k02 = ya.o1().k0();
        ya.o1().b1().a(this);
        ya.o1().b1().d(this);
        j();
        setUser(k02);
        t1.b().a(this);
        db.g.d(this, new a(R.id.theme_color_headerBackground));
    }

    public static int g() {
        return a0.i(17.0f) + d1.getTopOffset();
    }

    public static int h() {
        return a0.i(16.0f);
    }

    @Override
    public boolean B(float f10, float f11) {
        return gb.b.d(this, f10, f11);
    }

    @Override
    public void C(View view, float f10, float f11) {
        if (f11 >= getMeasuredHeight() - a0.i(54.0f)) {
            db.g.c(this);
            this.f24267c.jg(this.N.e());
        }
    }

    @Override
    public void D4(w6 w6Var, boolean z10, boolean z11) {
        b bVar = this.P;
        if (bVar != null && bVar.h(w6Var, false)) {
            setUser(w6Var);
        }
    }

    @Override
    public void E(TdApi.ChatList chatList, boolean z10) {
        j();
    }

    @Override
    public boolean E4() {
        return gb.b.a(this);
    }

    @Override
    public void G(View view, float f10, float f11) {
        gb.b.h(this, view, f10, f11);
    }

    @Override
    public void N6(w6 w6Var, int i10) {
        r0.f(this, w6Var, i10);
    }

    @Override
    public void Q2() {
        ya.o1().b1().x(this);
        ya.o1().b1().z(this);
        t1.b().d(this);
    }

    @Override
    public void S(w6 w6Var, int i10) {
        r0.d(this, w6Var, i10);
    }

    @Override
    public void T1(o6 o6Var, TdApi.ChatList chatList, int i10, boolean z10) {
        v0.a(this, o6Var, chatList, i10, z10);
    }

    @Override
    public void U2(View view, float f10, float f11) {
        gb.b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        gb.b.f(this, view, f10, f11);
    }

    @Override
    public void V1(w6 w6Var, TdApi.User user, int i10, w6 w6Var2) {
        setUser(w6Var);
        j();
    }

    @Override
    public boolean X6(float f10, float f11) {
        return gb.b.c(this, f10, f11);
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public void e2() {
        invalidate();
    }

    public final void f() {
        this.P = this.Q;
        this.Q = null;
        ld.c cVar = this.f24266b;
        ld.c cVar2 = this.f24265a;
        this.f24266b = cVar2;
        this.f24265a = cVar;
        cVar2.j(null, null);
        this.R = 0.0f;
        this.S = null;
        invalidate();
    }

    public e1 getExpanderView() {
        return this.N;
    }

    @Override
    public long getLongPressDuration() {
        return gb.b.b(this);
    }

    public final int i(float f10) {
        return d.d(d.c(j.n0(), j.L(R.id.theme_color_drawerText)), j.L(R.id.theme_color_white), f10);
    }

    public void j() {
        x6 a12 = ya.o1().a1(ya.o1().k0().f28608b);
        this.N.d(a12.b(), a12.c(), this.f24267c.Af() > 0.0f);
    }

    @Override
    public void l(w6 w6Var, TdApi.AuthorizationState authorizationState, int i10) {
        r0.g(this, w6Var, authorizationState, i10);
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return f11 >= ((float) (getMeasuredHeight() - a0.i(54.0f)));
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (this.R != f10) {
            this.R = f10;
            invalidate();
        }
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
        if (f10 == 1.0f) {
            f();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24265a.e();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24265a.b();
    }

    @Override
    public void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: ud.l0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b bVar = this.P;
        if (bVar != null) {
            bVar.l(getMeasuredWidth());
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight();
        int i12 = measuredHeight - a0.i(72.0f);
        int measuredWidth = getMeasuredWidth();
        Rect bounds = this.M.getBounds();
        if (bounds.top != i12 || bounds.bottom != measuredHeight || bounds.right != measuredWidth) {
            this.M.setBounds(0, i12, measuredWidth, measuredHeight);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.O.e(this, motionEvent);
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        return gb.b.k(this, view, f10, f11);
    }

    public synchronized void setUser(w6 w6Var) {
        boolean z10 = this.f24267c.Af() > 0.0f && this.P != null;
        b bVar = new b(this, w6Var);
        bVar.l(getMeasuredWidth());
        k kVar = this.S;
        if (kVar != null) {
            kVar.k();
            f();
        }
        if (z10) {
            this.Q = bVar;
            bVar.f(this.P);
            this.f24266b.j(bVar.O, bVar.P);
            k kVar2 = new k(0, this, db.b.f7287b, 240L);
            this.S = kVar2;
            kVar2.i(1.0f);
        } else {
            this.P = bVar;
            this.f24265a.j(bVar.O, bVar.P);
            invalidate();
        }
    }

    @Override
    public void v0(w6 w6Var, TdApi.User user, boolean z10, boolean z11) {
        b bVar = this.P;
        if (bVar != null && bVar.h(w6Var, false)) {
            setUser(w6Var);
        }
    }

    @Override
    public void z(o6 o6Var, boolean z10) {
        r0.h(this, o6Var, z10);
    }

    @Override
    public void z5(w6 w6Var, int i10, int i11) {
        r0.e(this, w6Var, i10, i11);
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        gb.b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
