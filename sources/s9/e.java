package s9;

import fa.b;
import o9.d;
import ra.k;
import v9.c;
import v9.i;

public final class e extends c<c, b> {
    public Long f22656c;
    public Long f22657d;
    public final d f22658e;
    public final b f22659f;

    public e(d dVar, b bVar) {
        k.e(dVar, "track");
        k.e(bVar, "interpolator");
        this.f22658e = dVar;
        this.f22659f = bVar;
    }

    @Override
    public i<c> i(i.b<c> bVar, boolean z10) {
        double d10;
        k.e(bVar, "state");
        if (bVar instanceof i.a) {
            return bVar;
        }
        if (!(bVar.a() instanceof f)) {
            long c10 = bVar.a().c();
            long a10 = this.f22659f.a(this.f22658e, c10);
            Long l10 = this.f22656c;
            if (l10 == null) {
                d10 = 1.0d;
            } else {
                k.c(l10);
                Long l11 = this.f22657d;
                k.c(l11);
                d10 = (a10 - l10.longValue()) / (c10 - l11.longValue());
            }
            double d11 = d10;
            this.f22656c = Long.valueOf(a10);
            this.f22657d = Long.valueOf(c10);
            return new i.b(new f(bVar.a().a(), c10, a10, d11, bVar.a().b()));
        }
        throw new IllegalArgumentException("Can't apply DecoderTimer twice.".toString());
    }
}
