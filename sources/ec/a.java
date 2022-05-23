package ec;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import dc.h;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import ra.g;
import ra.k;
import ub.a0;

@SuppressLint({"NewApi"})
public final class a implements k {
    public static final C0096a f11497a = new C0096a(null);

    public static final class C0096a {
        public C0096a() {
        }

        public C0096a(g gVar) {
            this();
        }

        public final k a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return h.f7333c.h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override
    public boolean a(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override
    public boolean b() {
        return f11497a.b();
    }

    @Override
    @SuppressLint({"NewApi"})
    public String c(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    @Override
    @SuppressLint({"NewApi"})
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.e(sSLSocket, "sslSocket");
        k.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            k.d(sSLParameters, "sslParameters");
            Object[] array = h.f7333c.b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
