package ja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import ra.b;
import ra.k;
import ra.l;
import xa.g;

public class i extends h {

    public static final class a extends l implements qa.a<Iterator<? extends T>> {
        public final T[] f15173b;

        public a(T[] tArr) {
            super(0);
            this.f15173b = tArr;
        }

        public final Iterator<T> b() {
            return b.a(this.f15173b);
        }
    }

    public static final <A extends Appendable> A A(long[] jArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l<? super Long, ? extends CharSequence> lVar) {
        k.e(jArr, "<this>");
        k.e(a10, "buffer");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                a10.append(lVar.a(Long.valueOf(j10)));
            } else {
                a10.append(String.valueOf(j10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final String B(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l<? super Integer, ? extends CharSequence> lVar) {
        k.e(iArr, "<this>");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) z(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        k.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final String C(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l<? super Long, ? extends CharSequence> lVar) {
        k.e(jArr, "<this>");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) A(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        k.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static String D(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return B(iArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static String E(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return C(jArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static final char F(char[] cArr) {
        k.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final <T> T G(T[] tArr) {
        k.e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final float H(float[] fArr) {
        k.e(fArr, "<this>");
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        return f10;
    }

    public static final int I(int[] iArr) {
        k.e(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    public static final <C extends Collection<? super Long>> C J(long[] jArr, C c10) {
        k.e(jArr, "<this>");
        k.e(c10, "destination");
        for (long j10 : jArr) {
            c10.add(Long.valueOf(j10));
        }
        return c10;
    }

    public static final <T, C extends Collection<? super T>> C K(T[] tArr, C c10) {
        k.e(tArr, "<this>");
        k.e(c10, "destination");
        for (T t10 : tArr) {
            c10.add(t10);
        }
        return c10;
    }

    public static final <T> List<T> L(T[] tArr) {
        k.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return n.f();
        }
        if (length != 1) {
            return N(tArr);
        }
        return m.b(tArr[0]);
    }

    public static final List<Long> M(long[] jArr) {
        k.e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static final <T> List<T> N(T[] tArr) {
        k.e(tArr, "<this>");
        return new ArrayList(n.c(tArr));
    }

    public static final Set<Long> O(long[] jArr) {
        k.e(jArr, "<this>");
        return (Set) J(jArr, new LinkedHashSet(g0.a(jArr.length)));
    }

    public static final Set<Long> P(long[] jArr) {
        k.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return j0.b();
        }
        if (length != 1) {
            return (Set) J(jArr, new LinkedHashSet(g0.a(jArr.length)));
        }
        return i0.a(Long.valueOf(jArr[0]));
    }

    public static final <T> Set<T> Q(T[] tArr) {
        k.e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return j0.b();
        }
        if (length != 1) {
            return (Set) K(tArr, new LinkedHashSet(g0.a(tArr.length)));
        }
        return i0.a(tArr[0]);
    }

    public static final <T> Iterable<a0<T>> R(T[] tArr) {
        k.e(tArr, "<this>");
        return new b0(new a(tArr));
    }

    public static final boolean m(char[] cArr, char c10) {
        k.e(cArr, "<this>");
        return u(cArr, c10) >= 0;
    }

    public static final boolean n(long[] jArr, long j10) {
        k.e(jArr, "<this>");
        return w(jArr, j10) >= 0;
    }

    public static final <T> boolean o(T[] tArr, T t10) {
        k.e(tArr, "<this>");
        return x(tArr, t10) >= 0;
    }

    public static final <T> List<T> p(T[] tArr) {
        k.e(tArr, "<this>");
        return (List) q(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C q(T[] tArr, C c10) {
        k.e(tArr, "<this>");
        k.e(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static final <T> g r(T[] tArr) {
        k.e(tArr, "<this>");
        return new g(0, s(tArr));
    }

    public static final <T> int s(T[] tArr) {
        k.e(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final <T> T t(T[] tArr, int i10) {
        k.e(tArr, "<this>");
        if (i10 < 0 || i10 > s(tArr)) {
            return null;
        }
        return tArr[i10];
    }

    public static final int u(char[] cArr, char c10) {
        k.e(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int v(int[] iArr, int i10) {
        k.e(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int w(long[] jArr, long j10) {
        k.e(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <T> int x(T[] tArr, T t10) {
        k.e(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (k.b(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Set<Long> y(long[] jArr, Iterable<Long> iterable) {
        k.e(jArr, "<this>");
        k.e(iterable, "other");
        Set<Long> O = O(jArr);
        s.w(O, iterable);
        return O;
    }

    public static final <A extends Appendable> A z(int[] iArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l<? super Integer, ? extends CharSequence> lVar) {
        k.e(iArr, "<this>");
        k.e(a10, "buffer");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                a10.append(lVar.a(Integer.valueOf(i12)));
            } else {
                a10.append(String.valueOf(i12));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }
}
