package p202o6;

import java.io.InputStream;

public final class C7698h0 extends InputStream {
    public final InputStream f24661a;
    public long f24662b;

    public C7698h0(InputStream inputStream, long j) {
        this.f24661a = inputStream;
        this.f24662b = j;
    }

    @Override
    public final void close() {
        super.close();
        this.f24661a.close();
        this.f24662b = 0L;
    }

    @Override
    public final int read() {
        long j = this.f24662b;
        if (j <= 0) {
            return -1;
        }
        this.f24662b = j - 1;
        return this.f24661a.read();
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f24662b;
        if (j <= 0) {
            return -1;
        }
        int read = this.f24661a.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.f24662b -= read;
        }
        return read;
    }
}
