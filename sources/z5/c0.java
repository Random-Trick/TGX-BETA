package z5;

import java.io.OutputStream;

public final class c0 extends OutputStream {
    public long f26969a = 0;

    public final long m() {
        return this.f26969a;
    }

    @Override
    public final void write(int i10) {
        this.f26969a++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.f26969a += bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 < 0 || i10 > (length = bArr.length) || i11 < 0 || (i12 = i10 + i11) > length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f26969a += i11;
    }
}
