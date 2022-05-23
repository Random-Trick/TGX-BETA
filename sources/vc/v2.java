package vc;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.p0;
import de.rh;
import gd.w;
import hd.p1;
import hd.p7;
import hd.s4;
import hd.t2;
import hd.t4;
import hd.y0;
import he.i;
import ie.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kb.j;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.v.MessagesRecyclerView;
import ud.v4;
import vc.c3;
import vc.v2;
import vd.o0;
import zd.b1;
import zd.c1;
import zd.f1;
import zd.g1;
import zd.gc;
import zd.h1;
import zd.hj;
import zd.o6;
import zd.t7;

public class v2 implements Client.g, c3.b, h1, f1, Comparator<s4>, o0.c, a.k, t7.d, gc.a {
    public long[] A0;
    public long B0;
    public LinearLayoutManager M;
    public final RecyclerView.t N;
    public String P;
    public long[] Q;
    public TdApi.ChatEventLogFilters R;
    public k0.e<TdApi.ChatAdministrator> S;
    public boolean T;
    public long U;
    public long V;
    public long W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final rh f25260a;
    public y0 f25261a0;
    public final o6 f25262b;
    public i1 f25264c;
    public boolean f25266d0;
    public boolean f25267e0;
    public k0.e<TdApi.User> f25268f0;
    public List<TdApi.Message> f25269g0;
    public boolean f25270h0;
    public s4 f25271i0;
    public boolean f25272j0;
    public boolean f25273k0;
    public boolean f25274l0;
    public boolean f25275m0;
    public boolean f25276n0;
    public long f25277o0;
    public long f25278p0;
    public k0.e<long[]> f25279q0;
    public int f25280r0;
    public kb.b f25281s0;
    public boolean f25282t0;
    public boolean f25283u0;
    public ob.d f25284v0;
    public int f25285w0;
    public ArrayList<TdApi.Message> f25286x0;
    public k f25287y0;
    public c3 f25288z0;
    public final y0.c f25263b0 = new b();
    public final y0.b f25265c0 = new c();
    public final x1 O = new x1(this);

    public class a extends RecyclerView.t {
        public final rh f25289a;

        public a(rh rhVar) {
            this.f25289a = rhVar;
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            rh rhVar;
            boolean z10 = true;
            if (i10 == 1) {
                this.f25289a.xj(true);
                if (i.c2().G2() && (rhVar = this.f25289a) != null) {
                    rhVar.Gk();
                }
            }
            boolean z11 = i10 != 0;
            if (v2.this.T != z11) {
                v2.this.T = z11;
                if (!z11) {
                    v2.this.z3();
                }
            }
            if (i10 == 0) {
                v2.this.E2();
            }
            MessagesRecyclerView messagesRecyclerView = (MessagesRecyclerView) recyclerView;
            if (i10 == 0) {
                z10 = false;
            }
            messagesRecyclerView.setIsScrolling(z10);
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            v2.this.z3();
            if (i11 == 0) {
                v2.this.E2();
                ((MessagesRecyclerView) recyclerView).N1();
            }
            if (i11 != 0 && !v2.this.Z && v2.this.O.H() != 0) {
                v2.this.Z = true;
                this.f25289a.vc();
                this.f25289a.ro();
            }
        }
    }

    public class b implements y0.c {
        public b() {
        }

        @Override
        public void a(b1<TdApi.Message> b1Var, long j10) {
            if (j10 != 0) {
                v2 v2Var = v2.this;
                v2Var.Z2(!v2Var.f25262b.tc().Q(v2.this.O.H(), j10));
            } else if (!b1Var.x()) {
                v2.this.Z2(false);
            }
        }
    }

    public class c implements y0.b {
        public c() {
        }

        @Override
        public void C3(b1<TdApi.Message> b1Var, TdApi.Message message, int i10, int i11) {
            c1.e(this, b1Var, message, i10, i11);
        }

        @Override
        public void D(b1<TdApi.Message> b1Var, List<TdApi.Message> list, int i10, boolean z10) {
            c1.g(this, b1Var, list, i10, z10);
        }

        @Override
        public void G1(b1<TdApi.Message> b1Var, TdApi.Message message, int i10) {
            c1.f(this, b1Var, message, i10);
        }

        @Override
        public void I2(b1<TdApi.Message> b1Var, int i10) {
            c1.i(this, b1Var, i10);
        }

        @Override
        public void K(b1<TdApi.Message> b1Var, boolean z10) {
            if (!z10 || !v2.this.f25262b.tc().N(v2.this.O.H())) {
                v2.this.Z2(z10);
            }
        }

        @Override
        public void T2(b1<TdApi.Message> b1Var, TdApi.Message message, int i10, int i11) {
            c1.d(this, b1Var, message, i10, i11);
        }

        @Override
        public void V5(b1<TdApi.Message> b1Var) {
            c1.h(this, b1Var);
        }

        @Override
        public void e4(b1<TdApi.Message> b1Var) {
            c1.b(this, b1Var);
        }

        @Override
        public void s3(b1<TdApi.Message> b1Var, TdApi.Message message, int i10) {
            c1.c(this, b1Var, message, i10);
        }
    }

    public class d implements y0.b {
        public d() {
        }

        public void b(b1 b1Var) {
            if (v2.this.f25261a0 == b1Var && v2.this.f25270h0) {
                v2.this.f25270h0 = false;
                v2.this.f25260a.n9();
            }
        }

        @Override
        public void C3(b1<TdApi.Message> b1Var, TdApi.Message message, int i10, int i11) {
            c1.e(this, b1Var, message, i10, i11);
        }

        @Override
        public void D(b1<TdApi.Message> b1Var, List<TdApi.Message> list, int i10, boolean z10) {
            c1.g(this, b1Var, list, i10, z10);
        }

        @Override
        public void G1(b1<TdApi.Message> b1Var, TdApi.Message message, int i10) {
            c1.f(this, b1Var, message, i10);
        }

        @Override
        public void I2(b1<TdApi.Message> b1Var, int i10) {
            c1.i(this, b1Var, i10);
        }

        @Override
        public void K(b1<TdApi.Message> b1Var, boolean z10) {
            c1.a(this, b1Var, z10);
        }

        @Override
        public void T2(b1<TdApi.Message> b1Var, TdApi.Message message, int i10, int i11) {
            c1.d(this, b1Var, message, i10, i11);
        }

        @Override
        public void V5(b1<TdApi.Message> b1Var) {
            c1.h(this, b1Var);
        }

        @Override
        public void e4(final b1<TdApi.Message> b1Var) {
            v2.this.f25262b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    v2.d.this.b(b1Var);
                }
            });
        }

        @Override
        public void s3(b1<TdApi.Message> b1Var, TdApi.Message message, int i10) {
            c1.c(this, b1Var, message, i10);
        }
    }

    public class e extends kb.b {
        public e() {
        }

        public void j() {
            hj hd2 = v2.this.f25262b.hd();
            final v2 v2Var = v2.this;
            hd2.post(new Runnable() {
                @Override
                public final void run() {
                    v2.T(v2.this);
                }
            });
        }

        @Override
        public void b() {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < v2.this.f25279q0.p(); i10++) {
                long j10 = v2.this.f25279q0.j(i10);
                arrayList.add(new TdApi.ViewMessages(j10, j10 == v2.this.f25277o0 ? v2.this.f25278p0 : 0L, (long[]) v2.this.f25279q0.q(i10), false));
            }
            v2.this.f25262b.sb((TdApi.Function[]) arrayList.toArray(new TdApi.Function[0]), v2.this.f25262b.na(), new Runnable() {
                @Override
                public final void run() {
                    v2.e.this.j();
                }
            });
        }
    }

    public class f extends k {
        public final long M;
        public final long N;
        public final boolean[] f25294b;
        public final long f25295c;

        public f(boolean[] zArr, long j10, long j11, long j12) {
            this.f25294b = zArr;
            this.f25295c = j10;
            this.M = j11;
            this.N = j12;
        }

        @Override
        public void c(TdApi.Object object) {
            if (object.getConstructor() == -16498159) {
                TdApi.Messages messages = (TdApi.Messages) object;
                if (messages.totalCount > 0 && messages.messages.length == 0) {
                    boolean[] zArr = this.f25294b;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        v2.this.f25262b.v4().o(new TdApi.SearchChatMessages(this.f25295c, null, null, 0L, 0, 10, new TdApi.SearchMessagesFilterUnreadMention(), this.M), this);
                        return;
                    }
                }
                v2.this.U2(this, messages, this.f25294b[0] ? 0L : this.N);
                return;
            }
            v2.this.U2(this, null, this.N);
        }
    }

    public interface g {
        s4 getMessage();
    }

    public v2(rh rhVar) {
        this.f25260a = rhVar;
        rhVar.t().X(this);
        this.f25262b = rhVar.c();
        this.N = new a(rhVar);
    }

    public void A1(long j10, long j11) {
        if (this.O.H() == j10) {
            r3(j11);
        }
    }

    public void B1(long j10, long j11) {
        int m02;
        if (this.O.H() == j10 && (m02 = this.f25264c.m0(j11)) != -1) {
            s4 g02 = this.f25264c.g0(m02);
            int l92 = g02.l9(j10, j11);
            if (l92 == 1) {
                e1(m02);
            } else if (l92 == 2) {
                E0().I(m02);
            } else if (l92 == 3) {
                w2(g02, m02, j11, g02.Y3(j11));
            }
        }
    }

    public void C1(long j10, long j11, boolean z10) {
        if (this.O.H() == j10) {
            p3(j11, z10);
        }
    }

    public void D1(long j10, long j11) {
        int m02;
        if (this.O.H() == j10 && (m02 = this.f25264c.m0(j11)) != -1 && this.f25264c.i0(m02).c8(j11)) {
            e1(m02);
        }
    }

    public void E1(TdApi.Message message, long j10) {
        if (this.O.H() == message.chatId) {
            s3(message, j10);
        }
    }

    public static int F0(int i10, TdApi.Chat chat, p7 p7Var) {
        if (chat == null) {
            return 0;
        }
        boolean c02 = c0(chat, p7Var);
        i.o I1 = i.c2().I1(i10, chat.f19908id, p7Var != null ? p7Var.g() : 0L);
        if (I1 == null || I1.f13869d) {
            if (c02) {
                return 2;
            }
            if (I1 != null && I1.f13866a.d() != 0) {
                return 3;
            }
        } else if (I1 != null && I1.f13866a.d() != 0) {
            return 3;
        } else {
            if (c02) {
                return 2;
            }
        }
        return 0;
    }

    public void F1(TdApi.Message message, long j10) {
        if (this.O.H() == message.chatId) {
            t3(message, j10);
        }
    }

    public static ob.d G0(int i10, TdApi.Chat chat, p7 p7Var, int i11) {
        if (i11 != 2) {
            if (i11 == 3) {
                i.o I1 = i.c2().I1(i10, chat.f19908id, p7Var != null ? p7Var.g() : 0L);
                if (I1 == null || I1.f13866a.d() == 0) {
                    return null;
                }
                return I1.f13866a;
            } else if (i11 != 4) {
                return null;
            }
        }
        if (p7Var != null) {
            return new ob.d(p7Var.b(), p7Var.f() == 0 ? 9L : p7Var.f());
        } else if (chat.lastReadOutboxMessageId == -1048576 || ob.a.h(chat.f19908id)) {
            return new ob.d(chat.f19908id, chat.lastReadInboxMessageId);
        } else {
            return new ob.d(chat.f19908id, Math.max(chat.lastReadOutboxMessageId, chat.lastReadInboxMessageId));
        }
    }

    public void G1(long j10, long[] jArr) {
        if (this.O.H() == j10) {
            u3(j10, jArr);
        }
    }

    public void H1(TdApi.Object object) {
        if (j0.s() == this.f25260a) {
            j0.z0("open/close chat failed " + object.toString(), 1);
        }
    }

    public void I1(int i10, t4 t4Var) {
        if (i10 != t4Var.G3()) {
            i1 i1Var = this.f25264c;
            i1Var.I(i1Var.j0() - 1);
        }
    }

    public void J1(TdApi.SponsoredMessage sponsoredMessage, s4 s4Var) {
        if (s4Var != null) {
            this.f25260a.U0 = true;
            boolean z10 = this.M.T1() == 0;
            this.f25264c.a0(p1.d(this, this.O.H(), s4Var.f3(), sponsoredMessage), false, false);
            if (z10 && !this.T && !this.f25260a.Li()) {
                this.M.z2(1, a0.i(48.0f));
            }
        }
    }

    public void K1(j jVar) {
        jVar.a(z0());
    }

    public void L1(final TdApi.SponsoredMessage sponsoredMessage) {
        if (sponsoredMessage == null) {
            this.f25260a.U0 = true;
            return;
        }
        final j l2Var = new j() {
            @Override
            public final void a(Object obj) {
                v2.this.J1(sponsoredMessage, (s4) obj);
            }
        };
        s4 z02 = z0();
        if (z02 != null) {
            l2Var.a(z02);
        } else {
            j0.e0(new Runnable() {
                @Override
                public final void run() {
                    v2.this.K1(l2Var);
                }
            }, 1000L);
        }
    }

    public void M1(k kVar, TdApi.Messages messages, long j10) {
        if (kVar == this.f25287y0) {
            this.f25287y0 = null;
            if (messages != null) {
                TdApi.Message[] messageArr = messages.messages;
                if (messageArr.length > 0) {
                    V2(messageArr, j10);
                }
            }
        }
    }

    public void N1(long j10, s4 s4Var) {
        if (this.O.H() == j10) {
            v3(s4Var);
        }
    }

    public static void T(v2 v2Var) {
        v2Var.F2();
    }

    public static boolean c0(TdApi.Chat chat, p7 p7Var) {
        TdApi.Message message;
        if (p7Var != null) {
            return p7Var.k();
        }
        if (chat.unreadCount >= 1) {
            long j10 = chat.lastReadInboxMessageId;
            if (j10 != 0 && j10 != -1048576 && (message = chat.lastMessage) != null && message.f19946id > j10 && !message.isOutgoing) {
                return true;
            }
        }
        return false;
    }

    public static long h3(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(j10);
        if (seconds < 15) {
            return j10 % 3000;
        }
        if (seconds < 60) {
            return j10 % 5000;
        }
        long minutes = timeUnit.toMinutes(j10);
        if (minutes < 30) {
            return j10 % 15000;
        }
        if (minutes < 60) {
            return j10 % 30000;
        }
        return j10 % 60000;
    }

    public void r1(int i10, ArrayList arrayList, TdApi.Message message) {
        if (y0(message, i10)) {
            arrayList.add(message);
        }
    }

    public static void s1(TdApi.Message message, AtomicInteger atomicInteger, ArrayList arrayList, j jVar, TdApi.Message message2) {
        if (message2.f19946id == message.f19946id) {
            atomicInteger.set(arrayList.size());
        }
        jVar.a(message2);
    }

    public void t1(long j10, long j11) {
        int m02;
        if (this.O.H() == j10 && (m02 = this.f25264c.m0(j11)) != -1) {
            H2(m02, this.f25264c.i0(m02), 0, true, false);
        }
    }

    public void u1(boolean z10, ArrayList arrayList, boolean[] zArr, int[] iArr, long j10, TdApi.Message message) {
        if (!t2.C3(message)) {
            qd.b bVar = null;
            if (z10) {
                if (message.content.getConstructor() == 1306939396) {
                    bVar = qd.b.V0(this.f25260a.t(), this.f25262b, message);
                }
            } else if (message.content.getConstructor() == -1851395174 || message.content.getConstructor() == 2021281344) {
                bVar = qd.b.V0(this.f25260a.t(), this.f25262b, message);
            }
            if (bVar != null) {
                arrayList.add(0, bVar);
                if (zArr[0]) {
                    iArr[0] = iArr[0] + 1;
                }
            }
            if (!zArr[0] && message.f19946id == j10) {
                zArr[0] = true;
            }
        }
    }

    public void v1(long r6, org.drinkless.td.libcore.telegram.TdApi.ChatMember r8) {
        throw new UnsupportedOperationException("Method not decompiled: vc.v2.v1(long, org.drinkless.td.libcore.telegram.TdApi$ChatMember):void");
    }

    public void w1(long j10, long j11, TdApi.MessageContent messageContent) {
        if (this.O.H() == j10) {
            m3(j10, j11, messageContent);
        }
    }

    public void x1(long j10, long j11, int i10, TdApi.ReplyMarkup replyMarkup) {
        if (this.O.H() == j10) {
            n3(j11, i10, replyMarkup);
        }
    }

    public void y1(long j10, long j11, TdApi.MessageInteractionInfo messageInteractionInfo) {
        if (this.O.H() == j10) {
            o3(j11, messageInteractionInfo);
        }
    }

    public void z1(long j10, long j11) {
        if (this.O.H() == j10) {
            q3(j11);
        }
    }

    public View A0(long j10, long j11) {
        int m02;
        if (this.O.H() != j10 || (m02 = this.f25264c.m0(j11)) == -1) {
            return null;
        }
        return this.M.C(m02);
    }

    public void A2(ob.d dVar, int i10) {
        o0();
        this.f25284v0 = dVar;
        this.f25285w0 = i10;
        O1(dVar, i10, false);
    }

    public boolean A3(long j10, long j11, jb.f fVar, boolean z10) {
        if (this.f25260a.Ua()) {
            return false;
        }
        boolean S6 = this.f25262b.S6(j10);
        long[] r10 = fVar.r();
        if (!this.f25276n0 || !S6) {
            if (Log.isEnabled(8)) {
                Log.i(8, "Scheduling messages read. isFocused: %b, isOpen: %b, append: %b", Boolean.valueOf(this.f25276n0), Boolean.valueOf(S6), Boolean.valueOf(z10));
            }
            return false;
        }
        if (Log.isEnabled(8)) {
            Log.i(8, "Reading %d messages: %s", Integer.valueOf(r10.length), Arrays.toString(r10));
        }
        if (Log.isEnabled(4)) {
            Log.i(4, "Reading %d messages from MessagesManager: %s", Integer.valueOf(r10.length), Arrays.toString(r10));
        }
        this.f25262b.v4().o(new TdApi.ViewMessages(j10, j11, r10, true), this.O);
        return true;
    }

    public s4 B0() {
        int a22 = this.M.a2();
        if (a22 != -1) {
            return this.f25264c.i0(a22);
        }
        return null;
    }

    public void B2() {
        this.M.z2(0, 0);
        e3();
    }

    public final View C0() {
        int j02 = this.f25264c.j0();
        return j02 == 0 ? this.M.C(0) : this.M.C(j02 - 1);
    }

    public void C2() {
        this.f25262b.tc().i0(this.O.H());
        y0 y0Var = this.f25261a0;
        Z2(y0Var != null && y0Var.x());
    }

    public final int D0() {
        int j02 = this.f25264c.j0();
        return (j02 <= 0 || this.f25271i0 == null || this.f25264c.i0(j02 + (-1)) != this.f25271i0) ? j02 : j02 - 1;
    }

    public final void D2() {
        if (X0()) {
            this.A0 = null;
            E2();
        }
    }

    @Override
    public void D5(long j10, long j11) {
        g1.e(this, j10, j11);
    }

    public i1 E0() {
        return this.f25264c;
    }

    public final void E2() {
        long[] jArr;
        long j10;
        long j11;
        long[] jArr2;
        long j12;
        boolean z10;
        long j13;
        long j14;
        s4 i02;
        long[] jArr3;
        boolean z11;
        boolean z12;
        TdApi.Message message;
        if (!this.f25260a.Ua() && !a1() && !i.c2().V() && this.f25276n0) {
            int X1 = this.M.X1();
            long[] jArr4 = this.A0;
            boolean z13 = false;
            if (X1 == -1 || !j1.T(this.f25264c.F(X1))) {
                jArr2 = jArr4;
                if (q1()) {
                    x1 x1Var = this.O;
                    j12 = x1Var != null ? x1Var.H() : 0L;
                    z10 = false;
                    j11 = 0;
                    j10 = 0;
                    jArr = null;
                } else {
                    return;
                }
            } else {
                s4 i03 = this.f25264c.i0(X1);
                boolean z14 = this.f25264c.f0() != null && this.f25264c.f0().o6() && this.f25264c.j0() > 1;
                p7 J = this.O.J();
                if (i03 == null || i03.I2() == 0) {
                    jArr2 = jArr4;
                    z11 = false;
                    jArr3 = null;
                    j12 = 0;
                } else {
                    j11 = i03.I2();
                    j10 = i03.P1();
                    long[] i42 = i03.i4(j10);
                    j12 = i03.I2();
                    if (J != null) {
                        z12 = j12 == this.O.H() && J.e() == j10;
                        jArr2 = jArr4;
                    } else {
                        TdApi.Chat W2 = this.f25262b.W2(j12);
                        if (W2 == null || (message = W2.lastMessage) == null) {
                            jArr2 = jArr4;
                        } else {
                            jArr2 = jArr4;
                            if (message.f19946id == j10) {
                                z12 = true;
                            }
                        }
                        z12 = false;
                    }
                    View C = this.M.C(X1);
                    int bottom = (C == null || C.getParent() == null) ? false : ((View) C.getParent()).getBottom() - C.getBottom();
                    if (!z12 || bottom) {
                        if (!z14 || !i03.o6()) {
                            z11 = z12;
                            z13 = bottom;
                            jArr3 = i42;
                        } else {
                            j11 = 0;
                            j10 = j11;
                            z11 = true;
                            jArr3 = null;
                        }
                        jArr = jArr3;
                        z10 = z13;
                        z13 = z11;
                    } else {
                        z11 = z12;
                        z13 = bottom;
                        jArr3 = null;
                    }
                }
                j11 = 0;
                j10 = 0;
                jArr = jArr3;
                z10 = z13;
                z13 = z11;
            }
            if (this.O.B() || (i02 = this.f25264c.i0(D0() - 1)) == null || i02.I2() != this.O.H()) {
                j14 = 0;
                j13 = 0;
            } else {
                j13 = i02.D4();
                j14 = 0;
            }
            if (j12 != j14) {
                int A6 = this.f25262b.A6();
                long H = this.O.H();
                long K = this.O.K();
                i c22 = i.c2();
                int i10 = z10 ? 1 : 0;
                int i11 = z10 ? 1 : 0;
                c22.D5(A6, H, K, new i.o(new ob.d(j11, j10, jArr), i10, jArr2, z13, j13));
                y0 y0Var = this.f25261a0;
                if (y0Var != null && H == j11) {
                    y0Var.C0(j10);
                }
            }
        }
    }

    public final void F2() {
        k0.e<long[]> eVar;
        e0();
        if (this.f25277o0 != 0 && (eVar = this.f25279q0) != null && eVar.p() > 0) {
            long h32 = this.f25280r0 != 0 ? h3(this.f25262b.H4() - TimeUnit.SECONDS.toMillis(this.f25280r0)) : 60000L;
            e eVar2 = new e();
            this.f25281s0 = eVar2;
            eVar2.e(this.f25262b.hd());
            this.f25262b.hd().postDelayed(this.f25281s0, h32);
        }
    }

    public final void G2(boolean z10) {
        e3();
        if (!this.f25260a.U0) {
            z2();
        }
        if (this.f25264c.f0() == null || !this.f25264c.f0().o6()) {
            this.M.z2(0, 0);
            return;
        }
        this.f25260a.hq(false, false, false);
        if (this.f25260a.Li()) {
            this.M.x1(1);
        } else {
            this.M.z2(1, a0.i(48.0f));
        }
    }

    @Override
    public void H(final long j10, final long[] jArr) {
        this.f25262b.hd().post(new Runnable() {
            @Override
            public final void run() {
                v2.this.G1(j10, jArr);
            }
        });
    }

    public k0.e<TdApi.ChatAdministrator> H0() {
        return this.S;
    }

    public final void H2(int i10, s4 s4Var, int i11, boolean z10, boolean z11) {
        int i12;
        if (i11 == -1) {
            J2(i10, 0, false);
            return;
        }
        int A6 = this.f25262b.A6();
        if (i11 == 3) {
            i.o I1 = i.c2().I1(A6, this.O.H(), this.O.K());
            if (I1 != null) {
                this.A0 = I1.f13868c;
                i12 = I1.f13867b;
            } else {
                i12 = 0;
            }
            this.A0 = I1 != null ? I1.f13868c : null;
            J2(i10, i12, false);
            m0();
            return;
        }
        int S0 = S0();
        int V0 = V0();
        s4Var.h0(S0);
        int G3 = s4Var.G3();
        if (G3 > V0 + 0) {
            V0 += 0;
        }
        if (i11 == 2 || i11 == 4 || s4Var.v1() + G3 >= V0) {
            J2(i10, V0 - G3, z10);
        } else {
            J2(i10, ((V0 / 2) - (G3 / 2)) + s4Var.v1(), z10);
        }
    }

    public final int I0(int i10, int i11, int i12, int i13) {
        if (!x3()) {
            return ae.j.L(i10);
        }
        float backgroundTransparency = r0().Lr().getBackgroundTransparency();
        if (backgroundTransparency == 1.0f) {
            return ae.j.L(i12);
        }
        int L = ae.j.L(i11);
        float W = ae.j.W(i13);
        if (W > 0.0f) {
            L = ib.d.d(L, r0().Lr().g(L, true), W);
        }
        return backgroundTransparency > 0.0f ? ib.d.d(L, ae.j.L(i12), backgroundTransparency) : L;
    }

    public void I2() {
        ArrayList<TdApi.Message> arrayList = this.f25286x0;
        if (arrayList != null && !arrayList.isEmpty()) {
            TdApi.Message remove = this.f25286x0.remove(0);
            Z0(new ob.d(remove.chatId, remove.f19946id), 1, null, true);
        } else if (this.f25287y0 == null) {
            long j10 = this.W;
            if (j10 == 0) {
                s4 k02 = this.f25264c.k0();
                if (k02 != null) {
                    j10 = k02.P1();
                } else {
                    return;
                }
            }
            long j11 = j10;
            long H = this.O.H();
            long K = this.O.K();
            this.f25287y0 = new f(new boolean[1], H, K, j11);
            this.f25262b.v4().o(new TdApi.SearchChatMessages(H, null, null, j11, -9, 10, new TdApi.SearchMessagesFilterUnreadMention(), K), this.f25287y0);
        }
    }

    public TdApi.ChatEventLogFilters J0() {
        return this.R;
    }

    public final void J2(int i10, int i11, boolean z10) {
        e3();
        if (z10) {
            int b02 = b0(i10, i11);
            if (Math.abs(b02) < this.f25260a.rk().getMeasuredHeight()) {
                this.f25260a.rk().u1(0, b02);
            } else {
                this.M.z2(i10, i11);
            }
        } else {
            this.M.z2(i10, i11);
        }
    }

    @Override
    public void J3(final long j10, final long j11) {
        this.f25262b.hd().post(new Runnable() {
            @Override
            public final void run() {
                v2.this.D1(j10, j11);
            }
        });
    }

    public String K0() {
        return this.P;
    }

    public void K2(boolean z10) {
        if (a1()) {
            e3();
            G2(false);
        } else if (!X0() || z10) {
            if (z10) {
                D2();
            }
            e3();
            if (this.O.A()) {
                P1();
            } else {
                G2(true);
            }
        } else {
            long c10 = this.f25284v0.c();
            long[] jArr = this.A0;
            ob.d dVar = new ob.d(c10, jArr[jArr.length - 1]);
            long[] jArr2 = this.A0;
            Z0(dVar, 1, jArr2.length == 1 ? null : ib.b.y(jArr2, jArr2.length - 1), true);
        }
    }

    public long[] L0() {
        return this.Q;
    }

    public void L2(long j10, p7 p7Var, TdApi.MessageSender messageSender, boolean z10, String str) {
        if (h1()) {
            Y(this.R, str, this.Q);
            return;
        }
        c3 c3Var = this.f25288z0;
        if (p7Var != null) {
            j10 = p7Var.b();
        }
        c3Var.p(j10, p7Var != null ? p7Var.g() : 0L, messageSender, z10, str);
    }

    public int M0() {
        return this.O.I();
    }

    public void M2(TdApi.ChatAdministrators chatAdministrators) {
        TdApi.ChatAdministrator[] chatAdministratorArr;
        k0.e<TdApi.ChatAdministrator> eVar = new k0.e<>(chatAdministrators.administrators.length);
        for (TdApi.ChatAdministrator chatAdministrator : chatAdministrators.administrators) {
            eVar.k(chatAdministrator.userId, chatAdministrator);
        }
        this.S = eVar;
        j3();
    }

    public LinearLayoutManager N0() {
        return this.M;
    }

    public void N2(k0.e<TdApi.User> eVar, boolean z10) {
        this.f25268f0 = eVar;
        this.f25267e0 = z10;
    }

    public int O0() {
        s4 k02;
        if (this.O.B() || (k02 = this.f25264c.k0()) == null) {
            return -1;
        }
        return k02.f3();
    }

    public final void O1(ob.d dVar, int i10, boolean z10) {
        if (z10) {
            this.f25264c.w0(null);
        }
        this.O.g0(dVar, i10, z10);
        z3();
    }

    public void O2(TextView textView, boolean z10) {
        String J3;
        if (this.O.M() == 3 && (J3 = this.f25262b.J3(this.O.H())) != null) {
            textView.setText(J3);
        } else if (!h1()) {
            textView.setText(w.i1(z10 ? R.string.NoMessages : R.string.LoadingMessages));
        } else if (!z10) {
            textView.setText(w.i1(R.string.LoadingActions));
        } else if (ib.i.i(this.P) && this.Q == null && this.R == null) {
            textView.setText(c0.Y(w.i1(f1() ? R.string.EventLogEmptyChannel : R.string.EventLogEmpty)));
        } else if (ib.i.i(this.P)) {
            textView.setText(c0.Y(w.i1(R.string.EventLogEmptySearch)));
        } else {
            textView.setText(w.m1(R.string.EventLogEmptyTextSearch, this.P));
        }
    }

    public final int P0(int i10, int i11, int i12, int i13) {
        if (!x3()) {
            return ae.j.L(i10);
        }
        float backgroundTransparency = r0().Lr().getBackgroundTransparency();
        if (backgroundTransparency == 1.0f) {
            return ae.j.L(i12);
        }
        int L = ae.j.L(i11);
        float W = ae.j.W(i13);
        if (W > 0.0f) {
            L = ib.d.d(L, r0().Lr().g(L, false), W);
        }
        return backgroundTransparency > 0.0f ? ib.d.d(L, ae.j.L(i12), backgroundTransparency) : L;
    }

    public void P1() {
        Q1(new ob.d(this.O.H(), 0L), null);
    }

    public final void P2(boolean z10) {
        if (this.f25276n0 != z10) {
            if (Log.isEnabled(8)) {
                Log.i(8, "MessagesManager isFocused -> %b", Boolean.valueOf(z10));
            }
            this.f25276n0 = z10;
            if (z10) {
                g2();
            } else {
                a2();
            }
        }
    }

    public int Q0() {
        y0 y0Var = this.f25261a0;
        if (y0Var != null) {
            return y0Var.v();
        }
        return -1;
    }

    public final void Q1(ob.d dVar, s4 s4Var) {
        this.f25264c.w0(s4Var);
        this.M.z2(0, 0);
        this.O.h0(dVar);
        z3();
    }

    public final void Q2(boolean z10) {
        if (this.f25282t0 != z10) {
            this.f25282t0 = z10;
            this.f25260a.t().m0();
        }
    }

    public int R0() {
        int W = this.M.W();
        return (W == 0 || !this.f25260a.Ta()) ? this.f25260a.Xn() : W;
    }

    public void R1() {
        T1();
    }

    public void R2(s4 s4Var) {
        this.f25271i0 = s4Var;
        if (this.f25272j0 && c3()) {
            if (s4Var instanceof t4) {
                ((t4) s4Var).da(this.f25264c);
            }
            this.f25264c.a0(this.f25271i0, true, false);
            g0();
        }
    }

    public int S0() {
        int p02 = this.M.p0();
        return (p02 == 0 || !this.f25260a.Ta()) ? this.f25260a.Yn() : p02;
    }

    @Override
    public void S1(final long j10, final long j11, final boolean z10) {
        int c12 = c1(j10, j11);
        if (c12 != -1) {
            this.f25269g0.get(c12).isPinned = z10;
        } else {
            this.f25262b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    v2.this.C1(j10, j11, z10);
                }
            });
        }
    }

    public void S2(boolean z10) {
        if (this.f25283u0 != z10) {
            this.f25283u0 = z10;
            s4 i02 = this.f25264c.i0(D0() - 1);
            if (i02 != null) {
                i02.J9();
                this.f25260a.rk().invalidate();
            }
        }
    }

    @Override
    public void T0(final long j10, final long j11, final TdApi.MessageInteractionInfo messageInteractionInfo) {
        int c12 = c1(j10, j11);
        if (c12 != -1) {
            this.f25269g0.get(c12).interactionInfo = messageInteractionInfo;
        } else {
            this.f25262b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    v2.this.y1(j10, j11, messageInteractionInfo);
                }
            });
        }
    }

    public final void T1() {
        this.O.l0();
    }

    public void T2(ob.d dVar, int i10) {
        this.f25284v0 = dVar;
        this.f25285w0 = i10;
    }

    public float U0() {
        return this.f25260a.xk();
    }

    public long U1() {
        y0 y0Var = this.f25261a0;
        if (y0Var != null) {
            return y0Var.F0();
        }
        return 0L;
    }

    public final void U2(final k kVar, final TdApi.Messages messages, final long j10) {
        this.f25262b.hd().post(new Runnable() {
            @Override
            public final void run() {
                v2.this.M1(kVar, messages, j10);
            }
        });
    }

    public int V0() {
        return R0() - this.f25260a.Ck();
    }

    public void V1(Context context, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
        this.M = linearLayoutManager;
        this.f25264c = new i1(context, this, this.f25260a);
        recyclerView.u();
        recyclerView.k(this.N);
        recyclerView.setAdapter(this.f25264c);
    }

    public final void V2(TdApi.Message[] messageArr, long j10) {
        ArrayList<TdApi.Message> arrayList = new ArrayList<>(messageArr.length);
        Collections.addAll(arrayList, messageArr);
        this.f25286x0 = arrayList;
        if (!arrayList.isEmpty()) {
            I2();
        }
    }

    @Override
    public void W(final long j10, final long j11) {
        int c12 = c1(j10, j11);
        if (c12 != -1) {
            this.f25269g0.get(c12).containsUnreadMention = false;
        } else {
            this.f25262b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    v2.this.z1(j10, j11);
                }
            });
        }
    }

    public int W0() {
        return this.f25260a.Ck() + this.f25260a.Tj();
    }

    public void W1(boolean z10) {
        this.f25288z0.j(z10);
    }

    public void W2(boolean z10) {
        if (this.f25274l0 != z10) {
            this.f25274l0 = z10;
            h0();
        }
    }

    public void X(List<s4> list) {
        if (list != null) {
            for (s4 s4Var : list) {
                if (s4Var != null) {
                    v3(s4Var);
                }
            }
        }
    }

    public boolean X0() {
        long[] jArr;
        return (this.f25284v0 == null || (jArr = this.A0) == null || jArr.length <= 0) ? false : true;
    }

    @Override
    public void X1(final TdApi.Message message, final long j10) {
        int c12 = c1(message.chatId, j10);
        if (c12 != -1) {
            this.f25269g0.set(c12, message);
        } else {
            this.f25262b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    v2.this.F1(message, j10);
                }
            });
        }
    }

    public void X2(boolean z10) {
        if (this.f25275m0 != z10) {
            this.f25275m0 = z10;
            h0();
        }
    }

    public void Y(TdApi.ChatEventLogFilters chatEventLogFilters, String str, long[] jArr) {
        if (!ib.i.c(this.P, str) || !ob.e.D(this.R, chatEventLogFilters) || !ib.b.n(this.Q, jArr)) {
            this.P = str;
            this.R = chatEventLogFilters;
            this.Q = jArr;
            this.f25260a.Si(!ib.i.i(str) || jArr != null || !t2.I2(chatEventLogFilters));
            P1();
        }
    }

    public boolean Y0() {
        return this.f25282t0;
    }

    public boolean Y1() {
        int M = this.O.M();
        return (M == 1 || M == 3) ? false : true;
    }

    public void Y2(boolean z10) {
        if (this.f25273k0 != z10) {
            this.f25273k0 = z10;
            h0();
        }
    }

    public void Z(TdApi.ChatEventLogFilters chatEventLogFilters, long[] jArr) {
        Y(chatEventLogFilters, this.P, jArr);
    }

    public void Z0(ob.d dVar, int i10, long[] jArr, boolean z10) {
        if (!h1()) {
            this.f25284v0 = dVar;
            this.f25285w0 = i10;
            if (!Arrays.equals(this.A0, jArr)) {
                this.A0 = jArr;
                E2();
                m0();
            }
            int n02 = this.f25264c.n0(dVar);
            if (n02 == -1) {
                A2(dVar, i10);
                return;
            }
            if ((i10 == 4 || i10 == 5) && n02 > 0) {
                n02--;
            }
            int i11 = n02;
            s4 i02 = this.f25264c.i0(i11);
            i02.j5(true);
            H2(i11, i02, i10, z10, false);
        }
    }

    public boolean Z1() {
        return this.O.M() == 4;
    }

    public final void Z2(boolean z10) {
        if (this.f25266d0 != z10) {
            this.f25266d0 = z10;
            this.f25260a.Uq(z10, this.f25261a0);
        }
    }

    @Override
    public void a() {
    }

    public final boolean a0() {
        return this.O.M() == 4;
    }

    public final boolean a1() {
        return this.O.M() != 0;
    }

    public final void a2() {
        E2();
    }

    public final void a3(long j10, long j11, k0.e<long[]> eVar, int i10) {
        if (this.f25277o0 != j10 || this.f25278p0 != j11 || this.f25280r0 != i10 || !ib.b.l(this.f25279q0, eVar)) {
            this.f25277o0 = j10;
            this.f25278p0 = j11;
            this.f25279q0 = eVar;
            this.f25280r0 = i10;
            F2();
        }
    }

    @Override
    public void b(long j10, long j11) {
        if (this.O.H() == j10) {
            i0();
        }
    }

    public final int b0(int i10, int i11) {
        long j10;
        int i12;
        int X1 = this.M.X1();
        View C = this.M.C(X1);
        if (C != null) {
            j10 = C.getBottom() - this.M.W();
            i12 = i11;
        } else {
            i12 = i11;
            j10 = 0;
        }
        long j11 = -i12;
        long j12 = -this.M.W();
        int j02 = this.f25264c.j0();
        for (int i13 = 0; i13 < j02; i13++) {
            int G3 = this.f25264c.i0(i13).G3();
            if (i13 < X1) {
                j10 += G3;
            }
            if (i13 < i10) {
                j11 += G3;
            }
            j12 += G3;
        }
        if (j12 > 0) {
            long max = Math.max(0L, Math.min(j12, j11));
            if (max != j10) {
                return (int) (j10 - max);
            }
        }
        return 0;
    }

    public int b1() {
        if (this.f25264c.j0() <= 0) {
            return -1;
        }
        for (int i10 = 0; i10 < this.f25264c.j0(); i10++) {
            if (this.f25264c.i0(i10).h5()) {
                return i10;
            }
        }
        return -1;
    }

    public void b2() {
        z2();
    }

    public void b3(List<TdApi.Message> list) {
        this.f25269g0 = list;
    }

    @Override
    public void b6(long j10, long j11, TdApi.Sticker sticker) {
        g1.a(this, j10, j11, sticker);
    }

    @Override
    public void c() {
    }

    public final int c1(long j10, long j11) {
        List<TdApi.Message> list = this.f25269g0;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int i10 = 0;
        for (TdApi.Message message : this.f25269g0) {
            if (message.chatId == j10 && message.f19946id == j11) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void c2() {
        e2();
        d2();
    }

    public final boolean c3() {
        s4 k02 = this.f25264c.k0();
        return k02 == null || k02 != this.f25271i0;
    }

    @Override
    public void d() {
    }

    public boolean d0() {
        y0 y0Var = this.f25261a0;
        return y0Var != null && y0Var.x() && !this.f25266d0;
    }

    public final void d1(long j10, int i10, int i11) {
        y0 y0Var = new y0(this.f25262b, i10, i11, this.f25265c0, j10, 0L, null, null, new TdApi.SearchMessagesFilterPinned(), 0L);
        this.f25261a0 = y0Var;
        y0Var.z0(this.f25263b0);
        this.f25261a0.r(new d());
        this.f25262b.tc().f(this);
    }

    public void d2() {
        m0();
    }

    public final void d3(final long j10, final s4 s4Var) {
        s4Var.t8();
        this.f25262b.hd().post(new Runnable() {
            @Override
            public final void run() {
                v2.this.N1(j10, s4Var);
            }
        });
    }

    @Override
    public void e(org.thunderdog.challegram.a aVar, boolean z10) {
        h0();
    }

    public final void e0() {
        kb.b bVar = this.f25281s0;
        if (bVar != null) {
            bVar.c();
            this.f25281s0 = null;
        }
    }

    public void e1(int i10) {
        LinearLayoutManager linearLayoutManager = this.M;
        if (linearLayoutManager != null) {
            View C = linearLayoutManager.C(i10);
            if (C == null) {
                this.f25264c.I(i10);
            } else if (C instanceof h1) {
                p0.y((h1) C);
            } else {
                C.invalidate();
            }
        }
    }

    public final void e2() {
        this.f25260a.n9();
    }

    public final void e3() {
        MessagesRecyclerView rk = this.f25260a.rk();
        if (rk != null) {
            rk.C1();
        }
    }

    @Override
    public void f(long j10) {
        if (this.O.H() == j10) {
            i0();
        }
    }

    public boolean f0(final long j10, final long j11, boolean z10, boolean z11) {
        int m02;
        if (this.O.H() != j10 || (m02 = this.f25264c.m0(j11)) == -1) {
            return false;
        }
        if (z10) {
            this.f25262b.hd().postDelayed(new Runnable() {
                @Override
                public final void run() {
                    v2.this.t1(j10, j11);
                }
            }, fd.a.f11892n ? 120L : 40L);
            return true;
        }
        H2(m02, this.f25264c.i0(m02), 0, true, false);
        return true;
    }

    public boolean f1() {
        return this.O.Q();
    }

    public void f2() {
        this.f25288z0.k();
        if (h1()) {
            Y(this.R, "", this.Q);
        }
    }

    public final void f3() {
        long H = this.O.H();
        long j10 = this.B0;
        if (j10 != H) {
            if (j10 != 0) {
                this.f25260a.pr(j10);
                this.f25262b.O9().t0(this.B0, this);
                this.f25262b.O9().s0(this.B0, this);
                this.f25262b.e2().J1(this.B0, this);
            }
            this.B0 = H;
            if (H != 0) {
                this.f25260a.ir(H);
                this.f25262b.O9().g0(H, this);
                this.f25262b.O9().f0(H, this);
                this.f25262b.e2().G(this.B0, this);
            }
        }
    }

    @Override
    public void g(int i10, int i11, ob.d dVar) {
        if (i10 == -3) {
            this.f25260a.mo(w.E1(0, 0), 0, 0);
        } else if (i10 == -2) {
            this.f25260a.no();
        } else if (i10 != -1) {
            this.f25260a.mo(w.E1(i10 + 1, i11), i10, i11);
            Z0(dVar, 1, null, true);
        } else {
            this.f25260a.mo("", -1, -1);
        }
    }

    public void g0() {
        if (D0() == 0 && !this.O.B() && !this.O.A() && !this.O.T()) {
            this.f25260a.Eq();
        }
    }

    public boolean g1() {
        return this.f25267e0;
    }

    public final void g2() {
        z3();
        E2();
    }

    @Override
    public void g3(final long j10, final long j11) {
        this.f25262b.id(new Runnable() {
            @Override
            public final void run() {
                v2.this.B1(j10, j11);
            }
        });
    }

    @Override
    public void g5(final TdApi.Message message, final long j10, int i10, String str) {
        int c12 = c1(message.chatId, j10);
        if (c12 != -1) {
            this.f25269g0.set(c12, message);
        } else {
            this.f25262b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    v2.this.E1(message, j10);
                }
            });
        }
    }

    public final void h0() {
        boolean z12 = this.f25260a.t().z1();
        boolean z10 = true;
        if (Log.isEnabled(8)) {
            Log.i(8, "MessagesManager checkFocus parentFocused:%b, parentPaused:%b, isFocused:%b, passcodeShowing:%b", Boolean.valueOf(this.f25274l0), Boolean.valueOf(this.f25273k0), Boolean.valueOf(this.f25276n0), Boolean.valueOf(z12));
        }
        if (!this.f25274l0 || this.f25273k0 || z12) {
            z10 = false;
        }
        P2(z10);
    }

    public boolean h1() {
        return this.O.M() == 1;
    }

    public void h2() {
        this.O.v0();
        d2();
    }

    public final void i0() {
        y0 y0Var = this.f25261a0;
        Z2(y0Var != null && y0Var.x() && !this.f25262b.tc().Q(this.O.H(), this.f25261a0.F0()));
    }

    public boolean i1() {
        return this.f25276n0;
    }

    public void i2() {
        e2();
    }

    public final void i3() {
        long j10 = this.B0;
        if (j10 != 0) {
            this.f25260a.pr(j10);
            this.f25262b.O9().t0(this.B0, this);
            this.B0 = 0L;
        }
    }

    @Override
    public void j0(final long j10, final long j11, final TdApi.MessageContent messageContent) {
        int c12 = c1(j10, j11);
        if (c12 != -1) {
            this.f25269g0.get(c12).content = messageContent;
        } else {
            this.f25262b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    v2.this.w1(j10, j11, messageContent);
                }
            });
        }
    }

    public boolean j1() {
        return this.f25283u0;
    }

    public void j2() {
        if (this.f25288z0 == null) {
            this.f25288z0 = new c3(this.f25262b, this);
        }
        this.f25288z0.l();
    }

    public final void j3() {
        TdApi.ChatAdministrator chatAdministrator;
        long j10 = 0;
        TdApi.ChatAdministrator chatAdministrator2 = null;
        for (int i10 = 0; i10 < this.f25264c.j0(); i10++) {
            s4 i02 = this.f25264c.i0(i10);
            if (i02 != null) {
                long T0 = ob.e.T0(i02.X3());
                if (j10 != T0) {
                    k0.e<TdApi.ChatAdministrator> eVar = this.S;
                    if (eVar != null) {
                        chatAdministrator = eVar.f(T0);
                    } else {
                        T0 = j10;
                        chatAdministrator = null;
                    }
                    chatAdministrator2 = chatAdministrator;
                    j10 = T0;
                }
                i02.T8(chatAdministrator2);
            }
        }
    }

    public final void k0(s4 s4Var, int i10, long j10) {
    }

    @Override
    public void k1(long j10, long j11, TdApi.UnreadReaction[] unreadReactionArr, int i10) {
        g1.l(this, j10, j11, unreadReactionArr, i10);
    }

    public void k2() {
        if (this.f25271i0 == null || !c3()) {
            this.f25272j0 = true;
        } else {
            s4 s4Var = this.f25271i0;
            if (s4Var instanceof t4) {
                ((t4) s4Var).da(this.f25264c);
            }
            this.f25264c.a0(this.f25271i0, true, false);
        }
        g0();
        e2();
        w0();
        E2();
    }

    public void k3(List<TdApi.Message> list, o6.f fVar) {
        TdApi.Message message = list.get(0);
        if (this.O.H() == message.chatId) {
            TdApi.Message message2 = list.get(list.size() - 1);
            int m02 = this.f25264c.m0(message.f19946id);
            if (m02 != -1) {
                s4 i02 = this.f25264c.i0(m02);
                int i10 = 0;
                int i11 = 0;
                for (TdApi.Message message3 : fVar.f28132a) {
                    long j10 = message3.f19946id;
                    if (j10 > message.f19946id) {
                        i10++;
                    } else if (j10 < message2.f19946id) {
                        i11++;
                    }
                }
                for (int i12 = i10 - 1; i12 >= 0; i12--) {
                    i02.G0(fVar.f28132a.get(i12), true);
                }
                for (int size = fVar.f28132a.size() - i11; size < fVar.f28132a.size(); size++) {
                    i02.G0(fVar.f28132a.get(size), false);
                }
                i02.a();
            }
        }
    }

    public final void l0(int i10, int i11) {
        if (!r0().Xk()) {
            boolean z10 = true;
            boolean z11 = (D0() > 0) && i10 != -1 && i11 != -1 && this.f25264c.j0() >= i11;
            if (z11) {
                z11 = i10 >= 2;
                if (!z11) {
                    int R0 = R0();
                    int i12 = R0 / 2;
                    long j10 = 0;
                    for (int i13 = 0; i13 < i10; i13++) {
                        s4 i02 = this.f25264c.i0(i13);
                        if (i02 != null) {
                            j10 += i02.G3();
                            if (j10 >= i12) {
                                break;
                            }
                        }
                    }
                    View C = this.M.C(i10);
                    if (C != null) {
                        j10 += C.getBottom() - R0;
                    }
                    if (j10 < i12) {
                        z10 = false;
                    }
                    z11 = z10;
                }
            }
            this.Y = z11;
            m0();
        }
    }

    public final boolean l1(long j10, long j11, s4 s4Var) {
        return this.f25260a.fl(j10, j11, s4Var);
    }

    public void l2() {
        z3();
        E2();
    }

    public void l3(long j10) {
        int j02 = this.f25264c.j0() - 1;
        s4 s4Var = null;
        while (j02 >= 0) {
            s4 i02 = this.f25264c.i0(j02);
            if (i02.f6() && i02.N9(j10, s4Var)) {
                e1(j02);
            }
            j02--;
            s4Var = i02;
        }
    }

    @Override
    public void l5(final long j10, final long j11, final int i10, final TdApi.ReplyMarkup replyMarkup) {
        int c12 = c1(j10, j11);
        if (c12 != -1) {
            TdApi.Message message = this.f25269g0.get(c12);
            message.editDate = i10;
            message.replyMarkup = replyMarkup;
            return;
        }
        this.f25262b.hd().post(new Runnable() {
            @Override
            public final void run() {
                v2.this.x1(j10, j11, i10, replyMarkup);
            }
        });
    }

    public void m0() {
        this.f25260a.gq(D0() > 0 && (this.Y || this.O.A() || X0()), n1());
    }

    public boolean m1() {
        return !this.f25264c.p0();
    }

    public void m2(TdApi.Chat chat, p7 p7Var, TdApi.SearchMessagesFilter searchMessagesFilter, rh rhVar, boolean z10, boolean z11) {
        int i10 = 0;
        if (chat.f19908id != 0) {
            if (Log.isEnabled(8)) {
                Log.i(8, "[CREATE] chatId:%d", Long.valueOf(chat.f19908id));
            }
            this.f25262b.Da(chat.f19908id, rhVar);
        }
        long j10 = chat.f19908id;
        if (j10 == 0 || p7Var != null || z10 || !z11) {
            this.f25261a0 = null;
        } else {
            d1(j10, 10, 50);
        }
        if (z10 || !this.f25262b.I3(chat)) {
            x1 x1Var = this.O;
            if (z10) {
                i10 = 4;
            }
            x1Var.w0(chat, p7Var, i10, searchMessagesFilter);
            o0();
            this.f25264c.y0(chat.type);
            ob.d dVar = this.f25284v0;
            if (dVar != null) {
                O1(dVar, this.f25285w0, true);
            } else {
                P1();
            }
        } else {
            this.O.w0(chat, p7Var, 3, null);
            o0();
            this.f25264c.y0(chat.type);
            P1();
        }
        f3();
    }

    public final void m3(long j10, long j11, TdApi.MessageContent messageContent) {
        ArrayList<s4> h02;
        this.f25260a.uo(j10, j11, messageContent);
        if (!this.f25264c.p0() && (h02 = this.f25264c.h0()) != null && !h02.isEmpty()) {
            int i10 = 0;
            Iterator<s4> it = h02.iterator();
            while (it.hasNext()) {
                s4 next = it.next();
                TdApi.Message X3 = next.X3();
                if (next.S5(j11)) {
                    x2(next, i10, j11, messageContent);
                } else if (X3.replyToMessageId == j11) {
                    next.F8(j11, messageContent);
                }
                i10++;
            }
        }
    }

    @Override
    public o0.b m5(final TdApi.Message message) {
        int m02;
        if (this.O.H() != message.chatId || (m02 = this.f25264c.m0(message.f19946id)) == -1) {
            return null;
        }
        s4 i02 = this.f25264c.i0(m02);
        final int constructor = message.content.getConstructor();
        final ArrayList arrayList = new ArrayList();
        int j02 = this.f25264c.j0();
        final j<TdApi.Message> k2Var = new j() {
            @Override
            public final void a(Object obj) {
                v2.this.r1(constructor, arrayList, (TdApi.Message) obj);
            }
        };
        for (int i10 = j02 - 1; i10 > m02; i10--) {
            s4 i03 = this.f25264c.i0(i10);
            if (i03 != null) {
                i03.t6(k2Var, false);
            }
        }
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        i02.t6(new j() {
            @Override
            public final void a(Object obj) {
                v2.s1(TdApi.Message.this, atomicInteger, arrayList, k2Var, (TdApi.Message) obj);
            }
        }, false);
        if (atomicInteger.get() != -1) {
            for (int i11 = m02 - 1; i11 >= 0; i11--) {
                s4 i04 = this.f25264c.i0(i11);
                if (i04 != null) {
                    i04.t6(k2Var, false);
                }
            }
            if (arrayList.size() == 1) {
                return null;
            }
            return new o0.b(arrayList, atomicInteger.get());
        }
        throw new IllegalStateException();
    }

    public void n0() {
        this.f25264c.c0(false);
        k2();
    }

    public final boolean n1() {
        if (!X0()) {
            return false;
        }
        long[] jArr = this.A0;
        long j10 = jArr[jArr.length - 1];
        int m02 = this.f25264c.m0(j10);
        if (m02 == -1) {
            s4 B0 = B0();
            return B0 != null && B0.D4() > j10;
        }
        s4 i02 = this.f25264c.i0(m02);
        int S0 = S0();
        int V0 = V0();
        i02.h0(S0);
        return b0(m02, ((V0 / 2) - (i02.G3() / 2)) + i02.v1()) < 0;
    }

    public void n2(TdApi.Chat chat) {
        this.O.w0(chat, null, 1, null);
        this.f25264c.y0(chat.type);
        P1();
    }

    public final void n3(long j10, int i10, TdApi.ReplyMarkup replyMarkup) {
        int m02 = this.f25264c.m0(j10);
        if (m02 != -1) {
            int i92 = this.f25264c.g0(m02).i9(j10, i10, replyMarkup);
            if (i92 == 1) {
                e1(m02);
            } else if (i92 == 2) {
                E0().I(m02);
            }
        }
    }

    public void o0() {
        s4 s4Var = this.f25271i0;
        if (s4Var != null) {
            s4Var.J7();
        }
        this.f25271i0 = null;
        this.f25272j0 = false;
    }

    public boolean o1() {
        return this.O.M() == 2;
    }

    public void o2(TdApi.Chat chat, String str, TdApi.MessageSender messageSender, TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.O.w0(chat, null, 2, searchMessagesFilter);
        this.O.y0(str, messageSender, searchMessagesFilter);
        this.f25264c.y0(chat.type);
        if (searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 371805512) {
            d1(chat.f19908id, 1, 1);
        }
        ob.d dVar = this.f25284v0;
        if (dVar != null) {
            O1(dVar, this.f25285w0, true);
        } else {
            P1();
        }
        f3();
    }

    public void o3(long j10, TdApi.MessageInteractionInfo messageInteractionInfo) {
        int m02 = this.f25264c.m0(j10);
        if (m02 != -1 && this.f25264c.g0(m02).j9(j10, messageInteractionInfo)) {
            e1(m02);
        }
    }

    public qd.c p0(final long j10, TdApi.SearchMessagesFilter searchMessagesFilter) {
        ArrayList<s4> h02 = this.f25264c.h0();
        if (h02 == null) {
            return null;
        }
        final ArrayList<qd.b> arrayList = new ArrayList<>();
        final boolean z10 = searchMessagesFilter != null && searchMessagesFilter.getConstructor() == -155713339;
        final boolean[] zArr = new boolean[1];
        final int[] iArr = new int[1];
        j<TdApi.Message> m2Var = new j() {
            @Override
            public final void a(Object obj) {
                v2.this.u1(z10, arrayList, zArr, iArr, j10, (TdApi.Message) obj);
            }
        };
        Iterator<s4> it = h02.iterator();
        while (it.hasNext()) {
            it.next().t6(m2Var, true);
        }
        if (!zArr[0]) {
            return null;
        }
        qd.c cVar = new qd.c(this.f25260a.t(), this.f25262b);
        cVar.t(iArr[0], arrayList);
        return cVar;
    }

    public boolean p1() {
        return this.O.U();
    }

    public List<s4> p2(List<TdApi.Message> list) {
        ArrayList arrayList = new ArrayList(list.size());
        TdApi.Chat P3 = this.f25262b.P3(list.get(0).chatId);
        k0.e<TdApi.ChatAdministrator> eVar = this.S;
        s4 s4Var = null;
        for (TdApi.Message message : list) {
            if (s4Var != null) {
                if (!s4Var.G0(message, true)) {
                    s4Var.t8();
                    arrayList.add(s4Var);
                }
            }
            s4Var = s4.X9(this, message, P3, eVar);
        }
        if (s4Var != null) {
            s4Var.t8();
            arrayList.add(s4Var);
        }
        return arrayList;
    }

    public void p3(long j10, boolean z10) {
        int m02 = this.f25264c.m0(j10);
        if (m02 != -1 && this.f25264c.g0(m02).d9(j10, z10)) {
            e1(m02);
        }
    }

    @Override
    public boolean p7(TdApi.Message message, boolean z10, boolean z11, List<TdApi.Message> list, long j10) {
        return j10 != 0 && j10 == message.chatId && !z10;
    }

    public int compare(s4 s4Var, s4 s4Var2) {
        return Long.compare(s4Var2.K3(), s4Var.K3());
    }

    public boolean q1() {
        return !this.O.A() && !this.O.B() && !this.O.T() && this.f25264c.j0() == 0;
    }

    public void q2(boolean z10, boolean z11) {
        s4 k02;
        if (this.f25264c.j0() != 0 && (k02 = this.f25264c.k0()) != null && (k02 instanceof t4)) {
            final t4 t4Var = (t4) k02;
            View C0 = C0();
            if (C0 == null) {
                i1 i1Var = this.f25264c;
                i1Var.I(i1Var.j0() - 1);
                return;
            }
            final int ca2 = t4Var.ca();
            C0.post(new Runnable() {
                @Override
                public final void run() {
                    v2.this.I1(ca2, t4Var);
                }
            });
        }
    }

    public void q3(long j10) {
        ArrayList<TdApi.Message> arrayList = this.f25286x0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            Iterator<TdApi.Message> it = this.f25286x0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f19946id == j10) {
                    this.f25286x0.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
        int m02 = this.f25264c.m0(j10);
        if (m02 != -1) {
            this.f25264c.g0(m02).x8(j10);
        }
    }

    public rh r0() {
        return this.f25260a;
    }

    @Override
    public void r2(final TdApi.Object object) {
        if (object.getConstructor() != -722616727) {
            this.f25262b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    v2.this.H1(object);
                }
            });
        }
    }

    public final void r3(long j10) {
        int m02 = this.f25264c.m0(j10);
        if (m02 != -1) {
            this.f25264c.g0(m02).k9(j10);
            e1(m02);
        }
    }

    public TdApi.User s0(long j10) {
        k0.e<TdApi.User> eVar = this.f25268f0;
        if (eVar != null) {
            return eVar.f(j10);
        }
        return null;
    }

    @Override
    public void s2(final long j10, final TdApi.ChatMember chatMember) {
        this.f25262b.hd().post(new Runnable() {
            @Override
            public final void run() {
                v2.this.v1(j10, chatMember);
            }
        });
    }

    public final void s3(TdApi.Message message, long j10) {
        w3(j10, message.f19946id);
        int m02 = this.f25264c.m0(j10);
        if (m02 != -1 && this.f25264c.g0(m02).r9(message, j10)) {
            e1(m02);
        }
    }

    @Override
    public void s5(final long j10, final long j11) {
        int c12 = c1(j10, j11);
        if (c12 != -1) {
            t2.i5(this.f25269g0.get(c12));
        } else {
            this.f25262b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    v2.this.A1(j10, j11);
                }
            });
        }
    }

    public void t0(v4<?> v4Var) {
        B2();
        e0();
        this.A0 = null;
        this.f25285w0 = 0;
        this.f25262b.tc().d0(this);
        this.f25284v0 = null;
        this.Z = false;
        this.W = 0L;
        this.S = null;
        y0 y0Var = this.f25261a0;
        if (y0Var != null) {
            y0Var.Q2();
            this.f25261a0 = null;
        }
        this.f25266d0 = false;
        this.f25282t0 = false;
        i3();
        this.f25287y0 = null;
        this.f25286x0 = null;
        long H = this.O.H();
        if (H != 0) {
            if (Log.isEnabled(8)) {
                Log.i(8, "[DESTROY] chatId:%d", Long.valueOf(H));
            }
            this.f25262b.A4(H, v4Var, true);
        }
        this.O.u0();
        this.f25264c.c0(true);
        o0();
        this.U = 0L;
        this.V = 0L;
        this.f25270h0 = false;
    }

    public void t2() {
        s4 f02;
        if (this.f25264c.j0() != 0 && (f02 = this.f25264c.f0()) != null) {
            f02.C8();
            this.f25264c.I(0);
        }
    }

    public final void t3(TdApi.Message message, long j10) {
        w3(j10, message.f19946id);
        int m02 = this.f25264c.m0(j10);
        if (m02 != -1) {
            s4 g02 = this.f25264c.g0(m02);
            int s92 = g02.s9(message, j10);
            if (s92 == 1) {
                e1(m02);
            } else if (s92 == 2) {
                E0().I(m02);
            } else if (s92 == 3) {
                w2(g02, m02, message.f19946id, message);
            }
            k0(g02, m02, message.f19946id);
            z3();
        }
    }

    public void u0() {
        if (!this.f25262b.k7(this.O.H())) {
            long U1 = U1();
            if (U1 != 0) {
                this.f25262b.tc().n(this.O.H(), U1);
                Z2(false);
            }
        }
    }

    public void u2() {
        ArrayList<s4> h02 = this.f25264c.h0();
        if (h02 != null) {
            Iterator<s4> it = h02.iterator();
            while (it.hasNext()) {
                s4 next = it.next();
                int G3 = next.G3();
                next.C8();
                if (G3 == next.G3() || x3()) {
                    next.u5();
                } else {
                    next.K8();
                }
            }
        }
    }

    public void u3(long j10, long[] jArr) {
        this.f25260a.Vo(jArr);
        this.f25260a.H(j10, jArr);
        int yk = this.f25260a.yk();
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (i10 < this.f25264c.j0()) {
            s4 i02 = this.f25264c.i0(i10);
            int length = jArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i10++;
                    break;
                }
                long j11 = jArr[i12];
                int D8 = i02.D8(j11);
                if (D8 != 0) {
                    if (D8 == 1) {
                        if (this.f25260a.or(j11, this.f25264c.u0(i10))) {
                            yk--;
                            z10 = true;
                        }
                        i11++;
                        if (i11 == jArr.length) {
                            break;
                        }
                    } else if (D8 == 2) {
                        if (this.f25260a.or(j11, i02)) {
                            yk--;
                            z10 = true;
                        }
                        i11++;
                        if (i11 == jArr.length) {
                            break;
                        }
                    }
                } else if (i02.X3().replyToMessageId == j11) {
                    i02.E8(j11);
                }
                i12++;
            }
        }
        if (z10) {
            if (yk == 0) {
                this.f25260a.Y8();
            } else {
                this.f25260a.Kd(yk);
            }
        }
        if (i11 > 0) {
            int j02 = this.f25264c.j0();
            if (j02 == 0) {
                if (this.O.B() || this.O.A()) {
                    this.f25260a.To();
                } else {
                    n0();
                }
            } else if (j02 == 1 && (this.f25264c.i0(0) instanceof t4)) {
                q2(false, false);
                this.f25260a.Eq();
            }
        }
    }

    public void v0(ArrayList<s4> arrayList, int i10, int i11, s4 s4Var, ob.d dVar, int i12, boolean z10) {
        if (arrayList.size() != 0 || i10 == 0 || i10 == 3) {
            k0.e<TdApi.ChatAdministrator> eVar = this.S;
            if (eVar != null) {
                long j10 = 0;
                TdApi.ChatAdministrator chatAdministrator = null;
                Iterator<s4> it = arrayList.iterator();
                while (it.hasNext()) {
                    s4 next = it.next();
                    if (next.F1() == null) {
                        long i13 = next.z4().i();
                        if (j10 != i13) {
                            chatAdministrator = eVar.f(i13);
                            j10 = i13;
                        }
                        next.T8(chatAdministrator);
                    }
                }
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f25264c.b0(arrayList, true);
                    e2();
                    return;
                } else if (i10 == 2) {
                    int X1 = this.M.X1();
                    View C = this.M.C(X1);
                    int W = C == null ? 0 : this.M.W() - C.getBottom();
                    this.f25264c.b0(arrayList, false);
                    this.M.z2(X1 + arrayList.size(), W);
                    return;
                } else if (i10 != 3) {
                    return;
                }
            }
            if (i10 == 3) {
                this.f25264c.x0(arrayList);
            } else {
                this.f25264c.b0(arrayList, true);
            }
            if (s4Var != null) {
                H2(i11, s4Var, i12 == 0 ? -1 : i12, false, false);
            } else if (dVar != null && dVar.g() && !arrayList.isEmpty()) {
                this.M.z2(arrayList.size() - 1, -arrayList.get(arrayList.size() - 1).G3());
            } else if (i11 == 0) {
                this.M.z2(0, 0);
            } else {
                this.M.x1(i11);
            }
            if (!z10) {
                e2();
            }
            z3();
        } else if (!z10) {
            e2();
        }
    }

    public void v2() {
        this.f25260a.t().z2(this);
    }

    public final void v3(s4 s4Var) {
        int M = this.O.M();
        if (M != 2 && M != 3) {
            long K = this.O.K();
            if (K == 0 || s4Var.d4() == K) {
                if (!s4Var.f6()) {
                    this.f25260a.fj(s4Var.X3());
                }
                if (!this.O.A()) {
                    boolean z10 = this.M.X1() == 0;
                    s4 f02 = this.f25264c.f0();
                    if (f02 == null || !f02.G0(s4Var.X3(), true)) {
                        boolean z11 = (s4Var.n6() || (z10 && (!s4Var.e6() || s4Var.N5()))) && !s4Var.o6();
                        if (z11) {
                            if (!this.f25264c.a0(s4Var, false, z11)) {
                                G2(false);
                            }
                            if (s4Var.n6()) {
                                D2();
                            }
                        } else if (z10) {
                            View C = this.M.C(0);
                            int bottom = (C == null || C.getParent() == null) ? 0 : ((View) C.getParent()).getBottom() - C.getBottom();
                            boolean z12 = this.M.T1() == 0;
                            if (this.f25264c.a0(s4Var, false, z11)) {
                                return;
                            }
                            if (!s4Var.o6() || !z12) {
                                this.M.z2(0, bottom);
                            } else if (this.f25260a.Li()) {
                                this.M.x1(1);
                            } else {
                                this.M.z2(1, a0.i(48.0f));
                            }
                        } else {
                            this.f25264c.a0(s4Var, false, z11);
                        }
                    } else {
                        if (!z10) {
                            f02.T6();
                        }
                        f02.z5(s4Var.K3(), -1);
                        s4Var.J7();
                    }
                } else if (s4Var.n6()) {
                    P1();
                }
            }
        }
    }

    public void w0() {
        int j02 = this.f25264c.j0();
        if (j02 <= 0) {
            return;
        }
        if (this.O.B() || this.O.A()) {
            long j10 = 0;
            for (int i10 = 0; i10 < j02; i10++) {
                j10 += this.f25264c.i0(i10).G3();
            }
            if (j10 < R0()) {
                this.O.k0();
            }
        }
    }

    public final void w2(s4 s4Var, int i10, long j10, TdApi.Message message) {
        int D8 = s4Var.D8(j10);
        if (D8 == 1) {
            this.f25264c.v0(i10, s4.X9(this, message, s4Var.C2(), this.S));
        } else if (D8 == 2) {
            Log.w("Warning: message combination breaking is not supported", new Object[0]);
        }
    }

    public final void w3(long j10, long j11) {
        int s10;
        if (X0() && (s10 = ib.b.s(this.A0, j10)) >= 0) {
            long[] jArr = this.A0;
            jArr[s10] = j11;
            Arrays.sort(jArr);
            E2();
        }
    }

    public long[] x0(ob.d dVar) {
        return (!X0() || !this.f25284v0.b(dVar)) ? new long[]{dVar.d()} : ib.b.b(this.A0, dVar.d());
    }

    public final void x2(s4 s4Var, int i10, long j10, TdApi.MessageContent messageContent) {
        int h92 = s4Var.h9(j10, messageContent);
        if (h92 == 1) {
            e1(i10);
        } else if (h92 == 2) {
            E0().I(i10);
        } else if (h92 == 3) {
            TdApi.Message Y3 = s4Var.Y3(j10);
            Y3.content = messageContent;
            w2(s4Var, i10, j10, Y3);
        }
    }

    public boolean x3() {
        gc tc2 = r0().c().tc();
        if (!this.O.Q() ? !tc2.x0() : tc2.r()) {
            if (!this.f25260a.Wk()) {
                return false;
            }
        }
        return true;
    }

    public final boolean y0(TdApi.Message message, int i10) {
        return !this.f25262b.aa(message) && i10 == message.content.getConstructor();
    }

    @Override
    public void y2(TdApi.Message message) {
        if ((message.schedulingState != null) == a0()) {
            if (c1(message.chatId, message.f19946id) == -1) {
                TdApi.Chat P3 = this.f25262b.P3(message.chatId);
                d3(P3.f19908id, s4.X9(this, message, P3, this.S));
            }
        } else if (i1() && message.schedulingState != null) {
            this.f25260a.Kr(true);
        }
    }

    public final void y3(int i10, int i11) {
        k0.e<long[]> eVar;
        long j10;
        boolean z10;
        int i12 = i10;
        int i13 = i11;
        if (!(i12 == -1 || i13 == -1 || a1() || !this.f25276n0)) {
            s4 i02 = this.f25264c.i0(i12);
            s4 i03 = this.f25264c.i0(i13);
            if (!(i02 == null || i03 == null)) {
                long D4 = i02.D4();
                long P1 = i03.P1();
                int i14 = i13 - i12;
                int i15 = i14 + 1;
                if (!(this.U == D4 && this.V == P1 && this.X == i15)) {
                    boolean z11 = false;
                    boolean z12 = false;
                    jb.f fVar = null;
                    int i16 = 0;
                    k0.e eVar2 = null;
                    boolean z13 = true;
                    while (i12 <= i13) {
                        View C = this.M.C(i12);
                        boolean z14 = C instanceof g;
                        if (!z14) {
                            z13 = false;
                        }
                        s4 message = z14 ? ((g) C).getMessage() : null;
                        if (message != null) {
                            if (!message.p0() && !message.o6()) {
                                z11 = true;
                            }
                            if (message == this.f25271i0) {
                                z12 = true;
                            }
                            i16 = Math.max(message.f3(), i16);
                            if (message.U6()) {
                                z10 = z11;
                                long P12 = message.P1();
                                if (message.P0()) {
                                    j10 = P1;
                                    if (P12 > this.W) {
                                        this.W = P12;
                                    }
                                } else {
                                    j10 = P1;
                                }
                                if (fVar == null) {
                                    fVar = new jb.f(i14);
                                } else {
                                    fVar.g(i14);
                                }
                                message.M3(fVar);
                            } else {
                                j10 = P1;
                                z10 = z11;
                            }
                            if (message.w7()) {
                                if (eVar2 == null) {
                                    eVar2 = new k0.e();
                                }
                                jb.f fVar2 = (jb.f) eVar2.f(message.I2());
                                if (fVar2 == null) {
                                    fVar2 = new jb.f(i14);
                                    eVar2.k(message.I2(), fVar2);
                                } else {
                                    fVar2.g(i14);
                                }
                                message.M3(fVar2);
                            }
                            z11 = z10;
                        } else {
                            j10 = P1;
                        }
                        i12++;
                        i13 = i11;
                        P1 = j10;
                    }
                    long j11 = P1;
                    if (eVar2 != null) {
                        k0.e<long[]> eVar3 = new k0.e<>(eVar2.p());
                        for (int i17 = 0; i17 < eVar2.p(); i17++) {
                            eVar3.a(eVar2.j(i17), ((jb.f) eVar2.q(i17)).r());
                        }
                        eVar = eVar3;
                    } else {
                        eVar = null;
                    }
                    if (z13) {
                        this.U = D4;
                        this.V = j11;
                        this.X = i15;
                    } else {
                        this.X = 0;
                        long j12 = 0;
                        this.V = j12;
                        this.U = j12;
                    }
                    Q2(z11);
                    a3(this.O.H(), this.O.K(), eVar, i16);
                    S2(z12);
                    if (fVar != null) {
                        A3(this.O.H(), this.O.K(), fVar, true);
                    }
                }
            }
        }
    }

    public s4 z0() {
        int T1 = this.M.T1();
        if (T1 == -1) {
            T1 = this.M.X1();
        }
        if (T1 != -1) {
            return this.f25264c.i0(T1);
        }
        return null;
    }

    public final void z2() {
        synchronized (this.f25260a) {
            if (!this.f25260a.U0) {
                x1 x1Var = this.O;
                x1Var.t0(x1Var.H(), new j() {
                    @Override
                    public final void a(Object obj) {
                        v2.this.L1((TdApi.SponsoredMessage) obj);
                    }
                });
            }
        }
    }

    public void z3() {
        LinearLayoutManager linearLayoutManager = this.M;
        if (linearLayoutManager != null) {
            int X1 = linearLayoutManager.X1();
            int a22 = this.M.a2();
            if (!(X1 == -1 || a22 == -1)) {
                y3(X1, a22);
                if (this.f25276n0 && ((X1 - 7 > 0 || !this.O.i0(false)) && a22 + 10 >= this.f25264c.D())) {
                    this.O.i0(true);
                }
            }
            l0(X1, a22);
            this.f25260a.bj(X1, a22, true);
        }
    }
}
