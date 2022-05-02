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
    public final C9125w f29040a;
    public final List<EnumC9064a0> f29041b;
    public final List<C9099l> f29042c;
    public final AbstractC9111s f29043d;
    public final SocketFactory f29044e;
    public final SSLSocketFactory f29045f;
    public final HostnameVerifier f29046g;
    public final C9086g f29047h;
    public final AbstractC9066b f29048i;
    public final Proxy f29049j;
    public final ProxySelector f29050k;

    public C9063a(String str, int i, AbstractC9111s sVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C9086g gVar, AbstractC9066b bVar, Proxy proxy, List<? extends EnumC9064a0> list, List<C9099l> list2, ProxySelector proxySelector) {
        C8298k.m12934e(str, "uriHost");
        C8298k.m12934e(sVar, "dns");
        C8298k.m12934e(socketFactory, "socketFactory");
        C8298k.m12934e(bVar, "proxyAuthenticator");
        C8298k.m12934e(list, "protocols");
        C8298k.m12934e(list2, "connectionSpecs");
        C8298k.m12934e(proxySelector, "proxySelector");
        this.f29043d = sVar;
        this.f29044e = socketFactory;
        this.f29045f = sSLSocketFactory;
        this.f29046g = hostnameVerifier;
        this.f29047h = gVar;
        this.f29048i = bVar;
        this.f29049j = proxy;
        this.f29050k = proxySelector;
        this.f29040a = new C9125w.C9126a().m10322o(sSLSocketFactory != null ? "https" : "http").m10332e(str).m10326k(i).m10336a();
        this.f29041b = C9489b.m8531N(list);
        this.f29042c = C9489b.m8531N(list2);
    }

    public final C9086g m10581a() {
        return this.f29047h;
    }

    public final List<C9099l> m10580b() {
        return this.f29042c;
    }

    public final AbstractC9111s m10579c() {
        return this.f29043d;
    }

    public final boolean m10578d(C9063a aVar) {
        C8298k.m12934e(aVar, "that");
        return C8298k.m12937b(this.f29043d, aVar.f29043d) && C8298k.m12937b(this.f29048i, aVar.f29048i) && C8298k.m12937b(this.f29041b, aVar.f29041b) && C8298k.m12937b(this.f29042c, aVar.f29042c) && C8298k.m12937b(this.f29050k, aVar.f29050k) && C8298k.m12937b(this.f29049j, aVar.f29049j) && C8298k.m12937b(this.f29045f, aVar.f29045f) && C8298k.m12937b(this.f29046g, aVar.f29046g) && C8298k.m12937b(this.f29047h, aVar.f29047h) && this.f29040a.m10343l() == aVar.f29040a.m10343l();
    }

    public final HostnameVerifier m10577e() {
        return this.f29046g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9063a) {
            C9063a aVar = (C9063a) obj;
            if (C8298k.m12937b(this.f29040a, aVar.f29040a) && m10578d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final List<EnumC9064a0> m10576f() {
        return this.f29041b;
    }

    public final Proxy m10575g() {
        return this.f29049j;
    }

    public final AbstractC9066b m10574h() {
        return this.f29048i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f29040a.hashCode()) * 31) + this.f29043d.hashCode()) * 31) + this.f29048i.hashCode()) * 31) + this.f29041b.hashCode()) * 31) + this.f29042c.hashCode()) * 31) + this.f29050k.hashCode()) * 31) + Objects.hashCode(this.f29049j)) * 31) + Objects.hashCode(this.f29045f)) * 31) + Objects.hashCode(this.f29046g)) * 31) + Objects.hashCode(this.f29047h);
    }

    public final ProxySelector m10573i() {
        return this.f29050k;
    }

    public final SocketFactory m10572j() {
        return this.f29044e;
    }

    public final SSLSocketFactory m10571k() {
        return this.f29045f;
    }

    public final C9125w m10570l() {
        return this.f29040a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f29040a.m10347h());
        sb3.append(':');
        sb3.append(this.f29040a.m10343l());
        sb3.append(", ");
        if (this.f29049j != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f29049j;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f29050k;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append("}");
        return sb3.toString();
    }
}
