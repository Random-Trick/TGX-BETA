package wb;

import ab.n;
import ja.v;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import ra.g;
import ra.k;
import ub.a;
import ub.b0;
import ub.d0;
import ub.f0;
import ub.h;
import ub.q;
import ub.s;
import ub.w;

public final class b implements ub.b {
    public final s f25847d;

    public b(s sVar) {
        k.e(sVar, "defaultDns");
        this.f25847d = sVar;
    }

    @Override
    public b0 a(f0 f0Var, d0 d0Var) {
        Proxy proxy;
        s sVar;
        PasswordAuthentication passwordAuthentication;
        a a10;
        k.e(d0Var, "response");
        List<h> z02 = d0Var.z0();
        b0 N0 = d0Var.N0();
        w i10 = N0.i();
        boolean z10 = d0Var.A0() == 407;
        if (f0Var == null || (proxy = f0Var.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : z02) {
            if (n.l("Basic", hVar.c(), true)) {
                if (f0Var == null || (a10 = f0Var.a()) == null || (sVar = a10.c()) == null) {
                    sVar = this.f25847d;
                }
                if (z10) {
                    SocketAddress address = proxy.address();
                    Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    k.d(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, i10, sVar), inetSocketAddress.getPort(), i10.p(), hVar.b(), hVar.c(), i10.r(), Authenticator.RequestorType.PROXY);
                } else {
                    String h10 = i10.h();
                    k.d(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(h10, b(proxy, i10, sVar), i10.l(), i10.p(), hVar.b(), hVar.c(), i10.r(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthentication.getUserName();
                    k.d(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    k.d(password, "auth.password");
                    return N0.h().b(str, q.a(userName, new String(password), hVar.a())).a();
                }
            }
        }
        return null;
    }

    public final InetAddress b(Proxy proxy, w wVar, s sVar) {
        Proxy.Type type = proxy.type();
        if (type != null && a.f25846a[type.ordinal()] == 1) {
            return (InetAddress) v.C(sVar.a(wVar.h()));
        }
        SocketAddress address = proxy.address();
        Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        k.d(address2, "(address() as InetSocketAddress).address");
        return address2;
    }

    public b(s sVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? s.f23925a : sVar);
    }
}
