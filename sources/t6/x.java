package t6;

import java.io.InputStream;

public final class x extends w {
    public final w f22969a;
    public final long f22970b;
    public final long f22971c;

    public x(w wVar, long j10, long j11) {
        this.f22969a = wVar;
        long z02 = z0(j10);
        this.f22970b = z02;
        this.f22971c = z0(z02 + j11);
    }

    @Override
    public final void close() {
    }

    @Override
    public final long m() {
        return this.f22971c - this.f22970b;
    }

    @Override
    public final InputStream s(long j10, long j11) {
        long z02 = z0(this.f22970b);
        return this.f22969a.s(z02, z0(j11 + z02) - z02);
    }

    public final long z0(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        return j10 > this.f22969a.m() ? this.f22969a.m() : j10;
    }
}
