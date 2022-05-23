package ub;

import ab.n;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import ra.g;
import ra.k;

public final class i {
    public static final i A;
    public static final i A0;
    public static final i B;
    public static final i B0;
    public static final i C;
    public static final i C0;
    public static final i D;
    public static final i D0;
    public static final i E;
    public static final i E0;
    public static final i F;
    public static final i F0;
    public static final i G;
    public static final i G0;
    public static final i H;
    public static final i H0;
    public static final i I;
    public static final i I0;
    public static final i J;
    public static final i J0;
    public static final i K;
    public static final i K0;
    public static final i L;
    public static final i L0;
    public static final i M;
    public static final i M0;
    public static final i N;
    public static final i N0;
    public static final i O;
    public static final i O0;
    public static final i P;
    public static final i P0;
    public static final i Q;
    public static final i Q0;
    public static final i R;
    public static final i R0;
    public static final i S;
    public static final i S0;
    public static final i T;
    public static final i T0;
    public static final i U;
    public static final i U0;
    public static final i V;
    public static final i V0;
    public static final i W;
    public static final i W0;
    public static final i X;
    public static final i X0;
    public static final i Y;
    public static final i Y0;
    public static final i Z;
    public static final i Z0;
    public static final i f23814a0;
    public static final i f23815a1;
    public static final i f23817b0;
    public static final i f23818b1;
    public static final i f23820c0;
    public static final i f23821c1;
    public static final i f23822d;
    public static final i f23823d0;
    public static final i f23824d1;
    public static final i f23825e;
    public static final i f23826e0;
    public static final i f23827e1;
    public static final i f23828f;
    public static final i f23829f0;
    public static final i f23830f1;
    public static final i f23831g;
    public static final i f23832g0;
    public static final i f23833g1;
    public static final i f23834h;
    public static final i f23835h0;
    public static final i f23836h1;
    public static final i f23837i;
    public static final i f23838i0;
    public static final i f23839i1;
    public static final i f23840j;
    public static final i f23841j0;
    public static final i f23842j1;
    public static final i f23843k;
    public static final i f23844k0;
    public static final i f23845k1;
    public static final i f23846l;
    public static final i f23847l0;
    public static final i f23848l1;
    public static final i f23849m;
    public static final i f23850m0;
    public static final i f23851m1;
    public static final i f23852n;
    public static final i f23853n0;
    public static final i f23854n1;
    public static final i f23855o;
    public static final i f23856o0;
    public static final i f23857o1;
    public static final i f23858p;
    public static final i f23859p0;
    public static final i f23860p1;
    public static final i f23861q;
    public static final i f23862q0;
    public static final i f23863q1;
    public static final i f23864r;
    public static final i f23865r0;
    public static final i f23866r1;
    public static final i f23867s;
    public static final i f23868s0;
    public static final b f23869s1;
    public static final i f23870t;
    public static final i f23871t0;
    public static final i f23872u;
    public static final i f23873u0;
    public static final i f23874v;
    public static final i f23875v0;
    public static final i f23876w;
    public static final i f23877w0;
    public static final i f23878x;
    public static final i f23879x0;
    public static final i f23880y;
    public static final i f23881y0;
    public static final i f23882z;
    public static final i f23883z0;
    public final String f23884a;
    public static final Comparator<String> f23816b = new a();
    public static final Map<String, i> f23819c = new LinkedHashMap();

    public static final class a implements Comparator<String> {
        public int compare(String str, String str2) {
            k.e(str, "a");
            k.e(str2, "b");
            int min = Math.min(str.length(), str2.length());
            for (int i10 = 4; i10 < min; i10++) {
                char charAt = str.charAt(i10);
                char charAt2 = str2.charAt(i10);
                if (charAt != charAt2) {
                    return k.f(charAt, charAt2) < 0 ? -1 : 1;
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

    public static final class b {
        public b() {
        }

        public b(g gVar) {
            this();
        }

        public final synchronized i b(String str) {
            i iVar;
            k.e(str, "javaName");
            iVar = (i) i.f23819c.get(str);
            if (iVar == null) {
                iVar = (i) i.f23819c.get(e(str));
                if (iVar == null) {
                    iVar = new i(str, null);
                }
                i.f23819c.put(str, iVar);
            }
            return iVar;
        }

        public final Comparator<String> c() {
            return i.f23816b;
        }

        public final i d(String str, int i10) {
            i iVar = new i(str, null);
            i.f23819c.put(str, iVar);
            return iVar;
        }

        public final String e(String str) {
            if (n.x(str, "TLS_", false, 2, null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SSL_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(4);
                k.d(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                return sb2.toString();
            } else if (!n.x(str, "SSL_", false, 2, null)) {
                return str;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("TLS_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring2 = str.substring(4);
                k.d(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                return sb3.toString();
            }
        }
    }

    static {
        b bVar = new b(null);
        f23869s1 = bVar;
        f23822d = bVar.d("SSL_RSA_WITH_NULL_MD5", 1);
        f23825e = bVar.d("SSL_RSA_WITH_NULL_SHA", 2);
        f23828f = bVar.d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        f23831g = bVar.d("SSL_RSA_WITH_RC4_128_MD5", 4);
        f23834h = bVar.d("SSL_RSA_WITH_RC4_128_SHA", 5);
        f23837i = bVar.d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        f23840j = bVar.d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f23843k = bVar.d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        f23846l = bVar.d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        f23849m = bVar.d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        f23852n = bVar.d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        f23855o = bVar.d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        f23858p = bVar.d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        f23861q = bVar.d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        f23864r = bVar.d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        f23867s = bVar.d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        f23870t = bVar.d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        f23872u = bVar.d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        f23874v = bVar.d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        f23876w = bVar.d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        f23878x = bVar.d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        f23880y = bVar.d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        f23882z = bVar.d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        A = bVar.d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        B = bVar.d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        C = bVar.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        D = bVar.d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        E = bVar.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        F = bVar.d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        G = bVar.d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        H = bVar.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        I = bVar.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        J = bVar.d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        K = bVar.d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        L = bVar.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        M = bVar.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        N = bVar.d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        O = bVar.d("TLS_RSA_WITH_NULL_SHA256", 59);
        P = bVar.d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        Q = bVar.d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        R = bVar.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        S = bVar.d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        T = bVar.d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        U = bVar.d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        V = bVar.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        W = bVar.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        X = bVar.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        Y = bVar.d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        Z = bVar.d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        f23814a0 = bVar.d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        f23817b0 = bVar.d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        f23820c0 = bVar.d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        f23823d0 = bVar.d("TLS_PSK_WITH_RC4_128_SHA", 138);
        f23826e0 = bVar.d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        f23829f0 = bVar.d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        f23832g0 = bVar.d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        f23835h0 = bVar.d("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f23838i0 = bVar.d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f23841j0 = bVar.d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        f23844k0 = bVar.d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        f23847l0 = bVar.d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        f23850m0 = bVar.d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        f23853n0 = bVar.d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        f23856o0 = bVar.d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        f23859p0 = bVar.d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        f23862q0 = bVar.d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        f23865r0 = bVar.d("TLS_FALLBACK_SCSV", 22016);
        f23868s0 = bVar.d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        f23871t0 = bVar.d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        f23873u0 = bVar.d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        f23875v0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        f23877w0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        f23879x0 = bVar.d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        f23881y0 = bVar.d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        f23883z0 = bVar.d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        A0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        B0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        C0 = bVar.d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        D0 = bVar.d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        E0 = bVar.d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        F0 = bVar.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        G0 = bVar.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        H0 = bVar.d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        I0 = bVar.d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        J0 = bVar.d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        K0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        L0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        M0 = bVar.d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        N0 = bVar.d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        O0 = bVar.d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        P0 = bVar.d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        Q0 = bVar.d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        R0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        S0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        T0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        U0 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        V0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        W0 = bVar.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        X0 = bVar.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        Y0 = bVar.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        Z0 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f23815a1 = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        f23818b1 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        f23821c1 = bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f23824d1 = bVar.d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f23827e1 = bVar.d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        f23830f1 = bVar.d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        f23833g1 = bVar.d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        f23836h1 = bVar.d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        f23839i1 = bVar.d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f23842j1 = bVar.d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f23845k1 = bVar.d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        f23848l1 = bVar.d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        f23851m1 = bVar.d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f23854n1 = bVar.d("TLS_AES_128_GCM_SHA256", 4865);
        f23857o1 = bVar.d("TLS_AES_256_GCM_SHA384", 4866);
        f23860p1 = bVar.d("TLS_CHACHA20_POLY1305_SHA256", 4867);
        f23863q1 = bVar.d("TLS_AES_128_CCM_SHA256", 4868);
        f23866r1 = bVar.d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public i(String str) {
        this.f23884a = str;
    }

    public final String c() {
        return this.f23884a;
    }

    public String toString() {
        return this.f23884a;
    }

    public i(String str, g gVar) {
        this(str);
    }
}
