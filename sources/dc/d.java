package dc;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import ra.g;
import ra.k;
import ub.a0;

public final class d extends h {
    public static final boolean f7313e;
    public static final a f7314f;
    public final Provider f7315d;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        public final d b() {
            if (c()) {
                return new d(null);
            }
            return null;
        }

        public final boolean c() {
            return d.f7313e;
        }
    }

    public static final class b implements ConscryptHostnameVerifier {
        public static final b f7316a = new b();
    }

    static {
        a aVar = new a(null);
        f7314f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f7313e = z10;
    }

    public d() {
        Provider newProvider = Conscrypt.newProvider();
        k.d(newProvider, "Conscrypt.newProvider()");
        this.f7315d = newProvider;
    }

    @Override
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.e(sSLSocket, "sslSocket");
        k.e(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = h.f7333c.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            return;
        }
        super.e(sSLSocket, str, list);
    }

    @Override
    public String g(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.g(sSLSocket);
    }

    @Override
    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f7315d);
        k.d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override
    public SSLSocketFactory n(X509TrustManager x509TrustManager) {
        k.e(x509TrustManager, "trustManager");
        SSLContext m10 = m();
        m10.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = m10.getSocketFactory();
        k.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override
    public X509TrustManager o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        k.d(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        k.c(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.f7316a);
            return x509TrustManager;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        k.d(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public d(g gVar) {
        this();
    }
}
