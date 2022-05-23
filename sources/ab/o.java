package ab;

import ia.h;
import ja.i;
import ja.m;
import ja.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import qa.p;
import ra.k;
import ra.l;
import xa.e;
import xa.g;
import za.d;

public class o extends n {

    public static final class a extends l implements p<CharSequence, Integer, h<? extends Integer, ? extends Integer>> {
        public final char[] f712b;
        public final boolean f713c;

        public a(char[] cArr, boolean z10) {
            super(2);
            this.f712b = cArr;
            this.f713c = z10;
        }

        @Override
        public h<? extends Integer, ? extends Integer> e(CharSequence charSequence, Integer num) {
            return f(charSequence, num.intValue());
        }

        public final h<Integer, Integer> f(CharSequence charSequence, int i10) {
            k.e(charSequence, "$this$$receiver");
            int O = o.O(charSequence, this.f712b, i10, this.f713c);
            if (O < 0) {
                return null;
            }
            return ia.l.a(Integer.valueOf(O), 1);
        }
    }

    public static final class b extends l implements p<CharSequence, Integer, h<? extends Integer, ? extends Integer>> {
        public final List<String> f714b;
        public final boolean f715c;

        public b(List<String> list, boolean z10) {
            super(2);
            this.f714b = list;
            this.f715c = z10;
        }

        @Override
        public h<? extends Integer, ? extends Integer> e(CharSequence charSequence, Integer num) {
            return f(charSequence, num.intValue());
        }

        public final h<Integer, Integer> f(CharSequence charSequence, int i10) {
            k.e(charSequence, "$this$$receiver");
            h F = o.F(charSequence, this.f714b, i10, this.f715c, false);
            if (F != null) {
                return ia.l.a(F.c(), Integer.valueOf(((String) F.d()).length()));
            }
            return null;
        }
    }

    public static final class c extends l implements qa.l<g, String> {
        public final CharSequence f716b;

        public c(CharSequence charSequence) {
            super(1);
            this.f716b = charSequence;
        }

        public final String a(g gVar) {
            k.e(gVar, "it");
            return o.n0(this.f716b, gVar);
        }
    }

    public static final boolean A(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        k.e(charSequence, "<this>");
        k.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (N(charSequence, (String) charSequence2, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (L(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean B(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return z(charSequence, c10, z10);
    }

    public static boolean C(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return A(charSequence, charSequence2, z10);
    }

    public static final boolean D(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        k.e(charSequence, "<this>");
        k.e(charSequence2, "suffix");
        if (z10 || !(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return a0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
        }
        return n.k((String) charSequence, (String) charSequence2, false, 2, null);
    }

    public static boolean E(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return D(charSequence, charSequence2, z10);
    }

    public static final h<Integer, String> F(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        Object obj;
        Object obj2;
        if (z10 || collection.size() != 1) {
            e gVar = !z11 ? new g(xa.l.d(i10, 0), charSequence.length()) : xa.l.h(xa.l.e(i10, H(charSequence)), 0);
            if (charSequence instanceof String) {
                int r10 = gVar.r();
                int s10 = gVar.s();
                int t10 = gVar.t();
                if ((t10 > 0 && r10 <= s10) || (t10 < 0 && s10 <= r10)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (n.n(str, 0, (String) charSequence, r10, str.length(), z10)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (r10 == s10) {
                                break;
                            }
                            r10 += t10;
                        } else {
                            return ia.l.a(Integer.valueOf(r10), str2);
                        }
                    }
                }
            } else {
                int r11 = gVar.r();
                int s11 = gVar.s();
                int t11 = gVar.t();
                if ((t11 > 0 && r11 <= s11) || (t11 < 0 && s11 <= r11)) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (a0(str3, 0, charSequence, r11, str3.length(), z10)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (r11 == s11) {
                                break;
                            }
                            r11 += t11;
                        } else {
                            return ia.l.a(Integer.valueOf(r11), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) v.M(collection);
        int N = !z11 ? N(charSequence, str5, i10, false, 4, null) : S(charSequence, str5, i10, false, 4, null);
        if (N < 0) {
            return null;
        }
        return ia.l.a(Integer.valueOf(N), str5);
    }

    public static final g G(CharSequence charSequence) {
        k.e(charSequence, "<this>");
        return new g(0, charSequence.length() - 1);
    }

    public static final int H(CharSequence charSequence) {
        k.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int I(CharSequence charSequence, char c10, int i10, boolean z10) {
        k.e(charSequence, "<this>");
        if (z10 || !(charSequence instanceof String)) {
            return O(charSequence, new char[]{c10}, i10, z10);
        }
        return ((String) charSequence).indexOf(c10, i10);
    }

    public static final int J(CharSequence charSequence, String str, int i10, boolean z10) {
        k.e(charSequence, "<this>");
        k.e(str, "string");
        if (z10 || !(charSequence instanceof String)) {
            return L(charSequence, str, i10, charSequence.length(), z10, false, 16, null);
        }
        return ((String) charSequence).indexOf(str, i10);
    }

    public static final int K(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        e gVar = !z11 ? new g(xa.l.d(i10, 0), xa.l.e(i11, charSequence.length())) : xa.l.h(xa.l.e(i10, H(charSequence)), xa.l.d(i11, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int r10 = gVar.r();
            int s10 = gVar.s();
            int t10 = gVar.t();
            if ((t10 <= 0 || r10 > s10) && (t10 >= 0 || s10 > r10)) {
                return -1;
            }
            while (!a0(charSequence2, 0, charSequence, r10, charSequence2.length(), z10)) {
                if (r10 == s10) {
                    return -1;
                }
                r10 += t10;
            }
            return r10;
        }
        int r11 = gVar.r();
        int s11 = gVar.s();
        int t11 = gVar.t();
        if ((t11 <= 0 || r11 > s11) && (t11 >= 0 || s11 > r11)) {
            return -1;
        }
        while (!n.n((String) charSequence2, 0, (String) charSequence, r11, charSequence2.length(), z10)) {
            if (r11 == s11) {
                return -1;
            }
            r11 += t11;
        }
        return r11;
    }

    public static int L(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        return K(charSequence, charSequence2, i10, i11, z10, (i12 & 16) != 0 ? false : z11);
    }

    public static int M(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return I(charSequence, c10, i10, z10);
    }

    public static int N(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return J(charSequence, str, i10, z10);
    }

    public static final int O(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        boolean z11;
        k.e(charSequence, "<this>");
        k.e(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            int d10 = xa.l.d(i10, 0);
            int H = H(charSequence);
            if (d10 > H) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(d10);
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z11 = false;
                        break;
                    } else if (ab.b.f(cArr[i11], charAt, z10)) {
                        z11 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    return d10;
                }
                if (d10 == H) {
                    return -1;
                }
                d10++;
            }
        } else {
            return ((String) charSequence).indexOf(i.F(cArr), i10);
        }
    }

    public static final int P(CharSequence charSequence, char c10, int i10, boolean z10) {
        k.e(charSequence, "<this>");
        if (z10 || !(charSequence instanceof String)) {
            return T(charSequence, new char[]{c10}, i10, z10);
        }
        return ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int Q(CharSequence charSequence, String str, int i10, boolean z10) {
        k.e(charSequence, "<this>");
        k.e(str, "string");
        if (z10 || !(charSequence instanceof String)) {
            return K(charSequence, str, i10, 0, z10, true);
        }
        return ((String) charSequence).lastIndexOf(str, i10);
    }

    public static int R(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = H(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return P(charSequence, c10, i10, z10);
    }

    public static int S(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = H(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Q(charSequence, str, i10, z10);
    }

    public static final int T(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        k.e(charSequence, "<this>");
        k.e(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int e10 = xa.l.e(i10, H(charSequence)); -1 < e10; e10--) {
                char charAt = charSequence.charAt(e10);
                int length = cArr.length;
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (ab.b.f(cArr[i11], charAt, z10)) {
                        z11 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    return e10;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(i.F(cArr), i10);
    }

    public static final d<String> U(CharSequence charSequence) {
        k.e(charSequence, "<this>");
        return k0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> V(CharSequence charSequence) {
        k.e(charSequence, "<this>");
        return za.i.l(U(charSequence));
    }

    public static final d<g> W(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        d0(i11);
        return new d(charSequence, i10, i11, new a(cArr, z10));
    }

    public static final d<g> X(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        d0(i11);
        return new d(charSequence, i10, i11, new b(ja.h.c(strArr), z10));
    }

    public static d Y(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return W(charSequence, cArr, i10, z10, i11);
    }

    public static d Z(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return X(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean a0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        k.e(charSequence, "<this>");
        k.e(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!ab.b.f(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final String b0(String str, CharSequence charSequence) {
        k.e(str, "<this>");
        k.e(charSequence, "prefix");
        if (!m0(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        k.d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String c0(String str, CharSequence charSequence) {
        k.e(str, "<this>");
        k.e(charSequence, "suffix");
        if (!E(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void d0(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
        }
    }

    public static final List<String> e0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        k.e(charSequence, "<this>");
        k.e(cArr, "delimiters");
        if (cArr.length == 1) {
            return g0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable<g> a10 = za.i.a(Y(charSequence, cArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(ja.o.o(a10, 10));
        for (g gVar : a10) {
            arrayList.add(n0(charSequence, gVar));
        }
        return arrayList;
    }

    public static final List<String> f0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        k.e(charSequence, "<this>");
        k.e(strArr, "delimiters");
        boolean z11 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                return g0(charSequence, str, z10, i10);
            }
        }
        Iterable<g> a10 = za.i.a(Z(charSequence, strArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(ja.o.o(a10, 10));
        for (g gVar : a10) {
            arrayList.add(n0(charSequence, gVar));
        }
        return arrayList;
    }

    public static final List<String> g0(CharSequence charSequence, String str, boolean z10, int i10) {
        d0(i10);
        int i11 = 0;
        int J = J(charSequence, str, 0, z10);
        if (J == -1 || i10 == 1) {
            return m.b(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i12 = 10;
        if (z11) {
            i12 = xa.l.e(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, J).toString());
            i11 = str.length() + J;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            J = J(charSequence, str, i11, z10);
        } while (J != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static List h0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e0(charSequence, cArr, z10, i10);
    }

    public static List i0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return f0(charSequence, strArr, z10, i10);
    }

    public static final d<String> j0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        k.e(charSequence, "<this>");
        k.e(strArr, "delimiters");
        return za.i.i(Z(charSequence, strArr, 0, z10, i10, 2, null), new c(charSequence));
    }

    public static d k0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return j0(charSequence, strArr, z10, i10);
    }

    public static final boolean l0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        k.e(charSequence, "<this>");
        k.e(charSequence2, "prefix");
        if (z10 || !(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return a0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
        }
        return n.x((String) charSequence, (String) charSequence2, false, 2, null);
    }

    public static boolean m0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return l0(charSequence, charSequence2, z10);
    }

    public static final String n0(CharSequence charSequence, g gVar) {
        k.e(charSequence, "<this>");
        k.e(gVar, "range");
        return charSequence.subSequence(gVar.x().intValue(), gVar.w().intValue() + 1).toString();
    }

    public static final String o0(String str, char c10, String str2) {
        k.e(str, "<this>");
        k.e(str2, "missingDelimiterValue");
        int M = M(str, c10, 0, false, 6, null);
        if (M == -1) {
            return str2;
        }
        String substring = str.substring(M + 1, str.length());
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String p0(String str, String str2, String str3) {
        k.e(str, "<this>");
        k.e(str2, "delimiter");
        k.e(str3, "missingDelimiterValue");
        int N = N(str, str2, 0, false, 6, null);
        if (N == -1) {
            return str3;
        }
        String substring = str.substring(N + str2.length(), str.length());
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String q0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return o0(str, c10, str2);
    }

    public static String r0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return p0(str, str2, str3);
    }

    public static final String s0(String str, char c10, String str2) {
        k.e(str, "<this>");
        k.e(str2, "missingDelimiterValue");
        int R = R(str, c10, 0, false, 6, null);
        if (R == -1) {
            return str2;
        }
        String substring = str.substring(R + 1, str.length());
        k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String t0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return s0(str, c10, str2);
    }

    public static final CharSequence u0(CharSequence charSequence) {
        k.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = ab.a.c(charSequence.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!c10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!c10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final boolean z(CharSequence charSequence, char c10, boolean z10) {
        k.e(charSequence, "<this>");
        return M(charSequence, c10, 0, z10, 2, null) >= 0;
    }
}
