package p148k5;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.AbstractC3487a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p118i5.C5217a;
import p118i5.C5221e;
import p133j5.AbstractC5876k;
import p133j5.C5850a;
import p134j6.AbstractC5891f;
import p134j6.C5886a;
import p149k6.C6207l;
import p163l5.AbstractC6355k;
import p163l5.C6331c0;
import p163l5.C6336e;
import p163l5.C6376q0;
import p163l5.C6378r;

public final class C6135l0 implements AbstractC6161r0 {
    public final C6173u0 f19441a;
    public final Lock f19442b;
    public final Context f19443c;
    public final C5221e f19444d;
    public C5217a f19445e;
    public int f19446f;
    public int f19448h;
    public AbstractC5891f f19451k;
    public boolean f19452l;
    public boolean f19453m;
    public boolean f19454n;
    public AbstractC6355k f19455o;
    public boolean f19456p;
    public boolean f19457q;
    public final C6336e f19458r;
    public final Map<C5850a<?>, Boolean> f19459s;
    public final C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> f19460t;
    public int f19447g = 0;
    public final Bundle f19449i = new Bundle();
    public final Set<C5850a.C5853c> f19450j = new HashSet();
    public final ArrayList<Future<?>> f19461u = new ArrayList<>();

    public C6135l0(C6173u0 u0Var, C6336e eVar, Map<C5850a<?>, Boolean> map, C5221e eVar2, C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> aVar, Lock lock, Context context) {
        this.f19441a = u0Var;
        this.f19458r = eVar;
        this.f19459s = map;
        this.f19444d = eVar2;
        this.f19460t = aVar;
        this.f19442b = lock;
        this.f19443c = context;
    }

    public static void m21223I(C6135l0 l0Var, C6207l lVar) {
        if (l0Var.m21213q(0)) {
            C5217a b = lVar.m21069b();
            if (b.m23611f()) {
                C6376q0 q0Var = (C6376q0) C6378r.m20506k(lVar.m21068c());
                C5217a c = q0Var.m20519c();
                if (!c.m23611f()) {
                    String valueOf = String.valueOf(c);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 48);
                    sb2.append("Sign-in succeeded with resolve account failure: ");
                    sb2.append(valueOf);
                    Log.wtf("GACConnecting", sb2.toString(), new Exception());
                    l0Var.m21216n(c);
                    return;
                }
                l0Var.f19454n = true;
                l0Var.f19455o = (AbstractC6355k) C6378r.m20506k(q0Var.m20520b());
                l0Var.f19456p = q0Var.m20518d();
                l0Var.f19457q = q0Var.m20517e();
                l0Var.m21221i();
            } else if (l0Var.m21217m(b)) {
                l0Var.m21218l();
                l0Var.m21221i();
            } else {
                l0Var.m21216n(b);
            }
        }
    }

    public static final String m21212r(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static Set m21204z(C6135l0 l0Var) {
        C6336e eVar = l0Var.f19458r;
        if (eVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(eVar.m20604e());
        Map<C5850a<?>, C6331c0> f = l0Var.f19458r.m20603f();
        for (C5850a<?> aVar : f.keySet()) {
            if (!l0Var.f19441a.f19559g.containsKey(aVar.m21935c())) {
                hashSet.addAll(f.get(aVar).f19894a);
            }
        }
        return hashSet;
    }

    @GuardedBy("mLock")
    public final boolean m21222J() {
        int i = this.f19448h - 1;
        this.f19448h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.f19441a.f19566n.m21166r());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m21216n(new C5217a(8, null));
            return false;
        }
        C5217a aVar = this.f19445e;
        if (aVar == null) {
            return true;
        }
        this.f19441a.f19565m = this.f19446f;
        m21216n(aVar);
        return false;
    }

    @Override
    public final void mo21148a() {
    }

    @Override
    public final <A extends C5850a.AbstractC5852b, T extends AbstractC3487a<? extends AbstractC5876k, A>> T mo21147b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    @GuardedBy("mLock")
    public final boolean mo21146c() {
        m21214p();
        m21215o(true);
        this.f19441a.m21109j(null);
        return true;
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21145d() {
        this.f19441a.f19559g.clear();
        this.f19453m = false;
        this.f19445e = null;
        this.f19447g = 0;
        this.f19452l = true;
        this.f19454n = false;
        this.f19456p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C5850a<?> aVar : this.f19459s.keySet()) {
            C5850a.AbstractC5859f fVar = (C5850a.AbstractC5859f) C6378r.m20506k(this.f19441a.f19558f.get(aVar.m21935c()));
            z |= aVar.m21937a().m21930b() == 1;
            boolean booleanValue = this.f19459s.get(aVar).booleanValue();
            if (fVar.mo20626t()) {
                this.f19453m = true;
                if (booleanValue) {
                    this.f19450j.add(aVar.m21935c());
                } else {
                    this.f19452l = false;
                }
            }
            hashMap.put(fVar, new C6092c0(this, aVar, booleanValue));
        }
        if (z) {
            this.f19453m = false;
        }
        if (this.f19453m) {
            C6378r.m20506k(this.f19458r);
            C6378r.m20506k(this.f19460t);
            this.f19458r.m20599j(Integer.valueOf(System.identityHashCode(this.f19441a.f19566n)));
            C6127j0 j0Var = new C6127j0(this, null);
            C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> aVar2 = this.f19460t;
            Context context = this.f19443c;
            Looper j = this.f19441a.f19566n.mo21171j();
            C6336e eVar = this.f19458r;
            this.f19451k = aVar2.mo21893c(context, j, eVar, eVar.m20601h(), j0Var, j0Var);
        }
        this.f19448h = this.f19441a.f19558f.size();
        this.f19461u.add(C6177v0.m21103a().submit(new C6107f0(this, hashMap)));
    }

    @Override
    public final <A extends C5850a.AbstractC5852b, R extends AbstractC5876k, T extends AbstractC3487a<R, A>> T mo21144e(T t) {
        this.f19441a.f19566n.f19504h.add(t);
        return t;
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21143f(Bundle bundle) {
        if (m21213q(1)) {
            if (bundle != null) {
                this.f19449i.putAll(bundle);
            }
            if (m21222J()) {
                m21220j();
            }
        }
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21142g(int i) {
        m21216n(new C5217a(8, null));
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21141h(C5217a aVar, C5850a<?> aVar2, boolean z) {
        if (m21213q(1)) {
            m21219k(aVar, aVar2, z);
            if (m21222J()) {
                m21220j();
            }
        }
    }

    @GuardedBy("mLock")
    public final void m21221i() {
        if (this.f19448h == 0) {
            if (!this.f19453m || this.f19454n) {
                ArrayList arrayList = new ArrayList();
                this.f19447g = 1;
                this.f19448h = this.f19441a.f19558f.size();
                for (C5850a.C5853c<?> cVar : this.f19441a.f19558f.keySet()) {
                    if (!this.f19441a.f19559g.containsKey(cVar)) {
                        arrayList.add(this.f19441a.f19558f.get(cVar));
                    } else if (m21222J()) {
                        m21220j();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f19461u.add(C6177v0.m21103a().submit(new C6112g0(this, arrayList)));
                }
            }
        }
    }

    @GuardedBy("mLock")
    public final void m21220j() {
        this.f19441a.m21110i();
        C6177v0.m21103a().execute(new RunnableC6086b0(this));
        AbstractC5891f fVar = this.f19451k;
        if (fVar != null) {
            if (this.f19456p) {
                fVar.mo21076k((AbstractC6355k) C6378r.m20506k(this.f19455o), this.f19457q);
            }
            m21215o(false);
        }
        for (C5850a.C5853c<?> cVar : this.f19441a.f19559g.keySet()) {
            ((C5850a.AbstractC5859f) C6378r.m20506k(this.f19441a.f19558f.get(cVar))).mo905j();
        }
        this.f19441a.f19567o.mo21177b(this.f19449i.isEmpty() ? null : this.f19449i);
    }

    @GuardedBy("mLock")
    public final void m21219k(C5217a aVar, C5850a<?> aVar2, boolean z) {
        int b = aVar2.m21937a().m21930b();
        if ((!z || aVar.m23612e() || this.f19444d.m23591c(aVar.m23615b()) != null) && (this.f19445e == null || b < this.f19446f)) {
            this.f19445e = aVar;
            this.f19446f = b;
        }
        this.f19441a.f19559g.put(aVar2.m21935c(), aVar);
    }

    @GuardedBy("mLock")
    public final void m21218l() {
        this.f19453m = false;
        this.f19441a.f19566n.f19512p = Collections.emptySet();
        for (C5850a.C5853c<?> cVar : this.f19450j) {
            if (!this.f19441a.f19559g.containsKey(cVar)) {
                this.f19441a.f19559g.put(cVar, new C5217a(17, null));
            }
        }
    }

    @GuardedBy("mLock")
    public final boolean m21217m(C5217a aVar) {
        return this.f19452l && !aVar.m23612e();
    }

    @GuardedBy("mLock")
    public final void m21216n(C5217a aVar) {
        m21214p();
        m21215o(!aVar.m23612e());
        this.f19441a.m21109j(aVar);
        this.f19441a.f19567o.mo21178a(aVar);
    }

    @GuardedBy("mLock")
    public final void m21215o(boolean z) {
        AbstractC5891f fVar = this.f19451k;
        if (fVar != null) {
            if (fVar.mo21250a() && z) {
                fVar.mo21075l();
            }
            fVar.mo905j();
            C6336e eVar = (C6336e) C6378r.m20506k(this.f19458r);
            this.f19455o = null;
        }
    }

    public final void m21214p() {
        ArrayList<Future<?>> arrayList = this.f19461u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        this.f19461u.clear();
    }

    @GuardedBy("mLock")
    public final boolean m21213q(int i) {
        if (this.f19447g == i) {
            return true;
        }
        Log.w("GACConnecting", this.f19441a.f19566n.m21166r());
        String valueOf = String.valueOf(this);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
        sb2.append("Unexpected callback in ");
        sb2.append(valueOf);
        Log.w("GACConnecting", sb2.toString());
        int i2 = this.f19448h;
        StringBuilder sb3 = new StringBuilder(33);
        sb3.append("mRemainingConnections=");
        sb3.append(i2);
        Log.w("GACConnecting", sb3.toString());
        String r = m21212r(this.f19447g);
        String r2 = m21212r(i);
        StringBuilder sb4 = new StringBuilder(r.length() + 70 + r2.length());
        sb4.append("GoogleApiClient connecting is in step ");
        sb4.append(r);
        sb4.append(" but received callback for step ");
        sb4.append(r2);
        Log.e("GACConnecting", sb4.toString(), new Exception());
        m21216n(new C5217a(8, null));
        return false;
    }
}
