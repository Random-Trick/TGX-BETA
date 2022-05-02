package p340y3;

import p270t3.AbstractC8959g;

public final class C10370g {
    public static final long[] f33361d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] f33362a = new byte[8];
    public int f33363b;
    public int f33364c;

    public static long m5293a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f33361d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static int m5291c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f33361d;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & i) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public int m5292b() {
        return this.f33364c;
    }

    public long m5290d(AbstractC8959g gVar, boolean z, boolean z2, int i) {
        if (this.f33363b == 0) {
            if (!gVar.mo10813d(this.f33362a, 0, 1, z)) {
                return -1L;
            }
            int c = m5291c(this.f33362a[0] & 255);
            this.f33364c = c;
            if (c != -1) {
                this.f33363b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f33364c;
        if (i2 > i) {
            this.f33363b = 0;
            return -2L;
        }
        if (i2 != 1) {
            gVar.readFully(this.f33362a, 1, i2 - 1);
        }
        this.f33363b = 0;
        return m5293a(this.f33362a, this.f33364c, z2);
    }

    public void m5289e() {
        this.f33363b = 0;
        this.f33364c = 0;
    }
}
