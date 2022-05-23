package ub;

import ja.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import ra.g;
import ra.k;

public final class l {
    public static final i[] f23886e;
    public static final i[] f23887f;
    public static final l f23888g;
    public static final l f23889h;
    public static final l f23890i;
    public final boolean f23893a;
    public final boolean f23894b;
    public final String[] f23895c;
    public final String[] f23896d;
    public static final b f23892k = new b(null);
    public static final l f23891j = new a(false).a();

    public static final class a {
        public boolean f23897a;
        public String[] f23898b;
        public String[] f23899c;
        public boolean f23900d;

        public a(boolean z10) {
            this.f23897a = z10;
        }

        public final l a() {
            return new l(this.f23897a, this.f23900d, this.f23898b, this.f23899c);
        }

        public final a b(String... strArr) {
            k.e(strArr, "cipherSuites");
            if (this.f23897a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f23898b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(i... iVarArr) {
            k.e(iVarArr, "cipherSuites");
            if (this.f23897a) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (i iVar : iVarArr) {
                    arrayList.add(iVar.c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a d(boolean z10) {
            if (this.f23897a) {
                this.f23900d = z10;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a e(String... strArr) {
            k.e(strArr, "tlsVersions");
            if (this.f23897a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f23899c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a f(g0... g0VarArr) {
            k.e(g0VarArr, "tlsVersions");
            if (this.f23897a) {
                ArrayList arrayList = new ArrayList(g0VarArr.length);
                for (g0 g0Var : g0VarArr) {
                    arrayList.add(g0Var.a());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return e((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(l lVar) {
            k.e(lVar, "connectionSpec");
            this.f23897a = lVar.f();
            this.f23898b = lVar.f23895c;
            this.f23899c = lVar.f23896d;
            this.f23900d = lVar.h();
        }
    }

    public static final class b {
        public b() {
        }

        public b(g gVar) {
            this();
        }
    }

    static {
        i iVar = i.f23854n1;
        i iVar2 = i.f23857o1;
        i iVar3 = i.f23860p1;
        i iVar4 = i.Z0;
        i iVar5 = i.f23824d1;
        i iVar6 = i.f23815a1;
        i iVar7 = i.f23827e1;
        i iVar8 = i.f23845k1;
        i iVar9 = i.f23842j1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f23886e = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.K0, i.L0, i.f23838i0, i.f23841j0, i.G, i.K, i.f23843k};
        f23887f = iVarArr2;
        a c10 = new a(true).c((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        g0 g0Var = g0.TLS_1_3;
        g0 g0Var2 = g0.TLS_1_2;
        f23888g = c10.f(g0Var, g0Var2).d(true).a();
        f23889h = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).f(g0Var, g0Var2).d(true).a();
        f23890i = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).f(g0Var, g0Var2, g0.TLS_1_1, g0.TLS_1_0).d(true).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f23893a = z10;
        this.f23894b = z11;
        this.f23895c = strArr;
        this.f23896d = strArr2;
    }

    public final void c(SSLSocket sSLSocket, boolean z10) {
        k.e(sSLSocket, "sslSocket");
        l g10 = g(sSLSocket, z10);
        if (g10.i() != null) {
            sSLSocket.setEnabledProtocols(g10.f23896d);
        }
        if (g10.d() != null) {
            sSLSocket.setEnabledCipherSuites(g10.f23895c);
        }
    }

    public final List<i> d() {
        String[] strArr = this.f23895c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.f23869s1.b(str));
        }
        return v.S(arrayList);
    }

    public final boolean e(SSLSocket sSLSocket) {
        k.e(sSLSocket, "socket");
        if (!this.f23893a) {
            return false;
        }
        String[] strArr = this.f23896d;
        if (strArr != null && !vb.b.r(strArr, sSLSocket.getEnabledProtocols(), ka.a.b())) {
            return false;
        }
        String[] strArr2 = this.f23895c;
        return strArr2 == null || vb.b.r(strArr2, sSLSocket.getEnabledCipherSuites(), i.f23869s1.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f23893a;
        l lVar = (l) obj;
        if (z10 != lVar.f23893a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f23895c, lVar.f23895c) && Arrays.equals(this.f23896d, lVar.f23896d) && this.f23894b == lVar.f23894b);
    }

    public final boolean f() {
        return this.f23893a;
    }

    public final l g(SSLSocket sSLSocket, boolean z10) {
        String[] strArr;
        String[] strArr2;
        if (this.f23895c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            k.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = vb.b.B(enabledCipherSuites, this.f23895c, i.f23869s1.c());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f23896d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            k.d(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = vb.b.B(enabledProtocols, this.f23896d, ka.a.b());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        k.d(supportedCipherSuites, "supportedCipherSuites");
        int u10 = vb.b.u(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f23869s1.c());
        if (z10 && u10 != -1) {
            k.d(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[u10];
            k.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = vb.b.l(strArr, str);
        }
        a aVar = new a(this);
        k.d(strArr, "cipherSuitesIntersection");
        a b10 = aVar.b((String[]) Arrays.copyOf(strArr, strArr.length));
        k.d(strArr2, "tlsVersionsIntersection");
        return b10.e((String[]) Arrays.copyOf(strArr2, strArr2.length)).a();
    }

    public final boolean h() {
        return this.f23894b;
    }

    public int hashCode() {
        if (!this.f23893a) {
            return 17;
        }
        String[] strArr = this.f23895c;
        int i10 = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f23896d;
        if (strArr2 != null) {
            i10 = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i10) * 31) + (!this.f23894b ? 1 : 0);
    }

    public final List<g0> i() {
        String[] strArr = this.f23896d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g0.Q.a(str));
        }
        return v.S(arrayList);
    }

    public String toString() {
        if (!this.f23893a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f23894b + ')';
    }
}
