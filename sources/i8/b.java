package i8;

public final class b {
    public final byte[] f14049a;
    public int f14050b;
    public int f14051c;

    public b(byte[] bArr) {
        this.f14049a = bArr;
    }

    public int a() {
        return ((this.f14049a.length - this.f14050b) * 8) - this.f14051c;
    }

    public int b(int i10) {
        if (i10 <= 0 || i10 > 32 || i10 > a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f14051c;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int min = Math.min(i10, i13);
            int i14 = i13 - min;
            byte[] bArr = this.f14049a;
            int i15 = this.f14050b;
            i12 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
            i10 -= min;
            int i16 = this.f14051c + min;
            this.f14051c = i16;
            if (i16 == 8) {
                this.f14051c = 0;
                this.f14050b = i15 + 1;
            }
        }
        if (i10 <= 0) {
            return i12;
        }
        while (i10 >= 8) {
            int i17 = i12 << 8;
            byte[] bArr2 = this.f14049a;
            int i18 = this.f14050b;
            i12 = (bArr2[i18] & 255) | i17;
            this.f14050b = i18 + 1;
            i10 -= 8;
        }
        if (i10 <= 0) {
            return i12;
        }
        int i19 = 8 - i10;
        int i20 = (i12 << i10) | ((((255 >> i19) << i19) & this.f14049a[this.f14050b]) >> i19);
        this.f14051c += i10;
        return i20;
    }
}
