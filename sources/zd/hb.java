package zd;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.os.Build;
import ce.j0;
import he.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nb.d;
import ob.a;
import org.drinkless.td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import p0.k;

public class hb implements Iterable<fb> {
    public final pb M;
    public final ArrayList<bb> N = new ArrayList<>();
    public final Map<Integer, fb> O = new HashMap();
    public boolean P;
    public final jb f27624a;
    public final o6 f27625b;
    public final int f27626c;

    public hb(jb jbVar, o6 o6Var) {
        this.f27624a = jbVar;
        this.f27625b = o6Var;
        this.f27626c = jb.G(o6Var);
        this.M = new ob(this, o6Var);
    }

    public static boolean J(fb fbVar) {
        return !fbVar.isEmpty() && !fbVar.B();
    }

    public static boolean g(TdApi.NotificationGroupType notificationGroupType) {
        int constructor = notificationGroupType.getConstructor();
        return constructor == -2050324051 || constructor == -1702481123 || constructor == 1390759476;
    }

    public long A(long j10) {
        fb fbVar = null;
        for (fb fbVar2 : this.O.values()) {
            if (fbVar2.v() == j10 && (fbVar == null || fbVar.r() > fbVar2.r())) {
                fbVar = fbVar2;
            }
        }
        if (fbVar != null) {
            return fbVar.m();
        }
        return 0L;
    }

    public int B(int i10) {
        return this.f27626c + i10;
    }

    public int C(int i10) {
        return this.f27626c + 5 + i10;
    }

    public List<bb> D(int i10) {
        ArrayList arrayList = new ArrayList(this.N.size());
        Iterator<bb> it = this.N.iterator();
        while (it.hasNext()) {
            bb next = it.next();
            fb o10 = next.o();
            if (o10.M(i10) && !o10.B() && !next.r()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public boolean E(int i10) {
        Iterator<fb> it = iterator();
        while (it.hasNext()) {
            if (it.next().M(i10)) {
                return true;
            }
        }
        return false;
    }

    public final void F(fb fbVar) {
        this.M.c(j0.n(), this, this.f27625b.m6(), m(), fbVar);
        this.f27625b.F4().V2(this.f27625b.A6(), !isEmpty());
    }

    public final void G(k kVar, int i10, boolean z10, db dbVar) {
        kVar.b(i10);
    }

    public final int H(int i10) {
        Iterator<bb> it = this.N.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().j() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public boolean I(int i10) {
        try {
            return !this.O.containsKey(Integer.valueOf(i10));
        } catch (Throwable unused) {
            return true;
        }
    }

    public List<bb> K(int i10, boolean z10) {
        ArrayList arrayList = null;
        if (z10) {
            Iterator<fb> it = iterator();
            while (it.hasNext()) {
                fb next = it.next();
                if (next.M(i10)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(this.O.size());
                    }
                    arrayList.add(next.J());
                }
            }
        } else if (!this.O.isEmpty()) {
            arrayList = new ArrayList(this.O.size());
            for (fb fbVar : this.O.values()) {
                if (fbVar.M(i10)) {
                    arrayList.add(fbVar.J());
                }
            }
        }
        if (arrayList != null) {
            Collections.sort(arrayList);
            arrayList.trimToSize();
        }
        return arrayList;
    }

    public k L() {
        return k.d(j0.q());
    }

    public boolean M(fb fbVar) {
        return this.f27625b.ka().o1(fbVar.v(), fbVar.D());
    }

    public boolean N(fb fbVar, bb bbVar) {
        return bbVar != null && M(fbVar) && bbVar.B();
    }

    public boolean O(fb fbVar) {
        return this.f27625b.ka().d1(fbVar.v(), fbVar.D());
    }

    public void P(long j10) {
        if (a.j(j10)) {
            for (fb fbVar : this.O.values()) {
                if (fbVar.v() == j10) {
                    for (bb bbVar : fbVar.P()) {
                        if (bbVar.s()) {
                            this.f27625b.v4().o(new TdApi.RemoveNotification(fbVar.w(), bbVar.j()), this.f27625b.yc());
                        }
                    }
                    return;
                }
            }
        }
    }

    public void Q(boolean z10) {
        boolean z11 = false;
        for (fb fbVar : this.O.values()) {
            if (fbVar.g()) {
                z11 = true;
            }
        }
        if (z10) {
            Iterator<fb> it = iterator();
            while (it.hasNext()) {
                fb next = it.next();
                next.K(4);
                F(next);
            }
            this.O.clear();
            this.N.clear();
        }
        this.f27625b.tc().k();
        if (!z10 && z11) {
            W();
        }
    }

    public final void R(fb fbVar, boolean z10, long j10, bb bbVar) {
        if (z10 || !fbVar.B()) {
            if (bbVar != null) {
                bbVar.A(false);
            }
        } else if (bbVar != null) {
            bbVar.A(true);
            if (bbVar.r()) {
                return;
            }
        } else {
            return;
        }
        fbVar.L();
        u(fbVar, z10, j10);
    }

    public void S(db dbVar) {
        fb fbVar = this.O.get(Integer.valueOf(dbVar.f27399f));
        if (fbVar != null) {
            fbVar.K(0);
        } else {
            this.f27625b.tc().p0(dbVar.f27399f, dbVar.f27398e, 0);
        }
    }

    public void T(int i10) {
        Iterator<fb> it = iterator();
        while (it.hasNext()) {
            fb next = it.next();
            if (next.M(i10)) {
                next.K(1);
            }
        }
    }

    public void U(long j10) {
        if (Build.VERSION.SDK_INT >= 26 && this.f27625b.ka().e2(j10)) {
            W();
        }
    }

    public void V() {
    }

    public void W() {
        Y(null, 0L, 0);
    }

    public void X(TdApi.NotificationSettingsScope notificationSettingsScope) {
        Y(notificationSettingsScope, 0L, 0);
    }

    public final void Y(TdApi.NotificationSettingsScope notificationSettingsScope, long j10, int i10) {
        boolean z10 = !isEmpty();
        if (z10) {
            this.M.a(j0.n(), this, this.f27625b.m6(), m(), notificationSettingsScope, j10, i10);
        }
        this.f27625b.F4().V2(this.f27625b.A6(), z10);
    }

    public void Z(long j10) {
        Y(null, j10, 0);
    }

    public void a0(int i10) {
        Y(null, 0L, i10);
    }

    public void b0(db dbVar) {
        fb y10 = y(dbVar.f27399f);
        if (y10 == null || y10.isEmpty()) {
            int C = C(dbVar.f27399f);
            k L = L();
            G(L, C, false, dbVar);
            if (!E(dbVar.f27395b)) {
                G(L, B(dbVar.f27395b), true, dbVar);
                return;
            }
            return;
        }
        this.f27625b.v4().o(new TdApi.RemoveNotificationGroup(dbVar.f27399f, dbVar.f27398e), this.f27625b.yc());
    }

    public void c0(TdApi.UpdateActiveNotifications updateActiveNotifications) {
        TdApi.NotificationGroup[] notificationGroupArr;
        this.N.clear();
        this.O.clear();
        boolean z10 = false;
        for (TdApi.NotificationGroup notificationGroup : updateActiveNotifications.groups) {
            if (g(notificationGroup.type)) {
                fb fbVar = new fb(this.f27625b, notificationGroup);
                if (!fbVar.isEmpty()) {
                    this.O.put(Integer.valueOf(notificationGroup.f19948id), fbVar);
                    this.N.addAll(fbVar.P());
                    z10 = z10 || (!fbVar.isEmpty() && !fbVar.B());
                }
            }
        }
        if (!this.N.isEmpty()) {
            Collections.sort(this.N);
            this.f27625b.F4().V2(this.f27625b.A6(), true);
        }
        if (!z10) {
            return;
        }
        if (!this.P || i.c2().K2(this.f27625b.A6())) {
            this.P = true;
            W();
        }
    }

    public o6 d0() {
        return this.f27625b;
    }

    public void e0(TdApi.UpdateNotificationGroup updateNotificationGroup) {
        boolean z10;
        TdApi.User e42;
        if (g(updateNotificationGroup.type)) {
            boolean z11 = updateNotificationGroup.notificationSoundId == 0;
            if (!z11) {
                long j10 = updateNotificationGroup.notificationSettingsChatId;
                if (j10 != 0 && a.l(j10) && this.f27625b.tc().W() && (e42 = this.f27625b.e4(updateNotificationGroup.notificationSettingsChatId)) != null && !e42.isContact) {
                    Log.i(4, "Making notification from chatId=%d silent, because of user preferences for %d", Long.valueOf(updateNotificationGroup.chatId), Long.valueOf(updateNotificationGroup.notificationSettingsChatId));
                    z11 = true;
                }
            }
            fb y10 = y(updateNotificationGroup.notificationGroupId);
            if (y10 != null) {
                TdApi.Notification[] notificationArr = updateNotificationGroup.addedNotifications;
                ArrayList<bb> arrayList = null;
                ArrayList<bb> arrayList2 = (notificationArr == null || notificationArr.length <= 0) ? null : new ArrayList(updateNotificationGroup.addedNotifications.length);
                int[] iArr = updateNotificationGroup.removedNotificationIds;
                if (iArr != null && iArr.length > 0) {
                    arrayList = new ArrayList(updateNotificationGroup.removedNotificationIds.length);
                }
                int y11 = y10.y();
                int U = y10.U(updateNotificationGroup, arrayList2, arrayList);
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.N.removeAll(arrayList);
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    this.N.addAll(arrayList2);
                    Collections.sort(this.N);
                }
                if (U != 0) {
                    if (y10.isEmpty() || this.f27625b.y7()) {
                        this.O.remove(Integer.valueOf(y10.w()));
                        F(y10);
                        return;
                    }
                    if (y11 == updateNotificationGroup.totalCount && z11) {
                        if (arrayList2 != null) {
                            z10 = false;
                            for (bb bbVar : arrayList2) {
                                if (!bbVar.r()) {
                                    z10 = true;
                                }
                            }
                        } else {
                            z10 = false;
                        }
                        if (!z10 && arrayList != null) {
                            for (bb bbVar2 : arrayList) {
                                if (!bbVar2.r()) {
                                    z10 = true;
                                }
                            }
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    if (!m() && z11) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int[] iArr2 = updateNotificationGroup.removedNotificationIds;
                if (iArr2 != null && iArr2.length > 0) {
                    for (int i10 : iArr2) {
                        int H = H(i10);
                        if (H != -1) {
                            this.N.remove(H);
                        }
                    }
                }
                TdApi.Notification[] notificationArr2 = updateNotificationGroup.addedNotifications;
                if (notificationArr2 != null && notificationArr2.length != 0 && !this.f27625b.y7()) {
                    y10 = new fb(this.f27625b, updateNotificationGroup);
                    if (!y10.isEmpty()) {
                        this.O.put(Integer.valueOf(updateNotificationGroup.notificationGroupId), y10);
                        this.N.addAll(y10.P());
                        Collections.sort(this.N);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            R(y10, !z11 && this.f27624a.x(updateNotificationGroup.chatId), updateNotificationGroup.notificationSettingsChatId, null);
        }
    }

    public boolean isEmpty() {
        if (Build.VERSION.SDK_INT >= 26 && this.f27625b.ga(true) != 0) {
            try {
                cb Z = this.f27625b.ka().Z();
                Iterator<fb> it = iterator();
                while (it.hasNext()) {
                    if (Z.j(it.next(), false) != null) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                Tracer.g(th);
            }
        }
        return !iterator().hasNext();
    }

    @Override
    public Iterator<fb> iterator() {
        return new d(this.O.values(), gb.f27565a);
    }

    public boolean m() {
        return !he.d.w().y() || he.d.w().l();
    }

    public int r(int i10) {
        HashSet hashSet = new HashSet(this.O.size());
        for (fb fbVar : this.O.values()) {
            if (fbVar.M(i10)) {
                hashSet.add(Long.valueOf(fbVar.v()));
            }
        }
        return hashSet.size();
    }

    public int s(int i10) {
        int i11 = 0;
        for (fb fbVar : this.O.values()) {
            if (fbVar.M(i10)) {
                i11 += fbVar.W();
            }
        }
        return i11;
    }

    public jb t() {
        return this.f27624a;
    }

    public final void u(fb fbVar, boolean z10, long j10) {
        this.M.b(j0.n(), this, this.f27625b.m6(), m(), fbVar, (!z10 || fbVar.B()) ? null : new lb(this.f27625b, j10, fbVar));
        this.f27625b.F4().V2(this.f27625b.A6(), true);
    }

    public void v(TdApi.UpdateNotification updateNotification) {
        bb V;
        fb y10 = y(updateNotification.notificationGroupId);
        if (y10 != null && (V = y10.V(updateNotification.notification)) != null) {
            int H = H(updateNotification.notification.f19947id);
            if (H != -1) {
                this.N.set(H, V);
                R(y10, false, 0L, V);
                return;
            }
            throw new IllegalStateException("Notification not found in the global list");
        }
    }

    @TargetApi(26)
    public String w(int i10) {
        NotificationChannel notificationChannel;
        List<bb> K;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        cb Z = this.f27625b.ka().Z();
        List<bb> K2 = K(i10, true);
        if (K2 == null || K2.isEmpty()) {
            notificationChannel = null;
        } else {
            notificationChannel = null;
            for (int size = K2.size() - 1; size >= 0; size--) {
                notificationChannel = (NotificationChannel) Z.j(K2.get(size).o(), false);
                if (notificationChannel != null) {
                    break;
                }
            }
        }
        if (notificationChannel == null && (K = K(i10, false)) != null && !K.isEmpty()) {
            for (int size2 = K.size() - 1; size2 >= 0; size2--) {
                notificationChannel = (NotificationChannel) Z.j(K.get(size2).o(), false);
                if (notificationChannel != null) {
                    break;
                }
            }
            if (notificationChannel == null) {
                notificationChannel = (NotificationChannel) Z.j(K.get(K.size() - 1).o(), true);
            }
        }
        if (notificationChannel != null) {
            return notificationChannel.getId();
        }
        return null;
    }

    public fb x(int i10) {
        fb fbVar = this.O.get(Integer.valueOf(i10));
        if (fbVar == null || fbVar.isEmpty() || fbVar.B()) {
            return null;
        }
        return fbVar;
    }

    public final fb y(int i10) {
        return this.O.get(Integer.valueOf(i10));
    }

    public long z() {
        if (this.O.isEmpty()) {
            return 0L;
        }
        long j10 = 0;
        for (fb fbVar : this.O.values()) {
            long v10 = fbVar.v();
            if (j10 == 0) {
                j10 = v10;
            } else if (j10 != v10) {
                return 0L;
            }
        }
        return j10;
    }
}
