package hc;

import ic.c;
import ja.h;
import java.security.MessageDigest;
import ra.k;

public final class x extends h {
    public final transient byte[][] O;
    public final transient int[] P;

    public x(byte[][] bArr, int[] iArr) {
        super(h.M.e());
        k.e(bArr, "segments");
        k.e(iArr, "directory");
        this.O = bArr;
        this.P = iArr;
    }

    @Override
    public String a() {
        return z().a();
    }

    @Override
    public h c(String str) {
        k.e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = x().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = w()[length + i10];
            int i13 = w()[i10];
            messageDigest.update(x()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        k.d(digest, "digest.digest()");
        return new h(digest);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.r() == r() && l(0, hVar, 0, r())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int g() {
        return w()[x().length - 1];
    }

    @Override
    public int hashCode() {
        int f10 = f();
        if (f10 != 0) {
            return f10;
        }
        int length = x().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = w()[length + i10];
            int i14 = w()[i10];
            byte[] bArr = x()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        n(i11);
        return i11;
    }

    @Override
    public String i() {
        return z().i();
    }

    @Override
    public byte[] j() {
        return y();
    }

    @Override
    public byte k(int i10) {
        c.b(w()[x().length - 1], i10, 1L);
        int b10 = c.b(this, i10);
        return x()[b10][(i10 - (b10 == 0 ? 0 : w()[b10 - 1])) + w()[x().length + b10]];
    }

    @Override
    public boolean l(int i10, h hVar, int i11, int i12) {
        k.e(hVar, "other");
        if (i10 < 0 || i10 > r() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = c.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : w()[b10 - 1];
            int i15 = w()[x().length + b10];
            int min = Math.min(i13, (w()[b10] - i14) + i14) - i10;
            if (!hVar.m(i11, x()[b10], i15 + (i10 - i14), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override
    public boolean m(int i10, byte[] bArr, int i11, int i12) {
        k.e(bArr, "other");
        if (i10 < 0 || i10 > r() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = c.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : w()[b10 - 1];
            int i15 = w()[x().length + b10];
            int min = Math.min(i13, (w()[b10] - i14) + i14) - i10;
            if (!c.a(x()[b10], i15 + (i10 - i14), bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override
    public h t() {
        return z().t();
    }

    @Override
    public String toString() {
        return z().toString();
    }

    @Override
    public void v(e eVar, int i10, int i11) {
        k.e(eVar, "buffer");
        int i12 = i11 + i10;
        int b10 = c.b(this, i10);
        while (i10 < i12) {
            int i13 = b10 == 0 ? 0 : w()[b10 - 1];
            int i14 = w()[x().length + b10];
            int min = Math.min(i12, (w()[b10] - i13) + i13) - i10;
            int i15 = i14 + (i10 - i13);
            v vVar = new v(x()[b10], i15, i15 + min, true, false);
            v vVar2 = eVar.f12644a;
            if (vVar2 == null) {
                vVar.f12678g = vVar;
                vVar.f12677f = vVar;
                eVar.f12644a = vVar;
            } else {
                k.c(vVar2);
                v vVar3 = vVar2.f12678g;
                k.c(vVar3);
                vVar3.c(vVar);
            }
            i10 += min;
            b10++;
        }
        eVar.Q0(eVar.size() + r());
    }

    public final int[] w() {
        return this.P;
    }

    public final byte[][] x() {
        return this.O;
    }

    public byte[] y() {
        byte[] bArr = new byte[r()];
        int length = x().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = w()[length + i10];
            int i14 = w()[i10];
            int i15 = i14 - i11;
            h.d(x()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public final h z() {
        return new h(y());
    }
}
