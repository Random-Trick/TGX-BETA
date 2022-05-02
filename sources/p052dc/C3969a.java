package p052dc;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import cc.C2083h;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;

@SuppressLint({"NewApi"})
public final class C3969a implements AbstractC3989k {
    public static final C3970a f13340a = new C3970a(null);

    public static final class C3970a {
        public C3970a() {
        }

        public final AbstractC3989k m29443a() {
            if (m29442b()) {
                return new C3969a();
            }
            return null;
        }

        public final boolean m29442b() {
            return C2083h.f7326c.m35673h() && Build.VERSION.SDK_INT >= 29;
        }

        public C3970a(C8294g gVar) {
            this();
        }
    }

    @Override
    public boolean mo29419a(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override
    public boolean mo29418b() {
        return f13340a.m29442b();
    }

    @Override
    @SuppressLint({"NewApi"})
    public String mo29417c(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    @Override
    @SuppressLint({"NewApi"})
    public void mo29416d(SSLSocket sSLSocket, String str, List<? extends EnumC9064a0> list) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        C8298k.m12934e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C8298k.m12935d(sSLParameters, "sslParameters");
            Object[] array = C2083h.f7326c.m35679b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
