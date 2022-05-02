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
    public final AbstractC9111s f32199d;

    public C9902b(AbstractC9111s sVar) {
        C8298k.m12934e(sVar, "defaultDns");
        this.f32199d = sVar;
    }

    @Override
    public C9069b0 mo6668a(C9085f0 f0Var, C9078d0 d0Var) {
        Proxy proxy;
        AbstractC9111s sVar;
        PasswordAuthentication passwordAuthentication;
        C9063a a;
        C8298k.m12934e(d0Var, "response");
        List<C9093h> z0 = d0Var.m10510z0();
        C9069b0 N0 = d0Var.m10515N0();
        C9125w i = N0.m10559i();
        boolean z = d0Var.m10528A0() == 407;
        if (f0Var == null || (proxy = f0Var.m10484b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C9093h hVar : z0) {
            if (C11451n.m633l("Basic", hVar.m10464c(), true)) {
                if (f0Var == null || (a = f0Var.m10485a()) == null || (sVar = a.m10579c()) == null) {
                    sVar = this.f32199d;
                }
                if (z) {
                    SocketAddress address = proxy.address();
                    Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    C8298k.m12935d(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m6667b(proxy, i, sVar), inetSocketAddress.getPort(), i.m10339p(), hVar.m10465b(), hVar.m10464c(), i.m10337r(), Authenticator.RequestorType.PROXY);
                } else {
                    String h = i.m10347h();
                    C8298k.m12935d(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(h, m6667b(proxy, i, sVar), i.m10343l(), i.m10339p(), hVar.m10465b(), hVar.m10464c(), i.m10337r(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthentication.getUserName();
                    C8298k.m12935d(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    C8298k.m12935d(password, "auth.password");
                    return N0.m10560h().m10557b(str, C9109q.m10419a(userName, new String(password), hVar.m10466a())).m10558a();
                }
            }
        }
        return null;
    }

    public final InetAddress m6667b(Proxy proxy, C9125w wVar, AbstractC9111s sVar) {
        Proxy.Type type = proxy.type();
        if (type != null && C9901a.f32198a[type.ordinal()] == 1) {
            return (InetAddress) C5312v.m23345C(sVar.mo10411a(wVar.m10347h()));
        }
        SocketAddress address = proxy.address();
        Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        C8298k.m12935d(address2, "(address() as InetSocketAddress).address");
        return address2;
    }

    public C9902b(AbstractC9111s sVar, int i, C8294g gVar) {
        this((i & 1) != 0 ? AbstractC9111s.f29321a : sVar);
    }
}
