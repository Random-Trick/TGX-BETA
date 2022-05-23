package ib;

import ab.b;
import ab.m;
import ab.n;
import ab.q;
import android.net.Uri;
import android.text.Spanned;
import ja.d0;
import ja.o;
import ja.v;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ra.k;
import ra.l;
import va.c;
import xa.g;

public final class i {
    public static final Charset f14176a;

    public static final class a extends l implements qa.l<String, CharSequence> {
        public static final a f14177b = new a();

        public a() {
            super(1);
        }

        public final CharSequence a(String str) {
            k.e(str, "item");
            String F = i.F(str, null, 2, null);
            k.c(F);
            return F;
        }
    }

    static {
        Charset charset = StandardCharsets.UTF_8;
        k.d(charset, "UTF_8");
        f14176a = charset;
    }

    public static final String A(String str, int i10) {
        k.e(str, "source");
        g gVar = new g(1, i10);
        ArrayList arrayList = new ArrayList(o.o(gVar, 10));
        Iterator<Integer> it = gVar.iterator();
        while (it.hasNext()) {
            ((d0) it).d();
            arrayList.add(Character.valueOf(q.v0(str, c.f24807a)));
        }
        return v.H(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public static final String B(String str) {
        String sb2;
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb3 = null;
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            char c10 = codePointAt == 92 ? (char) 10741 : codePointAt == 47 ? (char) 8260 : (char) 0;
            if (c10 != 0) {
                if (sb3 == null) {
                    sb3 = new StringBuilder(length);
                    if (i10 > 0) {
                        sb3.append((CharSequence) str, 0, i10);
                    }
                }
                sb3.append(c10);
            } else if (sb3 != null) {
                sb3.appendCodePoint(codePointAt);
            }
            i10 += Character.charCount(codePointAt);
        }
        return (sb3 == null || (sb2 = sb3.toString()) == null) ? str : sb2;
    }

    public static final String C(String str) {
        if (str != null) {
            return v.H(ab.o.i0(n.t(str, "'", "", false, 4, null), new String[]{" ", "-"}, false, 0, 6, null), "", null, null, 0, null, a.f14177b, 30, null);
        }
        return null;
    }

    public static final String D(String str) {
        if (str != null) {
            return ab.o.u0(str).toString();
        }
        return null;
    }

    public static final String E(String str, Locale locale) {
        String str2;
        if (str == null) {
            return null;
        }
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            str2 = String.valueOf(charAt);
        } else if (locale != null) {
            str2 = ab.a.d(charAt, locale);
        } else {
            str2 = b.g(charAt);
        }
        sb2.append((Object) str2);
        String substring = str.substring(1);
        k.d(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        return sb2.toString();
    }

    public static String F(String str, Locale locale, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            locale = null;
        }
        return E(str, locale);
    }

    public static final String G(String str) {
        k.e(str, "url");
        if (n.x(str, "https://", false, 2, null)) {
            String substring = str.substring(8);
            k.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        } else if (!n.x(str, "http://", false, 2, null)) {
            return str;
        } else {
            String substring2 = str.substring(7);
            k.d(substring2, "this as java.lang.String).substring(startIndex)");
            return substring2;
        }
    }

    public static final Uri H(String str) {
        Uri build;
        boolean z10 = false;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme == null || scheme.length() == 0) {
                z10 = true;
            }
            if (z10) {
                build = Uri.parse("https://" + str);
            } else {
                Locale locale = Locale.ROOT;
                String lowerCase = scheme.toLowerCase(locale);
                k.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (k.b(lowerCase, scheme)) {
                    return parse;
                }
                Uri.Builder buildUpon = parse.buildUpon();
                String lowerCase2 = scheme.toLowerCase(locale);
                k.d(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                build = buildUpon.scheme(lowerCase2).build();
            }
            return build;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static final String a(String str) {
        k.e(str, "component");
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final String b(String str) {
        int i10 = 0;
        if (str == null || n.m(str)) {
            return null;
        }
        if (n.x(str, "https://", false, 2, null)) {
            i10 = 8;
        } else if (n.x(str, "http://", false, 2, null)) {
            i10 = 7;
        }
        int M = ab.o.M(str, '/', i10, false, 4, null);
        if (i10 == 0 && M == -1) {
            return str;
        }
        if (M != -1) {
            String substring = str.substring(i10, M);
            k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        } else if (i10 <= 0) {
            return str;
        } else {
            String substring2 = str.substring(i10);
            k.d(substring2, "this as java.lang.String).substring(startIndex)");
            return substring2;
        }
    }

    public static final boolean c(CharSequence charSequence, CharSequence charSequence2) {
        boolean i10 = i(charSequence);
        if (i10 == i(charSequence2)) {
            if (!i10) {
                k.c(charSequence);
                k.c(charSequence2);
                if (e(charSequence, charSequence2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean d(CharSequence charSequence, CharSequence charSequence2, Locale locale) {
        String str;
        String obj;
        String obj2;
        String str2;
        String obj3;
        String obj4;
        String str3 = null;
        if (locale == null) {
            if (charSequence == null || (obj4 = charSequence.toString()) == null) {
                str2 = null;
            } else {
                str2 = obj4.toLowerCase(Locale.ROOT);
                k.d(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            if (!(charSequence2 == null || (obj3 = charSequence2.toString()) == null)) {
                str3 = obj3.toLowerCase(Locale.ROOT);
                k.d(str3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            return c(str2, str3);
        }
        if (charSequence == null || (obj2 = charSequence.toString()) == null) {
            str = null;
        } else {
            str = obj2.toLowerCase(locale);
            k.d(str, "this as java.lang.String).toLowerCase(locale)");
        }
        if (!(charSequence2 == null || (obj = charSequence2.toString()) == null)) {
            str3 = obj.toLowerCase(locale);
            k.d(str3, "this as java.lang.String).toLowerCase(locale)");
        }
        return c(str, str3);
    }

    public static final boolean e(CharSequence charSequence, CharSequence charSequence2) {
        k.e(charSequence, "<this>");
        k.e(charSequence2, "other");
        if (!((charSequence instanceof Spanned) || (charSequence2 instanceof Spanned))) {
            return k.b(charSequence, charSequence2);
        }
        try {
            return k.b(charSequence, charSequence2);
        } catch (Throwable unused) {
            if (!k.b(charSequence.toString(), charSequence2.toString())) {
                return false;
            }
            boolean z10 = charSequence instanceof Spanned;
            Object[] objArr = null;
            Object[] spans = z10 ? ((Spanned) charSequence).getSpans(0, charSequence.length(), Object.class) : null;
            boolean z11 = charSequence2 instanceof Spanned;
            if (z11) {
                objArr = ((Spanned) charSequence2).getSpans(0, charSequence2.length(), Object.class);
            }
            if ((spans != null ? spans.length : 0) != (objArr != null ? objArr.length : 0)) {
                return false;
            }
            if ((spans != null ? spans.length : 0) == 0) {
                return true;
            }
            if (z10 && spans != null) {
                if (z11 && objArr != null) {
                    int length = spans.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        Object obj = spans[i10];
                        Object obj2 = objArr[i10];
                        try {
                            if (!(k.b(obj, obj2) && ((Spanned) charSequence).getSpanStart(obj) == ((Spanned) charSequence2).getSpanStart(obj2) && ((Spanned) charSequence).getSpanEnd(obj) == ((Spanned) charSequence2).getSpanEnd(obj2))) {
                                return false;
                            }
                        } catch (Throwable unused2) {
                            return false;
                        }
                    }
                    return true;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static final boolean f(String str) {
        int i10;
        k.e(str, "str");
        int length = str.length();
        int i11 = 0;
        do {
            int M = ab.o.M(str, '%', i11, false, 4, null);
            if (M == -1 || (i10 = M + 1) >= length) {
                break;
            } else if (str.charAt(i10) != '%') {
                return true;
            } else {
                i11 = M + 2;
            }
        } while (i11 != -1);
        return false;
    }

    public static final int g(CharSequence charSequence, String str, int i10) {
        k.e(charSequence, "source");
        k.e(str, "target");
        return ab.o.N(charSequence, str, i10, false, 4, null);
    }

    public static final boolean h(String str) {
        return str != null && !ab.o.B(str, '/', false, 2, null);
    }

    public static final boolean i(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static final boolean j(CharSequence charSequence) {
        return charSequence == null || n.m(charSequence);
    }

    public static final boolean k(CharSequence charSequence) {
        if (charSequence == null || n.m(charSequence)) {
            return true;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!(ab.a.c(charSequence.charAt(i10)) || charSequence.charAt(i10) == 8203)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean l(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    public static final boolean m(String str) {
        if (str == null || n.m(str)) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!l(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final String n(String str, String str2, List<String> list) {
        k.e(str, "separator");
        k.e(str2, "separatorForLastItem");
        k.e(list, "list");
        int size = list.size();
        if (size == 0) {
            return "";
        }
        int i10 = 0;
        int d10 = xa.l.d(0, str.length() * (size - 2)) + str2.length();
        int i11 = 0;
        for (String str3 : list) {
            d10 += str3.length();
            i11++;
            if (i11 == size) {
                break;
            }
        }
        StringBuilder sb2 = new StringBuilder(d10);
        for (String str4 : list) {
            if (i10 > 0) {
                sb2.append(i10 == size + (-1) ? str2 : str);
            }
            sb2.append(str4);
            i10++;
            if (i10 == size) {
                break;
            }
        }
        String sb3 = sb2.toString();
        k.d(sb3, "b.toString()");
        return sb3;
    }

    public static final String o(String str, int[] iArr) {
        k.e(str, "separator");
        k.e(iArr, "tokens");
        return ja.i.D(iArr, str, null, null, 0, null, null, 62, null);
    }

    public static final int p(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length();
        }
        return 0;
    }

    public static final String q(int i10) {
        String valueOf = String.valueOf(i10);
        int length = 10 - valueOf.length();
        if (length <= 0) {
            return valueOf;
        }
        StringBuilder sb2 = new StringBuilder(10);
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        String sb3 = sb2.toString();
        k.d(sb3, "b.toString()");
        return sb3;
    }

    public static final String r(String str, int i10) {
        k.e(str, "<this>");
        if (i10 == 0) {
            return "";
        }
        int i11 = 0;
        if (str.length() == 0) {
            return "";
        }
        if (i10 == 1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i10);
        if (i10 >= 0) {
            while (true) {
                sb2.append(str);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String sb3 = sb2.toString();
        k.d(sb3, "b.toString()");
        return sb3;
    }

    public static final int s(String str) {
        return u(str, 0, 2, null);
    }

    public static final int t(String str, int i10) {
        Integer f10;
        return (str == null || (f10 = m.f(str)) == null) ? i10 : f10.intValue();
    }

    public static int u(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return t(str, i10);
    }

    public static final int[] v(String str, String str2) {
        k.e(str2, "delimiter");
        int i10 = 0;
        if (str == null || n.m(str)) {
            return null;
        }
        List<String> i02 = ab.o.i0(str, new String[]{str2}, false, 0, 6, null);
        int[] iArr = new int[i02.size()];
        for (String str3 : i02) {
            i10++;
            try {
                iArr[i10] = Integer.parseInt(str3);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return iArr;
    }

    public static final long w(String str) {
        return y(str, 0L, 2, null);
    }

    public static final long x(String str, long j10) {
        Long h10;
        return (str == null || (h10 = m.h(str)) == null) ? j10 : h10.longValue();
    }

    public static long y(String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return x(str, j10);
    }

    public static final long[] z(String str, String str2) {
        k.e(str2, "delimiter");
        int i10 = 0;
        if (str == null || n.m(str)) {
            return null;
        }
        List<String> i02 = ab.o.i0(str, new String[]{str2}, false, 0, 6, null);
        long[] jArr = new long[i02.size()];
        for (String str3 : i02) {
            i10++;
            try {
                jArr[i10] = Long.parseLong(str3);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return jArr;
    }
}
