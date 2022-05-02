package p205o9;

import ba.AbstractC1296b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p065ea.AbstractC4177b;
import p107ha.C5048h;
import p107ha.C5054l;
import p123ia.C5304n;
import p192n9.EnumC7313d;
import p316w9.AbstractC10012l;
import p316w9.C10007i;
import qa.C8298k;

public final class C7806h {
    public final C10007i f25004a = new C10007i("Timer");
    public final AbstractC10012l<Long> f25005b = new C7809c();
    public final AbstractC10012l<Long> f25006c = new C7807a();
    public final AbstractC10012l<Double> f25007d = new C7810d();
    public final Map<C5048h<EnumC7313d, Integer>, AbstractC4177b> f25008e = new LinkedHashMap();
    public final AbstractC4177b f25009f;
    public final C7802d f25010g;
    public final C7811i f25011h;
    public final AbstractC10012l<Integer> f25012i;

    public static final class C7807a implements AbstractC10012l<Long> {
        public C7807a() {
        }

        @Override
        public boolean mo6237g(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return true;
        }

        @Override
        public int getSize() {
            return AbstractC10012l.C10013a.m6227f(this);
        }

        public Long mo6234n() {
            return (Long) AbstractC10012l.C10013a.m6232a(this);
        }

        public Long mo6239d(EnumC7313d dVar) {
            long j;
            C8298k.m12934e(dVar, "type");
            if (!C7806h.this.f25011h.m14990a().mo6237g(dVar)) {
                j = 0;
            } else {
                C7806h hVar = C7806h.this;
                j = hVar.m15016h(hVar.f25010g.mo6239d(dVar), ((Number) C7806h.this.f25012i.mo6239d(dVar)).intValue());
            }
            return Long.valueOf(j);
        }

        @Override
        public Iterator<Long> iterator() {
            return AbstractC10012l.C10013a.m6225h(this);
        }

        @Override
        public boolean mo6236k() {
            return AbstractC10012l.C10013a.m6230c(this);
        }

        public Long mo6241a() {
            return (Long) AbstractC10012l.C10013a.m6231b(this);
        }

        @Override
        public boolean mo6233o() {
            return AbstractC10012l.C10013a.m6229d(this);
        }

        public Long mo6238f(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return (Long) AbstractC10012l.C10013a.m6228e(this, dVar);
        }

        public Long mo6240b() {
            return (Long) AbstractC10012l.C10013a.m6226g(this);
        }

        public Long mo6235l() {
            return (Long) AbstractC10012l.C10013a.m6224i(this);
        }
    }

    public static final class C7808b implements AbstractC4177b {
        public long f25014a;
        public long f25015b = Long.MAX_VALUE;
        public final long f25016c;
        public final int f25018e;
        public final EnumC7313d f25019f;

        public C7808b(int i, EnumC7313d dVar) {
            long j;
            this.f25018e = i;
            this.f25019f = dVar;
            if (i == 0) {
                j = 0;
            } else {
                Object obj = C7806h.this.f25008e.get(C5054l.m24188a(dVar, Integer.valueOf(i - 1)));
                C8298k.m12936c(obj);
                j = ((AbstractC4177b) obj).mo15003a(dVar, Long.MAX_VALUE) + 10;
            }
            this.f25016c = j;
        }

        @Override
        public long mo15003a(EnumC7313d dVar, long j) {
            C8298k.m12934e(dVar, "type");
            if (j == Long.MAX_VALUE) {
                return this.f25014a;
            }
            if (this.f25015b == Long.MAX_VALUE) {
                this.f25015b = j;
            }
            this.f25014a = this.f25016c + (j - this.f25015b);
            return C7806h.this.f25009f.mo15003a(dVar, this.f25014a);
        }
    }

    public static final class C7809c implements AbstractC10012l<Long> {
        public C7809c() {
        }

        @Override
        public boolean mo6237g(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return true;
        }

        @Override
        public int getSize() {
            return AbstractC10012l.C10013a.m6227f(this);
        }

        public Long mo6234n() {
            return (Long) AbstractC10012l.C10013a.m6232a(this);
        }

        public Long mo6239d(EnumC7313d dVar) {
            long j;
            C8298k.m12934e(dVar, "type");
            if (!C7806h.this.f25011h.m14990a().mo6237g(dVar)) {
                j = 0;
            } else {
                C7806h hVar = C7806h.this;
                j = hVar.m15010n(hVar.f25010g.mo6239d(dVar), ((Number) C7806h.this.f25012i.mo6239d(dVar)).intValue());
            }
            return Long.valueOf(j);
        }

        @Override
        public Iterator<Long> iterator() {
            return AbstractC10012l.C10013a.m6225h(this);
        }

        @Override
        public boolean mo6236k() {
            return AbstractC10012l.C10013a.m6230c(this);
        }

        public Long mo6241a() {
            return (Long) AbstractC10012l.C10013a.m6231b(this);
        }

        @Override
        public boolean mo6233o() {
            return AbstractC10012l.C10013a.m6229d(this);
        }

        public Long mo6238f(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return (Long) AbstractC10012l.C10013a.m6228e(this, dVar);
        }

        public Long mo6240b() {
            return (Long) AbstractC10012l.C10013a.m6226g(this);
        }

        public Long mo6235l() {
            return (Long) AbstractC10012l.C10013a.m6224i(this);
        }
    }

    public static final class C7810d implements AbstractC10012l<Double> {
        public C7810d() {
        }

        @Override
        public boolean mo6237g(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return true;
        }

        @Override
        public int getSize() {
            return AbstractC10012l.C10013a.m6227f(this);
        }

        public Double mo6234n() {
            return (Double) AbstractC10012l.C10013a.m6232a(this);
        }

        public Double mo6239d(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            long longValue = C7806h.this.m15014j().mo6239d(dVar).longValue();
            long longValue2 = C7806h.this.m15015i().mo6239d(dVar).longValue();
            return Double.valueOf(longValue2 == 0 ? 0.0d : longValue / longValue2);
        }

        @Override
        public Iterator<Double> iterator() {
            return AbstractC10012l.C10013a.m6225h(this);
        }

        @Override
        public boolean mo6236k() {
            return AbstractC10012l.C10013a.m6230c(this);
        }

        public Double mo6241a() {
            return (Double) AbstractC10012l.C10013a.m6231b(this);
        }

        @Override
        public boolean mo6233o() {
            return AbstractC10012l.C10013a.m6229d(this);
        }

        public Double mo6238f(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return (Double) AbstractC10012l.C10013a.m6228e(this, dVar);
        }

        public Double mo6240b() {
            return (Double) AbstractC10012l.C10013a.m6226g(this);
        }

        public Double mo6235l() {
            return (Double) AbstractC10012l.C10013a.m6224i(this);
        }
    }

    public C7806h(AbstractC4177b bVar, C7802d dVar, C7811i iVar, AbstractC10012l<Integer> lVar) {
        C8298k.m12934e(bVar, "interpolator");
        C8298k.m12934e(dVar, "sources");
        C8298k.m12934e(iVar, "tracks");
        C8298k.m12934e(lVar, "current");
        this.f25009f = bVar;
        this.f25010g = dVar;
        this.f25011h = iVar;
        this.f25012i = lVar;
    }

    public final long m15016h(List<? extends AbstractC1296b> list, int i) {
        long j = 0;
        int i2 = 0;
        for (Object obj : list) {
            i2++;
            if (i2 < 0) {
                C5304n.m23358n();
            }
            AbstractC1296b bVar = (AbstractC1296b) obj;
            j += i2 < i ? bVar.mo6288g() : bVar.mo6291d();
        }
        return j;
    }

    public final AbstractC10012l<Long> m15015i() {
        return this.f25006c;
    }

    public final AbstractC10012l<Long> m15014j() {
        return this.f25005b;
    }

    public final AbstractC10012l<Double> m15013k() {
        return this.f25007d;
    }

    public final long m15012l() {
        long j = Long.MAX_VALUE;
        long longValue = this.f25011h.m14990a().mo6233o() ? this.f25006c.mo6240b().longValue() : Long.MAX_VALUE;
        if (this.f25011h.m14990a().mo6236k()) {
            j = this.f25006c.mo6241a().longValue();
        }
        return Math.min(longValue, j);
    }

    public final AbstractC4177b m15011m(EnumC7313d dVar, int i) {
        C8298k.m12934e(dVar, "type");
        Map<C5048h<EnumC7313d, Integer>, AbstractC4177b> map = this.f25008e;
        C5048h<EnumC7313d, Integer> a = C5054l.m24188a(dVar, Integer.valueOf(i));
        AbstractC4177b bVar = map.get(a);
        if (bVar == null) {
            bVar = new C7808b(i, dVar);
            map.put(a, bVar);
        }
        return bVar;
    }

    public final long m15010n(List<? extends AbstractC1296b> list, int i) {
        long j = 0;
        int i2 = 0;
        for (Object obj : list) {
            i2++;
            if (i2 < 0) {
                C5304n.m23358n();
            }
            AbstractC1296b bVar = (AbstractC1296b) obj;
            if (i2 <= i) {
                j += bVar.mo6288g();
            }
        }
        return j;
    }
}
