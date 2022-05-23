package pc;

public class t {
    public a[] f21146a;
    public int[] f21147b;
    public int f21148c;

    public static class a {
        public int f21149a;
        public int f21150b;
        public int f21151c;
        public Integer f21152d = null;
        public int f21153e;
        public int f21154f;

        public int a() {
            return (this.f21154f - this.f21153e) + 1;
        }
    }

    public t(int[] iArr) {
        this.f21147b = iArr;
        if (iArr.length >= 30) {
            int pow = (int) (Math.pow(2.0d, Math.floor((Math.log(iArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d);
            this.f21148c = pow;
            this.f21146a = new a[pow];
            a(1, 0, iArr.length);
        }
    }

    public final void a(int i10, int i11, int i12) {
        this.f21146a[i10] = new a();
        a[] aVarArr = this.f21146a;
        aVarArr[i10].f21153e = i11;
        aVarArr[i10].f21154f = (i11 + i12) - 1;
        if (i12 == 1) {
            a aVar = aVarArr[i10];
            int[] iArr = this.f21147b;
            aVar.f21149a = iArr[i11];
            aVarArr[i10].f21150b = iArr[i11];
            aVarArr[i10].f21151c = iArr[i11];
            return;
        }
        int i13 = i10 * 2;
        int i14 = i12 / 2;
        a(i13, i11, i14);
        int i15 = i13 + 1;
        a(i15, i11 + i14, i12 - i14);
        a[] aVarArr2 = this.f21146a;
        aVarArr2[i10].f21149a = aVarArr2[i13].f21149a + aVarArr2[i15].f21149a;
        aVarArr2[i10].f21150b = Math.max(aVarArr2[i13].f21150b, aVarArr2[i15].f21150b);
        a[] aVarArr3 = this.f21146a;
        aVarArr3[i10].f21151c = Math.min(aVarArr3[i13].f21151c, aVarArr3[i15].f21151c);
    }

    public final void b(a aVar, int i10) {
        aVar.f21152d = Integer.valueOf(i10);
        aVar.f21149a = aVar.a() * i10;
        aVar.f21150b = i10;
        aVar.f21151c = i10;
        this.f21147b[aVar.f21153e] = i10;
    }

    public final boolean c(int i10, int i11, int i12, int i13) {
        return i12 >= i10 && i13 <= i11;
    }

    public final boolean d(int i10, int i11, int i12, int i13) {
        return (i10 <= i12 && i11 >= i12) || (i10 >= i12 && i10 <= i13);
    }

    public final void e(int i10) {
        a[] aVarArr = this.f21146a;
        a aVar = aVarArr[i10];
        Integer num = aVar.f21152d;
        if (num != null) {
            int i11 = i10 * 2;
            b(aVarArr[i11], num.intValue());
            b(this.f21146a[i11 + 1], aVar.f21152d.intValue());
            aVar.f21152d = null;
        }
    }

    public int f(int i10, int i11) {
        int[] iArr = this.f21147b;
        if (iArr.length >= 30) {
            return g(1, i10, i11);
        }
        int i12 = Integer.MIN_VALUE;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > iArr.length - 1) {
            i11 = iArr.length - 1;
        }
        while (i10 <= i11) {
            int[] iArr2 = this.f21147b;
            if (iArr2[i10] > i12) {
                i12 = iArr2[i10];
            }
            i10++;
        }
        return i12;
    }

    public final int g(int i10, int i11, int i12) {
        a aVar = this.f21146a[i10];
        if (aVar.f21152d != null && c(aVar.f21153e, aVar.f21154f, i11, i12)) {
            return aVar.f21152d.intValue();
        }
        if (c(i11, i12, aVar.f21153e, aVar.f21154f)) {
            return this.f21146a[i10].f21150b;
        }
        if (!d(i11, i12, aVar.f21153e, aVar.f21154f)) {
            return 0;
        }
        e(i10);
        int i13 = i10 * 2;
        return Math.max(g(i13, i11, i12), g(i13 + 1, i11, i12));
    }

    public int h(int i10, int i11) {
        int[] iArr = this.f21147b;
        if (iArr.length >= 30) {
            return i(1, i10, i11);
        }
        int i12 = Integer.MAX_VALUE;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 > iArr.length - 1) {
            i11 = iArr.length - 1;
        }
        while (i10 <= i11) {
            int[] iArr2 = this.f21147b;
            if (iArr2[i10] < i12) {
                i12 = iArr2[i10];
            }
            i10++;
        }
        return i12;
    }

    public final int i(int i10, int i11, int i12) {
        a aVar = this.f21146a[i10];
        if (aVar.f21152d != null && c(aVar.f21153e, aVar.f21154f, i11, i12)) {
            return aVar.f21152d.intValue();
        }
        if (c(i11, i12, aVar.f21153e, aVar.f21154f)) {
            return this.f21146a[i10].f21151c;
        }
        if (!d(i11, i12, aVar.f21153e, aVar.f21154f)) {
            return Integer.MAX_VALUE;
        }
        e(i10);
        int i13 = i10 * 2;
        return Math.min(i(i13, i11, i12), i(i13 + 1, i11, i12));
    }
}
