package q9;

import ia.q;
import java.nio.ShortBuffer;
import ra.g;
import ra.k;
import ra.l;

public final class b {
    public static final b f21480e;
    public static final C0199b f21481f = new C0199b(null);
    public final ShortBuffer f21482a;
    public final long f21483b;
    public final double f21484c;
    public final qa.a<q> f21485d;

    public static final class a extends l implements qa.a<q> {
        public static final a f21486b = new a();

        public a() {
            super(0);
        }

        @Override
        public q b() {
            f();
            return q.f14159a;
        }

        public final void f() {
        }
    }

    public static final class C0199b {
        public C0199b() {
        }

        public C0199b(g gVar) {
            this();
        }

        public final b a() {
            return b.f21480e;
        }
    }

    static {
        ShortBuffer allocate = ShortBuffer.allocate(0);
        k.d(allocate, "ShortBuffer.allocate(0)");
        f21480e = new b(allocate, 0L, 0.0d, a.f21486b);
    }

    public b(ShortBuffer shortBuffer, long j10, double d10, qa.a<q> aVar) {
        k.e(shortBuffer, "buffer");
        k.e(aVar, "release");
        this.f21482a = shortBuffer;
        this.f21483b = j10;
        this.f21484c = d10;
        this.f21485d = aVar;
    }

    public static b c(b bVar, ShortBuffer shortBuffer, long j10, double d10, qa.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            shortBuffer = bVar.f21482a;
        }
        if ((i10 & 2) != 0) {
            j10 = bVar.f21483b;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            d10 = bVar.f21484c;
        }
        double d11 = d10;
        qa.a<q> aVar2 = aVar;
        if ((i10 & 8) != 0) {
            aVar2 = bVar.f21485d;
        }
        return bVar.b(shortBuffer, j11, d11, aVar2);
    }

    public final b b(ShortBuffer shortBuffer, long j10, double d10, qa.a<q> aVar) {
        k.e(shortBuffer, "buffer");
        k.e(aVar, "release");
        return new b(shortBuffer, j10, d10, aVar);
    }

    public final ShortBuffer d() {
        return this.f21482a;
    }

    public final qa.a<q> e() {
        return this.f21485d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.f21482a, bVar.f21482a) && this.f21483b == bVar.f21483b && Double.compare(this.f21484c, bVar.f21484c) == 0 && k.b(this.f21485d, bVar.f21485d);
    }

    public final double f() {
        return this.f21484c;
    }

    public final long g() {
        return this.f21483b;
    }

    public int hashCode() {
        ShortBuffer shortBuffer = this.f21482a;
        int i10 = 0;
        int hashCode = shortBuffer != null ? shortBuffer.hashCode() : 0;
        long j10 = this.f21483b;
        long doubleToLongBits = Double.doubleToLongBits(this.f21484c);
        int i11 = ((((hashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        qa.a<q> aVar = this.f21485d;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "Chunk(buffer=" + this.f21482a + ", timeUs=" + this.f21483b + ", timeStretch=" + this.f21484c + ", release=" + this.f21485d + ")";
    }
}
