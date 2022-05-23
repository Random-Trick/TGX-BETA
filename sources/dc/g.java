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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import ra.k;
import ub.a0;

public final class g extends h {
    public static final boolean f7328e;
    public static final a f7329f;
    public final Provider f7330d;

    public static final class a {
        public a() {
        }

        public a(ra.g gVar) {
            this();
        }

        public final g a() {
            if (b()) {
                return new g(null);
            }
            return null;
        }

        public final boolean b() {
            return g.f7328e;
        }
    }

    static {
        a aVar = new a(null);
        f7329f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f7328e = z10;
    }

    public g() {
        this.f7330d = new OpenJSSE();
    }

    @Override
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.e(sSLSocket, "sslSocket");
        k.e(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                Object[] array = h.f7333c.b(list).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket2.setSSLParameters(sSLParameters);
                return;
            }
            return;
        }
        super.e(sSLSocket, str, list);
    }

    @Override
    public String g(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.g(sSLSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    @Override
    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f7330d);
        k.d(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override
    public X509TrustManager o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f7330d);
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

    public g(ra.g gVar) {
        this();
    }
}
