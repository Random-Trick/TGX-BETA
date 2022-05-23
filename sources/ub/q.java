package ub;

import hc.h;
import java.nio.charset.Charset;
import ra.k;

public final class q {
    public static final q f23917a = new q();

    public static final String a(String str, String str2, Charset charset) {
        k.e(str, "username");
        k.e(str2, "password");
        k.e(charset, "charset");
        String a10 = h.N.b(str + ':' + str2, charset).a();
        return "Basic " + a10;
    }
}
