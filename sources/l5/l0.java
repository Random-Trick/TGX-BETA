package l5;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import j5.a;
import j5.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import k5.a;
import k6.f;
import l6.l;
import m5.c0;
import m5.k;
import m5.q0;
import m5.r;

public final class l0 implements r0 {
    public final u0 f16128a;
    public final Lock f16129b;
    public final Context f16130c;
    public final e f16131d;
    public a f16132e;
    public int f16133f;
    public int f16135h;
    public f f16138k;
    public boolean f16139l;
    public boolean f16140m;
    public boolean f16141n;
    public k f16142o;
    public boolean f16143p;
    public boolean f16144q;
    public final m5.e f16145r;
    public final Map<k5.a<?>, Boolean> f16146s;
    public final a.AbstractC0141a<? extends f, k6.a> f16147t;
    public int f16134g = 0;
    public final Bundle f16136i = new Bundle();
    public final Set<a.c> f16137j = new HashSet();
    public final ArrayList<Future<?>> f16148u = new ArrayList<>();

    public l0(u0 u0Var, m5.e eVar, Map<k5.a<?>, Boolean> map, e eVar2, a.AbstractC0141a<? extends f, k6.a> aVar, Lock lock, Context context) {
        this.f16128a = u0Var;
        this.f16145r = eVar;
        this.f16146s = map;
        this.f16131d = eVar2;
        this.f16147t = aVar;
        this.f16129b = lock;
        this.f16130c = context;
    }

    public static void I(l0 l0Var, l lVar) {
        if (l0Var.q(0)) {
            j5.a b10 = lVar.b();
            if (b10.f()) {
                q0 q0Var = (q0) r.k(lVar.c());
                j5.a c10 = q0Var.c();
                if (!c10.f()) {
                    String valueOf = String.valueOf(c10);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 48);
                    sb2.append("Sign-in succeeded with resolve account failure: ");
                    sb2.append(valueOf);
                    Log.wtf("GACConnecting", sb2.toString(), new Exception());
                    l0Var.n(c10);
                    return;
                }
                l0Var.f16141n = true;
                l0Var.f16142o = (k) r.k(q0Var.b());
                l0Var.f16143p = q0Var.d();
                l0Var.f16144q = q0Var.e();
                l0Var.i();
            } else if (l0Var.m(b10)) {
                l0Var.l();
                l0Var.i();
            } else {
                l0Var.n(b10);
            }
        }
    }

    public static final String r(int i10) {
        return i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static Set z(l0 l0Var) {
        m5.e eVar = l0Var.f16145r;
        if (eVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(eVar.e());
        Map<k5.a<?>, c0> f10 = l0Var.f16145r.f();
        for (k5.a<?> aVar : f10.keySet()) {
            if (!l0Var.f16128a.f16245g.containsKey(aVar.c())) {
                hashSet.addAll(f10.get(aVar).f17165a);
            }
        }
        return hashSet;
    }

    @GuardedBy("mLock")
    public final boolean J() {
        int i10 = this.f16135h - 1;
        this.f16135h = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 < 0) {
            Log.w("GACConnecting", this.f16128a.f16252n.r());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            n(new j5.a(8, null));
            return false;
        }
        j5.a aVar = this.f16132e;
        if (aVar == null) {
            return true;
        }
        this.f16128a.f16251m = this.f16133f;
        n(aVar);
        return false;
    }

    @Override
    public final void a() {
    }

    @Override
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k5.k, A>> T b(T t10) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    @GuardedBy("mLock")
    public final boolean c() {
        p();
        o(true);
        this.f16128a.j(null);
        return true;
    }

    @Override
    @GuardedBy("mLock")
    public final void d() {
        this.f16128a.f16245g.clear();
        this.f16140m = false;
        this.f16132e = null;
        this.f16134g = 0;
        this.f16139l = true;
        this.f16141n = false;
        this.f16143p = false;
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (k5.a<?> aVar : this.f16146s.keySet()) {
            a.f fVar = (a.f) r.k(this.f16128a.f16244f.get(aVar.c()));
            z10 |= aVar.a().b() == 1;
            boolean booleanValue = this.f16146s.get(aVar).booleanValue();
            if (fVar.u()) {
                this.f16140m = true;
                if (booleanValue) {
                    this.f16137j.add(aVar.c());
                } else {
                    this.f16139l = false;
                }
            }
            hashMap.put(fVar, new c0(this, aVar, booleanValue));
        }
        if (z10) {
            this.f16140m = false;
        }
        if (this.f16140m) {
            r.k(this.f16145r);
            r.k(this.f16147t);
            this.f16145r.j(Integer.valueOf(System.identityHashCode(this.f16128a.f16252n)));
            j0 j0Var = new j0(this, null);
            a.AbstractC0141a<? extends f, k6.a> aVar2 = this.f16147t;
            Context context = this.f16130c;
            Looper j10 = this.f16128a.f16252n.j();
            m5.e eVar = this.f16145r;
            this.f16138k = aVar2.c(context, j10, eVar, eVar.h(), j0Var, j0Var);
        }
        this.f16135h = this.f16128a.f16244f.size();
        this.f16148u.add(v0.a().submit(new f0(this, hashMap)));
    }

    @Override
    public final <A extends a.b, R extends k5.k, T extends com.google.android.gms.common.api.internal.a<R, A>> T e(T t10) {
        this.f16128a.f16252n.f16191h.add(t10);
        return t10;
    }

    @Override
    @GuardedBy("mLock")
    public final void f(Bundle bundle) {
        if (q(1)) {
            if (bundle != null) {
                this.f16136i.putAll(bundle);
            }
            if (J()) {
                j();
            }
        }
    }

    @Override
    @GuardedBy("mLock")
    public final void g(j5.a aVar, k5.a<?> aVar2, boolean z10) {
        if (q(1)) {
            k(aVar, aVar2, z10);
            if (J()) {
                j();
            }
        }
    }

    @Override
    @GuardedBy("mLock")
    public final void h(int i10) {
        n(new j5.a(8, null));
    }

    @GuardedBy("mLock")
    public final void i() {
        if (this.f16135h == 0) {
            if (!this.f16140m || this.f16141n) {
                ArrayList arrayList = new ArrayList();
                this.f16134g = 1;
                this.f16135h = this.f16128a.f16244f.size();
                for (a.c<?> cVar : this.f16128a.f16244f.keySet()) {
                    if (!this.f16128a.f16245g.containsKey(cVar)) {
                        arrayList.add(this.f16128a.f16244f.get(cVar));
                    } else if (J()) {
                        j();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f16148u.add(v0.a().submit(new g0(this, arrayList)));
                }
            }
        }
    }

    @GuardedBy("mLock")
    public final void j() {
        this.f16128a.i();
        v0.a().execute(new b0(this));
        f fVar = this.f16138k;
        if (fVar != null) {
            if (this.f16143p) {
                fVar.e((k) r.k(this.f16142o), this.f16144q);
            }
            o(false);
        }
        for (a.c<?> cVar : this.f16128a.f16245g.keySet()) {
            ((a.f) r.k(this.f16128a.f16244f.get(cVar))).k();
        }
        this.f16128a.f16253o.b(this.f16136i.isEmpty() ? null : this.f16136i);
    }

    @GuardedBy("mLock")
    public final void k(j5.a aVar, k5.a<?> aVar2, boolean z10) {
        int b10 = aVar2.a().b();
        if ((!z10 || aVar.e() || this.f16131d.c(aVar.b()) != null) && (this.f16132e == null || b10 < this.f16133f)) {
            this.f16132e = aVar;
            this.f16133f = b10;
        }
        this.f16128a.f16245g.put(aVar2.c(), aVar);
    }

    @GuardedBy("mLock")
    public final void l() {
        this.f16140m = false;
        this.f16128a.f16252n.f16199p = Collections.emptySet();
        for (a.c<?> cVar : this.f16137j) {
            if (!this.f16128a.f16245g.containsKey(cVar)) {
                this.f16128a.f16245g.put(cVar, new j5.a(17, null));
            }
        }
    }

    @GuardedBy("mLock")
    public final boolean m(j5.a aVar) {
        return this.f16139l && !aVar.e();
    }

    @GuardedBy("mLock")
    public final void n(j5.a aVar) {
        p();
        o(!aVar.e());
        this.f16128a.j(aVar);
        this.f16128a.f16253o.a(aVar);
    }

    @GuardedBy("mLock")
    public final void o(boolean z10) {
        f fVar = this.f16138k;
        if (fVar != null) {
            if (fVar.a() && z10) {
                fVar.l();
            }
            fVar.k();
            m5.e eVar = (m5.e) r.k(this.f16145r);
            this.f16142o = null;
        }
    }

    public final void p() {
        ArrayList<Future<?>> arrayList = this.f16148u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).cancel(true);
        }
        this.f16148u.clear();
    }

    @GuardedBy("mLock")
    public final boolean q(int i10) {
        if (this.f16134g == i10) {
            return true;
        }
        Log.w("GACConnecting", this.f16128a.f16252n.r());
        String valueOf = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
        sb2.append("Unexpected callback in ");
        sb2.append(valueOf);
        Log.w("GACConnecting", sb2.toString());
        int i11 = this.f16135h;
        StringBuilder sb3 = new StringBuilder(33);
        sb3.append("mRemainingConnections=");
        sb3.append(i11);
        Log.w("GACConnecting", sb3.toString());
        String r10 = r(this.f16134g);
        String r11 = r(i10);
        StringBuilder sb4 = new StringBuilder(r10.length() + 70 + r11.length());
        sb4.append("GoogleApiClient connecting is in step ");
        sb4.append(r10);
        sb4.append(" but received callback for step ");
        sb4.append(r11);
        Log.e("GACConnecting", sb4.toString(), new Exception());
        n(new j5.a(8, null));
        return false;
    }
}
