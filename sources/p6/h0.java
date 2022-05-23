package p6;

import java.io.InputStream;

public final class h0 extends InputStream {
    public final InputStream f20624a;
    public long f20625b;

    public h0(InputStream inputStream, long j10) {
        this.f20624a = inputStream;
        this.f20625b = j10;
    }

    @Override
    public final void close() {
        super.close();
        this.f20624a.close();
        this.f20625b = 0L;
    }

    @Override
    public final int read() {
        long j10 = this.f20625b;
        if (j10 <= 0) {
            return -1;
        }
        this.f20625b = j10 - 1;
        return this.f20624a.read();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.f20625b;
        if (j10 <= 0) {
            return -1;
        }
        int read = this.f20624a.read(bArr, i10, (int) Math.min(i11, j10));
        if (read != -1) {
            this.f20625b -= read;
        }
        return read;
    }
}
