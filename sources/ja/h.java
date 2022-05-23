package ja;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import ra.k;

public class h extends g {
    public static final <T> List<T> c(T[] tArr) {
        k.e(tArr, "<this>");
        List<T> a10 = j.a(tArr);
        k.d(a10, "asList(this)");
        return a10;
    }

    public static final byte[] d(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        k.e(bArr, "<this>");
        k.e(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static final <T> T[] e(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        k.e(tArr, "<this>");
        k.e(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static byte[] f(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return d(bArr, bArr2, i10, i11, i12);
    }

    public static Object[] g(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return e(objArr, objArr2, i10, i11, i12);
    }

    public static final byte[] h(byte[] bArr, int i10, int i11) {
        k.e(bArr, "<this>");
        f.b(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        k.d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final <T> void i(T[] tArr, T t10, int i10, int i11) {
        k.e(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static void j(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        i(objArr, obj, i10, i11);
    }

    public static final void k(long[] jArr) {
        k.e(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static final <T> void l(T[] tArr, Comparator<? super T> comparator) {
        k.e(tArr, "<this>");
        k.e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
