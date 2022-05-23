package ec;

import dc.c;
import dc.h;
import ec.j;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import ra.k;
import ub.a0;

public final class g implements k {
    public static final b f11514b = new b(null);
    public static final j.a f11513a = new a();

    public static final class a implements j.a {
        @Override
        public boolean a(SSLSocket sSLSocket) {
            k.e(sSLSocket, "sslSocket");
            return c.f7311f.b() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override
        public k b(SSLSocket sSLSocket) {
            k.e(sSLSocket, "sslSocket");
            return new g();
        }
    }

    public static final class b {
        public b() {
        }

        public b(ra.g gVar) {
            this();
        }

        public final j.a a() {
            return g.f11513a;
        }
    }

    @Override
    public boolean a(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override
    public boolean b() {
        return c.f7311f.b();
    }

    @Override
    public String c(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    @Override
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.e(sSLSocket, "sslSocket");
        k.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            k.d(parameters, "sslParameters");
            Object[] array = h.f7333c.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
