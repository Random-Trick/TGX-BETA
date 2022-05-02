package cc;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;

public final class C2071c extends C2083h {
    public static final boolean f7303e;
    public static final C2072a f7304f;
    public final Provider f7305d;

    public static final class C2072a {
        public C2072a() {
        }

        public final C2071c m35710a() {
            if (m35709b()) {
                return new C2071c(null);
            }
            return null;
        }

        public final boolean m35709b() {
            return C2071c.f7303e;
        }

        public C2072a(C8294g gVar) {
            this();
        }
    }

    static {
        C2072a aVar = new C2072a(null);
        f7304f = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f7303e = z;
    }

    public C2071c() {
        this.f7305d = new BouncyCastleJsseProvider();
    }

    @Override
    public void mo35691e(SSLSocket sSLSocket, String str, List<EnumC9064a0> list) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        C8298k.m12934e(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> b = C2083h.f7326c.m35679b(list);
            C8298k.m12935d(parameters, "sslParameters");
            Object[] array = b.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
            return;
        }
        super.mo35691e(sSLSocket, str, list);
    }

    @Override
    public String mo35689g(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            return super.mo35689g(sSLSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    @Override
    public SSLContext mo35683m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f7305d);
        C8298k.m12935d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override
    public X509TrustManager mo35681o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    public C2071c(C8294g gVar) {
        this();
    }
}
