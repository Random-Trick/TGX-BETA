package p202o6;

import java.io.InputStream;

public final class C7698h0 extends InputStream {
    public final InputStream f24658a;
    public long f24659b;

    public C7698h0(InputStream inputStream, long j) {
        this.f24658a = inputStream;
        this.f24659b = j;
    }

    @Override
    public final void close() {
        super.close();
        this.f24658a.close();
        this.f24659b = 0L;
    }

    @Override
    public final int read() {
        long j = this.f24659b;
        if (j <= 0) {
            return -1;
        }
        this.f24659b = j - 1;
        return this.f24658a.read();
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f24659b;
        if (j <= 0) {
            return -1;
        }
        int read = this.f24658a.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.f24659b -= read;
        }
        return read;
    }
}
