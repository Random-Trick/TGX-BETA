package p311w4;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p020b5.C1216l0;
import p217p4.AbstractC8041f;
import p217p4.C8032b;

public final class C9978h implements AbstractC8041f {
    public final Map<String, C9975e> f32457M;
    public final Map<String, String> f32458N;
    public final C9974d f32459a;
    public final long[] f32460b;
    public final Map<String, C9977g> f32461c;

    public C9978h(C9974d dVar, Map<String, C9977g> map, Map<String, C9975e> map2, Map<String, String> map3) {
        this.f32459a = dVar;
        this.f32457M = map2;
        this.f32458N = map3;
        this.f32461c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f32460b = dVar.m6362j();
    }

    @Override
    public int mo5200a(long j) {
        int e = C1216l0.m37978e(this.f32460b, j, false, false);
        if (e < this.f32460b.length) {
            return e;
        }
        return -1;
    }

    @Override
    public long mo5199b(int i) {
        return this.f32460b[i];
    }

    @Override
    public List<C8032b> mo5198c(long j) {
        return this.f32459a.m6364h(j, this.f32461c, this.f32457M, this.f32458N);
    }

    @Override
    public int mo5197d() {
        return this.f32460b.length;
    }
}
