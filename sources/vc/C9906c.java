package vc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gd.C4592b3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.ChatsRecyclerView;
import p038ce.View$OnClickListenerC2805o4;
import p082fd.C4403w;
import p108hb.C5062b;
import p193nb.C7317b;
import p350yd.C10930q6;

public class C9906c extends RecyclerView.AbstractC0890h<C9907d> {
    public static final Comparator<C4592b3> f32212U = C9905b.f32211a;
    public final View$OnClickListenerC2805o4 f32213M;
    public LinearLayoutManager f32216P;
    public boolean f32217Q;
    public boolean f32218R;
    public ArrayList<RecyclerView> f32220T;
    public int f32215O = R.string.xChats;
    public final Set<Long> f32219S = new HashSet();
    public final ArrayList<C4592b3> f32214N = new ArrayList<>();

    public C9906c(View$OnClickListenerC2805o4 o4Var, LinearLayoutManager linearLayoutManager) {
        this.f32213M = o4Var;
        this.f32216P = linearLayoutManager;
    }

    public static int m6582r0(C4592b3 b3Var, C4592b3 b3Var2) {
        long z = b3Var.m27092z();
        long z2 = b3Var2.m27092z();
        return z != z2 ? Long.compare(z2, z) : Long.compare(b3Var2.m27096x(), b3Var.m27096x());
    }

    public C9907d mo6145S(ViewGroup viewGroup, int i) {
        AbstractView$OnTouchListenerC7889a s = this.f32213M.mo4347s();
        C10930q6 c = this.f32213M.mo4348c();
        View$OnClickListenerC2805o4 o4Var = this.f32213M.m9332Ua() ? null : this.f32213M;
        View$OnClickListenerC2805o4 o4Var2 = this.f32213M;
        return C9907d.m6574O(s, c, i, o4Var, o4Var2, o4Var2);
    }

    public void mo6144V(C9907d dVar) {
        if (dVar.m39332n() == 0) {
            ((C9903a) dVar.f3479a).m6649f();
        }
    }

    public void mo6143W(C9907d dVar) {
        if (dVar.m39332n() == 0) {
            ((C9903a) dVar.f3479a).m6653b();
        }
    }

    @Override
    public int mo6153D() {
        if (this.f32214N.isEmpty()) {
            return 0;
        }
        return this.f32214N.size() + 1;
    }

    public void mo6142X(C9907d dVar) {
        if (dVar.m39332n() == 0) {
            ((C9903a) dVar.f3479a).setChat(null);
        }
    }

    public int m6630E0(long j, long j2, boolean z) {
        int o0 = m6585o0(j);
        if (o0 != -1) {
            C4592b3 b3Var = this.f32214N.get(o0);
            if (b3Var.m27119p(j2)) {
                if (z) {
                    b3Var.m27182N0();
                }
                return o0;
            }
        }
        return -1;
    }

    @Override
    public int mo6150F(int i) {
        if (this.f32214N.isEmpty()) {
            return 2;
        }
        return i == this.f32214N.size() ? 1 : 0;
    }

    public final C4592b3 m6629F0(int i) {
        C4592b3 remove = this.f32214N.remove(i);
        this.f32219S.remove(Long.valueOf(remove.m27096x()));
        return remove;
    }

    public int m6628G0(TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
        if (this.f32218R) {
            i++;
        }
        if (i == -1) {
            return 0;
        }
        C4592b3 F0 = m6629F0(i);
        if (F0.m27096x() == chat.f25367id) {
            C4592b3 i0 = m6593i0(i - 1);
            C4592b3 i02 = m6593i0(i);
            boolean z = gVar.m2130a() || m6579u0(i0, F0) || m6579u0(i02, F0);
            F0.m27137h1(chat.f25367id, gVar.f35136a, gVar.m2127d(), gVar.m2128c());
            m39306O(i);
            m39312I(this.f32214N.size());
            this.f32213M.m33391ai();
            return (z || m6579u0(i0, i02)) ? 2 : 0;
        }
        throw new IllegalStateException();
    }

    public void m6627H0() {
    }

    public void m6626I0(boolean z) {
        if (this.f32217Q != z) {
            this.f32217Q = z;
            m6597g0();
        }
    }

    public void m6625J0(int i) {
        this.f32215O = i;
    }

    public int m6624K0(int i) {
        C4592b3 i0;
        if (!this.f32218R || (i0 = m6593i0(0)) == null || !i0.m27138h0()) {
            return -1;
        }
        if (i == 1) {
            i0.m27194H0();
        } else if (i != 2) {
            i0.m27196G0();
        } else {
            i0.m27192I0();
        }
        return 0;
    }

    public int m6623L0(TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
        if (this.f32218R) {
            i++;
        }
        C4592b3 b3Var = this.f32214N.get(i);
        long x = b3Var.m27096x();
        long j = chat.f25367id;
        if (x == j) {
            b3Var.m27137h1(j, gVar.f35136a, gVar.m2127d(), gVar.m2128c());
            return gVar.m2130a() ? 2 : 0;
        }
        throw new IllegalStateException();
    }

    public int m6622M0(long j, String str) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27149d1(j, str)) {
            return -1;
        }
        return o0;
    }

    public int m6621N0(long j, TdApi.DraftMessage draftMessage) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27122n1(j, draftMessage)) {
            return -1;
        }
        return o0;
    }

    public int m6620O0(long j, boolean z) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27146e1(j, z)) {
            return -1;
        }
        return o0;
    }

    @Override
    public void mo6619P(RecyclerView recyclerView) {
        if (this.f32220T == null) {
            this.f32220T = new ArrayList<>();
        }
        this.f32220T.add(recyclerView);
    }

    public int m6618P0(long j, boolean z) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27117p1(j, z)) {
            return -1;
        }
        return o0;
    }

    public int m6617Q0(long j, TdApi.ChatPermissions chatPermissions) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27143f1(j, chatPermissions)) {
            return -1;
        }
        return o0;
    }

    public int m6616R0(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27140g1(j, chatPhotoInfo)) {
            return -1;
        }
        return o0;
    }

    public int m6615S0(long j, long j2, int i) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27134i1(j, j2, i)) {
            return -1;
        }
        return o0;
    }

    @Override
    public void mo6614T(RecyclerView recyclerView) {
        ArrayList<RecyclerView> arrayList = this.f32220T;
        if (arrayList != null) {
            arrayList.remove(recyclerView);
        }
    }

    public int m6613T0(long j, long j2) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27132j1(j, j2)) {
            return -1;
        }
        return o0;
    }

    public int m6612U0(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27129k1(j, chatNotificationSettings)) {
            return -1;
        }
        return o0;
    }

    public int m6611V0(long j, String str) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27126l1(j, str)) {
            return -1;
        }
        return o0;
    }

    public int m6610W0(long j, TdApi.Message message) {
        int o0 = m6585o0(j);
        if (o0 == -1) {
            return -1;
        }
        this.f32214N.get(o0).m27100v1(j, message);
        return o0;
    }

    public int m6609X0(long j, int i) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27124m1(j, i)) {
            return -1;
        }
        return o0;
    }

    public void m6608Z0() {
        if (!this.f32214N.isEmpty()) {
            m39312I(this.f32214N.size());
        }
    }

    public void m6606a1(boolean z) {
        Iterator<C4592b3> it = this.f32214N.iterator();
        while (it.hasNext()) {
            it.next().m27120o1(z);
        }
    }

    public int m6605b1(long j, long j2, TdApi.MessageContent messageContent) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27115q1(j, j2, messageContent)) {
            return -1;
        }
        return o0;
    }

    public int m6604c0(TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
        int i2 = 0;
        C4592b3 b3Var = new C4592b3(this.f32213M.m9300Z9(), this.f32213M.m33410Wh(), chat, false);
        if (this.f32218R) {
            i++;
        }
        b3Var.m27202D0();
        if (gVar.m2130a()) {
            i2 = 2;
        }
        m6602d0(i, b3Var);
        m6576y0(-1, i);
        m39312I(this.f32214N.size());
        this.f32213M.m33391ai();
        return i2;
    }

    public int m6603c1(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27112r1(j, j2, messageInteractionInfo)) {
            return -1;
        }
        return o0;
    }

    public final void m6602d0(int i, C4592b3 b3Var) {
        Long valueOf = Long.valueOf(b3Var.m27096x());
        if (i == -1) {
            this.f32214N.add(b3Var);
        } else {
            this.f32214N.add(i, b3Var);
        }
        if (!this.f32219S.add(valueOf)) {
            throw new IllegalStateException("Chat is already present in the list");
        }
    }

    public int m6601d1(TdApi.Message message, long j) {
        int o0 = m6585o0(message.chatId);
        if (o0 == -1 || !this.f32214N.get(o0).m27109s1(message, j)) {
            return -1;
        }
        return o0;
    }

    public void m6600e0(C4592b3[] b3VarArr) {
        int i;
        if (b3VarArr.length != 0) {
            int size = this.f32214N.size();
            C4592b3 b3Var = null;
            C4592b3 b3Var2 = !this.f32214N.isEmpty() ? this.f32214N.get(size - 1) : null;
            if (size != 0 || !this.f32217Q) {
                this.f32214N.ensureCapacity(b3VarArr.length + size);
                i = 0;
            } else {
                this.f32214N.ensureCapacity(b3VarArr.length + size + 1);
                this.f32214N.add(m6578w0());
                this.f32218R = true;
                i = 1;
            }
            for (C4592b3 b3Var3 : b3VarArr) {
                if (this.f32219S.add(Long.valueOf(b3Var3.m27096x()))) {
                    this.f32214N.add(b3Var3);
                    i++;
                    b3Var = b3Var3;
                }
            }
            if (i > 0) {
                m39308M(size, i);
                if (!(b3Var == null || b3Var2 == null || b3Var2.m27121o0() == b3Var.m27121o0())) {
                    m39312I(size - 1);
                }
            }
        }
    }

    public boolean m6599f0() {
        return !this.f32213M.m33316pi() && m6589k0(false, null) >= 2;
    }

    public int m6598f1(long j, long[] jArr) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32214N.get(o0).m27106t1(j, jArr)) {
            return -1;
        }
        return o0;
    }

    public void m6597g0() {
        boolean z = this.f32217Q && this.f32213M.m33311qi() && this.f32214N.size() - (this.f32218R ? 1 : 0) > 0;
        if (this.f32218R != z) {
            this.f32218R = z;
            if (z) {
                this.f32214N.add(0, m6578w0());
                m6576y0(-1, 0);
            } else {
                this.f32214N.remove(0);
                m39306O(0);
            }
            m6583q0();
        }
    }

    public void m6596g1(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
    }

    public void m6595h0() {
        Iterator<C4592b3> it = this.f32214N.iterator();
        while (it.hasNext()) {
            it.next().m27128l();
        }
    }

    public int m6594h1(TdApi.SecretChat secretChat) {
        int p0 = m6584p0(secretChat.f25419id);
        if (p0 == -1 || !this.f32214N.get(p0).m27103u1(secretChat)) {
            return -1;
        }
        return p0;
    }

    public C4592b3 m6593i0(int i) {
        if (i < 0 || i >= this.f32214N.size()) {
            return null;
        }
        return this.f32214N.get(i);
    }

    public void m6592i1(ChatsRecyclerView chatsRecyclerView, TdApi.User user) {
        Iterator<C4592b3> it = this.f32214N.iterator();
        int i = 0;
        while (it.hasNext()) {
            C4592b3 next = it.next();
            if (next.m27097w1(user) || next.m27111s()) {
                chatsRecyclerView.m14163H1(i);
            }
            i++;
        }
    }

    public ArrayList<C4592b3> m6591j0() {
        return this.f32214N;
    }

    public int m6590j1(long j, int i) {
        if (i == 0) {
            int i2 = 0;
            Iterator<C4592b3> it = this.f32214N.iterator();
            while (it.hasNext()) {
                C4592b3 next = it.next();
                if (next.m27209A() == j && next.m27111s()) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        while (i < this.f32214N.size()) {
            C4592b3 b3Var = this.f32214N.get(i);
            if (b3Var.m27209A() == j && b3Var.m27111s()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int m6589k0(boolean z, ArrayList<Long> arrayList) {
        Iterator<C4592b3> it = this.f32214N.iterator();
        int i = 0;
        while (it.hasNext()) {
            C4592b3 next = it.next();
            if (!next.m27138h0() && !next.m27121o0()) {
                break;
            }
            i++;
            if (next.m27123n0() && arrayList != null) {
                arrayList.add(Long.valueOf(next.m27096x()));
            }
        }
        return i;
    }

    public int m6588l0(boolean z) {
        Iterator<C4592b3> it = this.f32214N.iterator();
        int i = 0;
        while (it.hasNext()) {
            C4592b3 next = it.next();
            if (!next.m27123n0()) {
                if (!next.m27138h0() && !next.m27121o0()) {
                    break;
                }
            } else if (z == next.m27118p0()) {
                i++;
            }
        }
        return i;
    }

    public boolean m6587m0() {
        return this.f32218R;
    }

    public boolean m6586n0() {
        return !this.f32214N.isEmpty();
    }

    public int m6585o0(long j) {
        if (j == 0) {
            return -1;
        }
        int i = 0;
        Iterator<C4592b3> it = this.f32214N.iterator();
        while (it.hasNext()) {
            if (it.next().m27096x() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int m6584p0(int i) {
        Iterator<C4592b3> it = this.f32214N.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C4592b3 next = it.next();
            if (next.m27118p0() && next.m27185M() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public void m6583q0() {
        ArrayList<RecyclerView> arrayList = this.f32220T;
        if (arrayList != null) {
            Iterator<RecyclerView> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m39504A0();
            }
        }
    }

    public int m6581s0(org.drinkless.p210td.libcore.telegram.TdApi.Chat r11, int r12, int r13, p350yd.C10930q6.C10937g r14) {
        throw new UnsupportedOperationException("Method not decompiled: vc.C9906c.m6581s0(org.drinkless.td.libcore.telegram.TdApi$Chat, int, int, yd.q6$g):int");
    }

    public void m6580t0(int i, int i2) {
        C4592b3 i0 = m6593i0(i);
        C4592b3 i02 = m6593i0(i2);
        if (i0 != null && i0.m27123n0() && i02 != null && i02.m27123n0()) {
            ArrayList<Long> arrayList = new ArrayList<>();
            int k0 = m6589k0(true, arrayList) - arrayList.size();
            C5062b.m24149w(arrayList, i - k0, i2 - k0);
            this.f32213M.mo4348c().m2270r4().m14783o(new TdApi.SetPinnedChats(this.f32213M.m33410Wh(), C5062b.m24168d(arrayList)), this.f32213M.mo4348c().m2392ja());
        }
    }

    public final boolean m6579u0(C4592b3 b3Var, C4592b3 b3Var2) {
        return (b3Var == null || b3Var2 == null || (b3Var.m27138h0() == b3Var2.m27138h0() && b3Var.m27121o0() == b3Var2.m27121o0())) ? false : true;
    }

    public final C4592b3 m6578w0() {
        View$OnClickListenerC2805o4 o4Var = this.f32213M;
        return new C4592b3(o4Var, o4Var.mo4348c().m2367l3(C7317b.f23225b), true);
    }

    public void m6577x0() {
        m39309L(0, mo6153D());
    }

    public final void m6576y0(int i, int i2) {
        View C;
        int X1 = this.f32216P.m39549X1();
        int i3 = 0;
        if (!(X1 == -1 || (C = this.f32216P.mo39262C(X1)) == null)) {
            i3 = this.f32216P.m39231U(C);
        }
        if (i == -1) {
            m39311J(i2);
        } else {
            m39310K(i, i2);
        }
        if (X1 != -1) {
            this.f32216P.m39522z2(X1, i3);
        }
    }

    public void mo6146Q(C9907d dVar, int i) {
        int F = mo6150F(i);
        C4592b3 b3Var = null;
        boolean z = true;
        if (F == 0) {
            C4592b3 b3Var2 = this.f32214N.get(i);
            int i2 = i + 1;
            if (i2 < this.f32214N.size()) {
                b3Var = this.f32214N.get(i2);
            }
            if (b3Var == null || !b3Var2.m27121o0() || b3Var.m27121o0()) {
                z = false;
            }
            dVar.m6573P(b3Var2, false, z, this.f32213M.m33326ni(b3Var2));
        } else if (F != 1) {
            if (F == 2) {
                ((TextView) dVar.f3479a).setText(this.f32213M.m33321oi() ? C4403w.m27869i1(R.string.NoChats) : "");
            }
        } else if (!this.f32213M.m33321oi()) {
            dVar.m6571R(null);
        } else if (this.f32214N.size() == 0) {
            dVar.m6572Q(R.string.NoChats);
        } else {
            int i3 = this.f32215O;
            if (i3 == 0) {
                i3 = R.string.xChats;
            }
            dVar.m6571R(C4403w.m27836q2(i3, this.f32218R ? this.f32214N.size() - 1 : this.f32214N.size()));
        }
    }
}
