package cc;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p052dc.C3973c;
import p081fc.AbstractC4349c;
import p081fc.AbstractC4352e;
import p081fc.C4346a;
import p081fc.C4348b;
import p095gc.C4549e;
import p123ia.C5305o;
import p278tb.C9132z;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;

public class C2083h {
    public static volatile C2083h f7324a;
    public static final Logger f7325b = Logger.getLogger(C9132z.class.getName());
    public static final C2084a f7326c;

    public static final class C2084a {
        public C2084a() {
        }

        public final List<String> m35679b(List<? extends EnumC9064a0> list) {
            C8298k.m12934e(list, "protocols");
            ArrayList<EnumC9064a0> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((EnumC9064a0) obj) != EnumC9064a0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C5305o.m23357o(arrayList, 10));
            for (EnumC9064a0 a0Var : arrayList) {
                arrayList2.add(a0Var.toString());
            }
            return arrayList2;
        }

        public final byte[] m35678c(List<? extends EnumC9064a0> list) {
            C8298k.m12934e(list, "protocols");
            C4549e eVar = new C4549e();
            for (String str : m35679b(list)) {
                eVar.mo27349C(str.length());
                eVar.mo27348O(str);
            }
            return eVar.m27439I0();
        }

        public final C2083h m35677d() {
            C3973c.f13346c.m29439b();
            C2083h a = C2066a.f7295f.m35716a();
            if (a != null) {
                return a;
            }
            C2083h a2 = C2068b.f7298g.m35713a();
            C8298k.m12936c(a2);
            return a2;
        }

        public final C2083h m35676e() {
            C2081g a;
            C2071c a2;
            C2073d b;
            if (m35671j() && (b = C2073d.f7307f.m35706b()) != null) {
                return b;
            }
            if (m35672i() && (a2 = C2071c.f7304f.m35710a()) != null) {
                return a2;
            }
            if (m35670k() && (a = C2081g.f7322f.m35697a()) != null) {
                return a;
            }
            C2079f a3 = C2079f.f7320e.m35700a();
            if (a3 != null) {
                return a3;
            }
            C2083h a4 = C2076e.f7310i.m35702a();
            return a4 != null ? a4 : new C2083h();
        }

        public final C2083h m35675f() {
            if (m35673h()) {
                return m35677d();
            }
            return m35676e();
        }

        public final C2083h m35674g() {
            return C2083h.f7324a;
        }

        public final boolean m35673h() {
            return C8298k.m12937b("Dalvik", System.getProperty("java.vm.name"));
        }

        public final boolean m35672i() {
            Provider provider = Security.getProviders()[0];
            C8298k.m12935d(provider, "Security.getProviders()[0]");
            return C8298k.m12937b("BC", provider.getName());
        }

        public final boolean m35671j() {
            Provider provider = Security.getProviders()[0];
            C8298k.m12935d(provider, "Security.getProviders()[0]");
            return C8298k.m12937b("Conscrypt", provider.getName());
        }

        public final boolean m35670k() {
            Provider provider = Security.getProviders()[0];
            C8298k.m12935d(provider, "Security.getProviders()[0]");
            return C8298k.m12937b("OpenJSSE", provider.getName());
        }

        public C2084a(C8294g gVar) {
            this();
        }
    }

    static {
        C2084a aVar = new C2084a(null);
        f7326c = aVar;
        f7324a = aVar.m35675f();
    }

    public static void m35685k(C2083h hVar, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            hVar.m35686j(str, i, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void mo35694b(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
    }

    public AbstractC4349c mo35693c(X509TrustManager x509TrustManager) {
        C8298k.m12934e(x509TrustManager, "trustManager");
        return new C4346a(mo35692d(x509TrustManager));
    }

    public AbstractC4352e mo35692d(X509TrustManager x509TrustManager) {
        C8298k.m12934e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C8298k.m12935d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C4348b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void mo35691e(SSLSocket sSLSocket, String str, List<EnumC9064a0> list) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        C8298k.m12934e(list, "protocols");
    }

    public void mo35690f(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C8298k.m12934e(socket, "socket");
        C8298k.m12934e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public String mo35689g(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        return null;
    }

    public Object mo35688h(String str) {
        C8298k.m12934e(str, "closer");
        if (f7325b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean mo35687i(String str) {
        C8298k.m12934e(str, "hostname");
        return true;
    }

    public void m35686j(String str, int i, Throwable th) {
        C8298k.m12934e(str, "message");
        f7325b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void mo35684l(String str, Object obj) {
        C8298k.m12934e(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m35686j(str, 5, (Throwable) obj);
    }

    public SSLContext mo35683m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C8298k.m12935d(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory mo35682n(X509TrustManager x509TrustManager) {
        C8298k.m12934e(x509TrustManager, "trustManager");
        try {
            SSLContext m = mo35683m();
            m.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = m.getSocketFactory();
            C8298k.m12935d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager mo35681o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        C8298k.m12935d(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C8298k.m12936c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C8298k.m12935d(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C8298k.m12935d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
