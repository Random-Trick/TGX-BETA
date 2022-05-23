package vc;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import hd.n5;
import hd.s4;
import hd.t4;
import hd.t5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ob.d;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.v.MessagesRecyclerView;
import qd.b;
import ud.v4;

public class i1 extends RecyclerView.h<j1> {
    public final Context M;
    public final v2 N;
    public TdApi.ChatType O;
    public ArrayList<s4> P;
    public final v4<?> Q;

    public i1(Context context, v2 v2Var, v4<?> v4Var) {
        this.M = context;
        this.N = v2Var;
        this.Q = v4Var;
    }

    @Override
    public int D() {
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null || arrayList.isEmpty()) {
            return 1;
        }
        return this.P.size();
    }

    @Override
    public int F(int i10) {
        int i11;
        ArrayList<s4> arrayList = this.P;
        boolean z10 = false;
        if (arrayList != null && !arrayList.isEmpty() && i10 < this.P.size() && i10 >= 0) {
            s4 s4Var = this.P.get(i10);
            if (s4Var.k7() || (s4Var instanceof n5) || ((s4Var instanceof t5) && !((t5) s4Var).Ea())) {
                i11 = 3;
            } else {
                i11 = 1;
                if (s4Var.m7() || s4Var.q7()) {
                    z10 = true;
                }
                if (z10) {
                    i11 = 2;
                }
            }
            return s4Var.y7() ? i11 + 10 : i11;
        } else if (this.P == null || !this.N.p1()) {
            return 0;
        } else {
            return this.N.x3() ? 101 : 100;
        }
    }

    public boolean a0(s4 s4Var, boolean z10, boolean z11) {
        ArrayList<s4> arrayList;
        TdApi.Chat W2;
        ArrayList<s4> arrayList2;
        ArrayList<s4> arrayList3;
        int binarySearch;
        int i10;
        if (this.N.Y1() && m0(s4Var.K3()) != -1) {
            return false;
        }
        s4 s4Var2 = null;
        if (!this.N.Z1() || (arrayList3 = this.P) == null || arrayList3.isEmpty() || (binarySearch = Collections.binarySearch(this.P, s4Var)) >= 0) {
            s4 i02 = z10 ? null : i0(0);
            if (z10) {
                s4Var2 = i0(j0() - 1);
            }
            int i11 = (i02 == null || !i02.o6()) ? 0 : 1;
            if (i11 != 0 && (arrayList2 = this.P) != null) {
                Iterator<s4> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    s4 next = it.next();
                    if (!next.o6()) {
                        i02 = next;
                        break;
                    }
                }
            }
            if (!z10) {
                if (!s4Var.e6()) {
                    s4Var.S6(true);
                }
                if ((!z11 || s4Var.e6()) && !s4Var.f6() && s4Var.E0(false) && !l0() && (W2 = s4Var.c().W2(s4Var.I2())) != null) {
                    s4Var.t9(W2.unreadCount > 0);
                }
            } else if (s4Var2 != null) {
                s4Var2.Z6(s4Var, j0() == 1);
                s4Var2.C8();
            }
            s4Var.Z6(i02, !z10 || (arrayList = this.P) == null || arrayList.isEmpty());
            if (i02 != null && f0().o6() && !s4Var.o6()) {
                i02.n9(false);
                i02.m9(false);
                s4Var.n9(true);
            }
            s4Var.t8();
            if (this.P == null) {
                this.P = new ArrayList<>(15);
            }
            int size = this.P.size();
            if (z10) {
                this.P.add(s4Var);
                if (size == 0) {
                    I(0);
                } else {
                    J(this.P.size() - 1);
                    I(this.P.size() - 2);
                }
            } else {
                if (i02 != null) {
                    I(i11);
                }
                this.P.add(i11, s4Var);
                if (size == 0) {
                    I(0);
                } else {
                    J(i11);
                    L(0, this.P.size());
                }
            }
            return false;
        }
        int i12 = (-binarySearch) - 1;
        s4 s4Var3 = i12 < this.P.size() ? this.P.get(i12) : null;
        if (i12 > 0 && i12 - 1 < this.P.size()) {
            s4Var2 = this.P.get(i10);
        }
        s4Var.Z6(s4Var3, i12 == 0);
        s4Var.t8();
        if (s4Var3 != null) {
            I(i12);
        }
        this.P.add(i12, s4Var);
        J(i12);
        if (s4Var2 != null) {
            int i13 = i12 - 1;
            s4Var2.Z6(s4Var, i13 == 0);
            s4Var2.C8();
            I(i13);
        }
        if (!s4Var.k6() || !s4Var.d6() || i12 == 0) {
            return false;
        }
        this.N.r0().Ok(s4Var.G9());
        return true;
    }

    public void b0(List<s4> list, boolean z10) {
        if (this.P == null) {
            this.P = new ArrayList<>(15);
        }
        int size = this.P.size();
        if (size > 0 && !list.isEmpty() && this.N.Y1()) {
            if (list.size() <= size) {
                Iterator<s4> it = this.P.iterator();
                while (it.hasNext()) {
                    s4 next = it.next();
                    int size2 = list.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        } else if (next.S5(list.get(size2).K3())) {
                            list.remove(size2);
                            if (size2 > 0) {
                                int i10 = size2 - 1;
                                list.get(i10).Z6(list.size() > size2 ? list.get(size2) : null, !z10 && i10 == 0);
                                list.get(i10).C8();
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
                    if (m0(list.get(size3).K3()) != -1) {
                        list.remove(size3);
                        if (size3 > 0) {
                            int i11 = size3 - 1;
                            list.get(i11).Z6(list.size() > size3 ? list.get(size3) : null, !z10 && i11 == 0);
                            list.get(i11).C8();
                        }
                    }
                    size3--;
                }
            }
        }
        int size4 = list.size();
        int D = D();
        if (z10) {
            if (size4 > 0 && size > 0) {
                int i12 = size - 1;
                s4 s4Var = this.P.get(i12);
                s4Var.Z6(list.get(0), false);
                s4Var.C8();
                I(i12);
            }
            this.P.addAll(list);
            if (size == 0) {
                v0.k2(this, D);
            } else {
                M(size, list.size());
            }
        } else {
            if (!l0()) {
                int size5 = list.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        break;
                    }
                    s4 s4Var2 = list.get(size5);
                    if (s4Var2.f6() || !s4Var2.E0(false)) {
                        size5--;
                    } else {
                        TdApi.Chat W2 = s4Var2.c().W2(s4Var2.I2());
                        if (W2 != null) {
                            s4Var2.t9(W2.unreadCount > 0);
                        }
                    }
                }
            }
            if (size4 > 0 && size > 0) {
                s4 s4Var3 = list.get(size4 - 1);
                s4Var3.Z6(this.P.get(0), false);
                s4Var3.C8();
                I(0);
            }
            this.P.addAll(0, list);
            if (size == 0) {
                v0.k2(this, D);
            } else {
                M(0, list.size());
            }
        }
    }

    public void c0(boolean z10) {
        int D = D();
        if (z10) {
            ArrayList<s4> arrayList = this.P;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<s4> it = this.P.iterator();
                while (it.hasNext()) {
                    it.next().J7();
                }
            }
            this.P = null;
        } else {
            ArrayList<s4> arrayList2 = this.P;
            if (arrayList2 != null) {
                Iterator<s4> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().J7();
                }
                this.P.clear();
            }
        }
        v0.k2(this, D);
    }

    public s4 d0(long j10) {
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null) {
            return null;
        }
        Iterator<s4> it = arrayList.iterator();
        while (it.hasNext()) {
            s4 next = it.next();
            if (next.K3() == j10) {
                return next;
            }
        }
        return null;
    }

    public int e0(b bVar) {
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int X = bVar.X();
        if (X != 0 && X != 1 && X != 2 && X != 7) {
            return -1;
        }
        int i10 = 0;
        Iterator<s4> it = this.P.iterator();
        while (it.hasNext()) {
            s4 next = it.next();
            if (next.S5(bVar.d()) || bVar.L() == next) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public s4 f0() {
        return i0(0);
    }

    public s4 g0(int i10) {
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null) {
            return null;
        }
        return arrayList.get(i10);
    }

    public ArrayList<s4> h0() {
        return this.P;
    }

    public s4 i0(int i10) {
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return this.P.get(i10);
    }

    public int j0() {
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public s4 k0() {
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null) {
            return null;
        }
        try {
            return i0(arrayList.size() - 1);
        } catch (IndexOutOfBoundsException unused) {
            return k0();
        }
    }

    public boolean l0() {
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null) {
            return false;
        }
        Iterator<s4> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().h5()) {
                return true;
            }
        }
        return false;
    }

    public int m0(long j10) {
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null) {
            return -1;
        }
        int i10 = 0;
        Iterator<s4> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().S5(j10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public int n0(d dVar) {
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null) {
            return -1;
        }
        int i10 = 0;
        Iterator<s4> it = arrayList.iterator();
        while (it.hasNext()) {
            s4 next = it.next();
            if (next.I2() == dVar.c() && next.T5(dVar.d(), dVar.e())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void o0() {
        ArrayList<s4> arrayList = this.P;
        if (arrayList != null) {
            Iterator<s4> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().u5();
            }
        }
        MessagesRecyclerView rk = this.N.r0().rk();
        if (rk != null) {
            rk.invalidate();
        }
    }

    public boolean p0() {
        ArrayList<s4> arrayList = this.P;
        return arrayList == null || arrayList.size() == 0 || (this.P.size() == 1 && (this.P.get(0) instanceof t4));
    }

    public void Q(j1 j1Var, int i10) {
        ArrayList<s4> arrayList;
        int n10 = j1Var.n();
        if (n10 == 0) {
            this.N.O2((TextView) j1Var.f2982a, this.P != null);
        } else if (n10 != 100 && n10 != 101 && (arrayList = this.P) != null) {
            s4 s4Var = arrayList.get(i10);
            TdApi.ChatType chatType = this.O;
            if (chatType != null) {
                s4Var.Z(chatType);
            }
            j1Var.U(s4Var);
        }
    }

    public j1 S(ViewGroup viewGroup, int i10) {
        return j1.P(this.M, this.N, i10, this.Q);
    }

    public void V(j1 j1Var) {
        j1Var.O();
    }

    public void W(j1 j1Var) {
        j1Var.R();
    }

    public s4 u0(int i10) {
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null) {
            return null;
        }
        s4 remove = arrayList.remove(i10);
        remove.J7();
        O(i10);
        boolean z10 = false;
        if (this.P.size() != 0) {
            s4 i02 = i0(i10);
            int i11 = i10 - 1;
            s4 i03 = i0(i11);
            if (i03 != null) {
                if (i10 == 1) {
                    z10 = true;
                }
                i03.Z6(i02, z10);
                i03.C8();
                I(i11);
            } else if (i02 != null) {
                s4 i04 = i0(i10 + 1);
                if (i10 == 0) {
                    z10 = true;
                }
                i02.Z6(i04, z10);
                i02.C8();
                I(i10);
            }
        } else {
            M(0, D());
        }
        return remove;
    }

    public void v0(int i10, s4 s4Var) {
        ArrayList<s4> arrayList = this.P;
        if (arrayList != null) {
            arrayList.get(i10).J7();
            this.P.set(i10, s4Var);
            boolean z10 = false;
            int i11 = 1;
            boolean z11 = i10 > 0;
            if (z11) {
                s4 s4Var2 = this.P.get(i10 - 1);
                s4Var2.Z6(s4Var, i10 == 1);
                s4Var2.C8();
            }
            int i12 = i10 + 1;
            int i13 = 2;
            if (i12 < this.P.size()) {
                s4 s4Var3 = this.P.get(i12);
                if (i10 == 0) {
                    z10 = true;
                }
                s4Var.Z6(s4Var3, z10);
                s4Var.C8();
                if (z11) {
                    i10--;
                }
                if (z11) {
                    i13 = 3;
                }
                L(i10, i13);
                return;
            }
            if (i10 == 0) {
                z10 = true;
            }
            s4Var.Z6(null, z10);
            s4Var.C8();
            if (z11) {
                i10--;
            }
            if (z11) {
                i11 = 2;
            }
            L(i10, i11);
        }
    }

    public void w0(s4 s4Var) {
        int D = D();
        ArrayList<s4> arrayList = this.P;
        if (arrayList != null) {
            Iterator<s4> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().J7();
            }
            this.P.clear();
        }
        if (s4Var != null) {
            if (this.P == null) {
                this.P = new ArrayList<>(15);
            }
            this.P.add(s4Var);
            v0.k2(this, D);
        } else if (this.P != null) {
            this.P = null;
            v0.k2(this, D);
        }
    }

    public void x0(ArrayList<s4> arrayList) {
        int D = D();
        ArrayList<s4> arrayList2 = this.P;
        if (arrayList2 == null) {
            this.P = new ArrayList<>(15);
        } else {
            arrayList2.clear();
        }
        this.P.addAll(arrayList);
        v0.k2(this, D);
    }

    public void y0(TdApi.ChatType chatType) {
        this.O = chatType;
    }

    public TdApi.Message z0(long j10, long j11) {
        TdApi.Message Y3;
        ArrayList<s4> arrayList = this.P;
        if (arrayList == null) {
            return null;
        }
        try {
            Iterator<s4> it = arrayList.iterator();
            while (it.hasNext()) {
                s4 next = it.next();
                if (next.I2() == j10 && (Y3 = next.Y3(j11)) != null) {
                    return Y3;
                }
            }
        } catch (Throwable th) {
            Log.i("Error occured during message lookup", th, new Object[0]);
        }
        return null;
    }
}
