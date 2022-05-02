package p270t3;

import p020b5.C1186a;

public final class C8977v {
    public final byte[] f28872a;
    public final int f28873b;
    public int f28874c;
    public int f28875d;

    public C8977v(byte[] bArr) {
        this.f28872a = bArr;
        this.f28873b = bArr.length;
    }

    public final void m10788a() {
        int i;
        int i2 = this.f28874c;
        C1186a.m38184f(i2 >= 0 && (i2 < (i = this.f28873b) || (i2 == i && this.f28875d == 0)));
    }

    public int m10787b() {
        return (this.f28874c * 8) + this.f28875d;
    }

    public boolean m10786c() {
        boolean z = (((this.f28872a[this.f28874c] & 255) >> this.f28875d) & 1) == 1;
        m10784e(1);
        return z;
    }

    public int m10785d(int i) {
        int i2 = this.f28874c;
        int min = Math.min(i, 8 - this.f28875d);
        int i3 = i2 + 1;
        int i4 = ((this.f28872a[i2] & 255) >> this.f28875d) & (255 >> (8 - min));
        while (min < i) {
            i3++;
            i4 |= (this.f28872a[i3] & 255) << min;
            min += 8;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m10784e(i);
        return i5;
    }

    public void m10784e(int i) {
        int i2 = i / 8;
        int i3 = this.f28874c + i2;
        this.f28874c = i3;
        int i4 = this.f28875d + (i - (i2 * 8));
        this.f28875d = i4;
        if (i4 > 7) {
            this.f28874c = i3 + 1;
            this.f28875d = i4 - 8;
        }
        m10788a();
    }
}
