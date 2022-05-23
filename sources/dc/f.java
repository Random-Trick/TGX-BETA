package dc;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import ra.g;
import ra.k;
import ub.a0;

public class f extends h {
    public static final boolean f7326d;
    public static final a f7327e = new a(null);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final f a() {
            if (b()) {
                return new f();
            }
            return null;
        }

        public final boolean b() {
            return f.f7326d;
        }
    }

    static {
        throw new UnsupportedOperationException("Method not decompiled: dc.f.<clinit>():void");
    }

    @Override
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        k.e(sSLSocket, "sslSocket");
        k.e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> b10 = h.f7333c.b(list);
        k.d(sSLParameters, "sslParameters");
        Object[] array = b10.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override
    public String g(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
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
