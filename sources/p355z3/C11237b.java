package p355z3;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import p020b5.C1216l0;
import p020b5.C1231t;
import p270t3.C8972r;

public final class C11237b implements AbstractC11242g {
    public final long f35969a;
    public final C1231t f35970b;
    public final C1231t f35971c;
    public long f35972d;

    public C11237b(long j, long j2, long j3) {
        this.f35972d = j;
        this.f35969a = j3;
        C1231t tVar = new C1231t();
        this.f35970b = tVar;
        C1231t tVar2 = new C1231t();
        this.f35971c = tVar2;
        tVar.m37882a(0L);
        tVar2.m37882a(j2);
    }

    public boolean m1161a(long j) {
        C1231t tVar = this.f35970b;
        return j - tVar.m37881b(tVar.m37880c() - 1) < 100000;
    }

    public void m1160b(long j, long j2) {
        if (!m1161a(j)) {
            this.f35970b.m37882a(j);
            this.f35971c.m37882a(j2);
        }
    }

    @Override
    public long mo1127c() {
        return this.f35969a;
    }

    @Override
    public long mo1126d() {
        return this.f35972d;
    }

    public void m1159e(long j) {
        this.f35972d = j;
    }

    @Override
    public boolean mo1125g() {
        return true;
    }

    @Override
    public long mo1124h(long j) {
        return this.f35970b.m37881b(C1216l0.m37979f(this.f35971c, j, true, true));
    }

    @Override
    public AbstractC3470g.C3471a mo1123i(long j) {
        int f = C1216l0.m37979f(this.f35970b, j, true, true);
        C8972r rVar = new C8972r(this.f35970b.m37881b(f), this.f35971c.m37881b(f));
        if (rVar.f28862a == j || f == this.f35970b.m37880c() - 1) {
            return new AbstractC3470g.C3471a(rVar);
        }
        int i = f + 1;
        return new AbstractC3470g.C3471a(rVar, new C8972r(this.f35970b.m37881b(i), this.f35971c.m37881b(i)));
    }
}
