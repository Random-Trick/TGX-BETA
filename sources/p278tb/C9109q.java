package p278tb;

import java.nio.charset.Charset;
import p095gc.C4552h;
import qa.C8298k;

public final class C9109q {
    public static final C9109q f29313a = new C9109q();

    public static final String m10419a(String str, String str2, Charset charset) {
        C8298k.m12934e(str, "username");
        C8298k.m12934e(str2, "password");
        C8298k.m12934e(charset, "charset");
        String a = C4552h.f14973N.m27400b(str + ':' + str2, charset).mo27315a();
        return "Basic " + a;
    }
}
