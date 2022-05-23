package a4;

import m3.q1;

public final class o {
    public final int f358a;
    public final int f359b;
    public final long f360c;
    public final long f361d;
    public final long f362e;
    public final q1 f363f;
    public final int f364g;
    public final long[] f365h;
    public final long[] f366i;
    public final int f367j;
    public final p[] f368k;

    public o(int i10, int i11, long j10, long j11, long j12, q1 q1Var, int i12, p[] pVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f358a = i10;
        this.f359b = i11;
        this.f360c = j10;
        this.f361d = j11;
        this.f362e = j12;
        this.f363f = q1Var;
        this.f364g = i12;
        this.f368k = pVarArr;
        this.f367j = i13;
        this.f365h = jArr;
        this.f366i = jArr2;
    }

    public p a(int i10) {
        p[] pVarArr = this.f368k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i10];
    }
}
