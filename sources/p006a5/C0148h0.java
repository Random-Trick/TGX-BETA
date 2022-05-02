package p006a5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p020b5.C1186a;

public final class C0148h0 implements AbstractC0154k {
    public final AbstractC0154k f529a;
    public long f530b;
    public Uri f531c = Uri.EMPTY;
    public Map<String, List<String>> f532d = Collections.emptyMap();

    public C0148h0(AbstractC0154k kVar) {
        this.f529a = (AbstractC0154k) C1186a.m38185e(kVar);
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        int b = this.f529a.mo4414b(bArr, i, i2);
        if (b != -1) {
            this.f530b += b;
        }
        return b;
    }

    @Override
    public long mo4413c(C0159o oVar) {
        this.f531c = oVar.f553a;
        this.f532d = Collections.emptyMap();
        long c = this.f529a.mo4413c(oVar);
        this.f531c = (Uri) C1186a.m38185e(mo4412p());
        this.f532d = mo17398l();
        return c;
    }

    @Override
    public void close() {
        this.f529a.close();
    }

    @Override
    public void mo17399g(AbstractC0150i0 i0Var) {
        C1186a.m38185e(i0Var);
        this.f529a.mo17399g(i0Var);
    }

    @Override
    public Map<String, List<String>> mo17398l() {
        return this.f529a.mo17398l();
    }

    @Override
    public Uri mo4412p() {
        return this.f529a.mo4412p();
    }

    public long m42211s() {
        return this.f530b;
    }

    public Uri m42210t() {
        return this.f531c;
    }

    public Map<String, List<String>> m42209u() {
        return this.f532d;
    }
}
