package h8;

public final class i extends g {
    public final byte[] f12606c;
    public final int f12607d;
    public final int f12608e;
    public final int f12609f;
    public final int f12610g;

    public i(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 > i10 || i13 + i15 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f12606c = bArr;
        this.f12607d = i10;
        this.f12608e = i11;
        this.f12609f = i12;
        this.f12610g = i13;
        if (z10) {
            e(i14, i15);
        }
    }

    @Override
    public byte[] b() {
        int d10 = d();
        int a10 = a();
        int i10 = this.f12607d;
        if (d10 == i10 && a10 == this.f12608e) {
            return this.f12606c;
        }
        int i11 = d10 * a10;
        byte[] bArr = new byte[i11];
        int i12 = (this.f12610g * i10) + this.f12609f;
        if (d10 == i10) {
            System.arraycopy(this.f12606c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < a10; i13++) {
            System.arraycopy(this.f12606c, i12, bArr, i13 * d10, d10);
            i12 += this.f12607d;
        }
        return bArr;
    }

    @Override
    public byte[] c(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i10)));
        }
        int d10 = d();
        if (bArr == null || bArr.length < d10) {
            bArr = new byte[d10];
        }
        System.arraycopy(this.f12606c, ((i10 + this.f12610g) * this.f12607d) + this.f12609f, bArr, 0, d10);
        return bArr;
    }

    public final void e(int i10, int i11) {
        byte[] bArr = this.f12606c;
        int i12 = (this.f12610g * this.f12607d) + this.f12609f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = (i10 / 2) + i12;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14) {
                byte b10 = bArr[i16];
                bArr[i16] = bArr[i15];
                bArr[i15] = b10;
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f12607d;
        }
    }
}
