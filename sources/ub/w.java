package ub;

import ab.e;
import ab.n;
import d.j;
import ja.o;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.thunderdog.challegram.Log;
import ra.g;
import ra.k;
import xa.l;

public final class w {
    public final boolean f23941a;
    public final String f23942b;
    public final String f23943c;
    public final String f23944d;
    public final String f23945e;
    public final int f23946f;
    public final List<String> f23947g;
    public final List<String> f23948h;
    public final String f23949i;
    public final String f23950j;
    public static final b f23940l = new b(null);
    public static final char[] f23939k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class a {
        public static final C0228a f23951i = new C0228a(null);
        public String f23952a;
        public String f23955d;
        public final List<String> f23957f;
        public List<String> f23958g;
        public String f23959h;
        public String f23953b = "";
        public String f23954c = "";
        public int f23956e = -1;

        public static final class C0228a {
            public C0228a() {
            }

            public C0228a(g gVar) {
                this();
            }

            public final int e(String str, int i10, int i11) {
                try {
                    int parseInt = Integer.parseInt(b.b(w.f23940l, str, i10, i11, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt == ':') {
                        return i10;
                    }
                    if (charAt == '[') {
                        do {
                            i10++;
                            if (i10 < i11) {
                            }
                        } while (str.charAt(i10) != ']');
                    }
                    i10++;
                }
                return i11;
            }

            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i10);
                if ((k.f(charAt, 97) < 0 || k.f(charAt, j.N0) > 0) && (k.f(charAt, 65) < 0 || k.f(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i10);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (!(charAt2 == '+' || charAt2 == '-' || charAt2 == '.')) {
                                    if (charAt2 == ':') {
                                        return i10;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f23957f = arrayList;
            arrayList.add("");
        }

        public final w a() {
            ArrayList arrayList;
            String str = this.f23952a;
            if (str != null) {
                b bVar = w.f23940l;
                String g10 = b.g(bVar, this.f23953b, 0, 0, false, 7, null);
                String g11 = b.g(bVar, this.f23954c, 0, 0, false, 7, null);
                String str2 = this.f23955d;
                if (str2 != null) {
                    int b10 = b();
                    List<String> list = this.f23957f;
                    ArrayList arrayList2 = new ArrayList(o.o(list, 10));
                    for (String str3 : list) {
                        arrayList2.add(b.g(w.f23940l, str3, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.f23958g;
                    if (list2 != null) {
                        arrayList = new ArrayList(o.o(list2, 10));
                        for (String str4 : list2) {
                            arrayList.add(str4 != null ? b.g(w.f23940l, str4, 0, 0, true, 3, null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.f23959h;
                    return new w(str, g10, g11, str2, b10, arrayList2, arrayList, str5 != null ? b.g(w.f23940l, str5, 0, 0, false, 7, null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int b() {
            int i10 = this.f23956e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = w.f23940l;
            String str = this.f23952a;
            k.c(str);
            return bVar.c(str);
        }

        public final a c(String str) {
            List<String> list;
            if (str != null) {
                b bVar = w.f23940l;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (b10 != null) {
                    list = bVar.i(b10);
                    this.f23958g = list;
                    return this;
                }
            }
            list = null;
            this.f23958g = list;
            return this;
        }

        public final List<String> d() {
            return this.f23957f;
        }

        public final a e(String str) {
            k.e(str, "host");
            String e10 = vb.a.e(b.g(w.f23940l, str, 0, 0, false, 7, null));
            if (e10 != null) {
                this.f23955d = e10;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final boolean f(String str) {
            return k.b(str, ".") || n.l(str, "%2e", true);
        }

        public final boolean g(String str) {
            return k.b(str, "..") || n.l(str, "%2e.", true) || n.l(str, ".%2e", true) || n.l(str, "%2e%2e", true);
        }

        public final a h(w wVar, String str) {
            int i10;
            int n10;
            int i11;
            String str2;
            int i12;
            String str3;
            int i13;
            boolean z10;
            boolean z11;
            k.e(str, "input");
            int x10 = vb.b.x(str, 0, 0, 3, null);
            int z12 = vb.b.z(str, x10, 0, 2, null);
            C0228a aVar = f23951i;
            int g10 = aVar.g(str, x10, z12);
            String str4 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c10 = 65535;
            if (g10 != -1) {
                if (n.u(str, "https:", x10, true)) {
                    this.f23952a = "https";
                    x10 += 6;
                } else if (n.u(str, "http:", x10, true)) {
                    this.f23952a = "http";
                    x10 += 5;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str.substring(0, g10);
                    k.d(substring, str4);
                    sb2.append(substring);
                    sb2.append("'");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (wVar != null) {
                this.f23952a = wVar.p();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int h10 = aVar.h(str, x10, z12);
            char c11 = '?';
            char c12 = '#';
            if (h10 >= 2 || wVar == null || (!k.b(wVar.p(), this.f23952a))) {
                int i14 = x10 + h10;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    n10 = vb.b.n(str, "@/\\?#", i14, z12);
                    char charAt = n10 != z12 ? str.charAt(n10) : (char) 65535;
                    if (charAt == c10 || charAt == c12 || charAt == '/' || charAt == '\\' || charAt == c11) {
                        break;
                    }
                    if (charAt != '@') {
                        str3 = str4;
                        i12 = z12;
                    } else {
                        if (!z13) {
                            int m10 = vb.b.m(str, ':', i14, n10);
                            b bVar = w.f23940l;
                            i12 = z12;
                            str3 = str4;
                            String b10 = b.b(bVar, str, i14, m10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                b10 = this.f23953b + "%40" + b10;
                            }
                            this.f23953b = b10;
                            if (m10 != n10) {
                                this.f23954c = b.b(bVar, str, m10 + 1, n10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = true;
                            } else {
                                z11 = z13;
                            }
                            z13 = z11;
                            z10 = true;
                            i13 = n10;
                        } else {
                            i12 = z12;
                            str3 = str4;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f23954c);
                            sb3.append("%40");
                            i13 = n10;
                            sb3.append(b.b(w.f23940l, str, i14, n10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f23954c = sb3.toString();
                            z10 = z14;
                        }
                        i14 = i13 + 1;
                        z14 = z10;
                    }
                    str4 = str3;
                    z12 = i12;
                    c12 = '#';
                    c11 = '?';
                    c10 = 65535;
                }
                String str5 = str4;
                i10 = z12;
                C0228a aVar2 = f23951i;
                int f10 = aVar2.f(str, i14, n10);
                int i15 = f10 + 1;
                if (i15 < n10) {
                    i11 = i14;
                    this.f23955d = vb.a.e(b.g(w.f23940l, str, i14, f10, false, 4, null));
                    int e10 = aVar2.e(str, i15, n10);
                    this.f23956e = e10;
                    if (e10 != -1) {
                        str2 = str5;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str.substring(i15, n10);
                        k.d(substring2, str5);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i11 = i14;
                    str2 = str5;
                    b bVar2 = w.f23940l;
                    this.f23955d = vb.a.e(b.g(bVar2, str, i11, f10, false, 4, null));
                    String str6 = this.f23952a;
                    k.c(str6);
                    this.f23956e = bVar2.c(str6);
                }
                if (this.f23955d != null) {
                    x10 = n10;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str.substring(i11, f10);
                    k.d(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.f23953b = wVar.g();
                this.f23954c = wVar.c();
                this.f23955d = wVar.h();
                this.f23956e = wVar.l();
                this.f23957f.clear();
                this.f23957f.addAll(wVar.e());
                if (x10 == z12 || str.charAt(x10) == '#') {
                    c(wVar.f());
                }
                i10 = z12;
            }
            int i16 = i10;
            int n11 = vb.b.n(str, "?#", x10, i16);
            n(str, x10, n11);
            if (n11 < i16 && str.charAt(n11) == '?') {
                int m11 = vb.b.m(str, '#', n11, i16);
                b bVar3 = w.f23940l;
                this.f23958g = bVar3.i(b.b(bVar3, str, n11 + 1, m11, " \"'<>#", true, false, true, false, null, 208, null));
                n11 = m11;
            }
            if (n11 < i16 && str.charAt(n11) == '#') {
                this.f23959h = b.b(w.f23940l, str, n11 + 1, i16, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a i(String str) {
            k.e(str, "password");
            this.f23954c = b.b(w.f23940l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final void j() {
            List<String> list = this.f23957f;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f23957f.isEmpty())) {
                this.f23957f.add("");
                return;
            }
            List<String> list2 = this.f23957f;
            list2.set(list2.size() - 1, "");
        }

        public final a k(int i10) {
            boolean z10 = true;
            if (1 > i10 || 65535 < i10) {
                z10 = false;
            }
            if (z10) {
                this.f23956e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final void l(String str, int i10, int i11, boolean z10, boolean z11) {
            String b10 = b.b(w.f23940l, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, 240, null);
            if (!f(b10)) {
                if (g(b10)) {
                    j();
                    return;
                }
                List<String> list = this.f23957f;
                if (list.get(list.size() - 1).length() == 0) {
                    List<String> list2 = this.f23957f;
                    list2.set(list2.size() - 1, b10);
                } else {
                    this.f23957f.add(b10);
                }
                if (z10) {
                    this.f23957f.add("");
                }
            }
        }

        public final a m() {
            String str = this.f23955d;
            String str2 = null;
            this.f23955d = str != null ? new e("[\"<>^`{|}]").b(str, "") : null;
            int size = this.f23957f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.f23957f;
                list.set(i10, b.b(w.f23940l, list.get(i10), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.f23958g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str3 = list2.get(i11);
                    list2.set(i11, str3 != null ? b.b(w.f23940l, str3, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str4 = this.f23959h;
            if (str4 != null) {
                str2 = b.b(w.f23940l, str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null);
            }
            this.f23959h = str2;
            return this;
        }

        public final void n(java.lang.String r11, int r12, int r13) {
            throw new UnsupportedOperationException("Method not decompiled: ub.w.a.n(java.lang.String, int, int):void");
        }

        public final a o(String str) {
            k.e(str, "scheme");
            if (n.l(str, "http", true)) {
                this.f23952a = "http";
            } else if (n.l(str, "https", true)) {
                this.f23952a = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public final void p(String str) {
            this.f23959h = str;
        }

        public final void q(String str) {
            k.e(str, "<set-?>");
            this.f23954c = str;
        }

        public final void r(String str) {
            k.e(str, "<set-?>");
            this.f23953b = str;
        }

        public final void s(String str) {
            this.f23955d = str;
        }

        public final void t(int i10) {
            this.f23956e = i10;
        }

        public java.lang.String toString() {
            throw new UnsupportedOperationException("Method not decompiled: ub.w.a.toString():java.lang.String");
        }

        public final void u(String str) {
            this.f23952a = str;
        }

        public final a v(String str) {
            k.e(str, "username");
            this.f23953b = b.b(w.f23940l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public b(g gVar) {
            this();
        }

        public static String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return bVar.a(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & Log.TAG_YOUTUBE) != 0 ? null : charset);
        }

        public static String g(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.f(str, i10, i11, z10);
        }

        public final String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            k.e(str, "$this$canonicalize");
            k.e(str2, "encodeSet");
            int i12 = i10;
            while (i12 < i11) {
                int codePointAt = str.codePointAt(i12);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z13) && !ab.o.B(str2, (char) codePointAt, false, 2, null))) {
                    if (codePointAt == 37) {
                        if (z10) {
                            if (z11) {
                                if (!e(str, i12, i11)) {
                                    hc.e eVar = new hc.e();
                                    eVar.e1(str, i10, i12);
                                    k(eVar, str, i12, i11, str2, z10, z11, z12, z13, charset);
                                    return eVar.O0();
                                }
                                if (codePointAt == 43 || !z12) {
                                    i12 += Character.charCount(codePointAt);
                                } else {
                                    hc.e eVar2 = new hc.e();
                                    eVar2.e1(str, i10, i12);
                                    k(eVar2, str, i12, i11, str2, z10, z11, z12, z13, charset);
                                    return eVar2.O0();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i12 += Character.charCount(codePointAt);
                }
                hc.e eVar22 = new hc.e();
                eVar22.e1(str, i10, i12);
                k(eVar22, str, i12, i11, str2, z10, z11, z12, z13, charset);
                return eVar22.O0();
            }
            String substring = str.substring(i10, i11);
            k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int c(String str) {
            k.e(str, "scheme");
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

        public final w d(String str) {
            k.e(str, "$this$toHttpUrl");
            return new a().h(null, str).a();
        }

        public final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && vb.b.E(str.charAt(i10 + 1)) != -1 && vb.b.E(str.charAt(i12)) != -1;
        }

        public final String f(String str, int i10, int i11, boolean z10) {
            k.e(str, "$this$percentDecode");
            for (int i12 = i10; i12 < i11; i12++) {
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    hc.e eVar = new hc.e();
                    eVar.e1(str, i10, i12);
                    l(eVar, str, i12, i11, z10);
                    return eVar.O0();
                }
            }
            String substring = str.substring(i10, i11);
            k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void h(List<String> list, StringBuilder sb2) {
            k.e(list, "$this$toPathString");
            k.e(sb2, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }

        public final List<String> i(String str) {
            k.e(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int M = ab.o.M(str, '&', i10, false, 4, null);
                if (M == -1) {
                    M = str.length();
                }
                int i11 = M;
                int M2 = ab.o.M(str, '=', i10, false, 4, null);
                if (M2 == -1 || M2 > i11) {
                    String substring = str.substring(i10, i11);
                    k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i10, M2);
                    k.d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(M2 + 1, i11);
                    k.d(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void j(List<String> list, StringBuilder sb2) {
            k.e(list, "$this$toQueryString");
            k.e(sb2, "out");
            xa.e i10 = l.i(l.j(0, list.size()), 2);
            int r10 = i10.r();
            int s10 = i10.s();
            int t10 = i10.t();
            if (t10 >= 0) {
                if (r10 > s10) {
                    return;
                }
            } else if (r10 < s10) {
                return;
            }
            while (true) {
                String str = list.get(r10);
                String str2 = list.get(r10 + 1);
                if (r10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (r10 != s10) {
                    r10 += t10;
                } else {
                    return;
                }
            }
        }

        public final void k(hc.e r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            throw new UnsupportedOperationException("Method not decompiled: ub.w.b.k(hc.e, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        public final void l(hc.e eVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i10);
                if (codePointAt != 37 || (i12 = i10 + 2) >= i11) {
                    if (codePointAt == 43 && z10) {
                        eVar.D(32);
                        i10++;
                    }
                    eVar.f1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                } else {
                    int E = vb.b.E(str.charAt(i10 + 1));
                    int E2 = vb.b.E(str.charAt(i12));
                    if (!(E == -1 || E2 == -1)) {
                        eVar.D((E << 4) + E2);
                        i10 = Character.charCount(codePointAt) + i12;
                    }
                    eVar.f1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                }
            }
        }
    }

    public w(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        k.e(str, "scheme");
        k.e(str2, "username");
        k.e(str3, "password");
        k.e(str4, "host");
        k.e(list, "pathSegments");
        k.e(str6, "url");
        this.f23942b = str;
        this.f23943c = str2;
        this.f23944d = str3;
        this.f23945e = str4;
        this.f23946f = i10;
        this.f23947g = list;
        this.f23948h = list2;
        this.f23949i = str5;
        this.f23950j = str6;
        this.f23941a = k.b(str, "https");
    }

    public final String b() {
        if (this.f23949i == null) {
            return null;
        }
        String str = this.f23950j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(ab.o.M(this.f23950j, '#', 0, false, 6, null) + 1);
        k.d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String c() {
        if (this.f23944d.length() == 0) {
            return "";
        }
        int M = ab.o.M(this.f23950j, '@', 0, false, 6, null);
        String str = this.f23950j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(ab.o.M(this.f23950j, ':', this.f23942b.length() + 3, false, 4, null) + 1, M);
        k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String d() {
        int M = ab.o.M(this.f23950j, '/', this.f23942b.length() + 3, false, 4, null);
        String str = this.f23950j;
        int n10 = vb.b.n(str, "?#", M, str.length());
        String str2 = this.f23950j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(M, n10);
        k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> e() {
        int M = ab.o.M(this.f23950j, '/', this.f23942b.length() + 3, false, 4, null);
        String str = this.f23950j;
        int n10 = vb.b.n(str, "?#", M, str.length());
        ArrayList arrayList = new ArrayList();
        while (M < n10) {
            int i10 = M + 1;
            int m10 = vb.b.m(this.f23950j, '/', i10, n10);
            String str2 = this.f23950j;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i10, m10);
            k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            M = m10;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && k.b(((w) obj).f23950j, this.f23950j);
    }

    public final String f() {
        if (this.f23948h == null) {
            return null;
        }
        int M = ab.o.M(this.f23950j, '?', 0, false, 6, null) + 1;
        String str = this.f23950j;
        int m10 = vb.b.m(str, '#', M, str.length());
        String str2 = this.f23950j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(M, m10);
        k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        if (this.f23943c.length() == 0) {
            return "";
        }
        int length = this.f23942b.length() + 3;
        String str = this.f23950j;
        int n10 = vb.b.n(str, ":@", length, str.length());
        String str2 = this.f23950j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, n10);
        k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String h() {
        return this.f23945e;
    }

    public int hashCode() {
        return this.f23950j.hashCode();
    }

    public final boolean i() {
        return this.f23941a;
    }

    public final a j() {
        a aVar = new a();
        aVar.u(this.f23942b);
        aVar.r(g());
        aVar.q(c());
        aVar.s(this.f23945e);
        aVar.t(this.f23946f != f23940l.c(this.f23942b) ? this.f23946f : -1);
        aVar.d().clear();
        aVar.d().addAll(e());
        aVar.c(f());
        aVar.p(b());
        return aVar;
    }

    public final a k(String str) {
        k.e(str, "link");
        try {
            return new a().h(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.f23946f;
    }

    public final String m() {
        if (this.f23948h == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f23940l.j(this.f23948h, sb2);
        return sb2.toString();
    }

    public final String n() {
        a k10 = k("/...");
        k.c(k10);
        return k10.v("").i("").a().toString();
    }

    public final w o(String str) {
        k.e(str, "link");
        a k10 = k(str);
        if (k10 != null) {
            return k10.a();
        }
        return null;
    }

    public final String p() {
        return this.f23942b;
    }

    public final URI q() {
        String aVar = j().m().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new e("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(aVar, ""));
                k.d(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL r() {
        try {
            return new URL(this.f23950j);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f23950j;
    }
}
