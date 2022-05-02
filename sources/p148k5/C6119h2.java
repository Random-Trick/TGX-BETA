package p148k5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;
import p133j5.AbstractC5867f;
import p133j5.AbstractC5873h;
import p133j5.AbstractC5876k;
import p133j5.AbstractC5877l;
import p133j5.AbstractC5878m;
import p133j5.AbstractC5879n;
import p133j5.AbstractC5880o;
import p163l5.C6378r;

public final class C6119h2<R extends AbstractC5876k> extends AbstractC5880o<R> implements AbstractC5877l<R> {
    public AbstractC5879n<? super R, ? extends AbstractC5876k> f19406a;
    public C6119h2<? extends AbstractC5876k> f19407b;
    public volatile AbstractC5878m<? super R> f19408c;
    public final Object f19409d;
    public Status f19410e;
    public final WeakReference<AbstractC5867f> f19411f;
    public final HandlerC6114g2 f19412g;

    public static final void m21263j(AbstractC5876k kVar) {
        if (kVar instanceof AbstractC5873h) {
            try {
                ((AbstractC5873h) kVar).m21900a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(kVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
                sb2.append("Unable to release ");
                sb2.append(valueOf);
                Log.w("TransformedResultImpl", sb2.toString(), e);
            }
        }
    }

    @Override
    public final void mo11471a(R r) {
        synchronized (this.f19409d) {
            if (!r.mo952a().m30395f()) {
                m21266g(r.mo952a());
                m21263j(r);
            } else if (this.f19406a != null) {
                C6186x1.m21085a().submit(new RunnableC6109f2(this, r));
            } else if (m21264i()) {
                ((AbstractC5878m) C6378r.m20507k(this.f19408c)).m21897c(r);
            }
        }
    }

    public final void m21271b() {
        this.f19408c = null;
    }

    public final void m21266g(Status status) {
        synchronized (this.f19409d) {
            this.f19410e = status;
            m21265h(status);
        }
    }

    public final void m21265h(Status status) {
        synchronized (this.f19409d) {
            AbstractC5879n<? super R, ? extends AbstractC5876k> nVar = this.f19406a;
            if (nVar != null) {
                ((C6119h2) C6378r.m20507k(this.f19407b)).m21266g((Status) C6378r.m20506l(nVar.m21896a(status), "onFailure must not return null"));
            } else if (m21264i()) {
                ((AbstractC5878m) C6378r.m20507k(this.f19408c)).m21898b(status);
            }
        }
    }

    @GuardedBy("mSyncToken")
    public final boolean m21264i() {
        return (this.f19408c == null || this.f19411f.get() == null) ? false : true;
    }
}
