package p123ia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p317wa.C10022g;
import pa.AbstractC8077a;
import pa.AbstractC8088l;
import qa.AbstractC8299l;
import qa.C8287b;
import qa.C8298k;

public class C5296i extends C5294h {

    public static final class C5297a extends AbstractC8299l implements AbstractC8077a<Iterator<? extends T>> {
        public final T[] f17486b;

        public C5297a(T[] tArr) {
            super(0);
            this.f17486b = tArr;
        }

        public final Iterator<T> mo4925b() {
            return C8287b.m12950a(this.f17486b);
        }
    }

    public static final <A extends Appendable> A m23412A(long[] jArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l<? super Long, ? extends CharSequence> lVar) {
        C8298k.m12934e(jArr, "<this>");
        C8298k.m12934e(a, "buffer");
        C8298k.m12934e(charSequence, "separator");
        C8298k.m12934e(charSequence2, "prefix");
        C8298k.m12934e(charSequence3, "postfix");
        C8298k.m12934e(charSequence4, "truncated");
        a.append(charSequence2);
        int length = jArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            long j = jArr[i2];
            i2++;
            i3++;
            if (i3 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i3 > i) {
                break;
            } else if (lVar != null) {
                a.append(lVar.mo568a(Long.valueOf(j)));
            } else {
                a.append(String.valueOf(j));
            }
        }
        if (i >= 0 && i3 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final String m23411B(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l<? super Integer, ? extends CharSequence> lVar) {
        C8298k.m12934e(iArr, "<this>");
        C8298k.m12934e(charSequence, "separator");
        C8298k.m12934e(charSequence2, "prefix");
        C8298k.m12934e(charSequence3, "postfix");
        C8298k.m12934e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m23381z(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C8298k.m12935d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final String m23410C(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l<? super Long, ? extends CharSequence> lVar) {
        C8298k.m12934e(jArr, "<this>");
        C8298k.m12934e(charSequence, "separator");
        C8298k.m12934e(charSequence2, "prefix");
        C8298k.m12934e(charSequence3, "postfix");
        C8298k.m12934e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m23412A(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C8298k.m12935d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static String m23409D(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m23411B(iArr, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    public static String m23408E(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m23410C(jArr, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    public static final char m23407F(char[] cArr) {
        C8298k.m12934e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final <T> T m23406G(T[] tArr) {
        C8298k.m12934e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final float m23405H(float[] fArr) {
        C8298k.m12934e(fArr, "<this>");
        int length = fArr.length;
        float f = 0.0f;
        int i = 0;
        while (i < length) {
            float f2 = fArr[i];
            i++;
            f += f2;
        }
        return f;
    }

    public static final int m23404I(int[] iArr) {
        C8298k.m12934e(iArr, "<this>");
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            i++;
            i2 += i3;
        }
        return i2;
    }

    public static final <C extends Collection<? super Long>> C m23403J(long[] jArr, C c) {
        C8298k.m12934e(jArr, "<this>");
        C8298k.m12934e(c, "destination");
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            long j = jArr[i];
            i++;
            c.add(Long.valueOf(j));
        }
        return c;
    }

    public static final <T, C extends Collection<? super T>> C m23402K(T[] tArr, C c) {
        C8298k.m12934e(tArr, "<this>");
        C8298k.m12934e(c, "destination");
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t = tArr[i];
            i++;
            c.add(t);
        }
        return c;
    }

    public static final <T> List<T> m23401L(T[] tArr) {
        C8298k.m12934e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return C5304n.m23366f();
        }
        if (length != 1) {
            return m23399N(tArr);
        }
        return C5303m.m23370b(tArr[0]);
    }

    public static final List<Long> m23400M(long[] jArr) {
        C8298k.m12934e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            long j = jArr[i];
            i++;
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static final <T> List<T> m23399N(T[] tArr) {
        C8298k.m12934e(tArr, "<this>");
        return new ArrayList(C5304n.m23369c(tArr));
    }

    public static final Set<Long> m23398O(long[] jArr) {
        C8298k.m12934e(jArr, "<this>");
        return (Set) m23403J(jArr, new LinkedHashSet(C5293g0.m23436a(jArr.length)));
    }

    public static final Set<Long> m23397P(long[] jArr) {
        C8298k.m12934e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return C5300j0.m23377b();
        }
        if (length != 1) {
            return (Set) m23403J(jArr, new LinkedHashSet(C5293g0.m23436a(jArr.length)));
        }
        return C5298i0.m23379a(Long.valueOf(jArr[0]));
    }

    public static final <T> Set<T> m23396Q(T[] tArr) {
        C8298k.m12934e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return C5300j0.m23377b();
        }
        if (length != 1) {
            return (Set) m23402K(tArr, new LinkedHashSet(C5293g0.m23436a(tArr.length)));
        }
        return C5298i0.m23379a(tArr[0]);
    }

    public static final <T> Iterable<C5276a0<T>> m23395R(T[] tArr) {
        C8298k.m12934e(tArr, "<this>");
        return new C5282b0(new C5297a(tArr));
    }

    public static final boolean m23394m(char[] cArr, char c) {
        C8298k.m12934e(cArr, "<this>");
        return m23386u(cArr, c) >= 0;
    }

    public static final boolean m23393n(long[] jArr, long j) {
        C8298k.m12934e(jArr, "<this>");
        return m23384w(jArr, j) >= 0;
    }

    public static final <T> boolean m23392o(T[] tArr, T t) {
        C8298k.m12934e(tArr, "<this>");
        return m23383x(tArr, t) >= 0;
    }

    public static final <T> List<T> m23391p(T[] tArr) {
        C8298k.m12934e(tArr, "<this>");
        return (List) m23390q(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C m23390q(T[] tArr, C c) {
        C8298k.m12934e(tArr, "<this>");
        C8298k.m12934e(c, "destination");
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t = tArr[i];
            i++;
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static final <T> C10022g m23389r(T[] tArr) {
        C8298k.m12934e(tArr, "<this>");
        return new C10022g(0, m23388s(tArr));
    }

    public static final <T> int m23388s(T[] tArr) {
        C8298k.m12934e(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final <T> T m23387t(T[] tArr, int i) {
        C8298k.m12934e(tArr, "<this>");
        if (i < 0 || i > m23388s(tArr)) {
            return null;
        }
        return tArr[i];
    }

    public static final int m23386u(char[] cArr, char c) {
        C8298k.m12934e(cArr, "<this>");
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            i++;
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int m23385v(int[] iArr, int i) {
        C8298k.m12934e(iArr, "<this>");
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            i2++;
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final int m23384w(long[] jArr, long j) {
        C8298k.m12934e(jArr, "<this>");
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            i++;
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final <T> int m23383x(T[] tArr, T t) {
        C8298k.m12934e(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                i++;
                if (tArr[i] == null) {
                    return i;
                }
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            i++;
            if (C8298k.m12937b(t, tArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static final Set<Long> m23382y(long[] jArr, Iterable<Long> iterable) {
        C8298k.m12934e(jArr, "<this>");
        C8298k.m12934e(iterable, "other");
        Set<Long> O = m23398O(jArr);
        C5309s.m23349w(O, iterable);
        return O;
    }

    public static final <A extends Appendable> A m23381z(int[] iArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l<? super Integer, ? extends CharSequence> lVar) {
        C8298k.m12934e(iArr, "<this>");
        C8298k.m12934e(a, "buffer");
        C8298k.m12934e(charSequence, "separator");
        C8298k.m12934e(charSequence2, "prefix");
        C8298k.m12934e(charSequence3, "postfix");
        C8298k.m12934e(charSequence4, "truncated");
        a.append(charSequence2);
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            i2++;
            i3++;
            if (i3 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i3 > i) {
                break;
            } else if (lVar != null) {
                a.append(lVar.mo568a(Integer.valueOf(i4)));
            } else {
                a.append(String.valueOf(i4));
            }
        }
        if (i >= 0 && i3 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }
}
