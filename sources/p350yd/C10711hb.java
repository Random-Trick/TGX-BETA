package p350yd;

import ge.C4868i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p108hb.C5063c;
import p124ib.C5322e;
import p181mb.C6813d;
import p193nb.C7316a;

public class C10711hb implements Iterable<C10609db> {
    public final long f34264M;
    public int f34265N;
    public final ArrayList<C10609db> f34266O;
    public int f34267P;
    public int f34268Q;
    public final C10930q6 f34269a;
    public final int f34270b;
    public final TdApi.NotificationGroupType f34271c;

    public C10711hb(C10930q6 q6Var, TdApi.NotificationGroup notificationGroup) {
        this.f34269a = q6Var;
        this.f34270b = notificationGroup.f25408id;
        this.f34271c = notificationGroup.type;
        this.f34264M = notificationGroup.chatId;
        this.f34265N = notificationGroup.totalCount;
        this.f34266O = new ArrayList<>(notificationGroup.notifications.length);
        for (TdApi.Notification notification : notificationGroup.notifications) {
            this.f34266O.add(new C10609db(q6Var, notification, this));
        }
        Collections.sort(this.f34266O);
        m4233R();
    }

    public static boolean m4242I(C10609db dbVar) {
        return !dbVar.m4454r();
    }

    public final int m4250A(int i) {
        int binarySearch = Collections.binarySearch(this.f34266O, new C10609db(i));
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return -1;
    }

    public boolean m4249B() {
        return (this.f34268Q & 2) == 0 && m4248C(m4237N());
    }

    public boolean m4248C(int i) {
        int i2 = this.f34267P;
        return i2 != 0 && i2 >= i;
    }

    public boolean m4247D() {
        return this.f34271c.getConstructor() == -2050324051;
    }

    public boolean m4246E() {
        Iterator<C10609db> it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!it.next().m4446z()) {
                return false;
            }
            if (z) {
                z = false;
            }
        }
        return !z;
    }

    public boolean m4245F() {
        Iterator<C10609db> it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!it.next().m4452t()) {
                return false;
            }
            if (z) {
                z = false;
            }
        }
        return !z;
    }

    public boolean m4244G() {
        Iterator<C10609db> it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!it.next().m4450v()) {
                return false;
            }
            if (z) {
                z = false;
            }
        }
        return !z;
    }

    public boolean m4243H() {
        return this.f34269a.m2443g7(this.f34264M);
    }

    public C10609db m4241J() {
        ArrayList<C10609db> arrayList = this.f34266O;
        return arrayList.get(arrayList.size() - 1);
    }

    public void m4240K(int i) {
        int i2 = this.f34268Q & (-3);
        if (i == 1) {
            i2 |= 1;
        }
        int N = m4237N();
        m4232S(N, i2);
        if (i != 2 && m4236O()) {
            this.f34269a.m2270r4().m14783o(new TdApi.RemoveNotificationGroup(this.f34270b, N), this.f34269a.m2214uc());
        }
    }

    public void m4239L() {
        m4232S(this.f34267P, (this.f34268Q & (-2)) | 2);
    }

    public boolean m4238M(int i) {
        return i == 0 || m4221u() == i;
    }

    public int m4237N() {
        if (this.f34266O.isEmpty()) {
            return this.f34267P;
        }
        ArrayList<C10609db> arrayList = this.f34266O;
        return arrayList.get(arrayList.size() - 1).m4462j();
    }

    public boolean m4236O() {
        int i = 2;
        if (!m4247D()) {
            switch (C7316a.m17057d(m4220v())) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    if (this.f34269a.m2784K6(m4220v())) {
                        i = 4;
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
            return !C4868i.m24726c2().m24892F(i);
        }
        i = 1;
        return !C4868i.m24726c2().m24892F(i);
    }

    public List<C10609db> m4235P() {
        return this.f34266O;
    }

    public C10609db m4234Q(int i) {
        Iterator<C10609db> it = this.f34266O.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().m4462j() == i) {
                return this.f34266O.remove(i2);
            }
            i2++;
        }
        return null;
    }

    public final void m4233R() {
        long y = this.f34269a.m2294pc().m4085y(this.f34270b);
        this.f34267P = C5063c.m24133m(y);
        this.f34268Q = C5063c.m24132n(y);
    }

    public final void m4232S(int i, int i2) {
        if (this.f34267P != i || this.f34268Q != i2) {
            this.f34267P = i;
            this.f34268Q = i2;
            this.f34269a.m2294pc().m4102p0(this.f34270b, i, i2);
        }
    }

    public long m4231T() {
        Iterator<C10609db> it = iterator();
        C10609db dbVar = null;
        while (it.hasNext()) {
            C10609db next = it.next();
            if (dbVar != null && !dbVar.m4451u(next)) {
                return 0L;
            }
            dbVar = next;
        }
        if (dbVar != null) {
            return dbVar.m4467e();
        }
        return 0L;
    }

    public int m4230U(org.drinkless.p210td.libcore.telegram.TdApi.UpdateNotificationGroup r20, java.util.List<p350yd.C10609db> r21, java.util.List<p350yd.C10609db> r22) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10711hb.m4230U(org.drinkless.td.libcore.telegram.TdApi$UpdateNotificationGroup, java.util.List, java.util.List):int");
    }

    public C10609db m4229V(TdApi.Notification notification) {
        int A = m4250A(notification.f25407id);
        if (A < 0) {
            return null;
        }
        C10609db dbVar = new C10609db(this.f34269a, notification, this);
        this.f34266O.set(A, dbVar);
        return dbVar;
    }

    public int m4228W() {
        Iterator<C10609db> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i;
    }

    public boolean m4226i() {
        if (this.f34267P == 0 && this.f34268Q == 0) {
            return false;
        }
        this.f34267P = 0;
        this.f34268Q = 0;
        return true;
    }

    public boolean isEmpty() {
        return this.f34266O.isEmpty();
    }

    @Override
    public Iterator<C10609db> iterator() {
        return new C6813d(this.f34266O, C10690gb.f34214a);
    }

    public long m4225m() {
        if (!m4247D()) {
            return 0L;
        }
        Iterator<C10609db> it = iterator();
        while (it.hasNext()) {
            long d = it.next().m4468d();
            if (d != 0) {
                return d;
            }
        }
        return 0L;
    }

    public int m4224r() {
        if (!this.f34266O.isEmpty()) {
            return this.f34266O.get(0).m4462j();
        }
        return 0;
    }

    public long[] m4223s() {
        C5322e eVar = new C5322e(this.f34266O.size());
        Iterator<C10609db> it = iterator();
        while (it.hasNext()) {
            long d = it.next().m4468d();
            if (d != 0) {
                eVar.m23275a(d);
            }
        }
        return eVar.m23269g();
    }

    public long[] m4222t() {
        HashSet<Long> hashSet = new HashSet(this.f34266O.size());
        Iterator<C10609db> it = iterator();
        while (it.hasNext()) {
            long e = it.next().m4467e();
            if (C7316a.m17052i(e)) {
                hashSet.add(Long.valueOf(C7316a.m17044q(e)));
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        long[] jArr = new long[hashSet.size()];
        int i = 0;
        for (Long l : hashSet) {
            jArr[i] = l.longValue();
            i++;
        }
        return jArr;
    }

    public int m4221u() {
        if (!C4868i.m24726c2().m24770W2()) {
            return (!C7316a.m17051j(this.f34264M) || !C4868i.m24726c2().m24868I2()) ? 0 : 4;
        }
        switch (C7316a.m17057d(this.f34264M)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                if (m4247D()) {
                    return 1;
                }
                return this.f34269a.m2736N6(this.f34264M) ? 3 : 2;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                return 4;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return m4247D() ? 1 : 2;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return 1;
            default:
                throw new IllegalStateException("Unknown chatId: " + this.f34264M);
        }
    }

    public long m4220v() {
        return this.f34264M;
    }

    public int m4219w() {
        return this.f34270b;
    }

    public long m4218x() {
        return 0L;
    }

    public int m4217y() {
        return this.f34265N;
    }

    public final void m4216z(int i) {
        if (this.f34267P < i) {
            m4232S(i, this.f34268Q);
        }
    }

    public C10711hb(C10930q6 q6Var, TdApi.UpdateNotificationGroup updateNotificationGroup) {
        this.f34269a = q6Var;
        this.f34270b = updateNotificationGroup.notificationGroupId;
        this.f34271c = updateNotificationGroup.type;
        this.f34264M = updateNotificationGroup.chatId;
        this.f34265N = updateNotificationGroup.totalCount;
        TdApi.Notification[] notificationArr = updateNotificationGroup.addedNotifications;
        int length = notificationArr != null ? notificationArr.length : 0;
        this.f34266O = new ArrayList<>(length);
        if (length > 0) {
            for (TdApi.Notification notification : updateNotificationGroup.addedNotifications) {
                this.f34266O.add(new C10609db(q6Var, notification, this));
            }
        }
        Collections.sort(this.f34266O);
        m4233R();
    }
}
