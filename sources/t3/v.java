package t3;

import c5.a;

public final class v {
    public final byte[] f22914a;
    public final int f22915b;
    public int f22916c;
    public int f22917d;

    public v(byte[] bArr) {
        this.f22914a = bArr;
        this.f22915b = bArr.length;
    }

    public final void a() {
        int i10;
        int i11 = this.f22916c;
        a.f(i11 >= 0 && (i11 < (i10 = this.f22915b) || (i11 == i10 && this.f22917d == 0)));
    }

    public int b() {
        return (this.f22916c * 8) + this.f22917d;
    }

    public boolean c() {
        boolean z10 = (((this.f22914a[this.f22916c] & 255) >> this.f22917d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f22916c;
        int min = Math.min(i10, 8 - this.f22917d);
        int i12 = i11 + 1;
        int i13 = ((this.f22914a[i11] & 255) >> this.f22917d) & (255 >> (8 - min));
        while (min < i10) {
            i12++;
            i13 |= (this.f22914a[i12] & 255) << min;
            min += 8;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f22916c + i11;
        this.f22916c = i12;
        int i13 = this.f22917d + (i10 - (i11 * 8));
        this.f22917d = i13;
        if (i13 > 7) {
            this.f22916c = i12 + 1;
            this.f22917d = i13 - 8;
        }
        a();
    }
}
