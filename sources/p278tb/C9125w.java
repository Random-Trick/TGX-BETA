package p278tb;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.thunderdog.challegram.Log;
import p039d.C3563j;
import p095gc.C4549e;
import p123ia.C5305o;
import p290ub.C9488a;
import p290ub.C9489b;
import p317wa.C10019e;
import p317wa.C10030l;
import qa.C8294g;
import qa.C8298k;
import za.C11439e;
import za.C11451n;
import za.C11452o;

public final class C9125w {
    public final boolean f29337a;
    public final String f29338b;
    public final String f29339c;
    public final String f29340d;
    public final String f29341e;
    public final int f29342f;
    public final List<String> f29343g;
    public final List<String> f29344h;
    public final String f29345i;
    public final String f29346j;
    public static final C9128b f29336l = new C9128b(null);
    public static final char[] f29335k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class C9126a {
        public static final C9127a f29347i = new C9127a(null);
        public String f29348a;
        public String f29351d;
        public final List<String> f29353f;
        public List<String> f29354g;
        public String f29355h;
        public String f29349b = "";
        public String f29350c = "";
        public int f29352e = -1;

        public static final class C9127a {
            public C9127a() {
            }

            public final int m10310e(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(C9128b.m10305b(C9125w.f29336l, str, i, i2, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int m10309f(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == ':') {
                        return i;
                    }
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    }
                    i++;
                }
                return i2;
            }

            public final int m10308g(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((C8298k.m12933f(charAt, 97) < 0 || C8298k.m12933f(charAt, C3563j.f11967N0) > 0) && (C8298k.m12933f(charAt, 65) < 0 || C8298k.m12933f(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (!(charAt2 == '+' || charAt2 == '-' || charAt2 == '.')) {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public final int m10307h(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            public C9127a(C8294g gVar) {
                this();
            }
        }

        public C9126a() {
            ArrayList arrayList = new ArrayList();
            this.f29353f = arrayList;
            arrayList.add("");
        }

        public final C9125w m10336a() {
            ArrayList arrayList;
            String str = this.f29348a;
            if (str != null) {
                C9128b bVar = C9125w.f29336l;
                String g = C9128b.m10300g(bVar, this.f29349b, 0, 0, false, 7, null);
                String g2 = C9128b.m10300g(bVar, this.f29350c, 0, 0, false, 7, null);
                String str2 = this.f29351d;
                if (str2 != null) {
                    int b = m10335b();
                    List<String> list = this.f29353f;
                    ArrayList arrayList2 = new ArrayList(C5305o.m23357o(list, 10));
                    for (String str3 : list) {
                        arrayList2.add(C9128b.m10300g(C9125w.f29336l, str3, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.f29354g;
                    if (list2 != null) {
                        arrayList = new ArrayList(C5305o.m23357o(list2, 10));
                        for (String str4 : list2) {
                            arrayList.add(str4 != null ? C9128b.m10300g(C9125w.f29336l, str4, 0, 0, true, 3, null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.f29355h;
                    return new C9125w(str, g, g2, str2, b, arrayList2, arrayList, str5 != null ? C9128b.m10300g(C9125w.f29336l, str5, 0, 0, false, 7, null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int m10335b() {
            int i = this.f29352e;
            if (i != -1) {
                return i;
            }
            C9128b bVar = C9125w.f29336l;
            String str = this.f29348a;
            C8298k.m12936c(str);
            return bVar.m10304c(str);
        }

        public final C9126a m10334c(String str) {
            List<String> list;
            if (str != null) {
                C9128b bVar = C9125w.f29336l;
                String b = C9128b.m10305b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (b != null) {
                    list = bVar.m10298i(b);
                    this.f29354g = list;
                    return this;
                }
            }
            list = null;
            this.f29354g = list;
            return this;
        }

        public final List<String> m10333d() {
            return this.f29353f;
        }

        public final C9126a m10332e(String str) {
            C8298k.m12934e(str, "host");
            String e = C9488a.m8545e(C9128b.m10300g(C9125w.f29336l, str, 0, 0, false, 7, null));
            if (e != null) {
                this.f29351d = e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final boolean m10331f(String str) {
            return C8298k.m12937b(str, ".") || C11451n.m633l(str, "%2e", true);
        }

        public final boolean m10330g(String str) {
            return C8298k.m12937b(str, "..") || C11451n.m633l(str, "%2e.", true) || C11451n.m633l(str, ".%2e", true) || C11451n.m633l(str, "%2e%2e", true);
        }

        public final C9126a m10329h(C9125w wVar, String str) {
            int i;
            int n;
            int i2;
            String str2;
            int i3;
            String str3;
            int i4;
            boolean z;
            boolean z2;
            C8298k.m12934e(str, "input");
            int x = C9489b.m8500x(str, 0, 0, 3, null);
            int z3 = C9489b.m8498z(str, x, 0, 2, null);
            C9127a aVar = f29347i;
            int g = aVar.m10308g(str, x, z3);
            String str4 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c = 65535;
            if (g != -1) {
                if (C11451n.m624u(str, "https:", x, true)) {
                    this.f29348a = "https";
                    x += 6;
                } else if (C11451n.m624u(str, "http:", x, true)) {
                    this.f29348a = "http";
                    x += 5;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str.substring(0, g);
                    C8298k.m12935d(substring, str4);
                    sb2.append(substring);
                    sb2.append("'");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (wVar != null) {
                this.f29348a = wVar.m10339p();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int h = aVar.m10307h(str, x, z3);
            char c2 = '?';
            char c3 = '#';
            if (h >= 2 || wVar == null || (!C8298k.m12937b(wVar.m10339p(), this.f29348a))) {
                int i5 = x + h;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    n = C9489b.m8510n(str, "@/\\?#", i5, z3);
                    char charAt = n != z3 ? str.charAt(n) : (char) 65535;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    }
                    if (charAt != '@') {
                        str3 = str4;
                        i3 = z3;
                    } else {
                        if (!z4) {
                            int m = C9489b.m8511m(str, ':', i5, n);
                            C9128b bVar = C9125w.f29336l;
                            i3 = z3;
                            str3 = str4;
                            String b = C9128b.m10305b(bVar, str, i5, m, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z5) {
                                b = this.f29349b + "%40" + b;
                            }
                            this.f29349b = b;
                            if (m != n) {
                                this.f29350c = C9128b.m10305b(bVar, str, m + 1, n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z2 = true;
                            } else {
                                z2 = z4;
                            }
                            z4 = z2;
                            z = true;
                            i4 = n;
                        } else {
                            i3 = z3;
                            str3 = str4;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f29350c);
                            sb3.append("%40");
                            i4 = n;
                            sb3.append(C9128b.m10305b(C9125w.f29336l, str, i5, n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f29350c = sb3.toString();
                            z = z5;
                        }
                        i5 = i4 + 1;
                        z5 = z;
                    }
                    str4 = str3;
                    z3 = i3;
                    c3 = '#';
                    c2 = '?';
                    c = 65535;
                }
                String str5 = str4;
                i = z3;
                C9127a aVar2 = f29347i;
                int f = aVar2.m10309f(str, i5, n);
                int i6 = f + 1;
                if (i6 < n) {
                    i2 = i5;
                    this.f29351d = C9488a.m8545e(C9128b.m10300g(C9125w.f29336l, str, i5, f, false, 4, null));
                    int e = aVar2.m10310e(str, i6, n);
                    this.f29352e = e;
                    if (e != -1) {
                        str2 = str5;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str.substring(i6, n);
                        C8298k.m12935d(substring2, str5);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str2 = str5;
                    C9128b bVar2 = C9125w.f29336l;
                    this.f29351d = C9488a.m8545e(C9128b.m10300g(bVar2, str, i2, f, false, 4, null));
                    String str6 = this.f29348a;
                    C8298k.m12936c(str6);
                    this.f29352e = bVar2.m10304c(str6);
                }
                if (this.f29351d != null) {
                    x = n;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str.substring(i2, f);
                    C8298k.m12935d(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.f29349b = wVar.m10348g();
                this.f29350c = wVar.m10352c();
                this.f29351d = wVar.m10347h();
                this.f29352e = wVar.m10343l();
                this.f29353f.clear();
                this.f29353f.addAll(wVar.m10350e());
                if (x == z3 || str.charAt(x) == '#') {
                    m10334c(wVar.m10349f());
                }
                i = z3;
            }
            int i7 = i;
            int n2 = C9489b.m8510n(str, "?#", x, i7);
            m10323n(str, x, n2);
            if (n2 < i7 && str.charAt(n2) == '?') {
                int m2 = C9489b.m8511m(str, '#', n2, i7);
                C9128b bVar3 = C9125w.f29336l;
                this.f29354g = bVar3.m10298i(C9128b.m10305b(bVar3, str, n2 + 1, m2, " \"'<>#", true, false, true, false, null, 208, null));
                n2 = m2;
            }
            if (n2 < i7 && str.charAt(n2) == '#') {
                this.f29355h = C9128b.m10305b(C9125w.f29336l, str, n2 + 1, i7, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final C9126a m10328i(String str) {
            C8298k.m12934e(str, "password");
            this.f29350c = C9128b.m10305b(C9125w.f29336l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final void m10327j() {
            List<String> list = this.f29353f;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f29353f.isEmpty())) {
                this.f29353f.add("");
                return;
            }
            List<String> list2 = this.f29353f;
            list2.set(list2.size() - 1, "");
        }

        public final C9126a m10326k(int i) {
            boolean z = true;
            if (1 > i || 65535 < i) {
                z = false;
            }
            if (z) {
                this.f29352e = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        public final void m10325l(String str, int i, int i2, boolean z, boolean z2) {
            String b = C9128b.m10305b(C9125w.f29336l, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (!m10331f(b)) {
                if (m10330g(b)) {
                    m10327j();
                    return;
                }
                List<String> list = this.f29353f;
                if (list.get(list.size() - 1).length() == 0) {
                    List<String> list2 = this.f29353f;
                    list2.set(list2.size() - 1, b);
                } else {
                    this.f29353f.add(b);
                }
                if (z) {
                    this.f29353f.add("");
                }
            }
        }

        public final C9126a m10324m() {
            String str = this.f29351d;
            String str2 = null;
            this.f29351d = str != null ? new C11439e("[\"<>^`{|}]").m647b(str, "") : null;
            int size = this.f29353f.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.f29353f;
                list.set(i, C9128b.m10305b(C9125w.f29336l, list.get(i), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.f29354g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str3 = list2.get(i2);
                    list2.set(i2, str3 != null ? C9128b.m10305b(C9125w.f29336l, str3, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str4 = this.f29355h;
            if (str4 != null) {
                str2 = C9128b.m10305b(C9125w.f29336l, str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null);
            }
            this.f29355h = str2;
            return this;
        }

        public final void m10323n(java.lang.String r11, int r12, int r13) {
            throw new UnsupportedOperationException("Method not decompiled: p278tb.C9125w.C9126a.m10323n(java.lang.String, int, int):void");
        }

        public final C9126a m10322o(String str) {
            C8298k.m12934e(str, "scheme");
            if (C11451n.m633l(str, "http", true)) {
                this.f29348a = "http";
            } else if (C11451n.m633l(str, "https", true)) {
                this.f29348a = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public final void m10321p(String str) {
            this.f29355h = str;
        }

        public final void m10320q(String str) {
            C8298k.m12934e(str, "<set-?>");
            this.f29350c = str;
        }

        public final void m10319r(String str) {
            C8298k.m12934e(str, "<set-?>");
            this.f29349b = str;
        }

        public final void m10318s(String str) {
            this.f29351d = str;
        }

        public final void m10317t(int i) {
            this.f29352e = i;
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Method not decompiled: p278tb.C9125w.C9126a.toString():java.lang.String");
        }

        public final void m10316u(String str) {
            this.f29348a = str;
        }

        public final C9126a m10315v(String str) {
            C8298k.m12934e(str, "username");
            this.f29349b = C9128b.m10305b(C9125w.f29336l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    public static final class C9128b {
        public C9128b() {
        }

        public static String m10305b(C9128b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return bVar.m10306a(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & Log.TAG_YOUTUBE) != 0 ? null : charset);
        }

        public static String m10300g(C9128b bVar, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return bVar.m10301f(str, i, i2, z);
        }

        public final String m10306a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            C8298k.m12934e(str, "$this$canonicalize");
            C8298k.m12934e(str2, "encodeSet");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !C11452o.m619B(str2, (char) codePointAt, false, 2, null))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!m10302e(str, i3, i2)) {
                                    C4549e eVar = new C4549e();
                                    eVar.m27417e1(str, i, i3);
                                    m10296k(eVar, str, i3, i2, str2, z, z2, z3, z4, charset);
                                    return eVar.m27433O0();
                                }
                                if (codePointAt == 43 || !z3) {
                                    i3 += Character.charCount(codePointAt);
                                } else {
                                    C4549e eVar2 = new C4549e();
                                    eVar2.m27417e1(str, i, i3);
                                    m10296k(eVar2, str, i3, i2, str2, z, z2, z3, z4, charset);
                                    return eVar2.m27433O0();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i3 += Character.charCount(codePointAt);
                }
                C4549e eVar22 = new C4549e();
                eVar22.m27417e1(str, i, i3);
                m10296k(eVar22, str, i3, i2, str2, z, z2, z3, z4, charset);
                return eVar22.m27433O0();
            }
            String substring = str.substring(i, i2);
            C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int m10304c(String str) {
            C8298k.m12934e(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final C9125w m10303d(String str) {
            C8298k.m12934e(str, "$this$toHttpUrl");
            return new C9126a().m10329h(null, str).m10336a();
        }

        public final boolean m10302e(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && C9489b.m8540E(str.charAt(i + 1)) != -1 && C9489b.m8540E(str.charAt(i3)) != -1;
        }

        public final String m10301f(String str, int i, int i2, boolean z) {
            C8298k.m12934e(str, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C4549e eVar = new C4549e();
                    eVar.m27417e1(str, i, i3);
                    m10295l(eVar, str, i3, i2, z);
                    return eVar.m27433O0();
                }
            }
            String substring = str.substring(i, i2);
            C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void m10299h(List<String> list, StringBuilder sb2) {
            C8298k.m12934e(list, "$this$toPathString");
            C8298k.m12934e(sb2, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb2.append('/');
                sb2.append(list.get(i));
            }
        }

        public final List<String> m10298i(String str) {
            C8298k.m12934e(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int M = C11452o.m608M(str, '&', i, false, 4, null);
                if (M == -1) {
                    M = str.length();
                }
                int i2 = M;
                int M2 = C11452o.m608M(str, '=', i, false, 4, null);
                if (M2 == -1 || M2 > i2) {
                    String substring = str.substring(i, i2);
                    C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i, M2);
                    C8298k.m12935d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(M2 + 1, i2);
                    C8298k.m12935d(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        public final void m10297j(List<String> list, StringBuilder sb2) {
            C8298k.m12934e(list, "$this$toQueryString");
            C8298k.m12934e(sb2, "out");
            C10019e i = C10030l.m6188i(C10030l.m6187j(0, list.size()), 2);
            int r = i.m6211r();
            int s = i.m6210s();
            int t = i.m6209t();
            if (t >= 0) {
                if (r > s) {
                    return;
                }
            } else if (r < s) {
                return;
            }
            while (true) {
                String str = list.get(r);
                String str2 = list.get(r + 1);
                if (r > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (r != s) {
                    r += t;
                } else {
                    return;
                }
            }
        }

        public final void m10296k(p095gc.C4549e r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            throw new UnsupportedOperationException("Method not decompiled: p278tb.C9125w.C9128b.m10296k(gc.e, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        public final void m10295l(C4549e eVar, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i);
                if (codePointAt != 37 || (i3 = i + 2) >= i2) {
                    if (codePointAt == 43 && z) {
                        eVar.mo27349C(32);
                        i++;
                    }
                    eVar.m27416f1(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    int E = C9489b.m8540E(str.charAt(i + 1));
                    int E2 = C9489b.m8540E(str.charAt(i3));
                    if (!(E == -1 || E2 == -1)) {
                        eVar.mo27349C((E << 4) + E2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    eVar.m27416f1(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
        }

        public C9128b(C8294g gVar) {
            this();
        }
    }

    public C9125w(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        C8298k.m12934e(str, "scheme");
        C8298k.m12934e(str2, "username");
        C8298k.m12934e(str3, "password");
        C8298k.m12934e(str4, "host");
        C8298k.m12934e(list, "pathSegments");
        C8298k.m12934e(str6, "url");
        this.f29338b = str;
        this.f29339c = str2;
        this.f29340d = str3;
        this.f29341e = str4;
        this.f29342f = i;
        this.f29343g = list;
        this.f29344h = list2;
        this.f29345i = str5;
        this.f29346j = str6;
        this.f29337a = C8298k.m12937b(str, "https");
    }

    public final String m10353b() {
        if (this.f29345i == null) {
            return null;
        }
        String str = this.f29346j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(C11452o.m608M(this.f29346j, '#', 0, false, 6, null) + 1);
        C8298k.m12935d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String m10352c() {
        if (this.f29340d.length() == 0) {
            return "";
        }
        int M = C11452o.m608M(this.f29346j, '@', 0, false, 6, null);
        String str = this.f29346j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(C11452o.m608M(this.f29346j, ':', this.f29338b.length() + 3, false, 4, null) + 1, M);
        C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String m10351d() {
        int M = C11452o.m608M(this.f29346j, '/', this.f29338b.length() + 3, false, 4, null);
        String str = this.f29346j;
        int n = C9489b.m8510n(str, "?#", M, str.length());
        String str2 = this.f29346j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(M, n);
        C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> m10350e() {
        int M = C11452o.m608M(this.f29346j, '/', this.f29338b.length() + 3, false, 4, null);
        String str = this.f29346j;
        int n = C9489b.m8510n(str, "?#", M, str.length());
        ArrayList arrayList = new ArrayList();
        while (M < n) {
            int i = M + 1;
            int m = C9489b.m8511m(this.f29346j, '/', i, n);
            String str2 = this.f29346j;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i, m);
            C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            M = m;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9125w) && C8298k.m12937b(((C9125w) obj).f29346j, this.f29346j);
    }

    public final String m10349f() {
        if (this.f29344h == null) {
            return null;
        }
        int M = C11452o.m608M(this.f29346j, '?', 0, false, 6, null) + 1;
        String str = this.f29346j;
        int m = C9489b.m8511m(str, '#', M, str.length());
        String str2 = this.f29346j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(M, m);
        C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String m10348g() {
        if (this.f29339c.length() == 0) {
            return "";
        }
        int length = this.f29338b.length() + 3;
        String str = this.f29346j;
        int n = C9489b.m8510n(str, ":@", length, str.length());
        String str2 = this.f29346j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, n);
        C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String m10347h() {
        return this.f29341e;
    }

    public int hashCode() {
        return this.f29346j.hashCode();
    }

    public final boolean m10346i() {
        return this.f29337a;
    }

    public final C9126a m10345j() {
        C9126a aVar = new C9126a();
        aVar.m10316u(this.f29338b);
        aVar.m10319r(m10348g());
        aVar.m10320q(m10352c());
        aVar.m10318s(this.f29341e);
        aVar.m10317t(this.f29342f != f29336l.m10304c(this.f29338b) ? this.f29342f : -1);
        aVar.m10333d().clear();
        aVar.m10333d().addAll(m10350e());
        aVar.m10334c(m10349f());
        aVar.m10321p(m10353b());
        return aVar;
    }

    public final C9126a m10344k(String str) {
        C8298k.m12934e(str, "link");
        try {
            return new C9126a().m10329h(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int m10343l() {
        return this.f29342f;
    }

    public final String m10342m() {
        if (this.f29344h == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f29336l.m10297j(this.f29344h, sb2);
        return sb2.toString();
    }

    public final String m10341n() {
        C9126a k = m10344k("/...");
        C8298k.m12936c(k);
        return k.m10315v("").m10328i("").m10336a().toString();
    }

    public final C9125w m10340o(String str) {
        C8298k.m12934e(str, "link");
        C9126a k = m10344k(str);
        if (k != null) {
            return k.m10336a();
        }
        return null;
    }

    public final String m10339p() {
        return this.f29338b;
    }

    public final URI m10338q() {
        String aVar = m10345j().m10324m().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new C11439e("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m647b(aVar, ""));
                C8298k.m12935d(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL m10337r() {
        try {
            return new URL(this.f29346j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f29346j;
    }
}
