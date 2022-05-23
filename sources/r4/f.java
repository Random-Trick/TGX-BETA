package r4;

import c5.a;
import java.util.Collections;
import java.util.List;
import q4.b;

public final class f implements q4.f {
    public final List<b> f21736a;

    public f(List<b> list) {
        this.f21736a = list;
    }

    @Override
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override
    public long b(int i10) {
        a.a(i10 == 0);
        return 0L;
    }

    @Override
    public List<b> c(long j10) {
        return j10 >= 0 ? this.f21736a : Collections.emptyList();
    }

    @Override
    public int d() {
        return 1;
    }
}
