package p166l8;

import p093g8.C4523f;
import p105h8.C5022a;

public final class C6408a {
    public final C5022a f20066a;
    public C6426j f20067b;
    public C6423g f20068c;
    public boolean f20069d;

    public C6408a(C5022a aVar) {
        int f = aVar.m24280f();
        if (f < 21 || (f & 3) != 1) {
            throw C4523f.m27501a();
        }
        this.f20066a = aVar;
    }

    public final int m20457a(int i, int i2, int i3) {
        return this.f20069d ? this.f20066a.m24282d(i2, i) : this.f20066a.m24282d(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public void m20456b() {
        int i = 0;
        while (i < this.f20066a.m24278h()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f20066a.m24280f(); i3++) {
                if (this.f20066a.m24282d(i, i3) != this.f20066a.m24282d(i3, i)) {
                    this.f20066a.m24283c(i3, i);
                    this.f20066a.m24283c(i, i3);
                }
            }
            i = i2;
        }
    }

    public byte[] m20455c() {
        C6423g d = m20454d();
        C6426j e = m20453e();
        EnumC6410c cVar = EnumC6410c.values()[d.m20431c()];
        int f = this.f20066a.m24280f();
        cVar.m20447b(this.f20066a, f);
        C5022a a = e.m20425a();
        byte[] bArr = new byte[e.m20418h()];
        int i = f - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < f; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a.m24282d(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f20066a.m24282d(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            i3++;
                            bArr[i3] = (byte) i5;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == e.m20418h()) {
            return bArr;
        }
        throw C4523f.m27501a();
    }

    public C6423g m20454d() {
        C6423g gVar = this.f20068c;
        if (gVar != null) {
            return gVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m20457a(i3, 8, i2);
        }
        int a = m20457a(8, 7, m20457a(8, 8, m20457a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = m20457a(8, i4, a);
        }
        int f = this.f20066a.m24280f();
        int i5 = f - 7;
        for (int i6 = f - 1; i6 >= i5; i6--) {
            i = m20457a(8, i6, i);
        }
        for (int i7 = f - 8; i7 < f; i7++) {
            i = m20457a(i7, 8, i);
        }
        C6423g a2 = C6423g.m20433a(a, i);
        this.f20068c = a2;
        if (a2 != null) {
            return a2;
        }
        throw C4523f.m27501a();
    }

    public C6426j m20453e() {
        C6426j jVar = this.f20067b;
        if (jVar != null) {
            return jVar;
        }
        int f = this.f20066a.m24280f();
        int i = (f - 17) / 4;
        if (i <= 6) {
            return C6426j.m20417i(i);
        }
        int i2 = f - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = f - 9; i6 >= i2; i6--) {
                i4 = m20457a(i6, i5, i4);
            }
        }
        C6426j c = C6426j.m20423c(i4);
        if (c == null || c.m20421e() != f) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = f - 9; i8 >= i2; i8--) {
                    i3 = m20457a(i7, i8, i3);
                }
            }
            C6426j c2 = C6426j.m20423c(i3);
            if (c2 == null || c2.m20421e() != f) {
                throw C4523f.m27501a();
            }
            this.f20067b = c2;
            return c2;
        }
        this.f20067b = c;
        return c;
    }

    public void m20452f() {
        if (this.f20068c != null) {
            EnumC6410c.values()[this.f20068c.m20431c()].m20447b(this.f20066a, this.f20066a.m24280f());
        }
    }

    public void m20451g(boolean z) {
        this.f20067b = null;
        this.f20068c = null;
        this.f20069d = z;
    }
}
