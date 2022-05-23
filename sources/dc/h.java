package dc;

import ec.c;
import gc.b;
import hc.e;
import ja.o;
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
import ra.g;
import ra.k;
import ub.a0;
import ub.z;

public class h {
    public static volatile h f7331a;
    public static final Logger f7332b = Logger.getLogger(z.class.getName());
    public static final a f7333c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final List<String> b(List<? extends a0> list) {
            k.e(list, "protocols");
            ArrayList<a0> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((a0) obj) != a0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(o.o(arrayList, 10));
            for (a0 a0Var : arrayList) {
                arrayList2.add(a0Var.toString());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends a0> list) {
            k.e(list, "protocols");
            e eVar = new e();
            for (String str : b(list)) {
                eVar.D(str.length());
                eVar.P(str);
            }
            return eVar.I0();
        }

        public final h d() {
            c.f11503c.b();
            h a10 = dc.a.f7302f.a();
            if (a10 != null) {
                return a10;
            }
            h a11 = b.f7305g.a();
            k.c(a11);
            return a11;
        }

        public final h e() {
            g a10;
            c a11;
            d b10;
            if (j() && (b10 = d.f7314f.b()) != null) {
                return b10;
            }
            if (i() && (a11 = c.f7311f.a()) != null) {
                return a11;
            }
            if (k() && (a10 = g.f7329f.a()) != null) {
                return a10;
            }
            f a12 = f.f7327e.a();
            if (a12 != null) {
                return a12;
            }
            h a13 = e.f7317i.a();
            return a13 != null ? a13 : new h();
        }

        public final h f() {
            if (h()) {
                return d();
            }
            return e();
        }

        public final h g() {
            return h.f7331a;
        }

        public final boolean h() {
            return k.b("Dalvik", System.getProperty("java.vm.name"));
        }

        public final boolean i() {
            Provider provider = Security.getProviders()[0];
            k.d(provider, "Security.getProviders()[0]");
            return k.b("BC", provider.getName());
        }

        public final boolean j() {
            Provider provider = Security.getProviders()[0];
            k.d(provider, "Security.getProviders()[0]");
            return k.b("Conscrypt", provider.getName());
        }

        public final boolean k() {
            Provider provider = Security.getProviders()[0];
            k.d(provider, "Security.getProviders()[0]");
            return k.b("OpenJSSE", provider.getName());
        }
    }

    static {
        a aVar = new a(null);
        f7333c = aVar;
        f7331a = aVar.f();
    }

    public static void k(h hVar, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 4;
            }
            if ((i11 & 4) != 0) {
                th = null;
            }
            hVar.j(str, i10, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void b(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
    }

    public gc.c c(X509TrustManager x509TrustManager) {
        k.e(x509TrustManager, "trustManager");
        return new gc.a(d(x509TrustManager));
    }

    public gc.e d(X509TrustManager x509TrustManager) {
        k.e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        k.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.e(sSLSocket, "sslSocket");
        k.e(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        k.e(socket, "socket");
        k.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public String g(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        return null;
    }

    public Object h(String str) {
        k.e(str, "closer");
        if (f7332b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean i(String str) {
        k.e(str, "hostname");
        return true;
    }

    public void j(String str, int i10, Throwable th) {
        k.e(str, "message");
        f7332b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void l(String str, Object obj) {
        k.e(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        j(str, 5, (Throwable) obj);
    }

    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        k.d(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory n(X509TrustManager x509TrustManager) {
        k.e(x509TrustManager, "trustManager");
        try {
            SSLContext m10 = m();
            m10.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = m10.getSocketFactory();
            k.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        k.d(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        k.c(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        k.d(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        k.d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
