package m8;

import h8.f;

public final class a {
    public final i8.a f17301a;
    public j f17302b;
    public g f17303c;
    public boolean f17304d;

    public a(i8.a aVar) {
        int f10 = aVar.f();
        if (f10 < 21 || (f10 & 3) != 1) {
            throw f.a();
        }
        this.f17301a = aVar;
    }

    public final int a(int i10, int i11, int i12) {
        return this.f17304d ? this.f17301a.d(i11, i10) : this.f17301a.d(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public void b() {
        int i10 = 0;
        while (i10 < this.f17301a.h()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f17301a.f(); i12++) {
                if (this.f17301a.d(i10, i12) != this.f17301a.d(i12, i10)) {
                    this.f17301a.c(i12, i10);
                    this.f17301a.c(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    public byte[] c() {
        g d10 = d();
        j e10 = e();
        c cVar = c.values()[d10.c()];
        int f10 = this.f17301a.f();
        cVar.b(this.f17301a, f10);
        i8.a a10 = e10.a();
        byte[] bArr = new byte[e10.h()];
        int i10 = f10 - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < f10; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!a10.d(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f17301a.d(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            i12++;
                            bArr[i12] = (byte) i14;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == e10.h()) {
            return bArr;
        }
        throw f.a();
    }

    public g d() {
        g gVar = this.f17303c;
        if (gVar != null) {
            return gVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = a(i12, 8, i11);
        }
        int a10 = a(8, 7, a(8, 8, a(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            a10 = a(8, i13, a10);
        }
        int f10 = this.f17301a.f();
        int i14 = f10 - 7;
        for (int i15 = f10 - 1; i15 >= i14; i15--) {
            i10 = a(8, i15, i10);
        }
        for (int i16 = f10 - 8; i16 < f10; i16++) {
            i10 = a(i16, 8, i10);
        }
        g a11 = g.a(a10, i10);
        this.f17303c = a11;
        if (a11 != null) {
            return a11;
        }
        throw f.a();
    }

    public j e() {
        j jVar = this.f17302b;
        if (jVar != null) {
            return jVar;
        }
        int f10 = this.f17301a.f();
        int i10 = (f10 - 17) / 4;
        if (i10 <= 6) {
            return j.i(i10);
        }
        int i11 = f10 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = f10 - 9; i15 >= i11; i15--) {
                i13 = a(i15, i14, i13);
            }
        }
        j c10 = j.c(i13);
        if (c10 == null || c10.e() != f10) {
            for (int i16 = 5; i16 >= 0; i16--) {
                for (int i17 = f10 - 9; i17 >= i11; i17--) {
                    i12 = a(i16, i17, i12);
                }
            }
            j c11 = j.c(i12);
            if (c11 == null || c11.e() != f10) {
                throw f.a();
            }
            this.f17302b = c11;
            return c11;
        }
        this.f17302b = c10;
        return c10;
    }

    public void f() {
        if (this.f17303c != null) {
            c.values()[this.f17303c.c()].b(this.f17301a, this.f17301a.f());
        }
    }

    public void g(boolean z10) {
        this.f17302b = null;
        this.f17303c = null;
        this.f17304d = z10;
    }
}
