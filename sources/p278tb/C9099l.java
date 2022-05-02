package p278tb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p123ia.C5312v;
import p138ja.C5906a;
import p290ub.C9489b;
import qa.C8294g;
import qa.C8298k;

public final class C9099l {
    public static final C9094i[] f29285e;
    public static final C9094i[] f29286f;
    public static final C9099l f29287g;
    public static final C9099l f29288h;
    public static final C9099l f29289i;
    public final boolean f29292a;
    public final boolean f29293b;
    public final String[] f29294c;
    public final String[] f29295d;
    public static final C9101b f29291k = new C9101b(null);
    public static final C9099l f29290j = new C9100a(false).m10443a();

    public static final class C9100a {
        public boolean f29296a;
        public String[] f29297b;
        public String[] f29298c;
        public boolean f29299d;

        public C9100a(boolean z) {
            this.f29296a = z;
        }

        public final C9099l m10443a() {
            return new C9099l(this.f29296a, this.f29299d, this.f29297b, this.f29298c);
        }

        public final C9100a m10442b(String... strArr) {
            C8298k.m12933e(strArr, "cipherSuites");
            if (this.f29296a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f29297b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final C9100a m10441c(C9094i... iVarArr) {
            C8298k.m12933e(iVarArr, "cipherSuites");
            if (this.f29296a) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (C9094i iVar : iVarArr) {
                    arrayList.add(iVar.m10460c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return m10442b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final C9100a m10440d(boolean z) {
            if (this.f29296a) {
                this.f29299d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final C9100a m10439e(String... strArr) {
            C8298k.m12933e(strArr, "tlsVersions");
            if (this.f29296a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f29298c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final C9100a m10438f(EnumC9091g0... g0VarArr) {
            C8298k.m12933e(g0VarArr, "tlsVersions");
            if (this.f29296a) {
                ArrayList arrayList = new ArrayList(g0VarArr.length);
                for (EnumC9091g0 g0Var : g0VarArr) {
                    arrayList.add(g0Var.m10467a());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return m10439e((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public C9100a(C9099l lVar) {
            C8298k.m12933e(lVar, "connectionSpec");
            this.f29296a = lVar.m10447f();
            this.f29297b = lVar.f29294c;
            this.f29298c = lVar.f29295d;
            this.f29299d = lVar.m10445h();
        }
    }

    public static final class C9101b {
        public C9101b() {
        }

        public C9101b(C8294g gVar) {
            this();
        }
    }

    static {
        C9094i iVar = C9094i.f29253n1;
        C9094i iVar2 = C9094i.f29256o1;
        C9094i iVar3 = C9094i.f29259p1;
        C9094i iVar4 = C9094i.f29212Z0;
        C9094i iVar5 = C9094i.f29223d1;
        C9094i iVar6 = C9094i.f29214a1;
        C9094i iVar7 = C9094i.f29226e1;
        C9094i iVar8 = C9094i.f29244k1;
        C9094i iVar9 = C9094i.f29241j1;
        C9094i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f29285e = iVarArr;
        C9094i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, C9094i.f29182K0, C9094i.f29184L0, C9094i.f29237i0, C9094i.f29240j0, C9094i.f29173G, C9094i.f29181K, C9094i.f29242k};
        f29286f = iVarArr2;
        C9100a c = new C9100a(true).m10441c((C9094i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        EnumC9091g0 g0Var = EnumC9091g0.TLS_1_3;
        EnumC9091g0 g0Var2 = EnumC9091g0.TLS_1_2;
        f29287g = c.m10438f(g0Var, g0Var2).m10440d(true).m10443a();
        f29288h = new C9100a(true).m10441c((C9094i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).m10438f(g0Var, g0Var2).m10440d(true).m10443a();
        f29289i = new C9100a(true).m10441c((C9094i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).m10438f(g0Var, g0Var2, EnumC9091g0.TLS_1_1, EnumC9091g0.TLS_1_0).m10440d(true).m10443a();
    }

    public C9099l(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f29292a = z;
        this.f29293b = z2;
        this.f29294c = strArr;
        this.f29295d = strArr2;
    }

    public final void m10450c(SSLSocket sSLSocket, boolean z) {
        C8298k.m12933e(sSLSocket, "sslSocket");
        C9099l g = m10446g(sSLSocket, z);
        if (g.m10444i() != null) {
            sSLSocket.setEnabledProtocols(g.f29295d);
        }
        if (g.m10449d() != null) {
            sSLSocket.setEnabledCipherSuites(g.f29294c);
        }
    }

    public final List<C9094i> m10449d() {
        String[] strArr = this.f29294c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C9094i.f29268s1.m10457b(str));
        }
        return C5312v.m23330S(arrayList);
    }

    public final boolean m10448e(SSLSocket sSLSocket) {
        C8298k.m12933e(sSLSocket, "socket");
        if (!this.f29292a) {
            return false;
        }
        String[] strArr = this.f29295d;
        if (strArr != null && !C9489b.m8506r(strArr, sSLSocket.getEnabledProtocols(), C5906a.m21862b())) {
            return false;
        }
        String[] strArr2 = this.f29294c;
        return strArr2 == null || C9489b.m8506r(strArr2, sSLSocket.getEnabledCipherSuites(), C9094i.f29268s1.m10456c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9099l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f29292a;
        C9099l lVar = (C9099l) obj;
        if (z != lVar.f29292a) {
            return false;
        }
        return !z || (Arrays.equals(this.f29294c, lVar.f29294c) && Arrays.equals(this.f29295d, lVar.f29295d) && this.f29293b == lVar.f29293b);
    }

    public final boolean m10447f() {
        return this.f29292a;
    }

    public final C9099l m10446g(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f29294c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            C8298k.m12934d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = C9489b.m8543B(enabledCipherSuites, this.f29294c, C9094i.f29268s1.m10456c());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f29295d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            C8298k.m12934d(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = C9489b.m8543B(enabledProtocols, this.f29295d, C5906a.m21862b());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C8298k.m12934d(supportedCipherSuites, "supportedCipherSuites");
        int u = C9489b.m8503u(supportedCipherSuites, "TLS_FALLBACK_SCSV", C9094i.f29268s1.m10456c());
        if (z && u != -1) {
            C8298k.m12934d(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[u];
            C8298k.m12934d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = C9489b.m8512l(strArr, str);
        }
        C9100a aVar = new C9100a(this);
        C8298k.m12934d(strArr, "cipherSuitesIntersection");
        C9100a b = aVar.m10442b((String[]) Arrays.copyOf(strArr, strArr.length));
        C8298k.m12934d(strArr2, "tlsVersionsIntersection");
        return b.m10439e((String[]) Arrays.copyOf(strArr2, strArr2.length)).m10443a();
    }

    public final boolean m10445h() {
        return this.f29293b;
    }

    public int hashCode() {
        if (!this.f29292a) {
            return 17;
        }
        String[] strArr = this.f29294c;
        int i = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f29295d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (!this.f29293b ? 1 : 0);
    }

    public final List<EnumC9091g0> m10444i() {
        String[] strArr = this.f29295d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(EnumC9091g0.f29155Q.m10466a(str));
        }
        return C5312v.m23330S(arrayList);
    }

    public String toString() {
        if (!this.f29292a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m10449d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m10444i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f29293b + ')';
    }
}
