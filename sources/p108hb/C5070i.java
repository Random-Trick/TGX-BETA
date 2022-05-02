package p108hb;

import android.net.Uri;
import android.os.Build;
import android.text.Spanned;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p123ia.AbstractC5286d0;
import p123ia.C5296i;
import p123ia.C5305o;
import p123ia.C5312v;
import p317wa.C10022g;
import p317wa.C10030l;
import pa.AbstractC8088l;
import qa.AbstractC8299l;
import qa.C8298k;
import ua.AbstractC9486c;
import za.C11434a;
import za.C11435b;
import za.C11450m;
import za.C11451n;
import za.C11452o;
import za.C11457q;

public final class C5070i {
    public static final Charset f17083a;

    public static final class C5071a extends AbstractC8299l implements AbstractC8088l<String, CharSequence> {
        public static final C5071a f17084b = new C5071a();

        public C5071a() {
            super(1);
        }

        public final CharSequence mo568a(String str) {
            C8298k.m12933e(str, "item");
            String F = C5070i.m24073F(str, null, 2, null);
            C8298k.m12935c(F);
            return F;
        }
    }

    static {
        String str;
        Charset charset;
        if (Build.VERSION.SDK_INT >= 19) {
            charset = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else {
            charset = Charset.forName("UTF-8");
            str = "forName(\"UTF-8\")";
        }
        C8298k.m12934d(charset, str);
        f17083a = charset;
    }

    public static final String m24078A(String str, int i) {
        C8298k.m12933e(str, "source");
        C10022g gVar = new C10022g(1, i);
        ArrayList arrayList = new ArrayList(C5305o.m23358o(gVar, 10));
        Iterator<Integer> it = gVar.iterator();
        while (it.hasNext()) {
            ((AbstractC5286d0) it).mo6206e();
            arrayList.add(Character.valueOf(C11457q.m566v0(str, AbstractC9486c.f30720a)));
        }
        return C5312v.m23341H(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public static final String m24077B(String str) {
        String sb2;
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb3 = null;
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            char c = codePointAt == 92 ? (char) 10741 : codePointAt == 47 ? (char) 8260 : (char) 0;
            if (c != 0) {
                if (sb3 == null) {
                    sb3 = new StringBuilder(length);
                    if (i > 0) {
                        sb3.append((CharSequence) str, 0, i);
                    }
                }
                sb3.append(c);
            } else if (sb3 != null) {
                sb3.appendCodePoint(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
        return (sb3 == null || (sb2 = sb3.toString()) == null) ? str : sb2;
    }

    public static final String m24076C(String str) {
        if (str == null) {
            return null;
        }
        return C5312v.m23341H(C11452o.m586i0(C11451n.m625t(str, "'", "", false, 4, null), new String[]{" ", "-"}, false, 0, 6, null), "", null, null, 0, null, C5071a.f17084b, 30, null);
    }

    public static final String m24075D(String str) {
        if (str == null) {
            return null;
        }
        return C11452o.m574u0(str).toString();
    }

    public static final String m24074E(String str, Locale locale) {
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
            str2 = C11434a.m658d(charAt, locale);
        } else {
            str2 = C11435b.m655g(charAt);
        }
        sb2.append((Object) str2);
        String substring = str.substring(1);
        C8298k.m12934d(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        return sb2.toString();
    }

    public static String m24073F(String str, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = null;
        }
        return m24074E(str, locale);
    }

    public static final String m24072G(String str) {
        C8298k.m12933e(str, "url");
        if (C11451n.m621x(str, "https://", false, 2, null)) {
            String substring = str.substring(8);
            C8298k.m12934d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        } else if (!C11451n.m621x(str, "http://", false, 2, null)) {
            return str;
        } else {
            String substring2 = str.substring(7);
            C8298k.m12934d(substring2, "this as java.lang.String).substring(startIndex)");
            return substring2;
        }
    }

    public static final Uri m24071H(String str) {
        Uri build;
        boolean z = false;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme == null || scheme.length() == 0) {
                z = true;
            }
            if (z) {
                build = Uri.parse("https://" + str);
            } else {
                Locale locale = Locale.ROOT;
                String lowerCase = scheme.toLowerCase(locale);
                C8298k.m12934d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (C8298k.m12936b(lowerCase, scheme)) {
                    return parse;
                }
                Uri.Builder buildUpon = parse.buildUpon();
                String lowerCase2 = scheme.toLowerCase(locale);
                C8298k.m12934d(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                build = buildUpon.scheme(lowerCase2).build();
            }
            return build;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static final String m24070a(String str) {
        C8298k.m12933e(str, "component");
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final String m24069b(String str) {
        int i = 0;
        if (str == null || C11451n.m632m(str)) {
            return null;
        }
        if (C11451n.m621x(str, "https://", false, 2, null)) {
            i = 8;
        } else if (C11451n.m621x(str, "http://", false, 2, null)) {
            i = 7;
        }
        int M = C11452o.m608M(str, '/', i, false, 4, null);
        if (i == 0 && M == -1) {
            return str;
        }
        if (M != -1) {
            String substring = str.substring(i, M);
            C8298k.m12934d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        } else if (i <= 0) {
            return str;
        } else {
            String substring2 = str.substring(i);
            C8298k.m12934d(substring2, "this as java.lang.String).substring(startIndex)");
            return substring2;
        }
    }

    public static final boolean m24068c(CharSequence charSequence, CharSequence charSequence2) {
        boolean i = m24062i(charSequence);
        if (i == m24062i(charSequence2)) {
            if (!i) {
                C8298k.m12935c(charSequence);
                C8298k.m12935c(charSequence2);
                if (m24066e(charSequence, charSequence2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean m24067d(CharSequence charSequence, CharSequence charSequence2, Locale locale) {
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
                C8298k.m12934d(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            if (!(charSequence2 == null || (obj3 = charSequence2.toString()) == null)) {
                str3 = obj3.toLowerCase(Locale.ROOT);
                C8298k.m12934d(str3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            return m24068c(str2, str3);
        }
        if (charSequence == null || (obj2 = charSequence.toString()) == null) {
            str = null;
        } else {
            str = obj2.toLowerCase(locale);
            C8298k.m12934d(str, "this as java.lang.String).toLowerCase(locale)");
        }
        if (!(charSequence2 == null || (obj = charSequence2.toString()) == null)) {
            str3 = obj.toLowerCase(locale);
            C8298k.m12934d(str3, "this as java.lang.String).toLowerCase(locale)");
        }
        return m24068c(str, str3);
    }

    public static final boolean m24066e(CharSequence charSequence, CharSequence charSequence2) {
        C8298k.m12933e(charSequence, "<this>");
        C8298k.m12933e(charSequence2, "other");
        if (!(charSequence instanceof Spanned) && !(charSequence2 instanceof Spanned)) {
            return C8298k.m12936b(charSequence, charSequence2);
        }
        try {
            return C8298k.m12936b(charSequence, charSequence2);
        } catch (Throwable unused) {
            if (!C8298k.m12936b(charSequence.toString(), charSequence2.toString())) {
                return false;
            }
            boolean z = charSequence instanceof Spanned;
            Object[] objArr = null;
            Object[] spans = z ? ((Spanned) charSequence).getSpans(0, charSequence.length(), Object.class) : null;
            boolean z2 = charSequence2 instanceof Spanned;
            if (z2) {
                objArr = ((Spanned) charSequence2).getSpans(0, charSequence2.length(), Object.class);
            }
            if ((spans == null ? 0 : spans.length) != (objArr == null ? 0 : objArr.length)) {
                return false;
            }
            if ((spans == null ? 0 : spans.length) == 0) {
                return true;
            }
            if (z && spans != null) {
                if (z2 && objArr != null) {
                    int length = spans.length;
                    int i = 0;
                    while (i < length) {
                        i++;
                        Object obj = spans[i];
                        Object obj2 = objArr[i];
                        try {
                            if (!C8298k.m12936b(obj, obj2) || ((Spanned) charSequence).getSpanStart(obj) != ((Spanned) charSequence2).getSpanStart(obj2) || ((Spanned) charSequence).getSpanEnd(obj) != ((Spanned) charSequence2).getSpanEnd(obj2)) {
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

    public static final boolean m24065f(String str) {
        int i;
        C8298k.m12933e(str, "str");
        int length = str.length();
        int i2 = 0;
        do {
            int M = C11452o.m608M(str, '%', i2, false, 4, null);
            if (M == -1 || (i = M + 1) >= length) {
                break;
            } else if (str.charAt(i) != '%') {
                return true;
            } else {
                i2 = M + 2;
            }
        } while (i2 != -1);
        return false;
    }

    public static final int m24064g(CharSequence charSequence, String str, int i) {
        C8298k.m12933e(charSequence, "source");
        C8298k.m12933e(str, "target");
        return C11452o.m607N(charSequence, str, i, false, 4, null);
    }

    public static final boolean m24063h(String str) {
        return str != null && !C11452o.m619B(str, '/', false, 2, null);
    }

    public static final boolean m24062i(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static final boolean m24061j(CharSequence charSequence) {
        return charSequence == null || C11451n.m632m(charSequence);
    }

    public static final boolean m24060k(CharSequence charSequence) {
        if (charSequence == null || C11451n.m632m(charSequence)) {
            return true;
        }
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            i++;
            if (!C11434a.m659c(charSequence.charAt(i)) && charSequence.charAt(i) != 8203) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m24059l(char c) {
        return '0' <= c && c < ':';
    }

    public static final boolean m24058m(String str) {
        if (str == null || C11451n.m632m(str)) {
            return false;
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            i++;
            if (!m24059l(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final String m24057n(String str, String str2, List<String> list) {
        C8298k.m12933e(str, "separator");
        C8298k.m12933e(str2, "separatorForLastItem");
        C8298k.m12933e(list, "list");
        int size = list.size();
        if (size == 0) {
            return "";
        }
        int i = 0;
        int d = C10030l.m6193d(0, str.length() * (size - 2)) + str2.length();
        int i2 = 0;
        for (String str3 : list) {
            d += str3.length();
            i2++;
            if (i2 == size) {
                break;
            }
        }
        StringBuilder sb2 = new StringBuilder(d);
        for (String str4 : list) {
            if (i > 0) {
                sb2.append(i == size + (-1) ? str2 : str);
            }
            sb2.append(str4);
            i++;
            if (i == size) {
                break;
            }
        }
        String sb3 = sb2.toString();
        C8298k.m12934d(sb3, "b.toString()");
        return sb3;
    }

    public static final String m24056o(String str, int[] iArr) {
        C8298k.m12933e(str, "separator");
        C8298k.m12933e(iArr, "tokens");
        return C5296i.m23410D(iArr, str, null, null, 0, null, null, 62, null);
    }

    public static final int m24055p(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static final String m24054q(int i) {
        String valueOf = String.valueOf(i);
        int length = 10 - valueOf.length();
        if (length <= 0) {
            return valueOf;
        }
        StringBuilder sb2 = new StringBuilder(10);
        int i2 = 0;
        while (i2 < length) {
            i2++;
            sb2.append('0');
        }
        sb2.append(valueOf);
        String sb3 = sb2.toString();
        C8298k.m12934d(sb3, "b.toString()");
        return sb3;
    }

    public static final String m24053r(String str, int i) {
        C8298k.m12933e(str, "<this>");
        if (i == 0) {
            return "";
        }
        int i2 = 0;
        if (str.length() == 0) {
            return "";
        }
        if (i == 1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i);
        if (i >= 0) {
            while (true) {
                i2++;
                sb2.append(str);
                if (i2 == i) {
                    break;
                }
            }
        }
        String sb3 = sb2.toString();
        C8298k.m12934d(sb3, "b.toString()");
        return sb3;
    }

    public static final int m24052s(String str) {
        return m24050u(str, 0, 2, null);
    }

    public static final int m24051t(String str, int i) {
        Integer f;
        return (str == null || (f = C11450m.m639f(str)) == null) ? i : f.intValue();
    }

    public static int m24050u(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m24051t(str, i);
    }

    public static final int[] m24049v(String str, String str2) {
        C8298k.m12933e(str2, "delimiter");
        int i = 0;
        if (str == null || C11451n.m632m(str)) {
            return null;
        }
        List<String> i0 = C11452o.m586i0(str, new String[]{str2}, false, 0, 6, null);
        int[] iArr = new int[i0.size()];
        for (String str3 : i0) {
            i++;
            try {
                iArr[i] = Integer.parseInt(str3);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return iArr;
    }

    public static final long m24048w(String str) {
        return m24046y(str, 0L, 2, null);
    }

    public static final long m24047x(String str, long j) {
        Long h;
        return (str == null || (h = C11450m.m637h(str)) == null) ? j : h.longValue();
    }

    public static long m24046y(String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return m24047x(str, j);
    }

    public static final long[] m24045z(String str, String str2) {
        C8298k.m12933e(str2, "delimiter");
        int i = 0;
        if (str == null || C11451n.m632m(str)) {
            return null;
        }
        List<String> i0 = C11452o.m586i0(str, new String[]{str2}, false, 0, 6, null);
        long[] jArr = new long[i0.size()];
        for (String str3 : i0) {
            i++;
            try {
                jArr[i] = Long.parseLong(str3);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return jArr;
    }
}
