package p148k5;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import p133j5.AbstractC5867f;
import p133j5.AbstractC5876k;
import p133j5.AbstractC5879n;
import p163l5.C6378r;

public final class RunnableC6109f2 implements Runnable {
    public final AbstractC5876k f19395a;
    public final C6119h2 f19396b;

    public RunnableC6109f2(C6119h2 h2Var, AbstractC5876k kVar) {
        this.f19396b = h2Var;
        this.f19395a = kVar;
    }

    @Override
    public final void run() {
        WeakReference weakReference;
        AbstractC5879n nVar;
        HandlerC6114g2 unused;
        HandlerC6114g2 unused2;
        HandlerC6114g2 unused3;
        HandlerC6114g2 unused4;
        try {
            try {
                BasePendingResult.f11581p.set(Boolean.TRUE);
                nVar = this.f19396b.f19406a;
                ((AbstractC5879n) C6378r.m20506k(nVar)).m21894b(this.f19395a);
                unused = this.f19396b.f19412g;
                unused2 = this.f19396b.f19412g;
                throw null;
            } catch (RuntimeException unused5) {
                unused3 = this.f19396b.f19412g;
                unused4 = this.f19396b.f19412g;
                throw null;
            }
        } catch (Throwable th) {
            BasePendingResult.f11581p.set(Boolean.FALSE);
            C6119h2 h2Var = this.f19396b;
            C6119h2.m21262j(this.f19395a);
            weakReference = this.f19396b.f19411f;
            AbstractC5867f fVar = (AbstractC5867f) weakReference.get();
            if (fVar != null) {
                fVar.mo21170m(this.f19396b);
            }
            throw th;
        }
    }
}
