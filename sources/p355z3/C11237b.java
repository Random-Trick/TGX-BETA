package p355z3;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import p020b5.C1216l0;
import p020b5.C1231t;
import p270t3.C8972r;

public final class C11237b implements AbstractC11242g {
    public final long f35966a;
    public final C1231t f35967b;
    public final C1231t f35968c;
    public long f35969d;

    public C11237b(long j, long j2, long j3) {
        this.f35969d = j;
        this.f35966a = j3;
        C1231t tVar = new C1231t();
        this.f35967b = tVar;
        C1231t tVar2 = new C1231t();
        this.f35968c = tVar2;
        tVar.m37879a(0L);
        tVar2.m37879a(j2);
    }

    public boolean m1161a(long j) {
        C1231t tVar = this.f35967b;
        return j - tVar.m37878b(tVar.m37877c() - 1) < 100000;
    }

    public void m1160b(long j, long j2) {
        if (!m1161a(j)) {
            this.f35967b.m37879a(j);
            this.f35968c.m37879a(j2);
        }
    }

    @Override
    public long mo1127c() {
        return this.f35966a;
    }

    @Override
    public long mo1126d() {
        return this.f35969d;
    }

    public void m1159e(long j) {
        this.f35969d = j;
    }

    @Override
    public boolean mo1125g() {
        return true;
    }

    @Override
    public long mo1124h(long j) {
        return this.f35967b.m37878b(C1216l0.m37976f(this.f35968c, j, true, true));
    }

    @Override
    public AbstractC3470g.C3471a mo1123i(long j) {
        int f = C1216l0.m37976f(this.f35967b, j, true, true);
        C8972r rVar = new C8972r(this.f35967b.m37878b(f), this.f35968c.m37878b(f));
        if (rVar.f28859a == j || f == this.f35967b.m37877c() - 1) {
            return new AbstractC3470g.C3471a(rVar);
        }
        int i = f + 1;
        return new AbstractC3470g.C3471a(rVar, new C8972r(this.f35967b.m37878b(i), this.f35968c.m37878b(i)));
    }
}
