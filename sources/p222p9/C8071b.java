package p222p9;

import java.nio.ShortBuffer;
import p107ha.C5060q;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;

public final class C8071b {
    public static final C8071b f26297e;
    public static final C8073b f26298f = new C8073b(null);
    public final ShortBuffer f26299a;
    public final long f26300b;
    public final double f26301c;
    public final AbstractC8077a<C5060q> f26302d;

    public static final class C8072a extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public static final C8072a f26303b = new C8072a();

        public C8072a() {
            super(0);
        }

        @Override
        public C5060q mo4925b() {
            m13618f();
            return C5060q.f17066a;
        }

        public final void m13618f() {
        }
    }

    public static final class C8073b {
        public C8073b() {
        }

        public final C8071b m13617a() {
            return C8071b.f26297e;
        }

        public C8073b(C8294g gVar) {
            this();
        }
    }

    static {
        ShortBuffer allocate = ShortBuffer.allocate(0);
        C8298k.m12934d(allocate, "ShortBuffer.allocate(0)");
        f26297e = new C8071b(allocate, 0L, 0.0d, C8072a.f26303b);
    }

    public C8071b(ShortBuffer shortBuffer, long j, double d, AbstractC8077a<C5060q> aVar) {
        C8298k.m12933e(shortBuffer, "buffer");
        C8298k.m12933e(aVar, "release");
        this.f26299a = shortBuffer;
        this.f26300b = j;
        this.f26301c = d;
        this.f26302d = aVar;
    }

    public static C8071b m13623c(C8071b bVar, ShortBuffer shortBuffer, long j, double d, AbstractC8077a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            shortBuffer = bVar.f26299a;
        }
        if ((i & 2) != 0) {
            j = bVar.f26300b;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            d = bVar.f26301c;
        }
        double d2 = d;
        AbstractC8077a<C5060q> aVar2 = aVar;
        if ((i & 8) != 0) {
            aVar2 = bVar.f26302d;
        }
        return bVar.m13624b(shortBuffer, j2, d2, aVar2);
    }

    public final C8071b m13624b(ShortBuffer shortBuffer, long j, double d, AbstractC8077a<C5060q> aVar) {
        C8298k.m12933e(shortBuffer, "buffer");
        C8298k.m12933e(aVar, "release");
        return new C8071b(shortBuffer, j, d, aVar);
    }

    public final ShortBuffer m13622d() {
        return this.f26299a;
    }

    public final AbstractC8077a<C5060q> m13621e() {
        return this.f26302d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8071b)) {
            return false;
        }
        C8071b bVar = (C8071b) obj;
        return C8298k.m12936b(this.f26299a, bVar.f26299a) && this.f26300b == bVar.f26300b && Double.compare(this.f26301c, bVar.f26301c) == 0 && C8298k.m12936b(this.f26302d, bVar.f26302d);
    }

    public final double m13620f() {
        return this.f26301c;
    }

    public final long m13619g() {
        return this.f26300b;
    }

    public int hashCode() {
        ShortBuffer shortBuffer = this.f26299a;
        int i = 0;
        int hashCode = shortBuffer != null ? shortBuffer.hashCode() : 0;
        long j = this.f26300b;
        long doubleToLongBits = Double.doubleToLongBits(this.f26301c);
        int i2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        AbstractC8077a<C5060q> aVar = this.f26302d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "Chunk(buffer=" + this.f26299a + ", timeUs=" + this.f26300b + ", timeStretch=" + this.f26301c + ", release=" + this.f26302d + ")";
    }
}
