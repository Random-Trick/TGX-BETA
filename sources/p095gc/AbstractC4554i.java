package p095gc;

import qa.C8298k;

public abstract class AbstractC4554i implements AbstractC4572y {
    public final AbstractC4572y f14977a;

    public AbstractC4554i(AbstractC4572y yVar) {
        C8298k.m12934e(yVar, "delegate");
        this.f14977a = yVar;
    }

    @Override
    public C4539b0 mo27301c() {
        return this.f14977a.mo27301c();
    }

    @Override
    public void close() {
        this.f14977a.close();
    }

    @Override
    public void flush() {
        this.f14977a.flush();
    }

    @Override
    public void mo5030h0(C4549e eVar, long j) {
        C8298k.m12934e(eVar, "source");
        this.f14977a.mo5030h0(eVar, j);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f14977a + ')';
    }
}
