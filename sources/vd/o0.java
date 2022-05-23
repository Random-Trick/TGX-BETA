package vd;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import de.lk;
import hd.t2;
import he.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lb.h;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import vd.e;
import zd.o6;
import zd.x0;
import zd.ya;

public class o0 implements x0, e.b {
    public String A;
    public final ya C;
    public boolean D;
    public int E;
    public int f25579a;
    public int f25584f;
    public int f25588j;
    public o6 f25589k;
    public TdApi.Message f25590l;
    public int f25591m;
    public float f25592n;
    public int f25597s;
    public long f25598t;
    public long f25599u;
    public long f25600v;
    public long f25601w;
    public String f25602x;
    public TdApi.GetInlineQueryResults f25603y;
    public String f25604z;
    public final lb.d<d> f25580b = new lb.d<>(false, false, null);
    public final lb.d<e> f25581c = new lb.d<>(false, false, null);
    public final h<String, f> f25582d = new h<>(false, false, null);
    public final a f25583e = new a(this);
    public final List<TdApi.Message> f25585g = new ArrayList();
    public final List<TdApi.Message> f25586h = new ArrayList();
    public final HashMap<Integer, List<TdApi.File>> f25587i = new HashMap<>();
    public long f25593o = -1;
    public long f25594p = -1;
    public boolean f25595q = false;
    public int f25596r = i.c2().x1();
    public final vd.e B = new vd.e(this, this);

    public static class a extends Handler {
        public final o0 f25605a;

        public a(o0 o0Var) {
            super(Looper.getMainLooper());
            this.f25605a = o0Var;
        }

        @Override
        public void handleMessage(Message message) {
            this.f25605a.M0(message);
        }
    }

    public static class b {
        public final List<TdApi.Message> f25606a;
        public final int f25607b;
        public int f25608c;
        public String f25609d;
        public String f25610e;
        public long f25611f;
        public List<TdApi.Message> f25612g;
        public boolean f25613h;
        public long f25614i;
        public long f25615j;
        public long f25616k;
        public boolean f25617l;
        public boolean f25618m;
        public TdApi.GetInlineQueryResults f25619n;
        public String f25620o;

        public b(List<TdApi.Message> list, int i10) {
            this.f25606a = list;
            this.f25607b = i10;
        }

        public b p(TdApi.GetInlineQueryResults getInlineQueryResults, String str) {
            this.f25619n = getInlineQueryResults;
            this.f25620o = str;
            s(ib.i.i(str), true);
            return this;
        }

        public b q(int i10) {
            this.f25608c = i10;
            return this;
        }

        public b r(long j10, long j11, long j12) {
            this.f25614i = j10;
            this.f25615j = j11;
            this.f25616k = j12;
            this.f25613h = true;
            return this;
        }

        public b s(boolean z10, boolean z11) {
            this.f25617l = z10;
            this.f25618m = z11;
            return this;
        }

        public b t(List<TdApi.Message> list) {
            this.f25612g = list;
            return this;
        }

        public b u(String str) {
            this.f25609d = str;
            return this;
        }
    }

    public interface c {
        b m5(TdApi.Message message);

        boolean p7(TdApi.Message message, boolean z10, boolean z11, List<TdApi.Message> list, long j10);
    }

    public interface d {
        void E2(int i10);

        void e5(o6 o6Var, TdApi.Message message, int i10, int i11, float f10, boolean z10);

        void g0(o6 o6Var, TdApi.Message message);
    }

    public interface e {
        void K1(o6 o6Var, TdApi.Message message, int i10, boolean z10);

        void K6(o6 o6Var, TdApi.Message message, int i10);

        void L6(o6 o6Var, TdApi.Message message, int i10, List<TdApi.Message> list, boolean z10, int i11);

        void P1(o6 o6Var, List<TdApi.Message> list, boolean z10);

        void g6();

        void j1(o6 o6Var, TdApi.Message message, int i10, int i11);

        void m7(o6 o6Var, long j10, long j11, long j12, boolean z10, boolean z11, List<TdApi.Message> list);

        void u4(o6 o6Var, TdApi.Message message, int i10, List<TdApi.Message> list, long j10, int i11, int i12);

        void v4(int i10);
    }

    public interface f {
        void i(o6 o6Var, long j10, long j11, int i10, int i11);

        void x6(o6 o6Var, long j10, long j11, int i10, float f10, long j12, long j13, boolean z10);
    }

    public o0(ya yaVar) {
        this.C = yaVar;
        yaVar.b1().e(this);
    }

    public static boolean B(TdApi.File file, TdApi.File file2) {
        int i10;
        if (file == null && file2 == null) {
            return true;
        }
        if (file == null || file2 == null || (i10 = file.f19913id) != file2.f19913id) {
            return false;
        }
        if (i10 != -1) {
            return true;
        }
        TdApi.RemoteFile remoteFile = file.remote;
        String str = null;
        String str2 = remoteFile != null ? remoteFile.f19958id : null;
        TdApi.RemoteFile remoteFile2 = file2.remote;
        if (remoteFile2 != null) {
            str = remoteFile2.f19958id;
        }
        return ib.i.c(str2, str);
    }

    public static boolean C(TdApi.Message message, long j10, long j11, int i10) {
        return message != null && message.chatId == j10 && message.f19946id == j11 && t2.o1(message) == i10;
    }

    public static boolean D(TdApi.Message message, TdApi.Message message2) {
        return (message == null && message2 == null) || message == message2 || (message != null && message2 != null && message.chatId == message2.chatId && message.f19946id == message2.f19946id && B(t2.j1(message), t2.j1(message2)));
    }

    public static boolean E(o6 o6Var, o6 o6Var2, TdApi.Message message, TdApi.Message message2) {
        return o6Var == o6Var2 && D(message, message2);
    }

    public static int N(int i10) {
        if ((i10 & 2) != 0) {
            return 2;
        }
        return (i10 & 4) != 0 ? 4 : 0;
    }

    public static int P(TdApi.Message message, int i10) {
        if (message == null || h1(message)) {
            return i10;
        }
        return 0;
    }

    public static boolean b0(Object obj) {
        return obj instanceof lk;
    }

    public void c0(long r15, int r17, boolean r18, long r19, long r21, int r23, org.drinkless.td.libcore.telegram.TdApi.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: vd.o0.c0(long, int, boolean, long, long, int, org.drinkless.td.libcore.telegram.TdApi$Object):void");
    }

    public static String e0(o6 o6Var, long j10, long j11) {
        return o6Var.A6() + "_" + j10 + "_" + j11;
    }

    public static boolean f0(TdApi.MessageContent messageContent, int i10) {
        int constructor = messageContent.getConstructor();
        return constructor == i10 || ((constructor == 527777781 || constructor == 963323014) && (i10 == 527777781 || i10 == 963323014));
    }

    public static boolean h1(TdApi.Message message) {
        return message != null && message.content.getConstructor() == 276722716;
    }

    public static m3.r2 i0(boolean r2, int r3) {
        throw new UnsupportedOperationException("Method not decompiled: vd.o0.i0(boolean, int):m3.r2");
    }

    public static void l0(lb.d<d> dVar, o6 o6Var, TdApi.Message message, int i10, int i11, float f10, boolean z10) {
        Iterator<d> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().e5(o6Var, message, i10, i11, f10, z10);
        }
    }

    public static void m0(lb.d<e> dVar, o6 o6Var, List<TdApi.Message> list, long j10, long j11, long j12, boolean z10, boolean z11) {
        Iterator<e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().m7(o6Var, j10, j11, j12, z10, z11, list);
        }
    }

    public static void n0(lb.d<e> dVar, int i10) {
        Iterator<e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().v4(i10);
        }
    }

    public static void o0(lb.d<e> dVar, o6 o6Var, TdApi.Message message, int i10) {
        Iterator<e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().K6(o6Var, message, i10);
        }
    }

    public static void p0(lb.d<e> dVar, o6 o6Var, TdApi.Message message, int i10, int i11) {
        Iterator<e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().j1(o6Var, message, i10, i11);
        }
    }

    public static void q0(lb.d<e> dVar, o6 o6Var, List<TdApi.Message> list, boolean z10) {
        Iterator<e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().P1(o6Var, list, z10);
        }
    }

    public static void r0(lb.d<e> dVar, o6 o6Var, TdApi.Message message, int i10, boolean z10) {
        Iterator<e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().K1(o6Var, message, i10, z10);
        }
    }

    public static void s0(lb.d<e> dVar) {
        Iterator<e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().g6();
        }
    }

    public static void t0(lb.d<d> dVar, o6 o6Var, TdApi.Message message) {
        Iterator<d> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().g0(o6Var, message);
        }
    }

    public static boolean u(TdApi.Message message) {
        return message.content.getConstructor() == 276722716;
    }

    public static void u0(lb.d<e> dVar, o6 o6Var, TdApi.Message message, int i10, List<TdApi.Message> list, boolean z10, int i11) {
        Iterator<e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().L6(o6Var, message, i10, list, z10, i11);
        }
    }

    public static void v0(lb.d<e> dVar, o6 o6Var, TdApi.Message message, int i10, List<TdApi.Message> list, long j10, int i11, int i12) {
        Iterator<e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().u4(o6Var, message, i10, list, j10, i11, i12);
        }
    }

    public static void w0(lb.d<d> dVar, int i10) {
        Iterator<d> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().E2(i10);
        }
    }

    public static void x0(h<String, f> hVar, o6 o6Var, long j10, long j11, int i10, int i11) {
        y0(hVar, o6Var, j10, j11, i10, i11, -1.0f, -1L, -1L, false);
    }

    public static void y0(h<String, f> hVar, o6 o6Var, long j10, long j11, int i10, int i11, float f10, long j12, long j13, boolean z10) {
        Iterator<f> d10 = hVar.d(e0(o6Var, j10, j11));
        if (d10 != null) {
            while (d10.hasNext()) {
                f next = d10.next();
                if (i11 != -1) {
                    next.i(o6Var, j10, j11, i10, i11);
                }
                if (f10 != -1.0f) {
                    next.x6(o6Var, j10, j11, i10, f10, j12, j13, z10);
                }
            }
        }
    }

    public final void A() {
        this.f25585g.clear();
        z();
    }

    public void A0(int i10) {
        synchronized (this) {
            if (this.f25590l != null && this.f25591m == 3) {
                Log.i((int) Log.TAG_PLAYER, "pausing message because of external event, reason:%d", Integer.valueOf(i10));
                H0(this.f25589k, this.f25590l, null);
            }
        }
    }

    public void B0(TdApi.Message message) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            TdApi.Message message2 = this.f25590l;
            if (message2 == null) {
                return;
            }
            if (!D(message2, message) || this.f25591m != 3) {
                K0(message, true, true, this.f25589k, null);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public void C0(boolean z10, boolean z11) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = this.f25583e;
            aVar.sendMessage(Message.obtain(aVar, 2, z10 ? 1 : 0, z11 ? 1 : 0));
            return;
        }
        int W = W(U(), z10, z11);
        if (W != -1) {
            K0(this.f25585g.get(W), z11, true, this.f25589k, null);
        } else {
            K0(null, z11, true, this.f25589k, null);
        }
    }

    public void D0() {
        C0(true, false);
    }

    public void E0() {
        F0(0);
    }

    public final void F(TdApi.Message message) {
        int i10 = 0;
        for (TdApi.Message message2 : this.f25586h) {
            if (D(message2, message)) {
                this.f25586h.remove(i10);
                return;
            }
            i10++;
        }
    }

    public final void F0(int i10) {
        int i11;
        boolean z10 = false;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = this.f25583e;
            aVar.sendMessage(Message.obtain(aVar, 8, i10, 0));
            return;
        }
        synchronized (this) {
            TdApi.Message message = this.f25590l;
            if (!(message == null || (i11 = this.f25591m) == 0)) {
                if (i10 != 0) {
                    boolean z11 = i10 == 1;
                    if (i11 == 3) {
                        z10 = true;
                    }
                    if (z11 == z10) {
                    }
                }
                K0(message, true, false, this.f25589k, null);
            }
        }
    }

    public final void G(int i10) {
        int U;
        if (this.f25590l == null) {
            return;
        }
        if ((this.f25598t != 0 || this.f25603y != null) && !this.f25585g.isEmpty() && this.f25591m != 0 && (U = U()) != -1) {
            boolean z10 = true;
            boolean z11 = U + 25 >= this.f25585g.size();
            if (U >= 25) {
                z10 = false;
            }
            L0(z11, z10, i10);
        }
    }

    public void G0(boolean z10) {
        F0(z10 ? 1 : 2);
    }

    public long H() {
        long j10;
        synchronized (this) {
            TdApi.Message message = this.f25590l;
            j10 = message != null ? message.chatId : 0L;
        }
        return j10;
    }

    public void H0(o6 o6Var, TdApi.Message message, c cVar) {
        K0(message, true, false, o6Var, cVar);
    }

    public int I() {
        int constructor;
        synchronized (this) {
            TdApi.Message message = this.f25590l;
            constructor = message != null ? message.content.getConstructor() : 0;
        }
        return constructor;
    }

    public void I0(o6 o6Var, TdApi.Message message, boolean z10) {
        K0(message, false, z10, o6Var, null);
    }

    public TdApi.Message J() {
        synchronized (this) {
            if (this.f25591m == 0) {
                return null;
            }
            return this.f25590l;
        }
    }

    public final void J0(TdApi.Message message, int i10, o6 o6Var, c cVar) {
        K0(message, (i10 & 1) != 0, (i10 & 2) != 0, o6Var, cVar);
    }

    public long K(o6 o6Var, TdApi.Message message) {
        long j10;
        synchronized (this) {
            TdApi.Message message2 = this.f25590l;
            j10 = (message2 == null || !E(this.f25589k, o6Var, message2, message)) ? -1L : this.f25594p;
        }
        return j10;
    }

    public final void K0(org.drinkless.td.libcore.telegram.TdApi.Message r26, boolean r27, boolean r28, zd.o6 r29, vd.o0.c r30) {
        throw new UnsupportedOperationException("Method not decompiled: vd.o0.K0(org.drinkless.td.libcore.telegram.TdApi$Message, boolean, boolean, zd.o6, vd.o0$c):void");
    }

    public long L() {
        synchronized (this) {
            if (this.f25591m == 0 || this.f25585g.isEmpty()) {
                return 0L;
            }
            return this.f25598t;
        }
    }

    public final void L0(boolean r36, boolean r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: vd.o0.L0(boolean, boolean, int):void");
    }

    public long M(o6 o6Var, TdApi.Message message) {
        long j10;
        synchronized (this) {
            TdApi.Message message2 = this.f25590l;
            j10 = (message2 == null || !E(this.f25589k, o6Var, message2, message)) ? -1L : this.f25593o;
        }
        return j10;
    }

    public final void M0(Message message) {
        boolean z10 = false;
        switch (message.what) {
            case 0:
                long f10 = ib.c.f(message.arg1, message.arg2);
                Object[] objArr = (Object[]) message.obj;
                O0((o6) objArr[0], f10, (long[]) objArr[1]);
                objArr[0] = null;
                objArr[1] = null;
                return;
            case 1:
                if (message.arg1 == 1) {
                    z10 = true;
                }
                d1(z10);
                return;
            case 2:
                boolean z11 = message.arg1 == 1;
                if (message.arg2 == 1) {
                    z10 = true;
                }
                C0(z11, z10);
                return;
            case 3:
                Object[] objArr2 = (Object[]) message.obj;
                J0((TdApi.Message) objArr2[0], message.arg1, (o6) objArr2[1], (c) objArr2[2]);
                objArr2[0] = null;
                objArr2[1] = null;
                objArr2[2] = null;
                return;
            case 4:
                Object[] objArr3 = (Object[]) message.obj;
                n((o6) objArr3[0], (TdApi.Message) objArr3[1]);
                objArr3[0] = null;
                objArr3[1] = null;
                return;
            case 5:
                int i10 = message.arg1;
                List<TdApi.Message> list = (List) message.obj;
                if (message.arg2 == 1) {
                    z10 = true;
                }
                k(i10, list, z10);
                return;
            case 6:
                V0((TdApi.Message) message.obj, ib.c.f(message.arg1, message.arg2));
                return;
            case 7:
                if (message.arg1 == 1) {
                    z10 = true;
                }
                c1(z10);
                return;
            case 8:
                F0(message.arg1);
                return;
            case 9:
                if (message.arg1 == 1) {
                    z10 = true;
                }
                b1(z10);
                return;
            case 10:
                a1(message.arg1);
                return;
            default:
                return;
        }
    }

    public vd.e N0() {
        return this.B;
    }

    public int O(o6 o6Var, TdApi.Message message) {
        int i10;
        synchronized (this) {
            TdApi.Message message2 = this.f25590l;
            i10 = (message2 == null || !E(this.f25589k, o6Var, message2, message)) ? 0 : this.f25591m;
        }
        return i10;
    }

    public void O0(o6 o6Var, long j10, long[] jArr) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = this.f25583e;
            aVar.sendMessage(Message.obtain(aVar, 0, ib.c.m(j10), ib.c.n(j10), new Object[]{o6Var, jArr}));
            return;
        }
        synchronized (this) {
            if (!(this.f25590l == null || this.f25591m == 0)) {
                o6 o6Var2 = this.f25589k;
                if (o6Var2 != null && o6Var2.A6() == o6Var.A6()) {
                    int U = U();
                    if (U != -1) {
                        for (int size = this.f25585g.size() - 1; size >= 0; size--) {
                            TdApi.Message message = this.f25585g.get(size);
                            long j11 = message.chatId;
                            if (!(j11 == 0 || j11 != j10 || ib.b.s(jArr, message.f19946id) == -1)) {
                                if (size == U) {
                                    int constructor = message.content.getConstructor();
                                    if (constructor == 527777781 || constructor == 963323014) {
                                        g1(false);
                                        break;
                                    }
                                } else {
                                    R0(message, size, false);
                                    if (size < U) {
                                        U--;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void P0(TdApi.Message message, boolean z10) {
        synchronized (this) {
            TdApi.Message message2 = this.f25590l;
            if (message2 != null && this.f25591m != 0 && message2.content.getConstructor() == 276722716 && this.f25585g.size() > 1) {
                R0(message, V(message), z10);
            }
        }
    }

    public int Q() {
        int i10;
        synchronized (this) {
            i10 = this.f25591m == 0 ? this.f25596r : this.f25596r | this.f25597s;
        }
        return i10;
    }

    public final void Q0(d dVar) {
        synchronized (this) {
            this.f25580b.add(dVar);
        }
    }

    public final int R() {
        return P(this.f25590l, this.f25596r) | this.f25597s;
    }

    public final void R0(TdApi.Message message, int i10, boolean z10) {
        if (i10 == -1) {
            return;
        }
        if (i10 < 0 || i10 >= this.f25585g.size()) {
            throw new IllegalStateException();
        } else if (this.f25585g.size() == 1) {
            g1(z10);
        } else {
            boolean D = D(message, this.f25590l);
            this.f25585g.remove(i10);
            r0(this.f25581c, this.f25589k, message, i10, D);
            if (z10) {
                this.f25586h.add(message);
                this.f25597s |= Log.TAG_COMPRESS;
            }
        }
    }

    public List<TdApi.Message> S() {
        synchronized (this) {
            if (this.f25591m == 0 || this.f25585g.isEmpty()) {
                return null;
            }
            return this.f25585g;
        }
    }

    public final void S0(e eVar) {
        synchronized (this) {
            this.f25581c.remove(eVar);
        }
    }

    public boolean T() {
        Iterator<e> it = this.f25581c.iterator();
        while (it.hasNext()) {
            if (b0(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void T0(o6 o6Var, TdApi.Message message, f fVar) {
        synchronized (this) {
            this.f25582d.g(e0(o6Var, message.chatId, message.f19946id), fVar);
        }
    }

    public final int U() {
        return V(this.f25590l);
    }

    public void U0() {
        synchronized (this) {
            G((this.f25597s & Log.TAG_ROUND) != 0 ? 2 : 1);
        }
    }

    public final int V(TdApi.Message message) {
        if (message == null) {
            return -1;
        }
        int i10 = 0;
        for (TdApi.Message message2 : this.f25585g) {
            if (D(message, message2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void V0(TdApi.Message message, long j10) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = this.f25583e;
            aVar.sendMessage(Message.obtain(aVar, 6, ib.c.m(j10), ib.c.n(j10), message));
            return;
        }
        synchronized (this) {
            TdApi.Message message2 = this.f25590l;
            if (message2 != null && D(message2, message)) {
                this.C.Y().T0(j10, this.f25594p);
            }
        }
    }

    public final int W(int i10, boolean z10, boolean z11) {
        int i11 = -1;
        if (i10 == -1) {
            return -1;
        }
        if ((this.f25597s & Log.TAG_ROUND) != 0) {
            z10 = !z10;
        }
        int N = N(P(this.f25585g.get(i10), this.f25596r));
        if (N == 4 && !z11) {
            return i10;
        }
        if (z10) {
            int i12 = i10 + 1;
            if (i12 < this.f25585g.size()) {
                return i12;
            }
            if (N != 0 || z11) {
                i11 = 0;
            }
        } else {
            int i13 = i10 - 1;
            if (i13 >= 0) {
                return i13;
            }
            if (N != 0 || z11) {
                i11 = this.f25585g.size() - 1;
            }
        }
        return i11;
    }

    public void W0(int i10, boolean z10) {
        TdApi.Message message;
        synchronized (this) {
            int h10 = ib.c.h(this.E, i10, z10);
            int i11 = this.E;
            if (i11 != h10) {
                boolean z11 = i11 != 0;
                boolean z12 = h10 != 0;
                this.E = h10;
                if (!(z11 == z12 || (message = this.f25590l) == null)) {
                    if (z12 && this.f25591m == 3) {
                        this.D = true;
                        H0(this.f25589k, message, null);
                    } else if (!z12 && this.f25591m == 2 && this.D) {
                        this.D = false;
                        H0(this.f25589k, message, null);
                    }
                }
            }
        }
    }

    public boolean X(int i10) {
        boolean z10;
        synchronized (this) {
            TdApi.Message message = this.f25590l;
            z10 = message != null && t2.o1(message) == i10;
        }
        return z10;
    }

    public void X0(o6 o6Var, long j10, long j11, int i10, float f10, long j12, long j13, boolean z10) {
        TdApi.Message message;
        synchronized (this) {
            if (this.f25589k == o6Var && (message = this.f25590l) != null && message.chatId == j10 && message.f19946id == j11 && t2.o1(message) == i10 && !(this.f25592n == f10 && this.f25593o == j12 && this.f25594p == j13 && this.f25595q == z10)) {
                this.f25592n = f10;
                this.f25594p = j13;
                this.f25593o = j12;
                this.f25595q = z10;
                y0(this.f25582d, o6Var, j10, j11, i10, -1, f10, j12, j13, z10);
            }
        }
    }

    public boolean Y(long j10, long j11) {
        boolean z10;
        synchronized (this) {
            TdApi.Message message = this.f25590l;
            z10 = message != null && message.chatId == j10 && message.f19946id == j11;
        }
        return z10;
    }

    public final void Y0(int i10) {
        this.f25591m = i10;
        if (i10 == 3) {
            this.D = false;
            this.E = 0;
        }
    }

    public boolean Z() {
        boolean z10;
        synchronized (this) {
            TdApi.Message message = this.f25590l;
            z10 = message != null && message.content.getConstructor() == 963323014;
        }
        return z10;
    }

    public final void Z0(int i10) {
        if (this.f25596r != i10) {
            this.f25596r = i10;
            i.c2().s5(i10);
            synchronized (this) {
                n0(this.f25581c, R());
            }
        }
    }

    @Override
    public void a(o6 o6Var, TdApi.Message message, long j10) {
        g0(o6Var, message, j10);
        long H = H();
        if (H != 0 && message.chatId == H) {
            n(o6Var, message);
        }
    }

    public boolean a0() {
        synchronized (this) {
            boolean z10 = true;
            if (!(this.f25590l == null || this.f25591m == 0)) {
                if ((this.f25597s & Log.TAG_ROUND) != 0) {
                    if ((this.f25584f & 8) == 0) {
                        z10 = false;
                    }
                    return z10;
                }
                if ((this.f25584f & 4) == 0) {
                    z10 = false;
                }
                return z10;
            }
            return true;
        }
    }

    public void a1(int i10) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = this.f25583e;
            aVar.sendMessage(Message.obtain(aVar, 10, i10, 0));
        } else if (this.f25579a != i10) {
            this.f25579a = i10;
            synchronized (this) {
                w0(this.f25580b, i10);
            }
        }
    }

    @Override
    public void b(o6 o6Var, long j10, long[] jArr) {
        O0(o6Var, j10, jArr);
    }

    public void b1(boolean z10) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = this.f25583e;
            aVar.sendMessage(Message.obtain(aVar, 9, z10 ? 1 : 0, 0));
            return;
        }
        synchronized (this) {
            this.C.Y().Z0(z10);
        }
    }

    @Override
    public void c(o6 o6Var, TdApi.Message message) {
        long H = H();
        int I = I();
        if (H != 0 && I != 0 && message.chatId == H && message.content.getConstructor() == I && message.sendingState == null) {
            n(o6Var, message);
        }
    }

    public void c1(boolean z10) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = this.f25583e;
            aVar.sendMessage(Message.obtain(aVar, 7, z10 ? 1 : 0, 0));
            return;
        }
        synchronized (this) {
            TdApi.Message message = this.f25590l;
            if (message != null && message.content.getConstructor() == 276722716) {
                this.C.Y().b1(z10);
            }
        }
    }

    @Override
    public void d(o6 o6Var, TdApi.Message message, long j10, int i10, String str) {
        g0(o6Var, message, j10);
    }

    public final TdApi.GetInlineQueryResults d0() {
        TdApi.GetInlineQueryResults getInlineQueryResults = this.f25603y;
        return new TdApi.GetInlineQueryResults(getInlineQueryResults.botUserId, getInlineQueryResults.chatId, getInlineQueryResults.userLocation, getInlineQueryResults.query, this.f25604z);
    }

    public void d1(boolean z10) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = this.f25583e;
            aVar.sendMessage(Message.obtain(aVar, 1, z10 ? 1 : 0, 0));
            return;
        }
        K0(null, z10, false, this.f25589k, null);
    }

    @Override
    public void e() {
        TdApi.Message message;
        synchronized (this) {
            o6 o6Var = this.f25589k;
            if (!(o6Var == null || (message = this.f25590l) == null)) {
                t0(this.f25580b, o6Var, message);
            }
        }
    }

    public void e1(int i10) {
        boolean z10;
        synchronized (this) {
            TdApi.Message message = this.f25590l;
            z10 = message != null && t2.o1(message) == i10;
        }
        if (z10) {
            d1(true);
        }
    }

    public void f1(TdApi.File[] fileArr) {
        boolean z10;
        synchronized (this) {
            TdApi.Message message = this.f25590l;
            z10 = false;
            if (message != null) {
                int o12 = t2.o1(message);
                int length = fileArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    } else if (o12 == fileArr[i10].f19913id) {
                        z10 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        if (z10) {
            d1(true);
        }
    }

    public final void g0(o6 o6Var, TdApi.Message message, long j10) {
        TdApi.Message message2;
        synchronized (this) {
            o6 o6Var2 = this.f25589k;
            if (o6Var2 != null && o6Var2.A6() == o6Var.A6() && (message2 = this.f25590l) != null && message2.f19946id == j10 && message2.chatId == message.chatId) {
                this.f25590l = message;
                l1();
            }
            this.f25582d.f(e0(o6Var, message.chatId, j10), e0(o6Var, message.chatId, message.f19946id));
        }
    }

    public final void g1(boolean z10) {
        K0(null, z10, false, this.f25589k, null);
    }

    public final void h(TdApi.File file) {
        int i10;
        if (file != null && (i10 = file.f19913id) >= 0) {
            List<TdApi.File> list = this.f25587i.get(Integer.valueOf(i10));
            if (list == null) {
                list = new ArrayList<>();
                this.f25587i.put(Integer.valueOf(file.f19913id), list);
            }
            list.add(file);
        }
    }

    public void h0(int i10, int i11) {
        synchronized (this) {
            TdApi.Message message = this.f25590l;
            if (!(message == null || this.f25591m == 0 || message.content.getConstructor() != 276722716)) {
                TdApi.Message remove = this.f25585g.remove(i10);
                this.f25585g.add(i11, remove);
                p0(this.f25581c, this.f25589k, remove, i10, i11);
                this.f25597s |= Log.TAG_COMPRESS;
            }
        }
    }

    public final void i(int i10, TdApi.Message message) {
        this.f25585g.add(i10, message);
        h(t2.j1(message));
    }

    public void i1(int i10) {
        Z0(i10 ^ this.f25596r);
    }

    public final void j(TdApi.Message message) {
        this.f25585g.add(message);
        h(t2.j1(message));
    }

    public final Client.g j0(final int i10, final boolean z10, o6 o6Var, final long j10, final int i11, final long j11, final long j12) {
        return new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o0.this.c0(j10, i11, z10, j11, j12, i10, object);
            }
        };
    }

    public void j1() {
        int i10 = this.f25596r;
        int N = N(i10);
        int i11 = i10 & (~N);
        if (N == 2) {
            i11 |= 4;
        } else if (N != 4) {
            i11 |= 2;
        }
        Z0(i11);
    }

    public final void k(int r5, java.util.List<org.drinkless.td.libcore.telegram.TdApi.Message> r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: vd.o0.k(int, java.util.List, boolean):void");
    }

    public float k0(long j10, float f10) {
        float H0;
        synchronized (this) {
            H0 = this.C.Y().H0(j10, f10);
        }
        return H0;
    }

    public void k1() {
        synchronized (this) {
            if (!(this.f25590l == null || this.f25591m == 0)) {
                this.f25597s ^= Log.TAG_ROUND;
                n0(this.f25581c, R());
                G(0);
            }
        }
    }

    public final void l(int i10, List<TdApi.Message> list) {
        this.f25585g.addAll(i10, list);
        for (TdApi.Message message : list) {
            h(t2.j1(message));
        }
    }

    public final void l1() {
        TdApi.Message message = this.f25590l;
        if (message == null || !(message.content.getConstructor() == 527777781 || this.f25590l.content.getConstructor() == 963323014)) {
            this.B.m(null);
        } else {
            this.B.m(this.f25590l);
        }
    }

    public final void m(List<TdApi.Message> list) {
        this.f25585g.addAll(list);
        for (TdApi.Message message : list) {
            h(t2.j1(message));
        }
    }

    public final void n(o6 o6Var, TdApi.Message message) {
        TdApi.Message message2;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a aVar = this.f25583e;
            aVar.sendMessage(Message.obtain(aVar, 4, new Object[]{o6Var, message}));
            return;
        }
        synchronized (this) {
            if (this.f25589k == o6Var && (message2 = this.f25590l) != null) {
                long j10 = message2.chatId;
                long j11 = message.chatId;
                if (j10 == j11 && j11 != 0 && message2.content.getConstructor() == message.content.getConstructor() && t2.A3(this.f25590l) == t2.A3(message) && (this.f25584f & 4) != 0) {
                    int size = this.f25585g.size();
                    j(message);
                    o0(this.f25581c, o6Var, message, size);
                }
            }
            G(0);
        }
    }

    public void o(TdApi.Message message) {
        synchronized (this) {
            int U = U();
            if (U != -1) {
                int V = V(message);
                int t10 = t(this.f25589k, message, U, V);
                if (t10 != 0) {
                    if ((this.f25597s & Log.TAG_ROUND) == 0) {
                        U++;
                    }
                    if (t10 == 2) {
                        TdApi.Message remove = this.f25585g.remove(V);
                        if (V <= U) {
                            U--;
                        }
                        this.f25585g.add(U, remove);
                        p0(this.f25581c, this.f25589k, message, V, U);
                    } else {
                        i(U, message);
                        o0(this.f25581c, this.f25589k, message, U);
                        if (t10 == 3) {
                            F(message);
                        }
                    }
                    this.f25597s |= Log.TAG_COMPRESS;
                }
            }
        }
    }

    public final void p(d dVar) {
        synchronized (this) {
            this.f25580b.add(dVar);
            TdApi.Message message = this.f25590l;
            if (message != null) {
                dVar.e5(this.f25589k, message, t2.o1(message), this.f25591m, this.f25592n, false);
            }
        }
    }

    public final void q(e eVar, boolean z10) {
        TdApi.Message message;
        synchronized (this) {
            this.f25581c.add(eVar);
            if (z10 && this.f25591m != 0 && !this.f25585g.isEmpty() && (message = this.f25590l) != null) {
                eVar.u4(this.f25589k, message, U(), this.f25585g, this.f25598t, this.f25597s | P(this.f25590l, this.f25596r), this.f25591m);
            }
        }
        if (b0(eVar)) {
            this.C.Y().C0();
        }
    }

    public final void r(o6 o6Var, TdApi.Message message, f fVar) {
        synchronized (this) {
            TdApi.Message message2 = this.f25590l;
            long j10 = 0;
            long j11 = message2 != null ? message2.chatId : 0L;
            if (message2 != null) {
                j10 = message2.f19946id;
            }
            boolean z10 = false;
            int o12 = message2 != null ? t2.o1(message2) : 0;
            if (j11 == message.chatId && j10 == message.f19946id && t2.o1(message) == o12) {
                z10 = true;
            }
            this.f25582d.b(e0(o6Var, message.chatId, message.f19946id), fVar);
            if (z10) {
                fVar.i(o6Var, message.chatId, message.f19946id, o12, this.f25591m);
                float f10 = this.f25592n;
                if (f10 != 0.0f) {
                    fVar.x6(o6Var, message.chatId, message.f19946id, o12, f10, this.f25593o, this.f25594p, this.f25595q);
                }
            }
        }
    }

    public int s(o6 o6Var, TdApi.Message message) {
        int t10;
        if (message.content.getConstructor() != 276722716) {
            return 0;
        }
        synchronized (this) {
            t10 = t(o6Var, message, U(), V(message));
        }
        return t10;
    }

    public final int t(o6 o6Var, TdApi.Message message, int i10, int i11) {
        TdApi.Message message2;
        if (this.f25589k == o6Var && (message2 = this.f25590l) != null && this.f25591m != 0 && message2.content.getConstructor() == message.content.getConstructor()) {
            if (i11 != -1) {
                return (this.f25597s & Log.TAG_ROUND) != 0 ? (i11 == i10 || i10 - 1 == i11) ? 0 : 2 : (i11 == i10 || i10 + 1 == i11) ? 0 : 2;
            }
            long j10 = this.f25598t;
            if (j10 == 0 || message.chatId != j10) {
                return 1;
            }
            if (v(message)) {
                return 3;
            }
        }
        return 0;
    }

    public final boolean v(TdApi.Message message) {
        TdApi.Message message2 = this.f25590l;
        if (message2 == null || this.f25591m == 0 || message2.content.getConstructor() != message.content.getConstructor() || this.f25586h.isEmpty()) {
            return false;
        }
        for (TdApi.Message message3 : this.f25586h) {
            if (D(message3, message)) {
                return true;
            }
        }
        return false;
    }

    public boolean w() {
        synchronized (this) {
            boolean z10 = false;
            if (this.f25590l == null || this.f25591m == 0) {
                return false;
            }
            if (this.f25585g.size() >= 3) {
                return true;
            }
            if ((this.f25597s & Log.TAG_ROUND) != 0) {
                if ((this.f25584f & 4) == 0) {
                    z10 = true;
                }
                return z10;
            }
            if ((this.f25584f & 8) == 0) {
                z10 = true;
            }
            return z10;
        }
    }

    public boolean x(TdApi.Message message) {
        synchronized (this) {
            TdApi.Message message2 = this.f25590l;
            if (message2 == null || !D(message2, message)) {
                return false;
            }
            return this.C.Y().M0();
        }
    }

    public final void y() {
        int i10 = this.f25588j;
        if (i10 == Integer.MAX_VALUE) {
            this.f25588j = Integer.MIN_VALUE;
        } else {
            this.f25588j = i10 + 1;
        }
        this.f25584f = 0;
    }

    public final void z() {
        this.f25587i.clear();
    }

    public void z0(o6 o6Var, TdApi.UpdateFile updateFile) {
        List<TdApi.File> list;
        synchronized (this) {
            o6 o6Var2 = this.f25589k;
            if (!(o6Var2 == null || o6Var2.A6() != o6Var.A6() || (list = this.f25587i.get(Integer.valueOf(updateFile.file.f19913id))) == null)) {
                for (TdApi.File file : list) {
                    int i10 = file.f19913id;
                    TdApi.File file2 = updateFile.file;
                    if (i10 == file2.f19913id) {
                        ob.e.v(file2, file);
                    }
                }
            }
        }
    }
}
