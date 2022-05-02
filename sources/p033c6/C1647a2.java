package p033c6;

import java.io.OutputStream;

public final class C1647a2 extends OutputStream {
    public long f6067a = 0;

    public final long m36121m() {
        return this.f6067a;
    }

    @Override
    public final void write(int i) {
        this.f6067a++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.f6067a += bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f6067a += i2;
    }
}
