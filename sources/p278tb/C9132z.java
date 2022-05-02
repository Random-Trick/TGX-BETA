package p278tb;

import cc.C2083h;
import ec.C4182a;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p081fc.AbstractC4349c;
import p081fc.C4351d;
import p278tb.AbstractC9114t;
import p290ub.C9489b;
import p348yb.C10482e;
import p348yb.C10494i;
import qa.C8294g;
import qa.C8298k;

public class C9132z implements Cloneable {
    public final List<AbstractC9129x> f29359M;
    public final AbstractC9114t.AbstractC9117c f29360N;
    public final boolean f29361O;
    public final AbstractC9066b f29362P;
    public final boolean f29363Q;
    public final boolean f29364R;
    public final AbstractC9106p f29365S;
    public final C9071c f29366T;
    public final AbstractC9111s f29367U;
    public final Proxy f29368V;
    public final ProxySelector f29369W;
    public final AbstractC9066b f29370X;
    public final SocketFactory f29371Y;
    public final SSLSocketFactory f29372Z;
    public final C9110r f29373a;
    public final X509TrustManager f29374a0;
    public final C9098k f29375b;
    public final List<C9099l> f29376b0;
    public final List<AbstractC9129x> f29377c;
    public final List<EnumC9064a0> f29378c0;
    public final HostnameVerifier f29379d0;
    public final C9086g f29380e0;
    public final AbstractC4349c f29381f0;
    public final int f29382g0;
    public final int f29383h0;
    public final int f29384i0;
    public final int f29385j0;
    public final int f29386k0;
    public final long f29387l0;
    public final C10494i f29388m0;
    public static final C9134b f29358p0 = new C9134b(null);
    public static final List<EnumC9064a0> f29356n0 = C9489b.m8504t(EnumC9064a0.HTTP_2, EnumC9064a0.HTTP_1_1);
    public static final List<C9099l> f29357o0 = C9489b.m8504t(C9099l.f29285h, C9099l.f29287j);

    public static final class C9133a {
        public int f29390B;
        public C10494i f29392D;
        public AbstractC9066b f29399g;
        public C9071c f29403k;
        public Proxy f29405m;
        public ProxySelector f29406n;
        public AbstractC9066b f29407o;
        public SocketFactory f29408p;
        public SSLSocketFactory f29409q;
        public X509TrustManager f29410r;
        public List<C9099l> f29411s;
        public List<? extends EnumC9064a0> f29412t;
        public AbstractC4349c f29415w;
        public int f29416x;
        public C9110r f29393a = new C9110r();
        public C9098k f29394b = new C9098k();
        public final List<AbstractC9129x> f29395c = new ArrayList();
        public final List<AbstractC9129x> f29396d = new ArrayList();
        public AbstractC9114t.AbstractC9117c f29397e = C9489b.m8519e(AbstractC9114t.f29323a);
        public boolean f29398f = true;
        public boolean f29400h = true;
        public boolean f29401i = true;
        public AbstractC9106p f29402j = AbstractC9106p.f29311a;
        public AbstractC9111s f29404l = AbstractC9111s.f29321a;
        public HostnameVerifier f29413u = C4351d.f14427a;
        public C9086g f29414v = C9086g.f29137c;
        public int f29417y = 10000;
        public int f29418z = 10000;
        public int f29389A = 10000;
        public long f29391C = 1024;

        public C9133a() {
            AbstractC9066b bVar = AbstractC9066b.f29060a;
            this.f29399g = bVar;
            this.f29407o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C8298k.m12935d(socketFactory, "SocketFactory.getDefault()");
            this.f29408p = socketFactory;
            C9134b bVar2 = C9132z.f29358p0;
            this.f29411s = bVar2.m10229a();
            this.f29412t = bVar2.m10228b();
        }

        public final boolean m10263A() {
            return this.f29398f;
        }

        public final C10494i m10262B() {
            return this.f29392D;
        }

        public final SocketFactory m10261C() {
            return this.f29408p;
        }

        public final SSLSocketFactory m10260D() {
            return this.f29409q;
        }

        public final int m10259E() {
            return this.f29389A;
        }

        public final X509TrustManager m10258F() {
            return this.f29410r;
        }

        public final C9133a m10257G(long j, TimeUnit timeUnit) {
            C8298k.m12934e(timeUnit, "unit");
            this.f29418z = C9489b.m8516h("timeout", j, timeUnit);
            return this;
        }

        public final C9133a m10256H(long j, TimeUnit timeUnit) {
            C8298k.m12934e(timeUnit, "unit");
            this.f29389A = C9489b.m8516h("timeout", j, timeUnit);
            return this;
        }

        public final C9132z m10255a() {
            return new C9132z(this);
        }

        public final C9133a m10254b(long j, TimeUnit timeUnit) {
            C8298k.m12934e(timeUnit, "unit");
            this.f29417y = C9489b.m8516h("timeout", j, timeUnit);
            return this;
        }

        public final AbstractC9066b m10253c() {
            return this.f29399g;
        }

        public final C9071c m10252d() {
            return this.f29403k;
        }

        public final int m10251e() {
            return this.f29416x;
        }

        public final AbstractC4349c m10250f() {
            return this.f29415w;
        }

        public final C9086g m10249g() {
            return this.f29414v;
        }

        public final int m10248h() {
            return this.f29417y;
        }

        public final C9098k m10247i() {
            return this.f29394b;
        }

        public final List<C9099l> m10246j() {
            return this.f29411s;
        }

        public final AbstractC9106p m10245k() {
            return this.f29402j;
        }

        public final C9110r m10244l() {
            return this.f29393a;
        }

        public final AbstractC9111s m10243m() {
            return this.f29404l;
        }

        public final AbstractC9114t.AbstractC9117c m10242n() {
            return this.f29397e;
        }

        public final boolean m10241o() {
            return this.f29400h;
        }

        public final boolean m10240p() {
            return this.f29401i;
        }

        public final HostnameVerifier m10239q() {
            return this.f29413u;
        }

        public final List<AbstractC9129x> m10238r() {
            return this.f29395c;
        }

        public final long m10237s() {
            return this.f29391C;
        }

        public final List<AbstractC9129x> m10236t() {
            return this.f29396d;
        }

        public final int m10235u() {
            return this.f29390B;
        }

        public final List<EnumC9064a0> m10234v() {
            return this.f29412t;
        }

        public final Proxy m10233w() {
            return this.f29405m;
        }

        public final AbstractC9066b m10232x() {
            return this.f29407o;
        }

        public final ProxySelector m10231y() {
            return this.f29406n;
        }

        public final int m10230z() {
            return this.f29418z;
        }
    }

    public static final class C9134b {
        public C9134b() {
        }

        public final List<C9099l> m10229a() {
            return C9132z.f29357o0;
        }

        public final List<EnumC9064a0> m10228b() {
            return C9132z.f29356n0;
        }

        public C9134b(C8294g gVar) {
            this();
        }
    }

    public C9132z(C9133a aVar) {
        ProxySelector proxySelector;
        C8298k.m12934e(aVar, "builder");
        this.f29373a = aVar.m10244l();
        this.f29375b = aVar.m10247i();
        this.f29377c = C9489b.m8531N(aVar.m10238r());
        this.f29359M = C9489b.m8531N(aVar.m10236t());
        this.f29360N = aVar.m10242n();
        this.f29361O = aVar.m10263A();
        this.f29362P = aVar.m10253c();
        this.f29363Q = aVar.m10241o();
        this.f29364R = aVar.m10240p();
        this.f29365S = aVar.m10245k();
        aVar.m10252d();
        this.f29367U = aVar.m10243m();
        this.f29368V = aVar.m10233w();
        if (aVar.m10233w() != null) {
            proxySelector = C4182a.f14082a;
        } else {
            proxySelector = aVar.m10231y();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C4182a.f14082a;
            }
        }
        this.f29369W = proxySelector;
        this.f29370X = aVar.m10232x();
        this.f29371Y = aVar.m10261C();
        List<C9099l> j = aVar.m10246j();
        this.f29376b0 = j;
        this.f29378c0 = aVar.m10234v();
        this.f29379d0 = aVar.m10239q();
        this.f29382g0 = aVar.m10251e();
        this.f29383h0 = aVar.m10248h();
        this.f29384i0 = aVar.m10230z();
        this.f29385j0 = aVar.m10259E();
        this.f29386k0 = aVar.m10235u();
        this.f29387l0 = aVar.m10237s();
        C10494i B = aVar.m10262B();
        this.f29388m0 = B == null ? new C10494i() : B;
        boolean z = true;
        if (!(j instanceof Collection) || !j.isEmpty()) {
            Iterator<T> it = j.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C9099l) it.next()).m10448f()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.f29372Z = null;
            this.f29381f0 = null;
            this.f29374a0 = null;
            this.f29380e0 = C9086g.f29137c;
        } else if (aVar.m10260D() != null) {
            this.f29372Z = aVar.m10260D();
            AbstractC4349c f = aVar.m10250f();
            C8298k.m12936c(f);
            this.f29381f0 = f;
            X509TrustManager F = aVar.m10258F();
            C8298k.m12936c(F);
            this.f29374a0 = F;
            C9086g g = aVar.m10249g();
            C8298k.m12936c(f);
            this.f29380e0 = g.m10477e(f);
        } else {
            C2083h.C2084a aVar2 = C2083h.f7326c;
            X509TrustManager o = aVar2.m35674g().mo35681o();
            this.f29374a0 = o;
            C2083h g2 = aVar2.m35674g();
            C8298k.m12936c(o);
            this.f29372Z = g2.mo35682n(o);
            AbstractC4349c.C4350a aVar3 = AbstractC4349c.f14426a;
            C8298k.m12936c(o);
            AbstractC4349c a = aVar3.m28221a(o);
            this.f29381f0 = a;
            C9086g g3 = aVar.m10249g();
            C8298k.m12936c(a);
            this.f29380e0 = g3.m10477e(a);
        }
        m10289F();
    }

    public final ProxySelector m10294A() {
        return this.f29369W;
    }

    public final int m10293B() {
        return this.f29384i0;
    }

    public final boolean m10292C() {
        return this.f29361O;
    }

    public final SocketFactory m10291D() {
        return this.f29371Y;
    }

    public final SSLSocketFactory m10290E() {
        SSLSocketFactory sSLSocketFactory = this.f29372Z;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final void m10289F() {
        boolean z;
        List<AbstractC9129x> list = this.f29377c;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        boolean z2 = true;
        if (!list.contains(null)) {
            List<AbstractC9129x> list2 = this.f29359M;
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list2.contains(null)) {
                List<C9099l> list3 = this.f29376b0;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (C9099l lVar : list3) {
                        if (lVar.m10448f()) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    if (!(this.f29372Z == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (this.f29381f0 == null) {
                        if (this.f29374a0 != null) {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (!C8298k.m12937b(this.f29380e0, C9086g.f29137c)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else if (this.f29372Z == null) {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                } else if (this.f29381f0 == null) {
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                } else if (this.f29374a0 == null) {
                    throw new IllegalStateException("x509TrustManager == null".toString());
                }
            } else {
                throw new IllegalStateException(("Null network interceptor: " + this.f29359M).toString());
            }
        } else {
            throw new IllegalStateException(("Null interceptor: " + this.f29377c).toString());
        }
    }

    public final int m10288G() {
        return this.f29385j0;
    }

    public final AbstractC9066b m10285c() {
        return this.f29362P;
    }

    public Object clone() {
        return super.clone();
    }

    public final C9071c m10284d() {
        return this.f29366T;
    }

    public final int m10283e() {
        return this.f29382g0;
    }

    public final C9086g m10282f() {
        return this.f29380e0;
    }

    public final int m10281g() {
        return this.f29383h0;
    }

    public final C9098k m10280h() {
        return this.f29375b;
    }

    public final List<C9099l> m10279i() {
        return this.f29376b0;
    }

    public final AbstractC9106p m10278j() {
        return this.f29365S;
    }

    public final C9110r m10277k() {
        return this.f29373a;
    }

    public final AbstractC9111s m10276l() {
        return this.f29367U;
    }

    public final AbstractC9114t.AbstractC9117c m10275n() {
        return this.f29360N;
    }

    public final boolean m10274o() {
        return this.f29363Q;
    }

    public final boolean m10273p() {
        return this.f29364R;
    }

    public final C10494i m10272q() {
        return this.f29388m0;
    }

    public final HostnameVerifier m10271r() {
        return this.f29379d0;
    }

    public final List<AbstractC9129x> m10270s() {
        return this.f29377c;
    }

    public final List<AbstractC9129x> m10269u() {
        return this.f29359M;
    }

    public AbstractC9080e m10268v(C9069b0 b0Var) {
        C8298k.m12934e(b0Var, "request");
        return new C10482e(this, b0Var, false);
    }

    public final int m10267w() {
        return this.f29386k0;
    }

    public final List<EnumC9064a0> m10266x() {
        return this.f29378c0;
    }

    public final Proxy m10265y() {
        return this.f29368V;
    }

    public final AbstractC9066b m10264z() {
        return this.f29370X;
    }

    public C9132z() {
        this(new C9133a());
    }
}
