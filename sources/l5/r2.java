package l5;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j5.a;
import j5.d;
import k5.f;
import m5.r;

public final class r2 extends w2 {
    public final SparseArray<q2> O = new SparseArray<>();

    public r2(h hVar) {
        super(hVar, d.p());
        this.f5652a.a("AutoManageHelper", this);
    }

    public static r2 k(g gVar) {
        h b10 = LifecycleCallback.b(gVar);
        r2 r2Var = (r2) b10.b("AutoManageHelper", r2.class);
        return r2Var != null ? r2Var : new r2(b10);
    }

    @Override
    public final void f(a aVar, int i10) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        q2 q2Var = this.O.get(i10);
        if (q2Var != null) {
            m(i10);
            f.c cVar = q2Var.f16212c;
            if (cVar != null) {
                cVar.r(aVar);
            }
        }
    }

    @Override
    public final void g() {
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            q2 n10 = n(i10);
            if (n10 != null) {
                n10.f16211b.d();
            }
        }
    }

    public final void l(int i10, f fVar, f.c cVar) {
        r.l(fVar, "GoogleApiClient instance cannot be null");
        boolean z10 = this.O.indexOfKey(i10) < 0;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Already managing a GoogleApiClient with id ");
        sb2.append(i10);
        r.n(z10, sb2.toString());
        t2 t2Var = this.f16266c.get();
        boolean z11 = this.f16265b;
        String valueOf = String.valueOf(t2Var);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 49);
        sb3.append("starting AutoManage for client ");
        sb3.append(i10);
        sb3.append(" ");
        sb3.append(z11);
        sb3.append(" ");
        sb3.append(valueOf);
        Log.d("AutoManageHelper", sb3.toString());
        q2 q2Var = new q2(this, i10, fVar, cVar);
        fVar.k(q2Var);
        this.O.put(i10, q2Var);
        if (this.f16265b && t2Var == null) {
            String valueOf2 = String.valueOf(fVar);
            StringBuilder sb4 = new StringBuilder(valueOf2.length() + 11);
            sb4.append("connecting ");
            sb4.append(valueOf2);
            Log.d("AutoManageHelper", sb4.toString());
            fVar.d();
        }
    }

    public final void m(int i10) {
        q2 q2Var = this.O.get(i10);
        this.O.remove(i10);
        if (q2Var != null) {
            q2Var.f16211b.l(q2Var);
            q2Var.f16211b.e();
        }
    }

    public final q2 n(int i10) {
        if (this.O.size() <= i10) {
            return null;
        }
        SparseArray<q2> sparseArray = this.O;
        return sparseArray.get(sparseArray.keyAt(i10));
    }
}
