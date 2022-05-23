package ec;

import dc.d;
import dc.h;
import ec.j;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import ra.g;
import ra.k;
import ub.a0;

public final class i implements k {
    public static final b f11520b = new b(null);
    public static final j.a f11519a = new a();

    public static final class a implements j.a {
        @Override
        public boolean a(SSLSocket sSLSocket) {
            k.e(sSLSocket, "sslSocket");
            return d.f7314f.c() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override
        public k b(SSLSocket sSLSocket) {
            k.e(sSLSocket, "sslSocket");
            return new i();
        }
    }

    public static final class b {
        public b() {
        }

        public b(g gVar) {
            this();
        }

        public final j.a a() {
            return i.f11519a;
        }
    }

    @Override
    public boolean a(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override
    public boolean b() {
        return d.f7314f.c();
    }

    @Override
    public String c(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.e(sSLSocket, "sslSocket");
        k.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = h.f7333c.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
