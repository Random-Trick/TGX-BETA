package ub;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ra.k;
import ub.w;
import vb.b;

public final class a {
    public final w f23720a;
    public final List<a0> f23721b;
    public final List<l> f23722c;
    public final s f23723d;
    public final SocketFactory f23724e;
    public final SSLSocketFactory f23725f;
    public final HostnameVerifier f23726g;
    public final g f23727h;
    public final b f23728i;
    public final Proxy f23729j;
    public final ProxySelector f23730k;

    public a(String str, int i10, s sVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<? extends a0> list, List<l> list2, ProxySelector proxySelector) {
        k.e(str, "uriHost");
        k.e(sVar, "dns");
        k.e(socketFactory, "socketFactory");
        k.e(bVar, "proxyAuthenticator");
        k.e(list, "protocols");
        k.e(list2, "connectionSpecs");
        k.e(proxySelector, "proxySelector");
        this.f23723d = sVar;
        this.f23724e = socketFactory;
        this.f23725f = sSLSocketFactory;
        this.f23726g = hostnameVerifier;
        this.f23727h = gVar;
        this.f23728i = bVar;
        this.f23729j = proxy;
        this.f23730k = proxySelector;
        this.f23720a = new w.a().o(sSLSocketFactory != null ? "https" : "http").e(str).k(i10).a();
        this.f23721b = b.N(list);
        this.f23722c = b.N(list2);
    }

    public final g a() {
        return this.f23727h;
    }

    public final List<l> b() {
        return this.f23722c;
    }

    public final s c() {
        return this.f23723d;
    }

    public final boolean d(a aVar) {
        k.e(aVar, "that");
        return k.b(this.f23723d, aVar.f23723d) && k.b(this.f23728i, aVar.f23728i) && k.b(this.f23721b, aVar.f23721b) && k.b(this.f23722c, aVar.f23722c) && k.b(this.f23730k, aVar.f23730k) && k.b(this.f23729j, aVar.f23729j) && k.b(this.f23725f, aVar.f23725f) && k.b(this.f23726g, aVar.f23726g) && k.b(this.f23727h, aVar.f23727h) && this.f23720a.l() == aVar.f23720a.l();
    }

    public final HostnameVerifier e() {
        return this.f23726g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (k.b(this.f23720a, aVar.f23720a) && d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final List<a0> f() {
        return this.f23721b;
    }

    public final Proxy g() {
        return this.f23729j;
    }

    public final b h() {
        return this.f23728i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f23720a.hashCode()) * 31) + this.f23723d.hashCode()) * 31) + this.f23728i.hashCode()) * 31) + this.f23721b.hashCode()) * 31) + this.f23722c.hashCode()) * 31) + this.f23730k.hashCode()) * 31) + Objects.hashCode(this.f23729j)) * 31) + Objects.hashCode(this.f23725f)) * 31) + Objects.hashCode(this.f23726g)) * 31) + Objects.hashCode(this.f23727h);
    }

    public final ProxySelector i() {
        return this.f23730k;
    }

    public final SocketFactory j() {
        return this.f23724e;
    }

    public final SSLSocketFactory k() {
        return this.f23725f;
    }

    public final w l() {
        return this.f23720a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f23720a.h());
        sb3.append(':');
        sb3.append(this.f23720a.l());
        sb3.append(", ");
        if (this.f23729j != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f23729j;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f23730k;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append("}");
        return sb3.toString();
    }
}
