package ub;

import java.util.concurrent.TimeUnit;
import yb.e;
import zb.h;

public final class k {
    public final h f23885a;

    public k(h hVar) {
        ra.k.e(hVar, "delegate");
        this.f23885a = hVar;
    }

    public final h a() {
        return this.f23885a;
    }

    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new h(e.f26691h, i10, j10, timeUnit));
        ra.k.e(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
