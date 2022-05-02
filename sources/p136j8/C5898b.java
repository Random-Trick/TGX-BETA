package p136j8;

public final class C5898b {
    public final C5897a f18798a;
    public final int[] f18799b;

    public C5898b(C5897a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f18798a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f18799b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f18799b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[length - i];
            this.f18799b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    public C5898b m21880a(C5898b bVar) {
        if (!this.f18798a.equals(bVar.f18798a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (m21876e()) {
            return bVar;
        } else {
            if (bVar.m21876e()) {
                return this;
            }
            int[] iArr = this.f18799b;
            int[] iArr2 = bVar.f18799b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = C5897a.m21890a(iArr2[i - length], iArr[i]);
            }
            return new C5898b(this.f18798a, iArr3);
        }
    }

    public int m21879b(int i) {
        if (i == 0) {
            return m21878c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f18799b) {
                i2 = C5897a.m21890a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f18799b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = C5897a.m21890a(this.f18798a.m21881j(i, i4), this.f18799b[i5]);
        }
        return i4;
    }

    public int m21878c(int i) {
        int[] iArr = this.f18799b;
        return iArr[(iArr.length - 1) - i];
    }

    public int m21877d() {
        return this.f18799b.length - 1;
    }

    public boolean m21876e() {
        return this.f18799b[0] == 0;
    }

    public C5898b m21875f(int i) {
        if (i == 0) {
            return this.f18798a.m21884g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f18799b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f18798a.m21881j(this.f18799b[i2], i);
        }
        return new C5898b(this.f18798a, iArr);
    }

    public C5898b m21874g(C5898b bVar) {
        if (!this.f18798a.equals(bVar.f18798a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (m21876e() || bVar.m21876e()) {
            return this.f18798a.m21884g();
        } else {
            int[] iArr = this.f18799b;
            int length = iArr.length;
            int[] iArr2 = bVar.f18799b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[(length + length2) - 1];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C5897a.m21890a(iArr3[i4], this.f18798a.m21881j(i2, iArr2[i3]));
                }
            }
            return new C5898b(this.f18798a, iArr3);
        }
    }

    public C5898b m21873h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f18798a.m21884g();
        } else {
            int length = this.f18799b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f18798a.m21881j(this.f18799b[i3], i2);
            }
            return new C5898b(this.f18798a, iArr);
        }
    }

    public String toString() {
        if (m21876e()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(m21877d() * 8);
        for (int d = m21877d(); d >= 0; d--) {
            int c = m21878c(d);
            if (c != 0) {
                if (c < 0) {
                    if (d == m21877d()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    c = -c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (d == 0 || c != 1) {
                    int i = this.f18798a.m21882i(c);
                    if (i == 0) {
                        sb2.append('1');
                    } else if (i == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i);
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(d);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
