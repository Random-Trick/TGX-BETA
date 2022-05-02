package p278tb;

import qa.C8294g;
import qa.C8298k;

public enum EnumC9091g0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public static final C9092a f29155Q = new C9092a(null);
    public final String f29158a;

    public static final class C9092a {
        public C9092a() {
        }

        public final EnumC9091g0 m10466a(String str) {
            C8298k.m12933e(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return EnumC9091g0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return EnumC9091g0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return EnumC9091g0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return EnumC9091g0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return EnumC9091g0.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }

        public C9092a(C8294g gVar) {
            this();
        }
    }

    EnumC9091g0(String str) {
        this.f29158a = str;
    }

    public final String m10467a() {
        return this.f29158a;
    }
}
