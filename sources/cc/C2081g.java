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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;

public final class C2081g extends C2083h {
    public static final boolean f7321e;
    public static final C2082a f7322f;
    public final Provider f7323d;

    public static final class C2082a {
        public C2082a() {
        }

        public final C2081g m35700a() {
            if (m35699b()) {
                return new C2081g(null);
            }
            return null;
        }

        public final boolean m35699b() {
            return C2081g.f7321e;
        }

        public C2082a(C8294g gVar) {
            this();
        }
    }

    static {
        C2082a aVar = new C2082a(null);
        f7322f = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f7321e = z;
    }

    public C2081g() {
        this.f7323d = new OpenJSSE();
    }

    @Override
    public void mo35694e(SSLSocket sSLSocket, String str, List<EnumC9064a0> list) {
        C8298k.m12933e(sSLSocket, "sslSocket");
        C8298k.m12933e(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                Object[] array = C2083h.f7326c.m35682b(list).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket2.setSSLParameters(sSLParameters);
                return;
            }
            return;
        }
        super.mo35694e(sSLSocket, str, list);
    }

    @Override
    public String mo35692g(SSLSocket sSLSocket) {
        C8298k.m12933e(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.mo35692g(sSLSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    @Override
    public SSLContext mo35686m() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f7323d);
        C8298k.m12934d(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override
    public X509TrustManager mo35684o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f7323d);
        trustManagerFactory.init((KeyStore) null);
        C8298k.m12934d(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C8298k.m12935c(trustManagers);
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
        C8298k.m12934d(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public C2081g(C8294g gVar) {
        this();
    }
}
