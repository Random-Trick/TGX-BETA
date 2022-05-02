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
    public static final C10497a f33649i = new C10497a(null);
    public int f33651b;
    public final C9063a f33654e;
    public final C10494i f33655f;
    public final AbstractC9080e f33656g;
    public final AbstractC9114t f33657h;
    public List<? extends Proxy> f33650a = C5304n.m23367f();
    public List<? extends InetSocketAddress> f33652c = C5304n.m23367f();
    public final List<C9085f0> f33653d = new ArrayList();

    public static final class C10497a {
        public C10497a() {
        }

        public final String m4929a(InetSocketAddress inetSocketAddress) {
            C8298k.m12933e(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                C8298k.m12934d(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            C8298k.m12934d(hostName, "hostName");
            return hostName;
        }

        public C10497a(C8294g gVar) {
            this();
        }
    }

    public static final class C10498b {
        public int f33658a;
        public final List<C9085f0> f33659b;

        public C10498b(List<C9085f0> list) {
            C8298k.m12933e(list, "routes");
            this.f33659b = list;
        }

        public final List<C9085f0> m4928a() {
            return this.f33659b;
        }

        public final boolean m4927b() {
            return this.f33658a < this.f33659b.size();
        }

        public final C9085f0 m4926c() {
            if (m4927b()) {
                List<C9085f0> list = this.f33659b;
                int i = this.f33658a;
                this.f33658a = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public static final class C10499c extends AbstractC8299l implements AbstractC8077a<List<? extends Proxy>> {
        public final C9125w f33660M;
        public final Proxy f33662c;

        public C10499c(Proxy proxy, C9125w wVar) {
            super(0);
            this.f33662c = proxy;
            this.f33660M = wVar;
        }

        public final List<Proxy> mo4925b() {
            Proxy proxy = this.f33662c;
            if (proxy != null) {
                return C5303m.m23371b(proxy);
            }
            URI q = this.f33660M.m10337q();
            if (q.getHost() == null) {
                return C9489b.m8504t(Proxy.NO_PROXY);
            }
            List<Proxy> select = C10496k.this.f33654e.m10572i().select(q);
            return select == null || select.isEmpty() ? C9489b.m8504t(Proxy.NO_PROXY) : C9489b.m8531N(select);
        }
    }

    public C10496k(C9063a aVar, C10494i iVar, AbstractC9080e eVar, AbstractC9114t tVar) {
        C8298k.m12933e(aVar, "address");
        C8298k.m12933e(iVar, "routeDatabase");
        C8298k.m12933e(eVar, "call");
        C8298k.m12933e(tVar, "eventListener");
        this.f33654e = aVar;
        this.f33655f = iVar;
        this.f33656g = eVar;
        this.f33657h = tVar;
        m4930g(aVar.m10569l(), aVar.m10574g());
    }

    public final boolean m4935b() {
        return m4934c() || (this.f33653d.isEmpty() ^ true);
    }

    public final boolean m4934c() {
        return this.f33651b < this.f33650a.size();
    }

    public final C10498b m4933d() {
        if (m4935b()) {
            ArrayList arrayList = new ArrayList();
            while (m4934c()) {
                Proxy e = m4932e();
                for (InetSocketAddress inetSocketAddress : this.f33652c) {
                    C9085f0 f0Var = new C9085f0(this.f33654e, e, inetSocketAddress);
                    if (this.f33655f.m4940c(f0Var)) {
                        this.f33653d.add(f0Var);
                    } else {
                        arrayList.add(f0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                C5309s.m23355r(arrayList, this.f33653d);
                this.f33653d.clear();
            }
            return new C10498b(arrayList);
        }
        throw new NoSuchElementException();
    }

    public final Proxy m4932e() {
        if (m4934c()) {
            List<? extends Proxy> list = this.f33650a;
            int i = this.f33651b;
            this.f33651b = i + 1;
            Proxy proxy = list.get(i);
            m4931f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f33654e.m10569l().m10346h() + "; exhausted proxy configurations: " + this.f33650a);
    }

    public final void m4931f(Proxy proxy) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        this.f33652c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f33654e.m10569l().m10346h();
            i = this.f33654e.m10569l().m10342l();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = f33649i.m4929a(inetSocketAddress);
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
            this.f33657h.m10395m(this.f33656g, str);
            List<InetAddress> a = this.f33654e.m10578c().mo10410a(str);
            if (!a.isEmpty()) {
                this.f33657h.m10396l(this.f33656g, str, a);
                for (InetAddress inetAddress : a) {
                    arrayList.add(new InetSocketAddress(inetAddress, i));
                }
                return;
            }
            throw new UnknownHostException(this.f33654e.m10578c() + " returned no addresses for " + str);
        }
    }

    public final void m4930g(C9125w wVar, Proxy proxy) {
        C10499c cVar = new C10499c(proxy, wVar);
        this.f33657h.m10393o(this.f33656g, wVar);
        List<Proxy> f = cVar.mo4925b();
        this.f33650a = f;
        this.f33651b = 0;
        this.f33657h.m10394n(this.f33656g, wVar, f);
    }
}
