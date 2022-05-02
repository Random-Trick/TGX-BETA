package td;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1363c0;
import be.C1410y;
import gd.C4587b;
import ge.C4868i;
import ie.AbstractC5408k;
import ie.C5406j;
import ie.RunnableC5390g;
import me.C6866e1;
import nc.C7368l;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2061e;
import p037cb.C2065g;
import p051db.C3950k;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.C6240c;
import p156kd.C6246h;
import p350yd.AbstractC11030u0;
import p350yd.AbstractC11125y0;
import p350yd.C10536ab;
import p350yd.C10930q6;
import p350yd.C11008t0;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.C11104x0;
import p350yd.C11131y6;
import p350yd.C11164z6;
import p364zd.C11524j;
import vc.C9903a;

public class C9232l0 extends View implements AbstractC5911c, AbstractC11030u0, AbstractC11125y0, C3950k.AbstractC3952b, C4336c.AbstractC4337a, C11052v1.AbstractC11053a {
    public final Drawable f29789M;
    public final C4336c f29791O;
    public C9234b f29792P;
    public C9234b f29793Q;
    public float f29794R;
    public C3950k f29795S;
    public C6240c f29797b;
    public View$OnClickListenerC9218k0 f29798c;
    public final C6866e1 f29790N = new C6866e1(this);
    public C6240c f29796a = new C6240c(this, 1);

    public class C9233a extends C7368l {
        public C9233a(int i) {
            super(i);
        }

        @Override
        public int mo9864b() {
            return C5064d.m24129c(super.mo9864b(), C11524j.m228N(R.id.theme_color_drawer));
        }
    }

    public static class C9234b implements AbstractC5408k {
        public final String f29800M;
        public final String f29801N;
        public C6246h f29802O;
        public C6246h f29803P;
        public final C4587b f29804Q;
        public int f29805R;
        public RunnableC5390g f29806S;
        public RunnableC5390g f29807T;
        public int f29808U;
        public float f29809V;
        public final C9232l0 f29810a;
        public final C11131y6 f29811b;
        public final long f29812c;

        public C9234b(C9232l0 l0Var, C11131y6 y6Var) {
            this.f29810a = l0Var;
            this.f29811b = y6Var;
            this.f29812c = y6Var.m1458r();
            if (y6Var.m1507D()) {
                this.f29800M = y6Var.m1455u();
                if (C4868i.m24726c2().m24875H2()) {
                    this.f29801N = C1363c0.m37444b0(C1363c0.m37410w(y6Var.m1454v()));
                } else {
                    this.f29801N = C1363c0.m37410w(y6Var.m1454v());
                }
            } else {
                this.f29800M = C4403w.m27869i1(R.string.LoadingUser);
                this.f29801N = C4403w.m27869i1(R.string.LoadingPhone);
            }
            this.f29804Q = new C4587b(32.0f, y6Var.m1462n(), null);
            m9857j();
        }

        @Override
        public int mo7858Q() {
            return C5406j.m22807d(this);
        }

        @Override
        public long mo7857X0(boolean z) {
            return C5406j.m22808c(this, z);
        }

        @Override
        public int mo7856b1() {
            return C5406j.m22805f(this);
        }

        @Override
        public int mo7855c() {
            return this.f29810a.m9866i(this.f29809V);
        }

        @Override
        public int mo7854e(boolean z) {
            return C5406j.m22809b(this, z);
        }

        public void m9860f(C9234b bVar) {
            boolean c = C5070i.m24067c(bVar.f29801N, this.f29801N);
            if (C5070i.m24067c(bVar.f29800M, this.f29800M)) {
                boolean z = c ? 1 : 0;
                char c2 = c ? 1 : 0;
                c = z | true;
            }
            int i = c ? 1 : 0;
            int i2 = c ? 1 : 0;
            this.f29808U = i;
        }

        @Override
        public int mo7853g(boolean z) {
            return C5406j.m22803h(this, z);
        }

        public boolean m9859h(C11131y6 y6Var, boolean z) {
            return y6Var.m1501J(this.f29811b) && (!z || this.f29812c == y6Var.m1458r());
        }

        public void m9858i(android.graphics.Canvas r18, p156kd.C6240c r19, int r20, int r21, float r22, float r23, float r24, int r25, boolean r26, int r27, boolean r28) {
            throw new UnsupportedOperationException("Method not decompiled: td.C9232l0.C9234b.m9858i(android.graphics.Canvas, kd.c, int, int, float, float, float, int, boolean, int, boolean):void");
        }

        public final void m9857j() {
            C6246h m = this.f29811b.m1463m(false);
            if (m != null) {
                C6246h f = C6246h.m20920f(m);
                this.f29802O = f;
                f.mo20767t0(C9903a.getDefaultAvatarCacheSize());
                this.f29802O.m20897s0(2);
                C6246h m2 = this.f29811b.m1463m(true);
                if (m2 != null) {
                    m = m2;
                }
                C6246h f2 = C6246h.m20920f(m);
                this.f29803P = f2;
                f2.m20897s0(2);
                int Bf = this.f29810a.f29798c.m9962Bf();
                if (Bf < 512) {
                    this.f29803P.mo20767t0(Bf);
                    return;
                }
                return;
            }
            this.f29803P = null;
            this.f29802O = null;
        }

        public void m9856l(int i) {
            int h = i - (C9232l0.m9867h() * 2);
            if (h > 0 && this.f29805R != h) {
                this.f29805R = h;
                this.f29806S = new RunnableC5390g.C5392b(this.f29800M, h, C1410y.m37083A0(15.0f), this).m22868v().m22888b().m22884f();
                this.f29807T = new RunnableC5390g.C5392b(this.f29801N, h, C1410y.m37083A0(13.0f), this).m22868v().m22888b().m22884f();
            }
        }

        @Override
        public int mo7852o0(boolean z) {
            return C5406j.m22806e(this, z);
        }

        @Override
        public int mo7851p0(boolean z) {
            return C5406j.m22810a(this, z);
        }

        @Override
        public int mo7850r0(boolean z) {
            return C5406j.m22804g(this, z);
        }
    }

    public C9232l0(Context context, View$OnClickListenerC9218k0 k0Var) {
        super(context);
        this.f29798c = k0Var;
        C4336c cVar = new C4336c(this);
        this.f29791O = cVar;
        cVar.m28243h(true);
        Drawable a = C2061e.m35727a(-16777216, 2, 80, false);
        this.f29789M = a;
        a.setAlpha(90);
        C6240c cVar2 = new C6240c(this, 1);
        this.f29797b = cVar2;
        cVar2.mo20251S0(true);
        this.f29796a.mo20259D0(0);
        this.f29797b.mo20259D0(0);
        C11131y6 k0 = C10536ab.m4667o1().m4681k0();
        C10536ab.m4667o1().m4716b1().m1554a(this);
        C10536ab.m4667o1().m4716b1().m1551d(this);
        m9865j();
        setUser(k0);
        C11052v1.m1768b().m1769a(this);
        C2065g.m35718d(this, new C9233a(R.id.theme_color_headerBackground));
    }

    public static int m9868g() {
        return C1357a0.m37541i(17.0f) + View$OnClickListenerC9170d1.getTopOffset();
    }

    public static int m9867h() {
        return C1357a0.m37541i(16.0f);
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return C4335b.m28258d(this, f, f2);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        if (f2 >= getMeasuredHeight() - C1357a0.m37541i(54.0f)) {
            C2065g.m35719c(this);
            this.f29798c.m9907jg(this.f29790N.m18727e());
        }
    }

    @Override
    public void mo61C4(C11131y6 y6Var, int i, int i2) {
        C11008t0.m1997e(this, y6Var, i, i2);
    }

    @Override
    public void mo1513D(TdApi.ChatList chatList, boolean z) {
        m9865j();
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28254h(this, view, f, f2);
    }

    @Override
    public void mo56G2(C11131y6 y6Var, TdApi.AuthorizationState authorizationState, int i) {
        C11008t0.m1995g(this, y6Var, authorizationState, i);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28261a(this);
    }

    @Override
    public void mo48O(C11131y6 y6Var, boolean z, boolean z2) {
        C9234b bVar = this.f29792P;
        if (bVar != null && bVar.m9859h(y6Var, false)) {
            setUser(y6Var);
        }
    }

    @Override
    public void mo47O6(C10930q6 q6Var, boolean z) {
        C11008t0.m1994h(this, q6Var, z);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (this.f29794R != f) {
            this.f29794R = f;
            invalidate();
        }
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28259c(this, f, f2);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (f == 1.0f) {
            m9869f();
        }
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28256f(this, view, f, f2);
    }

    @Override
    public void mo4501a3() {
        C10536ab.m4667o1().m4716b1().m1531x(this);
        C10536ab.m4667o1().m4716b1().m1529z(this);
        C11052v1.m1768b().m1766d(this);
    }

    @Override
    public void mo29b1(C11131y6 y6Var, int i) {
        C11008t0.m1996f(this, y6Var, i);
    }

    public final void m9869f() {
        this.f29792P = this.f29793Q;
        this.f29793Q = null;
        C6240c cVar = this.f29797b;
        C6240c cVar2 = this.f29796a;
        this.f29797b = cVar2;
        this.f29796a = cVar;
        cVar2.m20977j(null, null);
        this.f29794R = 0.0f;
        this.f29795S = null;
        invalidate();
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28257e(this, view, f, f2);
    }

    @Override
    public void mo452g2() {
        invalidate();
    }

    public C6866e1 getExpanderView() {
        return this.f29790N;
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28260b(this);
    }

    public final int m9866i(float f) {
        return C5064d.m24128d(C5064d.m24129c(C11524j.m161p0(), C11524j.m228N(R.id.theme_color_drawerText)), C11524j.m228N(R.id.theme_color_white), f);
    }

    public void m9865j() {
        C11164z6 a1 = C10536ab.m4667o1().m4720a1(C10536ab.m4667o1().m4681k0().f35705b);
        this.f29790N.m18728d(a1.m1328b(), a1.m1327c(), this.f29798c.m9963Af() > 0.0f);
    }

    @Override
    public void mo1512m(C10930q6 q6Var, TdApi.ChatList chatList, int i, boolean z) {
        C11104x0.m1523a(this, q6Var, chatList, i, z);
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return f2 >= ((float) (getMeasuredHeight() - C1357a0.m37541i(54.0f)));
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28255g(this, view, f, f2);
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29796a.mo20245f();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29796a.mo20247b();
    }

    @Override
    public void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: td.C9232l0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C9234b bVar = this.f29792P;
        if (bVar != null) {
            bVar.m9856l(getMeasuredWidth());
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = measuredHeight - C1357a0.m37541i(72.0f);
        int measuredWidth = getMeasuredWidth();
        Rect bounds = this.f29789M.getBounds();
        if (bounds.top != i3 || bounds.bottom != measuredHeight || bounds.right != measuredWidth) {
            this.f29789M.setBounds(0, i3, measuredWidth, measuredHeight);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f29791O.m28246e(this, motionEvent);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28253i(this, view, f, f2);
    }

    @Override
    public void mo12p4(C11131y6 y6Var, TdApi.User user, boolean z, boolean z2) {
        C9234b bVar = this.f29792P;
        if (bVar != null && bVar.m9859h(y6Var, false)) {
            setUser(y6Var);
        }
    }

    @Override
    public void mo11p6(C11131y6 y6Var, int i) {
        C11008t0.m1998d(this, y6Var, i);
    }

    public synchronized void setUser(C11131y6 y6Var) {
        boolean z = this.f29798c.m9963Af() > 0.0f && this.f29792P != null;
        C9234b bVar = new C9234b(this, y6Var);
        bVar.m9856l(getMeasuredWidth());
        C3950k kVar = this.f29795S;
        if (kVar != null) {
            kVar.m29542k();
            m9869f();
        }
        if (z) {
            this.f29793Q = bVar;
            bVar.m9860f(this.f29792P);
            this.f29797b.m20977j(bVar.f29802O, bVar.f29803P);
            C3950k kVar2 = new C3950k(0, this, C2057b.f7280b, 240L);
            this.f29795S = kVar2;
            kVar2.m29544i(1.0f);
        } else {
            this.f29792P = bVar;
            this.f29796a.m20977j(bVar.f29802O, bVar.f29803P);
            invalidate();
        }
    }

    @Override
    public void mo4v4(C11131y6 y6Var, TdApi.User user, int i, C11131y6 y6Var2) {
        setUser(y6Var);
        m9865j();
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return C4335b.m28251k(this, view, f, f2);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28252j(this, view, motionEvent, f, f2, f3, f4);
    }
}
