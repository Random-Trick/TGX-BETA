package l5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import k5.a;
import k5.k;
import m5.r;

public final class l2<A extends a<? extends k, a.b>> extends p2 {
    public final A f16150b;

    public l2(int i10, A a10) {
        super(i10);
        this.f16150b = (A) r.l(a10, "Null methods are not runnable.");
    }

    @Override
    public final void a(Status status) {
        try {
            this.f16150b.w(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f16150b.w(new Status(10, sb2.toString()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override
    public final void c(u uVar, boolean z10) {
        uVar.a(this.f16150b, z10);
    }

    @Override
    public final void d(c1<?> c1Var) {
        try {
            this.f16150b.u(c1Var.v());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }
}
