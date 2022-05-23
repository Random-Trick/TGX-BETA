package vc;

import ae.a;
import ae.h;
import ae.j;
import ae.l;
import ae.p;
import ae.z;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import ce.a0;
import ce.b;
import ce.j0;
import eb.k;
import ib.d;
import kb.c;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import r1.b;
import zd.o6;
import zd.t7;

public class m4 extends View implements l, a, k.b, t7.e, c {
    public ld.c M;
    public h N;
    public h O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public h S;
    public boolean T;
    public float U;
    public k V;
    public final v2 f25123a;
    public final o6 f25124b;
    public final b.a W = new b.a();
    public ld.c f25125c = new ld.c(this, 0);

    public m4(Context context, v2 v2Var, o6 o6Var) {
        super(context);
        this.f25123a = v2Var;
        this.f25124b = o6Var;
    }

    public static void e(h hVar, Canvas canvas, b.a aVar, p pVar, ld.c cVar, float f10) {
        int i10 = i(pVar);
        if (hVar == null || hVar.R()) {
            canvas.drawColor(d.a(f10, i10));
        } else if (hVar.V()) {
            canvas.drawColor(d.a(f10, hVar.j(i10)));
        } else if (hVar.U()) {
            b.l(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.K(), hVar.m(), hVar.H(), f10);
        } else if (hVar.T()) {
            canvas.drawColor(d.a(f10, hVar.j(i10)));
            b.p(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.r(), f10);
        } else if (hVar.X()) {
            if (hVar.Z()) {
                b.l(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.K(), hVar.m(), hVar.H(), f10);
            } else if (hVar.Y()) {
                canvas.drawColor(d.a(f10, hVar.j(i10)));
                b.p(canvas, aVar, cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom(), hVar.r(), f10);
            } else {
                canvas.drawColor(d.a(f10, hVar.j(i10)));
            }
            cVar.h().setColorFilter(hVar.B());
            float F = hVar.F() * f10;
            int i11 = (F > 1.0f ? 1 : (F == 1.0f ? 0 : -1));
            if (i11 != 0) {
                cVar.V(F);
            }
            cVar.h().draw(canvas);
            if (i11 != 0) {
                cVar.Q();
            }
        } else {
            if (cVar.e0()) {
                canvas.drawColor(d.a(f10, i10));
            }
            cVar.D();
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                cVar.V(f10);
            }
            cVar.draw(canvas);
            if (i12 != 0) {
                cVar.Q();
            }
        }
    }

    public static int f(h hVar, ld.h hVar2, int i10, boolean z10) {
        if (z10) {
            return i10;
        }
        int s10 = h.s(hVar.u(), 0);
        if (s10 != 0) {
            return s10;
        }
        if (hVar.X()) {
            return d.b((int) (((hVar.F() * 0.3f) + 0.7f) * 112.0f), hVar.B());
        }
        if (hVar.S()) {
            return d.b(112, hVar.J());
        }
        b.d u10 = hVar2 != null ? hVar2.u() : null;
        return u10 == null ? i10 : z10 ? d.b(255, u10.f()) : d.b(112, u10.e());
    }

    public static int h(h hVar, ld.c cVar, int i10, boolean z10) {
        return (hVar == null || hVar.R()) ? i10 : d.d(f(hVar, cVar.f().r(), i10, z10), f(hVar, cVar.d().r(), i10, z10), cVar.c());
    }

    public static int i(p pVar) {
        return d.c(pVar.e(R.id.theme_color_background), pVar.e(R.id.theme_color_bubble_chatBackground));
    }

    public void m(TdApi.User user) {
        h hVar;
        if (user != null && (hVar = this.S) != null) {
            p(hVar, this.T);
        }
    }

    @Override
    public void C4(int i10, int i11, float f10, boolean z10) {
        if (i11 == R.id.theme_property_wallpaperUsageId) {
            p(this.f25124b.tc().I(j.h0(i10)), true);
        }
    }

    @Override
    public void Q2() {
        this.f25125c.b0();
        ld.c cVar = this.M;
        if (cVar != null) {
            cVar.b0();
        }
        this.f25124b.e2().M1(this);
        z.u().U(this);
        z.u().R(this);
    }

    @Override
    public boolean V0() {
        return false;
    }

    @Override
    public void W0(String str) {
    }

    @Override
    public void a(o6 o6Var, h hVar, int i10) {
        if (this.f25124b == o6Var && i10 == j.g0()) {
            if (this.Q) {
                hVar = h.f0(o6Var, hVar, this.R);
            }
            p(hVar, true);
        }
    }

    @Override
    public void c(o6 o6Var, int i10) {
        if (this.f25124b == o6Var) {
            o(this.f25125c, this.N);
            this.f25123a.r0().Gr();
        }
    }

    public final void d() {
        k kVar = this.V;
        if (kVar == null) {
            this.V = new k(0, this, db.b.f7287b, 180L);
        } else if (kVar.o() == 1.0f) {
            k kVar2 = this.V;
            this.U = 0.0f;
            kVar2.l(0.0f);
        }
        this.V.i(1.0f);
    }

    public int g(int i10, boolean z10) {
        if (!this.f25123a.x3()) {
            return i10;
        }
        if (l()) {
            float f10 = this.U;
            if (f10 != 0.0f) {
                if (f10 == 1.0f) {
                    return h(this.O, this.M, i10, z10);
                }
                return d.d(h(this.N, this.f25125c, i10, z10), h(this.O, this.M, i10, z10), this.U);
            }
        }
        return h(this.N, this.f25125c, i10, z10);
    }

    public float getBackgroundTransparency() {
        if (!this.f25123a.x3()) {
            return 0.0f;
        }
        k kVar = this.V;
        if (kVar == null || !kVar.v()) {
            return this.N != null ? 0.0f : 1.0f;
        }
        if (this.O == null) {
            return this.U;
        }
        if (this.N == null) {
            return 1.0f - this.U;
        }
        return 0.0f;
    }

    @Override
    public void i3(p pVar, p pVar2) {
        int i02 = j.i0(pVar2);
        if (j.i0(pVar) != i02) {
            p(this.f25124b.tc().I(i02), true);
        }
    }

    public void j(h hVar) {
        this.P = true;
        this.M = new ld.c(this, 0);
        p(hVar, false);
    }

    @Override
    public void j6(boolean z10, ae.b bVar) {
        o(this.f25125c, this.N);
    }

    public void k(boolean z10) {
        this.P = z10;
        this.M = new ld.c(this, 0);
        p(this.f25124b.tc().I(j.g0()), false);
        z.u().e(this);
        z.u().d(this);
        this.f25124b.e2().J(this);
    }

    @Override
    public void k2(final TdApi.User user) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                m4.this.m(user);
            }
        });
    }

    public final boolean l() {
        k kVar = this.V;
        return kVar != null && kVar.v();
    }

    public final void n() {
        int measuredWidth = getMeasuredWidth();
        int max = Math.max(a0.e(), getMeasuredHeight());
        this.f25125c.K0(0, 0, measuredWidth, max);
        ld.c cVar = this.M;
        if (cVar != null) {
            cVar.K0(0, 0, measuredWidth, max);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (this.U != f10) {
            this.U = f10;
            if (this.f25123a.r0().Wk() && this.f25123a.x3() && this.f25123a.E0() != null) {
                this.f25123a.E0().o0();
            }
            invalidate();
        }
    }

    public final void o(ld.c cVar, h hVar) {
        if (hVar != null) {
            hVar.k0(cVar, !hVar.X());
        } else {
            cVar.j(null, null);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (f10 == 1.0f) {
            this.N = this.O;
            this.O = null;
            ld.c cVar = this.f25125c;
            ld.c cVar2 = this.M;
            this.f25125c = cVar2;
            cVar2.S0(false);
            this.M = cVar;
            this.U = 0.0f;
            cVar.clear();
            if (this.f25123a.x3() && this.f25123a.E0() != null) {
                this.f25123a.E0().o0();
            }
            invalidate();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f25123a.x3()) {
            n();
            if (!l()) {
                e(this.N, canvas, this.W, z.u().i(), this.f25125c, 1.0f);
                return;
            }
            float f10 = this.U;
            if (f10 == 0.0f) {
                e(this.N, canvas, this.W, z.u().Q(), this.f25125c, 1.0f);
            } else if (f10 == 1.0f) {
                e(this.O, canvas, this.W, z.u().g(), this.M, 1.0f);
            } else {
                e(this.N, canvas, this.W, z.u().Q(), this.f25125c, 1.0f);
                e(this.O, canvas, this.W, z.u().g(), this.M, this.U);
            }
        } else {
            canvas.drawColor(j.L(R.id.theme_color_chatBackground));
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        n();
    }

    public final void p(h hVar, boolean z10) {
        if (hVar != null && hVar.R()) {
            hVar = null;
        }
        boolean z11 = z10 && this.f25123a.r0().Ta();
        if (this.f25124b.fa() == 0) {
            this.S = hVar;
            this.T = z11;
            return;
        }
        h hVar2 = this.N;
        if (hVar2 == hVar) {
            return;
        }
        if (!z11) {
            this.N = hVar;
            o(this.f25125c, hVar);
            if (this.f25123a.x3() && this.f25123a.E0() != null) {
                this.f25123a.E0().o0();
            }
        } else if (!h.h(hVar2, hVar, false)) {
            this.O = hVar;
            this.M.S0(this.P);
            o(this.M, hVar);
            d();
        }
    }

    @Override
    public void q0(int i10) {
    }

    public void setSelfBlur(boolean z10) {
        this.Q = true;
        this.R = z10;
        z.u().d(this);
    }
}
