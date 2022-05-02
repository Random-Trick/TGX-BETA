package p095gc;

import java.io.OutputStream;
import qa.C8298k;

public final class C4565s implements AbstractC4572y {
    public final OutputStream f14995a;
    public final C4539b0 f14996b;

    public C4565s(OutputStream outputStream, C4539b0 b0Var) {
        C8298k.m12933e(outputStream, "out");
        C8298k.m12933e(b0Var, "timeout");
        this.f14995a = outputStream;
        this.f14996b = b0Var;
    }

    @Override
    public C4539b0 mo27303c() {
        return this.f14996b;
    }

    @Override
    public void close() {
        this.f14995a.close();
    }

    @Override
    public void flush() {
        this.f14995a.flush();
    }

    @Override
    public void mo5030h0(C4549e eVar, long j) {
        C8298k.m12933e(eVar, "source");
        C4542c.m27477b(eVar.size(), 0L, j);
        while (j > 0) {
            this.f14996b.mo27392f();
            C4568v vVar = eVar.f14970a;
            C8298k.m12935c(vVar);
            int min = (int) Math.min(j, vVar.f15006c - vVar.f15005b);
            this.f14995a.write(vVar.f15004a, vVar.f15005b, min);
            vVar.f15005b += min;
            long j2 = min;
            j -= j2;
            eVar.m27433Q0(eVar.size() - j2);
            if (vVar.f15005b == vVar.f15006c) {
                eVar.f14970a = vVar.m27325b();
                C4570w.m27319b(vVar);
            }
        }
    }

    public String toString() {
        return "sink(" + this.f14995a + ')';
    }
}
