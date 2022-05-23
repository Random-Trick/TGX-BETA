package zb;

import ja.m;
import ja.n;
import ja.s;
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
import ra.g;
import ra.l;
import ub.e;
import ub.f0;
import ub.t;
import ub.w;

public final class k {
    public static final a f27133i = new a(null);
    public int f27135b;
    public final ub.a f27138e;
    public final i f27139f;
    public final e f27140g;
    public final t f27141h;
    public List<? extends Proxy> f27134a = n.f();
    public List<? extends InetSocketAddress> f27136c = n.f();
    public final List<f0> f27137d = new ArrayList();

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            ra.k.e(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                ra.k.d(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            ra.k.d(hostName, "hostName");
            return hostName;
        }
    }

    public static final class b {
        public int f27142a;
        public final List<f0> f27143b;

        public b(List<f0> list) {
            ra.k.e(list, "routes");
            this.f27143b = list;
        }

        public final List<f0> a() {
            return this.f27143b;
        }

        public final boolean b() {
            return this.f27142a < this.f27143b.size();
        }

        public final f0 c() {
            if (b()) {
                List<f0> list = this.f27143b;
                int i10 = this.f27142a;
                this.f27142a = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public static final class c extends l implements qa.a<List<? extends Proxy>> {
        public final w M;
        public final Proxy f27145c;

        public c(Proxy proxy, w wVar) {
            super(0);
            this.f27145c = proxy;
            this.M = wVar;
        }

        public final List<Proxy> b() {
            Proxy proxy = this.f27145c;
            if (proxy != null) {
                return m.b(proxy);
            }
            URI q10 = this.M.q();
            if (q10.getHost() == null) {
                return vb.b.t(Proxy.NO_PROXY);
            }
            List<Proxy> select = k.this.f27138e.i().select(q10);
            return select == null || select.isEmpty() ? vb.b.t(Proxy.NO_PROXY) : vb.b.N(select);
        }
    }

    public k(ub.a aVar, i iVar, e eVar, t tVar) {
        ra.k.e(aVar, "address");
        ra.k.e(iVar, "routeDatabase");
        ra.k.e(eVar, "call");
        ra.k.e(tVar, "eventListener");
        this.f27138e = aVar;
        this.f27139f = iVar;
        this.f27140g = eVar;
        this.f27141h = tVar;
        g(aVar.l(), aVar.g());
    }

    public final boolean b() {
        return c() || (this.f27137d.isEmpty() ^ true);
    }

    public final boolean c() {
        return this.f27135b < this.f27134a.size();
    }

    public final b d() {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy e10 = e();
                for (InetSocketAddress inetSocketAddress : this.f27136c) {
                    f0 f0Var = new f0(this.f27138e, e10, inetSocketAddress);
                    if (this.f27139f.c(f0Var)) {
                        this.f27137d.add(f0Var);
                    } else {
                        arrayList.add(f0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                s.r(arrayList, this.f27137d);
                this.f27137d.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }

    public final Proxy e() {
        if (c()) {
            List<? extends Proxy> list = this.f27134a;
            int i10 = this.f27135b;
            this.f27135b = i10 + 1;
            Proxy proxy = list.get(i10);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f27138e.l().h() + "; exhausted proxy configurations: " + this.f27134a);
    }

    public final void f(Proxy proxy) {
        String str;
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f27136c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f27138e.l().h();
            i10 = this.f27138e.l().l();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = f27133i.a(inetSocketAddress);
                i10 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        }
        if (1 > i10 || 65535 < i10) {
            throw new SocketException("No route to " + str + ':' + i10 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i10));
        } else {
            this.f27141h.m(this.f27140g, str);
            List<InetAddress> a10 = this.f27138e.c().a(str);
            if (!a10.isEmpty()) {
                this.f27141h.l(this.f27140g, str, a10);
                for (InetAddress inetAddress : a10) {
                    arrayList.add(new InetSocketAddress(inetAddress, i10));
                }
                return;
            }
            throw new UnknownHostException(this.f27138e.c() + " returned no addresses for " + str);
        }
    }

    public final void g(w wVar, Proxy proxy) {
        c cVar = new c(proxy, wVar);
        this.f27141h.o(this.f27140g, wVar);
        List<Proxy> f10 = cVar.b();
        this.f27134a = f10;
        this.f27135b = 0;
        this.f27141h.n(this.f27140g, wVar, f10);
    }
}
