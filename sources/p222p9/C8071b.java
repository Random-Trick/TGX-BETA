package p222p9;

import java.nio.ShortBuffer;
import p107ha.C5060q;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;

public final class C8071b {
    public static final C8071b f26294e;
    public static final C8073b f26295f = new C8073b(null);
    public final ShortBuffer f26296a;
    public final long f26297b;
    public final double f26298c;
    public final AbstractC8077a<C5060q> f26299d;

    public static final class C8072a extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public static final C8072a f26300b = new C8072a();

        public C8072a() {
            super(0);
        }

        @Override
        public C5060q mo4925b() {
            m13619f();
            return C5060q.f17066a;
        }

        public final void m13619f() {
        }
    }

    public static final class C8073b {
        public C8073b() {
        }

        public final C8071b m13618a() {
            return C8071b.f26294e;
        }

        public C8073b(C8294g gVar) {
            this();
        }
    }

    static {
        ShortBuffer allocate = ShortBuffer.allocate(0);
        C8298k.m12935d(allocate, "ShortBuffer.allocate(0)");
        f26294e = new C8071b(allocate, 0L, 0.0d, C8072a.f26300b);
    }

    public C8071b(ShortBuffer shortBuffer, long j, double d, AbstractC8077a<C5060q> aVar) {
        C8298k.m12934e(shortBuffer, "buffer");
        C8298k.m12934e(aVar, "release");
        this.f26296a = shortBuffer;
        this.f26297b = j;
        this.f26298c = d;
        this.f26299d = aVar;
    }

    public static C8071b m13624c(C8071b bVar, ShortBuffer shortBuffer, long j, double d, AbstractC8077a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            shortBuffer = bVar.f26296a;
        }
        if ((i & 2) != 0) {
            j = bVar.f26297b;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            d = bVar.f26298c;
        }
        double d2 = d;
        AbstractC8077a<C5060q> aVar2 = aVar;
        if ((i & 8) != 0) {
            aVar2 = bVar.f26299d;
        }
        return bVar.m13625b(shortBuffer, j2, d2, aVar2);
    }

    public final C8071b m13625b(ShortBuffer shortBuffer, long j, double d, AbstractC8077a<C5060q> aVar) {
        C8298k.m12934e(shortBuffer, "buffer");
        C8298k.m12934e(aVar, "release");
        return new C8071b(shortBuffer, j, d, aVar);
    }

    public final ShortBuffer m13623d() {
        return this.f26296a;
    }

    public final AbstractC8077a<C5060q> m13622e() {
        return this.f26299d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8071b)) {
            return false;
        }
        C8071b bVar = (C8071b) obj;
        return C8298k.m12937b(this.f26296a, bVar.f26296a) && this.f26297b == bVar.f26297b && Double.compare(this.f26298c, bVar.f26298c) == 0 && C8298k.m12937b(this.f26299d, bVar.f26299d);
    }

    public final double m13621f() {
        return this.f26298c;
    }

    public final long m13620g() {
        return this.f26297b;
    }

    public int hashCode() {
        ShortBuffer shortBuffer = this.f26296a;
        int i = 0;
        int hashCode = shortBuffer != null ? shortBuffer.hashCode() : 0;
        long j = this.f26297b;
        long doubleToLongBits = Double.doubleToLongBits(this.f26298c);
        int i2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        AbstractC8077a<C5060q> aVar = this.f26299d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "Chunk(buffer=" + this.f26296a + ", timeUs=" + this.f26297b + ", timeStretch=" + this.f26298c + ", release=" + this.f26299d + ")";
    }
}
