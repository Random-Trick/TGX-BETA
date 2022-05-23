package c5;

import org.thunderdog.challegram.Log;

public final class c0 {
    public byte[] f4800a;
    public int f4801b;
    public int f4802c;
    public int f4803d;

    public c0(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.f4802c;
        a.f(i11 >= 0 && (i11 < (i10 = this.f4801b) || (i11 == i10 && this.f4803d == 0)));
    }

    public boolean b(int i10) {
        int i11 = this.f4802c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f4803d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f4801b) {
                break;
            } else if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f4801b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean c() {
        int i10 = this.f4802c;
        int i11 = this.f4803d;
        int i12 = 0;
        while (this.f4802c < this.f4801b && !d()) {
            i12++;
        }
        boolean z10 = this.f4802c == this.f4801b;
        this.f4802c = i10;
        this.f4803d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public boolean d() {
        boolean z10 = (this.f4800a[this.f4802c] & (Log.TAG_YOUTUBE >> this.f4803d)) != 0;
        k();
        return z10;
    }

    public int e(int i10) {
        int i11;
        int i12;
        this.f4803d += i10;
        int i13 = 0;
        while (true) {
            i11 = this.f4803d;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f4803d = i14;
            byte[] bArr = this.f4800a;
            int i15 = this.f4802c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!j(i15 + 1)) {
                i12 = 1;
            }
            this.f4802c = i15 + i12;
        }
        byte[] bArr2 = this.f4800a;
        int i16 = this.f4802c;
        int i17 = ((-1) >>> (32 - i10)) & (i13 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f4803d = 0;
            if (!j(i16 + 1)) {
                i12 = 1;
            }
            this.f4802c = i16 + i12;
        }
        a();
        return i17;
    }

    public final int f() {
        int i10 = 0;
        int i11 = 0;
        while (!d()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = e(i11);
        }
        return i12 + i10;
    }

    public int g() {
        int f10 = f();
        return (f10 % 2 == 0 ? -1 : 1) * ((f10 + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i10, int i11) {
        this.f4800a = bArr;
        this.f4802c = i10;
        this.f4801b = i11;
        this.f4803d = 0;
        a();
    }

    public final boolean j(int i10) {
        if (2 <= i10 && i10 < this.f4801b) {
            byte[] bArr = this.f4800a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void k() {
        int i10 = 1;
        int i11 = this.f4803d + 1;
        this.f4803d = i11;
        if (i11 == 8) {
            this.f4803d = 0;
            int i12 = this.f4802c;
            if (j(i12 + 1)) {
                i10 = 2;
            }
            this.f4802c = i12 + i10;
        }
        a();
    }

    public void l(int i10) {
        int i11 = this.f4802c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f4802c = i13;
        int i14 = this.f4803d + (i10 - (i12 * 8));
        this.f4803d = i14;
        if (i14 > 7) {
            this.f4802c = i13 + 1;
            this.f4803d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f4802c) {
                a();
                return;
            } else if (j(i11)) {
                this.f4802c++;
                i11 += 2;
            }
        }
    }
}
