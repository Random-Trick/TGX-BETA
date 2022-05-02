package za;

import java.util.ArrayList;
import java.util.List;
import p039d.C3563j;
import p123ia.C5304n;
import p123ia.C5312v;
import pa.AbstractC8088l;
import qa.AbstractC8299l;
import qa.C8298k;

public class C11442g extends C11441f {

    public static final class C11443a extends AbstractC8299l implements AbstractC8088l<String, String> {
        public static final C11443a f36414b = new C11443a();

        public C11443a() {
            super(1);
        }

        public final String mo568a(String str) {
            C8298k.m12934e(str, "line");
            return str;
        }
    }

    public static final class C11444b extends AbstractC8299l implements AbstractC8088l<String, String> {
        public final String f36415b;

        public C11444b(String str) {
            super(1);
            this.f36415b = str;
        }

        public final String mo568a(String str) {
            C8298k.m12934e(str, "line");
            return C8298k.m12929j(this.f36415b, str);
        }
    }

    public static final AbstractC8088l<String, String> m645b(String str) {
        return str.length() == 0 ? C11443a.f36414b : new C11444b(str);
    }

    public static final String m644c(String str, String str2, String str3) {
        int i;
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(str2, "newIndent");
        C8298k.m12934e(str3, "marginPrefix");
        if (!C11451n.m632m(str3)) {
            List<String> V = C11452o.m599V(str);
            int length = str.length() + (str2.length() * V.size());
            AbstractC8088l<String, String> b = m645b(str2);
            int g = C5304n.m23365g(V);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : V) {
                i2++;
                if (i2 < 0) {
                    C5304n.m23358n();
                }
                String str4 = (String) obj;
                String str5 = null;
                if ((i2 == 0 || i2 == g) && C11451n.m632m(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            i = -1;
                            break;
                        }
                        i3++;
                        if (!C11434a.m659c(str4.charAt(i3))) {
                            i = i3;
                            break;
                        }
                    }
                    if (i != -1) {
                        int i4 = i;
                        if (C11451n.m622w(str4, str3, i, false, 4, null)) {
                            str5 = str4.substring(i4 + str3.length());
                            C8298k.m12935d(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (str5 != null) {
                        str4 = b.mo568a(str5);
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            String sb2 = ((StringBuilder) C5312v.m23342F(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, C3563j.f11977P0, null)).toString();
            C8298k.m12935d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static final String m643d(String str, String str2) {
        C8298k.m12934e(str, "<this>");
        C8298k.m12934e(str2, "marginPrefix");
        return m644c(str, "", str2);
    }

    public static String m642e(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m643d(str, str2);
    }
}
