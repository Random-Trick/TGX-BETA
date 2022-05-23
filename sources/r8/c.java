package r8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class c extends FilterInputStream {
    public int f21796a = -1;
    public int f21797b = -1;

    public c(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() {
        int read = super.read();
        if (read == 3 && this.f21796a == 0 && this.f21797b == 0) {
            this.f21796a = -1;
            this.f21797b = -1;
            read = super.read();
        }
        this.f21796a = this.f21797b;
        this.f21797b = read;
        return read;
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr);
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        } else if (i11 == 0) {
            return 0;
        } else {
            int read = read();
            if (read == -1) {
                return -1;
            }
            bArr[i10] = (byte) read;
            int i12 = 1;
            while (true) {
                if (i12 < i11) {
                    try {
                        int read2 = read();
                        if (read2 == -1) {
                            break;
                        }
                        bArr[i10 + i12] = (byte) read2;
                        i12++;
                    } catch (IOException unused) {
                    }
                }
                return i12;
            }
            return i12;
        }
    }
}
