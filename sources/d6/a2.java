package d6;

import java.io.OutputStream;

public final class a2 extends OutputStream {
    public long f6341a = 0;

    public final long m() {
        return this.f6341a;
    }

    @Override
    public final void write(int i10) {
        this.f6341a++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.f6341a += bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 < 0 || i10 > (length = bArr.length) || i11 < 0 || (i12 = i10 + i11) > length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f6341a += i11;
    }
}
