package p341y4;

import java.util.Collections;
import java.util.List;
import p020b5.C1186a;
import p217p4.AbstractC8041f;
import p217p4.C8032b;

public final class C10372b implements AbstractC8041f {
    public final List<C8032b> f33363a;

    public C10372b(List<C8032b> list) {
        this.f33363a = Collections.unmodifiableList(list);
    }

    @Override
    public int mo5200a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override
    public long mo5199b(int i) {
        C1186a.m38189a(i == 0);
        return 0L;
    }

    @Override
    public List<C8032b> mo5198c(long j) {
        return j >= 0 ? this.f33363a : Collections.emptyList();
    }

    @Override
    public int mo5197d() {
        return 1;
    }
}
