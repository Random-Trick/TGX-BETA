package p044d4;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import p020b5.C1216l0;
import p270t3.C8972r;

public final class C3600e implements AbstractC3470g {
    public final C3597c f12273a;
    public final int f12274b;
    public final long f12275c;
    public final long f12276d;
    public final long f12277e;

    public C3600e(C3597c cVar, int i, long j, long j2) {
        this.f12273a = cVar;
        this.f12274b = i;
        this.f12275c = j;
        long j3 = (j2 - j) / cVar.f12268e;
        this.f12276d = j3;
        this.f12277e = m29893a(j3);
    }

    public final long m29893a(long j) {
        return C1216l0.m37940y0(j * this.f12274b, 1000000L, this.f12273a.f12266c);
    }

    @Override
    public long mo1126d() {
        return this.f12277e;
    }

    @Override
    public boolean mo1125g() {
        return true;
    }

    @Override
    public AbstractC3470g.C3471a mo1123i(long j) {
        long q = C1216l0.m37957q((this.f12273a.f12266c * j) / (this.f12274b * 1000000), 0L, this.f12276d - 1);
        long j2 = this.f12275c + (this.f12273a.f12268e * q);
        long a = m29893a(q);
        C8972r rVar = new C8972r(a, j2);
        if (a >= j || q == this.f12276d - 1) {
            return new AbstractC3470g.C3471a(rVar);
        }
        long j3 = q + 1;
        return new AbstractC3470g.C3471a(rVar, new C8972r(m29893a(j3), this.f12275c + (this.f12273a.f12268e * j3)));
    }
}
