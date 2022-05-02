package p354z2;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p018b3.AbstractC1148f;
import p339y2.C10352b;

public final class C11229a implements AbstractC1148f {
    public static final String f35946c;
    public static final String f35947d;
    public static final String f35948e;
    public static final Set<C10352b> f35949f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C10352b.m5368b("proto"), C10352b.m5368b("json"))));
    public static final C11229a f35950g;
    public static final C11229a f35951h;
    public final String f35952a;
    public final String f35953b;

    static {
        String a = C11235e.m1162a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f35946c = a;
        String a2 = C11235e.m1162a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f35947d = a2;
        String a3 = C11235e.m1162a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f35948e = a3;
        f35950g = new C11229a(a, null);
        f35951h = new C11229a(a2, a3);
    }

    public C11229a(String str, String str2) {
        this.f35952a = str;
        this.f35953b = str2;
    }

    public static C11229a m1181e(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C11229a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override
    public Set<C10352b> mo1185a() {
        return f35949f;
    }

    @Override
    public String mo1184b() {
        return "cct";
    }

    @Override
    public byte[] mo1183c() {
        return m1182d();
    }

    public byte[] m1182d() {
        String str = this.f35953b;
        if (str == null && this.f35952a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f35952a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String m1180f() {
        return this.f35953b;
    }

    public String m1179g() {
        return this.f35952a;
    }
}
