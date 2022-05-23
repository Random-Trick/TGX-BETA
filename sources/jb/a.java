package jb;

public final class a {
    public static int a(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 <= i11) {
                return i14;
            } else {
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static int b(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (jArr[i13] > j10 ? 1 : (jArr[i13] == j10 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 <= 0) {
                return i13;
            } else {
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static int c(int i10) {
        if (i10 <= 4) {
            return 8;
        }
        return i10 * 2;
    }

    public static int d(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    public static int e(int i10) {
        return d(i10 * 8) / 8;
    }

    public static int[] f(int[] iArr, int i10, int i11, int i12) {
        if (i10 + 1 <= iArr.length) {
            System.arraycopy(iArr, i11, iArr, i11 + 1, i10 - i11);
            iArr[i11] = i12;
            return iArr;
        }
        int[] iArr2 = new int[c(i10)];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        iArr2[i11] = i12;
        System.arraycopy(iArr, i11, iArr2, i11 + 1, iArr.length - i11);
        return iArr2;
    }

    public static long[] g(long[] jArr, int i10, int i11, long j10) {
        if (i10 + 1 <= jArr.length) {
            System.arraycopy(jArr, i11, jArr, i11 + 1, i10 - i11);
            jArr[i11] = j10;
            return jArr;
        }
        long[] jArr2 = new long[c(i10)];
        System.arraycopy(jArr, 0, jArr2, 0, i11);
        jArr2[i11] = j10;
        System.arraycopy(jArr, i11, jArr2, i11 + 1, jArr.length - i11);
        return jArr2;
    }
}
