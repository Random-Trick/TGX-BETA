package p095gc;

import java.io.IOException;
import java.io.InputStream;
import qa.C8298k;

public final class C4559n implements AbstractC4537a0 {
    public final InputStream f14989a;
    public final C4539b0 f14990b;

    public C4559n(InputStream inputStream, C4539b0 b0Var) {
        C8298k.m12934e(inputStream, "input");
        C8298k.m12934e(b0Var, "timeout");
        this.f14989a = inputStream;
        this.f14990b = b0Var;
    }

    @Override
    public C4539b0 mo27334c() {
        return this.f14990b;
    }

    @Override
    public void close() {
        this.f14989a.close();
    }

    @Override
    public long mo5028s(C4549e eVar, long j) {
        C8298k.m12934e(eVar, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            try {
                this.f14990b.mo27390f();
                C4568v T0 = eVar.m27428T0(1);
                int read = this.f14989a.read(T0.f15004a, T0.f15006c, (int) Math.min(j, 8192 - T0.f15006c));
                if (read != -1) {
                    T0.f15006c += read;
                    long j2 = read;
                    eVar.m27431Q0(eVar.size() + j2);
                    return j2;
                } else if (T0.f15005b != T0.f15006c) {
                    return -1L;
                } else {
                    eVar.f14970a = T0.m27323b();
                    C4570w.m27317b(T0);
                    return -1L;
                }
            } catch (AssertionError e) {
                if (C4560o.m27377c(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    public String toString() {
        return "source(" + this.f14989a + ')';
    }
}
