package p278tb;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import qa.C8294g;
import qa.C8298k;
import za.C11451n;

public final class C9094i {
    public static final C9094i f29158A;
    public static final C9094i f29159A0;
    public static final C9094i f29160B;
    public static final C9094i f29161B0;
    public static final C9094i f29162C;
    public static final C9094i f29163C0;
    public static final C9094i f29164D;
    public static final C9094i f29165D0;
    public static final C9094i f29166E;
    public static final C9094i f29167E0;
    public static final C9094i f29168F;
    public static final C9094i f29169F0;
    public static final C9094i f29170G;
    public static final C9094i f29171G0;
    public static final C9094i f29172H;
    public static final C9094i f29173H0;
    public static final C9094i f29174I;
    public static final C9094i f29175I0;
    public static final C9094i f29176J;
    public static final C9094i f29177J0;
    public static final C9094i f29178K;
    public static final C9094i f29179K0;
    public static final C9094i f29180L;
    public static final C9094i f29181L0;
    public static final C9094i f29182M;
    public static final C9094i f29183M0;
    public static final C9094i f29184N;
    public static final C9094i f29185N0;
    public static final C9094i f29186O;
    public static final C9094i f29187O0;
    public static final C9094i f29188P;
    public static final C9094i f29189P0;
    public static final C9094i f29190Q;
    public static final C9094i f29191Q0;
    public static final C9094i f29192R;
    public static final C9094i f29193R0;
    public static final C9094i f29194S;
    public static final C9094i f29195S0;
    public static final C9094i f29196T;
    public static final C9094i f29197T0;
    public static final C9094i f29198U;
    public static final C9094i f29199U0;
    public static final C9094i f29200V;
    public static final C9094i f29201V0;
    public static final C9094i f29202W;
    public static final C9094i f29203W0;
    public static final C9094i f29204X;
    public static final C9094i f29205X0;
    public static final C9094i f29206Y;
    public static final C9094i f29207Y0;
    public static final C9094i f29208Z;
    public static final C9094i f29209Z0;
    public static final C9094i f29210a0;
    public static final C9094i f29211a1;
    public static final C9094i f29213b0;
    public static final C9094i f29214b1;
    public static final C9094i f29216c0;
    public static final C9094i f29217c1;
    public static final C9094i f29218d;
    public static final C9094i f29219d0;
    public static final C9094i f29220d1;
    public static final C9094i f29221e;
    public static final C9094i f29222e0;
    public static final C9094i f29223e1;
    public static final C9094i f29224f;
    public static final C9094i f29225f0;
    public static final C9094i f29226f1;
    public static final C9094i f29227g;
    public static final C9094i f29228g0;
    public static final C9094i f29229g1;
    public static final C9094i f29230h;
    public static final C9094i f29231h0;
    public static final C9094i f29232h1;
    public static final C9094i f29233i;
    public static final C9094i f29234i0;
    public static final C9094i f29235i1;
    public static final C9094i f29236j;
    public static final C9094i f29237j0;
    public static final C9094i f29238j1;
    public static final C9094i f29239k;
    public static final C9094i f29240k0;
    public static final C9094i f29241k1;
    public static final C9094i f29242l;
    public static final C9094i f29243l0;
    public static final C9094i f29244l1;
    public static final C9094i f29245m;
    public static final C9094i f29246m0;
    public static final C9094i f29247m1;
    public static final C9094i f29248n;
    public static final C9094i f29249n0;
    public static final C9094i f29250n1;
    public static final C9094i f29251o;
    public static final C9094i f29252o0;
    public static final C9094i f29253o1;
    public static final C9094i f29254p;
    public static final C9094i f29255p0;
    public static final C9094i f29256p1;
    public static final C9094i f29257q;
    public static final C9094i f29258q0;
    public static final C9094i f29259q1;
    public static final C9094i f29260r;
    public static final C9094i f29261r0;
    public static final C9094i f29262r1;
    public static final C9094i f29263s;
    public static final C9094i f29264s0;
    public static final C9096b f29265s1;
    public static final C9094i f29266t;
    public static final C9094i f29267t0;
    public static final C9094i f29268u;
    public static final C9094i f29269u0;
    public static final C9094i f29270v;
    public static final C9094i f29271v0;
    public static final C9094i f29272w;
    public static final C9094i f29273w0;
    public static final C9094i f29274x;
    public static final C9094i f29275x0;
    public static final C9094i f29276y;
    public static final C9094i f29277y0;
    public static final C9094i f29278z;
    public static final C9094i f29279z0;
    public final String f29280a;
    public static final Comparator<String> f29212b = new C9095a();
    public static final Map<String, C9094i> f29215c = new LinkedHashMap();

    public static final class C9095a implements Comparator<String> {
        public int compare(String str, String str2) {
            C8298k.m12934e(str, "a");
            C8298k.m12934e(str2, "b");
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return C8298k.m12933f(charAt, charAt2) < 0 ? -1 : 1;
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

        public final synchronized C9094i m10458b(String str) {
            C9094i iVar;
            C8298k.m12934e(str, "javaName");
            iVar = (C9094i) C9094i.f29215c.get(str);
            if (iVar == null) {
                iVar = (C9094i) C9094i.f29215c.get(m10455e(str));
                if (iVar == null) {
                    iVar = new C9094i(str, null);
                }
                C9094i.f29215c.put(str, iVar);
            }
            return iVar;
        }

        public final Comparator<String> m10457c() {
            return C9094i.f29212b;
        }

        public final C9094i m10456d(String str, int i) {
            C9094i iVar = new C9094i(str, null);
            C9094i.f29215c.put(str, iVar);
            return iVar;
        }

        public final String m10455e(String str) {
            if (C11451n.m621x(str, "TLS_", false, 2, null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SSL_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(4);
                C8298k.m12935d(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                return sb2.toString();
            } else if (!C11451n.m621x(str, "SSL_", false, 2, null)) {
                return str;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("TLS_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring2 = str.substring(4);
                C8298k.m12935d(substring2, "(this as java.lang.String).substring(startIndex)");
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
        f29265s1 = bVar;
        f29218d = bVar.m10456d("SSL_RSA_WITH_NULL_MD5", 1);
        f29221e = bVar.m10456d("SSL_RSA_WITH_NULL_SHA", 2);
        f29224f = bVar.m10456d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        f29227g = bVar.m10456d("SSL_RSA_WITH_RC4_128_MD5", 4);
        f29230h = bVar.m10456d("SSL_RSA_WITH_RC4_128_SHA", 5);
        f29233i = bVar.m10456d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        f29236j = bVar.m10456d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f29239k = bVar.m10456d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        f29242l = bVar.m10456d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        f29245m = bVar.m10456d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        f29248n = bVar.m10456d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        f29251o = bVar.m10456d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        f29254p = bVar.m10456d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        f29257q = bVar.m10456d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        f29260r = bVar.m10456d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        f29263s = bVar.m10456d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        f29266t = bVar.m10456d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        f29268u = bVar.m10456d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        f29270v = bVar.m10456d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        f29272w = bVar.m10456d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        f29274x = bVar.m10456d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        f29276y = bVar.m10456d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        f29278z = bVar.m10456d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        f29158A = bVar.m10456d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        f29160B = bVar.m10456d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        f29162C = bVar.m10456d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        f29164D = bVar.m10456d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        f29166E = bVar.m10456d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        f29168F = bVar.m10456d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f29170G = bVar.m10456d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        f29172H = bVar.m10456d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        f29174I = bVar.m10456d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        f29176J = bVar.m10456d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f29178K = bVar.m10456d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        f29180L = bVar.m10456d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        f29182M = bVar.m10456d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        f29184N = bVar.m10456d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        f29186O = bVar.m10456d("TLS_RSA_WITH_NULL_SHA256", 59);
        f29188P = bVar.m10456d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        f29190Q = bVar.m10456d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        f29192R = bVar.m10456d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        f29194S = bVar.m10456d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        f29196T = bVar.m10456d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        f29198U = bVar.m10456d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        f29200V = bVar.m10456d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        f29202W = bVar.m10456d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        f29204X = bVar.m10456d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        f29206Y = bVar.m10456d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        f29208Z = bVar.m10456d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        f29210a0 = bVar.m10456d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        f29213b0 = bVar.m10456d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        f29216c0 = bVar.m10456d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        f29219d0 = bVar.m10456d("TLS_PSK_WITH_RC4_128_SHA", 138);
        f29222e0 = bVar.m10456d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        f29225f0 = bVar.m10456d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        f29228g0 = bVar.m10456d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        f29231h0 = bVar.m10456d("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f29234i0 = bVar.m10456d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f29237j0 = bVar.m10456d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        f29240k0 = bVar.m10456d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        f29243l0 = bVar.m10456d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        f29246m0 = bVar.m10456d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        f29249n0 = bVar.m10456d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        f29252o0 = bVar.m10456d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        f29255p0 = bVar.m10456d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        f29258q0 = bVar.m10456d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        f29261r0 = bVar.m10456d("TLS_FALLBACK_SCSV", 22016);
        f29264s0 = bVar.m10456d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        f29267t0 = bVar.m10456d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        f29269u0 = bVar.m10456d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        f29271v0 = bVar.m10456d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        f29273w0 = bVar.m10456d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        f29275x0 = bVar.m10456d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        f29277y0 = bVar.m10456d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        f29279z0 = bVar.m10456d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        f29159A0 = bVar.m10456d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        f29161B0 = bVar.m10456d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        f29163C0 = bVar.m10456d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        f29165D0 = bVar.m10456d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        f29167E0 = bVar.m10456d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        f29169F0 = bVar.m10456d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        f29171G0 = bVar.m10456d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        f29173H0 = bVar.m10456d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        f29175I0 = bVar.m10456d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        f29177J0 = bVar.m10456d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f29179K0 = bVar.m10456d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f29181L0 = bVar.m10456d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        f29183M0 = bVar.m10456d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        f29185N0 = bVar.m10456d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        f29187O0 = bVar.m10456d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        f29189P0 = bVar.m10456d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        f29191Q0 = bVar.m10456d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        f29193R0 = bVar.m10456d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        f29195S0 = bVar.m10456d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        f29197T0 = bVar.m10456d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        f29199U0 = bVar.m10456d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        f29201V0 = bVar.m10456d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        f29203W0 = bVar.m10456d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        f29205X0 = bVar.m10456d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        f29207Y0 = bVar.m10456d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f29209Z0 = bVar.m10456d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f29211a1 = bVar.m10456d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        f29214b1 = bVar.m10456d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        f29217c1 = bVar.m10456d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f29220d1 = bVar.m10456d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f29223e1 = bVar.m10456d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        f29226f1 = bVar.m10456d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        f29229g1 = bVar.m10456d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        f29232h1 = bVar.m10456d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        f29235i1 = bVar.m10456d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f29238j1 = bVar.m10456d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f29241k1 = bVar.m10456d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        f29244l1 = bVar.m10456d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        f29247m1 = bVar.m10456d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f29250n1 = bVar.m10456d("TLS_AES_128_GCM_SHA256", 4865);
        f29253o1 = bVar.m10456d("TLS_AES_256_GCM_SHA384", 4866);
        f29256p1 = bVar.m10456d("TLS_CHACHA20_POLY1305_SHA256", 4867);
        f29259q1 = bVar.m10456d("TLS_AES_128_CCM_SHA256", 4868);
        f29262r1 = bVar.m10456d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public C9094i(String str) {
        this.f29280a = str;
    }

    public final String m10461c() {
        return this.f29280a;
    }

    public String toString() {
        return this.f29280a;
    }

    public C9094i(String str, C8294g gVar) {
        this(str);
    }
}
