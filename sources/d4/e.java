package d4;

import c5.l0;
import com.google.android.exoplayer2.extractor.g;
import t3.r;

public final class e implements g {
    public final c f6194a;
    public final int f6195b;
    public final long f6196c;
    public final long f6197d;
    public final long f6198e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f6194a = cVar;
        this.f6195b = i10;
        this.f6196c = j10;
        long j12 = (j11 - j10) / cVar.f6189e;
        this.f6197d = j12;
        this.f6198e = a(j12);
    }

    public final long a(long j10) {
        return l0.z0(j10 * this.f6195b, 1000000L, this.f6194a.f6187c);
    }

    @Override
    public long d() {
        return this.f6198e;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public g.a i(long j10) {
        long q10 = l0.q((this.f6194a.f6187c * j10) / (this.f6195b * 1000000), 0L, this.f6197d - 1);
        long j11 = this.f6196c + (this.f6194a.f6189e * q10);
        long a10 = a(q10);
        r rVar = new r(a10, j11);
        if (a10 >= j10 || q10 == this.f6197d - 1) {
            return new g.a(rVar);
        }
        long j12 = q10 + 1;
        return new g.a(rVar, new r(a(j12), this.f6196c + (this.f6194a.f6189e * j12)));
    }
}
