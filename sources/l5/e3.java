package l5;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j5.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import k5.a;
import k5.k;
import k6.f;
import m5.r;

public final class e3 implements k1 {
    public final Context f16064a;
    public final q0 f16065b;
    public final Looper f16066c;
    public final u0 f16067d;
    public final u0 f16068e;
    public final Map<a.c<?>, u0> f16069f;
    public final a.f f16071h;
    public Bundle f16072i;
    public final Lock f16076m;
    public final Set<p> f16070g = Collections.newSetFromMap(new WeakHashMap());
    public j5.a f16073j = null;
    public j5.a f16074k = null;
    public boolean f16075l = false;
    @GuardedBy("mLock")
    public int f16077n = 0;

    public e3(Context context, q0 q0Var, Lock lock, Looper looper, e eVar, Map<a.c<?>, a.f> map, Map<a.c<?>, a.f> map2, m5.e eVar2, a.AbstractC0141a<? extends f, k6.a> aVar, a.f fVar, ArrayList<z2> arrayList, ArrayList<z2> arrayList2, Map<a<?>, Boolean> map3, Map<a<?>, Boolean> map4) {
        this.f16064a = context;
        this.f16065b = q0Var;
        this.f16076m = lock;
        this.f16066c = looper;
        this.f16071h = fVar;
        this.f16067d = new u0(context, q0Var, lock, looper, eVar, map2, null, map4, null, arrayList2, new c3(this, null));
        this.f16068e = new u0(context, q0Var, lock, looper, eVar, map, eVar2, map3, aVar, arrayList, new d3(this, null));
        k0.a aVar2 = new k0.a();
        for (a.c<?> cVar : map2.keySet()) {
            aVar2.put(cVar, this.f16067d);
        }
        for (a.c<?> cVar2 : map.keySet()) {
            aVar2.put(cVar2, this.f16068e);
        }
        this.f16069f = Collections.unmodifiableMap(aVar2);
    }

    public static boolean l(j5.a aVar) {
        return aVar != null && aVar.f();
    }

    public static e3 m(Context context, q0 q0Var, Lock lock, Looper looper, e eVar, Map<a.c<?>, a.f> map, m5.e eVar2, Map<a<?>, Boolean> map2, a.AbstractC0141a<? extends f, k6.a> aVar, ArrayList<z2> arrayList) {
        k0.a aVar2 = new k0.a();
        k0.a aVar3 = new k0.a();
        a.f fVar = null;
        for (Map.Entry<a.c<?>, a.f> entry : map.entrySet()) {
            a.f value = entry.getValue();
            if (true == value.b()) {
                fVar = value;
            }
            if (value.u()) {
                aVar2.put(entry.getKey(), value);
            } else {
                aVar3.put(entry.getKey(), value);
            }
        }
        r.n(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        k0.a aVar4 = new k0.a();
        k0.a aVar5 = new k0.a();
        for (a<?> aVar6 : map2.keySet()) {
            a.c<?> c10 = aVar6.c();
            if (aVar2.containsKey(c10)) {
                aVar4.put(aVar6, map2.get(aVar6));
            } else if (aVar3.containsKey(c10)) {
                aVar5.put(aVar6, map2.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z2 z2Var = arrayList.get(i10);
            if (aVar4.containsKey(z2Var.f16279a)) {
                arrayList2.add(z2Var);
            } else if (aVar5.containsKey(z2Var.f16279a)) {
                arrayList3.add(z2Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new e3(context, q0Var, lock, looper, eVar, aVar2, aVar3, eVar2, aVar, fVar, arrayList2, arrayList3, aVar4, aVar5);
    }

    public static void o(e3 e3Var) {
        j5.a aVar;
        if (l(e3Var.f16073j)) {
            if (l(e3Var.f16074k) || e3Var.i()) {
                int i10 = e3Var.f16077n;
                if (i10 != 1) {
                    if (i10 != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        e3Var.f16077n = 0;
                        return;
                    }
                    ((q0) r.k(e3Var.f16065b)).b(e3Var.f16072i);
                }
                e3Var.h();
                e3Var.f16077n = 0;
                return;
            }
            j5.a aVar2 = e3Var.f16074k;
            if (aVar2 == null) {
                return;
            }
            if (e3Var.f16077n == 1) {
                e3Var.h();
                return;
            }
            e3Var.y(aVar2);
            e3Var.f16067d.c();
        } else if (e3Var.f16073j == null || !l(e3Var.f16074k)) {
            j5.a aVar3 = e3Var.f16073j;
            if (aVar3 != null && (aVar = e3Var.f16074k) != null) {
                if (e3Var.f16068e.f16251m < e3Var.f16067d.f16251m) {
                    aVar3 = aVar;
                }
                e3Var.y(aVar3);
            }
        } else {
            e3Var.f16068e.c();
            e3Var.y((j5.a) r.k(e3Var.f16073j));
        }
    }

    public static void p(e3 e3Var, Bundle bundle) {
        Bundle bundle2 = e3Var.f16072i;
        if (bundle2 == null) {
            e3Var.f16072i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static void u(e3 e3Var, int i10, boolean z10) {
        e3Var.f16065b.c(i10, z10);
        e3Var.f16074k = null;
        e3Var.f16073j = null;
    }

    @Override
    @GuardedBy("mLock")
    public final void a() {
        this.f16077n = 2;
        this.f16075l = false;
        this.f16074k = null;
        this.f16073j = null;
        this.f16067d.a();
        this.f16068e.a();
    }

    @Override
    @GuardedBy("mLock")
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T b(T t10) {
        if (!j(t10)) {
            return (T) this.f16067d.b(t10);
        }
        if (!i()) {
            return (T) this.f16068e.b(t10);
        }
        t10.w(new Status(4, (String) null, k()));
        return t10;
    }

    @Override
    @GuardedBy("mLock")
    public final void c() {
        this.f16074k = null;
        this.f16073j = null;
        this.f16077n = 0;
        this.f16067d.c();
        this.f16068e.c();
        h();
    }

    @Override
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f16068e.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f16067d.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override
    @GuardedBy("mLock")
    public final <A extends a.b, R extends k, T extends com.google.android.gms.common.api.internal.a<R, A>> T e(T t10) {
        if (!j(t10)) {
            this.f16067d.e(t10);
            return t10;
        } else if (i()) {
            t10.w(new Status(4, (String) null, k()));
            return t10;
        } else {
            this.f16068e.e(t10);
            return t10;
        }
    }

    @Override
    @GuardedBy("mLock")
    public final void f() {
        this.f16067d.f();
        this.f16068e.f();
    }

    @Override
    public final boolean g() {
        throw new UnsupportedOperationException("Method not decompiled: l5.e3.g():boolean");
    }

    @GuardedBy("mLock")
    public final void h() {
        for (p pVar : this.f16070g) {
            pVar.a();
        }
        this.f16070g.clear();
    }

    @GuardedBy("mLock")
    public final boolean i() {
        j5.a aVar = this.f16074k;
        return aVar != null && aVar.b() == 4;
    }

    public final boolean j(com.google.android.gms.common.api.internal.a<? extends k, ? extends a.b> aVar) {
        u0 u0Var = this.f16069f.get(aVar.s());
        r.l(u0Var, "GoogleApiClient is not configured to use the API required for this call.");
        return u0Var.equals(this.f16068e);
    }

    public final PendingIntent k() {
        if (this.f16071h == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f16064a, System.identityHashCode(this.f16065b), this.f16071h.t(), 134217728);
    }

    @GuardedBy("mLock")
    public final void y(j5.a aVar) {
        int i10 = this.f16077n;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f16077n = 0;
            }
            this.f16065b.a(aVar);
        }
        h();
        this.f16077n = 0;
    }
}
