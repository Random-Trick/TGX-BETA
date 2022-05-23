package ub;

import ra.g;
import ra.k;

public enum g0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public static final a Q = new a(null);
    public final String f23811a;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final g0 a(String str) {
            k.e(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return g0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return g0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return g0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return g0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return g0.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }

    g0(String str) {
        this.f23811a = str;
    }

    public final String a() {
        return this.f23811a;
    }
}
