package p292ud;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import gd.C4779t2;
import ge.C4868i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p038ce.View$OnClickListenerC2667lk;
import p108hb.C5062b;
import p108hb.C5063c;
import p108hb.C5070i;
import p154kb.C6227d;
import p154kb.C6233h;
import p193nb.C7321e;
import p292ud.C9736e;
import p350yd.AbstractC11158z0;
import p350yd.C10536ab;
import p350yd.C10930q6;

public class C9773p0 implements AbstractC11158z0, C9736e.AbstractC9738b {
    public String f31930A;
    public final C10536ab f31932C;
    public boolean f31933D;
    public int f31934E;
    public int f31935a;
    public int f31940f;
    public int f31944j;
    public C10930q6 f31945k;
    public TdApi.Message f31946l;
    public int f31947m;
    public float f31948n;
    public int f31953s;
    public long f31954t;
    public long f31955u;
    public long f31956v;
    public long f31957w;
    public String f31958x;
    public TdApi.GetInlineQueryResults f31959y;
    public String f31960z;
    public final C6227d<AbstractC9777d> f31936b = new C6227d<>(false, false, null);
    public final C6227d<AbstractC9778e> f31937c = new C6227d<>(false, false, null);
    public final C6233h<String, AbstractC9779f> f31938d = new C6233h<>(false, false, null);
    public final HandlerC9774a f31939e = new HandlerC9774a(this);
    public final List<TdApi.Message> f31941g = new ArrayList();
    public final List<TdApi.Message> f31942h = new ArrayList();
    public final HashMap<Integer, List<TdApi.File>> f31943i = new HashMap<>();
    public long f31949o = -1;
    public long f31950p = -1;
    public boolean f31951q = false;
    public int f31952r = C4868i.m24726c2().m24561x1();
    public final C9736e f31931B = new C9736e(this, this);

    public static class HandlerC9774a extends Handler {
        public final C9773p0 f31961a;

        public HandlerC9774a(C9773p0 p0Var) {
            super(Looper.getMainLooper());
            this.f31961a = p0Var;
        }

        @Override
        public void handleMessage(Message message) {
            this.f31961a.m7095M0(message);
        }
    }

    public static class C9775b {
        public final List<TdApi.Message> f31962a;
        public final int f31963b;
        public int f31964c;
        public String f31965d;
        public String f31966e;
        public long f31967f;
        public List<TdApi.Message> f31968g;
        public boolean f31969h;
        public long f31970i;
        public long f31971j;
        public long f31972k;
        public boolean f31973l;
        public boolean f31974m;
        public TdApi.GetInlineQueryResults f31975n;
        public String f31976o;

        public C9775b(List<TdApi.Message> list, int i) {
            this.f31962a = list;
            this.f31963b = i;
        }

        public C9775b m6993p(TdApi.GetInlineQueryResults getInlineQueryResults, String str) {
            this.f31975n = getInlineQueryResults;
            this.f31976o = str;
            m6990s(C5070i.m24061i(str), true);
            return this;
        }

        public C9775b m6992q(int i) {
            this.f31964c = i;
            return this;
        }

        public C9775b m6991r(long j, long j2, long j3) {
            this.f31970i = j;
            this.f31971j = j2;
            this.f31972k = j3;
            this.f31969h = true;
            return this;
        }

        public C9775b m6990s(boolean z, boolean z2) {
            this.f31973l = z;
            this.f31974m = z2;
            return this;
        }

        public C9775b m6989t(List<TdApi.Message> list) {
            this.f31968g = list;
            return this;
        }

        public C9775b m6988u(String str) {
            this.f31965d = str;
            return this;
        }
    }

    public interface AbstractC9776c {
        boolean mo6987q7(TdApi.Message message, boolean z, boolean z2, List<TdApi.Message> list, long j);

        C9775b mo6986s5(TdApi.Message message);
    }

    public interface AbstractC9777d {
        void mo6985N2(int i);

        void mo6984X(C10930q6 q6Var, TdApi.Message message);

        void mo6983Y1(C10930q6 q6Var, TdApi.Message message, int i, int i2, float f, boolean z);
    }

    public interface AbstractC9778e {
        void mo6982B3(C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, long j, int i2, int i3);

        void mo6981E4(int i);

        void mo6980G3(C10930q6 q6Var, TdApi.Message message, int i, int i2);

        void mo6979M4(C10930q6 q6Var, TdApi.Message message, int i, boolean z);

        void mo6978R0(C10930q6 q6Var, List<TdApi.Message> list, boolean z);

        void mo6977W3(C10930q6 q6Var, TdApi.Message message, int i);

        void mo6976d7(C10930q6 q6Var, long j, long j2, long j3, boolean z, boolean z2, List<TdApi.Message> list);

        void mo6975h6();

        void mo6974o0(C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, boolean z, int i2);
    }

    public interface AbstractC9779f {
        void mo6973V2(C10930q6 q6Var, long j, long j2, int i, float f, long j3, long j4, boolean z);

        void mo6972z1(C10930q6 q6Var, long j, long j2, int i, int i2);
    }

    public C9773p0(C10536ab abVar) {
        this.f31932C = abVar;
        abVar.m4716b1().m1550e(this);
    }

    public static boolean m7118B(TdApi.File file, TdApi.File file2) {
        int i;
        if (file == null && file2 == null) {
            return true;
        }
        if (file == null || file2 == null || (i = file.f25373id) != file2.f25373id) {
            return false;
        }
        if (i != -1) {
            return true;
        }
        TdApi.RemoteFile remoteFile = file.remote;
        String str = null;
        String str2 = remoteFile != null ? remoteFile.f25417id : null;
        TdApi.RemoteFile remoteFile2 = file2.remote;
        if (remoteFile2 != null) {
            str = remoteFile2.f25417id;
        }
        return C5070i.m24067c(str2, str);
    }

    public static boolean m7116C(TdApi.Message message, long j, long j2, int i) {
        return message != null && message.chatId == j && message.f25406id == j2 && C4779t2.m25459o1(message) == i;
    }

    public static boolean m7114D(TdApi.Message message, TdApi.Message message2) {
        return (message == null && message2 == null) || message == message2 || (message != null && message2 != null && message.chatId == message2.chatId && message.f25406id == message2.f25406id && m7118B(C4779t2.m25494j1(message), C4779t2.m25494j1(message2)));
    }

    public static boolean m7112E(C10930q6 q6Var, C10930q6 q6Var2, TdApi.Message message, TdApi.Message message2) {
        return q6Var == q6Var2 && m7114D(message, message2);
    }

    public static int m7094N(int i) {
        if ((i & 2) != 0) {
            return 2;
        }
        return (i & 4) != 0 ? 4 : 0;
    }

    public static int m7090P(TdApi.Message message, int i) {
        if (message == null || m7049h1(message)) {
            return i;
        }
        return 0;
    }

    public static boolean m7066b0(Object obj) {
        return obj instanceof View$OnClickListenerC2667lk;
    }

    public void m7064c0(long r15, int r17, boolean r18, long r19, long r21, int r23, org.drinkless.p210td.libcore.telegram.TdApi.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: p292ud.C9773p0.m7064c0(long, int, boolean, long, long, int, org.drinkless.td.libcore.telegram.TdApi$Object):void");
    }

    public static String m7059e0(C10930q6 q6Var, long j, long j2) {
        return q6Var.m2188w6() + "_" + j + "_" + j2;
    }

    public static boolean m7056f0(TdApi.MessageContent messageContent, int i) {
        int constructor = messageContent.getConstructor();
        return constructor == i || ((constructor == 527777781 || constructor == 963323014) && (i == 527777781 || i == 963323014));
    }

    public static boolean m7049h1(TdApi.Message message) {
        return message != null && message.content.getConstructor() == 276722716;
    }

    public static p174m3.C6613h2 m7047i0(boolean r2, int r3) {
        throw new UnsupportedOperationException("Method not decompiled: p292ud.C9773p0.m7047i0(boolean, int):m3.h2");
    }

    public static void m7038l0(C6227d<AbstractC9777d> dVar, C10930q6 q6Var, TdApi.Message message, int i, int i2, float f, boolean z) {
        Iterator<AbstractC9777d> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6983Y1(q6Var, message, i, i2, f, z);
        }
    }

    public static void m7035m0(C6227d<AbstractC9778e> dVar, C10930q6 q6Var, List<TdApi.Message> list, long j, long j2, long j3, boolean z, boolean z2) {
        Iterator<AbstractC9778e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6976d7(q6Var, j, j2, j3, z, z2, list);
        }
    }

    public static void m7033n0(C6227d<AbstractC9778e> dVar, int i) {
        Iterator<AbstractC9778e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6981E4(i);
        }
    }

    public static void m7031o0(C6227d<AbstractC9778e> dVar, C10930q6 q6Var, TdApi.Message message, int i) {
        Iterator<AbstractC9778e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6977W3(q6Var, message, i);
        }
    }

    public static void m7029p0(C6227d<AbstractC9778e> dVar, C10930q6 q6Var, TdApi.Message message, int i, int i2) {
        Iterator<AbstractC9778e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6980G3(q6Var, message, i, i2);
        }
    }

    public static void m7027q0(C6227d<AbstractC9778e> dVar, C10930q6 q6Var, List<TdApi.Message> list, boolean z) {
        Iterator<AbstractC9778e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6978R0(q6Var, list, z);
        }
    }

    public static void m7025r0(C6227d<AbstractC9778e> dVar, C10930q6 q6Var, TdApi.Message message, int i, boolean z) {
        Iterator<AbstractC9778e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6979M4(q6Var, message, i, z);
        }
    }

    public static void m7023s0(C6227d<AbstractC9778e> dVar) {
        Iterator<AbstractC9778e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6975h6();
        }
    }

    public static void m7021t0(C6227d<AbstractC9777d> dVar, C10930q6 q6Var, TdApi.Message message) {
        Iterator<AbstractC9777d> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6984X(q6Var, message);
        }
    }

    public static boolean m7020u(TdApi.Message message) {
        return message.content.getConstructor() == 276722716;
    }

    public static void m7019u0(C6227d<AbstractC9778e> dVar, C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, boolean z, int i2) {
        Iterator<AbstractC9778e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6974o0(q6Var, message, i, list, z, i2);
        }
    }

    public static void m7017v0(C6227d<AbstractC9778e> dVar, C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, long j, int i2, int i3) {
        Iterator<AbstractC9778e> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6982B3(q6Var, message, i, list, j, i2, i3);
        }
    }

    public static void m7015w0(C6227d<AbstractC9777d> dVar, int i) {
        Iterator<AbstractC9777d> it = dVar.iterator();
        while (it.hasNext()) {
            it.next().mo6985N2(i);
        }
    }

    public static void m7013x0(C6233h<String, AbstractC9779f> hVar, C10930q6 q6Var, long j, long j2, int i, int i2) {
        m7011y0(hVar, q6Var, j, j2, i, i2, -1.0f, -1L, -1L, false);
    }

    public static void m7011y0(C6233h<String, AbstractC9779f> hVar, C10930q6 q6Var, long j, long j2, int i, int i2, float f, long j3, long j4, boolean z) {
        Iterator<AbstractC9779f> d = hVar.m21019d(m7059e0(q6Var, j, j2));
        if (d != null) {
            while (d.hasNext()) {
                AbstractC9779f next = d.next();
                if (i2 != -1) {
                    next.mo6972z1(q6Var, j, j2, i, i2);
                }
                if (f != -1.0f) {
                    next.mo6973V2(q6Var, j, j2, i, f, j3, j4, z);
                }
            }
        }
    }

    public final void m7120A() {
        this.f31941g.clear();
        m7010z();
    }

    public void m7119A0(int i) {
        synchronized (this) {
            if (this.f31946l != null && this.f31947m == 3) {
                Log.m14721i((int) Log.TAG_PLAYER, "pausing message because of external event, reason:%d", Integer.valueOf(i));
                m7105H0(this.f31945k, this.f31946l, null);
            }
        }
    }

    public void m7117B0(TdApi.Message message) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            TdApi.Message message2 = this.f31946l;
            if (message2 == null) {
                return;
            }
            if (!m7114D(message2, message) || this.f31947m != 3) {
                m7099K0(message, true, true, this.f31945k, null);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public void m7115C0(boolean z, boolean z2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC9774a aVar = this.f31939e;
            aVar.sendMessage(Message.obtain(aVar, 2, z ? 1 : 0, z2 ? 1 : 0));
            return;
        }
        int W = m7076W(m7080U(), z, z2);
        if (W != -1) {
            m7099K0(this.f31941g.get(W), z2, true, this.f31945k, null);
        } else {
            m7099K0(null, z2, true, this.f31945k, null);
        }
    }

    public void m7113D0() {
        m7115C0(true, false);
    }

    public void m7111E0() {
        m7109F0(0);
    }

    public final void m7110F(TdApi.Message message) {
        int i = 0;
        for (TdApi.Message message2 : this.f31942h) {
            if (m7114D(message2, message)) {
                this.f31942h.remove(i);
                return;
            }
            i++;
        }
    }

    public final void m7109F0(int i) {
        int i2;
        boolean z = false;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC9774a aVar = this.f31939e;
            aVar.sendMessage(Message.obtain(aVar, 8, i, 0));
            return;
        }
        synchronized (this) {
            TdApi.Message message = this.f31946l;
            if (!(message == null || (i2 = this.f31947m) == 0)) {
                if (i != 0) {
                    boolean z2 = i == 1;
                    if (i2 == 3) {
                        z = true;
                    }
                    if (z2 == z) {
                    }
                }
                m7099K0(message, true, false, this.f31945k, null);
            }
        }
    }

    public final void m7108G(int i) {
        int U;
        if (this.f31946l == null) {
            return;
        }
        if ((this.f31954t != 0 || this.f31959y != null) && !this.f31941g.isEmpty() && this.f31947m != 0 && (U = m7080U()) != -1) {
            boolean z = true;
            boolean z2 = U + 25 >= this.f31941g.size();
            if (U >= 25) {
                z = false;
            }
            m7097L0(z2, z, i);
        }
    }

    public void m7107G0(boolean z) {
        m7109F0(z ? 1 : 2);
    }

    public long m7106H() {
        long j;
        synchronized (this) {
            TdApi.Message message = this.f31946l;
            j = message != null ? message.chatId : 0L;
        }
        return j;
    }

    public void m7105H0(C10930q6 q6Var, TdApi.Message message, AbstractC9776c cVar) {
        m7099K0(message, true, false, q6Var, cVar);
    }

    public int m7104I() {
        int constructor;
        synchronized (this) {
            TdApi.Message message = this.f31946l;
            constructor = message != null ? message.content.getConstructor() : 0;
        }
        return constructor;
    }

    public void m7103I0(C10930q6 q6Var, TdApi.Message message, boolean z) {
        m7099K0(message, false, z, q6Var, null);
    }

    public TdApi.Message m7102J() {
        synchronized (this) {
            if (this.f31947m == 0) {
                return null;
            }
            return this.f31946l;
        }
    }

    public final void m7101J0(TdApi.Message message, int i, C10930q6 q6Var, AbstractC9776c cVar) {
        m7099K0(message, (i & 1) != 0, (i & 2) != 0, q6Var, cVar);
    }

    public long m7100K(C10930q6 q6Var, TdApi.Message message) {
        long j;
        synchronized (this) {
            TdApi.Message message2 = this.f31946l;
            j = (message2 == null || !m7112E(this.f31945k, q6Var, message2, message)) ? -1L : this.f31950p;
        }
        return j;
    }

    public final void m7099K0(org.drinkless.p210td.libcore.telegram.TdApi.Message r26, boolean r27, boolean r28, p350yd.C10930q6 r29, p292ud.C9773p0.AbstractC9776c r30) {
        throw new UnsupportedOperationException("Method not decompiled: p292ud.C9773p0.m7099K0(org.drinkless.td.libcore.telegram.TdApi$Message, boolean, boolean, yd.q6, ud.p0$c):void");
    }

    public long m7098L() {
        synchronized (this) {
            if (this.f31947m == 0 || this.f31941g.isEmpty()) {
                return 0L;
            }
            return this.f31954t;
        }
    }

    public final void m7097L0(boolean r36, boolean r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: p292ud.C9773p0.m7097L0(boolean, boolean, int):void");
    }

    public long m7096M(C10930q6 q6Var, TdApi.Message message) {
        long j;
        synchronized (this) {
            TdApi.Message message2 = this.f31946l;
            j = (message2 == null || !m7112E(this.f31945k, q6Var, message2, message)) ? -1L : this.f31949o;
        }
        return j;
    }

    public final void m7095M0(Message message) {
        boolean z = false;
        switch (message.what) {
            case 0:
                long f = C5063c.m24140f(message.arg1, message.arg2);
                Object[] objArr = (Object[]) message.obj;
                m7091O0((C10930q6) objArr[0], f, (long[]) objArr[1]);
                objArr[0] = null;
                objArr[1] = null;
                return;
            case 1:
                if (message.arg1 == 1) {
                    z = true;
                }
                m7061d1(z);
                return;
            case 2:
                boolean z2 = message.arg1 == 1;
                if (message.arg2 == 1) {
                    z = true;
                }
                m7115C0(z2, z);
                return;
            case 3:
                Object[] objArr2 = (Object[]) message.obj;
                m7101J0((TdApi.Message) objArr2[0], message.arg1, (C10930q6) objArr2[1], (AbstractC9776c) objArr2[2]);
                objArr2[0] = null;
                objArr2[1] = null;
                objArr2[2] = null;
                return;
            case 4:
                Object[] objArr3 = (Object[]) message.obj;
                m7034n((C10930q6) objArr3[0], (TdApi.Message) objArr3[1]);
                objArr3[0] = null;
                objArr3[1] = null;
                return;
            case 5:
                int i = message.arg1;
                List<TdApi.Message> list = (List) message.obj;
                if (message.arg2 == 1) {
                    z = true;
                }
                m7042k(i, list, z);
                return;
            case 6:
                m7077V0((TdApi.Message) message.obj, C5063c.m24140f(message.arg1, message.arg2));
                return;
            case 7:
                if (message.arg1 == 1) {
                    z = true;
                }
                m7063c1(z);
                return;
            case 8:
                m7109F0(message.arg1);
                return;
            case 9:
                if (message.arg1 == 1) {
                    z = true;
                }
                m7065b1(z);
                return;
            case 10:
                m7067a1(message.arg1);
                return;
            default:
                return;
        }
    }

    public C9736e m7093N0() {
        return this.f31931B;
    }

    public int m7092O(C10930q6 q6Var, TdApi.Message message) {
        int i;
        synchronized (this) {
            TdApi.Message message2 = this.f31946l;
            i = (message2 == null || !m7112E(this.f31945k, q6Var, message2, message)) ? 0 : this.f31947m;
        }
        return i;
    }

    public void m7091O0(C10930q6 q6Var, long j, long[] jArr) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC9774a aVar = this.f31939e;
            aVar.sendMessage(Message.obtain(aVar, 0, C5063c.m24133m(j), C5063c.m24132n(j), new Object[]{q6Var, jArr}));
            return;
        }
        synchronized (this) {
            if (!(this.f31946l == null || this.f31947m == 0)) {
                C10930q6 q6Var2 = this.f31945k;
                if (q6Var2 != null && q6Var2.m2188w6() == q6Var.m2188w6()) {
                    int U = m7080U();
                    if (U != -1) {
                        for (int size = this.f31941g.size() - 1; size >= 0; size--) {
                            TdApi.Message message = this.f31941g.get(size);
                            long j2 = message.chatId;
                            if (!(j2 == 0 || j2 != j || C5062b.m24153s(jArr, message.f25406id) == -1)) {
                                if (size == U) {
                                    int constructor = message.content.getConstructor();
                                    if (constructor == 527777781 || constructor == 963323014) {
                                        m7052g1(false);
                                        break;
                                    }
                                } else {
                                    m7085R0(message, size, false);
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

    public void m7089P0(TdApi.Message message, boolean z) {
        synchronized (this) {
            TdApi.Message message2 = this.f31946l;
            if (message2 != null && this.f31947m != 0 && message2.content.getConstructor() == 276722716 && this.f31941g.size() > 1) {
                m7085R0(message, m7078V(message), z);
            }
        }
    }

    public int m7088Q() {
        int i;
        synchronized (this) {
            i = this.f31947m == 0 ? this.f31952r : this.f31952r | this.f31953s;
        }
        return i;
    }

    public final void m7087Q0(AbstractC9777d dVar) {
        synchronized (this) {
            this.f31936b.add(dVar);
        }
    }

    public final int m7086R() {
        return m7090P(this.f31946l, this.f31952r) | this.f31953s;
    }

    public final void m7085R0(TdApi.Message message, int i, boolean z) {
        if (i == -1) {
            return;
        }
        if (i < 0 || i >= this.f31941g.size()) {
            throw new IllegalStateException();
        } else if (this.f31941g.size() == 1) {
            m7052g1(z);
        } else {
            boolean D = m7114D(message, this.f31946l);
            this.f31941g.remove(i);
            m7025r0(this.f31937c, this.f31945k, message, i, D);
            if (z) {
                this.f31942h.add(message);
                this.f31953s |= Log.TAG_COMPRESS;
            }
        }
    }

    public List<TdApi.Message> m7084S() {
        synchronized (this) {
            if (this.f31947m == 0 || this.f31941g.isEmpty()) {
                return null;
            }
            return this.f31941g;
        }
    }

    public final void m7083S0(AbstractC9778e eVar) {
        synchronized (this) {
            this.f31937c.remove(eVar);
        }
    }

    public boolean m7082T() {
        Iterator<AbstractC9778e> it = this.f31937c.iterator();
        while (it.hasNext()) {
            if (m7066b0(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void m7081T0(C10930q6 q6Var, TdApi.Message message, AbstractC9779f fVar) {
        synchronized (this) {
            this.f31938d.m21016g(m7059e0(q6Var, message.chatId, message.f25406id), fVar);
        }
    }

    public final int m7080U() {
        return m7078V(this.f31946l);
    }

    public void m7079U0() {
        synchronized (this) {
            m7108G((this.f31953s & Log.TAG_ROUND) != 0 ? 2 : 1);
        }
    }

    public final int m7078V(TdApi.Message message) {
        if (message == null) {
            return -1;
        }
        int i = 0;
        for (TdApi.Message message2 : this.f31941g) {
            if (m7114D(message, message2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void m7077V0(TdApi.Message message, long j) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC9774a aVar = this.f31939e;
            aVar.sendMessage(Message.obtain(aVar, 6, C5063c.m24133m(j), C5063c.m24132n(j), message));
            return;
        }
        synchronized (this) {
            TdApi.Message message2 = this.f31946l;
            if (message2 != null && m7114D(message2, message)) {
                this.f31932C.m4729Y().m7382v0(j, this.f31950p);
            }
        }
    }

    public final int m7076W(int i, boolean z, boolean z2) {
        int i2 = -1;
        if (i == -1) {
            return -1;
        }
        if ((this.f31953s & Log.TAG_ROUND) != 0) {
            z = !z;
        }
        int N = m7094N(m7090P(this.f31941g.get(i), this.f31952r));
        if (N == 4 && !z2) {
            return i;
        }
        if (z) {
            int i3 = i + 1;
            if (i3 < this.f31941g.size()) {
                return i3;
            }
            if (N != 0 || z2) {
                i2 = 0;
            }
        } else {
            int i4 = i - 1;
            if (i4 >= 0) {
                return i4;
            }
            if (N != 0 || z2) {
                i2 = this.f31941g.size() - 1;
            }
        }
        return i2;
    }

    public void m7075W0(int i, boolean z) {
        TdApi.Message message;
        synchronized (this) {
            int h = C5063c.m24138h(this.f31934E, i, z);
            int i2 = this.f31934E;
            if (i2 != h) {
                boolean z2 = i2 != 0;
                boolean z3 = h != 0;
                this.f31934E = h;
                if (!(z2 == z3 || (message = this.f31946l) == null)) {
                    if (z3 && this.f31947m == 3) {
                        this.f31933D = true;
                        m7105H0(this.f31945k, message, null);
                    } else if (!z3 && this.f31947m == 2 && this.f31933D) {
                        this.f31933D = false;
                        m7105H0(this.f31945k, message, null);
                    }
                }
            }
        }
    }

    public boolean m7074X(int i) {
        boolean z;
        synchronized (this) {
            TdApi.Message message = this.f31946l;
            z = message != null && C4779t2.m25459o1(message) == i;
        }
        return z;
    }

    public void m7073X0(C10930q6 q6Var, long j, long j2, int i, float f, long j3, long j4, boolean z) {
        TdApi.Message message;
        synchronized (this) {
            if (this.f31945k == q6Var && (message = this.f31946l) != null && message.chatId == j && message.f25406id == j2 && C4779t2.m25459o1(message) == i && !(this.f31948n == f && this.f31949o == j3 && this.f31950p == j4 && this.f31951q == z)) {
                this.f31948n = f;
                this.f31950p = j4;
                this.f31949o = j3;
                this.f31951q = z;
                m7011y0(this.f31938d, q6Var, j, j2, i, -1, f, j3, j4, z);
            }
        }
    }

    public boolean m7072Y(long j, long j2) {
        boolean z;
        synchronized (this) {
            TdApi.Message message = this.f31946l;
            z = message != null && message.chatId == j && message.f25406id == j2;
        }
        return z;
    }

    public final void m7071Y0(int i) {
        this.f31947m = i;
        if (i == 3) {
            this.f31933D = false;
            this.f31934E = 0;
        }
    }

    public boolean m7070Z() {
        boolean z;
        synchronized (this) {
            TdApi.Message message = this.f31946l;
            z = message != null && message.content.getConstructor() == 963323014;
        }
        return z;
    }

    public final void m7069Z0(int i) {
        if (this.f31952r != i) {
            this.f31952r = i;
            C4868i.m24726c2().m24595s5(i);
            synchronized (this) {
                m7033n0(this.f31937c, m7086R());
            }
        }
    }

    @Override
    public void mo1334a(C10930q6 q6Var, TdApi.Message message) {
        long H = m7106H();
        int I = m7104I();
        if (H != 0 && I != 0 && message.chatId == H && message.content.getConstructor() == I && message.sendingState == null) {
            m7034n(q6Var, message);
        }
    }

    public boolean m7068a0() {
        synchronized (this) {
            boolean z = true;
            if (!(this.f31946l == null || this.f31947m == 0)) {
                if ((this.f31953s & Log.TAG_ROUND) != 0) {
                    if ((this.f31940f & 8) == 0) {
                        z = false;
                    }
                    return z;
                }
                if ((this.f31940f & 4) == 0) {
                    z = false;
                }
                return z;
            }
            return true;
        }
    }

    public void m7067a1(int i) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC9774a aVar = this.f31939e;
            aVar.sendMessage(Message.obtain(aVar, 10, i, 0));
        } else if (this.f31935a != i) {
            this.f31935a = i;
            synchronized (this) {
                m7015w0(this.f31936b, i);
            }
        }
    }

    @Override
    public void mo1333b(C10930q6 q6Var, long j, long[] jArr) {
        m7091O0(q6Var, j, jArr);
    }

    public void m7065b1(boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC9774a aVar = this.f31939e;
            aVar.sendMessage(Message.obtain(aVar, 9, z ? 1 : 0, 0));
            return;
        }
        synchronized (this) {
            this.f31932C.m4729Y().m7413A0(z);
        }
    }

    @Override
    public void mo1332c(C10930q6 q6Var, TdApi.Message message, long j, int i, String str) {
        m7053g0(q6Var, message, j);
    }

    public void m7063c1(boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC9774a aVar = this.f31939e;
            aVar.sendMessage(Message.obtain(aVar, 7, z ? 1 : 0, 0));
            return;
        }
        synchronized (this) {
            TdApi.Message message = this.f31946l;
            if (message != null && message.content.getConstructor() == 276722716) {
                this.f31932C.m4729Y().m7411C0(z);
            }
        }
    }

    @Override
    public void mo1331d(C10930q6 q6Var, TdApi.Message message, long j) {
        m7053g0(q6Var, message, j);
        long H = m7106H();
        if (H != 0 && message.chatId == H) {
            m7034n(q6Var, message);
        }
    }

    public final TdApi.GetInlineQueryResults m7062d0() {
        TdApi.GetInlineQueryResults getInlineQueryResults = this.f31959y;
        return new TdApi.GetInlineQueryResults(getInlineQueryResults.botUserId, getInlineQueryResults.chatId, getInlineQueryResults.userLocation, getInlineQueryResults.query, this.f31960z);
    }

    public void m7061d1(boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC9774a aVar = this.f31939e;
            aVar.sendMessage(Message.obtain(aVar, 1, z ? 1 : 0, 0));
            return;
        }
        m7099K0(null, z, false, this.f31945k, null);
    }

    @Override
    public void mo7060e() {
        TdApi.Message message;
        synchronized (this) {
            C10930q6 q6Var = this.f31945k;
            if (!(q6Var == null || (message = this.f31946l) == null)) {
                m7021t0(this.f31936b, q6Var, message);
            }
        }
    }

    public void m7058e1(int i) {
        boolean z;
        synchronized (this) {
            TdApi.Message message = this.f31946l;
            z = message != null && C4779t2.m25459o1(message) == i;
        }
        if (z) {
            m7061d1(true);
        }
    }

    public void m7055f1(TdApi.File[] fileArr) {
        boolean z;
        synchronized (this) {
            TdApi.Message message = this.f31946l;
            z = false;
            if (message != null) {
                int o1 = C4779t2.m25459o1(message);
                int length = fileArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (o1 == fileArr[i].f25373id) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        if (z) {
            m7061d1(true);
        }
    }

    public final void m7053g0(C10930q6 q6Var, TdApi.Message message, long j) {
        TdApi.Message message2;
        synchronized (this) {
            C10930q6 q6Var2 = this.f31945k;
            if (q6Var2 != null && q6Var2.m2188w6() == q6Var.m2188w6() && (message2 = this.f31946l) != null && message2.f25406id == j && message2.chatId == message.chatId) {
                this.f31946l = message;
                m7037l1();
            }
            this.f31938d.m21017f(m7059e0(q6Var, message.chatId, j), m7059e0(q6Var, message.chatId, message.f25406id));
        }
    }

    public final void m7052g1(boolean z) {
        m7099K0(null, z, false, this.f31945k, null);
    }

    public final void m7051h(TdApi.File file) {
        int i;
        if (file != null && (i = file.f25373id) >= 0) {
            List<TdApi.File> list = this.f31943i.get(Integer.valueOf(i));
            if (list == null) {
                list = new ArrayList<>();
                this.f31943i.put(Integer.valueOf(file.f25373id), list);
            }
            list.add(file);
        }
    }

    public void m7050h0(int i, int i2) {
        synchronized (this) {
            TdApi.Message message = this.f31946l;
            if (!(message == null || this.f31947m == 0 || message.content.getConstructor() != 276722716)) {
                TdApi.Message remove = this.f31941g.remove(i);
                this.f31941g.add(i2, remove);
                m7029p0(this.f31937c, this.f31945k, remove, i, i2);
                this.f31953s |= Log.TAG_COMPRESS;
            }
        }
    }

    public final void m7048i(int i, TdApi.Message message) {
        this.f31941g.add(i, message);
        m7051h(C4779t2.m25494j1(message));
    }

    public void m7046i1(int i) {
        m7069Z0(i ^ this.f31952r);
    }

    public final void m7045j(TdApi.Message message) {
        this.f31941g.add(message);
        m7051h(C4779t2.m25494j1(message));
    }

    public final Client.AbstractC7865g m7044j0(final int i, final boolean z, C10930q6 q6Var, final long j, final int i2, final long j2, final long j3) {
        return new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C9773p0.this.m7064c0(j, i2, z, j2, j3, i, object);
            }
        };
    }

    public void m7043j1() {
        int i = this.f31952r;
        int N = m7094N(i);
        int i2 = i & (~N);
        if (N == 2) {
            i2 |= 4;
        } else if (N != 4) {
            i2 |= 2;
        }
        m7069Z0(i2);
    }

    public final void m7042k(int r5, java.util.List<org.drinkless.p210td.libcore.telegram.TdApi.Message> r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: p292ud.C9773p0.m7042k(int, java.util.List, boolean):void");
    }

    public float m7041k0(long j, float f) {
        float g0;
        synchronized (this) {
            g0 = this.f31932C.m4729Y().m7393g0(j, f);
        }
        return g0;
    }

    public void m7040k1() {
        synchronized (this) {
            if (!(this.f31946l == null || this.f31947m == 0)) {
                this.f31953s ^= Log.TAG_ROUND;
                m7033n0(this.f31937c, m7086R());
                m7108G(0);
            }
        }
    }

    public final void m7039l(int i, List<TdApi.Message> list) {
        this.f31941g.addAll(i, list);
        for (TdApi.Message message : list) {
            m7051h(C4779t2.m25494j1(message));
        }
    }

    public final void m7037l1() {
        TdApi.Message message = this.f31946l;
        if (message == null || !(message.content.getConstructor() == 527777781 || this.f31946l.content.getConstructor() == 963323014)) {
            this.f31931B.m7305m(null);
        } else {
            this.f31931B.m7305m(this.f31946l);
        }
    }

    public final void m7036m(List<TdApi.Message> list) {
        this.f31941g.addAll(list);
        for (TdApi.Message message : list) {
            m7051h(C4779t2.m25494j1(message));
        }
    }

    public final void m7034n(C10930q6 q6Var, TdApi.Message message) {
        TdApi.Message message2;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerC9774a aVar = this.f31939e;
            aVar.sendMessage(Message.obtain(aVar, 4, new Object[]{q6Var, message}));
            return;
        }
        synchronized (this) {
            if (this.f31945k == q6Var && (message2 = this.f31946l) != null) {
                long j = message2.chatId;
                long j2 = message.chatId;
                if (j == j2 && j2 != 0 && message2.content.getConstructor() == message.content.getConstructor() && C4779t2.m25727A3(this.f31946l) == C4779t2.m25727A3(message) && (this.f31940f & 4) != 0) {
                    int size = this.f31941g.size();
                    m7045j(message);
                    m7031o0(this.f31937c, q6Var, message, size);
                }
            }
            m7108G(0);
        }
    }

    public void m7032o(TdApi.Message message) {
        synchronized (this) {
            int U = m7080U();
            if (U != -1) {
                int V = m7078V(message);
                int t = m7022t(this.f31945k, message, U, V);
                if (t != 0) {
                    if ((this.f31953s & Log.TAG_ROUND) == 0) {
                        U++;
                    }
                    if (t == 2) {
                        TdApi.Message remove = this.f31941g.remove(V);
                        if (V <= U) {
                            U--;
                        }
                        this.f31941g.add(U, remove);
                        m7029p0(this.f31937c, this.f31945k, message, V, U);
                    } else {
                        m7048i(U, message);
                        m7031o0(this.f31937c, this.f31945k, message, U);
                        if (t == 3) {
                            m7110F(message);
                        }
                    }
                    this.f31953s |= Log.TAG_COMPRESS;
                }
            }
        }
    }

    public final void m7030p(AbstractC9777d dVar) {
        synchronized (this) {
            this.f31936b.add(dVar);
            TdApi.Message message = this.f31946l;
            if (message != null) {
                dVar.mo6983Y1(this.f31945k, message, C4779t2.m25459o1(message), this.f31947m, this.f31948n, false);
            }
        }
    }

    public final void m7028q(AbstractC9778e eVar, boolean z) {
        TdApi.Message message;
        synchronized (this) {
            this.f31937c.add(eVar);
            if (z && this.f31947m != 0 && !this.f31941g.isEmpty() && (message = this.f31946l) != null) {
                eVar.mo6982B3(this.f31945k, message, m7080U(), this.f31941g, this.f31954t, this.f31953s | m7090P(this.f31946l, this.f31952r), this.f31947m);
            }
        }
        if (m7066b0(eVar)) {
            this.f31932C.m4729Y().m7399U();
        }
    }

    public final void m7026r(C10930q6 q6Var, TdApi.Message message, AbstractC9779f fVar) {
        synchronized (this) {
            TdApi.Message message2 = this.f31946l;
            long j = 0;
            long j2 = message2 != null ? message2.chatId : 0L;
            if (message2 != null) {
                j = message2.f25406id;
            }
            boolean z = false;
            int o1 = message2 != null ? C4779t2.m25459o1(message2) : 0;
            if (j2 == message.chatId && j == message.f25406id && C4779t2.m25459o1(message) == o1) {
                z = true;
            }
            this.f31938d.m21021b(m7059e0(q6Var, message.chatId, message.f25406id), fVar);
            if (z) {
                fVar.mo6972z1(q6Var, message.chatId, message.f25406id, o1, this.f31947m);
                float f = this.f31948n;
                if (f != 0.0f) {
                    fVar.mo6973V2(q6Var, message.chatId, message.f25406id, o1, f, this.f31949o, this.f31950p, this.f31951q);
                }
            }
        }
    }

    public int m7024s(C10930q6 q6Var, TdApi.Message message) {
        int t;
        if (message.content.getConstructor() != 276722716) {
            return 0;
        }
        synchronized (this) {
            t = m7022t(q6Var, message, m7080U(), m7078V(message));
        }
        return t;
    }

    public final int m7022t(C10930q6 q6Var, TdApi.Message message, int i, int i2) {
        TdApi.Message message2;
        if (this.f31945k == q6Var && (message2 = this.f31946l) != null && this.f31947m != 0 && message2.content.getConstructor() == message.content.getConstructor()) {
            if (i2 != -1) {
                return (this.f31953s & Log.TAG_ROUND) != 0 ? (i2 == i || i - 1 == i2) ? 0 : 2 : (i2 == i || i + 1 == i2) ? 0 : 2;
            }
            long j = this.f31954t;
            if (j == 0 || message.chatId != j) {
                return 1;
            }
            if (m7018v(message)) {
                return 3;
            }
        }
        return 0;
    }

    public final boolean m7018v(TdApi.Message message) {
        TdApi.Message message2 = this.f31946l;
        if (message2 == null || this.f31947m == 0 || message2.content.getConstructor() != message.content.getConstructor() || this.f31942h.isEmpty()) {
            return false;
        }
        for (TdApi.Message message3 : this.f31942h) {
            if (m7114D(message3, message)) {
                return true;
            }
        }
        return false;
    }

    public boolean m7016w() {
        synchronized (this) {
            boolean z = false;
            if (this.f31946l == null || this.f31947m == 0) {
                return false;
            }
            if (this.f31941g.size() >= 3) {
                return true;
            }
            if ((this.f31953s & Log.TAG_ROUND) != 0) {
                if ((this.f31940f & 4) == 0) {
                    z = true;
                }
                return z;
            }
            if ((this.f31940f & 8) == 0) {
                z = true;
            }
            return z;
        }
    }

    public boolean m7014x(TdApi.Message message) {
        synchronized (this) {
            TdApi.Message message2 = this.f31946l;
            if (message2 == null || !m7114D(message2, message)) {
                return false;
            }
            return this.f31932C.m4729Y().m7388p0();
        }
    }

    public final void m7012y() {
        int i = this.f31944j;
        if (i == Integer.MAX_VALUE) {
            this.f31944j = Integer.MIN_VALUE;
        } else {
            this.f31944j = i + 1;
        }
        this.f31940f = 0;
    }

    public final void m7010z() {
        this.f31943i.clear();
    }

    public void m7009z0(C10930q6 q6Var, TdApi.UpdateFile updateFile) {
        List<TdApi.File> list;
        synchronized (this) {
            C10930q6 q6Var2 = this.f31945k;
            if (!(q6Var2 == null || q6Var2.m2188w6() != q6Var.m2188w6() || (list = this.f31943i.get(Integer.valueOf(updateFile.file.f25373id))) == null)) {
                for (TdApi.File file : list) {
                    int i = file.f25373id;
                    TdApi.File file2 = updateFile.file;
                    if (i == file2.f25373id) {
                        C7321e.m16907u(file2, file);
                    }
                }
            }
        }
    }
}
