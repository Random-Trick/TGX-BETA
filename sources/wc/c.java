package wc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import de.o4;
import gd.w;
import hd.b3;
import ib.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.v.ChatsRecyclerView;
import zd.o6;

public class c extends RecyclerView.h<d> {
    public static final Comparator<b3> U = b.f25859a;
    public final o4 M;
    public LinearLayoutManager P;
    public boolean Q;
    public boolean R;
    public ArrayList<RecyclerView> T;
    public int O = R.string.xChats;
    public final Set<Long> S = new HashSet();
    public final ArrayList<b3> N = new ArrayList<>();

    public c(o4 o4Var, LinearLayoutManager linearLayoutManager) {
        this.M = o4Var;
        this.P = linearLayoutManager;
    }

    public static int q0(b3 b3Var, b3 b3Var2) {
        long A = b3Var.A();
        long A2 = b3Var2.A();
        return A != A2 ? Long.compare(A2, A) : Long.compare(b3Var2.x(), b3Var.x());
    }

    public void W(d dVar) {
        if (dVar.n() == 0) {
            ((a) dVar.f2982a).b();
        }
    }

    public void X(d dVar) {
        if (dVar.n() == 0) {
            ((a) dVar.f2982a).setChat(null);
        }
    }

    public int C0(long j10, long j11, boolean z10) {
        int n02 = n0(j10);
        if (n02 != -1) {
            b3 b3Var = this.N.get(n02);
            if (b3Var.l(j11)) {
                if (z10) {
                    b3Var.O0();
                }
                return n02;
            }
        }
        return -1;
    }

    @Override
    public int D() {
        if (this.N.isEmpty()) {
            return 0;
        }
        return this.N.size() + 1;
    }

    public final b3 D0(int i10) {
        b3 remove = this.N.remove(i10);
        this.S.remove(Long.valueOf(remove.x()));
        return remove;
    }

    public int E0(TdApi.Chat chat, int i10, o6.g gVar) {
        if (this.R) {
            i10++;
        }
        if (i10 == -1) {
            return 0;
        }
        b3 D0 = D0(i10);
        if (D0.x() == chat.f19908id) {
            b3 h02 = h0(i10 - 1);
            b3 h03 = h0(i10);
            boolean z10 = gVar.a() || t0(h02, D0) || t0(h03, D0);
            D0.k1(chat.f19908id, gVar.f28135a, gVar.d(), gVar.c());
            O(i10);
            I(this.N.size());
            this.M.ai();
            return (z10 || t0(h02, h03)) ? 2 : 0;
        }
        throw new IllegalStateException();
    }

    @Override
    public int F(int i10) {
        if (this.N.isEmpty()) {
            return 2;
        }
        return i10 == this.N.size() ? 1 : 0;
    }

    public void F0() {
    }

    public void G0(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            f0();
        }
    }

    public void H0(int i10) {
        this.O = i10;
    }

    public int I0(int i10) {
        b3 h02;
        if (!this.R || (h02 = h0(0)) == null || !h02.i0()) {
            return -1;
        }
        if (i10 == 1) {
            h02.I0();
        } else if (i10 != 2) {
            h02.H0();
        } else {
            h02.J0();
        }
        return 0;
    }

    public int J0(TdApi.Chat chat, int i10, o6.g gVar) {
        if (this.R) {
            i10++;
        }
        b3 b3Var = this.N.get(i10);
        long x10 = b3Var.x();
        long j10 = chat.f19908id;
        if (x10 == j10) {
            b3Var.k1(j10, gVar.f28135a, gVar.d(), gVar.c());
            return gVar.a() ? 2 : 0;
        }
        throw new IllegalStateException();
    }

    public int K0(long j10, String str) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).g1(j10, str)) {
            return -1;
        }
        return n02;
    }

    public int L0(long j10, TdApi.DraftMessage draftMessage) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).q1(j10, draftMessage)) {
            return -1;
        }
        return n02;
    }

    public int M0(long j10, boolean z10) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).h1(j10, z10)) {
            return -1;
        }
        return n02;
    }

    public int N0(long j10, boolean z10) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).s1(j10, z10)) {
            return -1;
        }
        return n02;
    }

    public int O0(long j10, TdApi.ChatPermissions chatPermissions) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).i1(j10, chatPermissions)) {
            return -1;
        }
        return n02;
    }

    @Override
    public void P(RecyclerView recyclerView) {
        if (this.T == null) {
            this.T = new ArrayList<>();
        }
        this.T.add(recyclerView);
    }

    public int P0(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).j1(j10, chatPhotoInfo)) {
            return -1;
        }
        return n02;
    }

    public int Q0(long j10, long j11, int i10) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).l1(j10, j11, i10)) {
            return -1;
        }
        return n02;
    }

    public int R0(long j10, long j11) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).m1(j10, j11)) {
            return -1;
        }
        return n02;
    }

    public int S0(long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).n1(j10, chatNotificationSettings)) {
            return -1;
        }
        return n02;
    }

    @Override
    public void T(RecyclerView recyclerView) {
        ArrayList<RecyclerView> arrayList = this.T;
        if (arrayList != null) {
            arrayList.remove(recyclerView);
        }
    }

    public int T0(long j10, String str) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).o1(j10, str)) {
            return -1;
        }
        return n02;
    }

    public int U0(long j10, TdApi.Message message) {
        int n02 = n0(j10);
        if (n02 == -1) {
            return -1;
        }
        this.N.get(n02).y1(j10, message);
        return n02;
    }

    public int V0(long j10, int i10) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).p1(j10, i10)) {
            return -1;
        }
        return n02;
    }

    public void W0() {
        if (!this.N.isEmpty()) {
            I(this.N.size());
        }
    }

    public void X0(boolean z10) {
        Iterator<b3> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().r1(z10);
        }
    }

    public int Y0(long j10, long j11, TdApi.MessageContent messageContent) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).t1(j10, j11, messageContent)) {
            return -1;
        }
        return n02;
    }

    public int Z0(long j10, long j11, TdApi.MessageInteractionInfo messageInteractionInfo) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).u1(j10, j11, messageInteractionInfo)) {
            return -1;
        }
        return n02;
    }

    public int a1(TdApi.Message message, long j10) {
        int n02 = n0(message.chatId);
        if (n02 == -1 || !this.N.get(n02).v1(message, j10)) {
            return -1;
        }
        return n02;
    }

    public int b0(TdApi.Chat chat, int i10, o6.g gVar) {
        int i11 = 0;
        b3 b3Var = new b3(this.M.Z9(), this.M.Wh(), chat, false);
        if (this.R) {
            i10++;
        }
        b3Var.E0();
        if (gVar.a()) {
            i11 = 2;
        }
        c0(i10, b3Var);
        w0(-1, i10);
        I(this.N.size());
        this.M.ai();
        return i11;
    }

    public int b1(long j10, long[] jArr) {
        int n02 = n0(j10);
        if (n02 == -1 || !this.N.get(n02).w1(j10, jArr)) {
            return -1;
        }
        return n02;
    }

    public final void c0(int i10, b3 b3Var) {
        Long valueOf = Long.valueOf(b3Var.x());
        if (i10 == -1) {
            this.N.add(b3Var);
        } else {
            this.N.add(i10, b3Var);
        }
        if (!this.S.add(valueOf)) {
            throw new IllegalStateException("Chat is already present in the list");
        }
    }

    public void c1(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
    }

    public void d0(b3[] b3VarArr) {
        int i10;
        if (b3VarArr.length != 0) {
            int size = this.N.size();
            b3 b3Var = null;
            b3 b3Var2 = !this.N.isEmpty() ? this.N.get(size - 1) : null;
            if (size != 0 || !this.Q) {
                this.N.ensureCapacity(b3VarArr.length + size);
                i10 = 0;
            } else {
                this.N.ensureCapacity(b3VarArr.length + size + 1);
                this.N.add(u0());
                this.R = true;
                i10 = 1;
            }
            for (b3 b3Var3 : b3VarArr) {
                if (this.S.add(Long.valueOf(b3Var3.x()))) {
                    this.N.add(b3Var3);
                    i10++;
                    b3Var = b3Var3;
                }
            }
            if (i10 > 0) {
                M(size, i10);
                if (!(b3Var == null || b3Var2 == null || b3Var2.p0() == b3Var.p0())) {
                    I(size - 1);
                }
            }
        }
    }

    public int d1(TdApi.SecretChat secretChat) {
        int o02 = o0(secretChat.f19960id);
        if (o02 == -1 || !this.N.get(o02).x1(secretChat)) {
            return -1;
        }
        return o02;
    }

    public boolean e0() {
        return !this.M.pi() && j0(false, null) >= 2;
    }

    public void e1(ChatsRecyclerView chatsRecyclerView, TdApi.User user) {
        Iterator<b3> it = this.N.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            b3 next = it.next();
            if (next.z1(user) || next.r()) {
                chatsRecyclerView.G1(i10);
            }
            i10++;
        }
    }

    public void f0() {
        boolean z10 = this.Q && this.M.qi() && this.N.size() - (this.R ? 1 : 0) > 0;
        if (this.R != z10) {
            this.R = z10;
            if (z10) {
                this.N.add(0, u0());
                w0(-1, 0);
            } else {
                this.N.remove(0);
                O(0);
            }
            p0();
        }
    }

    public int f1(long j10, int i10) {
        if (i10 == 0) {
            int i11 = 0;
            Iterator<b3> it = this.N.iterator();
            while (it.hasNext()) {
                b3 next = it.next();
                if (next.B() == j10 && next.r()) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        while (i10 < this.N.size()) {
            b3 b3Var = this.N.get(i10);
            if (b3Var.B() == j10 && b3Var.r()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void g0() {
        Iterator<b3> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    public b3 h0(int i10) {
        if (i10 < 0 || i10 >= this.N.size()) {
            return null;
        }
        return this.N.get(i10);
    }

    public ArrayList<b3> i0() {
        return this.N;
    }

    public int j0(boolean z10, ArrayList<Long> arrayList) {
        Iterator<b3> it = this.N.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            b3 next = it.next();
            if (!next.i0() && !next.p0()) {
                break;
            }
            i10++;
            if (next.o0() && arrayList != null) {
                arrayList.add(Long.valueOf(next.x()));
            }
        }
        return i10;
    }

    public int k0(boolean z10) {
        Iterator<b3> it = this.N.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            b3 next = it.next();
            if (!next.o0()) {
                if (!next.i0() && !next.p0()) {
                    break;
                }
            } else if (z10 == next.q0()) {
                i10++;
            }
        }
        return i10;
    }

    public boolean l0() {
        return this.R;
    }

    public boolean m0() {
        return !this.N.isEmpty();
    }

    public int n0(long j10) {
        if (j10 == 0) {
            return -1;
        }
        int i10 = 0;
        Iterator<b3> it = this.N.iterator();
        while (it.hasNext()) {
            if (it.next().x() == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public int o0(int i10) {
        Iterator<b3> it = this.N.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            b3 next = it.next();
            if (next.q0() && next.N() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public void p0() {
        ArrayList<RecyclerView> arrayList = this.T;
        if (arrayList != null) {
            Iterator<RecyclerView> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().A0();
            }
        }
    }

    public int r0(org.drinkless.td.libcore.telegram.TdApi.Chat r11, int r12, int r13, zd.o6.g r14) {
        throw new UnsupportedOperationException("Method not decompiled: wc.c.r0(org.drinkless.td.libcore.telegram.TdApi$Chat, int, int, zd.o6$g):int");
    }

    public void s0(int i10, int i11) {
        b3 h02 = h0(i10);
        b3 h03 = h0(i11);
        if (h02 != null && h02.o0() && h03 != null && h03.o0()) {
            ArrayList<Long> arrayList = new ArrayList<>();
            int j02 = j0(true, arrayList) - arrayList.size();
            b.w(arrayList, i10 - j02, i11 - j02);
            this.M.c().v4().o(new TdApi.SetPinnedChats(this.M.Wh(), b.d(arrayList)), this.M.c().na());
        }
    }

    public final boolean t0(b3 b3Var, b3 b3Var2) {
        return (b3Var == null || b3Var2 == null || (b3Var.i0() == b3Var2.i0() && b3Var.p0() == b3Var2.p0())) ? false : true;
    }

    public final b3 u0() {
        o4 o4Var = this.M;
        return new b3(o4Var, o4Var.c().o3(ob.b.f19339b), true);
    }

    public void v0() {
        L(0, D());
    }

    public final void w0(int i10, int i11) {
        View C;
        int X1 = this.P.X1();
        int i12 = 0;
        if (!(X1 == -1 || (C = this.P.C(X1)) == null)) {
            i12 = this.P.U(C);
        }
        if (i10 == -1) {
            J(i11);
        } else {
            K(i10, i11);
        }
        if (X1 != -1) {
            this.P.z2(X1, i12);
        }
    }

    public void Q(d dVar, int i10) {
        int F = F(i10);
        b3 b3Var = null;
        boolean z10 = true;
        if (F == 0) {
            b3 b3Var2 = this.N.get(i10);
            int i11 = i10 + 1;
            if (i11 < this.N.size()) {
                b3Var = this.N.get(i11);
            }
            if (b3Var == null || !b3Var2.p0() || b3Var.p0()) {
                z10 = false;
            }
            dVar.P(b3Var2, false, z10, this.M.ni(b3Var2));
        } else if (F != 1) {
            if (F == 2) {
                ((TextView) dVar.f2982a).setText(this.M.oi() ? w.i1(R.string.NoChats) : "");
            }
        } else if (!this.M.oi()) {
            dVar.R(null);
        } else if (this.N.size() == 0) {
            dVar.Q(R.string.NoChats);
        } else {
            int i12 = this.O;
            if (i12 == 0) {
                i12 = R.string.xChats;
            }
            dVar.R(w.q2(i12, this.R ? this.N.size() - 1 : this.N.size()));
        }
    }

    public d S(ViewGroup viewGroup, int i10) {
        a t10 = this.M.t();
        o6 c10 = this.M.c();
        o4 o4Var = this.M.Ua() ? null : this.M;
        o4 o4Var2 = this.M;
        return d.O(t10, c10, i10, o4Var, o4Var2, o4Var2);
    }

    public void V(d dVar) {
        if (dVar.n() == 0) {
            ((a) dVar.f2982a).e();
        }
    }
}
