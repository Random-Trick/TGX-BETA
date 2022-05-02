package p202o6;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

public final class C7715k2 extends InputStream {
    public final Enumeration f24737a;
    public InputStream f24738b;

    public C7715k2(Enumeration enumeration) {
        this.f24737a = enumeration;
        m15183m();
    }

    @Override
    public final void close() {
        super.close();
        InputStream inputStream = this.f24738b;
        if (inputStream != null) {
            inputStream.close();
            this.f24738b = null;
        }
    }

    public final void m15183m() {
        InputStream inputStream = this.f24738b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f24738b = this.f24737a.hasMoreElements() ? new FileInputStream((File) this.f24737a.nextElement()) : null;
    }

    @Override
    public final int read() {
        while (true) {
            InputStream inputStream = this.f24738b;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            m15183m();
        }
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f24738b == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f24738b.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                m15183m();
            } while (this.f24738b != null);
            return -1;
        }
    }
}
