package p304vb;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import p123ia.C5312v;
import p278tb.AbstractC9066b;
import p278tb.AbstractC9111s;
import p278tb.C9063a;
import p278tb.C9069b0;
import p278tb.C9078d0;
import p278tb.C9085f0;
import p278tb.C9093h;
import p278tb.C9109q;
import p278tb.C9125w;
import qa.C8294g;
import qa.C8298k;
import za.C11451n;

public final class C9902b implements AbstractC9066b {
    public final AbstractC9111s f32202d;

    public C9902b(AbstractC9111s sVar) {
        C8298k.m12933e(sVar, "defaultDns");
        this.f32202d = sVar;
    }

    @Override
    public C9069b0 mo6668a(C9085f0 f0Var, C9078d0 d0Var) {
        Proxy proxy;
        AbstractC9111s sVar;
        PasswordAuthentication passwordAuthentication;
        C9063a a;
        C8298k.m12933e(d0Var, "response");
        List<C9093h> z0 = d0Var.m10509z0();
        C9069b0 N0 = d0Var.m10514N0();
        C9125w i = N0.m10558i();
        boolean z = d0Var.m10527A0() == 407;
        if (f0Var == null || (proxy = f0Var.m10483b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C9093h hVar : z0) {
            if (C11451n.m633l("Basic", hVar.m10463c(), true)) {
                if (f0Var == null || (a = f0Var.m10484a()) == null || (sVar = a.m10578c()) == null) {
                    sVar = this.f32202d;
                }
                if (z) {
                    SocketAddress address = proxy.address();
                    Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    C8298k.m12934d(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m6667b(proxy, i, sVar), inetSocketAddress.getPort(), i.m10338p(), hVar.m10464b(), hVar.m10463c(), i.m10336r(), Authenticator.RequestorType.PROXY);
                } else {
                    String h = i.m10346h();
                    C8298k.m12934d(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(h, m6667b(proxy, i, sVar), i.m10342l(), i.m10338p(), hVar.m10464b(), hVar.m10463c(), i.m10336r(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthentication.getUserName();
                    C8298k.m12934d(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    C8298k.m12934d(password, "auth.password");
                    return N0.m10559h().m10556b(str, C9109q.m10418a(userName, new String(password), hVar.m10465a())).m10557a();
                }
            }
        }
        return null;
    }

    public final InetAddress m6667b(Proxy proxy, C9125w wVar, AbstractC9111s sVar) {
        Proxy.Type type = proxy.type();
        if (type != null && C9901a.f32201a[type.ordinal()] == 1) {
            return (InetAddress) C5312v.m23346C(sVar.mo10410a(wVar.m10346h()));
        }
        SocketAddress address = proxy.address();
        Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        C8298k.m12934d(address2, "(address() as InetSocketAddress).address");
        return address2;
    }

    public C9902b(AbstractC9111s sVar, int i, C8294g gVar) {
        this((i & 1) != 0 ? AbstractC9111s.f29324a : sVar);
    }
}
