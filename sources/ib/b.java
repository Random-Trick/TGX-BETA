package ib;

import android.os.Build;
import android.util.SparseIntArray;
import ja.i;
import ja.s;
import ja.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k0.e;
import k0.h;
import kb.c;
import kb.d;
import kb.j;
import ra.k;

public final class b {
    public static final int[] f14161a = new int[0];
    public static final long[] f14162b = new long[0];

    public static final <T extends Comparable<? super T>> boolean A(ArrayList<T> arrayList, T t10) {
        k.e(arrayList, "<this>");
        k.e(t10, "element");
        int binarySearch = Collections.binarySearch(arrayList, t10);
        if (binarySearch < 0) {
            return false;
        }
        arrayList.remove(binarySearch);
        return true;
    }

    public static final <T> T B(h<T> hVar, int i10) {
        k.e(hVar, "<this>");
        int g10 = hVar.g(i10);
        if (g10 < 0) {
            return null;
        }
        T o10 = hVar.o(g10);
        hVar.l(g10);
        return o10;
    }

    public static final <T> T[] C(T[] tArr, int i10, j<T> jVar) {
        k.e(tArr, "<this>");
        if (tArr.length == i10) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        k.d(tArr2, "copyOf(this, newSize)");
        if (jVar != null) {
            int length = tArr.length;
            while (i10 < length) {
                T t10 = tArr[i10];
                if (t10 != null) {
                    jVar.a(t10);
                }
                i10++;
            }
        }
        return tArr2;
    }

    public static final <T extends c> T[] D(T[] tArr, int i10) {
        k.e(tArr, "<this>");
        return (T[]) ((c[]) C(tArr, i10, a.f14160a));
    }

    public static final void E(c cVar) {
        if (cVar != null) {
            cVar.Q2();
        }
    }

    public static final float F(float[] fArr, int i10) {
        k.e(fArr, "array");
        if (i10 == fArr.length) {
            return i.H(fArr);
        }
        float f10 = 0.0f;
        int min = Math.min(i10, fArr.length);
        for (int i11 = 0; i11 < min; i11++) {
            f10 += fArr[i11];
        }
        return f10;
    }

    public static final int G(int[] iArr) {
        k.e(iArr, "array");
        return i.I(iArr);
    }

    public static final void H(List<Long> list, long[] jArr) {
        k.e(list, "list");
        k.e(jArr, "out");
        if (list.size() == jArr.length) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = list.get(i10).longValue();
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final String I(long[] jArr, int i10) {
        String E;
        return (jArr == null || (E = i.E(jArr, ", ", "[", "]", i10, "", null, 32, null)) == null) ? "null" : E;
    }

    public static final void J(List<?> list) {
        k.e(list, "<this>");
        if (list instanceof ArrayList) {
            ((ArrayList) list).trimToSize();
        }
    }

    public static final long[] b(long[] jArr, long j10) {
        k.e(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length + 1);
        k.d(copyOf, "copyOf(this, newSize)");
        copyOf[jArr.length] = j10;
        return copyOf;
    }

    public static final <T extends Comparable<? super T>> int c(ArrayList<T> arrayList, T t10) {
        k.e(arrayList, "<this>");
        k.e(t10, "element");
        int binarySearch = Collections.binarySearch(arrayList, t10);
        if (binarySearch < 0) {
            int i10 = (-binarySearch) - 1;
            arrayList.add(i10, t10);
            return i10;
        }
        throw new IllegalArgumentException();
    }

    public static final long[] d(List<Long> list) {
        k.e(list, "list");
        return v.T(list);
    }

    public static final <T> T[] e(e<T> eVar, T[] tArr) {
        k.e(eVar, "array");
        k.e(tArr, "out");
        int p10 = eVar.p();
        for (int i10 = 0; i10 < p10; i10++) {
            tArr[i10] = eVar.q(i10);
        }
        return tArr;
    }

    public static final <T> T[] f(h<T> hVar, T[] tArr) {
        k.e(hVar, "array");
        k.e(tArr, "out");
        int n10 = hVar.n();
        for (int i10 = 0; i10 < n10; i10++) {
            tArr[i10] = hVar.o(i10);
        }
        return tArr;
    }

    public static final <T> List<T> g(T... tArr) {
        k.e(tArr, "items");
        ArrayList arrayList = new ArrayList(tArr.length);
        s.s(arrayList, tArr);
        return arrayList;
    }

    public static final <T> void h(T[] tArr) {
        k.e(tArr, "array");
        ja.h.j(tArr, null, 0, 0, 6, null);
    }

    public static final boolean i(char[] cArr, char c10) {
        if (cArr != null) {
            return i.m(cArr, c10);
        }
        return false;
    }

    public static final boolean j(long[] jArr, long j10) {
        if (jArr != null) {
            return i.n(jArr, j10);
        }
        return false;
    }

    public static final <T> boolean k(T[] tArr, T t10) {
        if (tArr != null) {
            return i.o(tArr, t10);
        }
        return false;
    }

    public static final boolean l(e<long[]> eVar, e<long[]> eVar2) {
        if (eVar == null && eVar2 == null) {
            return true;
        }
        if (eVar == null || eVar2 == null || eVar.p() != eVar2.p()) {
            return false;
        }
        int p10 = eVar.p();
        if (p10 < 0) {
            return true;
        }
        for (int i10 = 0; eVar.j(i10) == eVar2.j(i10) && Arrays.equals(eVar.q(i10), eVar2.q(i10)); i10++) {
            if (i10 == p10) {
                return true;
            }
        }
        return false;
    }

    public static final void m(List<?> list, int i10) {
        k.e(list, "<this>");
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(i10);
        }
    }

    public static final boolean n(long[] jArr, long[] jArr2) {
        if (jArr == jArr2) {
            return true;
        }
        if (jArr == null || jArr2 == null || jArr.length != jArr2.length) {
            return false;
        }
        ja.h.k(jArr);
        ja.h.k(jArr2);
        return Arrays.equals(jArr, jArr2);
    }

    public static final <T> List<T> o(List<T> list, d<T> dVar) {
        k.e(list, "<this>");
        k.e(dVar, "filter");
        if (list.isEmpty()) {
            List<T> emptyList = Collections.emptyList();
            k.d(emptyList, "emptyList()");
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (T t10 : list) {
            if (dVar.a(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final long p(long[] jArr, long[] jArr2) {
        if (!(jArr == null || jArr2 == null)) {
            for (long j10 : jArr) {
                if (j10 != 0) {
                    for (long j11 : jArr2) {
                        if (j10 == j11) {
                            return j10;
                        }
                    }
                    continue;
                }
            }
        }
        return 0L;
    }

    public static final int q(SparseIntArray sparseIntArray, int i10) {
        k.e(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        int i11 = 1;
        if (indexOfKey >= 0) {
            i11 = 1 + sparseIntArray.valueAt(indexOfKey);
        }
        if (Build.VERSION.SDK_INT < 29 || indexOfKey < 0) {
            sparseIntArray.put(i10, i11);
        } else {
            sparseIntArray.setValueAt(indexOfKey, i11);
        }
        return i11;
    }

    public static final int r(int[] iArr, int i10) {
        if (iArr != null) {
            return i.v(iArr, i10);
        }
        return -1;
    }

    public static final int s(long[] jArr, long j10) {
        if (jArr != null) {
            return i.w(jArr, j10);
        }
        return -1;
    }

    public static final <T> int t(T[] tArr, T t10) {
        if (tArr != null) {
            return i.x(tArr, t10);
        }
        return -1;
    }

    public static final long[] u(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr2 == null) {
            return null;
        }
        return v.T(i.y(jArr, i.P(jArr2)));
    }

    public static final <T> long[] v(e<T> eVar) {
        k.e(eVar, "<this>");
        long[] jArr = new long[eVar.p()];
        int p10 = eVar.p();
        for (int i10 = 0; i10 < p10; i10++) {
            jArr[i10] = eVar.j(i10);
        }
        return jArr;
    }

    public static final <T> void w(List<T> list, int i10, int i11) {
        k.e(list, "<this>");
        if (i10 != i11) {
            T t10 = list.get(i10);
            list.remove(i10);
            list.add(i11, t10);
        }
    }

    public static final long[] x(long[] jArr, long[] jArr2) {
        k.e(jArr, "array");
        k.e(jArr2, "itemsToRemove");
        List<Long> M = i.M(jArr);
        return M.removeAll(i.M(jArr2)) ? v.T(M) : jArr;
    }

    public static final long[] y(long[] jArr, int i10) {
        k.e(jArr, "<this>");
        if (i10 < 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length - 1];
        if (i10 > 0) {
            System.arraycopy(jArr, 0, jArr2, 0, i10);
        }
        if (i10 < jArr.length - 1) {
            System.arraycopy(jArr, i10 + 1, jArr2, i10, (jArr.length - i10) - 1);
        }
        return jArr2;
    }

    public static final <T> T[] z(T[] tArr, int i10, T[] tArr2) {
        k.e(tArr, "<this>");
        k.e(tArr2, "out");
        if (i10 > 0) {
            System.arraycopy(tArr, 0, tArr2, 0, i10);
        }
        if (i10 < tArr.length - 1) {
            System.arraycopy(tArr, i10 + 1, tArr2, i10, (tArr.length - i10) - 1);
        }
        return tArr2;
    }
}
