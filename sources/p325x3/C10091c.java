package p325x3;

import p020b5.C1186a;
import p270t3.AbstractC8959g;
import p270t3.C8968n;

public final class C10091c extends C8968n {
    public final long f32781b;

    public C10091c(AbstractC8959g gVar, long j) {
        super(gVar);
        C1186a.m38192a(gVar.mo6043r() >= j);
        this.f32781b = j;
    }

    @Override
    public long mo6046a() {
        return super.mo6046a() - this.f32781b;
    }

    @Override
    public long mo6045f() {
        return super.mo6045f() - this.f32781b;
    }

    @Override
    public <E extends Throwable> void mo6044j(long j, E e) {
        super.mo6044j(j + this.f32781b, e);
    }

    @Override
    public long mo6043r() {
        return super.mo6043r() - this.f32781b;
    }
}
