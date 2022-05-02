package p291uc;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import gd.AbstractC4761s4;
import gd.C4714n5;
import gd.C4791t4;
import gd.C4792t5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.p211v.MessagesRecyclerView;
import p193nb.C7319d;
import p225pd.C8112b;
import td.AbstractC9323v4;

public class C9580j1 extends RecyclerView.AbstractC0890h<C9586k1> {
    public final Context f31084M;
    public final C9678w2 f31085N;
    public TdApi.ChatType f31086O;
    public ArrayList<AbstractC4761s4> f31087P;
    public final AbstractC9323v4<?> f31088Q;

    public C9580j1(Context context, C9678w2 w2Var, AbstractC9323v4<?> v4Var) {
        this.f31084M = context;
        this.f31085N = w2Var;
        this.f31088Q = v4Var;
    }

    public void m8126A0(TdApi.ChatType chatType) {
        this.f31086O = chatType;
    }

    public TdApi.Message m8125B0(long j, long j2) {
        TdApi.Message a4;
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null) {
            return null;
        }
        try {
            Iterator<AbstractC4761s4> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC4761s4 next = it.next();
                if (next.m26146K2() == j && (a4 = next.m25985a4(j2)) != null) {
                    return a4;
                }
            }
        } catch (Throwable th) {
            Log.m14720i("Error occured during message lookup", th, new Object[0]);
        }
        return null;
    }

    @Override
    public int mo6153D() {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null || arrayList.isEmpty()) {
            return 1;
        }
        return this.f31087P.size();
    }

    @Override
    public int mo6150F(int i) {
        int i2;
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        boolean z = false;
        if (arrayList != null && !arrayList.isEmpty() && i < this.f31087P.size() && i >= 0) {
            AbstractC4761s4 s4Var = this.f31087P.get(i);
            if (s4Var.mo25299k7() || (s4Var instanceof C4714n5) || ((s4Var instanceof C4792t5) && !((C4792t5) s4Var).m25344Ea())) {
                i2 = 3;
            } else {
                i2 = 1;
                if (s4Var.mo25870m7() || s4Var.mo25830q7()) {
                    z = true;
                }
                if (z) {
                    i2 = 2;
                }
            }
            return s4Var.mo25750y7() ? i2 + 10 : i2;
        } else if (this.f31087P == null || !this.f31085N.m7658o1()) {
            return 0;
        } else {
            return this.f31085N.m7615x3() ? 101 : 100;
        }
    }

    public boolean m8124a0(AbstractC4761s4 s4Var, boolean z, boolean z2) {
        ArrayList<AbstractC4761s4> arrayList;
        TdApi.Chat U2;
        ArrayList<AbstractC4761s4> arrayList2;
        ArrayList<AbstractC4761s4> arrayList3;
        int binarySearch;
        int i;
        if (this.f31085N.m7733Y1() && m8112n0(s4Var.m26116N3()) != -1) {
            return false;
        }
        AbstractC4761s4 s4Var2 = null;
        if (!this.f31085N.m7729Z1() || (arrayList3 = this.f31087P) == null || arrayList3.isEmpty() || (binarySearch = Collections.binarySearch(this.f31087P, s4Var)) >= 0) {
            AbstractC4761s4 j0 = z ? null : m8116j0(0);
            if (z) {
                s4Var2 = m8116j0(m8115k0() - 1);
            }
            int i2 = (j0 == null || !j0.mo25842p6()) ? 0 : 1;
            if (i2 != 0 && (arrayList2 = this.f31087P) != null) {
                Iterator<AbstractC4761s4> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC4761s4 next = it.next();
                    if (!next.mo25842p6()) {
                        j0 = next;
                        break;
                    }
                }
            }
            if (!z) {
                if (!s4Var.m25938f6()) {
                    s4Var.mo26061S6(true);
                }
                if ((!z2 || s4Var.m25938f6()) && !s4Var.m25929g6() && s4Var.m26221D0(false) && !m8113m0() && (U2 = s4Var.mo4348c().m2632U2(s4Var.m26146K2())) != null) {
                    s4Var.m25799t9(U2.unreadCount > 0);
                }
            } else if (s4Var2 != null) {
                s4Var2.m25992Z6(s4Var, m8115k0() == 1);
                s4Var2.m26224C8();
            }
            s4Var.m25992Z6(j0, !z || (arrayList = this.f31087P) == null || arrayList.isEmpty());
            if (j0 != null && m8119g0().mo25842p6() && !s4Var.mo25842p6()) {
                j0.m25859n9(false);
                j0.m25869m9(false);
                s4Var.m25859n9(true);
            }
            s4Var.m25800t8();
            if (this.f31087P == null) {
                this.f31087P = new ArrayList<>(15);
            }
            int size = this.f31087P.size();
            if (z) {
                this.f31087P.add(s4Var);
                if (size == 0) {
                    m39315I(0);
                } else {
                    m39314J(this.f31087P.size() - 1);
                    m39315I(this.f31087P.size() - 2);
                }
            } else {
                if (j0 != null) {
                    m39315I(i2);
                }
                this.f31087P.add(i2, s4Var);
                if (size == 0) {
                    m39315I(0);
                } else {
                    m39314J(i2);
                    m39312L(0, this.f31087P.size());
                }
            }
            return false;
        }
        int i3 = (-binarySearch) - 1;
        AbstractC4761s4 s4Var3 = i3 < this.f31087P.size() ? this.f31087P.get(i3) : null;
        if (i3 > 0 && i3 - 1 < this.f31087P.size()) {
            s4Var2 = this.f31087P.get(i);
        }
        s4Var.m25992Z6(s4Var3, i3 == 0);
        s4Var.m25800t8();
        if (s4Var3 != null) {
            m39315I(i3);
        }
        this.f31087P.add(i3, s4Var);
        m39314J(i3);
        if (s4Var2 != null) {
            int i4 = i3 - 1;
            s4Var2.m25992Z6(s4Var, i4 == 0);
            s4Var2.m26224C8();
            m39315I(i4);
        }
        if (!s4Var.m25882l6() || !s4Var.m25947e6() || i3 == 0) {
            return false;
        }
        this.f31085N.m7645r0().m32635Ok(s4Var.m26180G9());
        return true;
    }

    public void m8123c0(List<AbstractC4761s4> list, boolean z) {
        if (this.f31087P == null) {
            this.f31087P = new ArrayList<>(15);
        }
        int size = this.f31087P.size();
        if (size > 0 && !list.isEmpty() && this.f31085N.m7733Y1()) {
            if (list.size() <= size) {
                Iterator<AbstractC4761s4> it = this.f31087P.iterator();
                while (it.hasNext()) {
                    AbstractC4761s4 next = it.next();
                    int size2 = list.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        } else if (next.m26051T5(list.get(size2).m26116N3())) {
                            list.remove(size2);
                            if (size2 > 0) {
                                int i = size2 - 1;
                                list.get(i).m25992Z6(list.size() > size2 ? list.get(size2) : null, !z && i == 0);
                                list.get(i).m26224C8();
                            }
                        } else {
                            size2--;
                        }
                    }
                    if (list.isEmpty()) {
                        break;
                    }
                }
            } else {
                int size3 = list.size() - 1;
                while (size3 >= 0) {
                    if (m8112n0(list.get(size3).m26116N3()) != -1) {
                        list.remove(size3);
                        if (size3 > 0) {
                            int i2 = size3 - 1;
                            list.get(i2).m25992Z6(list.size() > size3 ? list.get(size3) : null, !z && i2 == 0);
                            list.get(i2).m26224C8();
                        }
                    }
                    size3--;
                }
            }
        }
        int size4 = list.size();
        int D = mo6153D();
        if (z) {
            if (size4 > 0 && size > 0) {
                int i3 = size - 1;
                AbstractC4761s4 s4Var = this.f31087P.get(i3);
                s4Var.m25992Z6(list.get(0), false);
                s4Var.m26224C8();
                m39315I(i3);
            }
            this.f31087P.addAll(list);
            if (size == 0) {
                C7389v0.m16615k2(this, D);
            } else {
                m39311M(size, list.size());
            }
        } else {
            if (!m8113m0()) {
                int size5 = list.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        break;
                    }
                    AbstractC4761s4 s4Var2 = list.get(size5);
                    if (s4Var2.m25929g6() || !s4Var2.m26221D0(false)) {
                        size5--;
                    } else {
                        TdApi.Chat U2 = s4Var2.mo4348c().m2632U2(s4Var2.m26146K2());
                        if (U2 != null) {
                            s4Var2.m25799t9(U2.unreadCount > 0);
                        }
                    }
                }
            }
            if (size4 > 0 && size > 0) {
                AbstractC4761s4 s4Var3 = list.get(size4 - 1);
                s4Var3.m25992Z6(this.f31087P.get(0), false);
                s4Var3.m26224C8();
                m39315I(0);
            }
            this.f31087P.addAll(0, list);
            if (size == 0) {
                C7389v0.m16615k2(this, D);
            } else {
                m39311M(0, list.size());
            }
        }
    }

    public void m8122d0(boolean z) {
        int D = mo6153D();
        if (z) {
            ArrayList<AbstractC4761s4> arrayList = this.f31087P;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC4761s4> it = this.f31087P.iterator();
                while (it.hasNext()) {
                    it.next().m26152J7();
                }
            }
            this.f31087P = null;
        } else {
            ArrayList<AbstractC4761s4> arrayList2 = this.f31087P;
            if (arrayList2 != null) {
                Iterator<AbstractC4761s4> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().m26152J7();
                }
                this.f31087P.clear();
            }
        }
        C7389v0.m16615k2(this, D);
    }

    public AbstractC4761s4 m8121e0(long j) {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null) {
            return null;
        }
        Iterator<AbstractC4761s4> it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC4761s4 next = it.next();
            if (next.m26116N3() == j) {
                return next;
            }
        }
        return null;
    }

    public int m8120f0(C8112b bVar) {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int X = bVar.m13523X();
        if (X != 0 && X != 1 && X != 2 && X != 7) {
            return -1;
        }
        int i = 0;
        Iterator<AbstractC4761s4> it = this.f31087P.iterator();
        while (it.hasNext()) {
            AbstractC4761s4 next = it.next();
            if (next.m26051T5(bVar.mo13512d()) || bVar.m13547L() == next) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public AbstractC4761s4 m8119g0() {
        return m8116j0(0);
    }

    public AbstractC4761s4 m8118h0(int i) {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null) {
            return null;
        }
        return arrayList.get(i);
    }

    public ArrayList<AbstractC4761s4> m8117i0() {
        return this.f31087P;
    }

    public AbstractC4761s4 m8116j0(int i) {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return this.f31087P.get(i);
    }

    public int m8115k0() {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public AbstractC4761s4 m8114l0() {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null) {
            return null;
        }
        try {
            return m8116j0(arrayList.size() - 1);
        } catch (IndexOutOfBoundsException unused) {
            return m8114l0();
        }
    }

    public boolean m8113m0() {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null) {
            return false;
        }
        Iterator<AbstractC4761s4> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().m25910i5()) {
                return true;
            }
        }
        return false;
    }

    public int m8112n0(long j) {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null) {
            return -1;
        }
        int i = 0;
        Iterator<AbstractC4761s4> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().m26051T5(j)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int m8111o0(C7319d dVar) {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null) {
            return -1;
        }
        int i = 0;
        Iterator<AbstractC4761s4> it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC4761s4 next = it.next();
            if (next.m26146K2() == dVar.m17027c() && next.m26041U5(dVar.m17026d(), dVar.m17025e())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void m8110p0() {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList != null) {
            Iterator<AbstractC4761s4> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m25792u5();
            }
        }
        MessagesRecyclerView rk = this.f31085N.m7645r0().m32256rk();
        if (rk != null) {
            rk.invalidate();
        }
    }

    public boolean m8109q0() {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        return arrayList == null || arrayList.size() == 0 || (this.f31087P.size() == 1 && (this.f31087P.get(0) instanceof C4791t4));
    }

    public void mo6146Q(C9586k1 k1Var, int i) {
        ArrayList<AbstractC4761s4> arrayList;
        int n = k1Var.m39335n();
        if (n == 0) {
            this.f31085N.m7768O2((TextView) k1Var.f3479a, this.f31087P != null);
        } else if (n != 100 && n != 101 && (arrayList = this.f31087P) != null) {
            AbstractC4761s4 s4Var = arrayList.get(i);
            TdApi.ChatType chatType = this.f31086O;
            if (chatType != null) {
                s4Var.mo26008Y(chatType);
            }
            k1Var.m8091U(s4Var);
        }
    }

    public C9586k1 mo6145S(ViewGroup viewGroup, int i) {
        return C9586k1.m8096P(this.f31084M, this.f31085N, i, this.f31088Q);
    }

    public void mo6144V(C9586k1 k1Var) {
        k1Var.m8097O();
    }

    public void mo6143W(C9586k1 k1Var) {
        k1Var.m8094R();
    }

    public AbstractC4761s4 m8104w0(int i) {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList == null) {
            return null;
        }
        AbstractC4761s4 remove = arrayList.remove(i);
        remove.m26152J7();
        m39309O(i);
        boolean z = false;
        if (this.f31087P.size() != 0) {
            AbstractC4761s4 j0 = m8116j0(i);
            int i2 = i - 1;
            AbstractC4761s4 j02 = m8116j0(i2);
            if (j02 != null) {
                if (i == 1) {
                    z = true;
                }
                j02.m25992Z6(j0, z);
                j02.m26224C8();
                m39315I(i2);
            } else if (j0 != null) {
                AbstractC4761s4 j03 = m8116j0(i + 1);
                if (i == 0) {
                    z = true;
                }
                j0.m25992Z6(j03, z);
                j0.m26224C8();
                m39315I(i);
            }
        } else {
            m39311M(0, mo6153D());
        }
        return remove;
    }

    public void m8103x0(int i, AbstractC4761s4 s4Var) {
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList != null) {
            arrayList.get(i).m26152J7();
            this.f31087P.set(i, s4Var);
            boolean z = false;
            int i2 = 1;
            boolean z2 = i > 0;
            if (z2) {
                AbstractC4761s4 s4Var2 = this.f31087P.get(i - 1);
                s4Var2.m25992Z6(s4Var, i == 1);
                s4Var2.m26224C8();
            }
            int i3 = i + 1;
            int i4 = 2;
            if (i3 < this.f31087P.size()) {
                AbstractC4761s4 s4Var3 = this.f31087P.get(i3);
                if (i == 0) {
                    z = true;
                }
                s4Var.m25992Z6(s4Var3, z);
                s4Var.m26224C8();
                if (z2) {
                    i--;
                }
                if (z2) {
                    i4 = 3;
                }
                m39312L(i, i4);
                return;
            }
            if (i == 0) {
                z = true;
            }
            s4Var.m25992Z6(null, z);
            s4Var.m26224C8();
            if (z2) {
                i--;
            }
            if (z2) {
                i2 = 2;
            }
            m39312L(i, i2);
        }
    }

    public void m8102y0(AbstractC4761s4 s4Var) {
        int D = mo6153D();
        ArrayList<AbstractC4761s4> arrayList = this.f31087P;
        if (arrayList != null) {
            Iterator<AbstractC4761s4> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m26152J7();
            }
            this.f31087P.clear();
        }
        if (s4Var != null) {
            if (this.f31087P == null) {
                this.f31087P = new ArrayList<>(15);
            }
            this.f31087P.add(s4Var);
            C7389v0.m16615k2(this, D);
        } else if (this.f31087P != null) {
            this.f31087P = null;
            C7389v0.m16615k2(this, D);
        }
    }

    public void m8101z0(ArrayList<AbstractC4761s4> arrayList) {
        int D = mo6153D();
        ArrayList<AbstractC4761s4> arrayList2 = this.f31087P;
        if (arrayList2 == null) {
            this.f31087P = new ArrayList<>(15);
        } else {
            arrayList2.clear();
        }
        this.f31087P.addAll(arrayList);
        C7389v0.m16615k2(this, D);
    }
}
