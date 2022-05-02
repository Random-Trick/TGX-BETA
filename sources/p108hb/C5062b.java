package p108hb;

import android.os.Build;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p123ia.C5294h;
import p123ia.C5296i;
import p123ia.C5309s;
import p123ia.C5312v;
import p139jb.AbstractC5911c;
import p139jb.AbstractC5912d;
import p139jb.AbstractC5918j;
import p143k0.C6035e;
import p143k0.C6038h;
import qa.C8298k;

public final class C5062b {
    public static final int[] f17068a = new int[0];
    public static final long[] f17069b = new long[0];

    public static final <T extends Comparable<? super T>> boolean m24181A(ArrayList<T> arrayList, T t) {
        C8298k.m12934e(arrayList, "<this>");
        C8298k.m12934e(t, "element");
        int binarySearch = Collections.binarySearch(arrayList, t);
        if (binarySearch < 0) {
            return false;
        }
        arrayList.remove(binarySearch);
        return true;
    }

    public static final <T> T m24180B(C6038h<T> hVar, int i) {
        C8298k.m12934e(hVar, "<this>");
        int g = hVar.m21469g(i);
        if (g < 0) {
            return null;
        }
        T o = hVar.m21462o(g);
        hVar.m21464l(g);
        return o;
    }

    public static final <T> T[] m24179C(T[] tArr, int i, AbstractC5918j<T> jVar) {
        C8298k.m12934e(tArr, "<this>");
        if (tArr.length == i) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        C8298k.m12935d(tArr2, "copyOf(this, newSize)");
        if (jVar != null) {
            int length = tArr.length;
            while (i < length) {
                i++;
                T t = tArr[i];
                if (t != null) {
                    jVar.mo1330a(t);
                }
            }
        }
        return tArr2;
    }

    public static final <T extends AbstractC5911c> T[] m24178D(T[] tArr, int i) {
        C8298k.m12934e(tArr, "<this>");
        return (T[]) ((AbstractC5911c[]) m24179C(tArr, i, C5061a.f17067a));
    }

    public static final void m24177E(AbstractC5911c cVar) {
        if (cVar != null) {
            cVar.mo4501a3();
        }
    }

    public static final float m24176F(float[] fArr, int i) {
        C8298k.m12934e(fArr, "array");
        if (i == fArr.length) {
            return C5296i.m23405H(fArr);
        }
        float f = 0.0f;
        int i2 = 0;
        int min = Math.min(i, fArr.length);
        while (i2 < min) {
            i2++;
            f += fArr[i2];
        }
        return f;
    }

    public static final int m24175G(int[] iArr) {
        C8298k.m12934e(iArr, "array");
        return C5296i.m23404I(iArr);
    }

    public static final void m24174H(List<Long> list, long[] jArr) {
        C8298k.m12934e(list, "list");
        C8298k.m12934e(jArr, "out");
        int i = 0;
        if (list.size() == jArr.length) {
            int size = list.size();
            while (i < size) {
                i++;
                jArr[i] = list.get(i).longValue();
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final String m24173I(long[] jArr, int i) {
        String E;
        return (jArr == null || (E = C5296i.m23408E(jArr, ", ", "[", "]", i, "", null, 32, null)) == null) ? "null" : E;
    }

    public static final void m24172J(List<?> list) {
        C8298k.m12934e(list, "<this>");
        if (list instanceof ArrayList) {
            ((ArrayList) list).trimToSize();
        }
    }

    public static final long[] m24170b(long[] jArr, long j) {
        C8298k.m12934e(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length + 1);
        C8298k.m12935d(copyOf, "copyOf(this, newSize)");
        copyOf[jArr.length] = j;
        return copyOf;
    }

    public static final <T extends Comparable<? super T>> int m24169c(ArrayList<T> arrayList, T t) {
        C8298k.m12934e(arrayList, "<this>");
        C8298k.m12934e(t, "element");
        int binarySearch = Collections.binarySearch(arrayList, t);
        if (binarySearch < 0) {
            int i = (-binarySearch) - 1;
            arrayList.add(i, t);
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static final long[] m24168d(List<Long> list) {
        C8298k.m12934e(list, "list");
        return C5312v.m23328T(list);
    }

    public static final <T> T[] m24167e(C6035e<T> eVar, T[] tArr) {
        C8298k.m12934e(eVar, "array");
        C8298k.m12934e(tArr, "out");
        int p = eVar.m21496p();
        int i = 0;
        while (i < p) {
            i++;
            tArr[i] = eVar.m21495q(i);
        }
        return tArr;
    }

    public static final <T> T[] m24166f(C6038h<T> hVar, T[] tArr) {
        C8298k.m12934e(hVar, "array");
        C8298k.m12934e(tArr, "out");
        int n = hVar.m21463n();
        int i = 0;
        while (i < n) {
            i++;
            tArr[i] = hVar.m21462o(i);
        }
        return tArr;
    }

    public static final <T> List<T> m24165g(T... tArr) {
        C8298k.m12934e(tArr, "items");
        ArrayList arrayList = new ArrayList(tArr.length);
        C5309s.m23353s(arrayList, tArr);
        return arrayList;
    }

    public static final <T> void m24164h(T[] tArr) {
        C8298k.m12934e(tArr, "array");
        C5294h.m23426j(tArr, null, 0, 0, 6, null);
    }

    public static final boolean m24163i(char[] cArr, char c) {
        if (cArr == null) {
            return false;
        }
        return C5296i.m23394m(cArr, c);
    }

    public static final boolean m24162j(long[] jArr, long j) {
        if (jArr == null) {
            return false;
        }
        return C5296i.m23393n(jArr, j);
    }

    public static final <T> boolean m24161k(T[] tArr, T t) {
        if (tArr == null) {
            return false;
        }
        return C5296i.m23392o(tArr, t);
    }

    public static final boolean m24160l(p143k0.C6035e<long[]> r10, p143k0.C6035e<long[]> r11) {
        throw new UnsupportedOperationException("Method not decompiled: p108hb.C5062b.m24160l(k0.e, k0.e):boolean");
    }

    public static final void m24159m(List<?> list, int i) {
        C8298k.m12934e(list, "<this>");
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(i);
        }
    }

    public static final boolean m24158n(long[] jArr, long[] jArr2) {
        if (jArr == jArr2) {
            return true;
        }
        if (jArr == null || jArr2 == null || jArr.length != jArr2.length) {
            return false;
        }
        C5294h.m23425k(jArr);
        C5294h.m23425k(jArr2);
        return Arrays.equals(jArr, jArr2);
    }

    public static final <T> List<T> m24157o(List<T> list, AbstractC5912d<T> dVar) {
        C8298k.m12934e(list, "<this>");
        C8298k.m12934e(dVar, "filter");
        if (list.isEmpty()) {
            List<T> emptyList = Collections.emptyList();
            C8298k.m12935d(emptyList, "emptyList()");
            return emptyList;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (T t : list) {
            if (dVar.mo1511a(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final long m24156p(long[] jArr, long[] jArr2) {
        if (!(jArr == null || jArr2 == null)) {
            int length = jArr.length;
            int i = 0;
            while (i < length) {
                long j = jArr[i];
                i++;
                if (j != 0) {
                    int length2 = jArr2.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        long j2 = jArr2[i2];
                        i2++;
                        if (j == j2) {
                            return j;
                        }
                    }
                    continue;
                }
            }
        }
        return 0L;
    }

    public static final int m24155q(SparseIntArray sparseIntArray, int i) {
        C8298k.m12934e(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i);
        int i2 = 1;
        if (indexOfKey >= 0) {
            i2 = 1 + sparseIntArray.valueAt(indexOfKey);
        }
        if (Build.VERSION.SDK_INT < 29 || indexOfKey < 0) {
            sparseIntArray.put(i, i2);
        } else {
            sparseIntArray.setValueAt(indexOfKey, i2);
        }
        return i2;
    }

    public static final int m24154r(int[] iArr, int i) {
        if (iArr == null) {
            return -1;
        }
        return C5296i.m23385v(iArr, i);
    }

    public static final int m24153s(long[] jArr, long j) {
        if (jArr == null) {
            return -1;
        }
        return C5296i.m23384w(jArr, j);
    }

    public static final <T> int m24152t(T[] tArr, T t) {
        if (tArr == null) {
            return -1;
        }
        return C5296i.m23383x(tArr, t);
    }

    public static final long[] m24151u(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr2 == null) {
            return null;
        }
        return C5312v.m23328T(C5296i.m23382y(jArr, C5296i.m23397P(jArr2)));
    }

    public static final <T> long[] m24150v(C6035e<T> eVar) {
        C8298k.m12934e(eVar, "<this>");
        long[] jArr = new long[eVar.m21496p()];
        int p = eVar.m21496p();
        int i = 0;
        while (i < p) {
            i++;
            jArr[i] = eVar.m21501j(i);
        }
        return jArr;
    }

    public static final <T> void m24149w(List<T> list, int i, int i2) {
        C8298k.m12934e(list, "<this>");
        if (i != i2) {
            T t = list.get(i);
            list.remove(i);
            list.add(i2, t);
        }
    }

    public static final long[] m24148x(long[] jArr, long[] jArr2) {
        C8298k.m12934e(jArr, "array");
        C8298k.m12934e(jArr2, "itemsToRemove");
        List<Long> M = C5296i.m23400M(jArr);
        return M.removeAll(C5296i.m23400M(jArr2)) ? C5312v.m23328T(M) : jArr;
    }

    public static final long[] m24147y(long[] jArr, int i) {
        C8298k.m12934e(jArr, "<this>");
        if (i < 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length - 1];
        if (i > 0) {
            System.arraycopy(jArr, 0, jArr2, 0, i);
        }
        if (i < jArr.length - 1) {
            System.arraycopy(jArr, i + 1, jArr2, i, (jArr.length - i) - 1);
        }
        return jArr2;
    }

    public static final <T> T[] m24146z(T[] tArr, int i, T[] tArr2) {
        C8298k.m12934e(tArr, "<this>");
        C8298k.m12934e(tArr2, "out");
        if (i > 0) {
            System.arraycopy(tArr, 0, tArr2, 0, i);
        }
        if (i < tArr.length - 1) {
            System.arraycopy(tArr, i + 1, tArr2, i, (tArr.length - i) - 1);
        }
        return tArr2;
    }
}
