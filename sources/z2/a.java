package z2;

import b3.f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import y2.b;

public final class a implements f {
    public static final String f26817c;
    public static final String f26818d;
    public static final String f26819e;
    public static final Set<b> f26820f = Collections.unmodifiableSet(new HashSet(Arrays.asList(b.b("proto"), b.b("json"))));
    public static final a f26821g;
    public static final a f26822h;
    public final String f26823a;
    public final String f26824b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f26817c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f26818d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f26819e = a12;
        f26821g = new a(a10, null);
        f26822h = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f26823a = str;
        this.f26824b = str2;
    }

    public static a e(byte[] bArr) {
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
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override
    public Set<b> a() {
        return f26820f;
    }

    @Override
    public String b() {
        return "cct";
    }

    @Override
    public byte[] c() {
        return d();
    }

    public byte[] d() {
        String str = this.f26824b;
        if (str == null && this.f26823a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f26823a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String f() {
        return this.f26824b;
    }

    public String g() {
        return this.f26823a;
    }
}
