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
    public static final Comparator<C4592b3> f32215U = C9905b.f32214a;
    public final View$OnClickListenerC2805o4 f32216M;
    public LinearLayoutManager f32219P;
    public boolean f32220Q;
    public boolean f32221R;
    public ArrayList<RecyclerView> f32223T;
    public int f32218O = R.string.xChats;
    public final Set<Long> f32222S = new HashSet();
    public final ArrayList<C4592b3> f32217N = new ArrayList<>();

    public C9906c(View$OnClickListenerC2805o4 o4Var, LinearLayoutManager linearLayoutManager) {
        this.f32216M = o4Var;
        this.f32219P = linearLayoutManager;
    }

    public static int m6582r0(C4592b3 b3Var, C4592b3 b3Var2) {
        long z = b3Var.m27094z();
        long z2 = b3Var2.m27094z();
        return z != z2 ? Long.compare(z2, z) : Long.compare(b3Var2.m27098x(), b3Var.m27098x());
    }

    public C9907d mo6145S(ViewGroup viewGroup, int i) {
        AbstractView$OnTouchListenerC7889a s = this.f32216M.mo4347s();
        C10930q6 c = this.f32216M.mo4348c();
        View$OnClickListenerC2805o4 o4Var = this.f32216M.m9332Ua() ? null : this.f32216M;
        View$OnClickListenerC2805o4 o4Var2 = this.f32216M;
        return C9907d.m6574O(s, c, i, o4Var, o4Var2, o4Var2);
    }

    public void mo6144V(C9907d dVar) {
        if (dVar.m39335n() == 0) {
            ((C9903a) dVar.f3479a).m6649f();
        }
    }

    public void mo6143W(C9907d dVar) {
        if (dVar.m39335n() == 0) {
            ((C9903a) dVar.f3479a).m6653b();
        }
    }

    @Override
    public int mo6153D() {
        if (this.f32217N.isEmpty()) {
            return 0;
        }
        return this.f32217N.size() + 1;
    }

    public void mo6142X(C9907d dVar) {
        if (dVar.m39335n() == 0) {
            ((C9903a) dVar.f3479a).setChat(null);
        }
    }

    public int m6630E0(long j, long j2, boolean z) {
        int o0 = m6585o0(j);
        if (o0 != -1) {
            C4592b3 b3Var = this.f32217N.get(o0);
            if (b3Var.m27121p(j2)) {
                if (z) {
                    b3Var.m27184N0();
                }
                return o0;
            }
        }
        return -1;
    }

    @Override
    public int mo6150F(int i) {
        if (this.f32217N.isEmpty()) {
            return 2;
        }
        return i == this.f32217N.size() ? 1 : 0;
    }

    public final C4592b3 m6629F0(int i) {
        C4592b3 remove = this.f32217N.remove(i);
        this.f32222S.remove(Long.valueOf(remove.m27098x()));
        return remove;
    }

    public int m6628G0(TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
        if (this.f32221R) {
            i++;
        }
        if (i == -1) {
            return 0;
        }
        C4592b3 F0 = m6629F0(i);
        if (F0.m27098x() == chat.f25370id) {
            C4592b3 i0 = m6593i0(i - 1);
            C4592b3 i02 = m6593i0(i);
            boolean z = gVar.m2130a() || m6579u0(i0, F0) || m6579u0(i02, F0);
            F0.m27139h1(chat.f25370id, gVar.f35139a, gVar.m2127d(), gVar.m2128c());
            m39309O(i);
            m39315I(this.f32217N.size());
            this.f32216M.m33394ai();
            return (z || m6579u0(i0, i02)) ? 2 : 0;
        }
        throw new IllegalStateException();
    }

    public void m6627H0() {
    }

    public void m6626I0(boolean z) {
        if (this.f32220Q != z) {
            this.f32220Q = z;
            m6597g0();
        }
    }

    public void m6625J0(int i) {
        this.f32218O = i;
    }

    public int m6624K0(int i) {
        C4592b3 i0;
        if (!this.f32221R || (i0 = m6593i0(0)) == null || !i0.m27140h0()) {
            return -1;
        }
        if (i == 1) {
            i0.m27196H0();
        } else if (i != 2) {
            i0.m27198G0();
        } else {
            i0.m27194I0();
        }
        return 0;
    }

    public int m6623L0(TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
        if (this.f32221R) {
            i++;
        }
        C4592b3 b3Var = this.f32217N.get(i);
        long x = b3Var.m27098x();
        long j = chat.f25370id;
        if (x == j) {
            b3Var.m27139h1(j, gVar.f35139a, gVar.m2127d(), gVar.m2128c());
            return gVar.m2130a() ? 2 : 0;
        }
        throw new IllegalStateException();
    }

    public int m6622M0(long j, String str) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27151d1(j, str)) {
            return -1;
        }
        return o0;
    }

    public int m6621N0(long j, TdApi.DraftMessage draftMessage) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27124n1(j, draftMessage)) {
            return -1;
        }
        return o0;
    }

    public int m6620O0(long j, boolean z) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27148e1(j, z)) {
            return -1;
        }
        return o0;
    }

    @Override
    public void mo6619P(RecyclerView recyclerView) {
        if (this.f32223T == null) {
            this.f32223T = new ArrayList<>();
        }
        this.f32223T.add(recyclerView);
    }

    public int m6618P0(long j, boolean z) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27119p1(j, z)) {
            return -1;
        }
        return o0;
    }

    public int m6617Q0(long j, TdApi.ChatPermissions chatPermissions) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27145f1(j, chatPermissions)) {
            return -1;
        }
        return o0;
    }

    public int m6616R0(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27142g1(j, chatPhotoInfo)) {
            return -1;
        }
        return o0;
    }

    public int m6615S0(long j, long j2, int i) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27136i1(j, j2, i)) {
            return -1;
        }
        return o0;
    }

    @Override
    public void mo6614T(RecyclerView recyclerView) {
        ArrayList<RecyclerView> arrayList = this.f32223T;
        if (arrayList != null) {
            arrayList.remove(recyclerView);
        }
    }

    public int m6613T0(long j, long j2) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27134j1(j, j2)) {
            return -1;
        }
        return o0;
    }

    public int m6612U0(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27131k1(j, chatNotificationSettings)) {
            return -1;
        }
        return o0;
    }

    public int m6611V0(long j, String str) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27128l1(j, str)) {
            return -1;
        }
        return o0;
    }

    public int m6610W0(long j, TdApi.Message message) {
        int o0 = m6585o0(j);
        if (o0 == -1) {
            return -1;
        }
        this.f32217N.get(o0).m27102v1(j, message);
        return o0;
    }

    public int m6609X0(long j, int i) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27126m1(j, i)) {
            return -1;
        }
        return o0;
    }

    public void m6608Z0() {
        if (!this.f32217N.isEmpty()) {
            m39315I(this.f32217N.size());
        }
    }

    public void m6606a1(boolean z) {
        Iterator<C4592b3> it = this.f32217N.iterator();
        while (it.hasNext()) {
            it.next().m27122o1(z);
        }
    }

    public int m6605b1(long j, long j2, TdApi.MessageContent messageContent) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27117q1(j, j2, messageContent)) {
            return -1;
        }
        return o0;
    }

    public int m6604c0(TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
        int i2 = 0;
        C4592b3 b3Var = new C4592b3(this.f32216M.m9300Z9(), this.f32216M.m33413Wh(), chat, false);
        if (this.f32221R) {
            i++;
        }
        b3Var.m27204D0();
        if (gVar.m2130a()) {
            i2 = 2;
        }
        m6602d0(i, b3Var);
        m6576y0(-1, i);
        m39315I(this.f32217N.size());
        this.f32216M.m33394ai();
        return i2;
    }

    public int m6603c1(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27114r1(j, j2, messageInteractionInfo)) {
            return -1;
        }
        return o0;
    }

    public final void m6602d0(int i, C4592b3 b3Var) {
        Long valueOf = Long.valueOf(b3Var.m27098x());
        if (i == -1) {
            this.f32217N.add(b3Var);
        } else {
            this.f32217N.add(i, b3Var);
        }
        if (!this.f32222S.add(valueOf)) {
            throw new IllegalStateException("Chat is already present in the list");
        }
    }

    public int m6601d1(TdApi.Message message, long j) {
        int o0 = m6585o0(message.chatId);
        if (o0 == -1 || !this.f32217N.get(o0).m27111s1(message, j)) {
            return -1;
        }
        return o0;
    }

    public void m6600e0(C4592b3[] b3VarArr) {
        int i;
        if (b3VarArr.length != 0) {
            int size = this.f32217N.size();
            C4592b3 b3Var = null;
            C4592b3 b3Var2 = !this.f32217N.isEmpty() ? this.f32217N.get(size - 1) : null;
            if (size != 0 || !this.f32220Q) {
                this.f32217N.ensureCapacity(b3VarArr.length + size);
                i = 0;
            } else {
                this.f32217N.ensureCapacity(b3VarArr.length + size + 1);
                this.f32217N.add(m6578w0());
                this.f32221R = true;
                i = 1;
            }
            for (C4592b3 b3Var3 : b3VarArr) {
                if (this.f32222S.add(Long.valueOf(b3Var3.m27098x()))) {
                    this.f32217N.add(b3Var3);
                    i++;
                    b3Var = b3Var3;
                }
            }
            if (i > 0) {
                m39311M(size, i);
                if (!(b3Var == null || b3Var2 == null || b3Var2.m27123o0() == b3Var.m27123o0())) {
                    m39315I(size - 1);
                }
            }
        }
    }

    public boolean m6599f0() {
        return !this.f32216M.m33319pi() && m6589k0(false, null) >= 2;
    }

    public int m6598f1(long j, long[] jArr) {
        int o0 = m6585o0(j);
        if (o0 == -1 || !this.f32217N.get(o0).m27108t1(j, jArr)) {
            return -1;
        }
        return o0;
    }

    public void m6597g0() {
        boolean z = this.f32220Q && this.f32216M.m33314qi() && this.f32217N.size() - (this.f32221R ? 1 : 0) > 0;
        if (this.f32221R != z) {
            this.f32221R = z;
            if (z) {
                this.f32217N.add(0, m6578w0());
                m6576y0(-1, 0);
            } else {
                this.f32217N.remove(0);
                m39309O(0);
            }
            m6583q0();
        }
    }

    public void m6596g1(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
    }

    public void m6595h0() {
        Iterator<C4592b3> it = this.f32217N.iterator();
        while (it.hasNext()) {
            it.next().m27130l();
        }
    }

    public int m6594h1(TdApi.SecretChat secretChat) {
        int p0 = m6584p0(secretChat.f25422id);
        if (p0 == -1 || !this.f32217N.get(p0).m27105u1(secretChat)) {
            return -1;
        }
        return p0;
    }

    public C4592b3 m6593i0(int i) {
        if (i < 0 || i >= this.f32217N.size()) {
            return null;
        }
        return this.f32217N.get(i);
    }

    public void m6592i1(ChatsRecyclerView chatsRecyclerView, TdApi.User user) {
        Iterator<C4592b3> it = this.f32217N.iterator();
        int i = 0;
        while (it.hasNext()) {
            C4592b3 next = it.next();
            if (next.m27099w1(user) || next.m27113s()) {
                chatsRecyclerView.m14162H1(i);
            }
            i++;
        }
    }

    public ArrayList<C4592b3> m6591j0() {
        return this.f32217N;
    }

    public int m6590j1(long j, int i) {
        if (i == 0) {
            int i2 = 0;
            Iterator<C4592b3> it = this.f32217N.iterator();
            while (it.hasNext()) {
                C4592b3 next = it.next();
                if (next.m27211A() == j && next.m27113s()) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        while (i < this.f32217N.size()) {
            C4592b3 b3Var = this.f32217N.get(i);
            if (b3Var.m27211A() == j && b3Var.m27113s()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int m6589k0(boolean z, ArrayList<Long> arrayList) {
        Iterator<C4592b3> it = this.f32217N.iterator();
        int i = 0;
        while (it.hasNext()) {
            C4592b3 next = it.next();
            if (!next.m27140h0() && !next.m27123o0()) {
                break;
            }
            i++;
            if (next.m27125n0() && arrayList != null) {
                arrayList.add(Long.valueOf(next.m27098x()));
            }
        }
        return i;
    }

    public int m6588l0(boolean z) {
        Iterator<C4592b3> it = this.f32217N.iterator();
        int i = 0;
        while (it.hasNext()) {
            C4592b3 next = it.next();
            if (!next.m27125n0()) {
                if (!next.m27140h0() && !next.m27123o0()) {
                    break;
                }
            } else if (z == next.m27120p0()) {
                i++;
            }
        }
        return i;
    }

    public boolean m6587m0() {
        return this.f32221R;
    }

    public boolean m6586n0() {
        return !this.f32217N.isEmpty();
    }

    public int m6585o0(long j) {
        if (j == 0) {
            return -1;
        }
        int i = 0;
        Iterator<C4592b3> it = this.f32217N.iterator();
        while (it.hasNext()) {
            if (it.next().m27098x() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int m6584p0(int i) {
        Iterator<C4592b3> it = this.f32217N.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C4592b3 next = it.next();
            if (next.m27120p0() && next.m27187M() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public void m6583q0() {
        ArrayList<RecyclerView> arrayList = this.f32223T;
        if (arrayList != null) {
            Iterator<RecyclerView> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m39507A0();
            }
        }
    }

    public int m6581s0(org.drinkless.p210td.libcore.telegram.TdApi.Chat r11, int r12, int r13, p350yd.C10930q6.C10937g r14) {
        throw new UnsupportedOperationException("Method not decompiled: vc.C9906c.m6581s0(org.drinkless.td.libcore.telegram.TdApi$Chat, int, int, yd.q6$g):int");
    }

    public void m6580t0(int i, int i2) {
        C4592b3 i0 = m6593i0(i);
        C4592b3 i02 = m6593i0(i2);
        if (i0 != null && i0.m27125n0() && i02 != null && i02.m27125n0()) {
            ArrayList<Long> arrayList = new ArrayList<>();
            int k0 = m6589k0(true, arrayList) - arrayList.size();
            C5062b.m24150w(arrayList, i - k0, i2 - k0);
            this.f32216M.mo4348c().m2270r4().m14783o(new TdApi.SetPinnedChats(this.f32216M.m33413Wh(), C5062b.m24169d(arrayList)), this.f32216M.mo4348c().m2392ja());
        }
    }

    public final boolean m6579u0(C4592b3 b3Var, C4592b3 b3Var2) {
        return (b3Var == null || b3Var2 == null || (b3Var.m27140h0() == b3Var2.m27140h0() && b3Var.m27123o0() == b3Var2.m27123o0())) ? false : true;
    }

    public final C4592b3 m6578w0() {
        View$OnClickListenerC2805o4 o4Var = this.f32216M;
        return new C4592b3(o4Var, o4Var.mo4348c().m2367l3(C7317b.f23228b), true);
    }

    public void m6577x0() {
        m39312L(0, mo6153D());
    }

    public final void m6576y0(int i, int i2) {
        View C;
        int X1 = this.f32219P.m39552X1();
        int i3 = 0;
        if (!(X1 == -1 || (C = this.f32219P.mo39265C(X1)) == null)) {
            i3 = this.f32219P.m39234U(C);
        }
        if (i == -1) {
            m39314J(i2);
        } else {
            m39313K(i, i2);
        }
        if (X1 != -1) {
            this.f32219P.m39525z2(X1, i3);
        }
    }

    public void mo6146Q(C9907d dVar, int i) {
        int F = mo6150F(i);
        C4592b3 b3Var = null;
        boolean z = true;
        if (F == 0) {
            C4592b3 b3Var2 = this.f32217N.get(i);
            int i2 = i + 1;
            if (i2 < this.f32217N.size()) {
                b3Var = this.f32217N.get(i2);
            }
            if (b3Var == null || !b3Var2.m27123o0() || b3Var.m27123o0()) {
                z = false;
            }
            dVar.m6573P(b3Var2, false, z, this.f32216M.m33329ni(b3Var2));
        } else if (F != 1) {
            if (F == 2) {
                ((TextView) dVar.f3479a).setText(this.f32216M.m33324oi() ? C4403w.m27871i1(R.string.NoChats) : "");
            }
        } else if (!this.f32216M.m33324oi()) {
            dVar.m6571R(null);
        } else if (this.f32217N.size() == 0) {
            dVar.m6572Q(R.string.NoChats);
        } else {
            int i3 = this.f32218O;
            if (i3 == 0) {
                i3 = R.string.xChats;
            }
            dVar.m6571R(C4403w.m27838q2(i3, this.f32221R ? this.f32217N.size() - 1 : this.f32217N.size()));
        }
    }
}
