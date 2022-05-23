package hc;

import ra.k;

public abstract class i implements y {
    public final y f12649a;

    public i(y yVar) {
        k.e(yVar, "delegate");
        this.f12649a = yVar;
    }

    @Override
    public b0 c() {
        return this.f12649a.c();
    }

    @Override
    public void c0(e eVar, long j10) {
        k.e(eVar, "source");
        this.f12649a.c0(eVar, j10);
    }

    @Override
    public void close() {
        this.f12649a.close();
    }

    @Override
    public void flush() {
        this.f12649a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f12649a + ')';
    }
}
