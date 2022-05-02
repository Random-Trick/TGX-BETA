package p278tb;

import java.io.IOException;
import qa.C8294g;
import qa.C8298k;

public enum EnumC9064a0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final C9065a f29056R = new C9065a(null);
    public final String f29059a;

    public static final class C9065a {
        public C9065a() {
        }

        public final EnumC9064a0 m10568a(String str) {
            C8298k.m12934e(str, "protocol");
            EnumC9064a0 a0Var = EnumC9064a0.HTTP_1_0;
            if (!C8298k.m12937b(str, a0Var.f29059a)) {
                a0Var = EnumC9064a0.HTTP_1_1;
                if (!C8298k.m12937b(str, a0Var.f29059a)) {
                    a0Var = EnumC9064a0.H2_PRIOR_KNOWLEDGE;
                    if (!C8298k.m12937b(str, a0Var.f29059a)) {
                        a0Var = EnumC9064a0.HTTP_2;
                        if (!C8298k.m12937b(str, a0Var.f29059a)) {
                            a0Var = EnumC9064a0.SPDY_3;
                            if (!C8298k.m12937b(str, a0Var.f29059a)) {
                                a0Var = EnumC9064a0.QUIC;
                                if (!C8298k.m12937b(str, a0Var.f29059a)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return a0Var;
        }

        public C9065a(C8294g gVar) {
            this();
        }
    }

    EnumC9064a0(String str) {
        this.f29059a = str;
    }

    @Override
    public String toString() {
        return this.f29059a;
    }
}
