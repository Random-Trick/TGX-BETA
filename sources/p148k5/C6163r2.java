package p148k5;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import p118i5.C5217a;
import p118i5.C5220d;
import p133j5.AbstractC5867f;
import p163l5.C6378r;

public final class C6163r2 extends AbstractDialogInterface$OnCancelListenerC6183w2 {
    public final SparseArray<C6158q2> f19537O = new SparseArray<>();

    public C6163r2(AbstractC6116h hVar) {
        super(hVar, C5220d.m23604p());
        this.f11598a.m21274a("AutoManageHelper", this);
    }

    public static C6163r2 m21140k(C6111g gVar) {
        AbstractC6116h b = LifecycleCallback.m30376b(gVar);
        C6163r2 r2Var = (C6163r2) b.m21273b("AutoManageHelper", C6163r2.class);
        return r2Var != null ? r2Var : new C6163r2(b);
    }

    @Override
    public final void mo21094f(C5217a aVar, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C6158q2 q2Var = this.f19537O.get(i);
        if (q2Var != null) {
            m21138m(i);
            AbstractC5867f.AbstractC5870c cVar = q2Var.f19525c;
            if (cVar != null) {
                cVar.mo11484s(aVar);
            }
        }
    }

    @Override
    public final void mo21093g() {
        for (int i = 0; i < this.f19537O.size(); i++) {
            C6158q2 n = m21137n(i);
            if (n != null) {
                n.f19524b.mo21089d();
            }
        }
    }

    public final void m21139l(int i, AbstractC5867f fVar, AbstractC5867f.AbstractC5870c cVar) {
        C6378r.m20505l(fVar, "GoogleApiClient instance cannot be null");
        boolean z = this.f19537O.indexOfKey(i) < 0;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Already managing a GoogleApiClient with id ");
        sb2.append(i);
        C6378r.m20503n(z, sb2.toString());
        C6171t2 t2Var = this.f19582c.get();
        boolean z2 = this.f19581b;
        String valueOf = String.valueOf(t2Var);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 49);
        sb3.append("starting AutoManage for client ");
        sb3.append(i);
        sb3.append(" ");
        sb3.append(z2);
        sb3.append(" ");
        sb3.append(valueOf);
        Log.d("AutoManageHelper", sb3.toString());
        C6158q2 q2Var = new C6158q2(this, i, fVar, cVar);
        fVar.mo21087k(q2Var);
        this.f19537O.put(i, q2Var);
        if (this.f19581b && t2Var == null) {
            String valueOf2 = String.valueOf(fVar);
            StringBuilder sb4 = new StringBuilder(valueOf2.length() + 11);
            sb4.append("connecting ");
            sb4.append(valueOf2);
            Log.d("AutoManageHelper", sb4.toString());
            fVar.mo21089d();
        }
    }

    public final void m21138m(int i) {
        C6158q2 q2Var = this.f19537O.get(i);
        this.f19537O.remove(i);
        if (q2Var != null) {
            q2Var.f19524b.mo21086l(q2Var);
            q2Var.f19524b.mo21088e();
        }
    }

    public final C6158q2 m21137n(int i) {
        if (this.f19537O.size() <= i) {
            return null;
        }
        SparseArray<C6158q2> sparseArray = this.f19537O;
        return sparseArray.get(sparseArray.keyAt(i));
    }
}
