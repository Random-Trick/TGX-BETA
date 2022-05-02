package p292ud;

import gd.C4779t2;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p032c5.C1607b0;
import p073f4.C4260a;
import p174m3.AbstractC6604g3;
import p174m3.AbstractC6618i2;
import p174m3.C6591e2;
import p174m3.C6613h2;
import p174m3.C6637k2;
import p174m3.C6643l2;
import p174m3.C6644l3;
import p174m3.C6658o;
import p174m3.C6660o1;
import p174m3.C6693s1;
import p187n4.C7233t0;
import p199o3.C7602e;
import p292ud.C9773p0;
import p350yd.C10536ab;
import p350yd.C10930q6;
import p356z4.C11272n;

public abstract class AbstractC9732d implements C9773p0.AbstractC9777d, AbstractC6618i2.AbstractC6624e {
    public boolean f31649a;
    public C10930q6 f31650b;
    public TdApi.Message f31651c;

    public final void m7371A(C10930q6 q6Var, TdApi.Message message, boolean z, boolean z2) {
        TdApi.Message message2 = this.f31651c;
        if (message2 != null || message != null) {
            if (message == null) {
                C10930q6 q6Var2 = this.f31650b;
                this.f31650b = q6Var;
                this.f31651c = null;
                mo7231r(q6Var2, message2, z2);
                return;
            }
            boolean z3 = this.f31650b == q6Var && message2 != null && message2.chatId == message.f25406id;
            int o1 = message2 != null ? C4779t2.m25459o1(message2) : -1;
            C10930q6 q6Var3 = this.f31650b;
            boolean j = m7350j(q6Var, message);
            this.f31650b = q6Var;
            this.f31651c = message;
            if (j) {
                mo7218z(z);
            } else {
                mo7294B(q6Var, message, z2, z3, q6Var3, o1);
            }
        }
    }

    public abstract void mo7294B(C10930q6 q6Var, TdApi.Message message, boolean z, boolean z2, C10930q6 q6Var2, int i);

    public void mo7370C(boolean z) {
        C6643l2.m19695u(this, z);
    }

    public final void m7369D() {
        TdApi.Message message = this.f31651c;
        if (message != null) {
            this.f31651c = null;
            mo7231r(this.f31650b, message, false);
        }
    }

    public void mo7368K(AbstractC6604g3 g3Var, int i) {
        C6643l2.m19692x(this, g3Var, i);
    }

    @Override
    public void mo7367L(int i, boolean z) {
        C6643l2.m19711e(this, i, z);
    }

    public void mo7366M(boolean z, int i) {
        C6637k2.m19739k(this, z, i);
    }

    @Override
    public void mo7365N(C6693s1 s1Var) {
        C6643l2.m19706j(this, s1Var);
    }

    public void mo7364R(int i) {
        C6643l2.m19696t(this, i);
    }

    @Override
    public void mo7363V(C7602e eVar) {
        C6643l2.m19715a(this, eVar);
    }

    @Override
    public final void mo6983Y1(C10930q6 q6Var, TdApi.Message message, int i, int i2, float f, boolean z) {
        boolean z2 = i2 == 3;
        if (message == null || i2 == 0 || !mo7220y(message) || this.f31649a) {
            message = null;
        }
        m7371A(q6Var, message, z2, z);
    }

    @Override
    public void mo7362a(boolean z) {
        C6643l2.m19694v(this, z);
    }

    @Override
    public void mo7361a0(boolean z, int i) {
        C6643l2.m19704l(this, z, i);
    }

    @Override
    public void mo7360b(C1607b0 b0Var) {
        C6643l2.m19690z(this, b0Var);
    }

    @Override
    public void mo7359b0(C6660o1 o1Var, int i) {
        C6643l2.m19707i(this, o1Var, i);
    }

    public void mo7358c(C6613h2 h2Var) {
        C6643l2.m19703m(this, h2Var);
    }

    @Override
    public void mo7357c0(AbstractC6618i2 i2Var, AbstractC6618i2.C6623d dVar) {
        C6643l2.m19710f(this, i2Var, dVar);
    }

    @Override
    public void mo7356d(C4260a aVar) {
        C6643l2.m19705k(this, aVar);
    }

    @Override
    public void mo7252e() {
        C6643l2.m19697s(this);
    }

    public void mo7355e0(C6591e2 e2Var) {
        Log.m14728e(Log.TAG_PLAYER, "onPlayerError", e2Var, new Object[0]);
        if (this.f31651c != null) {
            mo7239n(e2Var);
            m7369D();
        }
    }

    @Override
    public void mo7354f0(int i, int i2) {
        C6643l2.m19693w(this, i, i2);
    }

    @Override
    public void mo7353g(List list) {
        C6643l2.m19713c(this, list);
    }

    @Override
    public void mo7352h(int i) {
        C6643l2.m19701o(this, i);
    }

    @Override
    public void mo7351i0(AbstractC6618i2.C6620b bVar) {
        C6643l2.m19714b(this, bVar);
    }

    public final boolean m7350j(C10930q6 q6Var, TdApi.Message message) {
        TdApi.Message message2;
        C10930q6 q6Var2 = this.f31650b;
        return q6Var2 != null && q6Var2 == q6Var && (message2 = this.f31651c) != null && message2.chatId == message.chatId && message2.f25406id == message.f25406id && C4779t2.m25459o1(message2) == C4779t2.m25459o1(message);
    }

    @Override
    public void mo7349j0(C6658o oVar) {
        C6643l2.m19712d(this, oVar);
    }

    public void mo7348k(boolean z) {
        C6637k2.m19746d(this, z);
    }

    @Override
    public void mo7347l(int i) {
        C6637k2.m19738l(this, i);
    }

    @Override
    public void mo7346l0(C6591e2 e2Var) {
        C6643l2.m19699q(this, e2Var);
    }

    public final void m7345m() {
        this.f31649a = true;
        if (this.f31651c != null) {
            C10536ab.m4667o1().m4636w2().m7061d1(false);
        }
    }

    @Override
    public void mo7344m0(boolean z) {
        C6643l2.m19708h(this, z);
    }

    public abstract void mo7239n(C6591e2 e2Var);

    @Override
    public void mo7343o(boolean z) {
        C6643l2.m19709g(this, z);
    }

    @Override
    public void mo7342p() {
        C6637k2.m19735o(this);
    }

    @Override
    public void mo7341q(C6644l3 l3Var) {
        C6643l2.m19691y(this, l3Var);
    }

    public abstract void mo7231r(C10930q6 q6Var, TdApi.Message message, boolean z);

    public void mo7340s(AbstractC6618i2.C6625f fVar, AbstractC6618i2.C6625f fVar2, int i) {
        C6643l2.m19698r(this, fVar, fVar2, i);
    }

    public void mo7339t(C7233t0 t0Var, C11272n nVar) {
        C6637k2.m19732r(this, t0Var, nVar);
    }

    @Override
    public void mo7338u(float f) {
        C6643l2.m19716A(this, f);
    }

    public final long m7337v() {
        TdApi.Message message = this.f31651c;
        if (message != null) {
            return message.chatId;
        }
        return 0L;
    }

    @Override
    public void mo7223w(int i) {
        C6643l2.m19702n(this, i);
    }

    public final long m7336x() {
        TdApi.Message message = this.f31651c;
        if (message != null) {
            return message.f25406id;
        }
        return 0L;
    }

    public abstract boolean mo7220y(TdApi.Message message);

    public abstract void mo7218z(boolean z);
}
