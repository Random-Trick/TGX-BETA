package mb;

public abstract class c extends Enum<c> {
    public static final c M;
    public static final c N;
    public static final c O;
    public static final c P;
    public static final c Q;
    public static final c R;
    public static final c S;
    public static final c T;
    public static final c f17335a;
    public static final c f17337b;
    public static final c f17339c;
    public static final c[] f17342e0;
    public static final double U = Math.pow(2.0d, 10.0d);
    public static final double V = Math.pow(2.0d, 20.0d);
    public static final double W = Math.pow(2.0d, 30.0d);
    public static final double X = Math.pow(2.0d, 40.0d);
    public static final double Y = Math.pow(2.0d, 50.0d);
    public static final double Z = Math.pow(10.0d, 3.0d);
    public static final double f17336a0 = Math.pow(10.0d, 6.0d);
    public static final double f17338b0 = Math.pow(10.0d, 9.0d);
    public static final double f17340c0 = Math.pow(10.0d, 12.0d);
    public static final double f17341d0 = Math.pow(10.0d, 15.0d);

    public final class a extends c {
        public a(String str, int i10) {
            super(str, i10);
        }

        @Override
        public double b(double d10) {
            return c.a(d10, c.f17340c0);
        }
    }

    public final class b extends c {
        public b(String str, int i10) {
            super(str, i10);
        }

        @Override
        public double b(double d10) {
            return c.a(d10, c.f17341d0);
        }
    }

    public final class C0159c extends c {
        public C0159c(String str, int i10) {
            super(str, i10);
        }

        @Override
        public double b(double d10) {
            return d10;
        }
    }

    public final class d extends c {
        public d(String str, int i10) {
            super(str, i10);
        }

        @Override
        public double b(double d10) {
            return c.a(d10, c.U);
        }
    }

    public final class e extends c {
        public e(String str, int i10) {
            super(str, i10);
        }

        @Override
        public double b(double d10) {
            return c.a(d10, c.V);
        }
    }

    public final class f extends c {
        public f(String str, int i10) {
            super(str, i10);
        }

        @Override
        public double b(double d10) {
            return c.a(d10, c.W);
        }
    }

    public final class g extends c {
        public g(String str, int i10) {
            super(str, i10);
        }

        @Override
        public double b(double d10) {
            return c.a(d10, c.X);
        }
    }

    public final class h extends c {
        public h(String str, int i10) {
            super(str, i10);
        }

        @Override
        public double b(double d10) {
            return c.a(d10, c.Y);
        }
    }

    public final class i extends c {
        public i(String str, int i10) {
            super(str, i10);
        }

        @Override
        public double b(double d10) {
            return c.a(d10, c.Z);
        }
    }

    public final class j extends c {
        public j(String str, int i10) {
            super(str, i10);
        }

        @Override
        public double b(double d10) {
            return c.a(d10, c.f17336a0);
        }
    }

    public final class k extends c {
        public k(String str, int i10) {
            super(str, i10);
        }

        @Override
        public double b(double d10) {
            return c.a(d10, c.f17338b0);
        }
    }

    static {
        C0159c cVar = new C0159c("BIT", 0);
        f17335a = cVar;
        d dVar = new d("KIBIT", 1);
        f17337b = dVar;
        e eVar = new e("MIBIT", 2);
        f17339c = eVar;
        f fVar = new f("GIBIT", 3);
        M = fVar;
        g gVar = new g("TIBIT", 4);
        N = gVar;
        h hVar = new h("PIBIT", 5);
        O = hVar;
        i iVar = new i("KBIT", 6);
        P = iVar;
        j jVar = new j("MBIT", 7);
        Q = jVar;
        k kVar = new k("GBIT", 8);
        R = kVar;
        a aVar = new a("TBIT", 9);
        S = aVar;
        b bVar = new b("PBIT", 10);
        T = bVar;
        f17342e0 = new c[]{cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar, kVar, aVar, bVar};
    }

    public c(String str, int i10) {
    }

    public static final double a(double d10, double d11) {
        double d12 = Double.MAX_VALUE / d11;
        if (d10 > d12) {
            return Double.MAX_VALUE;
        }
        if (d10 < (-d12)) {
            return Double.MIN_VALUE;
        }
        return d10 * d11;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f17342e0.clone();
    }

    public abstract double b(double d10);

    public final double c(double d10) {
        return b(d10) / Z;
    }
}
