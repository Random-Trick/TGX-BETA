package z5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public final class q extends FilterInputStream {
    public long f26995b = -1;
    public long f26994a = 1048577;

    public q(InputStream inputStream, long j10) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
    }

    @Override
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f26994a);
    }

    @Override
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f26995b = this.f26994a;
    }

    @Override
    public final int read() {
        if (this.f26994a == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f26994a--;
        }
        return read;
    }

    @Override
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f26995b != -1) {
            ((FilterInputStream) this).in.reset();
            this.f26994a = this.f26995b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    @Override
    public final long skip(long j10) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f26994a));
        this.f26994a -= skip;
        return skip;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.f26994a;
        if (j10 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
        if (read != -1) {
            this.f26994a -= read;
        }
        return read;
    }
}
