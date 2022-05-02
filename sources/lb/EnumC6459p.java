package lb;

public abstract class EnumC6459p extends Enum<EnumC6459p> {
    public static final EnumC6459p f20140M;
    public static final EnumC6459p f20141N;
    public static final EnumC6459p f20142O;
    public static final EnumC6459p f20143P;
    public static final EnumC6459p f20144Q;
    public static final EnumC6459p f20145R;
    public static final EnumC6459p f20146S;
    public static final EnumC6459p f20147T;
    public static final EnumC6459p f20154a;
    public static final EnumC6459p f20156b;
    public static final EnumC6459p f20158c;
    public static final EnumC6459p[] f20161e0;
    public static final double f20148U = Math.pow(2.0d, 10.0d);
    public static final double f20149V = Math.pow(2.0d, 20.0d);
    public static final double f20150W = Math.pow(2.0d, 30.0d);
    public static final double f20151X = Math.pow(2.0d, 40.0d);
    public static final double f20152Y = Math.pow(2.0d, 50.0d);
    public static final double f20153Z = Math.pow(10.0d, 3.0d);
    public static final double f20155a0 = Math.pow(10.0d, 6.0d);
    public static final double f20157b0 = Math.pow(10.0d, 9.0d);
    public static final double f20159c0 = Math.pow(10.0d, 12.0d);
    public static final double f20160d0 = Math.pow(10.0d, 15.0d);

    public final class C6460a extends EnumC6459p {
        public C6460a(String str, int i) {
            super(str, i);
        }

        @Override
        public long mo20395b(double d) {
            return (long) EnumC6459p.m20402a(d, EnumC6459p.f20159c0);
        }
    }

    public final class C6461b extends EnumC6459p {
        public C6461b(String str, int i) {
            super(str, i);
        }

        @Override
        public long mo20395b(double d) {
            return (long) EnumC6459p.m20402a(d, EnumC6459p.f20160d0);
        }
    }

    public final class C6462c extends EnumC6459p {
        public C6462c(String str, int i) {
            super(str, i);
        }

        @Override
        public long mo20395b(double d) {
            return (long) d;
        }
    }

    public final class C6463d extends EnumC6459p {
        public C6463d(String str, int i) {
            super(str, i);
        }

        @Override
        public long mo20395b(double d) {
            return (long) EnumC6459p.m20402a(d, EnumC6459p.f20148U);
        }
    }

    public final class C6464e extends EnumC6459p {
        public C6464e(String str, int i) {
            super(str, i);
        }

        @Override
        public long mo20395b(double d) {
            return (long) EnumC6459p.m20402a(d, EnumC6459p.f20149V);
        }
    }

    public final class C6465f extends EnumC6459p {
        public C6465f(String str, int i) {
            super(str, i);
        }

        @Override
        public long mo20395b(double d) {
            return (long) EnumC6459p.m20402a(d, EnumC6459p.f20150W);
        }
    }

    public final class C6466g extends EnumC6459p {
        public C6466g(String str, int i) {
            super(str, i);
        }

        @Override
        public long mo20395b(double d) {
            return (long) EnumC6459p.m20402a(d, EnumC6459p.f20151X);
        }
    }

    public final class C6467h extends EnumC6459p {
        public C6467h(String str, int i) {
            super(str, i);
        }

        @Override
        public long mo20395b(double d) {
            return (long) EnumC6459p.m20402a(d, EnumC6459p.f20152Y);
        }
    }

    public final class C6468i extends EnumC6459p {
        public C6468i(String str, int i) {
            super(str, i);
        }

        @Override
        public long mo20395b(double d) {
            return (long) EnumC6459p.m20402a(d, EnumC6459p.f20153Z);
        }
    }

    public final class C6469j extends EnumC6459p {
        public C6469j(String str, int i) {
            super(str, i);
        }

        @Override
        public long mo20395b(double d) {
            return (long) EnumC6459p.m20402a(d, EnumC6459p.f20155a0);
        }
    }

    public final class C6470k extends EnumC6459p {
        public C6470k(String str, int i) {
            super(str, i);
        }

        @Override
        public long mo20395b(double d) {
            return (long) EnumC6459p.m20402a(d, EnumC6459p.f20157b0);
        }
    }

    static {
        C6462c cVar = new C6462c("BYTE", 0);
        f20154a = cVar;
        C6463d dVar = new C6463d("KIB", 1);
        f20156b = dVar;
        C6464e eVar = new C6464e("MIB", 2);
        f20158c = eVar;
        C6465f fVar = new C6465f("GIB", 3);
        f20140M = fVar;
        C6466g gVar = new C6466g("TIB", 4);
        f20141N = gVar;
        C6467h hVar = new C6467h("PIB", 5);
        f20142O = hVar;
        C6468i iVar = new C6468i("KB", 6);
        f20143P = iVar;
        C6469j jVar = new C6469j("MB", 7);
        f20144Q = jVar;
        C6470k kVar = new C6470k("GB", 8);
        f20145R = kVar;
        C6460a aVar = new C6460a("TB", 9);
        f20146S = aVar;
        C6461b bVar = new C6461b("PB", 10);
        f20147T = bVar;
        f20161e0 = new EnumC6459p[]{cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar, kVar, aVar, bVar};
    }

    public EnumC6459p(String str, int i) {
    }

    public static double m20402a(double d, double d2) {
        double d3 = Double.MAX_VALUE / d2;
        if (d > d3) {
            return Double.MAX_VALUE;
        }
        if (d < (-d3)) {
            return Double.MIN_VALUE;
        }
        return d * d2;
    }

    public static EnumC6459p valueOf(String str) {
        return (EnumC6459p) Enum.valueOf(EnumC6459p.class, str);
    }

    public static EnumC6459p[] values() {
        return (EnumC6459p[]) f20161e0.clone();
    }

    public abstract long mo20395b(double d);

    public final double m20401c(double d) {
        return mo20395b(d) / f20157b0;
    }

    public final double m20400d(double d) {
        return mo20395b(d) / f20150W;
    }

    public final double m20399e(double d) {
        return mo20395b(d) / f20153Z;
    }

    public final double m20398f(double d) {
        return mo20395b(d) / f20148U;
    }

    public final double m20397g(double d) {
        return mo20395b(d) / f20155a0;
    }

    public final double m20396h(double d) {
        return mo20395b(d) / f20149V;
    }
}
