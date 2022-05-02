package p262s6;

import java.io.InputStream;

public final class C8688x extends AbstractC8687w {
    public final AbstractC8687w f28012a;
    public final long f28013b;
    public final long f28014c;

    public C8688x(AbstractC8687w wVar, long j, long j2) {
        this.f28012a = wVar;
        long z0 = m11731z0(j);
        this.f28013b = z0;
        this.f28014c = m11731z0(z0 + j2);
    }

    @Override
    public final void close() {
    }

    @Override
    public final long mo11733m() {
        return this.f28014c - this.f28013b;
    }

    @Override
    public final InputStream mo11732t(long j, long j2) {
        long z0 = m11731z0(this.f28013b);
        return this.f28012a.mo11732t(z0, m11731z0(j2 + z0) - z0);
    }

    public final long m11731z0(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.f28012a.mo11733m() ? this.f28012a.mo11733m() : j;
    }
}
