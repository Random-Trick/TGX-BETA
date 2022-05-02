package p136j8;

public final class C5899c {
    public final C5897a f18800a;

    public C5899c(C5897a aVar) {
        this.f18800a = aVar;
    }

    public void m21873a(int[] iArr, int i) {
        C5898b bVar = new C5898b(this.f18800a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C5897a aVar = this.f18800a;
            int b = bVar.m21880b(aVar.m21889c(aVar.m21888d() + i2));
            iArr2[(i - 1) - i2] = b;
            if (b != 0) {
                z = false;
            }
        }
        if (!z) {
            C5898b[] d = m21870d(this.f18800a.m21890b(i, 1), new C5898b(this.f18800a, iArr2), i);
            C5898b bVar2 = d[0];
            C5898b bVar3 = d[1];
            int[] b2 = m21872b(bVar2);
            int[] c = m21871c(bVar3, b2);
            for (int i3 = 0; i3 < b2.length; i3++) {
                int length = (iArr.length - 1) - this.f18800a.m21883i(b2[i3]);
                if (length >= 0) {
                    iArr[length] = C5897a.m21891a(iArr[length], c[i3]);
                } else {
                    throw new C5900d("Bad error location");
                }
            }
        }
    }

    public final int[] m21872b(C5898b bVar) {
        int d = bVar.m21878d();
        int i = 0;
        if (d == 1) {
            return new int[]{bVar.m21879c(1)};
        }
        int[] iArr = new int[d];
        for (int i2 = 1; i2 < this.f18800a.m21886f() && i < d; i2++) {
            if (bVar.m21880b(i2) == 0) {
                iArr[i] = this.f18800a.m21884h(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw new C5900d("Error locator degree does not match number of roots");
    }

    public final int[] m21871c(C5898b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.f18800a.m21884h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.f18800a.m21882j(iArr[i3], h);
                    i2 = this.f18800a.m21882j(i2, (j & 1) == 0 ? j | 1 : j & (-2));
                }
            }
            iArr2[i] = this.f18800a.m21882j(bVar.m21880b(h), this.f18800a.m21884h(i2));
            if (this.f18800a.m21888d() != 0) {
                iArr2[i] = this.f18800a.m21882j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    public final C5898b[] m21870d(C5898b bVar, C5898b bVar2, int i) {
        if (bVar.m21878d() < bVar2.m21878d()) {
            bVar2 = bVar;
            bVar = bVar2;
        }
        C5898b g = this.f18800a.m21885g();
        C5898b e = this.f18800a.m21887e();
        do {
            bVar = bVar2;
            bVar2 = bVar;
            g = e;
            C5898b bVar3 = g;
            if (bVar.m21878d() < i / 2) {
                int c = g.m21879c(0);
                if (c != 0) {
                    int h = this.f18800a.m21884h(c);
                    return new C5898b[]{g.m21876f(h), bVar.m21876f(h)};
                }
                throw new C5900d("sigmaTilde(0) was zero");
            } else if (!bVar.m21877e()) {
                C5898b g2 = this.f18800a.m21885g();
                int h2 = this.f18800a.m21884h(bVar.m21879c(bVar.m21878d()));
                while (bVar2.m21878d() >= bVar.m21878d() && !bVar2.m21877e()) {
                    int d = bVar2.m21878d() - bVar.m21878d();
                    int j = this.f18800a.m21882j(bVar2.m21879c(bVar2.m21878d()), h2);
                    g2 = g2.m21881a(this.f18800a.m21890b(d, j));
                    bVar2 = bVar2.m21881a(bVar.m21874h(d, j));
                }
                e = g2.m21875g(g).m21881a(bVar3);
            } else {
                throw new C5900d("r_{i-1} was zero");
            }
        } while (bVar2.m21878d() < bVar.m21878d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}
