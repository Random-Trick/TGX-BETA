package za;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p107ha.C5048h;
import p107ha.C5054l;
import p123ia.C5294h;
import p123ia.C5296i;
import p123ia.C5303m;
import p123ia.C5305o;
import p123ia.C5312v;
import p317wa.C10019e;
import p317wa.C10022g;
import p317wa.C10030l;
import p347ya.AbstractC10466d;
import p347ya.C10471i;
import pa.AbstractC8088l;
import pa.AbstractC8092p;
import qa.AbstractC8299l;
import qa.C8298k;

public class C11452o extends C11451n {

    public static final class C11453a extends AbstractC8299l implements AbstractC8092p<CharSequence, Integer, C5048h<? extends Integer, ? extends Integer>> {
        public final char[] f36416b;
        public final boolean f36417c;

        public C11453a(char[] cArr, boolean z) {
            super(2);
            this.f36416b = cArr;
            this.f36417c = z;
        }

        @Override
        public C5048h<? extends Integer, ? extends Integer> mo570e(CharSequence charSequence, Integer num) {
            return m571f(charSequence, num.intValue());
        }

        public final C5048h<Integer, Integer> m571f(CharSequence charSequence, int i) {
            C8298k.m12934e(charSequence, "$this$$receiver");
            int O = C11452o.m606O(charSequence, this.f36416b, i, this.f36417c);
            if (O < 0) {
                return null;
            }
            return C5054l.m24188a(Integer.valueOf(O), 1);
        }
    }

    public static final class C11454b extends AbstractC8299l implements AbstractC8092p<CharSequence, Integer, C5048h<? extends Integer, ? extends Integer>> {
        public final List<String> f36418b;
        public final boolean f36419c;

        public C11454b(List<String> list, boolean z) {
            super(2);
            this.f36418b = list;
            this.f36419c = z;
        }

        @Override
        public C5048h<? extends Integer, ? extends Integer> mo570e(CharSequence charSequence, Integer num) {
            return m569f(charSequence, num.intValue());
        }

        public final C5048h<Integer, Integer> m569f(CharSequence charSequence, int i) {
            C8298k.m12934e(charSequence, "$this$$receiver");
            C5048h F = C11452o.m615F(charSequence, this.f36418b, i, this.f36419c, false);
            if (F == null) {
                return null;
            }
            return C5054l.m24188a(F.m24194c(), Integer.valueOf(((String) F.m24193d()).length()));
        }
    }

    public static final class C11455c extends AbstractC8299l implements AbstractC8088l<C10022g, String> {
        public final CharSequence f36420b;

        public C11455c(CharSequence charSequence) {
            super(1);
            this.f36420b = charSequence;
        }

        public final String mo568a(C10022g gVar) {
            C8298k.m12934e(gVar, "it");
            return C11452o.m581n0(this.f36420b, gVar);
        }
    }

    public static final boolean m620A(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m607N(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (m609L(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean m619B(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m572z(charSequence, c, z);
    }

    public static boolean m618C(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m620A(charSequence, charSequence2, z);
    }

    public static final boolean m617D(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(charSequence2, "suffix");
        if (z || !(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return m594a0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
        }
        return C11451n.m634k((String) charSequence, (String) charSequence2, false, 2, null);
    }

    public static boolean m616E(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m617D(charSequence, charSequence2, z);
    }

    public static final C5048h<Integer, String> m615F(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        if (z || collection.size() != 1) {
            C10019e gVar = !z2 ? new C10022g(C10030l.m6193d(i, 0), charSequence.length()) : C10030l.m6189h(C10030l.m6192e(i, m613H(charSequence)), 0);
            if (charSequence instanceof String) {
                int r = gVar.m6211r();
                int s = gVar.m6210s();
                int t = gVar.m6209t();
                if ((t > 0 && r <= s) || (t < 0 && s <= r)) {
                    while (true) {
                        r += t;
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (C11451n.m631n(str, 0, (String) charSequence, r, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 != null) {
                            return C5054l.m24188a(Integer.valueOf(r), str2);
                        }
                        if (r == s) {
                            break;
                        }
                    }
                }
            } else {
                int r2 = gVar.m6211r();
                int s2 = gVar.m6210s();
                int t2 = gVar.m6209t();
                if ((t2 > 0 && r2 <= s2) || (t2 < 0 && s2 <= r2)) {
                    while (true) {
                        r2 += t2;
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (m594a0(str3, 0, charSequence, r2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 != null) {
                            return C5054l.m24188a(Integer.valueOf(r2), str4);
                        }
                        if (r2 == s2) {
                            break;
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C5312v.m23335M(collection);
        int N = !z2 ? m607N(charSequence, str5, i, false, 4, null) : m602S(charSequence, str5, i, false, 4, null);
        if (N < 0) {
            return null;
        }
        return C5054l.m24188a(Integer.valueOf(N), str5);
    }

    public static final C10022g m614G(CharSequence charSequence) {
        C8298k.m12934e(charSequence, "<this>");
        return new C10022g(0, charSequence.length() - 1);
    }

    public static final int m613H(CharSequence charSequence) {
        C8298k.m12934e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int m612I(CharSequence charSequence, char c, int i, boolean z) {
        C8298k.m12934e(charSequence, "<this>");
        if (z || !(charSequence instanceof String)) {
            return m606O(charSequence, new char[]{c}, i, z);
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static final int m611J(CharSequence charSequence, String str, int i, boolean z) {
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m609L(charSequence, str, i, charSequence.length(), z, false, 16, null);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    public static final int m610K(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C10019e gVar = !z2 ? new C10022g(C10030l.m6193d(i, 0), C10030l.m6192e(i2, charSequence.length())) : C10030l.m6189h(C10030l.m6192e(i, m613H(charSequence)), C10030l.m6193d(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int r = gVar.m6211r();
            int s = gVar.m6210s();
            int t = gVar.m6209t();
            if ((t <= 0 || r > s) && (t >= 0 || s > r)) {
                return -1;
            }
            while (true) {
                r += t;
                if (m594a0(charSequence2, 0, charSequence, r, charSequence2.length(), z)) {
                    return r;
                }
                if (r == s) {
                    return -1;
                }
            }
        } else {
            int r2 = gVar.m6211r();
            int s2 = gVar.m6210s();
            int t2 = gVar.m6209t();
            if ((t2 <= 0 || r2 > s2) && (t2 >= 0 || s2 > r2)) {
                return -1;
            }
            while (true) {
                r2 += t2;
                if (C11451n.m631n((String) charSequence2, 0, (String) charSequence, r2, charSequence2.length(), z)) {
                    return r2;
                }
                if (r2 == s2) {
                    return -1;
                }
            }
        }
    }

    public static int m609L(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m610K(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    public static int m608M(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m612I(charSequence, c, i, z);
    }

    public static int m607N(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m611J(charSequence, str, i, z);
    }

    public static final int m606O(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int d = C10030l.m6193d(i, 0);
            int H = m613H(charSequence);
            if (d > H) {
                return -1;
            }
            while (true) {
                d++;
                char charAt = charSequence.charAt(d);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    }
                    char c = cArr[i2];
                    i2++;
                    if (C11435b.m656f(c, charAt, z)) {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return d;
                }
                if (d == H) {
                    return -1;
                }
            }
        } else {
            return ((String) charSequence).indexOf(C5296i.m23407F(cArr), i);
        }
    }

    public static final int m605P(CharSequence charSequence, char c, int i, boolean z) {
        C8298k.m12934e(charSequence, "<this>");
        if (z || !(charSequence instanceof String)) {
            return m601T(charSequence, new char[]{c}, i, z);
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static final int m604Q(CharSequence charSequence, String str, int i, boolean z) {
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m610K(charSequence, str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    public static int m603R(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m613H(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m605P(charSequence, c, i, z);
    }

    public static int m602S(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m613H(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m604Q(charSequence, str, i, z);
    }

    public static final int m601T(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int e = C10030l.m6192e(i, m613H(charSequence));
            if (e < 0) {
                return -1;
            }
            while (true) {
                int i2 = e - 1;
                char charAt = charSequence.charAt(e);
                int length = cArr.length;
                boolean z2 = false;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    char c = cArr[i3];
                    i3++;
                    if (C11435b.m656f(c, charAt, z)) {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return e;
                }
                if (i2 < 0) {
                    return -1;
                }
                e = i2;
            }
        } else {
            return ((String) charSequence).lastIndexOf(C5296i.m23407F(cArr), i);
        }
    }

    public static final AbstractC10466d<String> m600U(CharSequence charSequence) {
        C8298k.m12934e(charSequence, "<this>");
        return m584k0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> m599V(CharSequence charSequence) {
        C8298k.m12934e(charSequence, "<this>");
        return C10471i.m5058l(m600U(charSequence));
    }

    public static final AbstractC10466d<C10022g> m598W(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m591d0(i2);
        return new C11437d(charSequence, i, i2, new C11453a(cArr, z));
    }

    public static final AbstractC10466d<C10022g> m597X(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m591d0(i2);
        return new C11437d(charSequence, i, i2, new C11454b(C5294h.m23433c(strArr), z));
    }

    public static AbstractC10466d m596Y(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m598W(charSequence, cArr, i, z, i2);
    }

    public static AbstractC10466d m595Z(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m597X(charSequence, strArr, i, z, i2);
    }

    public static final boolean m594a0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        int i4 = 0;
        while (i4 < i3) {
            i4++;
            if (!C11435b.m656f(charSequence.charAt(i + i4), charSequence2.charAt(i4 + i2), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String m593b0(String str, CharSequence charSequence) {
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(charSequence, "prefix");
        if (!m582m0(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C8298k.m12935d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String m592c0(String str, CharSequence charSequence) {
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(charSequence, "suffix");
        if (!m616E(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C8298k.m12935d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void m591d0(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C8298k.m12929j("Limit must be non-negative, but was ", Integer.valueOf(i)).toString());
        }
    }

    public static final List<String> m590e0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(cArr, "delimiters");
        if (cArr.length == 1) {
            return m588g0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C10022g> a = C10471i.m5069a(m596Y(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(C5305o.m23357o(a, 10));
        for (C10022g gVar : a) {
            arrayList.add(m581n0(charSequence, gVar));
        }
        return arrayList;
    }

    public static final List<String> m589f0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m588g0(charSequence, str, z, i);
            }
        }
        Iterable<C10022g> a = C10471i.m5069a(m595Z(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(C5305o.m23357o(a, 10));
        for (C10022g gVar : a) {
            arrayList.add(m581n0(charSequence, gVar));
        }
        return arrayList;
    }

    public static final List<String> m588g0(CharSequence charSequence, String str, boolean z, int i) {
        m591d0(i);
        int i2 = 0;
        int J = m611J(charSequence, str, 0, z);
        if (J == -1 || i == 1) {
            return C5303m.m23370b(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2) {
            i3 = C10030l.m6192e(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, J).toString());
            i2 = str.length() + J;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            J = m611J(charSequence, str, i2, z);
        } while (J != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static List m587h0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m590e0(charSequence, cArr, z, i);
    }

    public static List m586i0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m589f0(charSequence, strArr, z, i);
    }

    public static final AbstractC10466d<String> m585j0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(strArr, "delimiters");
        return C10471i.m5061i(m595Z(charSequence, strArr, 0, z, i, 2, null), new C11455c(charSequence));
    }

    public static AbstractC10466d m584k0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m585j0(charSequence, strArr, z, i);
    }

    public static final boolean m583l0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(charSequence2, "prefix");
        if (z || !(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return m594a0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
        }
        return C11451n.m621x((String) charSequence, (String) charSequence2, false, 2, null);
    }

    public static boolean m582m0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m583l0(charSequence, charSequence2, z);
    }

    public static final String m581n0(CharSequence charSequence, C10022g gVar) {
        C8298k.m12934e(charSequence, "<this>");
        C8298k.m12934e(gVar, "range");
        return charSequence.subSequence(gVar.m6203x().intValue(), gVar.m6204w().intValue() + 1).toString();
    }

    public static final String m580o0(String str, char c, String str2) {
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(str2, "missingDelimiterValue");
        int M = m608M(str, c, 0, false, 6, null);
        if (M == -1) {
            return str2;
        }
        String substring = str.substring(M + 1, str.length());
        C8298k.m12935d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String m579p0(String str, String str2, String str3) {
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(str2, "delimiter");
        C8298k.m12934e(str3, "missingDelimiterValue");
        int N = m607N(str, str2, 0, false, 6, null);
        if (N == -1) {
            return str3;
        }
        String substring = str.substring(N + str2.length(), str.length());
        C8298k.m12935d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String m578q0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m580o0(str, c, str2);
    }

    public static String m577r0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m579p0(str, str2, str3);
    }

    public static final String m576s0(String str, char c, String str2) {
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(str2, "missingDelimiterValue");
        int R = m603R(str, c, 0, false, 6, null);
        if (R == -1) {
            return str2;
        }
        String substring = str.substring(R + 1, str.length());
        C8298k.m12935d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String m575t0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m576s0(str, c, str2);
    }

    public static final CharSequence m574u0(CharSequence charSequence) {
        C8298k.m12934e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = C11434a.m659c(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final boolean m572z(CharSequence charSequence, char c, boolean z) {
        C8298k.m12934e(charSequence, "<this>");
        return m608M(charSequence, c, 0, z, 2, null) >= 0;
    }
}
