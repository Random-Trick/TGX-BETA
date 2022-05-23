package vd;

import a5.v;
import d5.b0;
import f4.a;
import hd.t2;
import java.util.List;
import m3.c2;
import m3.o;
import m3.o2;
import m3.o3;
import m3.r2;
import m3.s2;
import m3.t3;
import m3.u2;
import m3.y1;
import o3.e;
import o4.r0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import vd.o0;
import zd.o6;
import zd.ya;

public abstract class d implements o0.d, s2.d {
    public boolean f25440a;
    public o6 f25441b;
    public TdApi.Message f25442c;

    public void B(boolean z10) {
        u2.i(this, z10);
    }

    @Override
    public void D(int i10) {
        u2.t(this, i10);
    }

    public final boolean E(o6 o6Var, TdApi.Message message) {
        TdApi.Message message2;
        o6 o6Var2 = this.f25441b;
        return o6Var2 != null && o6Var2 == o6Var && (message2 = this.f25442c) != null && message2.chatId == message.chatId && message2.f19946id == message.f19946id && t2.o1(message2) == t2.o1(message);
    }

    public final void F() {
        this.f25440a = true;
        if (this.f25442c != null) {
            ya.o1().w2().d1(false);
        }
    }

    public abstract void G(o2 o2Var);

    @Override
    public void H(boolean z10) {
        u2.g(this, z10);
    }

    @Override
    public void I() {
        u2.x(this);
    }

    public abstract void J(o6 o6Var, TdApi.Message message, boolean z10);

    @Override
    public void K(t3 t3Var) {
        u2.D(this, t3Var);
    }

    public void L(s2.e eVar, s2.e eVar2, int i10) {
        u2.u(this, eVar, eVar2, i10);
    }

    @Override
    public void M(float f10) {
        u2.F(this, f10);
    }

    @Override
    public void N(int i10) {
        u2.o(this, i10);
    }

    public final long O() {
        TdApi.Message message = this.f25442c;
        if (message != null) {
            return message.chatId;
        }
        return 0L;
    }

    public void Q(boolean z10) {
        u2.y(this, z10);
    }

    public void S(o3 o3Var, int i10) {
        u2.B(this, o3Var, i10);
    }

    @Override
    public void T(int i10, boolean z10) {
        u2.e(this, i10, z10);
    }

    public void U(boolean z10, int i10) {
        u2.s(this, z10, i10);
    }

    @Override
    public void V(c2 c2Var) {
        u2.k(this, c2Var);
    }

    public void X(int i10) {
        u2.w(this, i10);
    }

    @Override
    public void Y(e eVar) {
        u2.a(this, eVar);
    }

    public final long Z() {
        TdApi.Message message = this.f25442c;
        if (message != null) {
            return message.f19946id;
        }
        return 0L;
    }

    public abstract boolean a0(TdApi.Message message);

    @Override
    public void b(boolean z10) {
        u2.z(this, z10);
    }

    public abstract void b0(boolean z10);

    @Override
    public void c0(boolean z10, int i10) {
        u2.m(this, z10, i10);
    }

    @Override
    public void d0(y1 y1Var, int i10) {
        u2.j(this, y1Var, i10);
    }

    @Override
    public void e0(s2 s2Var, s2.c cVar) {
        u2.f(this, s2Var, cVar);
    }

    @Override
    public final void e5(o6 o6Var, TdApi.Message message, int i10, int i11, float f10, boolean z10) {
        boolean z11 = i11 == 3;
        if (message == null || i11 == 0 || !a0(message) || this.f25440a) {
            message = null;
        }
        k0(o6Var, message, z11, z10);
    }

    public void g(r2 r2Var) {
        u2.n(this, r2Var);
    }

    public void h0(o2 o2Var) {
        Log.e(Log.TAG_PLAYER, "onPlayerError", o2Var, new Object[0]);
        if (this.f25442c != null) {
            G(o2Var);
            q0();
        }
    }

    @Override
    public void i0(int i10, int i11) {
        u2.A(this, i10, i11);
    }

    public void j0(r0 r0Var, v vVar) {
        u2.C(this, r0Var, vVar);
    }

    public final void k0(o6 o6Var, TdApi.Message message, boolean z10, boolean z11) {
        TdApi.Message message2 = this.f25442c;
        if (message2 != null || message != null) {
            if (message == null) {
                o6 o6Var2 = this.f25441b;
                this.f25441b = o6Var;
                this.f25442c = null;
                J(o6Var2, message2, z11);
                return;
            }
            boolean z12 = this.f25441b == o6Var && message2 != null && message2.chatId == message.f19946id;
            int o12 = message2 != null ? t2.o1(message2) : -1;
            o6 o6Var3 = this.f25441b;
            boolean E = E(o6Var, message);
            this.f25441b = o6Var;
            this.f25442c = message;
            if (E) {
                b0(z10);
            } else {
                l0(o6Var, message, z11, z12, o6Var3, o12);
            }
        }
    }

    public abstract void l0(o6 o6Var, TdApi.Message message, boolean z10, boolean z11, o6 o6Var2, int i10);

    @Override
    public void m0(s2.b bVar) {
        u2.b(this, bVar);
    }

    @Override
    public void n0(o oVar) {
        u2.d(this, oVar);
    }

    @Override
    public void o(a aVar) {
        u2.l(this, aVar);
    }

    @Override
    public void o0(o2 o2Var) {
        u2.r(this, o2Var);
    }

    @Override
    public void p0(boolean z10) {
        u2.h(this, z10);
    }

    @Override
    public void q() {
        u2.v(this);
    }

    public final void q0() {
        TdApi.Message message = this.f25442c;
        if (message != null) {
            this.f25442c = null;
            J(this.f25441b, message, false);
        }
    }

    @Override
    public void r(List list) {
        u2.c(this, list);
    }

    @Override
    public void x(b0 b0Var) {
        u2.E(this, b0Var);
    }

    @Override
    public void z(int i10) {
        u2.p(this, i10);
    }
}
