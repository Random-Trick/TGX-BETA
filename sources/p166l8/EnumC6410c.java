package p166l8;

import p105h8.C5022a;

public abstract class EnumC6410c extends Enum<EnumC6410c> {
    public static final EnumC6410c f20072M;
    public static final EnumC6410c f20073N;
    public static final EnumC6410c f20074O;
    public static final EnumC6410c f20075P;
    public static final EnumC6410c f20076Q;
    public static final EnumC6410c[] f20077R;
    public static final EnumC6410c f20078a;
    public static final EnumC6410c f20079b;
    public static final EnumC6410c f20080c;

    public static class C6411a extends EnumC6410c {
        public C6411a(String str, int i) {
            super(str, i, null);
        }

        @Override
        public boolean mo20445a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    static {
        C6411a aVar = new C6411a("DATA_MASK_000", 0);
        f20078a = aVar;
        EnumC6410c bVar = new EnumC6410c("DATA_MASK_001", 1) {
            @Override
            public boolean mo20445a(int i, int i2) {
                return (i & 1) == 0;
            }
        };
        f20079b = bVar;
        EnumC6410c cVar = new EnumC6410c("DATA_MASK_010", 2) {
            @Override
            public boolean mo20445a(int i, int i2) {
                return i2 % 3 == 0;
            }
        };
        f20080c = cVar;
        EnumC6410c dVar = new EnumC6410c("DATA_MASK_011", 3) {
            @Override
            public boolean mo20445a(int i, int i2) {
                return (i + i2) % 3 == 0;
            }
        };
        f20072M = dVar;
        EnumC6410c eVar = new EnumC6410c("DATA_MASK_100", 4) {
            @Override
            public boolean mo20445a(int i, int i2) {
                return (((i / 2) + (i2 / 3)) & 1) == 0;
            }
        };
        f20073N = eVar;
        EnumC6410c fVar = new EnumC6410c("DATA_MASK_101", 5) {
            @Override
            public boolean mo20445a(int i, int i2) {
                return (i * i2) % 6 == 0;
            }
        };
        f20074O = fVar;
        EnumC6410c gVar = new EnumC6410c("DATA_MASK_110", 6) {
            @Override
            public boolean mo20445a(int i, int i2) {
                return (i * i2) % 6 < 3;
            }
        };
        f20075P = gVar;
        EnumC6410c hVar = new EnumC6410c("DATA_MASK_111", 7) {
            @Override
            public boolean mo20445a(int i, int i2) {
                return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
            }
        };
        f20076Q = hVar;
        f20077R = new EnumC6410c[]{aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar};
    }

    public EnumC6410c(String str, int i) {
    }

    public static EnumC6410c valueOf(String str) {
        return (EnumC6410c) Enum.valueOf(EnumC6410c.class, str);
    }

    public static EnumC6410c[] values() {
        return (EnumC6410c[]) f20077R.clone();
    }

    public abstract boolean mo20445a(int i, int i2);

    public final void m20446b(C5022a aVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo20445a(i2, i3)) {
                    aVar.m24282c(i3, i2);
                }
            }
        }
    }

    public EnumC6410c(String str, int i, C6411a aVar) {
        this(str, i);
    }
}
