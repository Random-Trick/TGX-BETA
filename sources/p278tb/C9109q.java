package p278tb;

import java.nio.charset.Charset;
import p095gc.C4552h;
import qa.C8298k;

public final class C9109q {
    public static final C9109q f29316a = new C9109q();

    public static final String m10418a(String str, String str2, Charset charset) {
        C8298k.m12933e(str, "username");
        C8298k.m12933e(str2, "password");
        C8298k.m12933e(charset, "charset");
        String a = C4552h.f14973N.m27402b(str + ':' + str2, charset).mo27317a();
        return "Basic " + a;
    }
}
