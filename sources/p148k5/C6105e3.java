package p148k5;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3487a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p118i5.C5217a;
import p118i5.C5221e;
import p133j5.AbstractC5876k;
import p133j5.C5850a;
import p134j6.AbstractC5891f;
import p134j6.C5886a;
import p143k0.C6024a;
import p163l5.C6336e;
import p163l5.C6378r;

public final class C6105e3 implements AbstractC6132k1 {
    public final Context f19352a;
    public final C6156q0 f19353b;
    public final Looper f19354c;
    public final C6173u0 f19355d;
    public final C6173u0 f19356e;
    public final Map<C5850a.C5853c<?>, C6173u0> f19357f;
    public final C5850a.AbstractC5859f f19359h;
    public Bundle f19360i;
    public final Lock f19364m;
    public final Set<AbstractC6151p> f19358g = Collections.newSetFromMap(new WeakHashMap());
    public C5217a f19361j = null;
    public C5217a f19362k = null;
    public boolean f19363l = false;
    @GuardedBy("mLock")
    public int f19365n = 0;

    public C6105e3(Context context, C6156q0 q0Var, Lock lock, Looper looper, C5221e eVar, Map<C5850a.C5853c<?>, C5850a.AbstractC5859f> map, Map<C5850a.C5853c<?>, C5850a.AbstractC5859f> map2, C6336e eVar2, C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> aVar, C5850a.AbstractC5859f fVar, ArrayList<C6195z2> arrayList, ArrayList<C6195z2> arrayList2, Map<C5850a<?>, Boolean> map3, Map<C5850a<?>, Boolean> map4) {
        this.f19352a = context;
        this.f19353b = q0Var;
        this.f19364m = lock;
        this.f19354c = looper;
        this.f19359h = fVar;
        this.f19355d = new C6173u0(context, q0Var, lock, looper, eVar, map2, null, map4, null, arrayList2, new C6095c3(this, null));
        this.f19356e = new C6173u0(context, q0Var, lock, looper, eVar, map, eVar2, map3, aVar, arrayList, new C6100d3(this, null));
        C6024a aVar2 = new C6024a();
        for (C5850a.C5853c<?> cVar : map2.keySet()) {
            aVar2.put(cVar, this.f19355d);
        }
        for (C5850a.C5853c<?> cVar2 : map.keySet()) {
            aVar2.put(cVar2, this.f19356e);
        }
        this.f19357f = Collections.unmodifiableMap(aVar2);
    }

    public static boolean m21329l(C5217a aVar) {
        return aVar != null && aVar.m23612f();
    }

    public static C6105e3 m21328m(Context context, C6156q0 q0Var, Lock lock, Looper looper, C5221e eVar, Map<C5850a.C5853c<?>, C5850a.AbstractC5859f> map, C6336e eVar2, Map<C5850a<?>, Boolean> map2, C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> aVar, ArrayList<C6195z2> arrayList) {
        C6024a aVar2 = new C6024a();
        C6024a aVar3 = new C6024a();
        C5850a.AbstractC5859f fVar = null;
        for (Map.Entry<C5850a.C5853c<?>, C5850a.AbstractC5859f> entry : map.entrySet()) {
            C5850a.AbstractC5859f value = entry.getValue();
            if (true == value.mo21250b()) {
                fVar = value;
            }
            if (value.mo20627t()) {
                aVar2.put(entry.getKey(), value);
            } else {
                aVar3.put(entry.getKey(), value);
            }
        }
        C6378r.m20504n(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C6024a aVar4 = new C6024a();
        C6024a aVar5 = new C6024a();
        for (C5850a<?> aVar6 : map2.keySet()) {
            C5850a.C5853c<?> c = aVar6.m21936c();
            if (aVar2.containsKey(c)) {
                aVar4.put(aVar6, map2.get(aVar6));
            } else if (aVar3.containsKey(c)) {
                aVar5.put(aVar6, map2.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C6195z2 z2Var = arrayList.get(i);
            if (aVar4.containsKey(z2Var.f19595a)) {
                arrayList2.add(z2Var);
            } else if (aVar5.containsKey(z2Var.f19595a)) {
                arrayList3.add(z2Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C6105e3(context, q0Var, lock, looper, eVar, aVar2, aVar3, eVar2, aVar, fVar, arrayList2, arrayList3, aVar4, aVar5);
    }

    public static void m21326o(C6105e3 e3Var) {
        C5217a aVar;
        if (m21329l(e3Var.f19361j)) {
            if (m21329l(e3Var.f19362k) || e3Var.m21332i()) {
                int i = e3Var.f19365n;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        e3Var.f19365n = 0;
                        return;
                    }
                    ((C6156q0) C6378r.m20507k(e3Var.f19353b)).mo21178b(e3Var.f19360i);
                }
                e3Var.m21333h();
                e3Var.f19365n = 0;
                return;
            }
            C5217a aVar2 = e3Var.f19362k;
            if (aVar2 == null) {
                return;
            }
            if (e3Var.f19365n == 1) {
                e3Var.m21333h();
                return;
            }
            e3Var.m21316y(aVar2);
            e3Var.f19355d.mo21117c();
        } else if (e3Var.f19361j == null || !m21329l(e3Var.f19362k)) {
            C5217a aVar3 = e3Var.f19361j;
            if (aVar3 != null && (aVar = e3Var.f19362k) != null) {
                if (e3Var.f19356e.f19565m < e3Var.f19355d.f19565m) {
                    aVar3 = aVar;
                }
                e3Var.m21316y(aVar3);
            }
        } else {
            e3Var.f19356e.mo21117c();
            e3Var.m21316y((C5217a) C6378r.m20507k(e3Var.f19361j));
        }
    }

    public static void m21325p(C6105e3 e3Var, Bundle bundle) {
        Bundle bundle2 = e3Var.f19360i;
        if (bundle2 == null) {
            e3Var.f19360i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static void m21320u(C6105e3 e3Var, int i, boolean z) {
        e3Var.f19353b.mo21177c(i, z);
        e3Var.f19362k = null;
        e3Var.f19361j = null;
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21119a() {
        this.f19365n = 2;
        this.f19363l = false;
        this.f19362k = null;
        this.f19361j = null;
        this.f19355d.mo21119a();
        this.f19356e.mo21119a();
    }

    @Override
    @GuardedBy("mLock")
    public final <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T mo21118b(T t) {
        if (!m21331j(t)) {
            return (T) this.f19355d.mo21118b(t);
        }
        if (!m21332i()) {
            return (T) this.f19356e.mo21118b(t);
        }
        t.m30372w(new Status(4, (String) null, m21330k()));
        return t;
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21117c() {
        this.f19362k = null;
        this.f19361j = null;
        this.f19365n = 0;
        this.f19355d.mo21117c();
        this.f19356e.mo21117c();
        m21333h();
    }

    @Override
    public final void mo21116d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f19356e.mo21116d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f19355d.mo21116d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override
    @GuardedBy("mLock")
    public final <A extends C5850a.AbstractC5852b, R extends AbstractC5876k, T extends AbstractC3487a<R, A>> T mo21115e(T t) {
        if (!m21331j(t)) {
            this.f19355d.mo21115e(t);
            return t;
        } else if (m21332i()) {
            t.m30372w(new Status(4, (String) null, m21330k()));
            return t;
        } else {
            this.f19356e.mo21115e(t);
            return t;
        }
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21114f() {
        this.f19355d.mo21114f();
        this.f19356e.mo21114f();
    }

    @Override
    public final boolean mo21113g() {
        throw new UnsupportedOperationException("Method not decompiled: p148k5.C6105e3.mo21113g():boolean");
    }

    @GuardedBy("mLock")
    public final void m21333h() {
        for (AbstractC6151p pVar : this.f19358g) {
            pVar.m21188a();
        }
        this.f19358g.clear();
    }

    @GuardedBy("mLock")
    public final boolean m21332i() {
        C5217a aVar = this.f19362k;
        return aVar != null && aVar.m23616b() == 4;
    }

    public final boolean m21331j(AbstractC3487a<? extends AbstractC5876k, ? extends C5850a.AbstractC5852b> aVar) {
        C6173u0 u0Var = this.f19357f.get(aVar.m30376s());
        C6378r.m20506l(u0Var, "GoogleApiClient is not configured to use the API required for this call.");
        return u0Var.equals(this.f19356e);
    }

    public final PendingIntent m21330k() {
        if (this.f19359h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f19352a, System.identityHashCode(this.f19353b), this.f19359h.mo21239s(), 134217728);
    }

    @GuardedBy("mLock")
    public final void m21316y(C5217a aVar) {
        int i = this.f19365n;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f19365n = 0;
            }
            this.f19353b.mo21179a(aVar);
        }
        m21333h();
        this.f19365n = 0;
    }
}
