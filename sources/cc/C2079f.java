package cc;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;

public class C2079f extends C2083h {
    public static final boolean f7319d;
    public static final C2080a f7320e = new C2080a(null);

    public static final class C2080a {
        public C2080a() {
        }

        public final C2079f m35700a() {
            if (m35699b()) {
                return new C2079f();
            }
            return null;
        }

        public final boolean m35699b() {
            return C2079f.f7319d;
        }

        public C2080a(C8294g gVar) {
            this();
        }
    }

    static {
        throw new UnsupportedOperationException("Method not decompiled: cc.C2079f.<clinit>():void");
    }

    @Override
    public void mo35691e(SSLSocket sSLSocket, String str, List<EnumC9064a0> list) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        C8298k.m12934e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> b = C2083h.f7326c.m35679b(list);
        C8298k.m12935d(sSLParameters, "sslParameters");
        Object[] array = b.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override
    public String mo35689g(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
