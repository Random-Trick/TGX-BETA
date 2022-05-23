package mb;

public abstract class p extends Enum<p> {
    public static final p M;
    public static final p N;
    public static final p O;
    public static final p P;
    public static final p Q;
    public static final p R;
    public static final p S;
    public static final p T;
    public static final p f17343a;
    public static final p f17345b;
    public static final p f17347c;
    public static final p[] f17350e0;
    public static final double U = Math.pow(2.0d, 10.0d);
    public static final double V = Math.pow(2.0d, 20.0d);
    public static final double W = Math.pow(2.0d, 30.0d);
    public static final double X = Math.pow(2.0d, 40.0d);
    public static final double Y = Math.pow(2.0d, 50.0d);
    public static final double Z = Math.pow(10.0d, 3.0d);
    public static final double f17344a0 = Math.pow(10.0d, 6.0d);
    public static final double f17346b0 = Math.pow(10.0d, 9.0d);
    public static final double f17348c0 = Math.pow(10.0d, 12.0d);
    public static final double f17349d0 = Math.pow(10.0d, 15.0d);

    public final class a extends p {
        public a(String str, int i10) {
            super(str, i10);
        }

        @Override
        public long b(double d10) {
            return (long) p.a(d10, p.f17348c0);
        }
    }

    public final class b extends p {
        public b(String str, int i10) {
            super(str, i10);
        }

        @Override
        public long b(double d10) {
            return (long) p.a(d10, p.f17349d0);
        }
    }

    public final class c extends p {
        public c(String str, int i10) {
            super(str, i10);
        }

        @Override
        public long b(double d10) {
            return (long) d10;
        }
    }

    public final class d extends p {
        public d(String str, int i10) {
            super(str, i10);
        }

        @Override
        public long b(double d10) {
            return (long) p.a(d10, p.U);
        }
    }

    public final class e extends p {
        public e(String str, int i10) {
            super(str, i10);
        }

        @Override
        public long b(double d10) {
            return (long) p.a(d10, p.V);
        }
    }

    public final class f extends p {
        public f(String str, int i10) {
            super(str, i10);
        }

        @Override
        public long b(double d10) {
            return (long) p.a(d10, p.W);
        }
    }

    public final class g extends p {
        public g(String str, int i10) {
            super(str, i10);
        }

        @Override
        public long b(double d10) {
            return (long) p.a(d10, p.X);
        }
    }

    public final class h extends p {
        public h(String str, int i10) {
            super(str, i10);
        }

        @Override
        public long b(double d10) {
            return (long) p.a(d10, p.Y);
        }
    }

    public final class i extends p {
        public i(String str, int i10) {
            super(str, i10);
        }

        @Override
        public long b(double d10) {
            return (long) p.a(d10, p.Z);
        }
    }

    public final class j extends p {
        public j(String str, int i10) {
            super(str, i10);
        }

        @Override
        public long b(double d10) {
            return (long) p.a(d10, p.f17344a0);
        }
    }

    public final class k extends p {
        public k(String str, int i10) {
            super(str, i10);
        }

        @Override
        public long b(double d10) {
            return (long) p.a(d10, p.f17346b0);
        }
    }

    static {
        c cVar = new c("BYTE", 0);
        f17343a = cVar;
        d dVar = new d("KIB", 1);
        f17345b = dVar;
        e eVar = new e("MIB", 2);
        f17347c = eVar;
        f fVar = new f("GIB", 3);
        M = fVar;
        g gVar = new g("TIB", 4);
        N = gVar;
        h hVar = new h("PIB", 5);
        O = hVar;
        i iVar = new i("KB", 6);
        P = iVar;
        j jVar = new j("MB", 7);
        Q = jVar;
        k kVar = new k("GB", 8);
        R = kVar;
        a aVar = new a("TB", 9);
        S = aVar;
        b bVar = new b("PB", 10);
        T = bVar;
        f17350e0 = new p[]{cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar, kVar, aVar, bVar};
    }

    public p(String str, int i10) {
    }

    public static double a(double d10, double d11) {
        double d12 = Double.MAX_VALUE / d11;
        if (d10 > d12) {
            return Double.MAX_VALUE;
        }
        if (d10 < (-d12)) {
            return Double.MIN_VALUE;
        }
        return d10 * d11;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f17350e0.clone();
    }

    public abstract long b(double d10);

    public final double c(double d10) {
        return b(d10) / f17346b0;
    }

    public final double d(double d10) {
        return b(d10) / W;
    }

    public final double e(double d10) {
        return b(d10) / Z;
    }

    public final double f(double d10) {
        return b(d10) / U;
    }

    public final double g(double d10) {
        return b(d10) / f17344a0;
    }

    public final double h(double d10) {
        return b(d10) / V;
    }
}
