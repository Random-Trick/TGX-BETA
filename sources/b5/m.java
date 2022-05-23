package b5;

import c5.a;
import java.io.InputStream;

public final class m extends InputStream {
    public long O;
    public final k f3901a;
    public final o f3902b;
    public boolean M = false;
    public boolean N = false;
    public final byte[] f3903c = new byte[1];

    public m(k kVar, o oVar) {
        this.f3901a = kVar;
        this.f3902b = oVar;
    }

    @Override
    public void close() {
        if (!this.N) {
            this.f3901a.close();
            this.N = true;
        }
    }

    public final void m() {
        if (!this.M) {
            this.f3901a.d(this.f3902b);
            this.M = true;
        }
    }

    @Override
    public int read() {
        if (read(this.f3903c) == -1) {
            return -1;
        }
        return this.f3903c[0] & 255;
    }

    @Override
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        a.f(!this.N);
        m();
        int b10 = this.f3901a.b(bArr, i10, i11);
        if (b10 == -1) {
            return -1;
        }
        this.O += b10;
        return b10;
    }
}
