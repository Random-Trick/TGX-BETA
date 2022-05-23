package j$.util.stream;

import j$.util.function.v;

public final class C0362o0 implements v {
    public final int f14827a;
    public final Object f14828b;

    public C0362o0(Object obj, int i10) {
        this.f14827a = i10;
        this.f14828b = obj;
    }

    @Override
    public final void e(long j10) {
        switch (this.f14827a) {
            case 0:
                ((AbstractC0378r2) this.f14828b).e(j10);
                return;
            default:
                ((C0367p0) this.f14828b).f14819a.e(j10);
                return;
        }
    }
}
