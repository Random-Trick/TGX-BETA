package b5;

import android.net.Uri;
import c5.a;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class h0 implements k {
    public final k f3883a;
    public long f3884b;
    public Uri f3885c = Uri.EMPTY;
    public Map<String, List<String>> f3886d = Collections.emptyMap();

    public h0(k kVar) {
        this.f3883a = (k) a.e(kVar);
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        int b10 = this.f3883a.b(bArr, i10, i11);
        if (b10 != -1) {
            this.f3884b += b10;
        }
        return b10;
    }

    @Override
    public void close() {
        this.f3883a.close();
    }

    @Override
    public long d(o oVar) {
        this.f3885c = oVar.f3904a;
        this.f3886d = Collections.emptyMap();
        long d10 = this.f3883a.d(oVar);
        this.f3885c = (Uri) a.e(p());
        this.f3886d = l();
        return d10;
    }

    @Override
    public void i(i0 i0Var) {
        a.e(i0Var);
        this.f3883a.i(i0Var);
    }

    @Override
    public Map<String, List<String>> l() {
        return this.f3883a.l();
    }

    @Override
    public Uri p() {
        return this.f3883a.p();
    }

    public long s() {
        return this.f3884b;
    }

    public Uri t() {
        return this.f3885c;
    }

    public Map<String, List<String>> u() {
        return this.f3886d;
    }
}
