package p250r9;

import p065ea.AbstractC4177b;
import p192n9.EnumC7313d;
import p289u9.AbstractC9463c;
import p289u9.AbstractC9475i;
import qa.C8298k;

public final class C8403e extends AbstractC9463c<C8401c, AbstractC8400b> {
    public Long f27289c;
    public Long f27290d;
    public final EnumC7313d f27291e;
    public final AbstractC4177b f27292f;

    public C8403e(EnumC7313d dVar, AbstractC4177b bVar) {
        C8298k.m12933e(dVar, "track");
        C8298k.m12933e(bVar, "interpolator");
        this.f27291e = dVar;
        this.f27292f = bVar;
    }

    @Override
    public AbstractC9475i<C8401c> mo5858g(AbstractC9475i.C9477b<C8401c> bVar, boolean z) {
        double d;
        C8298k.m12933e(bVar, "state");
        if (bVar instanceof AbstractC9475i.C9476a) {
            return bVar;
        }
        if (!(bVar.m8558a() instanceof C8404f)) {
            long c = bVar.m8558a().m12570c();
            long a = this.f27292f.mo15003a(this.f27291e, c);
            Long l = this.f27289c;
            if (l == null) {
                d = 1.0d;
            } else {
                C8298k.m12935c(l);
                Long l2 = this.f27290d;
                C8298k.m12935c(l2);
                d = (a - l.longValue()) / (c - l2.longValue());
            }
            double d2 = d;
            this.f27289c = Long.valueOf(a);
            this.f27290d = Long.valueOf(c);
            return new AbstractC9475i.C9477b(new C8404f(bVar.m8558a().m12572a(), c, a, d2, bVar.m8558a().m12571b()));
        }
        throw new IllegalArgumentException("Can't apply DecoderTimer twice.".toString());
    }
}
