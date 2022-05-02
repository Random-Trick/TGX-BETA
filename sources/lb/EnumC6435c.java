package lb;

public abstract class EnumC6435c extends Enum<EnumC6435c> {
    public static final EnumC6435c f20118M;
    public static final EnumC6435c f20119N;
    public static final EnumC6435c f20120O;
    public static final EnumC6435c f20121P;
    public static final EnumC6435c f20122Q;
    public static final EnumC6435c f20123R;
    public static final EnumC6435c f20124S;
    public static final EnumC6435c f20125T;
    public static final EnumC6435c f20132a;
    public static final EnumC6435c f20134b;
    public static final EnumC6435c f20136c;
    public static final EnumC6435c[] f20139e0;
    public static final double f20126U = Math.pow(2.0d, 10.0d);
    public static final double f20127V = Math.pow(2.0d, 20.0d);
    public static final double f20128W = Math.pow(2.0d, 30.0d);
    public static final double f20129X = Math.pow(2.0d, 40.0d);
    public static final double f20130Y = Math.pow(2.0d, 50.0d);
    public static final double f20131Z = Math.pow(10.0d, 3.0d);
    public static final double f20133a0 = Math.pow(10.0d, 6.0d);
    public static final double f20135b0 = Math.pow(10.0d, 9.0d);
    public static final double f20137c0 = Math.pow(10.0d, 12.0d);
    public static final double f20138d0 = Math.pow(10.0d, 15.0d);

    public final class C6436a extends EnumC6435c {
        public C6436a(String str, int i) {
            super(str, i);
        }

        @Override
        public double mo20403b(double d) {
            return EnumC6435c.m20405a(d, EnumC6435c.f20137c0);
        }
    }

    public final class C6437b extends EnumC6435c {
        public C6437b(String str, int i) {
            super(str, i);
        }

        @Override
        public double mo20403b(double d) {
            return EnumC6435c.m20405a(d, EnumC6435c.f20138d0);
        }
    }

    public final class C6438c extends EnumC6435c {
        public C6438c(String str, int i) {
            super(str, i);
        }

        @Override
        public double mo20403b(double d) {
            return d;
        }
    }

    public final class C6439d extends EnumC6435c {
        public C6439d(String str, int i) {
            super(str, i);
        }

        @Override
        public double mo20403b(double d) {
            return EnumC6435c.m20405a(d, EnumC6435c.f20126U);
        }
    }

    public final class C6440e extends EnumC6435c {
        public C6440e(String str, int i) {
            super(str, i);
        }

        @Override
        public double mo20403b(double d) {
            return EnumC6435c.m20405a(d, EnumC6435c.f20127V);
        }
    }

    public final class C6441f extends EnumC6435c {
        public C6441f(String str, int i) {
            super(str, i);
        }

        @Override
        public double mo20403b(double d) {
            return EnumC6435c.m20405a(d, EnumC6435c.f20128W);
        }
    }

    public final class C6442g extends EnumC6435c {
        public C6442g(String str, int i) {
            super(str, i);
        }

        @Override
        public double mo20403b(double d) {
            return EnumC6435c.m20405a(d, EnumC6435c.f20129X);
        }
    }

    public final class C6443h extends EnumC6435c {
        public C6443h(String str, int i) {
            super(str, i);
        }

        @Override
        public double mo20403b(double d) {
            return EnumC6435c.m20405a(d, EnumC6435c.f20130Y);
        }
    }

    public final class C6444i extends EnumC6435c {
        public C6444i(String str, int i) {
            super(str, i);
        }

        @Override
        public double mo20403b(double d) {
            return EnumC6435c.m20405a(d, EnumC6435c.f20131Z);
        }
    }

    public final class C6445j extends EnumC6435c {
        public C6445j(String str, int i) {
            super(str, i);
        }

        @Override
        public double mo20403b(double d) {
            return EnumC6435c.m20405a(d, EnumC6435c.f20133a0);
        }
    }

    public final class C6446k extends EnumC6435c {
        public C6446k(String str, int i) {
            super(str, i);
        }

        @Override
        public double mo20403b(double d) {
            return EnumC6435c.m20405a(d, EnumC6435c.f20135b0);
        }
    }

    static {
        C6438c cVar = new C6438c("BIT", 0);
        f20132a = cVar;
        C6439d dVar = new C6439d("KIBIT", 1);
        f20134b = dVar;
        C6440e eVar = new C6440e("MIBIT", 2);
        f20136c = eVar;
        C6441f fVar = new C6441f("GIBIT", 3);
        f20118M = fVar;
        C6442g gVar = new C6442g("TIBIT", 4);
        f20119N = gVar;
        C6443h hVar = new C6443h("PIBIT", 5);
        f20120O = hVar;
        C6444i iVar = new C6444i("KBIT", 6);
        f20121P = iVar;
        C6445j jVar = new C6445j("MBIT", 7);
        f20122Q = jVar;
        C6446k kVar = new C6446k("GBIT", 8);
        f20123R = kVar;
        C6436a aVar = new C6436a("TBIT", 9);
        f20124S = aVar;
        C6437b bVar = new C6437b("PBIT", 10);
        f20125T = bVar;
        f20139e0 = new EnumC6435c[]{cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar, kVar, aVar, bVar};
    }

    public EnumC6435c(String str, int i) {
    }

    public static final double m20405a(double d, double d2) {
        double d3 = Double.MAX_VALUE / d2;
        if (d > d3) {
            return Double.MAX_VALUE;
        }
        if (d < (-d3)) {
            return Double.MIN_VALUE;
        }
        return d * d2;
    }

    public static EnumC6435c valueOf(String str) {
        return (EnumC6435c) Enum.valueOf(EnumC6435c.class, str);
    }

    public static EnumC6435c[] values() {
        return (EnumC6435c[]) f20139e0.clone();
    }

    public abstract double mo20403b(double d);

    public final double m20404c(double d) {
        return mo20403b(d) / f20131Z;
    }
}
