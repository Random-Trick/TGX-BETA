package p093g8;

public final class C4526i extends AbstractC4524g {
    public final byte[] f14922c;
    public final int f14923d;
    public final int f14924e;
    public final int f14925f;
    public final int f14926g;

    public C4526i(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f14922c = bArr;
        this.f14923d = i;
        this.f14924e = i2;
        this.f14925f = i3;
        this.f14926g = i4;
        if (z) {
            m27493e(i5, i6);
        }
    }

    @Override
    public byte[] mo27495b() {
        int d = m27497d();
        int a = m27498a();
        int i = this.f14923d;
        if (d == i && a == this.f14924e) {
            return this.f14922c;
        }
        int i2 = d * a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f14926g * i) + this.f14925f;
        if (d == i) {
            System.arraycopy(this.f14922c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < a; i4++) {
            System.arraycopy(this.f14922c, i3, bArr, i4 * d, d);
            i3 += this.f14923d;
        }
        return bArr;
    }

    @Override
    public byte[] mo27494c(int i, byte[] bArr) {
        if (i < 0 || i >= m27498a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int d = m27497d();
        if (bArr == null || bArr.length < d) {
            bArr = new byte[d];
        }
        System.arraycopy(this.f14922c, ((i + this.f14926g) * this.f14923d) + this.f14925f, bArr, 0, d);
        return bArr;
    }

    public final void m27493e(int i, int i2) {
        byte[] bArr = this.f14922c;
        int i3 = (this.f14926g * this.f14923d) + this.f14925f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f14923d;
        }
    }
}
