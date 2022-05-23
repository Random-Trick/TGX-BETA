package z4;

import c5.a;
import java.util.Collections;
import java.util.List;
import q4.f;

public final class b implements f {
    public final List<q4.b> f26882a;

    public b(List<q4.b> list) {
        this.f26882a = Collections.unmodifiableList(list);
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
    public List<q4.b> c(long j10) {
        return j10 >= 0 ? this.f26882a : Collections.emptyList();
    }

    @Override
    public int d() {
        return 1;
    }
}
