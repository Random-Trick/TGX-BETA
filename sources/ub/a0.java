package ub;

import java.io.IOException;
import ra.g;
import ra.k;

public enum a0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final a R = new a(null);
    public final String f23733a;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final a0 a(String str) {
            k.e(str, "protocol");
            a0 a0Var = a0.HTTP_1_0;
            if (!k.b(str, a0Var.f23733a)) {
                a0Var = a0.HTTP_1_1;
                if (!k.b(str, a0Var.f23733a)) {
                    a0Var = a0.H2_PRIOR_KNOWLEDGE;
                    if (!k.b(str, a0Var.f23733a)) {
                        a0Var = a0.HTTP_2;
                        if (!k.b(str, a0Var.f23733a)) {
                            a0Var = a0.SPDY_3;
                            if (!k.b(str, a0Var.f23733a)) {
                                a0Var = a0.QUIC;
                                if (!k.b(str, a0Var.f23733a)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return a0Var;
        }
    }

    a0(String str) {
        this.f23733a = str;
    }

    @Override
    public String toString() {
        return this.f23733a;
    }
}
