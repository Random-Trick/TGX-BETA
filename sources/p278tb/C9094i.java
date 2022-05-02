package p278tb;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import qa.C8294g;
import qa.C8298k;
import za.C11451n;

public final class C9094i {
    public static final C9094i f29161A;
    public static final C9094i f29162A0;
    public static final C9094i f29163B;
    public static final C9094i f29164B0;
    public static final C9094i f29165C;
    public static final C9094i f29166C0;
    public static final C9094i f29167D;
    public static final C9094i f29168D0;
    public static final C9094i f29169E;
    public static final C9094i f29170E0;
    public static final C9094i f29171F;
    public static final C9094i f29172F0;
    public static final C9094i f29173G;
    public static final C9094i f29174G0;
    public static final C9094i f29175H;
    public static final C9094i f29176H0;
    public static final C9094i f29177I;
    public static final C9094i f29178I0;
    public static final C9094i f29179J;
    public static final C9094i f29180J0;
    public static final C9094i f29181K;
    public static final C9094i f29182K0;
    public static final C9094i f29183L;
    public static final C9094i f29184L0;
    public static final C9094i f29185M;
    public static final C9094i f29186M0;
    public static final C9094i f29187N;
    public static final C9094i f29188N0;
    public static final C9094i f29189O;
    public static final C9094i f29190O0;
    public static final C9094i f29191P;
    public static final C9094i f29192P0;
    public static final C9094i f29193Q;
    public static final C9094i f29194Q0;
    public static final C9094i f29195R;
    public static final C9094i f29196R0;
    public static final C9094i f29197S;
    public static final C9094i f29198S0;
    public static final C9094i f29199T;
    public static final C9094i f29200T0;
    public static final C9094i f29201U;
    public static final C9094i f29202U0;
    public static final C9094i f29203V;
    public static final C9094i f29204V0;
    public static final C9094i f29205W;
    public static final C9094i f29206W0;
    public static final C9094i f29207X;
    public static final C9094i f29208X0;
    public static final C9094i f29209Y;
    public static final C9094i f29210Y0;
    public static final C9094i f29211Z;
    public static final C9094i f29212Z0;
    public static final C9094i f29213a0;
    public static final C9094i f29214a1;
    public static final C9094i f29216b0;
    public static final C9094i f29217b1;
    public static final C9094i f29219c0;
    public static final C9094i f29220c1;
    public static final C9094i f29221d;
    public static final C9094i f29222d0;
    public static final C9094i f29223d1;
    public static final C9094i f29224e;
    public static final C9094i f29225e0;
    public static final C9094i f29226e1;
    public static final C9094i f29227f;
    public static final C9094i f29228f0;
    public static final C9094i f29229f1;
    public static final C9094i f29230g;
    public static final C9094i f29231g0;
    public static final C9094i f29232g1;
    public static final C9094i f29233h;
    public static final C9094i f29234h0;
    public static final C9094i f29235h1;
    public static final C9094i f29236i;
    public static final C9094i f29237i0;
    public static final C9094i f29238i1;
    public static final C9094i f29239j;
    public static final C9094i f29240j0;
    public static final C9094i f29241j1;
    public static final C9094i f29242k;
    public static final C9094i f29243k0;
    public static final C9094i f29244k1;
    public static final C9094i f29245l;
    public static final C9094i f29246l0;
    public static final C9094i f29247l1;
    public static final C9094i f29248m;
    public static final C9094i f29249m0;
    public static final C9094i f29250m1;
    public static final C9094i f29251n;
    public static final C9094i f29252n0;
    public static final C9094i f29253n1;
    public static final C9094i f29254o;
    public static final C9094i f29255o0;
    public static final C9094i f29256o1;
    public static final C9094i f29257p;
    public static final C9094i f29258p0;
    public static final C9094i f29259p1;
    public static final C9094i f29260q;
    public static final C9094i f29261q0;
    public static final C9094i f29262q1;
    public static final C9094i f29263r;
    public static final C9094i f29264r0;
    public static final C9094i f29265r1;
    public static final C9094i f29266s;
    public static final C9094i f29267s0;
    public static final C9096b f29268s1;
    public static final C9094i f29269t;
    public static final C9094i f29270t0;
    public static final C9094i f29271u;
    public static final C9094i f29272u0;
    public static final C9094i f29273v;
    public static final C9094i f29274v0;
    public static final C9094i f29275w;
    public static final C9094i f29276w0;
    public static final C9094i f29277x;
    public static final C9094i f29278x0;
    public static final C9094i f29279y;
    public static final C9094i f29280y0;
    public static final C9094i f29281z;
    public static final C9094i f29282z0;
    public final String f29283a;
    public static final Comparator<String> f29215b = new C9095a();
    public static final Map<String, C9094i> f29218c = new LinkedHashMap();

    public static final class C9095a implements Comparator<String> {
        public int compare(String str, String str2) {
            C8298k.m12933e(str, "a");
            C8298k.m12933e(str2, "b");
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return C8298k.m12932f(charAt, charAt2) < 0 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    public static final class C9096b {
        public C9096b() {
        }

        public final synchronized C9094i m10457b(String str) {
            C9094i iVar;
            C8298k.m12933e(str, "javaName");
            iVar = (C9094i) C9094i.f29218c.get(str);
            if (iVar == null) {
                iVar = (C9094i) C9094i.f29218c.get(m10454e(str));
                if (iVar == null) {
                    iVar = new C9094i(str, null);
                }
                C9094i.f29218c.put(str, iVar);
            }
            return iVar;
        }

        public final Comparator<String> m10456c() {
            return C9094i.f29215b;
        }

        public final C9094i m10455d(String str, int i) {
            C9094i iVar = new C9094i(str, null);
            C9094i.f29218c.put(str, iVar);
            return iVar;
        }

        public final String m10454e(String str) {
            if (C11451n.m621x(str, "TLS_", false, 2, null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SSL_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(4);
                C8298k.m12934d(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                return sb2.toString();
            } else if (!C11451n.m621x(str, "SSL_", false, 2, null)) {
                return str;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("TLS_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring2 = str.substring(4);
                C8298k.m12934d(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                return sb3.toString();
            }
        }

        public C9096b(C8294g gVar) {
            this();
        }
    }

    static {
        C9096b bVar = new C9096b(null);
        f29268s1 = bVar;
        f29221d = bVar.m10455d("SSL_RSA_WITH_NULL_MD5", 1);
        f29224e = bVar.m10455d("SSL_RSA_WITH_NULL_SHA", 2);
        f29227f = bVar.m10455d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        f29230g = bVar.m10455d("SSL_RSA_WITH_RC4_128_MD5", 4);
        f29233h = bVar.m10455d("SSL_RSA_WITH_RC4_128_SHA", 5);
        f29236i = bVar.m10455d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        f29239j = bVar.m10455d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f29242k = bVar.m10455d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        f29245l = bVar.m10455d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        f29248m = bVar.m10455d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        f29251n = bVar.m10455d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        f29254o = bVar.m10455d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        f29257p = bVar.m10455d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        f29260q = bVar.m10455d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        f29263r = bVar.m10455d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        f29266s = bVar.m10455d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        f29269t = bVar.m10455d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        f29271u = bVar.m10455d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        f29273v = bVar.m10455d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        f29275w = bVar.m10455d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        f29277x = bVar.m10455d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        f29279y = bVar.m10455d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        f29281z = bVar.m10455d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        f29161A = bVar.m10455d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        f29163B = bVar.m10455d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        f29165C = bVar.m10455d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        f29167D = bVar.m10455d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        f29169E = bVar.m10455d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        f29171F = bVar.m10455d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f29173G = bVar.m10455d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        f29175H = bVar.m10455d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        f29177I = bVar.m10455d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        f29179J = bVar.m10455d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f29181K = bVar.m10455d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        f29183L = bVar.m10455d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        f29185M = bVar.m10455d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        f29187N = bVar.m10455d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        f29189O = bVar.m10455d("TLS_RSA_WITH_NULL_SHA256", 59);
        f29191P = bVar.m10455d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        f29193Q = bVar.m10455d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        f29195R = bVar.m10455d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        f29197S = bVar.m10455d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        f29199T = bVar.m10455d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        f29201U = bVar.m10455d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        f29203V = bVar.m10455d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        f29205W = bVar.m10455d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        f29207X = bVar.m10455d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        f29209Y = bVar.m10455d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        f29211Z = bVar.m10455d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        f29213a0 = bVar.m10455d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        f29216b0 = bVar.m10455d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        f29219c0 = bVar.m10455d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        f29222d0 = bVar.m10455d("TLS_PSK_WITH_RC4_128_SHA", 138);
        f29225e0 = bVar.m10455d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        f29228f0 = bVar.m10455d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        f29231g0 = bVar.m10455d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        f29234h0 = bVar.m10455d("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f29237i0 = bVar.m10455d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f29240j0 = bVar.m10455d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        f29243k0 = bVar.m10455d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        f29246l0 = bVar.m10455d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        f29249m0 = bVar.m10455d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        f29252n0 = bVar.m10455d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        f29255o0 = bVar.m10455d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        f29258p0 = bVar.m10455d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        f29261q0 = bVar.m10455d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        f29264r0 = bVar.m10455d("TLS_FALLBACK_SCSV", 22016);
        f29267s0 = bVar.m10455d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        f29270t0 = bVar.m10455d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        f29272u0 = bVar.m10455d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        f29274v0 = bVar.m10455d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        f29276w0 = bVar.m10455d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        f29278x0 = bVar.m10455d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        f29280y0 = bVar.m10455d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        f29282z0 = bVar.m10455d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        f29162A0 = bVar.m10455d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        f29164B0 = bVar.m10455d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        f29166C0 = bVar.m10455d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        f29168D0 = bVar.m10455d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        f29170E0 = bVar.m10455d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        f29172F0 = bVar.m10455d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        f29174G0 = bVar.m10455d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        f29176H0 = bVar.m10455d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        f29178I0 = bVar.m10455d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        f29180J0 = bVar.m10455d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f29182K0 = bVar.m10455d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f29184L0 = bVar.m10455d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        f29186M0 = bVar.m10455d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        f29188N0 = bVar.m10455d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        f29190O0 = bVar.m10455d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        f29192P0 = bVar.m10455d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        f29194Q0 = bVar.m10455d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        f29196R0 = bVar.m10455d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        f29198S0 = bVar.m10455d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        f29200T0 = bVar.m10455d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        f29202U0 = bVar.m10455d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        f29204V0 = bVar.m10455d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        f29206W0 = bVar.m10455d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        f29208X0 = bVar.m10455d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        f29210Y0 = bVar.m10455d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f29212Z0 = bVar.m10455d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f29214a1 = bVar.m10455d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        f29217b1 = bVar.m10455d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        f29220c1 = bVar.m10455d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f29223d1 = bVar.m10455d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f29226e1 = bVar.m10455d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        f29229f1 = bVar.m10455d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        f29232g1 = bVar.m10455d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        f29235h1 = bVar.m10455d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        f29238i1 = bVar.m10455d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f29241j1 = bVar.m10455d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f29244k1 = bVar.m10455d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        f29247l1 = bVar.m10455d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        f29250m1 = bVar.m10455d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f29253n1 = bVar.m10455d("TLS_AES_128_GCM_SHA256", 4865);
        f29256o1 = bVar.m10455d("TLS_AES_256_GCM_SHA384", 4866);
        f29259p1 = bVar.m10455d("TLS_CHACHA20_POLY1305_SHA256", 4867);
        f29262q1 = bVar.m10455d("TLS_AES_128_CCM_SHA256", 4868);
        f29265r1 = bVar.m10455d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public C9094i(String str) {
        this.f29283a = str;
    }

    public final String m10460c() {
        return this.f29283a;
    }

    public String toString() {
        return this.f29283a;
    }

    public C9094i(String str, C8294g gVar) {
        this(str);
    }
}
