package p148k5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3487a;
import p133j5.AbstractC5876k;
import p133j5.C5850a;
import p163l5.C6378r;

public final class C6137l2<A extends AbstractC3487a<? extends AbstractC5876k, C5850a.AbstractC5852b>> extends AbstractC6154p2 {
    public final A f19463b;

    public C6137l2(int i, A a) {
        super(i);
        this.f19463b = (A) C6378r.m20506l(a, "Null methods are not runnable.");
    }

    @Override
    public final void mo21185a(Status status) {
        try {
            this.f19463b.m30372w(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override
    public final void mo21184b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f19463b.m30372w(new Status(10, sb2.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override
    public final void mo21183c(C6172u uVar, boolean z) {
        uVar.m21128a(this.f19463b, z);
    }

    @Override
    public final void mo21182d(C6093c1<?> c1Var) {
        try {
            this.f19463b.m30374u(c1Var.m21341v());
        } catch (RuntimeException e) {
            mo21184b(e);
        }
    }
}
