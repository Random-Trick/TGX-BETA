package x4;

import c5.l0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import q4.b;
import q4.f;

public final class h implements f {
    public final Map<String, e> M;
    public final Map<String, String> N;
    public final d f26052a;
    public final long[] f26053b;
    public final Map<String, g> f26054c;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f26052a = dVar;
        this.M = map2;
        this.N = map3;
        this.f26054c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f26053b = dVar.j();
    }

    @Override
    public int a(long j10) {
        int e10 = l0.e(this.f26053b, j10, false, false);
        if (e10 < this.f26053b.length) {
            return e10;
        }
        return -1;
    }

    @Override
    public long b(int i10) {
        return this.f26053b[i10];
    }

    @Override
    public List<b> c(long j10) {
        return this.f26052a.h(j10, this.f26054c, this.M, this.N);
    }

    @Override
    public int d() {
        return this.f26053b.length;
    }
}
