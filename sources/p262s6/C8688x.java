package p262s6;

import java.io.InputStream;

public final class C8688x extends AbstractC8687w {
    public final AbstractC8687w f28009a;
    public final long f28010b;
    public final long f28011c;

    public C8688x(AbstractC8687w wVar, long j, long j2) {
        this.f28009a = wVar;
        long z0 = m11732z0(j);
        this.f28010b = z0;
        this.f28011c = m11732z0(z0 + j2);
    }

    @Override
    public final void close() {
    }

    @Override
    public final long mo11734m() {
        return this.f28011c - this.f28010b;
    }

    @Override
    public final InputStream mo11733t(long j, long j2) {
        long z0 = m11732z0(this.f28010b);
        return this.f28009a.mo11733t(z0, m11732z0(j2 + z0) - z0);
    }

    public final long m11732z0(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.f28009a.mo11734m() ? this.f28009a.mo11734m() : j;
    }
}
