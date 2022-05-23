package l5;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import java.util.Objects;
import k5.f;
import k5.k;
import k5.n;
import m5.r;

public final class f2 implements Runnable {
    public final k f16092a;
    public final h2 f16093b;

    public f2(h2 h2Var, k kVar) {
        this.f16093b = h2Var;
        this.f16092a = kVar;
    }

    @Override
    public final void run() {
        WeakReference weakReference;
        n nVar;
        try {
            try {
                BasePendingResult.f5635p.set(Boolean.TRUE);
                nVar = this.f16093b.f16103a;
                ((n) r.k(nVar)).b(this.f16092a);
                Objects.requireNonNull(this.f16093b);
                Objects.requireNonNull(this.f16093b);
                throw null;
            } catch (RuntimeException unused) {
                Objects.requireNonNull(this.f16093b);
                Objects.requireNonNull(this.f16093b);
                throw null;
            }
        } catch (Throwable th) {
            BasePendingResult.f5635p.set(Boolean.FALSE);
            h2 h2Var = this.f16093b;
            h2.j(this.f16092a);
            weakReference = this.f16093b.f16108f;
            f fVar = (f) weakReference.get();
            if (fVar != null) {
                fVar.m(this.f16093b);
            }
            throw th;
        }
    }
}
