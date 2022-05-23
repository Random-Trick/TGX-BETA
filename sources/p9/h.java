package p9;

import ja.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ra.k;
import x9.i;
import x9.l;

public final class h {
    public final i f20954a = new i("Timer");
    public final l<Long> f20955b = new c();
    public final l<Long> f20956c = new a();
    public final l<Double> f20957d = new d();
    public final Map<ia.h<o9.d, Integer>, fa.b> f20958e = new LinkedHashMap();
    public final fa.b f20959f;
    public final p9.d f20960g;
    public final i f20961h;
    public final l<Integer> f20962i;

    public static final class a implements l<Long> {
        public a() {
        }

        public Long k() {
            return (Long) l.a.a(this);
        }

        public Long n(o9.d dVar) {
            long j10;
            k.e(dVar, "type");
            if (!h.this.f20961h.a().q(dVar)) {
                j10 = 0;
            } else {
                h hVar = h.this;
                j10 = hVar.h(hVar.f20960g.n(dVar), ((Number) h.this.f20962i.n(dVar)).intValue());
            }
            return Long.valueOf(j10);
        }

        @Override
        public int getSize() {
            return l.a.f(this);
        }

        @Override
        public boolean i() {
            return l.a.c(this);
        }

        @Override
        public Iterator<Long> iterator() {
            return l.a.h(this);
        }

        @Override
        public boolean l() {
            return l.a.d(this);
        }

        public Long a() {
            return (Long) l.a.b(this);
        }

        @Override
        public boolean q(o9.d dVar) {
            k.e(dVar, "type");
            return true;
        }

        public Long o(o9.d dVar) {
            k.e(dVar, "type");
            return (Long) l.a.e(this, dVar);
        }

        public Long b() {
            return (Long) l.a.g(this);
        }

        public Long j() {
            return (Long) l.a.i(this);
        }
    }

    public static final class b implements fa.b {
        public long f20964a;
        public long f20965b = Long.MAX_VALUE;
        public final long f20966c;
        public final int f20968e;
        public final o9.d f20969f;

        public b(int i10, o9.d dVar) {
            long j10;
            this.f20968e = i10;
            this.f20969f = dVar;
            if (i10 == 0) {
                j10 = 0;
            } else {
                Object obj = h.this.f20958e.get(ia.l.a(dVar, Integer.valueOf(i10 - 1)));
                k.c(obj);
                j10 = ((fa.b) obj).a(dVar, Long.MAX_VALUE) + 10;
            }
            this.f20966c = j10;
        }

        @Override
        public long a(o9.d dVar, long j10) {
            k.e(dVar, "type");
            if (j10 == Long.MAX_VALUE) {
                return this.f20964a;
            }
            if (this.f20965b == Long.MAX_VALUE) {
                this.f20965b = j10;
            }
            this.f20964a = this.f20966c + (j10 - this.f20965b);
            return h.this.f20959f.a(dVar, this.f20964a);
        }
    }

    public static final class c implements l<Long> {
        public c() {
        }

        public Long k() {
            return (Long) l.a.a(this);
        }

        public Long n(o9.d dVar) {
            long j10;
            k.e(dVar, "type");
            if (!h.this.f20961h.a().q(dVar)) {
                j10 = 0;
            } else {
                h hVar = h.this;
                j10 = hVar.n(hVar.f20960g.n(dVar), ((Number) h.this.f20962i.n(dVar)).intValue());
            }
            return Long.valueOf(j10);
        }

        @Override
        public int getSize() {
            return l.a.f(this);
        }

        @Override
        public boolean i() {
            return l.a.c(this);
        }

        @Override
        public Iterator<Long> iterator() {
            return l.a.h(this);
        }

        @Override
        public boolean l() {
            return l.a.d(this);
        }

        public Long a() {
            return (Long) l.a.b(this);
        }

        @Override
        public boolean q(o9.d dVar) {
            k.e(dVar, "type");
            return true;
        }

        public Long o(o9.d dVar) {
            k.e(dVar, "type");
            return (Long) l.a.e(this, dVar);
        }

        public Long b() {
            return (Long) l.a.g(this);
        }

        public Long j() {
            return (Long) l.a.i(this);
        }
    }

    public static final class d implements l<Double> {
        public d() {
        }

        public Double k() {
            return (Double) l.a.a(this);
        }

        public Double n(o9.d dVar) {
            k.e(dVar, "type");
            long longValue = h.this.j().n(dVar).longValue();
            long longValue2 = h.this.i().n(dVar).longValue();
            return Double.valueOf(longValue2 == 0 ? 0.0d : longValue / longValue2);
        }

        @Override
        public int getSize() {
            return l.a.f(this);
        }

        @Override
        public boolean i() {
            return l.a.c(this);
        }

        @Override
        public Iterator<Double> iterator() {
            return l.a.h(this);
        }

        @Override
        public boolean l() {
            return l.a.d(this);
        }

        public Double a() {
            return (Double) l.a.b(this);
        }

        @Override
        public boolean q(o9.d dVar) {
            k.e(dVar, "type");
            return true;
        }

        public Double o(o9.d dVar) {
            k.e(dVar, "type");
            return (Double) l.a.e(this, dVar);
        }

        public Double b() {
            return (Double) l.a.g(this);
        }

        public Double j() {
            return (Double) l.a.i(this);
        }
    }

    public h(fa.b bVar, p9.d dVar, i iVar, l<Integer> lVar) {
        k.e(bVar, "interpolator");
        k.e(dVar, "sources");
        k.e(iVar, "tracks");
        k.e(lVar, "current");
        this.f20959f = bVar;
        this.f20960g = dVar;
        this.f20961h = iVar;
        this.f20962i = lVar;
    }

    public final long h(List<? extends ca.b> list, int i10) {
        long j10 = 0;
        int i11 = 0;
        for (Object obj : list) {
            i11++;
            if (i11 < 0) {
                n.n();
            }
            ca.b bVar = (ca.b) obj;
            j10 += i11 < i10 ? bVar.g() : bVar.d();
        }
        return j10;
    }

    public final l<Long> i() {
        return this.f20956c;
    }

    public final l<Long> j() {
        return this.f20955b;
    }

    public final l<Double> k() {
        return this.f20957d;
    }

    public final long l() {
        long j10 = Long.MAX_VALUE;
        long longValue = this.f20961h.a().l() ? this.f20956c.b().longValue() : Long.MAX_VALUE;
        if (this.f20961h.a().i()) {
            j10 = this.f20956c.a().longValue();
        }
        return Math.min(longValue, j10);
    }

    public final fa.b m(o9.d dVar, int i10) {
        k.e(dVar, "type");
        Map<ia.h<o9.d, Integer>, fa.b> map = this.f20958e;
        ia.h<o9.d, Integer> a10 = ia.l.a(dVar, Integer.valueOf(i10));
        fa.b bVar = map.get(a10);
        if (bVar == null) {
            bVar = new b(i10, dVar);
            map.put(a10, bVar);
        }
        return bVar;
    }

    public final long n(List<? extends ca.b> list, int i10) {
        long j10 = 0;
        int i11 = 0;
        for (Object obj : list) {
            i11++;
            if (i11 < 0) {
                n.n();
            }
            ca.b bVar = (ca.b) obj;
            if (i11 <= i10) {
                j10 += bVar.g();
            }
        }
        return j10;
    }
}
