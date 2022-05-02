package p292ud;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import be.C1379j0;
import gd.C4779t2;
import gd.C4812v2;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.AudioService;
import p032c5.C1607b0;
import p037cb.C2057b;
import p051db.C3950k;
import p073f4.C4260a;
import p082fd.C4356b0;
import p108hb.C5062b;
import p108hb.C5069h;
import p147k4.C6053a;
import p174m3.AbstractC6604g3;
import p174m3.AbstractC6618i2;
import p174m3.AbstractC6689s;
import p174m3.C6591e2;
import p174m3.C6613h2;
import p174m3.C6636k1;
import p174m3.C6637k2;
import p174m3.C6643l2;
import p174m3.C6644l3;
import p174m3.C6658o;
import p174m3.C6660o1;
import p174m3.C6693s1;
import p187n4.AbstractC7230t;
import p187n4.C7227r0;
import p187n4.C7233t0;
import p199o3.C7602e;
import p292ud.C9773p0;
import p350yd.C10536ab;
import p350yd.C10930q6;
import p356z4.C11272n;

public class C9726c extends AbstractC9732d implements C4812v2.AbstractC4813a, C9773p0.AbstractC9778e, C3950k.AbstractC3952b {
    public final C10536ab f31621M;
    public int f31622N;
    public int f31623O;
    public C4812v2 f31624P;
    public AbstractC6689s f31625Q;
    public ArrayList<TdApi.Message> f31626R;
    public boolean f31627S;
    public int f31628T = -1;
    public float f31629U = 1.0f;
    public boolean f31630V;
    public C3950k f31631W;
    public boolean f31632X;
    public long f31633Y;
    public HandlerC9730d f31634Z;
    public boolean f31635a0;
    public C10930q6 f31636b0;
    public TdApi.Message f31637c0;
    public C6053a f31638d0;
    public ArrayList<C9729c> f31639e0;

    public class C9727a implements AbstractC6618i2.AbstractC6624e {
        public boolean f31641a;
        public final Runnable f31642b;
        public final AbstractC6689s f31643c;

        public C9727a(Runnable runnable, AbstractC6689s sVar) {
            this.f31642b = runnable;
            this.f31643c = sVar;
        }

        @Override
        public void mo7370C(boolean z) {
            C6643l2.m19695u(this, z);
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

        @Override
        public void mo7364R(int i) {
            C6643l2.m19696t(this, i);
        }

        @Override
        public void mo7363V(C7602e eVar) {
            C6643l2.m19715a(this, eVar);
        }

        @Override
        public void mo7362a(boolean z) {
            C6643l2.m19694v(this, z);
        }

        @Override
        public void mo7361a0(boolean z, int i) {
            if (!this.f31641a && !z && this.f31643c.mo19217z() == 1) {
                m7377f();
            }
        }

        @Override
        public void mo7360b(C1607b0 b0Var) {
            C6643l2.m19690z(this, b0Var);
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
            m7377f();
        }

        public final void m7377f() {
            if (!this.f31641a) {
                this.f31641a = true;
                C1379j0.m37332e0(this.f31642b, 250L);
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
            C6637k2.m19738l(this, i);
        }

        @Override
        public void mo7346l0(C6591e2 e2Var) {
            C6643l2.m19699q(this, e2Var);
        }

        @Override
        public void mo7344m0(boolean z) {
            C6643l2.m19708h(this, z);
        }

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

        @Override
        public void mo7223w(int i) {
            if (this.f31641a) {
                return;
            }
            if (i == 1 || !this.f31643c.mo19255k()) {
                m7377f();
            }
        }
    }

    public interface AbstractC9728b {
        void mo7376a(C10930q6 q6Var, TdApi.Message message, C6053a aVar);
    }

    public static class C9729c {
        public final C10930q6 f31644a;
        public final TdApi.Message f31645b;
        public final ArrayList<AbstractC9728b> f31646c;

        public C9729c(C10930q6 q6Var, TdApi.Message message, AbstractC9728b bVar) {
            this.f31644a = q6Var;
            this.f31645b = message;
            ArrayList<AbstractC9728b> arrayList = new ArrayList<>();
            this.f31646c = arrayList;
            arrayList.add(bVar);
        }

        public void m7372d(C6053a aVar) {
            Iterator<AbstractC9728b> it = this.f31646c.iterator();
            while (it.hasNext()) {
                it.next().mo7376a(this.f31644a, this.f31645b, aVar);
            }
        }
    }

    public static class HandlerC9730d extends Handler {
        public final C9726c f31647a;

        public HandlerC9730d(C9726c cVar) {
            super(Looper.getMainLooper());
            this.f31647a = cVar;
        }

        @Override
        public void handleMessage(Message message) {
            if (this.f31647a.f31635a0) {
                this.f31647a.m7401S();
                this.f31647a.m7400T();
            }
        }
    }

    public C9726c(C10536ab abVar, C9773p0 p0Var) {
        this.f31621M = abVar;
        p0Var.m7030p(this);
        p0Var.m7028q(this, false);
    }

    public static C6053a m7395d0(C7233t0 t0Var) {
        for (int i = 0; i < t0Var.f23029a; i++) {
            C7227r0 b = t0Var.m17245b(i);
            for (int i2 = 0; i2 < b.f23023a; i2++) {
                C4260a aVar = b.m17272b(i2).f20573S;
                if (aVar != null) {
                    int d = aVar.m28327d();
                    for (int i3 = 0; i3 < d; i3++) {
                        C4260a.AbstractC4262b c = aVar.m28328c(i3);
                        if (c instanceof C6053a) {
                            return (C6053a) c;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public void m7387q0() {
        C6053a d0;
        int i = this.f31628T;
        if (i != -1 && i >= 0 && i < this.f31626R.size()) {
            TdApi.Message message = this.f31626R.get(this.f31628T);
            if (!C9773p0.m7114D(this.f31637c0, message) && (d0 = m7395d0(this.f31625Q.mo19305J())) != null) {
                m7396Z(this.f31650b, message, d0);
            }
        }
    }

    public static void m7386r0(AtomicBoolean atomicBoolean, AbstractC6689s sVar) {
        if (!atomicBoolean.getAndSet(true)) {
            sVar.mo19281a();
        }
    }

    public static void m7381w0(AbstractC6618i2 i2Var, int i, int i2, boolean z) {
        Log.m14721i((int) Log.TAG_PLAYER, "seekTo windowIndex:%d size:%d, reverse:%b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        try {
            i2Var.mo19775w(z ? (i2 - i) - 1 : i);
        } catch (C6636k1 unused) {
            Log.m14724e("Cannot complete seekTo because of bug. Please report to the developer. windowIndex:%d, totalSize:%d, reverse:%b, currentWindowIndex:%d, previousWindowIndex:%d, nextWindowIndex:%d", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i2Var.mo19776u()), Integer.valueOf(i2Var.mo19774y()), Integer.valueOf(i2Var.mo19781F()));
        }
    }

    public void m7413A0(boolean z) {
        if (this.f31630V != z) {
            this.f31630V = z;
            if (this.f31631W == null) {
                this.f31631W = new C3950k(0, this, C2057b.f7280b, 300L, this.f31629U);
            }
            float f = z ? 0.035f : 1.0f;
            if (this.f31622N == 3 && this.f31625Q != null && this.f31627S) {
                this.f31631W.m29544i(f);
                return;
            }
            this.f31631W.m29541l(f);
            m7412B0(f);
        }
    }

    @Override
    public void mo7294B(C10930q6 q6Var, TdApi.Message message, boolean z, boolean z2, C10930q6 q6Var2, int i) {
        if (this.f31622N == 0) {
            m7378z0(m7397Y(message.content.getConstructor() == 527777781), message.content.getConstructor() == 276722716);
        }
        Log.m14721i((int) Log.TAG_PLAYER, "startPlayback mode:%d byUserRequest:%b, hadObject:%b, previousFileId:%d", Integer.valueOf(this.f31622N), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i));
        int i2 = this.f31622N;
        if (i2 == 1) {
            if (message.content.getConstructor() == 527777781) {
                this.f31624P = new C4812v2(q6Var, message, ((TdApi.MessageVoiceNote) message.content).voiceNote);
            } else {
                this.f31624P = new C4812v2(q6Var, message, ((TdApi.MessageAudio) message.content).audio);
            }
            this.f31624P.m25199g(this);
            C4356b0.m28201k().m28196p(this.f31624P);
        } else if (i2 == 3) {
            if (z || !z2) {
                this.f31627S = true;
            }
        }
    }

    public final void m7412B0(float f) {
        if (this.f31629U != f) {
            this.f31629U = f;
            AbstractC6689s sVar = this.f31625Q;
            if (sVar != null) {
                sVar.mo19360f(f);
            }
        }
    }

    @Override
    public void mo6982B3(C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, long j, int i2, int i3) {
        if (this.f31622N == 3) {
            this.f31623O = i2;
            boolean h0 = m7392h0();
            Log.m14721i((int) Log.TAG_PLAYER, "trackList reset id:%d, index:%d, totalSize:%d", Long.valueOf(message.f25406id), Integer.valueOf(i), Integer.valueOf(list.size()));
            ArrayList<TdApi.Message> arrayList = this.f31626R;
            if (arrayList == null) {
                this.f31626R = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            this.f31626R.ensureCapacity(list.size());
            this.f31626R.addAll(list);
            this.f31628T = i;
            int size = list.size();
            ArrayList arrayList2 = new ArrayList(size);
            if (h0) {
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    arrayList2.add(C7389v0.m16627h2(q6Var.m2188w6(), list.get(i4)));
                }
            } else {
                for (TdApi.Message message2 : list) {
                    arrayList2.add(C7389v0.m16627h2(q6Var.m2188w6(), message2));
                }
            }
            AbstractC6689s sVar = this.f31625Q;
            if (sVar != null) {
                sVar.mo19383I(this);
                this.f31625Q.mo19281a();
                this.f31625Q = null;
            }
            AbstractC6689s Z1 = C7389v0.m16659Z1(C1379j0.m37315n(), true);
            this.f31625Q = Z1;
            Z1.mo19294P(this);
            m7380x0();
            this.f31625Q.mo19360f(this.f31629U);
            int N = C9773p0.m7094N(i2);
            if (N == 2) {
                this.f31625Q.mo19312E(2);
            } else if (N == 4) {
                this.f31625Q.mo19312E(1);
            }
            if ((i2 & 1) != 0) {
                this.f31625Q.mo19252l(true);
            }
            this.f31625Q.mo19344s(arrayList2);
            this.f31625Q.mo19279b();
            m7381w0(this.f31625Q, i, arrayList2.size(), h0);
            this.f31625Q.mo19340v(this.f31627S);
        }
    }

    @Override
    public void mo7370C(boolean z) {
    }

    public void m7411C0(boolean z) {
        AbstractC6689s sVar;
        int i = this.f31622N;
        if (i != 0 && i == 3 && (sVar = this.f31625Q) != null) {
            int u = sVar.mo19776u();
            if (u == -1) {
                Log.m14721i((int) Log.TAG_PLAYER, "Couldn't skip, because current position is unset", new Object[0]);
                return;
            }
            boolean z2 = this.f31625Q.mo19303K() == 1;
            if (z2) {
                this.f31625Q.mo19312E(2);
            }
            int F = z ? this.f31625Q.mo19781F() : this.f31625Q.mo19774y();
            boolean h0 = m7392h0();
            Log.m14721i((int) Log.TAG_PLAYER, "skipping track position:%d, desiredPosition:%d reverse:%b", Integer.valueOf(u), Integer.valueOf(F), Boolean.valueOf(h0));
            if (F == -1) {
                this.f31621M.m4636w2().m7061d1(true);
                return;
            }
            this.f31625Q.mo19775w(F);
            if (z2) {
                this.f31625Q.mo19312E(1);
            }
            AbstractC6689s sVar2 = this.f31625Q;
            this.f31627S = true;
            sVar2.mo19340v(true);
            this.f31621M.m4636w2().m7117B0(this.f31626R.get(m7383u0(F, this.f31625Q.mo19777r(), h0)));
        }
    }

    @Override
    public void mo6981E4(int i) {
        if (this.f31622N == 3 && this.f31625Q != null) {
            boolean h0 = m7392h0();
            boolean z = false;
            if (h0 != ((32768 & i) != 0)) {
                int r = this.f31625Q.mo19777r();
                int u0 = m7383u0(this.f31628T, r, h0);
                for (int i2 = u0 - 1; i2 >= 0; i2--) {
                    this.f31625Q.mo19780G(i2, (u0 - i2) + i2);
                }
                for (int i3 = u0 + 1; i3 < r; i3++) {
                    this.f31625Q.mo19780G(i3, 0);
                }
            }
            int N = C9773p0.m7094N(this.f31623O);
            int N2 = C9773p0.m7094N(i);
            if (N != N2) {
                if (N2 == 2) {
                    this.f31625Q.mo19312E(2);
                } else if (N2 != 4) {
                    this.f31625Q.mo19312E(0);
                } else {
                    this.f31625Q.mo19312E(1);
                }
            }
            boolean z2 = (this.f31623O & 1) != 0;
            if ((i & 1) != 0) {
                z = true;
            }
            if (z2 != z) {
                this.f31625Q.mo19252l(z);
            }
            this.f31623O = i;
        }
    }

    @Override
    public void mo6980G3(C10930q6 q6Var, TdApi.Message message, int i, int i2) {
        if (this.f31622N == 3) {
            C5062b.m24149w(this.f31626R, i, i2);
            int i3 = this.f31628T;
            if (i3 == i) {
                this.f31628T = i2;
            } else {
                if (i < i3) {
                    this.f31628T = i3 - 1;
                }
                int i4 = this.f31628T;
                if (i2 <= i4) {
                    this.f31628T = i4 + 1;
                }
            }
            int r = this.f31625Q.mo19777r();
            if (m7392h0()) {
                this.f31625Q.mo19780G((r - i) - 1, (r - i2) - 1);
            } else {
                this.f31625Q.mo19780G(i, i2);
            }
        }
    }

    public final long m7405J() {
        AbstractC6689s sVar = this.f31625Q;
        long g = sVar != null ? sVar.mo19267g() : -9223372036854775807L;
        if (g == -9223372036854775807L || g < 1000) {
            return 25L;
        }
        long max = (long) (Math.max(1.0d, g / 30000.0d) * 30.0d);
        if (max < 1000 || !this.f31621M.m4636w2().m7082T()) {
            return max;
        }
        return 1000L;
    }

    @Override
    public void mo7368K(AbstractC6604g3 g3Var, int i) {
        Log.m14733d((int) Log.TAG_PLAYER, "[state] onTimeLineChanged reason:%d", Integer.valueOf(i));
    }

    @Override
    public void mo7366M(boolean z, int i) {
        AbstractC6689s sVar;
        int i2;
        AbstractC6689s sVar2;
        boolean z2 = true;
        m7379y0(i == 3);
        boolean z3 = i == 2;
        if (z3 != (this.f31633Y != 0)) {
            if (z3) {
                this.f31633Y = SystemClock.uptimeMillis();
            } else {
                Log.m14721i((int) Log.TAG_PLAYER, "[state] buffering finished in %dms", Long.valueOf(SystemClock.uptimeMillis() - this.f31633Y));
                this.f31633Y = 0L;
            }
            m7401S();
        }
        Log.m14733d((int) Log.TAG_PLAYER, "[state] onPlayerStateChanged mode:%d, playWhenReady:%b, state:%d", Integer.valueOf(this.f31622N), Boolean.valueOf(z), Integer.valueOf(i));
        if (i != 2) {
            if (i != 4 || (i2 = this.f31622N) == 0) {
                return;
            }
            if (i2 != 3 || (sVar2 = this.f31625Q) == null || sVar2.mo19303K() != 1) {
                this.f31621M.m4636w2().m7113D0();
            }
        } else if (this.f31622N == 3 && (sVar = this.f31625Q) != null && sVar.mo19303K() != 1) {
            long Q = this.f31625Q.mo19292Q();
            long g = this.f31625Q.mo19267g();
            int u = this.f31625Q.mo19776u();
            int F = this.f31625Q.mo19781F();
            if (Q != -9223372036854775807L && g != -9223372036854775807L && u != -1 && F != -1 && g >= 5000 && g - Q < 500) {
                int r = this.f31625Q.mo19777r();
                TdApi.File j1 = C4779t2.m25494j1(this.f31626R.get(m7383u0(u, r, m7392h0())));
                if (j1 == null || !j1.local.isDownloadingCompleted) {
                    z2 = false;
                }
                Log.m14721i((int) Log.TAG_PLAYER, "[state] seeking to the next window, because we received buffering at the end of the current file, fileLoaded:%b", new Object[0]);
                if (z2) {
                    m7381w0(this.f31625Q, F, r, false);
                }
            }
        }
    }

    @Override
    public void mo6979M4(C10930q6 q6Var, TdApi.Message message, int i, boolean z) {
        int i2;
        if (this.f31622N == 3 && this.f31625Q != null) {
            boolean h0 = m7392h0();
            TdApi.Message message2 = null;
            if (z) {
                i2 = this.f31625Q.mo19781F();
                if (i2 == -1) {
                    i2 = -1;
                } else if (h0) {
                    i2 = (this.f31626R.size() - i2) - 1;
                }
                if (i2 != -1) {
                    message2 = this.f31626R.get(i2);
                }
            } else {
                i2 = i;
            }
            this.f31626R.remove(i);
            if (i < i2) {
                i2--;
            }
            if (z) {
                this.f31628T = i2;
            } else {
                int i3 = this.f31628T;
                if (i < i3) {
                    this.f31628T = i3 - 1;
                }
            }
            int r = this.f31625Q.mo19777r();
            if (h0) {
                this.f31625Q.mo19778q((r - i) - 1);
            } else {
                this.f31625Q.mo19778q(i);
            }
            if (z) {
                m7385s0(q6Var, message2);
            }
        }
    }

    @Override
    public void mo6985N2(int i) {
        AbstractC6689s sVar;
        if (this.f31622N == 3 && (sVar = this.f31625Q) != null) {
            sVar.mo19275d(C9773p0.m7047i0(m7389n0(), i));
        }
    }

    public void m7404O(C10930q6 q6Var, TdApi.Message message, AbstractC9728b bVar) {
        synchronized (this) {
            ArrayList<C9729c> arrayList = this.f31639e0;
            if (arrayList != null) {
                int i = 0;
                Iterator<C9729c> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C9729c next = it.next();
                    if (!C9773p0.m7112E(next.f31644a, q6Var, next.f31645b, message)) {
                        i++;
                    } else if (next.f31646c.remove(bVar) && next.f31646c.isEmpty()) {
                        this.f31639e0.remove(i);
                    }
                }
            }
        }
    }

    public final void m7403P() {
        C1379j0.m37332e0(new Runnable() {
            @Override
            public final void run() {
                C9726c.this.m7387q0();
            }
        }, 50L);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m7412B0(f);
        }
    }

    public final void m7402Q() {
        AbstractC6689s sVar;
        if (this.f31622N == 3 && (sVar = this.f31625Q) != null && this.f31626R != null) {
            int u = sVar.mo19776u();
            if (u != -1 && m7392h0()) {
                u = m7383u0(u, this.f31626R.size(), true);
            }
            if (u != this.f31628T && u >= 0 && u < this.f31626R.size()) {
                Log.m14721i((int) Log.TAG_PLAYER, "Next track reached, updating UI only %d -> %d", Integer.valueOf(this.f31628T), Integer.valueOf(u));
                this.f31628T = u;
                m7385s0(this.f31650b, this.f31626R.get(u));
            }
        }
    }

    @Override
    public void mo7364R(int i) {
    }

    @Override
    public void mo6978R0(C10930q6 q6Var, List<TdApi.Message> list, boolean z) {
        if (this.f31622N == 3) {
            if (z) {
                this.f31626R.addAll(list);
            } else {
                this.f31626R.addAll(0, list);
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            boolean z2 = true;
            boolean z3 = (this.f31623O & Log.TAG_ROUND) != 0;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                arrayList.add(C7389v0.m16627h2(q6Var.m2188w6(), list.get(z3 ? size : (list.size() - 1) - size)));
            }
            if (z3 == z) {
                z2 = false;
            }
            if (z2) {
                this.f31625Q.mo19348p(arrayList);
            } else {
                this.f31625Q.mo19362e(0, arrayList);
            }
            if (!z) {
                this.f31628T += list.size();
            }
        }
    }

    public final void m7401S() {
        AbstractC6689s sVar;
        if (this.f31622N == 3 && (sVar = this.f31625Q) != null) {
            long g = sVar.mo19267g();
            long Q = this.f31625Q.mo19292Q();
            if (g != -9223372036854775807L || Q != -9223372036854775807L) {
                long max = Math.max(-1L, g);
                long max2 = Math.max(-1L, Q);
                float f = max <= 0 ? 0.0f : max2 >= max ? 1.0f : (float) (max2 / max);
                if (this.f31651c != null) {
                    C9773p0 w2 = this.f31621M.m4636w2();
                    C10930q6 q6Var = this.f31650b;
                    TdApi.Message message = this.f31651c;
                    w2.m7073X0(q6Var, message.chatId, message.f25406id, C4779t2.m25459o1(message), f, max2, max, this.f31625Q.mo19217z() == 2);
                }
            }
        }
    }

    public final void m7400T() {
        HandlerC9730d dVar = this.f31634Z;
        dVar.sendMessageDelayed(Message.obtain(dVar, 0), m7405J());
    }

    public void m7399U() {
        if (this.f31635a0) {
            boolean z = false;
            if (this.f31634Z.hasMessages(0)) {
                this.f31634Z.removeMessages(0);
                z = true;
            }
            m7401S();
            if (z) {
                m7400T();
            }
        }
    }

    public final void m7398W() {
        this.f31636b0 = null;
        this.f31638d0 = null;
        this.f31637c0 = null;
    }

    @Override
    public void mo6977W3(C10930q6 q6Var, TdApi.Message message, int i) {
        if (this.f31622N == 3) {
            this.f31626R.add(i, message);
            int i2 = this.f31628T;
            if (i <= i2) {
                this.f31628T = i2 + 1;
            }
            AbstractC7230t h2 = C7389v0.m16627h2(q6Var.m2188w6(), message);
            int r = this.f31625Q.mo19777r();
            if (m7392h0()) {
                i = r - i;
            }
            this.f31625Q.mo19393A(i, h2);
        }
    }

    @Override
    public void mo6984X(C10930q6 q6Var, TdApi.Message message) {
        if (m7350j(q6Var, message)) {
            m7380x0();
        }
    }

    public final int m7397Y(boolean z) {
        int i = Build.VERSION.SDK_INT >= 16 ? 3 : 1;
        int y1 = C4868i.m24726c2().m24554y1();
        return (y1 <= 0 || y1 > i) ? i : y1;
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m7396Z(C10930q6 q6Var, TdApi.Message message, C6053a aVar) {
        synchronized (this) {
            if (!C9773p0.m7114D(this.f31637c0, message) || this.f31638d0 == null) {
                this.f31636b0 = q6Var;
                this.f31637c0 = message;
                this.f31638d0 = aVar;
                ArrayList<C9729c> arrayList = this.f31639e0;
                if (arrayList != null) {
                    int i = 0;
                    Iterator<C9729c> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C9729c next = it.next();
                        if (next.f31644a == q6Var && C9773p0.m7114D(next.f31645b, message)) {
                            next.m7372d(aVar);
                            next.f31646c.clear();
                            this.f31639e0.remove(i);
                            break;
                        }
                        i++;
                    }
                }
            }
        }
    }

    @Override
    public void mo7358c(C6613h2 h2Var) {
        Log.m14733d((int) Log.TAG_PLAYER, "[state] onPlaybackParametersChanged", new Object[0]);
    }

    @Override
    public void mo6976d7(C10930q6 q6Var, long j, long j2, long j3, boolean z, boolean z2, List<TdApi.Message> list) {
        if (this.f31622N == 3) {
            m7398W();
        }
    }

    @Override
    public void mo7355e0(C6591e2 e2Var) {
        mo7239n(e2Var);
        if (this.f31622N != 0) {
            this.f31621M.m4636w2().m7113D0();
        }
    }

    @Override
    public void mo7394f(C4812v2 v2Var, int i, float f) {
        TdApi.Message message;
        if (this.f31650b != null && v2Var.m25195k() == this.f31650b && (message = this.f31651c) != null && C4779t2.m25459o1(message) == i) {
            C9773p0 w2 = this.f31621M.m4636w2();
            C10930q6 q6Var = this.f31650b;
            TdApi.Message message2 = this.f31651c;
            w2.m7073X0(q6Var, message2.chatId, message2.f25406id, i, f, -1L, -1L, false);
        }
    }

    public float m7393g0(long j, float f) {
        if (j <= 0) {
            return f;
        }
        double d = j;
        return Math.min(f, (float) ((d - 5.0d) / d));
    }

    public final boolean m7392h0() {
        return (this.f31623O & Log.TAG_ROUND) != 0;
    }

    @Override
    public void mo6975h6() {
    }

    @Override
    public void mo7391i(C4812v2 v2Var, int i, boolean z) {
    }

    @Override
    public void mo7348k(boolean z) {
        Log.m14733d((int) Log.TAG_PLAYER, "[state] onLoadingChanged %b", Boolean.valueOf(z));
    }

    public boolean m7390k0() {
        int i = this.f31628T;
        return i != -1 && i >= 0 && i < this.f31626R.size();
    }

    @Override
    public void mo7239n(C6591e2 e2Var) {
        C1379j0.m37292y0(C7389v0.m16556z1(e2Var) ? R.string.AudioPlaybackUnsupported : R.string.AudioPlaybackError, 0);
    }

    public boolean m7389n0() {
        return m7390k0() && this.f31626R.get(this.f31628T).content.getConstructor() == 527777781;
    }

    @Override
    public void mo6974o0(C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, boolean z, int i2) {
        if (this.f31622N == 3 && this.f31625Q != null && this.f31628T != i) {
            boolean z2 = false;
            Log.m14721i((int) Log.TAG_PLAYER, "trackList position change id:%d, newIndex:%d, totalCount:%d, byUserRequest:%b", Long.valueOf(message.f25406id), Integer.valueOf(i), Integer.valueOf(list.size()), Boolean.valueOf(z));
            this.f31628T = i;
            if (!this.f31632X) {
                AbstractC6689s sVar = this.f31625Q;
                int size = this.f31626R.size();
                if ((this.f31623O & Log.TAG_ROUND) != 0) {
                    z2 = true;
                }
                m7381w0(sVar, i, size, z2);
                this.f31625Q.mo19340v(this.f31627S);
            }
        }
    }

    public boolean m7388p0() {
        return this.f31622N == 3 && this.f31625Q != null;
    }

    @Override
    public void mo7231r(C10930q6 q6Var, TdApi.Message message, boolean z) {
        int i = this.f31622N;
        if (i == 1) {
            C4356b0.m28201k().m28191u();
        } else if (i == 3) {
            ArrayList<TdApi.Message> arrayList = this.f31626R;
            if (arrayList != null) {
                arrayList.clear();
                this.f31628T = -1;
            }
            final AbstractC6689s sVar = this.f31625Q;
            if (sVar != null) {
                if (this.f31627S) {
                    sVar.mo19383I(this);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    Runnable aVar = new Runnable() {
                        @Override
                        public final void run() {
                            C9726c.m7386r0(atomicBoolean, sVar);
                        }
                    };
                    sVar.mo19294P(new C9727a(aVar, sVar));
                    sVar.mo19340v(false);
                    C1379j0.m37332e0(aVar, 1000L);
                } else {
                    sVar.mo19281a();
                }
                this.f31625Q = null;
            }
        }
        m7378z0(0, false);
    }

    @Override
    public void mo7340s(AbstractC6618i2.C6625f fVar, AbstractC6618i2.C6625f fVar2, int i) {
        int i2 = this.f31622N;
        if (i2 == 3) {
            Log.m14733d((int) Log.TAG_PLAYER, "[state] onPositionDiscontinuity mode:%d, reason:%d", Integer.valueOf(i2), Integer.valueOf(i));
            m7402Q();
        }
    }

    public final void m7385s0(C10930q6 q6Var, TdApi.Message message) {
        this.f31632X = true;
        this.f31621M.m4636w2().m7103I0(q6Var, message, true);
        this.f31632X = false;
    }

    @Override
    public void mo7339t(C7233t0 t0Var, C11272n nVar) {
        Log.m14733d((int) Log.TAG_PLAYER, "[state] onTracksChanged", new Object[0]);
        if (this.f31622N == 3 && this.f31628T != -1 && m7395d0(t0Var) != null) {
            m7403P();
        }
    }

    public C6053a m7384t0(C10930q6 q6Var, TdApi.Message message, AbstractC9728b bVar) {
        synchronized (this) {
            if (C9773p0.m7112E(this.f31636b0, q6Var, this.f31637c0, message)) {
                bVar.mo7376a(q6Var, message, this.f31638d0);
                return this.f31638d0;
            }
            ArrayList<C9729c> arrayList = this.f31639e0;
            if (arrayList != null) {
                Iterator<C9729c> it = arrayList.iterator();
                while (it.hasNext()) {
                    C9729c next = it.next();
                    if (next.f31644a == q6Var && C9773p0.m7114D(next.f31645b, message)) {
                        next.f31646c.add(bVar);
                        return null;
                    }
                }
            } else {
                this.f31639e0 = new ArrayList<>();
            }
            this.f31639e0.add(new C9729c(q6Var, message, bVar));
            return null;
        }
    }

    public final int m7383u0(int i, int i2, boolean z) {
        return z ? (i2 - i) - 1 : i;
    }

    public void m7382v0(long j, long j2) {
        AbstractC6689s sVar;
        int i = this.f31622N;
        if (i != 0) {
            if (i != 1) {
                if (i == 3 && (sVar = this.f31625Q) != null) {
                    sVar.mo19779c(j);
                }
            } else if (j2 != -1 && j >= 0 && j2 >= j) {
                C4356b0.m28201k().m28193s(this.f31624P, C5069h.m24089d((float) (j / j2)));
            }
        }
    }

    public final void m7380x0() {
        if (this.f31625Q != null) {
            this.f31621M.m4636w2().m7093N0().m7309i(this.f31625Q, 2);
        }
    }

    @Override
    public boolean mo7220y(TdApi.Message message) {
        int constructor = message.content.getConstructor();
        return constructor == 276722716 || constructor == 527777781;
    }

    public final void m7379y0(boolean z) {
        if (this.f31635a0 != z) {
            this.f31635a0 = z;
            if (z) {
                if (this.f31634Z == null) {
                    this.f31634Z = new HandlerC9730d(this);
                }
                m7400T();
                return;
            }
            HandlerC9730d dVar = this.f31634Z;
            if (dVar != null) {
                dVar.removeMessages(0);
            }
            m7401S();
        } else if (!z) {
            m7401S();
        }
    }

    @Override
    public void mo7218z(boolean z) {
        AbstractC6689s sVar;
        int i = this.f31622N;
        if (i != 1) {
            if (i == 3 && (sVar = this.f31625Q) != null) {
                this.f31627S = z;
                sVar.mo19340v(z);
            }
        } else if (z) {
            C4356b0.m28201k().m28196p(this.f31624P);
        } else {
            C4356b0.m28201k().m28197o(this.f31624P);
        }
    }

    public final void m7378z0(int i, boolean z) {
        if (this.f31622N != i) {
            this.f31622N = i;
            if (i == 3) {
                C1379j0.m37367D0(new Intent(C1379j0.m37315n(), AudioService.class), z, false);
            }
        }
    }
}
