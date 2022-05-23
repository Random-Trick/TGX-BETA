package l5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;
import k5.f;
import k5.h;
import k5.k;
import k5.l;
import k5.m;
import k5.n;
import k5.o;
import m5.r;

public final class h2<R extends k> extends o<R> implements l<R> {
    public n<? super R, ? extends k> f16103a;
    public h2<? extends k> f16104b;
    public volatile m<? super R> f16105c;
    public final Object f16106d;
    public Status f16107e;
    public final WeakReference<f> f16108f;

    public static final void j(k kVar) {
        if (kVar instanceof h) {
            try {
                ((h) kVar).a();
            } catch (RuntimeException e10) {
                String valueOf = String.valueOf(kVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
                sb2.append("Unable to release ");
                sb2.append(valueOf);
                Log.w("TransformedResultImpl", sb2.toString(), e10);
            }
        }
    }

    @Override
    public final void a(R r10) {
        synchronized (this.f16106d) {
            if (!r10.a().f()) {
                g(r10.a());
                j(r10);
            } else if (this.f16103a != null) {
                x1.a().submit(new f2(this, r10));
            } else if (i()) {
                ((m) r.k(this.f16105c)).c(r10);
            }
        }
    }

    public final void b() {
        this.f16105c = null;
    }

    public final void g(Status status) {
        synchronized (this.f16106d) {
            this.f16107e = status;
            h(status);
        }
    }

    public final void h(Status status) {
        synchronized (this.f16106d) {
            n<? super R, ? extends k> nVar = this.f16103a;
            if (nVar != null) {
                ((h2) r.k(this.f16104b)).g((Status) r.l(nVar.a(status), "onFailure must not return null"));
            } else if (i()) {
                ((m) r.k(this.f16105c)).b(status);
            }
        }
    }

    @GuardedBy("mSyncToken")
    public final boolean i() {
        return (this.f16105c == null || this.f16108f.get() == null) ? false : true;
    }
}
