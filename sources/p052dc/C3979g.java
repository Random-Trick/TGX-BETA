package p052dc;

import cc.C2071c;
import cc.C2083h;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p052dc.C3987j;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;

public final class C3979g implements AbstractC3989k {
    public static final C3981b f13357b = new C3981b(null);
    public static final C3987j.AbstractC3988a f13356a = new C3980a();

    public static final class C3980a implements C3987j.AbstractC3988a {
        @Override
        public boolean mo29421a(SSLSocket sSLSocket) {
            C8298k.m12934e(sSLSocket, "sslSocket");
            return C2071c.f7304f.m35709b() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override
        public AbstractC3989k mo29420b(SSLSocket sSLSocket) {
            C8298k.m12934e(sSLSocket, "sslSocket");
            return new C3979g();
        }
    }

    public static final class C3981b {
        public C3981b() {
        }

        public final C3987j.AbstractC3988a m29428a() {
            return C3979g.f13356a;
        }

        public C3981b(C8294g gVar) {
            this();
        }
    }

    @Override
    public boolean mo29419a(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override
    public boolean mo29418b() {
        return C2071c.f7304f.m35709b();
    }

    @Override
    public String mo29417c(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    @Override
    public void mo29416d(SSLSocket sSLSocket, String str, List<? extends EnumC9064a0> list) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        C8298k.m12934e(list, "protocols");
        if (mo29419a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C8298k.m12935d(parameters, "sslParameters");
            Object[] array = C2083h.f7326c.m35679b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
