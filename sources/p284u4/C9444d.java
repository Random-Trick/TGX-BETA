package p284u4;

import java.util.Collections;
import java.util.List;
import p020b5.C1186a;
import p020b5.C1216l0;
import p217p4.AbstractC8041f;
import p217p4.C8032b;

public final class C9444d implements AbstractC8041f {
    public final List<List<C8032b>> f30627a;
    public final List<Long> f30628b;

    public C9444d(List<List<C8032b>> list, List<Long> list2) {
        this.f30627a = list;
        this.f30628b = list2;
    }

    @Override
    public int mo5200a(long j) {
        int d = C1216l0.m37983d(this.f30628b, Long.valueOf(j), false, false);
        if (d < this.f30628b.size()) {
            return d;
        }
        return -1;
    }

    @Override
    public long mo5199b(int i) {
        boolean z = true;
        C1186a.m38192a(i >= 0);
        if (i >= this.f30628b.size()) {
            z = false;
        }
        C1186a.m38192a(z);
        return this.f30628b.get(i).longValue();
    }

    @Override
    public List<C8032b> mo5198c(long j) {
        int g = C1216l0.m37977g(this.f30628b, Long.valueOf(j), true, false);
        if (g == -1) {
            return Collections.emptyList();
        }
        return this.f30627a.get(g);
    }

    @Override
    public int mo5197d() {
        return this.f30628b.size();
    }
}
