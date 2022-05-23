package y3;

public final class g {
    public static final long[] f26566d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] f26567a = new byte[8];
    public int f26568b;
    public int f26569c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f26566d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f26566d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & i10) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f26569c;
    }

    public long d(t3.g gVar, boolean z10, boolean z11, int i10) {
        if (this.f26568b == 0) {
            if (!gVar.c(this.f26567a, 0, 1, z10)) {
                return -1L;
            }
            int c10 = c(this.f26567a[0] & 255);
            this.f26569c = c10;
            if (c10 != -1) {
                this.f26568b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f26569c;
        if (i11 > i10) {
            this.f26568b = 0;
            return -2L;
        }
        if (i11 != 1) {
            gVar.readFully(this.f26567a, 1, i11 - 1);
        }
        this.f26568b = 0;
        return a(this.f26567a, this.f26569c, z11);
    }

    public void e() {
        this.f26568b = 0;
        this.f26569c = 0;
    }
}
