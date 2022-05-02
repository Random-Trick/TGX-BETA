package p250r9;

import p065ea.AbstractC4177b;
import p192n9.EnumC7313d;
import p289u9.AbstractC9463c;
import p289u9.AbstractC9475i;
import qa.C8298k;

public final class C8403e extends AbstractC9463c<C8401c, AbstractC8400b> {
    public Long f27286c;
    public Long f27287d;
    public final EnumC7313d f27288e;
    public final AbstractC4177b f27289f;

    public C8403e(EnumC7313d dVar, AbstractC4177b bVar) {
        C8298k.m12934e(dVar, "track");
        C8298k.m12934e(bVar, "interpolator");
        this.f27288e = dVar;
        this.f27289f = bVar;
    }

    @Override
    public AbstractC9475i<C8401c> mo5858g(AbstractC9475i.C9477b<C8401c> bVar, boolean z) {
        double d;
        C8298k.m12934e(bVar, "state");
        if (bVar instanceof AbstractC9475i.C9476a) {
            return bVar;
        }
        if (!(bVar.m8558a() instanceof C8404f)) {
            long c = bVar.m8558a().m12571c();
            long a = this.f27289f.mo15003a(this.f27288e, c);
            Long l = this.f27286c;
            if (l == null) {
                d = 1.0d;
            } else {
                C8298k.m12936c(l);
                Long l2 = this.f27287d;
                C8298k.m12936c(l2);
                d = (a - l.longValue()) / (c - l2.longValue());
            }
            double d2 = d;
            this.f27286c = Long.valueOf(a);
            this.f27287d = Long.valueOf(c);
            return new AbstractC9475i.C9477b(new C8404f(bVar.m8558a().m12573a(), c, a, d2, bVar.m8558a().m12572b()));
        }
        throw new IllegalArgumentException("Can't apply DecoderTimer twice.".toString());
    }
}
