package e6;

import java.io.OutputStream;

public final class f8 extends OutputStream {
    public long f10779a = 0;

    public final long m() {
        return this.f10779a;
    }

    @Override
    public final void write(int i10) {
        this.f10779a++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.f10779a += bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 < 0 || i10 > (length = bArr.length) || i11 < 0 || (i12 = i10 + i11) > length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f10779a += i11;
    }
}
