package p6;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

public final class k2 extends InputStream {
    public final Enumeration f20694a;
    public InputStream f20695b;

    public k2(Enumeration enumeration) {
        this.f20694a = enumeration;
        m();
    }

    @Override
    public final void close() {
        super.close();
        InputStream inputStream = this.f20695b;
        if (inputStream != null) {
            inputStream.close();
            this.f20695b = null;
        }
    }

    public final void m() {
        InputStream inputStream = this.f20695b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f20695b = this.f20694a.hasMoreElements() ? new FileInputStream((File) this.f20694a.nextElement()) : null;
    }

    @Override
    public final int read() {
        while (true) {
            InputStream inputStream = this.f20695b;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            m();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f20695b == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        } else if (i11 == 0) {
            return 0;
        } else {
            do {
                int read = this.f20695b.read(bArr, i10, i11);
                if (read > 0) {
                    return read;
                }
                m();
            } while (this.f20695b != null);
            return -1;
        }
    }
}
