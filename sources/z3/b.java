package z3;

import c5.l0;
import c5.t;
import com.google.android.exoplayer2.extractor.g;
import t3.r;

public final class b implements g {
    public final long f26840a;
    public final t f26841b;
    public final t f26842c;
    public long f26843d;

    public b(long j10, long j11, long j12) {
        this.f26843d = j10;
        this.f26840a = j12;
        t tVar = new t();
        this.f26841b = tVar;
        t tVar2 = new t();
        this.f26842c = tVar2;
        tVar.a(0L);
        tVar2.a(j11);
    }

    public boolean a(long j10) {
        t tVar = this.f26841b;
        return j10 - tVar.b(tVar.c() - 1) < 100000;
    }

    public void b(long j10, long j11) {
        if (!a(j10)) {
            this.f26841b.a(j10);
            this.f26842c.a(j11);
        }
    }

    @Override
    public long c() {
        return this.f26840a;
    }

    @Override
    public long d() {
        return this.f26843d;
    }

    public void e(long j10) {
        this.f26843d = j10;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public long h(long j10) {
        return this.f26841b.b(l0.f(this.f26842c, j10, true, true));
    }

    @Override
    public g.a i(long j10) {
        int f10 = l0.f(this.f26841b, j10, true, true);
        r rVar = new r(this.f26841b.b(f10), this.f26842c.b(f10));
        if (rVar.f22901a == j10 || f10 == this.f26841b.c() - 1) {
            return new g.a(rVar);
        }
        int i10 = f10 + 1;
        return new g.a(rVar, new r(this.f26841b.b(i10), this.f26842c.b(i10)));
    }
}
