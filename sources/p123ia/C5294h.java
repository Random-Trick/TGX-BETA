package p123ia;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import qa.C8298k;

public class C5294h extends C5292g {
    public static final <T> List<T> m23434c(T[] tArr) {
        C8298k.m12933e(tArr, "<this>");
        List<T> a = C5299j.m23379a(tArr);
        C8298k.m12934d(a, "asList(this)");
        return a;
    }

    public static final byte[] m23433d(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C8298k.m12933e(bArr, "<this>");
        C8298k.m12933e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static final <T> T[] m23432e(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C8298k.m12933e(tArr, "<this>");
        C8298k.m12933e(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static byte[] m23431f(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return m23433d(bArr, bArr2, i, i2, i3);
    }

    public static Object[] m23430g(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m23432e(objArr, objArr2, i, i2, i3);
    }

    public static final byte[] m23429h(byte[] bArr, int i, int i2) {
        C8298k.m12933e(bArr, "<this>");
        C5290f.m23438b(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C8298k.m12934d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final <T> void m23428i(T[] tArr, T t, int i, int i2) {
        C8298k.m12933e(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    public static void m23427j(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m23428i(objArr, obj, i, i2);
    }

    public static final void m23426k(long[] jArr) {
        C8298k.m12933e(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static final <T> void m23425l(T[] tArr, Comparator<? super T> comparator) {
        C8298k.m12933e(tArr, "<this>");
        C8298k.m12933e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
