package v4;

import c5.a;
import c5.l0;
import java.util.Collections;
import java.util.List;
import q4.b;
import q4.f;

public final class d implements f {
    public final List<List<b>> f24733a;
    public final List<Long> f24734b;

    public d(List<List<b>> list, List<Long> list2) {
        this.f24733a = list;
        this.f24734b = list2;
    }

    @Override
    public int a(long j10) {
        int d10 = l0.d(this.f24734b, Long.valueOf(j10), false, false);
        if (d10 < this.f24734b.size()) {
            return d10;
        }
        return -1;
    }

    @Override
    public long b(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.f24734b.size()) {
            z10 = false;
        }
        a.a(z10);
        return this.f24734b.get(i10).longValue();
    }

    @Override
    public List<b> c(long j10) {
        int g10 = l0.g(this.f24734b, Long.valueOf(j10), true, false);
        if (g10 == -1) {
            return Collections.emptyList();
        }
        return this.f24733a.get(g10);
    }

    @Override
    public int d() {
        return this.f24734b.size();
    }
}
