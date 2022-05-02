package p270t3;

import p020b5.C1186a;

public final class C8977v {
    public final byte[] f28875a;
    public final int f28876b;
    public int f28877c;
    public int f28878d;

    public C8977v(byte[] bArr) {
        this.f28875a = bArr;
        this.f28876b = bArr.length;
    }

    public final void m10787a() {
        int i;
        int i2 = this.f28877c;
        C1186a.m38187f(i2 >= 0 && (i2 < (i = this.f28876b) || (i2 == i && this.f28878d == 0)));
    }

    public int m10786b() {
        return (this.f28877c * 8) + this.f28878d;
    }

    public boolean m10785c() {
        boolean z = (((this.f28875a[this.f28877c] & 255) >> this.f28878d) & 1) == 1;
        m10783e(1);
        return z;
    }

    public int m10784d(int i) {
        int i2 = this.f28877c;
        int min = Math.min(i, 8 - this.f28878d);
        int i3 = i2 + 1;
        int i4 = ((this.f28875a[i2] & 255) >> this.f28878d) & (255 >> (8 - min));
        while (min < i) {
            i3++;
            i4 |= (this.f28875a[i3] & 255) << min;
            min += 8;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m10783e(i);
        return i5;
    }

    public void m10783e(int i) {
        int i2 = i / 8;
        int i3 = this.f28877c + i2;
        this.f28877c = i3;
        int i4 = this.f28878d + (i - (i2 * 8));
        this.f28878d = i4;
        if (i4 > 7) {
            this.f28877c = i3 + 1;
            this.f28878d = i4 - 8;
        }
        m10787a();
    }
}
