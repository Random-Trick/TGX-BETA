package p020b5;

import org.thunderdog.challegram.Log;

public final class C1191c0 {
    public byte[] f4477a;
    public int f4478b;
    public int f4479c;
    public int f4480d;

    public C1191c0(byte[] bArr, int i, int i2) {
        m38105i(bArr, i, i2);
    }

    public final void m38113a() {
        int i;
        int i2 = this.f4479c;
        C1186a.m38187f(i2 >= 0 && (i2 < (i = this.f4478b) || (i2 == i && this.f4480d == 0)));
    }

    public boolean m38112b(int i) {
        int i2 = this.f4479c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f4480d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f4478b) {
                break;
            } else if (m38104j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f4478b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public boolean m38111c() {
        int i = this.f4479c;
        int i2 = this.f4480d;
        int i3 = 0;
        while (this.f4479c < this.f4478b && !m38110d()) {
            i3++;
        }
        boolean z = this.f4479c == this.f4478b;
        this.f4479c = i;
        this.f4480d = i2;
        return !z && m38112b((i3 * 2) + 1);
    }

    public boolean m38110d() {
        boolean z = (this.f4477a[this.f4479c] & (Log.TAG_YOUTUBE >> this.f4480d)) != 0;
        m38103k();
        return z;
    }

    public int m38109e(int i) {
        int i2;
        int i3;
        this.f4480d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f4480d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f4480d = i5;
            byte[] bArr = this.f4477a;
            int i6 = this.f4479c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m38104j(i6 + 1)) {
                i3 = 1;
            }
            this.f4479c = i6 + i3;
        }
        byte[] bArr2 = this.f4477a;
        int i7 = this.f4479c;
        int i8 = ((-1) >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f4480d = 0;
            if (!m38104j(i7 + 1)) {
                i3 = 1;
            }
            this.f4479c = i7 + i3;
        }
        m38113a();
        return i8;
    }

    public final int m38108f() {
        int i = 0;
        int i2 = 0;
        while (!m38110d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = m38109e(i2);
        }
        return i3 + i;
    }

    public int m38107g() {
        int f = m38108f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    public int m38106h() {
        return m38108f();
    }

    public void m38105i(byte[] bArr, int i, int i2) {
        this.f4477a = bArr;
        this.f4479c = i;
        this.f4478b = i2;
        this.f4480d = 0;
        m38113a();
    }

    public final boolean m38104j(int i) {
        if (2 <= i && i < this.f4478b) {
            byte[] bArr = this.f4477a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void m38103k() {
        int i = 1;
        int i2 = this.f4480d + 1;
        this.f4480d = i2;
        if (i2 == 8) {
            this.f4480d = 0;
            int i3 = this.f4479c;
            if (m38104j(i3 + 1)) {
                i = 2;
            }
            this.f4479c = i3 + i;
        }
        m38113a();
    }

    public void m38102l(int i) {
        int i2 = this.f4479c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f4479c = i4;
        int i5 = this.f4480d + (i - (i3 * 8));
        this.f4480d = i5;
        if (i5 > 7) {
            this.f4479c = i4 + 1;
            this.f4480d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f4479c) {
                m38113a();
                return;
            } else if (m38104j(i2)) {
                this.f4479c++;
                i2 += 2;
            }
        }
    }
}
