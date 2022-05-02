package p235q8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class C8279c extends FilterInputStream {
    public int f26760a = -1;
    public int f26761b = -1;

    public C8279c(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() {
        int read = super.read();
        if (read == 3 && this.f26760a == 0 && this.f26761b == 0) {
            this.f26760a = -1;
            this.f26761b = -1;
            read = super.read();
        }
        this.f26760a = this.f26761b;
        this.f26761b = read;
        return read;
    }

    @Override
    public int read(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            int read = read();
            if (read == -1) {
                return -1;
            }
            bArr[i] = (byte) read;
            int i3 = 1;
            while (true) {
                if (i3 < i2) {
                    try {
                        int read2 = read();
                        if (read2 == -1) {
                            break;
                        }
                        bArr[i + i3] = (byte) read2;
                        i3++;
                    } catch (IOException unused) {
                    }
                }
                return i3;
            }
            return i3;
        }
    }
}
