package d6;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class v0 {
    public static int a(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    public static int b(@NullableDecl Object obj, @NullableDecl Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int i11;
        int i12;
        int a10 = w0.a(obj);
        int i13 = a10 & i10;
        int c10 = c(obj3, i13);
        if (c10 != 0) {
            int i14 = ~i10;
            int i15 = a10 & i14;
            int i16 = -1;
            while (true) {
                i11 = c10 - 1;
                i12 = iArr[i11];
                if ((i12 & i14) != i15 || !n.a(obj, objArr[i11]) || (objArr2 != null && !n.a(obj2, objArr2[i11]))) {
                    int i17 = i12 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i16 = i11;
                    c10 = i17;
                }
            }
            int i18 = i12 & i10;
            if (i16 == -1) {
                e(obj3, i13, i18);
            } else {
                iArr[i16] = (i18 & i10) | (iArr[i16] & i14);
            }
            return i11;
        }
        return -1;
    }

    public static int c(Object obj, int i10) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i10];
        }
        return ((int[]) obj)[i10];
    }

    public static Object d(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("must be power of 2 between 2^1 and 2^30: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i10 <= 256) {
            return new byte[i10];
        } else {
            return i10 <= 65536 ? new short[i10] : new int[i10];
        }
    }

    public static void e(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
