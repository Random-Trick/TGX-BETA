package p052dc;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p278tb.EnumC9064a0;
import qa.C8298k;

public final class C3987j implements AbstractC3989k {
    public AbstractC3989k f13364a;
    public final AbstractC3988a f13365b;

    public interface AbstractC3988a {
        boolean mo29421a(SSLSocket sSLSocket);

        AbstractC3989k mo29420b(SSLSocket sSLSocket);
    }

    public C3987j(AbstractC3988a aVar) {
        C8298k.m12934e(aVar, "socketAdapterFactory");
        this.f13365b = aVar;
    }

    @Override
    public boolean mo29419a(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        return this.f13365b.mo29421a(sSLSocket);
    }

    @Override
    public boolean mo29418b() {
        return true;
    }

    @Override
    public String mo29417c(SSLSocket sSLSocket) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        AbstractC3989k e = m29422e(sSLSocket);
        if (e != null) {
            return e.mo29417c(sSLSocket);
        }
        return null;
    }

    @Override
    public void mo29416d(SSLSocket sSLSocket, String str, List<? extends EnumC9064a0> list) {
        C8298k.m12934e(sSLSocket, "sslSocket");
        C8298k.m12934e(list, "protocols");
        AbstractC3989k e = m29422e(sSLSocket);
        if (e != null) {
            e.mo29416d(sSLSocket, str, list);
        }
    }

    public final synchronized AbstractC3989k m29422e(SSLSocket sSLSocket) {
        if (this.f13364a == null && this.f13365b.mo29421a(sSLSocket)) {
            this.f13364a = this.f13365b.mo29420b(sSLSocket);
        }
        return this.f13364a;
    }
}
