package a4;

import c5.l0;
import org.thunderdog.challegram.Log;

public final class d {

    public static final class b {
        public final long[] f264a;
        public final int[] f265b;
        public final int f266c;
        public final long[] f267d;
        public final int[] f268e;
        public final long f269f;

        public b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f264a = jArr;
            this.f265b = iArr;
            this.f266c = i10;
            this.f267d = jArr2;
            this.f268e = iArr2;
            this.f269f = j10;
        }
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = Log.TAG_LUX / i10;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += l0.l(i13, i11);
        }
        long[] jArr2 = new long[i12];
        int[] iArr2 = new int[i12];
        long[] jArr3 = new long[i12];
        int[] iArr3 = new int[i12];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < iArr.length; i17++) {
            int i18 = iArr[i17];
            long j11 = jArr[i17];
            while (i18 > 0) {
                int min = Math.min(i11, i18);
                jArr2[i15] = j11;
                iArr2[i15] = i10 * min;
                i16 = Math.max(i16, iArr2[i15]);
                jArr3[i15] = i14 * j10;
                iArr3[i15] = 1;
                j11 += iArr2[i15];
                i14 += min;
                i18 -= min;
                i15++;
            }
        }
        return new b(jArr2, iArr2, i16, jArr3, iArr3, j10 * i14);
    }
}
