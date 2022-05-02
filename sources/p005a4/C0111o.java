package p005a4;

import p174m3.C6600g1;

public final class C0111o {
    public final int f417a;
    public final int f418b;
    public final long f419c;
    public final long f420d;
    public final long f421e;
    public final C6600g1 f422f;
    public final int f423g;
    public final long[] f424h;
    public final long[] f425i;
    public final int f426j;
    public final C0112p[] f427k;

    public C0111o(int i, int i2, long j, long j2, long j3, C6600g1 g1Var, int i3, C0112p[] pVarArr, int i4, long[] jArr, long[] jArr2) {
        this.f417a = i;
        this.f418b = i2;
        this.f419c = j;
        this.f420d = j2;
        this.f421e = j3;
        this.f422f = g1Var;
        this.f423g = i3;
        this.f427k = pVarArr;
        this.f426j = i4;
        this.f424h = jArr;
        this.f425i = jArr2;
    }

    public C0112p m42270a(int i) {
        C0112p[] pVarArr = this.f427k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i];
    }
}
