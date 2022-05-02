package p208oc;

public class C7848t {
    public C7849a[] f25262a;
    public int[] f25263b;
    public int f25264c;

    public static class C7849a {
        public int f25265a;
        public int f25266b;
        public int f25267c;
        public Integer f25268d = null;
        public int f25269e;
        public int f25270f;

        public int m14865a() {
            return (this.f25270f - this.f25269e) + 1;
        }
    }

    public C7848t(int[] iArr) {
        this.f25263b = iArr;
        if (iArr.length >= 30) {
            int pow = (int) (Math.pow(2.0d, Math.floor((Math.log(iArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d);
            this.f25264c = pow;
            this.f25262a = new C7849a[pow];
            m14874a(1, 0, iArr.length);
        }
    }

    public final void m14874a(int i, int i2, int i3) {
        this.f25262a[i] = new C7849a();
        C7849a[] aVarArr = this.f25262a;
        aVarArr[i].f25269e = i2;
        aVarArr[i].f25270f = (i2 + i3) - 1;
        if (i3 == 1) {
            C7849a aVar = aVarArr[i];
            int[] iArr = this.f25263b;
            aVar.f25265a = iArr[i2];
            aVarArr[i].f25266b = iArr[i2];
            aVarArr[i].f25267c = iArr[i2];
            return;
        }
        int i4 = i * 2;
        int i5 = i3 / 2;
        m14874a(i4, i2, i5);
        int i6 = i4 + 1;
        m14874a(i6, i2 + i5, i3 - i5);
        C7849a[] aVarArr2 = this.f25262a;
        aVarArr2[i].f25265a = aVarArr2[i4].f25265a + aVarArr2[i6].f25265a;
        aVarArr2[i].f25266b = Math.max(aVarArr2[i4].f25266b, aVarArr2[i6].f25266b);
        C7849a[] aVarArr3 = this.f25262a;
        aVarArr3[i].f25267c = Math.min(aVarArr3[i4].f25267c, aVarArr3[i6].f25267c);
    }

    public final void m14873b(C7849a aVar, int i) {
        aVar.f25268d = Integer.valueOf(i);
        aVar.f25265a = aVar.m14865a() * i;
        aVar.f25266b = i;
        aVar.f25267c = i;
        this.f25263b[aVar.f25269e] = i;
    }

    public final boolean m14872c(int i, int i2, int i3, int i4) {
        return i3 >= i && i4 <= i2;
    }

    public final boolean m14871d(int i, int i2, int i3, int i4) {
        return (i <= i3 && i2 >= i3) || (i >= i3 && i <= i4);
    }

    public final void m14870e(int i) {
        C7849a[] aVarArr = this.f25262a;
        C7849a aVar = aVarArr[i];
        Integer num = aVar.f25268d;
        if (num != null) {
            int i2 = i * 2;
            m14873b(aVarArr[i2], num.intValue());
            m14873b(this.f25262a[i2 + 1], aVar.f25268d.intValue());
            aVar.f25268d = null;
        }
    }

    public int m14869f(int i, int i2) {
        int[] iArr = this.f25263b;
        if (iArr.length >= 30) {
            return m14868g(1, i, i2);
        }
        int i3 = Integer.MIN_VALUE;
        if (i < 0) {
            i = 0;
        }
        if (i2 > iArr.length - 1) {
            i2 = iArr.length - 1;
        }
        while (i <= i2) {
            int[] iArr2 = this.f25263b;
            if (iArr2[i] > i3) {
                i3 = iArr2[i];
            }
            i++;
        }
        return i3;
    }

    public final int m14868g(int i, int i2, int i3) {
        C7849a aVar = this.f25262a[i];
        if (aVar.f25268d != null && m14872c(aVar.f25269e, aVar.f25270f, i2, i3)) {
            return aVar.f25268d.intValue();
        }
        if (m14872c(i2, i3, aVar.f25269e, aVar.f25270f)) {
            return this.f25262a[i].f25266b;
        }
        if (!m14871d(i2, i3, aVar.f25269e, aVar.f25270f)) {
            return 0;
        }
        m14870e(i);
        int i4 = i * 2;
        return Math.max(m14868g(i4, i2, i3), m14868g(i4 + 1, i2, i3));
    }

    public int m14867h(int i, int i2) {
        int[] iArr = this.f25263b;
        if (iArr.length >= 30) {
            return m14866i(1, i, i2);
        }
        int i3 = Integer.MAX_VALUE;
        if (i < 0) {
            i = 0;
        }
        if (i2 > iArr.length - 1) {
            i2 = iArr.length - 1;
        }
        while (i <= i2) {
            int[] iArr2 = this.f25263b;
            if (iArr2[i] < i3) {
                i3 = iArr2[i];
            }
            i++;
        }
        return i3;
    }

    public final int m14866i(int i, int i2, int i3) {
        C7849a aVar = this.f25262a[i];
        if (aVar.f25268d != null && m14872c(aVar.f25269e, aVar.f25270f, i2, i3)) {
            return aVar.f25268d.intValue();
        }
        if (m14872c(i2, i3, aVar.f25269e, aVar.f25270f)) {
            return this.f25262a[i].f25267c;
        }
        if (!m14871d(i2, i3, aVar.f25269e, aVar.f25270f)) {
            return Integer.MAX_VALUE;
        }
        m14870e(i);
        int i4 = i * 2;
        return Math.min(m14866i(i4, i2, i3), m14866i(i4 + 1, i2, i3));
    }
}
