package p342y5;

import java.io.OutputStream;

public final class C10392c0 extends OutputStream {
    public long f33453a = 0;

    public final long m5174m() {
        return this.f33453a;
    }

    @Override
    public final void write(int i) {
        this.f33453a++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.f33453a += bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f33453a += i2;
    }
}
