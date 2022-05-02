package p348yb;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p123ia.C5303m;
import p123ia.C5304n;
import p123ia.C5309s;
import p278tb.AbstractC9080e;
import p278tb.AbstractC9114t;
import p278tb.C9063a;
import p278tb.C9085f0;
import p278tb.C9125w;
import p290ub.C9489b;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;

public final class C10496k {
    public static final C10497a f33646i = new C10497a(null);
    public int f33648b;
    public final C9063a f33651e;
    public final C10494i f33652f;
    public final AbstractC9080e f33653g;
    public final AbstractC9114t f33654h;
    public List<? extends Proxy> f33647a = C5304n.m23366f();
    public List<? extends InetSocketAddress> f33649c = C5304n.m23366f();
    public final List<C9085f0> f33650d = new ArrayList();

    public static final class C10497a {
        public C10497a() {
        }

        public final String m4929a(InetSocketAddress inetSocketAddress) {
            C8298k.m12934e(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                C8298k.m12935d(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            C8298k.m12935d(hostName, "hostName");
            return hostName;
        }

        public C10497a(C8294g gVar) {
            this();
        }
    }

    public static final class C10498b {
        public int f33655a;
        public final List<C9085f0> f33656b;

        public C10498b(List<C9085f0> list) {
            C8298k.m12934e(list, "routes");
            this.f33656b = list;
        }

        public final List<C9085f0> m4928a() {
            return this.f33656b;
        }

        public final boolean m4927b() {
            return this.f33655a < this.f33656b.size();
        }

        public final C9085f0 m4926c() {
            if (m4927b()) {
                List<C9085f0> list = this.f33656b;
                int i = this.f33655a;
                this.f33655a = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public static final class C10499c extends AbstractC8299l implements AbstractC8077a<List<? extends Proxy>> {
        public final C9125w f33657M;
        public final Proxy f33659c;

        public C10499c(Proxy proxy, C9125w wVar) {
            super(0);
            this.f33659c = proxy;
            this.f33657M = wVar;
        }

        public final List<Proxy> mo4925b() {
            Proxy proxy = this.f33659c;
            if (proxy != null) {
                return C5303m.m23370b(proxy);
            }
            URI q = this.f33657M.m10338q();
            if (q.getHost() == null) {
                return C9489b.m8504t(Proxy.NO_PROXY);
            }
            List<Proxy> select = C10496k.this.f33651e.m10573i().select(q);
            return select == null || select.isEmpty() ? C9489b.m8504t(Proxy.NO_PROXY) : C9489b.m8531N(select);
        }
    }

    public C10496k(C9063a aVar, C10494i iVar, AbstractC9080e eVar, AbstractC9114t tVar) {
        C8298k.m12934e(aVar, "address");
        C8298k.m12934e(iVar, "routeDatabase");
        C8298k.m12934e(eVar, "call");
        C8298k.m12934e(tVar, "eventListener");
        this.f33651e = aVar;
        this.f33652f = iVar;
        this.f33653g = eVar;
        this.f33654h = tVar;
        m4930g(aVar.m10570l(), aVar.m10575g());
    }

    public final boolean m4935b() {
        return m4934c() || (this.f33650d.isEmpty() ^ true);
    }

    public final boolean m4934c() {
        return this.f33648b < this.f33647a.size();
    }

    public final C10498b m4933d() {
        if (m4935b()) {
            ArrayList arrayList = new ArrayList();
            while (m4934c()) {
                Proxy e = m4932e();
                for (InetSocketAddress inetSocketAddress : this.f33649c) {
                    C9085f0 f0Var = new C9085f0(this.f33651e, e, inetSocketAddress);
                    if (this.f33652f.m4940c(f0Var)) {
                        this.f33650d.add(f0Var);
                    } else {
                        arrayList.add(f0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                C5309s.m23354r(arrayList, this.f33650d);
                this.f33650d.clear();
            }
            return new C10498b(arrayList);
        }
        throw new NoSuchElementException();
    }

    public final Proxy m4932e() {
        if (m4934c()) {
            List<? extends Proxy> list = this.f33647a;
            int i = this.f33648b;
            this.f33648b = i + 1;
            Proxy proxy = list.get(i);
            m4931f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f33651e.m10570l().m10347h() + "; exhausted proxy configurations: " + this.f33647a);
    }

    public final void m4931f(Proxy proxy) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        this.f33649c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f33651e.m10570l().m10347h();
            i = this.f33651e.m10570l().m10343l();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = f33646i.m4929a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        }
        if (1 > i || 65535 < i) {
            throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f33654h.m10396m(this.f33653g, str);
            List<InetAddress> a = this.f33651e.m10579c().mo10411a(str);
            if (!a.isEmpty()) {
                this.f33654h.m10397l(this.f33653g, str, a);
                for (InetAddress inetAddress : a) {
                    arrayList.add(new InetSocketAddress(inetAddress, i));
                }
                return;
            }
            throw new UnknownHostException(this.f33651e.m10579c() + " returned no addresses for " + str);
        }
    }

    public final void m4930g(C9125w wVar, Proxy proxy) {
        C10499c cVar = new C10499c(proxy, wVar);
        this.f33654h.m10394o(this.f33653g, wVar);
        List<Proxy> f = cVar.mo4925b();
        this.f33647a = f;
        this.f33648b = 0;
        this.f33654h.m10395n(this.f33653g, wVar, f);
    }
}
