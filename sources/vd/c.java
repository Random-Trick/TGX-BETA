package vd;

import a5.v;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ce.j0;
import d5.b0;
import eb.k;
import f4.a;
import hd.t2;
import hd.v2;
import he.i;
import ib.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.c2;
import m3.o;
import m3.o2;
import m3.o3;
import m3.r2;
import m3.s;
import m3.s2;
import m3.t3;
import m3.u1;
import m3.u2;
import m3.y1;
import o3.e;
import o4.p0;
import o4.r0;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.AudioService;
import vd.o0;
import zd.o6;
import zd.ya;

public class c extends vd.d implements v2.a, o0.e, k.b {
    public final ya M;
    public int N;
    public int O;
    public v2 P;
    public s Q;
    public ArrayList<TdApi.Message> R;
    public boolean S;
    public int T = -1;
    public float U = 1.0f;
    public boolean V;
    public k W;
    public boolean X;
    public long Y;
    public d Z;
    public boolean f25417a0;
    public o6 f25418b0;
    public TdApi.Message f25419c0;
    public k4.a f25420d0;
    public ArrayList<C0234c> f25421e0;

    public class a implements s2.d {
        public boolean f25422a;
        public final Runnable f25423b;
        public final s f25424c;

        public a(Runnable runnable, s sVar) {
            this.f25423b = runnable;
            this.f25424c = sVar;
        }

        public final void A() {
            if (!this.f25422a) {
                this.f25422a = true;
                j0.e0(this.f25423b, 250L);
            }
        }

        @Override
        public void B(boolean z10) {
            u2.i(this, z10);
        }

        @Override
        public void D(int i10) {
            u2.t(this, i10);
        }

        @Override
        public void H(boolean z10) {
            u2.g(this, z10);
        }

        @Override
        public void I() {
            u2.x(this);
        }

        @Override
        public void K(t3 t3Var) {
            u2.D(this, t3Var);
        }

        @Override
        public void L(s2.e eVar, s2.e eVar2, int i10) {
            u2.u(this, eVar, eVar2, i10);
        }

        @Override
        public void M(float f10) {
            u2.F(this, f10);
        }

        @Override
        public void N(int i10) {
            if (this.f25422a) {
                return;
            }
            if (i10 == 1 || !this.f25424c.k()) {
                A();
            }
        }

        @Override
        public void Q(boolean z10) {
            u2.y(this, z10);
        }

        @Override
        public void S(o3 o3Var, int i10) {
            u2.B(this, o3Var, i10);
        }

        @Override
        public void T(int i10, boolean z10) {
            u2.e(this, i10, z10);
        }

        @Override
        public void U(boolean z10, int i10) {
            u2.s(this, z10, i10);
        }

        @Override
        public void V(c2 c2Var) {
            u2.k(this, c2Var);
        }

        @Override
        public void X(int i10) {
            u2.w(this, i10);
        }

        @Override
        public void Y(e eVar) {
            u2.a(this, eVar);
        }

        @Override
        public void b(boolean z10) {
            u2.z(this, z10);
        }

        @Override
        public void c0(boolean z10, int i10) {
            if (!this.f25422a && !z10 && this.f25424c.E() == 1) {
                A();
            }
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
        public void g(r2 r2Var) {
            u2.n(this, r2Var);
        }

        @Override
        public void h0(o2 o2Var) {
            A();
        }

        @Override
        public void i0(int i10, int i11) {
            u2.A(this, i10, i11);
        }

        @Override
        public void j0(r0 r0Var, v vVar) {
            u2.C(this, r0Var, vVar);
        }

        @Override
        public void m0(s2.b bVar) {
            u2.b(this, bVar);
        }

        @Override
        public void n0(o oVar) {
            u2.d(this, oVar);
        }

        @Override
        public void o(f4.a aVar) {
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

    public interface b {
        void a(o6 o6Var, TdApi.Message message, k4.a aVar);
    }

    public static class C0234c {
        public final o6 f25425a;
        public final TdApi.Message f25426b;
        public final ArrayList<b> f25427c;

        public C0234c(o6 o6Var, TdApi.Message message, b bVar) {
            this.f25425a = o6Var;
            this.f25426b = message;
            ArrayList<b> arrayList = new ArrayList<>();
            this.f25427c = arrayList;
            arrayList.add(bVar);
        }

        public void d(k4.a aVar) {
            Iterator<b> it = this.f25427c.iterator();
            while (it.hasNext()) {
                it.next().a(this.f25425a, this.f25426b, aVar);
            }
        }
    }

    public static class d extends Handler {
        public final c f25428a;

        public d(c cVar) {
            super(Looper.getMainLooper());
            this.f25428a = cVar;
        }

        @Override
        public void handleMessage(Message message) {
            if (this.f25428a.f25417a0) {
                this.f25428a.A0();
                this.f25428a.B0();
            }
        }
    }

    public c(ya yaVar, o0 o0Var) {
        this.M = yaVar;
        o0Var.p(this);
        o0Var.q(this, false);
    }

    public static k4.a G0(r0 r0Var) {
        for (int i10 = 0; i10 < r0Var.f19175a; i10++) {
            p0 b10 = r0Var.b(i10);
            for (int i11 = 0; i11 < b10.f19166a; i11++) {
                f4.a aVar = b10.b(i11).S;
                if (aVar != null) {
                    int d10 = aVar.d();
                    for (int i12 = 0; i12 < d10; i12++) {
                        a.b c10 = aVar.c(i12);
                        if (c10 instanceof k4.a) {
                            return (k4.a) c10;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public void N0() {
        k4.a G0;
        int i10 = this.T;
        if (i10 != -1 && i10 >= 0 && i10 < this.R.size()) {
            TdApi.Message message = this.R.get(this.T);
            if (!o0.D(this.f25419c0, message) && (G0 = G0(this.Q.P())) != null) {
                F0(this.f25441b, message, G0);
            }
        }
    }

    public static void O0(AtomicBoolean atomicBoolean, s sVar) {
        if (!atomicBoolean.getAndSet(true)) {
            sVar.a();
        }
    }

    public static void V0(s2 s2Var, int i10, int i11, boolean z10) {
        Log.i((int) Log.TAG_PLAYER, "seekTo windowIndex:%d size:%d, reverse:%b", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10));
        try {
            s2Var.y(z10 ? (i11 - i10) - 1 : i10);
        } catch (u1 unused) {
            Log.e("Cannot complete seekTo because of bug. Please report to the developer. windowIndex:%d, totalSize:%d, reverse:%b, currentWindowIndex:%d, previousWindowIndex:%d, nextWindowIndex:%d", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Integer.valueOf(s2Var.v()), Integer.valueOf(s2Var.C()), Integer.valueOf(s2Var.K()));
        }
    }

    @Override
    public void A(v2 v2Var, int i10, boolean z10) {
    }

    public final void A0() {
        s sVar;
        if (this.N == 3 && (sVar = this.Q) != null) {
            long g10 = sVar.g();
            long V = this.Q.V();
            if (g10 != -9223372036854775807L || V != -9223372036854775807L) {
                long max = Math.max(-1L, g10);
                long max2 = Math.max(-1L, V);
                float f10 = max <= 0 ? 0.0f : max2 >= max ? 1.0f : (float) (max2 / max);
                if (this.f25442c != null) {
                    o0 w22 = this.M.w2();
                    o6 o6Var = this.f25441b;
                    TdApi.Message message = this.f25442c;
                    w22.X0(o6Var, message.chatId, message.f19946id, t2.o1(message), f10, max2, max, this.Q.E() == 2);
                }
            }
        }
    }

    @Override
    public void B(boolean z10) {
        Log.d((int) Log.TAG_PLAYER, "[state] onLoadingChanged %b", Boolean.valueOf(z10));
    }

    public final void B0() {
        d dVar = this.Z;
        dVar.sendMessageDelayed(Message.obtain(dVar, 0), w0());
    }

    @Override
    public void C(v2 v2Var, int i10, float f10) {
        TdApi.Message message;
        if (this.f25441b != null && v2Var.k() == this.f25441b && (message = this.f25442c) != null && t2.o1(message) == i10) {
            o0 w22 = this.M.w2();
            o6 o6Var = this.f25441b;
            TdApi.Message message2 = this.f25442c;
            w22.X0(o6Var, message2.chatId, message2.f19946id, i10, f10, -1L, -1L, false);
        }
    }

    public void C0() {
        if (this.f25417a0) {
            boolean z10 = false;
            if (this.Z.hasMessages(0)) {
                this.Z.removeMessages(0);
                z10 = true;
            }
            A0();
            if (z10) {
                B0();
            }
        }
    }

    public final void D0() {
        this.f25418b0 = null;
        this.f25420d0 = null;
        this.f25419c0 = null;
    }

    public final int E0(boolean z10) {
        int y12 = i.c2().y1();
        if (y12 <= 0 || y12 > 3) {
            return 3;
        }
        return y12;
    }

    @Override
    public void E2(int i10) {
        s sVar;
        if (this.N == 3 && (sVar = this.Q) != null) {
            sVar.d(o0.i0(L0(), i10));
        }
    }

    public final void F0(o6 o6Var, TdApi.Message message, k4.a aVar) {
        synchronized (this) {
            if (!o0.D(this.f25419c0, message) || this.f25420d0 == null) {
                this.f25418b0 = o6Var;
                this.f25419c0 = message;
                this.f25420d0 = aVar;
                ArrayList<C0234c> arrayList = this.f25421e0;
                if (arrayList != null) {
                    int i10 = 0;
                    Iterator<C0234c> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0234c next = it.next();
                        if (next.f25425a == o6Var && o0.D(next.f25426b, message)) {
                            next.d(aVar);
                            next.f25427c.clear();
                            this.f25421e0.remove(i10);
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
    }

    @Override
    public void G(o2 o2Var) {
        j0.y0(v0.z1(o2Var) ? R.string.AudioPlaybackUnsupported : R.string.AudioPlaybackError, 0);
    }

    public float H0(long j10, float f10) {
        if (j10 <= 0) {
            return f10;
        }
        double d10 = j10;
        return Math.min(f10, (float) ((d10 - 5.0d) / d10));
    }

    public final boolean I0() {
        return (this.O & Log.TAG_ROUND) != 0;
    }

    @Override
    public void J(o6 o6Var, TdApi.Message message, boolean z10) {
        int i10 = this.N;
        if (i10 == 1) {
            gd.b0.k().u();
        } else if (i10 == 3) {
            ArrayList<TdApi.Message> arrayList = this.R;
            if (arrayList != null) {
                arrayList.clear();
                this.T = -1;
            }
            final s sVar = this.Q;
            if (sVar != null) {
                if (this.S) {
                    sVar.O(this);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    Runnable aVar = new Runnable() {
                        @Override
                        public final void run() {
                            c.O0(atomicBoolean, sVar);
                        }
                    };
                    sVar.U(new a(aVar, sVar));
                    sVar.x(false);
                    j0.e0(aVar, 1000L);
                } else {
                    sVar.a();
                }
                this.Q = null;
            }
        }
        Y0(0, false);
    }

    public boolean J0() {
        int i10 = this.T;
        return i10 != -1 && i10 >= 0 && i10 < this.R.size();
    }

    @Override
    public void K1(o6 o6Var, TdApi.Message message, int i10, boolean z10) {
        int i11;
        if (this.N == 3 && this.Q != null) {
            boolean I0 = I0();
            TdApi.Message message2 = null;
            if (z10) {
                i11 = this.Q.K();
                if (i11 == -1) {
                    i11 = -1;
                } else if (I0) {
                    i11 = (this.R.size() - i11) - 1;
                }
                if (i11 != -1) {
                    message2 = this.R.get(i11);
                }
            } else {
                i11 = i10;
            }
            this.R.remove(i10);
            if (i10 < i11) {
                i11--;
            }
            if (z10) {
                this.T = i11;
            } else {
                int i12 = this.T;
                if (i10 < i12) {
                    this.T = i12 - 1;
                }
            }
            int s10 = this.Q.s();
            if (I0) {
                this.Q.r((s10 - i10) - 1);
            } else {
                this.Q.r(i10);
            }
            if (z10) {
                P0(o6Var, message2);
            }
        }
    }

    @Override
    public void K6(o6 o6Var, TdApi.Message message, int i10) {
        if (this.N == 3) {
            this.R.add(i10, message);
            int i11 = this.T;
            if (i10 <= i11) {
                this.T = i11 + 1;
            }
            o4.s h22 = v0.h2(o6Var.A6(), message);
            int s10 = this.Q.s();
            if (I0()) {
                i10 = s10 - i10;
            }
            this.Q.A(i10, h22);
        }
    }

    @Override
    public void L(s2.e eVar, s2.e eVar2, int i10) {
        int i11 = this.N;
        if (i11 == 3) {
            Log.d((int) Log.TAG_PLAYER, "[state] onPositionDiscontinuity mode:%d, reason:%d", Integer.valueOf(i11), Integer.valueOf(i10));
            z0();
        }
    }

    public boolean L0() {
        return J0() && this.R.get(this.T).content.getConstructor() == 527777781;
    }

    @Override
    public void L6(o6 o6Var, TdApi.Message message, int i10, List<TdApi.Message> list, boolean z10, int i11) {
        if (this.N == 3 && this.Q != null && this.T != i10) {
            boolean z11 = false;
            Log.i((int) Log.TAG_PLAYER, "trackList position change id:%d, newIndex:%d, totalCount:%d, byUserRequest:%b", Long.valueOf(message.f19946id), Integer.valueOf(i10), Integer.valueOf(list.size()), Boolean.valueOf(z10));
            this.T = i10;
            if (!this.X) {
                s sVar = this.Q;
                int size = this.R.size();
                if ((this.O & Log.TAG_ROUND) != 0) {
                    z11 = true;
                }
                V0(sVar, i10, size, z11);
                this.Q.x(this.S);
            }
        }
    }

    public boolean M0() {
        return this.N == 3 && this.Q != null;
    }

    public final void P0(o6 o6Var, TdApi.Message message) {
        this.X = true;
        this.M.w2().I0(o6Var, message, true);
        this.X = false;
    }

    @Override
    public void P1(o6 o6Var, List<TdApi.Message> list, boolean z10) {
        if (this.N == 3) {
            if (z10) {
                this.R.addAll(list);
            } else {
                this.R.addAll(0, list);
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            boolean z11 = true;
            boolean z12 = (this.O & Log.TAG_ROUND) != 0;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                arrayList.add(v0.h2(o6Var.A6(), list.get(z12 ? size : (list.size() - 1) - size)));
            }
            if (z12 == z10) {
                z11 = false;
            }
            if (z11) {
                this.Q.q(arrayList);
            } else {
                this.Q.e(0, arrayList);
            }
            if (!z10) {
                this.T += list.size();
            }
        }
    }

    @Override
    public void Q(boolean z10) {
    }

    public k4.a R0(o6 o6Var, TdApi.Message message, b bVar) {
        synchronized (this) {
            if (o0.E(this.f25418b0, o6Var, this.f25419c0, message)) {
                bVar.a(o6Var, message, this.f25420d0);
                return this.f25420d0;
            }
            ArrayList<C0234c> arrayList = this.f25421e0;
            if (arrayList != null) {
                Iterator<C0234c> it = arrayList.iterator();
                while (it.hasNext()) {
                    C0234c next = it.next();
                    if (next.f25425a == o6Var && o0.D(next.f25426b, message)) {
                        next.f25427c.add(bVar);
                        return null;
                    }
                }
            } else {
                this.f25421e0 = new ArrayList<>();
            }
            this.f25421e0.add(new C0234c(o6Var, message, bVar));
            return null;
        }
    }

    @Override
    public void S(o3 o3Var, int i10) {
        Log.d((int) Log.TAG_PLAYER, "[state] onTimeLineChanged reason:%d", Integer.valueOf(i10));
    }

    public final int S0(int i10, int i11, boolean z10) {
        return z10 ? (i11 - i10) - 1 : i10;
    }

    public void T0(long j10, long j11) {
        s sVar;
        int i10 = this.N;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3 && (sVar = this.Q) != null) {
                    sVar.c(j10);
                }
            } else if (j11 != -1 && j10 >= 0 && j11 >= j10) {
                gd.b0.k().s(this.P, h.d((float) (j10 / j11)));
            }
        }
    }

    @Override
    public void U(boolean z10, int i10) {
        s sVar;
        int i11;
        s sVar2;
        boolean z11 = true;
        X0(i10 == 3);
        boolean z12 = i10 == 2;
        if (z12 != (this.Y != 0)) {
            if (z12) {
                this.Y = SystemClock.uptimeMillis();
            } else {
                Log.i((int) Log.TAG_PLAYER, "[state] buffering finished in %dms", Long.valueOf(SystemClock.uptimeMillis() - this.Y));
                this.Y = 0L;
            }
            A0();
        }
        Log.d((int) Log.TAG_PLAYER, "[state] onPlayerStateChanged mode:%d, playWhenReady:%b, state:%d", Integer.valueOf(this.N), Boolean.valueOf(z10), Integer.valueOf(i10));
        if (i10 != 2) {
            if (i10 != 4 || (i11 = this.N) == 0) {
                return;
            }
            if (i11 != 3 || (sVar2 = this.Q) == null || sVar2.Q() != 1) {
                this.M.w2().D0();
            }
        } else if (this.N == 3 && (sVar = this.Q) != null && sVar.Q() != 1) {
            long V = this.Q.V();
            long g10 = this.Q.g();
            int v10 = this.Q.v();
            int K = this.Q.K();
            if (V != -9223372036854775807L && g10 != -9223372036854775807L && v10 != -1 && K != -1 && g10 >= 5000 && g10 - V < 500) {
                int s10 = this.Q.s();
                TdApi.File j12 = t2.j1(this.R.get(S0(v10, s10, I0())));
                if (j12 == null || !j12.local.isDownloadingCompleted) {
                    z11 = false;
                }
                Log.i((int) Log.TAG_PLAYER, "[state] seeking to the next window, because we received buffering at the end of the current file, fileLoaded:%b", new Object[0]);
                if (z11) {
                    V0(this.Q, K, s10, false);
                }
            }
        }
    }

    public final void W0() {
        if (this.Q != null) {
            this.M.w2().N0().i(this.Q, 2);
        }
    }

    @Override
    public void X(int i10) {
    }

    public final void X0(boolean z10) {
        if (this.f25417a0 != z10) {
            this.f25417a0 = z10;
            if (z10) {
                if (this.Z == null) {
                    this.Z = new d(this);
                }
                B0();
                return;
            }
            d dVar = this.Z;
            if (dVar != null) {
                dVar.removeMessages(0);
            }
            A0();
        } else if (!z10) {
            A0();
        }
    }

    public final void Y0(int i10, boolean z10) {
        if (this.N != i10) {
            this.N = i10;
            if (i10 == 3) {
                j0.D0(new Intent(j0.n(), AudioService.class), z10, false);
            }
        }
    }

    public void Z0(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            if (this.W == null) {
                this.W = new k(0, this, db.b.f7287b, 300L, this.U);
            }
            float f10 = z10 ? 0.035f : 1.0f;
            if (this.N == 3 && this.Q != null && this.S) {
                this.W.i(f10);
                return;
            }
            this.W.l(f10);
            a1(f10);
        }
    }

    @Override
    public boolean a0(TdApi.Message message) {
        int constructor = message.content.getConstructor();
        return constructor == 276722716 || constructor == 527777781;
    }

    public final void a1(float f10) {
        if (this.U != f10) {
            this.U = f10;
            s sVar = this.Q;
            if (sVar != null) {
                sVar.f(f10);
            }
        }
    }

    @Override
    public void b0(boolean z10) {
        s sVar;
        int i10 = this.N;
        if (i10 != 1) {
            if (i10 == 3 && (sVar = this.Q) != null) {
                this.S = z10;
                sVar.x(z10);
            }
        } else if (z10) {
            gd.b0.k().p(this.P);
        } else {
            gd.b0.k().o(this.P);
        }
    }

    public void b1(boolean z10) {
        s sVar;
        int i10 = this.N;
        if (i10 != 0 && i10 == 3 && (sVar = this.Q) != null) {
            int v10 = sVar.v();
            if (v10 == -1) {
                Log.i((int) Log.TAG_PLAYER, "Couldn't skip, because current position is unset", new Object[0]);
                return;
            }
            boolean z11 = this.Q.Q() == 1;
            if (z11) {
                this.Q.J(2);
            }
            int K = z10 ? this.Q.K() : this.Q.C();
            boolean I0 = I0();
            Log.i((int) Log.TAG_PLAYER, "skipping track position:%d, desiredPosition:%d reverse:%b", Integer.valueOf(v10), Integer.valueOf(K), Boolean.valueOf(I0));
            if (K == -1) {
                this.M.w2().d1(true);
                return;
            }
            this.Q.y(K);
            if (z11) {
                this.Q.J(1);
            }
            s sVar2 = this.Q;
            this.S = true;
            sVar2.x(true);
            this.M.w2().B0(this.R.get(S0(K, this.Q.s(), I0)));
        }
    }

    @Override
    public void g(r2 r2Var) {
        Log.d((int) Log.TAG_PLAYER, "[state] onPlaybackParametersChanged", new Object[0]);
    }

    @Override
    public void g0(o6 o6Var, TdApi.Message message) {
        if (E(o6Var, message)) {
            W0();
        }
    }

    @Override
    public void g6() {
    }

    @Override
    public void h0(o2 o2Var) {
        G(o2Var);
        if (this.N != 0) {
            this.M.w2().D0();
        }
    }

    @Override
    public void j0(r0 r0Var, v vVar) {
        Log.d((int) Log.TAG_PLAYER, "[state] onTracksChanged", new Object[0]);
        if (this.N == 3 && this.T != -1 && G0(r0Var) != null) {
            y0();
        }
    }

    @Override
    public void j1(o6 o6Var, TdApi.Message message, int i10, int i11) {
        if (this.N == 3) {
            ib.b.w(this.R, i10, i11);
            int i12 = this.T;
            if (i12 == i10) {
                this.T = i11;
            } else {
                if (i10 < i12) {
                    this.T = i12 - 1;
                }
                int i13 = this.T;
                if (i11 <= i13) {
                    this.T = i13 + 1;
                }
            }
            int s10 = this.Q.s();
            if (I0()) {
                this.Q.L((s10 - i10) - 1, (s10 - i11) - 1);
            } else {
                this.Q.L(i10, i11);
            }
        }
    }

    @Override
    public void l0(o6 o6Var, TdApi.Message message, boolean z10, boolean z11, o6 o6Var2, int i10) {
        if (this.N == 0) {
            Y0(E0(message.content.getConstructor() == 527777781), message.content.getConstructor() == 276722716);
        }
        Log.i((int) Log.TAG_PLAYER, "startPlayback mode:%d byUserRequest:%b, hadObject:%b, previousFileId:%d", Integer.valueOf(this.N), Boolean.valueOf(z10), Boolean.valueOf(z11), Integer.valueOf(i10));
        int i11 = this.N;
        if (i11 == 1) {
            if (message.content.getConstructor() == 527777781) {
                this.P = new v2(o6Var, message, ((TdApi.MessageVoiceNote) message.content).voiceNote);
            } else {
                this.P = new v2(o6Var, message, ((TdApi.MessageAudio) message.content).audio);
            }
            this.P.g(this);
            gd.b0.k().p(this.P);
        } else if (i11 == 3) {
            if (z10 || !z11) {
                this.S = true;
            }
        }
    }

    @Override
    public void m7(o6 o6Var, long j10, long j11, long j12, boolean z10, boolean z11, List<TdApi.Message> list) {
        if (this.N == 3) {
            D0();
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            a1(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void u4(o6 o6Var, TdApi.Message message, int i10, List<TdApi.Message> list, long j10, int i11, int i12) {
        if (this.N == 3) {
            this.O = i11;
            boolean I0 = I0();
            Log.i((int) Log.TAG_PLAYER, "trackList reset id:%d, index:%d, totalSize:%d", Long.valueOf(message.f19946id), Integer.valueOf(i10), Integer.valueOf(list.size()));
            ArrayList<TdApi.Message> arrayList = this.R;
            if (arrayList == null) {
                this.R = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            this.R.ensureCapacity(list.size());
            this.R.addAll(list);
            this.T = i10;
            int size = list.size();
            ArrayList arrayList2 = new ArrayList(size);
            if (I0) {
                for (int i13 = size - 1; i13 >= 0; i13--) {
                    arrayList2.add(v0.h2(o6Var.A6(), list.get(i13)));
                }
            } else {
                for (TdApi.Message message2 : list) {
                    arrayList2.add(v0.h2(o6Var.A6(), message2));
                }
            }
            s sVar = this.Q;
            if (sVar != null) {
                sVar.O(this);
                this.Q.a();
                this.Q = null;
            }
            s Z1 = v0.Z1(j0.n(), true);
            this.Q = Z1;
            Z1.U(this);
            W0();
            this.Q.f(this.U);
            int N = o0.N(i11);
            if (N == 2) {
                this.Q.J(2);
            } else if (N == 4) {
                this.Q.J(1);
            }
            if ((i11 & 1) != 0) {
                this.Q.l(true);
            }
            this.Q.t(arrayList2);
            this.Q.b();
            V0(this.Q, i10, arrayList2.size(), I0);
            this.Q.x(this.S);
        }
    }

    @Override
    public void v4(int i10) {
        if (this.N == 3 && this.Q != null) {
            boolean I0 = I0();
            boolean z10 = false;
            if (I0 != ((32768 & i10) != 0)) {
                int s10 = this.Q.s();
                int S0 = S0(this.T, s10, I0);
                for (int i11 = S0 - 1; i11 >= 0; i11--) {
                    this.Q.L(i11, (S0 - i11) + i11);
                }
                for (int i12 = S0 + 1; i12 < s10; i12++) {
                    this.Q.L(i12, 0);
                }
            }
            int N = o0.N(this.O);
            int N2 = o0.N(i10);
            if (N != N2) {
                if (N2 == 2) {
                    this.Q.J(2);
                } else if (N2 != 4) {
                    this.Q.J(0);
                } else {
                    this.Q.J(1);
                }
            }
            boolean z11 = (this.O & 1) != 0;
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            if (z11 != z10) {
                this.Q.l(z10);
            }
            this.O = i10;
        }
    }

    public final long w0() {
        s sVar = this.Q;
        long g10 = sVar != null ? sVar.g() : -9223372036854775807L;
        if (g10 == -9223372036854775807L || g10 < 1000) {
            return 25L;
        }
        long max = (long) (Math.max(1.0d, g10 / 30000.0d) * 30.0d);
        if (max < 1000 || !this.M.w2().T()) {
            return max;
        }
        return 1000L;
    }

    public void x0(o6 o6Var, TdApi.Message message, b bVar) {
        synchronized (this) {
            ArrayList<C0234c> arrayList = this.f25421e0;
            if (arrayList != null) {
                int i10 = 0;
                Iterator<C0234c> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0234c next = it.next();
                    if (!o0.E(next.f25425a, o6Var, next.f25426b, message)) {
                        i10++;
                    } else if (next.f25427c.remove(bVar) && next.f25427c.isEmpty()) {
                        this.f25421e0.remove(i10);
                    }
                }
            }
        }
    }

    public final void y0() {
        j0.e0(new Runnable() {
            @Override
            public final void run() {
                c.this.N0();
            }
        }, 50L);
    }

    public final void z0() {
        s sVar;
        if (this.N == 3 && (sVar = this.Q) != null && this.R != null) {
            int v10 = sVar.v();
            if (v10 != -1 && I0()) {
                v10 = S0(v10, this.R.size(), true);
            }
            if (v10 != this.T && v10 >= 0 && v10 < this.R.size()) {
                Log.i((int) Log.TAG_PLAYER, "Next track reached, updating UI only %d -> %d", Integer.valueOf(this.T), Integer.valueOf(v10));
                this.T = v10;
                P0(this.f25441b, this.R.get(v10));
            }
        }
    }
}
