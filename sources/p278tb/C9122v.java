package p278tb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p107ha.C5048h;
import p107ha.C5054l;
import p123ia.C5296i;
import p123ia.C5304n;
import p123ia.C5309s;
import p251ra.AbstractC8415a;
import p290ub.C9489b;
import p317wa.C10019e;
import p317wa.C10030l;
import qa.C8287b;
import qa.C8294g;
import qa.C8298k;
import za.C11451n;
import za.C11452o;

public final class C9122v implements Iterable<C5048h<? extends String, ? extends String>>, AbstractC8415a {
    public static final C9124b f29332b = new C9124b(null);
    public final String[] f29333a;

    public static final class C9123a {
        public final List<String> f29334a = new ArrayList(20);

        public final C9123a m10368a(String str, String str2) {
            C8298k.m12934e(str, "name");
            C8298k.m12934e(str2, "value");
            C9124b bVar = C9122v.f29332b;
            bVar.m10358d(str);
            bVar.m10357e(str2, str);
            m10366c(str, str2);
            return this;
        }

        public final C9123a m10367b(String str) {
            C8298k.m12934e(str, "line");
            int M = C11452o.m608M(str, ':', 1, false, 4, null);
            if (M != -1) {
                String substring = str.substring(0, M);
                C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(M + 1);
                C8298k.m12935d(substring2, "(this as java.lang.String).substring(startIndex)");
                m10366c(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                C8298k.m12935d(substring3, "(this as java.lang.String).substring(startIndex)");
                m10366c("", substring3);
            } else {
                m10366c("", str);
            }
            return this;
        }

        public final C9123a m10366c(String str, String str2) {
            C8298k.m12934e(str, "name");
            C8298k.m12934e(str2, "value");
            this.f29334a.add(str);
            this.f29334a.add(C11452o.m574u0(str2).toString());
            return this;
        }

        public final C9122v m10365d() {
            Object[] array = this.f29334a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new C9122v((String[]) array, null);
        }

        public final List<String> m10364e() {
            return this.f29334a;
        }

        public final C9123a m10363f(String str) {
            C8298k.m12934e(str, "name");
            int i = 0;
            while (i < this.f29334a.size()) {
                if (C11451n.m633l(str, this.f29334a.get(i), true)) {
                    this.f29334a.remove(i);
                    this.f29334a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final C9123a m10362g(String str, String str2) {
            C8298k.m12934e(str, "name");
            C8298k.m12934e(str2, "value");
            C9124b bVar = C9122v.f29332b;
            bVar.m10358d(str);
            bVar.m10357e(str2, str);
            m10363f(str);
            m10366c(str, str2);
            return this;
        }
    }

    public static final class C9124b {
        public C9124b() {
        }

        public final void m10358d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (!('!' <= charAt && '~' >= charAt)) {
                        throw new IllegalArgumentException(C9489b.m8507q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        public final void m10357e(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C9489b.m8507q("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    sb2.append(C9489b.m8541D(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        public final String m10356f(String[] strArr, String str) {
            C10019e i = C10030l.m6188i(C10030l.m6189h(strArr.length - 2, 0), 2);
            int r = i.m6211r();
            int s = i.m6210s();
            int t = i.m6209t();
            if (t >= 0) {
                if (r > s) {
                    return null;
                }
            } else if (r < s) {
                return null;
            }
            while (!C11451n.m633l(str, strArr[r], true)) {
                if (r == s) {
                    return null;
                }
                r += t;
            }
            return strArr[r + 1];
        }

        public final C9122v m10355g(String... strArr) {
            C8298k.m12934e(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                for (int i = 0; i < length; i++) {
                    if (strArr2[i] != null) {
                        String str = strArr2[i];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i] = C11452o.m574u0(str).toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                C10019e i2 = C10030l.m6188i(C5296i.m23389r(strArr2), 2);
                int r = i2.m6211r();
                int s = i2.m6210s();
                int t = i2.m6209t();
                if (t < 0 ? r >= s : r <= s) {
                    while (true) {
                        String str2 = strArr2[r];
                        String str3 = strArr2[r + 1];
                        m10358d(str2);
                        m10357e(str3, str2);
                        if (r == s) {
                            break;
                        }
                        r += t;
                    }
                }
                return new C9122v(strArr2, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        public C9124b(C8294g gVar) {
            this();
        }
    }

    public C9122v(String[] strArr) {
        this.f29333a = strArr;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9122v) && Arrays.equals(this.f29333a, ((C9122v) obj).f29333a);
    }

    public final String m10373h(String str) {
        C8298k.m12934e(str, "name");
        return f29332b.m10356f(this.f29333a, str);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f29333a);
    }

    public final String m10372i(int i) {
        return this.f29333a[i * 2];
    }

    @Override
    public Iterator<C5048h<? extends String, ? extends String>> iterator() {
        int size = size();
        C5048h[] hVarArr = new C5048h[size];
        for (int i = 0; i < size; i++) {
            hVarArr[i] = C5054l.m24188a(m10372i(i), m10370r(i));
        }
        return C8287b.m12950a(hVarArr);
    }

    public final C9123a m10371m() {
        C9123a aVar = new C9123a();
        C5309s.m23353s(aVar.m10364e(), this.f29333a);
        return aVar;
    }

    public final String m10370r(int i) {
        return this.f29333a[(i * 2) + 1];
    }

    public final List<String> m10369s(String str) {
        C8298k.m12934e(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (C11451n.m633l(str, m10372i(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m10370r(i));
            }
        }
        if (arrayList == null) {
            return C5304n.m23366f();
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        C8298k.m12935d(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int size() {
        return this.f29333a.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String i2 = m10372i(i);
            String r = m10370r(i);
            sb2.append(i2);
            sb2.append(": ");
            if (C9489b.m8541D(i2)) {
                r = "██";
            }
            sb2.append(r);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        C8298k.m12935d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public C9122v(String[] strArr, C8294g gVar) {
        this(strArr);
    }
}
