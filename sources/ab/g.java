package ab;

import d.j;
import ja.n;
import ja.v;
import java.util.ArrayList;
import java.util.List;
import ra.k;
import ra.l;

public class g extends f {

    public static final class a extends l implements qa.l<String, String> {
        public static final a f710b = new a();

        public a() {
            super(1);
        }

        public final String a(String str) {
            k.e(str, "line");
            return str;
        }
    }

    public static final class b extends l implements qa.l<String, String> {
        public final String f711b;

        public b(String str) {
            super(1);
            this.f711b = str;
        }

        public final String a(String str) {
            k.e(str, "line");
            return this.f711b + str;
        }
    }

    public static final qa.l<String, String> b(String str) {
        return str.length() == 0 ? a.f710b : new b(str);
    }

    public static final String c(String str, String str2, String str3) {
        int i10;
        String a10;
        k.e(str, "<this>");
        k.e(str2, "newIndent");
        k.e(str3, "marginPrefix");
        if (!n.m(str3)) {
            List<String> V = o.V(str);
            int length = str.length() + (str2.length() * V.size());
            qa.l<String, String> b10 = b(str2);
            int g10 = n.g(V);
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (Object obj : V) {
                i11++;
                if (i11 < 0) {
                    n.n();
                }
                String str4 = (String) obj;
                String str5 = null;
                if ((i11 == 0 || i11 == g10) && n.m(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length2) {
                            i10 = -1;
                            break;
                        } else if (!ab.a.c(str4.charAt(i12))) {
                            i10 = i12;
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (i10 != -1) {
                        int i13 = i10;
                        if (n.w(str4, str3, i10, false, 4, null)) {
                            str5 = str4.substring(i13 + str3.length());
                            k.d(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (!(str5 == null || (a10 = b10.a(str5)) == null)) {
                        str4 = a10;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            String sb2 = ((StringBuilder) v.F(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, j.P0, null)).toString();
            k.d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static final String d(String str, String str2) {
        k.e(str, "<this>");
        k.e(str2, "marginPrefix");
        return c(str, "", str2);
    }

    public static String e(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return d(str, str2);
    }
}
