package p046d6;

import java.io.OutputStream;

public final class C3673f8 extends OutputStream {
    public long f12517a = 0;

    public final long m29834m() {
        return this.f12517a;
    }

    @Override
    public final void write(int i) {
        this.f12517a++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.f12517a += bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f12517a += i2;
    }
}
