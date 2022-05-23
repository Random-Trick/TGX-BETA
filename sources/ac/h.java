package ac;

import hc.g;
import ra.k;
import ub.e0;

public final class h extends e0 {
    public final g M;
    public final String f734b;
    public final long f735c;

    public h(String str, long j10, g gVar) {
        k.e(gVar, "source");
        this.f734b = str;
        this.f735c = j10;
        this.M = gVar;
    }

    @Override
    public long m() {
        return this.f735c;
    }

    @Override
    public g s() {
        return this.M;
    }
}
