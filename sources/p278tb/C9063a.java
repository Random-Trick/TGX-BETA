package p278tb;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p278tb.C9125w;
import p290ub.C9489b;
import qa.C8298k;

public final class C9063a {
    public final C9125w f29043a;
    public final List<EnumC9064a0> f29044b;
    public final List<C9099l> f29045c;
    public final AbstractC9111s f29046d;
    public final SocketFactory f29047e;
    public final SSLSocketFactory f29048f;
    public final HostnameVerifier f29049g;
    public final C9086g f29050h;
    public final AbstractC9066b f29051i;
    public final Proxy f29052j;
    public final ProxySelector f29053k;

    public C9063a(String str, int i, AbstractC9111s sVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C9086g gVar, AbstractC9066b bVar, Proxy proxy, List<? extends EnumC9064a0> list, List<C9099l> list2, ProxySelector proxySelector) {
        C8298k.m12933e(str, "uriHost");
        C8298k.m12933e(sVar, "dns");
        C8298k.m12933e(socketFactory, "socketFactory");
        C8298k.m12933e(bVar, "proxyAuthenticator");
        C8298k.m12933e(list, "protocols");
        C8298k.m12933e(list2, "connectionSpecs");
        C8298k.m12933e(proxySelector, "proxySelector");
        this.f29046d = sVar;
        this.f29047e = socketFactory;
        this.f29048f = sSLSocketFactory;
        this.f29049g = hostnameVerifier;
        this.f29050h = gVar;
        this.f29051i = bVar;
        this.f29052j = proxy;
        this.f29053k = proxySelector;
        this.f29043a = new C9125w.C9126a().m10321o(sSLSocketFactory != null ? "https" : "http").m10331e(str).m10325k(i).m10335a();
        this.f29044b = C9489b.m8531N(list);
        this.f29045c = C9489b.m8531N(list2);
    }

    public final C9086g m10580a() {
        return this.f29050h;
    }

    public final List<C9099l> m10579b() {
        return this.f29045c;
    }

    public final AbstractC9111s m10578c() {
        return this.f29046d;
    }

    public final boolean m10577d(C9063a aVar) {
        C8298k.m12933e(aVar, "that");
        return C8298k.m12936b(this.f29046d, aVar.f29046d) && C8298k.m12936b(this.f29051i, aVar.f29051i) && C8298k.m12936b(this.f29044b, aVar.f29044b) && C8298k.m12936b(this.f29045c, aVar.f29045c) && C8298k.m12936b(this.f29053k, aVar.f29053k) && C8298k.m12936b(this.f29052j, aVar.f29052j) && C8298k.m12936b(this.f29048f, aVar.f29048f) && C8298k.m12936b(this.f29049g, aVar.f29049g) && C8298k.m12936b(this.f29050h, aVar.f29050h) && this.f29043a.m10342l() == aVar.f29043a.m10342l();
    }

    public final HostnameVerifier m10576e() {
        return this.f29049g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9063a) {
            C9063a aVar = (C9063a) obj;
            if (C8298k.m12936b(this.f29043a, aVar.f29043a) && m10577d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final List<EnumC9064a0> m10575f() {
        return this.f29044b;
    }

    public final Proxy m10574g() {
        return this.f29052j;
    }

    public final AbstractC9066b m10573h() {
        return this.f29051i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f29043a.hashCode()) * 31) + this.f29046d.hashCode()) * 31) + this.f29051i.hashCode()) * 31) + this.f29044b.hashCode()) * 31) + this.f29045c.hashCode()) * 31) + this.f29053k.hashCode()) * 31) + Objects.hashCode(this.f29052j)) * 31) + Objects.hashCode(this.f29048f)) * 31) + Objects.hashCode(this.f29049g)) * 31) + Objects.hashCode(this.f29050h);
    }

    public final ProxySelector m10572i() {
        return this.f29053k;
    }

    public final SocketFactory m10571j() {
        return this.f29047e;
    }

    public final SSLSocketFactory m10570k() {
        return this.f29048f;
    }

    public final C9125w m10569l() {
        return this.f29043a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f29043a.m10346h());
        sb3.append(':');
        sb3.append(this.f29043a.m10342l());
        sb3.append(", ");
        if (this.f29052j != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f29052j;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f29053k;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append("}");
        return sb3.toString();
    }
}
