package p006a5;

import java.io.InputStream;
import p020b5.C1186a;

public final class C0157m extends InputStream {
    public long f549O;
    public final AbstractC0154k f550a;
    public final C0159o f551b;
    public boolean f547M = false;
    public boolean f548N = false;
    public final byte[] f552c = new byte[1];

    public C0157m(AbstractC0154k kVar, C0159o oVar) {
        this.f550a = kVar;
        this.f551b = oVar;
    }

    @Override
    public void close() {
        if (!this.f548N) {
            this.f550a.close();
            this.f548N = true;
        }
    }

    public final void m42206m() {
        if (!this.f547M) {
            this.f550a.mo4413c(this.f551b);
            this.f547M = true;
        }
    }

    @Override
    public int read() {
        if (read(this.f552c) == -1) {
            return -1;
        }
        return this.f552c[0] & 255;
    }

    @Override
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override
    public int read(byte[] bArr, int i, int i2) {
        C1186a.m38184f(!this.f548N);
        m42206m();
        int b = this.f550a.mo4414b(bArr, i, i2);
        if (b == -1) {
            return -1;
        }
        this.f549O += b;
        return b;
    }
}
