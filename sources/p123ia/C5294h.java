package p123ia;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import qa.C8298k;

public class C5294h extends C5292g {
    public static final <T> List<T> m23433c(T[] tArr) {
        C8298k.m12934e(tArr, "<this>");
        List<T> a = C5299j.m23378a(tArr);
        C8298k.m12935d(a, "asList(this)");
        return a;
    }

    public static final byte[] m23432d(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C8298k.m12934e(bArr, "<this>");
        C8298k.m12934e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static final <T> T[] m23431e(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C8298k.m12934e(tArr, "<this>");
        C8298k.m12934e(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static byte[] m23430f(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return m23432d(bArr, bArr2, i, i2, i3);
    }

    public static Object[] m23429g(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m23431e(objArr, objArr2, i, i2, i3);
    }

    public static final byte[] m23428h(byte[] bArr, int i, int i2) {
        C8298k.m12934e(bArr, "<this>");
        C5290f.m23437b(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C8298k.m12935d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final <T> void m23427i(T[] tArr, T t, int i, int i2) {
        C8298k.m12934e(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    public static void m23426j(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m23427i(objArr, obj, i, i2);
    }

    public static final void m23425k(long[] jArr) {
        C8298k.m12934e(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static final <T> void m23424l(T[] tArr, Comparator<? super T> comparator) {
        C8298k.m12934e(tArr, "<this>");
        C8298k.m12934e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
