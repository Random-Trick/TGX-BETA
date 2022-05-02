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
    public static final C9094i[] f29282e;
    public static final C9094i[] f29283f;
    public static final C9099l f29284g;
    public static final C9099l f29285h;
    public static final C9099l f29286i;
    public final boolean f29289a;
    public final boolean f29290b;
    public final String[] f29291c;
    public final String[] f29292d;
    public static final C9101b f29288k = new C9101b(null);
    public static final C9099l f29287j = new C9100a(false).m10444a();

    public static final class C9100a {
        public boolean f29293a;
        public String[] f29294b;
        public String[] f29295c;
        public boolean f29296d;

        public C9100a(boolean z) {
            this.f29293a = z;
        }

        public final C9099l m10444a() {
            return new C9099l(this.f29293a, this.f29296d, this.f29294b, this.f29295c);
        }

        public final C9100a m10443b(String... strArr) {
            C8298k.m12934e(strArr, "cipherSuites");
            if (this.f29293a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f29294b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final C9100a m10442c(C9094i... iVarArr) {
            C8298k.m12934e(iVarArr, "cipherSuites");
            if (this.f29293a) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (C9094i iVar : iVarArr) {
                    arrayList.add(iVar.m10461c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return m10443b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final C9100a m10441d(boolean z) {
            if (this.f29293a) {
                this.f29296d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final C9100a m10440e(String... strArr) {
            C8298k.m12934e(strArr, "tlsVersions");
            if (this.f29293a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.f29295c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final C9100a m10439f(EnumC9091g0... g0VarArr) {
            C8298k.m12934e(g0VarArr, "tlsVersions");
            if (this.f29293a) {
                ArrayList arrayList = new ArrayList(g0VarArr.length);
                for (EnumC9091g0 g0Var : g0VarArr) {
                    arrayList.add(g0Var.m10468a());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return m10440e((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public C9100a(C9099l lVar) {
            C8298k.m12934e(lVar, "connectionSpec");
            this.f29293a = lVar.m10448f();
            this.f29294b = lVar.f29291c;
            this.f29295c = lVar.f29292d;
            this.f29296d = lVar.m10446h();
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
        C9094i iVar = C9094i.f29250n1;
        C9094i iVar2 = C9094i.f29253o1;
        C9094i iVar3 = C9094i.f29256p1;
        C9094i iVar4 = C9094i.f29209Z0;
        C9094i iVar5 = C9094i.f29220d1;
        C9094i iVar6 = C9094i.f29211a1;
        C9094i iVar7 = C9094i.f29223e1;
        C9094i iVar8 = C9094i.f29241k1;
        C9094i iVar9 = C9094i.f29238j1;
        C9094i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f29282e = iVarArr;
        C9094i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, C9094i.f29179K0, C9094i.f29181L0, C9094i.f29234i0, C9094i.f29237j0, C9094i.f29170G, C9094i.f29178K, C9094i.f29239k};
        f29283f = iVarArr2;
        C9100a c = new C9100a(true).m10442c((C9094i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        EnumC9091g0 g0Var = EnumC9091g0.TLS_1_3;
        EnumC9091g0 g0Var2 = EnumC9091g0.TLS_1_2;
        f29284g = c.m10439f(g0Var, g0Var2).m10441d(true).m10444a();
        f29285h = new C9100a(true).m10442c((C9094i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).m10439f(g0Var, g0Var2).m10441d(true).m10444a();
        f29286i = new C9100a(true).m10442c((C9094i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).m10439f(g0Var, g0Var2, EnumC9091g0.TLS_1_1, EnumC9091g0.TLS_1_0).m10441d(true).m10444a();
    }

    public C9099l(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f29289a = z;
        this.f29290b = z2;
        this.f29291c = strArr;
        this.f29292d = strArr2;
    }

    public final void m10451c(SSLSocket sSLSocket, boolean z) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        C9099l g = m10447g(sSLSocket, z);
        if (g.m10445i() != null) {
            sSLSocket.setEnabledProtocols(g.f29292d);
        }
        if (g.m10450d() != null) {
            sSLSocket.setEnabledCipherSuites(g.f29291c);
        }
    }

    public final List<C9094i> m10450d() {
        String[] strArr = this.f29291c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C9094i.f29265s1.m10458b(str));
        }
        return C5312v.m23329S(arrayList);
    }

    public final boolean m10449e(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "socket");
        if (!this.f29289a) {
            return false;
        }
        String[] strArr = this.f29292d;
        if (strArr != null && !C9489b.m8506r(strArr, sSLSocket.getEnabledProtocols(), C5906a.m21861b())) {
            return false;
        }
        String[] strArr2 = this.f29291c;
        return strArr2 == null || C9489b.m8506r(strArr2, sSLSocket.getEnabledCipherSuites(), C9094i.f29265s1.m10457c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9099l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f29289a;
        C9099l lVar = (C9099l) obj;
        if (z != lVar.f29289a) {
            return false;
        }
        return !z || (Arrays.equals(this.f29291c, lVar.f29291c) && Arrays.equals(this.f29292d, lVar.f29292d) && this.f29290b == lVar.f29290b);
    }

    public final boolean m10448f() {
        return this.f29289a;
    }

    public final C9099l m10447g(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f29291c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            C8298k.m12935d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = C9489b.m8543B(enabledCipherSuites, this.f29291c, C9094i.f29265s1.m10457c());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f29292d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            C8298k.m12935d(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = C9489b.m8543B(enabledProtocols, this.f29292d, C5906a.m21861b());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C8298k.m12935d(supportedCipherSuites, "supportedCipherSuites");
        int u = C9489b.m8503u(supportedCipherSuites, "TLS_FALLBACK_SCSV", C9094i.f29265s1.m10457c());
        if (z && u != -1) {
            C8298k.m12935d(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[u];
            C8298k.m12935d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = C9489b.m8512l(strArr, str);
        }
        C9100a aVar = new C9100a(this);
        C8298k.m12935d(strArr, "cipherSuitesIntersection");
        C9100a b = aVar.m10443b((String[]) Arrays.copyOf(strArr, strArr.length));
        C8298k.m12935d(strArr2, "tlsVersionsIntersection");
        return b.m10440e((String[]) Arrays.copyOf(strArr2, strArr2.length)).m10444a();
    }

    public final boolean m10446h() {
        return this.f29290b;
    }

    public int hashCode() {
        if (!this.f29289a) {
            return 17;
        }
        String[] strArr = this.f29291c;
        int i = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f29292d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (!this.f29290b ? 1 : 0);
    }

    public final List<EnumC9091g0> m10445i() {
        String[] strArr = this.f29292d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(EnumC9091g0.f29152Q.m10467a(str));
        }
        return C5312v.m23329S(arrayList);
    }

    public String toString() {
        if (!this.f29289a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m10450d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m10445i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f29290b + ')';
    }
}
