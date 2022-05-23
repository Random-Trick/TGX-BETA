package m8;

public abstract class c extends Enum<c> {
    public static final c M;
    public static final c N;
    public static final c O;
    public static final c P;
    public static final c Q;
    public static final c[] R;
    public static final c f17307a;
    public static final c f17308b;
    public static final c f17309c;

    public static class a extends c {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override
        public boolean a(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        f17307a = aVar;
        c bVar = new c("DATA_MASK_001", 1) {
            @Override
            public boolean a(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        f17308b = bVar;
        c cVar = new c("DATA_MASK_010", 2) {
            @Override
            public boolean a(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        f17309c = cVar;
        c dVar = new c("DATA_MASK_011", 3) {
            @Override
            public boolean a(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        M = dVar;
        c eVar = new c("DATA_MASK_100", 4) {
            @Override
            public boolean a(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        N = eVar;
        c fVar = new c("DATA_MASK_101", 5) {
            @Override
            public boolean a(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        O = fVar;
        c gVar = new c("DATA_MASK_110", 6) {
            @Override
            public boolean a(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        P = gVar;
        c hVar = new c("DATA_MASK_111", 7) {
            @Override
            public boolean a(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        Q = hVar;
        R = new c[]{aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar};
    }

    public c(String str, int i10) {
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) R.clone();
    }

    public abstract boolean a(int i10, int i11);

    public final void b(i8.a aVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (a(i11, i12)) {
                    aVar.c(i12, i11);
                }
            }
        }
    }

    public c(String str, int i10, a aVar) {
        this(str, i10);
    }
}
