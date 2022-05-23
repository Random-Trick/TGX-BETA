package ec;

import java.util.List;
import javax.net.ssl.SSLSocket;
import ra.k;
import ub.a0;

public final class j implements k {
    public k f11521a;
    public final a f11522b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        k.e(aVar, "socketAdapterFactory");
        this.f11522b = aVar;
    }

    @Override
    public boolean a(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        return this.f11522b.a(sSLSocket);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public String c(SSLSocket sSLSocket) {
        k.e(sSLSocket, "sslSocket");
        k e10 = e(sSLSocket);
        if (e10 != null) {
            return e10.c(sSLSocket);
        }
        return null;
    }

    @Override
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        k.e(sSLSocket, "sslSocket");
        k.e(list, "protocols");
        k e10 = e(sSLSocket);
        if (e10 != null) {
            e10.d(sSLSocket, str, list);
        }
    }

    public final synchronized k e(SSLSocket sSLSocket) {
        if (this.f11521a == null && this.f11522b.a(sSLSocket)) {
            this.f11521a = this.f11522b.b(sSLSocket);
        }
        return this.f11521a;
    }
}
