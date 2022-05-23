package m8;

public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    public static final f[] O;
    public final int f17315a;

    static {
        f fVar = L;
        f fVar2 = M;
        f fVar3 = Q;
        O = new f[]{fVar2, fVar, H, fVar3};
    }

    f(int i10) {
        this.f17315a = i10;
    }

    public static f a(int i10) {
        if (i10 >= 0) {
            f[] fVarArr = O;
            if (i10 < fVarArr.length) {
                return fVarArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }
}
