package ub;

import ab.n;
import ab.o;
import ia.h;
import ja.i;
import ja.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ra.g;
import ra.k;
import xa.e;
import xa.l;

public final class v implements Iterable<h<? extends String, ? extends String>>, sa.a {
    public static final b f23936b = new b(null);
    public final String[] f23937a;

    public static final class a {
        public final List<String> f23938a = new ArrayList(20);

        public final a a(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            b bVar = v.f23936b;
            bVar.d(str);
            bVar.e(str2, str);
            c(str, str2);
            return this;
        }

        public final a b(String str) {
            k.e(str, "line");
            int M = o.M(str, ':', 1, false, 4, null);
            if (M != -1) {
                String substring = str.substring(0, M);
                k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(M + 1);
                k.d(substring2, "(this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                k.d(substring3, "(this as java.lang.String).substring(startIndex)");
                c("", substring3);
            } else {
                c("", str);
            }
            return this;
        }

        public final a c(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            this.f23938a.add(str);
            this.f23938a.add(o.u0(str2).toString());
            return this;
        }

        public final v d() {
            Object[] array = this.f23938a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new v((String[]) array, null);
        }

        public final List<String> e() {
            return this.f23938a;
        }

        public final a f(String str) {
            k.e(str, "name");
            int i10 = 0;
            while (i10 < this.f23938a.size()) {
                if (n.l(str, this.f23938a.get(i10), true)) {
                    this.f23938a.remove(i10);
                    this.f23938a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a g(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            b bVar = v.f23936b;
            bVar.d(str);
            bVar.e(str2, str);
            f(str);
            c(str, str2);
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public b(g gVar) {
            this();
        }

        public final void d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if (!('!' <= charAt && '~' >= charAt)) {
                        throw new IllegalArgumentException(vb.b.q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        public final void e(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(vb.b.q("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i10), str2));
                    sb2.append(vb.b.D(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        public final String f(String[] strArr, String str) {
            e i10 = l.i(l.h(strArr.length - 2, 0), 2);
            int r10 = i10.r();
            int s10 = i10.s();
            int t10 = i10.t();
            if (t10 >= 0) {
                if (r10 > s10) {
                    return null;
                }
            } else if (r10 < s10) {
                return null;
            }
            while (!n.l(str, strArr[r10], true)) {
                if (r10 == s10) {
                    return null;
                }
                r10 += t10;
            }
            return strArr[r10 + 1];
        }

        public final v g(String... strArr) {
            k.e(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    if (strArr2[i10] != null) {
                        String str = strArr2[i10];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i10] = o.u0(str).toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                e i11 = l.i(i.r(strArr2), 2);
                int r10 = i11.r();
                int s10 = i11.s();
                int t10 = i11.t();
                if (t10 < 0 ? r10 >= s10 : r10 <= s10) {
                    while (true) {
                        String str2 = strArr2[r10];
                        String str3 = strArr2[r10 + 1];
                        d(str2);
                        e(str3, str2);
                        if (r10 == s10) {
                            break;
                        }
                        r10 += t10;
                    }
                }
                return new v(strArr2, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public v(String[] strArr) {
        this.f23937a = strArr;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && Arrays.equals(this.f23937a, ((v) obj).f23937a);
    }

    public final String f(String str) {
        k.e(str, "name");
        return f23936b.f(this.f23937a, str);
    }

    public final String g(int i10) {
        return this.f23937a[i10 * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f23937a);
    }

    @Override
    public Iterator<h<? extends String, ? extends String>> iterator() {
        int size = size();
        h[] hVarArr = new h[size];
        for (int i10 = 0; i10 < size; i10++) {
            hVarArr[i10] = ia.l.a(g(i10), r(i10));
        }
        return ra.b.a(hVarArr);
    }

    public final a m() {
        a aVar = new a();
        s.s(aVar.e(), this.f23937a);
        return aVar;
    }

    public final String r(int i10) {
        return this.f23937a[(i10 * 2) + 1];
    }

    public final List<String> s(String str) {
        k.e(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (n.l(str, g(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(r(i10));
            }
        }
        if (arrayList == null) {
            return ja.n.f();
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        k.d(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int size() {
        return this.f23937a.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String g10 = g(i10);
            String r10 = r(i10);
            sb2.append(g10);
            sb2.append(": ");
            if (vb.b.D(g10)) {
                r10 = "██";
            }
            sb2.append(r10);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        k.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public v(String[] strArr, g gVar) {
        this(strArr);
    }
}
