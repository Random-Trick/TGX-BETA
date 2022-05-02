package cc;

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
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;

public final class C2073d extends C2083h {
    public static final boolean f7306e;
    public static final C2074a f7307f;
    public final Provider f7308d;

    public static final class C2074a {
        public C2074a() {
        }

        public final boolean m35707a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }

        public final C2073d m35706b() {
            if (m35705c()) {
                return new C2073d(null);
            }
            return null;
        }

        public final boolean m35705c() {
            return C2073d.f7306e;
        }

        public C2074a(C8294g gVar) {
            this();
        }
    }

    public static final class C2075b implements ConscryptHostnameVerifier {
        public static final C2075b f7309a = new C2075b();
    }

    static {
        C2074a aVar = new C2074a(null);
        f7307f = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.m35707a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f7306e = z;
    }

    public C2073d() {
        Provider newProvider = Conscrypt.newProvider();
        C8298k.m12935d(newProvider, "Conscrypt.newProvider()");
        this.f7308d = newProvider;
    }

    @Override
    public void mo35691e(SSLSocket sSLSocket, String str, List<EnumC9064a0> list) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        C8298k.m12934e(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = C2083h.f7326c.m35679b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            return;
        }
        super.mo35691e(sSLSocket, str, list);
    }

    @Override
    public String mo35689g(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo35689g(sSLSocket);
    }

    @Override
    public SSLContext mo35683m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f7308d);
        C8298k.m12935d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override
    public SSLSocketFactory mo35682n(X509TrustManager x509TrustManager) {
        C8298k.m12934e(x509TrustManager, "trustManager");
        SSLContext m = mo35683m();
        m.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = m.getSocketFactory();
        C8298k.m12935d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override
    public X509TrustManager mo35681o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        C8298k.m12935d(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C8298k.m12936c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, C2075b.f7309a);
            return x509TrustManager;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C8298k.m12935d(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public C2073d(C8294g gVar) {
        this();
    }
}
