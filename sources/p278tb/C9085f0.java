package p278tb;

import java.net.InetSocketAddress;
import java.net.Proxy;
import qa.C8298k;

public final class C9085f0 {
    public final C9063a f29134a;
    public final Proxy f29135b;
    public final InetSocketAddress f29136c;

    public C9085f0(C9063a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C8298k.m12934e(aVar, "address");
        C8298k.m12934e(proxy, "proxy");
        C8298k.m12934e(inetSocketAddress, "socketAddress");
        this.f29134a = aVar;
        this.f29135b = proxy;
        this.f29136c = inetSocketAddress;
    }

    public final C9063a m10485a() {
        return this.f29134a;
    }

    public final Proxy m10484b() {
        return this.f29135b;
    }

    public final boolean m10483c() {
        return this.f29134a.m10571k() != null && this.f29135b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress m10482d() {
        return this.f29136c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9085f0) {
            C9085f0 f0Var = (C9085f0) obj;
            if (C8298k.m12937b(f0Var.f29134a, this.f29134a) && C8298k.m12937b(f0Var.f29135b, this.f29135b) && C8298k.m12937b(f0Var.f29136c, this.f29136c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f29134a.hashCode()) * 31) + this.f29135b.hashCode()) * 31) + this.f29136c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f29136c + '}';
    }
}
