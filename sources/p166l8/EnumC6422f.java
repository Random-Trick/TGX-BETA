package p166l8;

public enum EnumC6422f {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    public static final EnumC6422f[] f20086O;
    public final int f20090a;

    static {
        EnumC6422f fVar = L;
        EnumC6422f fVar2 = M;
        EnumC6422f fVar3 = Q;
        f20086O = new EnumC6422f[]{fVar2, fVar, H, fVar3};
    }

    EnumC6422f(int i) {
        this.f20090a = i;
    }

    public static EnumC6422f m20434a(int i) {
        if (i >= 0) {
            EnumC6422f[] fVarArr = f20086O;
            if (i < fVarArr.length) {
                return fVarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
