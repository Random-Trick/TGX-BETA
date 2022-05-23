package x3;

import c5.a;
import t3.g;
import t3.n;

public final class c extends n {
    public final long f25977b;

    public c(g gVar, long j10) {
        super(gVar);
        a.a(gVar.r() >= j10);
        this.f25977b = j10;
    }

    @Override
    public long a() {
        return super.a() - this.f25977b;
    }

    @Override
    public long f() {
        return super.f() - this.f25977b;
    }

    @Override
    public <E extends Throwable> void j(long j10, E e10) {
        super.j(j10 + this.f25977b, e10);
    }

    @Override
    public long r() {
        return super.r() - this.f25977b;
    }
}
