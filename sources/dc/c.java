package dc;

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
import ra.g;
import ra.k;
import ub.a0;

public final class c extends h {
    public static final boolean f7310e;
    public static final a f7311f;
    public final Provider f7312d;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final c a() {
            if (b()) {
                return new c(null);
            }
            return null;
        }

        public final boolean b() {
            return c.f7310e;
        }
    }

    static {
        a aVar = new a(null);
        f7311f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f7310e = z10;
    }

    public c() {
        this.f7312d = new BouncyCastleJsseProvider();
    }

    @Override
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.e(sSLSocket, "sslSocket");
        k.e(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> b10 = h.f7333c.b(list);
            k.d(parameters, "sslParameters");
            Object[] array = b10.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
            return;
        }
        super.e(sSLSocket, str, list);
    }

    @Override
    public String g(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            return super.g(sSLSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    @Override
    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f7312d);
        k.d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override
    public X509TrustManager o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    public c(g gVar) {
        this();
    }
}
