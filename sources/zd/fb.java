package zd;

import he.i;
import ib.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jb.e;
import nb.d;
import ob.a;
import org.drinkless.td.libcore.telegram.TdApi;

public class fb implements Iterable<bb> {
    public final long M;
    public int N;
    public final ArrayList<bb> O;
    public int P;
    public int Q;
    public final o6 f27509a;
    public final int f27510b;
    public final TdApi.NotificationGroupType f27511c;

    public fb(o6 o6Var, TdApi.NotificationGroup notificationGroup) {
        this.f27509a = o6Var;
        this.f27510b = notificationGroup.f19948id;
        this.f27511c = notificationGroup.type;
        this.M = notificationGroup.chatId;
        this.N = notificationGroup.totalCount;
        this.O = new ArrayList<>(notificationGroup.notifications.length);
        for (TdApi.Notification notification : notificationGroup.notifications) {
            this.O.add(new bb(o6Var, notification, this));
        }
        Collections.sort(this.O);
        R();
    }

    public static boolean I(bb bbVar) {
        return !bbVar.r();
    }

    public final int A(int i10) {
        int binarySearch = Collections.binarySearch(this.O, new bb(i10));
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return -1;
    }

    public boolean B() {
        return (this.Q & 2) == 0 && C(N());
    }

    public boolean C(int i10) {
        int i11 = this.P;
        return i11 != 0 && i11 >= i10;
    }

    public boolean D() {
        return this.f27511c.getConstructor() == -2050324051;
    }

    public boolean E() {
        Iterator<bb> it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!it.next().z()) {
                return false;
            }
            if (z10) {
                z10 = false;
            }
        }
        return !z10;
    }

    public boolean F() {
        Iterator<bb> it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!it.next().t()) {
                return false;
            }
            if (z10) {
                z10 = false;
            }
        }
        return !z10;
    }

    public boolean G() {
        Iterator<bb> it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!it.next().v()) {
                return false;
            }
            if (z10) {
                z10 = false;
            }
        }
        return !z10;
    }

    public boolean H() {
        return this.f27509a.k7(this.M);
    }

    public bb J() {
        ArrayList<bb> arrayList = this.O;
        return arrayList.get(arrayList.size() - 1);
    }

    public void K(int i10) {
        int i11 = this.Q & (-3);
        if (i10 == 1) {
            i11 |= 1;
        }
        int N = N();
        S(N, i11);
        if (i10 != 2 && O()) {
            this.f27509a.v4().o(new TdApi.RemoveNotificationGroup(this.f27510b, N), this.f27509a.yc());
        }
    }

    public void L() {
        S(this.P, (this.Q & (-2)) | 2);
    }

    public boolean M(int i10) {
        return i10 == 0 || u() == i10;
    }

    public int N() {
        if (this.O.isEmpty()) {
            return this.P;
        }
        ArrayList<bb> arrayList = this.O;
        return arrayList.get(arrayList.size() - 1).j();
    }

    public boolean O() {
        int i10 = 2;
        if (!D()) {
            switch (a.d(v())) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    if (this.f27509a.O6(v())) {
                        i10 = 4;
                        break;
                    }
                    break;
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    break;
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    break;
                default:
                    return true;
            }
            return !i.c2().F(i10);
        }
        i10 = 1;
        return !i.c2().F(i10);
    }

    public List<bb> P() {
        return this.O;
    }

    public bb Q(int i10) {
        Iterator<bb> it = this.O.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().j() == i10) {
                return this.O.remove(i11);
            }
            i11++;
        }
        return null;
    }

    public final void R() {
        long y10 = this.f27509a.tc().y(this.f27510b);
        this.P = c.m(y10);
        this.Q = c.n(y10);
    }

    public final void S(int i10, int i11) {
        if (this.P != i10 || this.Q != i11) {
            this.P = i10;
            this.Q = i11;
            this.f27509a.tc().p0(this.f27510b, i10, i11);
        }
    }

    public long T() {
        Iterator<bb> it = iterator();
        bb bbVar = null;
        while (it.hasNext()) {
            bb next = it.next();
            if (bbVar != null && !bbVar.u(next)) {
                return 0L;
            }
            bbVar = next;
        }
        if (bbVar != null) {
            return bbVar.e();
        }
        return 0L;
    }

    public int U(org.drinkless.td.libcore.telegram.TdApi.UpdateNotificationGroup r20, java.util.List<zd.bb> r21, java.util.List<zd.bb> r22) {
        throw new UnsupportedOperationException("Method not decompiled: zd.fb.U(org.drinkless.td.libcore.telegram.TdApi$UpdateNotificationGroup, java.util.List, java.util.List):int");
    }

    public bb V(TdApi.Notification notification) {
        int A = A(notification.f19947id);
        if (A < 0) {
            return null;
        }
        bb bbVar = new bb(this.f27509a, notification, this);
        this.O.set(A, bbVar);
        return bbVar;
    }

    public int W() {
        Iterator<bb> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
        }
        return i10;
    }

    public boolean g() {
        if (this.P == 0 && this.Q == 0) {
            return false;
        }
        this.P = 0;
        this.Q = 0;
        return true;
    }

    public boolean isEmpty() {
        return this.O.isEmpty();
    }

    @Override
    public Iterator<bb> iterator() {
        return new d(this.O, eb.f27466a);
    }

    public long m() {
        if (!D()) {
            return 0L;
        }
        Iterator<bb> it = iterator();
        while (it.hasNext()) {
            long d10 = it.next().d();
            if (d10 != 0) {
                return d10;
            }
        }
        return 0L;
    }

    public int r() {
        if (!this.O.isEmpty()) {
            return this.O.get(0).j();
        }
        return 0;
    }

    public long[] s() {
        e eVar = new e(this.O.size());
        Iterator<bb> it = iterator();
        while (it.hasNext()) {
            long d10 = it.next().d();
            if (d10 != 0) {
                eVar.a(d10);
            }
        }
        return eVar.g();
    }

    public long[] t() {
        HashSet<Long> hashSet = new HashSet(this.O.size());
        Iterator<bb> it = iterator();
        while (it.hasNext()) {
            long e10 = it.next().e();
            if (a.i(e10)) {
                hashSet.add(Long.valueOf(a.q(e10)));
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        long[] jArr = new long[hashSet.size()];
        int i10 = 0;
        for (Long l10 : hashSet) {
            jArr[i10] = l10.longValue();
            i10++;
        }
        return jArr;
    }

    public int u() {
        if (!i.c2().W2()) {
            return (!a.j(this.M) || !i.c2().I2()) ? 0 : 4;
        }
        switch (a.d(this.M)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                if (D()) {
                    return 1;
                }
                return this.f27509a.R6(this.M) ? 3 : 2;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                return 4;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return D() ? 1 : 2;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return 1;
            default:
                throw new IllegalStateException("Unknown chatId: " + this.M);
        }
    }

    public long v() {
        return this.M;
    }

    public int w() {
        return this.f27510b;
    }

    public long x() {
        return 0L;
    }

    public int y() {
        return this.N;
    }

    public final void z(int i10) {
        if (this.P < i10) {
            S(i10, this.Q);
        }
    }

    public fb(o6 o6Var, TdApi.UpdateNotificationGroup updateNotificationGroup) {
        this.f27509a = o6Var;
        this.f27510b = updateNotificationGroup.notificationGroupId;
        this.f27511c = updateNotificationGroup.type;
        this.M = updateNotificationGroup.chatId;
        this.N = updateNotificationGroup.totalCount;
        TdApi.Notification[] notificationArr = updateNotificationGroup.addedNotifications;
        int length = notificationArr != null ? notificationArr.length : 0;
        this.O = new ArrayList<>(length);
        if (length > 0) {
            for (TdApi.Notification notification : updateNotificationGroup.addedNotifications) {
                this.O.add(new bb(o6Var, notification, this));
            }
        }
        Collections.sort(this.O);
        R();
    }
}
