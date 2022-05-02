package cc;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p052dc.AbstractC3989k;
import p052dc.C3971b;
import p052dc.C3976f;
import p052dc.C3979g;
import p052dc.C3982h;
import p052dc.C3984i;
import p052dc.C3987j;
import p052dc.C3990l;
import p081fc.AbstractC4349c;
import p081fc.AbstractC4352e;
import p123ia.C5304n;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;

public final class C2068b extends C2083h {
    public static final boolean f7297f;
    public static final C2069a f7298g = new C2069a(null);
    public final List<AbstractC3989k> f7299d;
    public final C3982h f7300e;

    public static final class C2069a {
        public C2069a() {
        }

        public final C2083h m35716a() {
            if (m35715b()) {
                return new C2068b();
            }
            return null;
        }

        public final boolean m35715b() {
            return C2068b.f7297f;
        }

        public C2069a(C8294g gVar) {
            this();
        }
    }

    public static final class C2070b implements AbstractC4352e {
        public final X509TrustManager f7301a;
        public final Method f7302b;

        public C2070b(X509TrustManager x509TrustManager, Method method) {
            C8298k.m12933e(x509TrustManager, "trustManager");
            C8298k.m12933e(method, "findByIssuerAndSignatureMethod");
            this.f7301a = x509TrustManager;
            this.f7302b = method;
        }

        @Override
        public X509Certificate mo28214a(X509Certificate x509Certificate) {
            C8298k.m12933e(x509Certificate, "cert");
            try {
                Object invoke = this.f7302b.invoke(this.f7301a, x509Certificate);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2070b)) {
                return false;
            }
            C2070b bVar = (C2070b) obj;
            return C8298k.m12936b(this.f7301a, bVar.f7301a) && C8298k.m12936b(this.f7302b, bVar.f7302b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f7301a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f7302b;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f7301a + ", findByIssuerAndSignatureMethod=" + this.f7302b + ")";
        }
    }

    static {
        int i;
        boolean z = true;
        boolean z2 = false;
        if (C2083h.f7326c.m35676h() && (i = Build.VERSION.SDK_INT) < 30) {
            if (i >= 21) {
                z2 = true;
            }
            if (!z2) {
                throw new IllegalStateException(("Expected Android API level 21+ but was " + i).toString());
            }
        } else {
            z = false;
        }
        f7297f = z;
    }

    public C2068b() {
        List i = C5304n.m23364i(C3990l.C3991a.m29416b(C3990l.f13366j, null, 1, null), new C3987j(C3976f.f13349g.m29432d()), new C3987j(C3984i.f13363b.m29425a()), new C3987j(C3979g.f13357b.m29430a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : i) {
            if (((AbstractC3989k) obj).mo29420b()) {
                arrayList.add(obj);
            }
        }
        this.f7299d = arrayList;
        this.f7300e = C3982h.f13358d.m29427a();
    }

    @Override
    public AbstractC4349c mo35696c(X509TrustManager x509TrustManager) {
        C8298k.m12933e(x509TrustManager, "trustManager");
        C3971b a = C3971b.f13341d.m29443a(x509TrustManager);
        return a != null ? a : super.mo35696c(x509TrustManager);
    }

    @Override
    public AbstractC4352e mo35695d(X509TrustManager x509TrustManager) {
        C8298k.m12933e(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            C8298k.m12934d(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C2070b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo35695d(x509TrustManager);
        }
    }

    @Override
    public void mo35694e(SSLSocket sSLSocket, String str, List<EnumC9064a0> list) {
        Object obj;
        C8298k.m12933e(sSLSocket, "sslSocket");
        C8298k.m12933e(list, "protocols");
        Iterator<T> it = this.f7299d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC3989k) obj).mo29421a(sSLSocket)) {
                break;
            }
        }
        AbstractC3989k kVar = (AbstractC3989k) obj;
        if (kVar != null) {
            kVar.mo29418d(sSLSocket, str, list);
        }
    }

    @Override
    public void mo35693f(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C8298k.m12933e(socket, "socket");
        C8298k.m12933e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    @Override
    public String mo35692g(SSLSocket sSLSocket) {
        Object obj;
        C8298k.m12933e(sSLSocket, "sslSocket");
        Iterator<T> it = this.f7299d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC3989k) obj).mo29421a(sSLSocket)) {
                break;
            }
        }
        AbstractC3989k kVar = (AbstractC3989k) obj;
        if (kVar != null) {
            return kVar.mo29419c(sSLSocket);
        }
        return null;
    }

    @Override
    public Object mo35691h(String str) {
        C8298k.m12933e(str, "closer");
        return this.f7300e.m29429a(str);
    }

    @Override
    public boolean mo35690i(String str) {
        C8298k.m12933e(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i < 23) {
            return true;
        }
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        C8298k.m12934d(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
        return networkSecurityPolicy.isCleartextTrafficPermitted();
    }

    @Override
    public void mo35687l(String str, Object obj) {
        C8298k.m12933e(str, "message");
        if (!this.f7300e.m29428b(obj)) {
            C2083h.m35688k(this, str, 5, null, 4, null);
        }
    }
}
