package xa;

import ja.e0;
import java.util.NoSuchElementException;

public final class i extends e0 {
    public long M;
    public final long f26200a;
    public final long f26201b;
    public boolean f26202c;

    public i(long j10, long j11, long j12) {
        this.f26200a = j12;
        this.f26201b = j11;
        boolean z10 = true;
        int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 <= 0 ? i11 < 0 : i11 > 0) {
            z10 = false;
        }
        this.f26202c = z10;
        this.M = !z10 ? j11 : j10;
    }

    @Override
    public long d() {
        long j10 = this.M;
        if (j10 != this.f26201b) {
            this.M = this.f26200a + j10;
        } else if (this.f26202c) {
            this.f26202c = false;
        } else {
            throw new NoSuchElementException();
        }
        return j10;
    }

    @Override
    public boolean hasNext() {
        return this.f26202c;
    }
}
