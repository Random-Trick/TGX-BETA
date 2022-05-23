package hc;

import java.io.OutputStream;
import ra.k;

public final class s implements y {
    public final OutputStream f12663a;
    public final b0 f12664b;

    public s(OutputStream outputStream, b0 b0Var) {
        k.e(outputStream, "out");
        k.e(b0Var, "timeout");
        this.f12663a = outputStream;
        this.f12664b = b0Var;
    }

    @Override
    public b0 c() {
        return this.f12664b;
    }

    @Override
    public void c0(e eVar, long j10) {
        k.e(eVar, "source");
        c.b(eVar.size(), 0L, j10);
        while (j10 > 0) {
            this.f12664b.f();
            v vVar = eVar.f12644a;
            k.c(vVar);
            int min = (int) Math.min(j10, vVar.f12674c - vVar.f12673b);
            this.f12663a.write(vVar.f12672a, vVar.f12673b, min);
            vVar.f12673b += min;
            long j11 = min;
            j10 -= j11;
            eVar.Q0(eVar.size() - j11);
            if (vVar.f12673b == vVar.f12674c) {
                eVar.f12644a = vVar.b();
                w.b(vVar);
            }
        }
    }

    @Override
    public void close() {
        this.f12663a.close();
    }

    @Override
    public void flush() {
        this.f12663a.flush();
    }

    public String toString() {
        return "sink(" + this.f12663a + ')';
    }
}
