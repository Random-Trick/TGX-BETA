package p278tb;

import java.net.InetSocketAddress;
import java.net.Proxy;
import qa.C8298k;

public final class C9085f0 {
    public final C9063a f29137a;
    public final Proxy f29138b;
    public final InetSocketAddress f29139c;

    public C9085f0(C9063a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C8298k.m12933e(aVar, "address");
        C8298k.m12933e(proxy, "proxy");
        C8298k.m12933e(inetSocketAddress, "socketAddress");
        this.f29137a = aVar;
        this.f29138b = proxy;
        this.f29139c = inetSocketAddress;
    }

    public final C9063a m10484a() {
        return this.f29137a;
    }

    public final Proxy m10483b() {
        return this.f29138b;
    }

    public final boolean m10482c() {
        return this.f29137a.m10570k() != null && this.f29138b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress m10481d() {
        return this.f29139c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9085f0) {
            C9085f0 f0Var = (C9085f0) obj;
            if (C8298k.m12936b(f0Var.f29137a, this.f29137a) && C8298k.m12936b(f0Var.f29138b, this.f29138b) && C8298k.m12936b(f0Var.f29139c, this.f29139c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f29137a.hashCode()) * 31) + this.f29138b.hashCode()) * 31) + this.f29139c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f29139c + '}';
    }
}
