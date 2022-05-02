package p105h8;

public final class C5023b {
    public final byte[] f16939a;
    public int f16940b;
    public int f16941c;

    public C5023b(byte[] bArr) {
        this.f16939a = bArr;
    }

    public int m24274a() {
        return ((this.f16939a.length - this.f16940b) * 8) - this.f16941c;
    }

    public int m24273b(int i) {
        if (i <= 0 || i > 32 || i > m24274a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f16941c;
        int i3 = 0;
        if (i2 > 0) {
            int i4 = 8 - i2;
            int min = Math.min(i, i4);
            int i5 = i4 - min;
            byte[] bArr = this.f16939a;
            int i6 = this.f16940b;
            i3 = (((255 >> (8 - min)) << i5) & bArr[i6]) >> i5;
            i -= min;
            int i7 = this.f16941c + min;
            this.f16941c = i7;
            if (i7 == 8) {
                this.f16941c = 0;
                this.f16940b = i6 + 1;
            }
        }
        if (i <= 0) {
            return i3;
        }
        while (i >= 8) {
            int i8 = i3 << 8;
            byte[] bArr2 = this.f16939a;
            int i9 = this.f16940b;
            i3 = (bArr2[i9] & 255) | i8;
            this.f16940b = i9 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return i3;
        }
        int i10 = 8 - i;
        int i11 = (i3 << i) | ((((255 >> i10) << i10) & this.f16939a[this.f16940b]) >> i10);
        this.f16941c += i;
        return i11;
    }
}
