package p136j8;

public final class C5899c {
    public final C5897a f18800a;

    public C5899c(C5897a aVar) {
        this.f18800a = aVar;
    }

    public void m21872a(int[] iArr, int i) {
        C5898b bVar = new C5898b(this.f18800a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C5897a aVar = this.f18800a;
            int b = bVar.m21879b(aVar.m21888c(aVar.m21887d() + i2));
            iArr2[(i - 1) - i2] = b;
            if (b != 0) {
                z = false;
            }
        }
        if (!z) {
            C5898b[] d = m21869d(this.f18800a.m21889b(i, 1), new C5898b(this.f18800a, iArr2), i);
            C5898b bVar2 = d[0];
            C5898b bVar3 = d[1];
            int[] b2 = m21871b(bVar2);
            int[] c = m21870c(bVar3, b2);
            for (int i3 = 0; i3 < b2.length; i3++) {
                int length = (iArr.length - 1) - this.f18800a.m21882i(b2[i3]);
                if (length >= 0) {
                    iArr[length] = C5897a.m21890a(iArr[length], c[i3]);
                } else {
                    throw new C5900d("Bad error location");
                }
            }
        }
    }

    public final int[] m21871b(C5898b bVar) {
        int d = bVar.m21877d();
        int i = 0;
        if (d == 1) {
            return new int[]{bVar.m21878c(1)};
        }
        int[] iArr = new int[d];
        for (int i2 = 1; i2 < this.f18800a.m21885f() && i < d; i2++) {
            if (bVar.m21879b(i2) == 0) {
                iArr[i] = this.f18800a.m21883h(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw new C5900d("Error locator degree does not match number of roots");
    }

    public final int[] m21870c(C5898b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.f18800a.m21883h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.f18800a.m21881j(iArr[i3], h);
                    i2 = this.f18800a.m21881j(i2, (j & 1) == 0 ? j | 1 : j & (-2));
                }
            }
            iArr2[i] = this.f18800a.m21881j(bVar.m21879b(h), this.f18800a.m21883h(i2));
            if (this.f18800a.m21887d() != 0) {
                iArr2[i] = this.f18800a.m21881j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    public final C5898b[] m21869d(C5898b bVar, C5898b bVar2, int i) {
        if (bVar.m21877d() < bVar2.m21877d()) {
            bVar2 = bVar;
            bVar = bVar2;
        }
        C5898b g = this.f18800a.m21884g();
        C5898b e = this.f18800a.m21886e();
        do {
            bVar = bVar2;
            bVar2 = bVar;
            g = e;
            C5898b bVar3 = g;
            if (bVar.m21877d() < i / 2) {
                int c = g.m21878c(0);
                if (c != 0) {
                    int h = this.f18800a.m21883h(c);
                    return new C5898b[]{g.m21875f(h), bVar.m21875f(h)};
                }
                throw new C5900d("sigmaTilde(0) was zero");
            } else if (!bVar.m21876e()) {
                C5898b g2 = this.f18800a.m21884g();
                int h2 = this.f18800a.m21883h(bVar.m21878c(bVar.m21877d()));
                while (bVar2.m21877d() >= bVar.m21877d() && !bVar2.m21876e()) {
                    int d = bVar2.m21877d() - bVar.m21877d();
                    int j = this.f18800a.m21881j(bVar2.m21878c(bVar2.m21877d()), h2);
                    g2 = g2.m21880a(this.f18800a.m21889b(d, j));
                    bVar2 = bVar2.m21880a(bVar.m21873h(d, j));
                }
                e = g2.m21874g(g).m21880a(bVar3);
            } else {
                throw new C5900d("r_{i-1} was zero");
            }
        } while (bVar2.m21877d() < bVar.m21877d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}
