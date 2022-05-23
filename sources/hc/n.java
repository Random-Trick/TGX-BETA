package hc;

import java.io.IOException;
import java.io.InputStream;
import ra.k;

public final class n implements a0 {
    public final InputStream f12658a;
    public final b0 f12659b;

    public n(InputStream inputStream, b0 b0Var) {
        k.e(inputStream, "input");
        k.e(b0Var, "timeout");
        this.f12658a = inputStream;
        this.f12659b = b0Var;
    }

    @Override
    public long A(e eVar, long j10) {
        k.e(eVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0L;
        }
        if (i10 >= 0) {
            try {
                this.f12659b.f();
                v T0 = eVar.T0(1);
                int read = this.f12658a.read(T0.f12672a, T0.f12674c, (int) Math.min(j10, 8192 - T0.f12674c));
                if (read != -1) {
                    T0.f12674c += read;
                    long j11 = read;
                    eVar.Q0(eVar.size() + j11);
                    return j11;
                } else if (T0.f12673b != T0.f12674c) {
                    return -1L;
                } else {
                    eVar.f12644a = T0.b();
                    w.b(T0);
                    return -1L;
                }
            } catch (AssertionError e10) {
                if (o.c(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }

    @Override
    public b0 c() {
        return this.f12659b;
    }

    @Override
    public void close() {
        this.f12658a.close();
    }

    public String toString() {
        return "source(" + this.f12658a + ')';
    }
}
