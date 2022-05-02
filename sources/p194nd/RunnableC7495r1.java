package p194nd;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import be.C1379j0;
import java.util.List;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p032c5.C1607b0;
import p073f4.C4260a;
import p174m3.AbstractC6604g3;
import p174m3.AbstractC6618i2;
import p174m3.AbstractC6689s;
import p174m3.C6591e2;
import p174m3.C6613h2;
import p174m3.C6637k2;
import p174m3.C6643l2;
import p174m3.C6644l3;
import p174m3.C6658o;
import p174m3.C6660o1;
import p174m3.C6693s1;
import p187n4.AbstractC7230t;
import p187n4.C7173e;
import p187n4.C7233t0;
import p199o3.C7602e;
import p225pd.C8112b;
import p350yd.C10552b0;
import p350yd.C10930q6;
import p356z4.C11272n;

public class RunnableC7495r1 implements AbstractC6618i2.AbstractC6624e, C10552b0.AbstractC10553a, Runnable {
    public static final int f23984l0;
    public View f23985M;
    public boolean f23986N;
    public boolean f23987O;
    public boolean f23988P;
    public boolean f23989Q;
    public final ViewGroup f23990R;
    public final int f23991S;
    public C8112b f23992T;
    public AbstractC7230t f23993U;
    public AbstractC7230t f23996X;
    public boolean f23997Y;
    public boolean f23998Z;
    public final Context f23999a;
    public C8112b f24000a0;
    public long f24002b0;
    public AbstractC6689s f24003c;
    public boolean f24004c0;
    public RunnableC7470o f24005d0;
    public AbstractC7496a f24007f0;
    public long f24008g0;
    public boolean f24009h0;
    public boolean f24010i0;
    public boolean f24011j0;
    public boolean f24012k0;
    public long f23994V = -1;
    public long f23995W = -1;
    public boolean f24006e0 = true;
    public final HandlerC7497b f24001b = new HandlerC7497b();

    public interface AbstractC7496a {
        void mo15774d(boolean z);

        void mo15773i();

        void mo15772k(boolean z);

        void mo15771p(long j, long j2);

        void mo15770q();
    }

    public static class HandlerC7497b extends Handler {
        public HandlerC7497b() {
        }

        @Override
        public void handleMessage(Message message) {
            ((RunnableC7495r1) message.obj).m15785Y();
        }
    }

    static {
        f23984l0 = Build.VERSION.SDK_INT >= 21 ? 24 : 42;
    }

    public RunnableC7495r1(Context context, ViewGroup viewGroup, int i) {
        this.f23999a = context;
        this.f23990R = viewGroup;
        this.f23991S = i;
    }

    public void m15802A() {
        m15789T(!this.f24009h0);
    }

    public View m15801B(boolean z) {
        if (this.f23985M == null) {
            TextureView textureView = new TextureView(this.f23999a);
            this.f23985M = textureView;
            textureView.setLayoutParams(FrameLayoutFix.m18008s1(-2, -2));
        }
        return this.f23985M;
    }

    @Override
    public void mo7370C(boolean z) {
    }

    public void m15800D() {
        View view = this.f23985M;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void m15799E() {
        m15789T(false);
        AbstractC6689s sVar = this.f24003c;
        if (sVar != null) {
            sVar.mo19779c(0L);
        }
        m15785Y();
    }

    public void m15798F(float f) {
        AbstractC6689s sVar = this.f24003c;
        if (sVar != null) {
            sVar.mo19779c((long) (sVar.mo19267g() * f));
            if (this.f24012k0) {
                this.f24012k0 = false;
                this.f24003c.mo19340v(true);
            }
            m15785Y();
        }
    }

    public void m15797G(RunnableC7470o oVar) {
        this.f24005d0 = oVar;
    }

    public void m15796H(AbstractC7496a aVar) {
        this.f24007f0 = aVar;
    }

    public final void m15795I(AbstractC7230t tVar) {
        AbstractC7230t tVar2;
        AbstractC6689s sVar = this.f24003c;
        if (sVar != null && (tVar2 = this.f23996X) != tVar) {
            if (tVar2 != null) {
                boolean z = tVar2 instanceof C7173e;
            }
            this.f23996X = tVar;
            sVar.mo19378M(tVar);
            this.f24003c.mo19279b();
        }
    }

    public final void m15794J(boolean z) {
        if (this.f24011j0 != z) {
            this.f24011j0 = z;
            m15782j();
        }
    }

    @Override
    public void mo7368K(AbstractC6604g3 g3Var, int i) {
        C6643l2.m19692x(this, g3Var, i);
    }

    @Override
    public void mo7367L(int i, boolean z) {
        C6643l2.m19711e(this, i, z);
    }

    @Override
    public void mo7366M(boolean z, int i) {
        C6637k2.m19739k(this, z, i);
    }

    @Override
    public void mo7365N(C6693s1 s1Var) {
        C6643l2.m19706j(this, s1Var);
    }

    public void m15793O() {
        this.f23989Q = true;
    }

    public final void m15792P(boolean z) {
        this.f23987O = z;
    }

    public void m15791Q(boolean z) {
        if (this.f24010i0 != z) {
            this.f24010i0 = z;
            m15782j();
        }
    }

    @Override
    public void mo7364R(int i) {
        C6643l2.m19696t(this, i);
    }

    public void m15790S(boolean z) {
        this.f23986N = z;
    }

    public final void m15789T(boolean z) {
        if (this.f24009h0 != z) {
            this.f24009h0 = z;
            if (z) {
                m15785Y();
            } else {
                this.f24001b.removeMessages(0);
            }
            AbstractC6689s sVar = this.f24003c;
            if (sVar != null) {
                sVar.mo19340v(z);
            }
            AbstractC7496a aVar = this.f24007f0;
            if (aVar != null) {
                aVar.mo15772k(z);
            }
            C1379j0.m37307r(this.f23999a).m14445r3(2, z);
        }
    }

    public void m15788U(float f) {
        AbstractC6689s sVar = this.f24003c;
        if (sVar != null) {
            sVar.mo19779c((long) (sVar.mo19267g() * f));
            m15785Y();
        }
    }

    @Override
    public void mo7363V(C7602e eVar) {
        C6643l2.m19715a(this, eVar);
    }

    public boolean m15787W(long j, long j2) {
        if (this.f23994V == j && this.f23995W == j2) {
            return false;
        }
        this.f23994V = j;
        this.f23995W = j2;
        if (j == -1 || j2 == -1) {
            m15795I(this.f23993U);
            return true;
        }
        m15795I(new C7173e(this.f23993U, j, j2));
        return true;
    }

    public void m15786X(p225pd.C8112b r9) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.RunnableC7495r1.m15786X(pd.b):void");
    }

    public final void m15785Y() {
        AbstractC6689s sVar;
        if (!(this.f24007f0 == null || (sVar = this.f24003c) == null || sVar.mo19267g() == -9223372036854775807L)) {
            this.f24008g0 = this.f24003c.mo19292Q();
            this.f24007f0.mo15771p(this.f24003c.mo19267g(), this.f24008g0);
        }
        if (this.f24009h0 && !this.f24012k0 && !this.f23986N) {
            HandlerC7497b bVar = this.f24001b;
            bVar.sendMessageDelayed(Message.obtain(bVar, 0, this), f23984l0);
        }
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
        C8112b bVar;
        int i;
        int i2;
        View view;
        if (this.f24003c != null && (bVar = this.f23992T) != null && (i = b0Var.f5886a) != 0 && (i2 = b0Var.f5887b) != 0 && bVar.m13468z0(i, i2) && (view = this.f23985M) != null) {
            view.requestLayout();
        }
    }

    @Override
    public void mo7359b0(C6660o1 o1Var, int i) {
        C6643l2.m19707i(this, o1Var, i);
    }

    @Override
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

    @Override
    public void mo7355e0(C6591e2 e2Var) {
        boolean z;
        boolean z2 = true;
        if (!C7389v0.m16576u1(e2Var) || !(z = this.f24006e0)) {
            Log.m14728e(Log.TAG_VIDEO, "Unable to play video", e2Var, new Object[0]);
            C8112b bVar = this.f23992T;
            if (bVar == null || !bVar.m13510e0()) {
                z2 = false;
            }
            C1379j0.m37292y0(C7389v0.m16556z1(e2Var) ? z2 ? R.string.GifPlaybackUnsupported : R.string.VideoPlaybackUnsupported : z2 ? R.string.GifPlaybackError : R.string.VideoPlaybackError, 0);
            m15786X(null);
            AbstractC7496a aVar = this.f24007f0;
            if (aVar != null) {
                aVar.mo15773i();
                return;
            }
            return;
        }
        Log.m14712w(Log.TAG_VIDEO, "Unable to play video, but trying to retry, preferExtensions:%b", e2Var, Boolean.valueOf(z));
        this.f24006e0 = !this.f24006e0;
        boolean z3 = this.f24009h0;
        C8112b bVar2 = this.f23992T;
        m15786X(null);
        m15786X(bVar2);
        m15789T(z3);
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

    public void m15783i() {
        if (this.f23998Z) {
            boolean z = false;
            this.f23998Z = false;
            C8112b bVar = this.f24000a0;
            if (bVar != null) {
                z = true;
            }
            this.f24004c0 = z;
            m15786X(bVar);
            this.f24000a0 = null;
        }
    }

    @Override
    public void mo7351i0(AbstractC6618i2.C6620b bVar) {
        C6643l2.m19714b(this, bVar);
    }

    public final void m15782j() {
        boolean z = this.f24010i0 || this.f24011j0;
        AbstractC6689s sVar = this.f24003c;
        if (sVar != null) {
            sVar.mo19360f(z ? 0.0f : 1.0f);
        }
    }

    @Override
    public void mo7349j0(C6658o oVar) {
        C6643l2.m19712d(this, oVar);
    }

    @Override
    public void mo7348k(boolean z) {
        C6637k2.m19746d(this, z);
    }

    @Override
    public void mo7347l(int i) {
    }

    @Override
    public void mo7346l0(C6591e2 e2Var) {
        C6643l2.m19699q(this, e2Var);
    }

    public boolean m15781m() {
        C8112b bVar = this.f23992T;
        if (bVar == null || this.f23998Z) {
            return false;
        }
        if (bVar.m13486q0()) {
            return m15787W(this.f23992T.m13526W(), this.f23992T.m13528V());
        }
        return m15787W(-1L, -1L);
    }

    @Override
    public void mo7344m0(boolean z) {
        C6643l2.m19708h(this, z);
    }

    public void m15780n() {
        this.f23997Y = true;
        m15786X(null);
    }

    @Override
    public void mo7343o(boolean z) {
        C6643l2.m19709g(this, z);
    }

    @Override
    public void mo7342p() {
    }

    @Override
    public void mo7341q(C6644l3 l3Var) {
        C6643l2.m19691y(this, l3Var);
    }

    public void m15779r() {
        if (!this.f23998Z) {
            this.f24000a0 = this.f23992T;
            this.f24002b0 = this.f24008g0;
            AbstractC6689s sVar = this.f24003c;
            if (sVar != null) {
                sVar.mo19340v(false);
            }
            m15789T(false);
            m15786X(null);
            this.f23998Z = true;
        }
    }

    @Override
    public void run() {
    }

    @Override
    public void mo7340s(AbstractC6618i2.C6625f fVar, AbstractC6618i2.C6625f fVar2, int i) {
        C6643l2.m19698r(this, fVar, fVar2, i);
    }

    @Override
    public void mo7339t(C7233t0 t0Var, C11272n nVar) {
        C6637k2.m19732r(this, t0Var, nVar);
    }

    @Override
    public void mo7338u(float f) {
        C6643l2.m19716A(this, f);
    }

    public void m15778v(boolean z) {
        this.f23988P = z;
    }

    @Override
    public void mo7223w(int i) {
        AbstractC6689s sVar;
        AbstractC7496a aVar = this.f24007f0;
        if (aVar != null) {
            if (i == 3) {
                aVar.mo15770q();
            }
            this.f24007f0.mo15774d(i == 2);
        }
        if (i == 4) {
            if (!this.f23987O || (sVar = this.f24003c) == null) {
                m15799E();
            } else {
                sVar.mo19779c(0L);
            }
        }
    }

    public View m15777x() {
        return this.f23985M;
    }

    public boolean m15776y() {
        return this.f24009h0;
    }

    @Override
    public void mo4536y2(C10930q6 q6Var, TdApi.Call call) {
        m15794J(call != null);
    }

    public void m15775z() {
        boolean z = this.f24009h0 && this.f24003c != null;
        this.f24012k0 = z;
        if (z) {
            this.f24003c.mo19340v(false);
        }
    }
}
