package y4;

import c5.a;
import java.util.Collections;
import java.util.List;
import q4.f;

public final class b implements f {
    public static final b f26577b = new b();
    public final List<q4.b> f26578a;

    public b(q4.b bVar) {
        this.f26578a = Collections.singletonList(bVar);
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
        return j10 >= 0 ? this.f26578a : Collections.emptyList();
    }

    @Override
    public int d() {
        return 1;
    }

    public b() {
        this.f26578a = Collections.emptyList();
    }
}
