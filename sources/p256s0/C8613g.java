package p256s0;

import java.lang.reflect.Array;

public final class C8613g {
    public static int[] m11924a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m11922c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    public static <T> T[] m11923b(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            ?? r0 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m11922c(i));
            System.arraycopy(tArr, 0, r0, 0, i);
            tArr = r0;
        }
        tArr[i] = t;
        return tArr;
    }

    public static int m11922c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}
