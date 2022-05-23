package ub;

import java.net.InetSocketAddress;
import java.net.Proxy;
import ra.k;

public final class f0 {
    public final a f23796a;
    public final Proxy f23797b;
    public final InetSocketAddress f23798c;

    public f0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        k.e(aVar, "address");
        k.e(proxy, "proxy");
        k.e(inetSocketAddress, "socketAddress");
        this.f23796a = aVar;
        this.f23797b = proxy;
        this.f23798c = inetSocketAddress;
    }

    public final a a() {
        return this.f23796a;
    }

    public final Proxy b() {
        return this.f23797b;
    }

    public final boolean c() {
        return this.f23796a.k() != null && this.f23797b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f23798c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (k.b(f0Var.f23796a, this.f23796a) && k.b(f0Var.f23797b, this.f23797b) && k.b(f0Var.f23798c, this.f23798c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f23796a.hashCode()) * 31) + this.f23797b.hashCode()) * 31) + this.f23798c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f23798c + '}';
    }
}
