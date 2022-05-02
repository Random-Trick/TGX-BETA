package p342y5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public final class C10409q extends FilterInputStream {
    public long f33477b = -1;
    public long f33476a = 1048577;

    public C10409q(InputStream inputStream, long j) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
    }

    @Override
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f33476a);
    }

    @Override
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f33477b = this.f33476a;
    }

    @Override
    public final int read() {
        if (this.f33476a == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f33476a--;
        }
        return read;
    }

    @Override
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f33477b != -1) {
            ((FilterInputStream) this).in.reset();
            this.f33476a = this.f33477b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    @Override
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f33476a));
        this.f33476a -= skip;
        return skip;
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f33476a;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.f33476a -= read;
        }
        return read;
    }
}
