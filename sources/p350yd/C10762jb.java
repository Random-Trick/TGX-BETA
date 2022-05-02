package p350yd;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.os.Build;
import be.C1379j0;
import ge.C4862d;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import p181mb.C6813d;
import p193nb.C7316a;
import p213p0.C7976k;

public class C10762jb implements Iterable<C10711hb> {
    public final AbstractC10975rb f34434M;
    public final ArrayList<C10609db> f34435N = new ArrayList<>();
    public final Map<Integer, C10711hb> f34436O = new HashMap();
    public boolean f34437P;
    public final C10827lb f34438a;
    public final C10930q6 f34439b;
    public final int f34440c;

    public C10762jb(C10827lb lbVar, C10930q6 q6Var) {
        this.f34438a = lbVar;
        this.f34439b = q6Var;
        this.f34440c = C10827lb.m3220G(q6Var);
        this.f34434M = new C10954qb(this, q6Var);
    }

    public static boolean m3941J(C10711hb hbVar) {
        return !hbVar.isEmpty() && !hbVar.m4249B();
    }

    public static boolean m3918i(TdApi.NotificationGroupType notificationGroupType) {
        int constructor = notificationGroupType.getConstructor();
        return constructor == -2050324051 || constructor == -1702481123 || constructor == 1390759476;
    }

    public long m3950A(long j) {
        C10711hb hbVar = null;
        for (C10711hb hbVar2 : this.f34436O.values()) {
            if (hbVar2.m4220v() == j && (hbVar == null || hbVar.m4224r() > hbVar2.m4224r())) {
                hbVar = hbVar2;
            }
        }
        if (hbVar != null) {
            return hbVar.m4225m();
        }
        return 0L;
    }

    public int m3949B(int i) {
        return this.f34440c + i;
    }

    public int m3948C(int i) {
        return this.f34440c + 5 + i;
    }

    public List<C10609db> m3947D(int i) {
        ArrayList arrayList = new ArrayList(this.f34435N.size());
        Iterator<C10609db> it = this.f34435N.iterator();
        while (it.hasNext()) {
            C10609db next = it.next();
            C10711hb o = next.m4457o();
            if (o.m4238M(i) && !o.m4249B() && !next.m4454r()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public boolean m3946E(int i) {
        Iterator<C10711hb> it = iterator();
        while (it.hasNext()) {
            if (it.next().m4238M(i)) {
                return true;
            }
        }
        return false;
    }

    public final void m3945F(C10711hb hbVar) {
        this.f34434M.mo2040c(C1379j0.m37318n(), this, this.f34439b.m2428h6(), m3917m(), hbVar);
        this.f34439b.m2930B4().m4738V2(this.f34439b.m2188w6(), !isEmpty());
    }

    public final void m3944G(C7976k kVar, int i, boolean z, C10666fb fbVar) {
        kVar.m13879b(i);
    }

    public final int m3943H(int i) {
        Iterator<C10609db> it = this.f34435N.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().m4462j() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean m3942I(int i) {
        try {
            return !this.f34436O.containsKey(Integer.valueOf(i));
        } catch (Throwable unused) {
            return true;
        }
    }

    public List<C10609db> m3940K(int i, boolean z) {
        ArrayList arrayList = null;
        if (z) {
            Iterator<C10711hb> it = iterator();
            while (it.hasNext()) {
                C10711hb next = it.next();
                if (next.m4238M(i)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(this.f34436O.size());
                    }
                    arrayList.add(next.m4241J());
                }
            }
        } else if (!this.f34436O.isEmpty()) {
            arrayList = new ArrayList(this.f34436O.size());
            for (C10711hb hbVar : this.f34436O.values()) {
                if (hbVar.m4238M(i)) {
                    arrayList.add(hbVar.m4241J());
                }
            }
        }
        if (arrayList != null) {
            Collections.sort(arrayList);
            arrayList.trimToSize();
        }
        return arrayList;
    }

    public C7976k m3939L() {
        return C7976k.m13877d(C1379j0.m37312q());
    }

    public boolean m3938M(C10711hb hbVar) {
        return this.f34439b.m2440ga().m3098o1(hbVar.m4220v(), hbVar.m4247D());
    }

    public boolean m3937N(C10711hb hbVar, C10609db dbVar) {
        return dbVar != null && m3938M(hbVar) && dbVar.m4476B();
    }

    public boolean m3936O(C10711hb hbVar) {
        return this.f34439b.m2440ga().m3141d1(hbVar.m4220v(), hbVar.m4247D());
    }

    public void m3935P(long j) {
        if (C7316a.m17051j(j)) {
            for (C10711hb hbVar : this.f34436O.values()) {
                if (hbVar.m4220v() == j) {
                    for (C10609db dbVar : hbVar.m4235P()) {
                        if (dbVar.m4453s()) {
                            this.f34439b.m2270r4().m14783o(new TdApi.RemoveNotification(hbVar.m4219w(), dbVar.m4462j()), this.f34439b.m2214uc());
                        }
                    }
                    return;
                }
            }
        }
    }

    public void m3934Q(boolean z) {
        boolean z2 = false;
        for (C10711hb hbVar : this.f34436O.values()) {
            if (hbVar.m4226i()) {
                z2 = true;
            }
        }
        if (z) {
            Iterator<C10711hb> it = iterator();
            while (it.hasNext()) {
                C10711hb next = it.next();
                next.m4240K(4);
                m3945F(next);
            }
            this.f34436O.clear();
            this.f34435N.clear();
        }
        this.f34439b.m2294pc().m4113k();
        if (!z && z2) {
            m3928W();
        }
    }

    public final void m3933R(C10711hb hbVar, boolean z, long j, C10609db dbVar) {
        if (z || !hbVar.m4249B()) {
            if (dbVar != null) {
                dbVar.m4477A(false);
            }
        } else if (dbVar != null) {
            dbVar.m4477A(true);
            if (dbVar.m4454r()) {
                return;
            }
        } else {
            return;
        }
        hbVar.m4239L();
        m3913u(hbVar, z, j);
    }

    public void m3932S(C10666fb fbVar) {
        C10711hb hbVar = this.f34436O.get(Integer.valueOf(fbVar.f34142f));
        if (hbVar != null) {
            hbVar.m4240K(0);
        } else {
            this.f34439b.m2294pc().m4102p0(fbVar.f34142f, fbVar.f34141e, 0);
        }
    }

    public void m3931T(int i) {
        Iterator<C10711hb> it = iterator();
        while (it.hasNext()) {
            C10711hb next = it.next();
            if (next.m4238M(i)) {
                next.m4240K(1);
            }
        }
    }

    public void m3930U(long j) {
        if (Build.VERSION.SDK_INT >= 26 && this.f34439b.m2440ga().m3136e2(j)) {
            m3928W();
        }
    }

    public void m3929V() {
    }

    public void m3928W() {
        m3926Y(null, 0L, 0);
    }

    public void m3927X(TdApi.NotificationSettingsScope notificationSettingsScope) {
        m3926Y(notificationSettingsScope, 0L, 0);
    }

    public final void m3926Y(TdApi.NotificationSettingsScope notificationSettingsScope, long j, int i) {
        boolean z = !isEmpty();
        if (z) {
            this.f34434M.mo2042a(C1379j0.m37318n(), this, this.f34439b.m2428h6(), m3917m(), notificationSettingsScope, j, i);
        }
        this.f34439b.m2930B4().m4738V2(this.f34439b.m2188w6(), z);
    }

    public void m3925Z(long j) {
        m3926Y(null, j, 0);
    }

    public void m3924a0(int i) {
        m3926Y(null, 0L, i);
    }

    public void m3923b0(C10666fb fbVar) {
        C10711hb y = m3909y(fbVar.f34142f);
        if (y == null || y.isEmpty()) {
            int C = m3948C(fbVar.f34142f);
            C7976k L = m3939L();
            m3944G(L, C, false, fbVar);
            if (!m3946E(fbVar.f34138b)) {
                m3944G(L, m3949B(fbVar.f34138b), true, fbVar);
                return;
            }
            return;
        }
        this.f34439b.m2270r4().m14783o(new TdApi.RemoveNotificationGroup(fbVar.f34142f, fbVar.f34141e), this.f34439b.m2214uc());
    }

    public void m3922c0(TdApi.UpdateActiveNotifications updateActiveNotifications) {
        TdApi.NotificationGroup[] notificationGroupArr;
        this.f34435N.clear();
        this.f34436O.clear();
        boolean z = false;
        for (TdApi.NotificationGroup notificationGroup : updateActiveNotifications.groups) {
            if (m3918i(notificationGroup.type)) {
                C10711hb hbVar = new C10711hb(this.f34439b, notificationGroup);
                if (!hbVar.isEmpty()) {
                    this.f34436O.put(Integer.valueOf(notificationGroup.f25411id), hbVar);
                    this.f34435N.addAll(hbVar.m4235P());
                    z = z || (!hbVar.isEmpty() && !hbVar.m4249B());
                }
            }
        }
        if (!this.f34435N.isEmpty()) {
            Collections.sort(this.f34435N);
            this.f34439b.m2930B4().m4738V2(this.f34439b.m2188w6(), true);
        }
        if (!z) {
            return;
        }
        if (!this.f34437P || C4868i.m24727c2().m24855K2(this.f34439b.m2188w6())) {
            this.f34437P = true;
            m3928W();
        }
    }

    public C10930q6 m3921d0() {
        return this.f34439b;
    }

    public void m3920e0(TdApi.UpdateNotificationGroup updateNotificationGroup) {
        boolean z;
        TdApi.User a4;
        if (m3918i(updateNotificationGroup.type)) {
            boolean z2 = updateNotificationGroup.isSilent;
            if (!z2) {
                long j = updateNotificationGroup.notificationSettingsChatId;
                if (j != 0 && C7316a.m17049l(j) && this.f34439b.m2294pc().m4134W() && (a4 = this.f34439b.m2541a4(updateNotificationGroup.notificationSettingsChatId)) != null && !a4.isContact) {
                    Log.m14721i(4, "Making notification from chatId=%d silent, because of user preferences for %d", Long.valueOf(updateNotificationGroup.chatId), Long.valueOf(updateNotificationGroup.notificationSettingsChatId));
                    z2 = true;
                }
            }
            C10711hb y = m3909y(updateNotificationGroup.notificationGroupId);
            if (y != null) {
                TdApi.Notification[] notificationArr = updateNotificationGroup.addedNotifications;
                ArrayList<C10609db> arrayList = null;
                ArrayList<C10609db> arrayList2 = (notificationArr == null || notificationArr.length <= 0) ? null : new ArrayList(updateNotificationGroup.addedNotifications.length);
                int[] iArr = updateNotificationGroup.removedNotificationIds;
                if (iArr != null && iArr.length > 0) {
                    arrayList = new ArrayList(updateNotificationGroup.removedNotificationIds.length);
                }
                int y2 = y.m4217y();
                int U = y.m4230U(updateNotificationGroup, arrayList2, arrayList);
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f34435N.removeAll(arrayList);
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    this.f34435N.addAll(arrayList2);
                    Collections.sort(this.f34435N);
                }
                if (U != 0) {
                    if (y.isEmpty() || this.f34439b.m2219u7()) {
                        this.f34436O.remove(Integer.valueOf(y.m4219w()));
                        m3945F(y);
                        return;
                    }
                    if (y2 == updateNotificationGroup.totalCount && z2) {
                        if (arrayList2 != null) {
                            z = false;
                            for (C10609db dbVar : arrayList2) {
                                if (!dbVar.m4454r()) {
                                    z = true;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (!z && arrayList != null) {
                            for (C10609db dbVar2 : arrayList) {
                                if (!dbVar2.m4454r()) {
                                    z = true;
                                }
                            }
                        }
                        if (!z) {
                            return;
                        }
                    }
                    if (!m3917m() && z2) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int[] iArr2 = updateNotificationGroup.removedNotificationIds;
                if (iArr2 != null && iArr2.length > 0) {
                    for (int i : iArr2) {
                        int H = m3943H(i);
                        if (H != -1) {
                            this.f34435N.remove(H);
                        }
                    }
                }
                TdApi.Notification[] notificationArr2 = updateNotificationGroup.addedNotifications;
                if (notificationArr2 != null && notificationArr2.length != 0 && !this.f34439b.m2219u7()) {
                    y = new C10711hb(this.f34439b, updateNotificationGroup);
                    if (!y.isEmpty()) {
                        this.f34436O.put(Integer.valueOf(updateNotificationGroup.notificationGroupId), y);
                        this.f34435N.addAll(y.m4235P());
                        Collections.sort(this.f34435N);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            m3933R(y, !z2 && this.f34438a.m3064x(updateNotificationGroup.chatId), updateNotificationGroup.notificationSettingsChatId, null);
        }
    }

    public boolean isEmpty() {
        if (Build.VERSION.SDK_INT >= 26 && this.f34439b.m2504ca(true) != 0) {
            try {
                C10639eb Z = this.f34439b.m2440ga().m3155Z();
                Iterator<C10711hb> it = iterator();
                while (it.hasNext()) {
                    if (Z.m4394j(it.next(), false) != null) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                Tracer.m14773g(th);
            }
        }
        return !iterator().hasNext();
    }

    @Override
    public Iterator<C10711hb> iterator() {
        return new C6813d(this.f34436O.values(), C10732ib.f34337a);
    }

    public boolean m3917m() {
        return !C4862d.m24935w().m24933y() || C4862d.m24935w().m24946l();
    }

    public int m3916r(int i) {
        HashSet hashSet = new HashSet(this.f34436O.size());
        for (C10711hb hbVar : this.f34436O.values()) {
            if (hbVar.m4238M(i)) {
                hashSet.add(Long.valueOf(hbVar.m4220v()));
            }
        }
        return hashSet.size();
    }

    public int m3915s(int i) {
        int i2 = 0;
        for (C10711hb hbVar : this.f34436O.values()) {
            if (hbVar.m4238M(i)) {
                i2 += hbVar.m4228W();
            }
        }
        return i2;
    }

    public C10827lb m3914t() {
        return this.f34438a;
    }

    public final void m3913u(C10711hb hbVar, boolean z, long j) {
        this.f34434M.mo2041b(C1379j0.m37318n(), this, this.f34439b.m2428h6(), m3917m(), hbVar, (!z || hbVar.m4249B()) ? null : new C10872nb(this.f34439b, j, hbVar));
        this.f34439b.m2930B4().m4738V2(this.f34439b.m2188w6(), true);
    }

    public void m3912v(TdApi.UpdateNotification updateNotification) {
        C10609db V;
        C10711hb y = m3909y(updateNotification.notificationGroupId);
        if (y != null && (V = y.m4229V(updateNotification.notification)) != null) {
            int H = m3943H(updateNotification.notification.f25410id);
            if (H != -1) {
                this.f34435N.set(H, V);
                m3933R(y, false, 0L, V);
                return;
            }
            throw new IllegalStateException("Notification not found in the global list");
        }
    }

    @TargetApi(26)
    public String m3911w(int i) {
        NotificationChannel notificationChannel;
        List<C10609db> K;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        C10639eb Z = this.f34439b.m2440ga().m3155Z();
        List<C10609db> K2 = m3940K(i, true);
        if (K2 == null || K2.isEmpty()) {
            notificationChannel = null;
        } else {
            notificationChannel = null;
            for (int size = K2.size() - 1; size >= 0; size--) {
                notificationChannel = (NotificationChannel) Z.m4394j(K2.get(size).m4457o(), false);
                if (notificationChannel != null) {
                    break;
                }
            }
        }
        if (notificationChannel == null && (K = m3940K(i, false)) != null && !K.isEmpty()) {
            for (int size2 = K.size() - 1; size2 >= 0; size2--) {
                notificationChannel = (NotificationChannel) Z.m4394j(K.get(size2).m4457o(), false);
                if (notificationChannel != null) {
                    break;
                }
            }
            if (notificationChannel == null) {
                notificationChannel = (NotificationChannel) Z.m4394j(K.get(K.size() - 1).m4457o(), true);
            }
        }
        if (notificationChannel != null) {
            return notificationChannel.getId();
        }
        return null;
    }

    public C10711hb m3910x(int i) {
        C10711hb hbVar = this.f34436O.get(Integer.valueOf(i));
        if (hbVar == null || hbVar.isEmpty() || hbVar.m4249B()) {
            return null;
        }
        return hbVar;
    }

    public final C10711hb m3909y(int i) {
        return this.f34436O.get(Integer.valueOf(i));
    }

    public long m3908z() {
        if (this.f34436O.isEmpty()) {
            return 0L;
        }
        long j = 0;
        for (C10711hb hbVar : this.f34436O.values()) {
            long v = hbVar.m4220v();
            if (j == 0) {
                j = v;
            } else if (j != v) {
                return 0L;
            }
        }
        return j;
    }
}
