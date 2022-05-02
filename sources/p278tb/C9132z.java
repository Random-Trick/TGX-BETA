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
    public final List<AbstractC9129x> f29362M;
    public final AbstractC9114t.AbstractC9117c f29363N;
    public final boolean f29364O;
    public final AbstractC9066b f29365P;
    public final boolean f29366Q;
    public final boolean f29367R;
    public final AbstractC9106p f29368S;
    public final C9071c f29369T;
    public final AbstractC9111s f29370U;
    public final Proxy f29371V;
    public final ProxySelector f29372W;
    public final AbstractC9066b f29373X;
    public final SocketFactory f29374Y;
    public final SSLSocketFactory f29375Z;
    public final C9110r f29376a;
    public final X509TrustManager f29377a0;
    public final C9098k f29378b;
    public final List<C9099l> f29379b0;
    public final List<AbstractC9129x> f29380c;
    public final List<EnumC9064a0> f29381c0;
    public final HostnameVerifier f29382d0;
    public final C9086g f29383e0;
    public final AbstractC4349c f29384f0;
    public final int f29385g0;
    public final int f29386h0;
    public final int f29387i0;
    public final int f29388j0;
    public final int f29389k0;
    public final long f29390l0;
    public final C10494i f29391m0;
    public static final C9134b f29361p0 = new C9134b(null);
    public static final List<EnumC9064a0> f29359n0 = C9489b.m8504t(EnumC9064a0.HTTP_2, EnumC9064a0.HTTP_1_1);
    public static final List<C9099l> f29360o0 = C9489b.m8504t(C9099l.f29288h, C9099l.f29290j);

    public static final class C9133a {
        public int f29393B;
        public C10494i f29395D;
        public AbstractC9066b f29402g;
        public C9071c f29406k;
        public Proxy f29408m;
        public ProxySelector f29409n;
        public AbstractC9066b f29410o;
        public SocketFactory f29411p;
        public SSLSocketFactory f29412q;
        public X509TrustManager f29413r;
        public List<C9099l> f29414s;
        public List<? extends EnumC9064a0> f29415t;
        public AbstractC4349c f29418w;
        public int f29419x;
        public C9110r f29396a = new C9110r();
        public C9098k f29397b = new C9098k();
        public final List<AbstractC9129x> f29398c = new ArrayList();
        public final List<AbstractC9129x> f29399d = new ArrayList();
        public AbstractC9114t.AbstractC9117c f29400e = C9489b.m8519e(AbstractC9114t.f29326a);
        public boolean f29401f = true;
        public boolean f29403h = true;
        public boolean f29404i = true;
        public AbstractC9106p f29405j = AbstractC9106p.f29314a;
        public AbstractC9111s f29407l = AbstractC9111s.f29324a;
        public HostnameVerifier f29416u = C4351d.f14427a;
        public C9086g f29417v = C9086g.f29140c;
        public int f29420y = 10000;
        public int f29421z = 10000;
        public int f29392A = 10000;
        public long f29394C = 1024;

        public C9133a() {
            AbstractC9066b bVar = AbstractC9066b.f29063a;
            this.f29402g = bVar;
            this.f29410o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C8298k.m12934d(socketFactory, "SocketFactory.getDefault()");
            this.f29411p = socketFactory;
            C9134b bVar2 = C9132z.f29361p0;
            this.f29414s = bVar2.m10228a();
            this.f29415t = bVar2.m10227b();
        }

        public final boolean m10262A() {
            return this.f29401f;
        }

        public final C10494i m10261B() {
            return this.f29395D;
        }

        public final SocketFactory m10260C() {
            return this.f29411p;
        }

        public final SSLSocketFactory m10259D() {
            return this.f29412q;
        }

        public final int m10258E() {
            return this.f29392A;
        }

        public final X509TrustManager m10257F() {
            return this.f29413r;
        }

        public final C9133a m10256G(long j, TimeUnit timeUnit) {
            C8298k.m12933e(timeUnit, "unit");
            this.f29421z = C9489b.m8516h("timeout", j, timeUnit);
            return this;
        }

        public final C9133a m10255H(long j, TimeUnit timeUnit) {
            C8298k.m12933e(timeUnit, "unit");
            this.f29392A = C9489b.m8516h("timeout", j, timeUnit);
            return this;
        }

        public final C9132z m10254a() {
            return new C9132z(this);
        }

        public final C9133a m10253b(long j, TimeUnit timeUnit) {
            C8298k.m12933e(timeUnit, "unit");
            this.f29420y = C9489b.m8516h("timeout", j, timeUnit);
            return this;
        }

        public final AbstractC9066b m10252c() {
            return this.f29402g;
        }

        public final C9071c m10251d() {
            return this.f29406k;
        }

        public final int m10250e() {
            return this.f29419x;
        }

        public final AbstractC4349c m10249f() {
            return this.f29418w;
        }

        public final C9086g m10248g() {
            return this.f29417v;
        }

        public final int m10247h() {
            return this.f29420y;
        }

        public final C9098k m10246i() {
            return this.f29397b;
        }

        public final List<C9099l> m10245j() {
            return this.f29414s;
        }

        public final AbstractC9106p m10244k() {
            return this.f29405j;
        }

        public final C9110r m10243l() {
            return this.f29396a;
        }

        public final AbstractC9111s m10242m() {
            return this.f29407l;
        }

        public final AbstractC9114t.AbstractC9117c m10241n() {
            return this.f29400e;
        }

        public final boolean m10240o() {
            return this.f29403h;
        }

        public final boolean m10239p() {
            return this.f29404i;
        }

        public final HostnameVerifier m10238q() {
            return this.f29416u;
        }

        public final List<AbstractC9129x> m10237r() {
            return this.f29398c;
        }

        public final long m10236s() {
            return this.f29394C;
        }

        public final List<AbstractC9129x> m10235t() {
            return this.f29399d;
        }

        public final int m10234u() {
            return this.f29393B;
        }

        public final List<EnumC9064a0> m10233v() {
            return this.f29415t;
        }

        public final Proxy m10232w() {
            return this.f29408m;
        }

        public final AbstractC9066b m10231x() {
            return this.f29410o;
        }

        public final ProxySelector m10230y() {
            return this.f29409n;
        }

        public final int m10229z() {
            return this.f29421z;
        }
    }

    public static final class C9134b {
        public C9134b() {
        }

        public final List<C9099l> m10228a() {
            return C9132z.f29360o0;
        }

        public final List<EnumC9064a0> m10227b() {
            return C9132z.f29359n0;
        }

        public C9134b(C8294g gVar) {
            this();
        }
    }

    public C9132z(C9133a aVar) {
        ProxySelector proxySelector;
        C8298k.m12933e(aVar, "builder");
        this.f29376a = aVar.m10243l();
        this.f29378b = aVar.m10246i();
        this.f29380c = C9489b.m8531N(aVar.m10237r());
        this.f29362M = C9489b.m8531N(aVar.m10235t());
        this.f29363N = aVar.m10241n();
        this.f29364O = aVar.m10262A();
        this.f29365P = aVar.m10252c();
        this.f29366Q = aVar.m10240o();
        this.f29367R = aVar.m10239p();
        this.f29368S = aVar.m10244k();
        aVar.m10251d();
        this.f29370U = aVar.m10242m();
        this.f29371V = aVar.m10232w();
        if (aVar.m10232w() != null) {
            proxySelector = C4182a.f14082a;
        } else {
            proxySelector = aVar.m10230y();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = C4182a.f14082a;
            }
        }
        this.f29372W = proxySelector;
        this.f29373X = aVar.m10231x();
        this.f29374Y = aVar.m10260C();
        List<C9099l> j = aVar.m10245j();
        this.f29379b0 = j;
        this.f29381c0 = aVar.m10233v();
        this.f29382d0 = aVar.m10238q();
        this.f29385g0 = aVar.m10250e();
        this.f29386h0 = aVar.m10247h();
        this.f29387i0 = aVar.m10229z();
        this.f29388j0 = aVar.m10258E();
        this.f29389k0 = aVar.m10234u();
        this.f29390l0 = aVar.m10236s();
        C10494i B = aVar.m10261B();
        this.f29391m0 = B == null ? new C10494i() : B;
        boolean z = true;
        if (!(j instanceof Collection) || !j.isEmpty()) {
            Iterator<T> it = j.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C9099l) it.next()).m10447f()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.f29375Z = null;
            this.f29384f0 = null;
            this.f29377a0 = null;
            this.f29383e0 = C9086g.f29140c;
        } else if (aVar.m10259D() != null) {
            this.f29375Z = aVar.m10259D();
            AbstractC4349c f = aVar.m10249f();
            C8298k.m12935c(f);
            this.f29384f0 = f;
            X509TrustManager F = aVar.m10257F();
            C8298k.m12935c(F);
            this.f29377a0 = F;
            C9086g g = aVar.m10248g();
            C8298k.m12935c(f);
            this.f29383e0 = g.m10476e(f);
        } else {
            C2083h.C2084a aVar2 = C2083h.f7326c;
            X509TrustManager o = aVar2.m35677g().mo35684o();
            this.f29377a0 = o;
            C2083h g2 = aVar2.m35677g();
            C8298k.m12935c(o);
            this.f29375Z = g2.mo35685n(o);
            AbstractC4349c.C4350a aVar3 = AbstractC4349c.f14426a;
            C8298k.m12935c(o);
            AbstractC4349c a = aVar3.m28223a(o);
            this.f29384f0 = a;
            C9086g g3 = aVar.m10248g();
            C8298k.m12935c(a);
            this.f29383e0 = g3.m10476e(a);
        }
        m10288F();
    }

    public final ProxySelector m10293A() {
        return this.f29372W;
    }

    public final int m10292B() {
        return this.f29387i0;
    }

    public final boolean m10291C() {
        return this.f29364O;
    }

    public final SocketFactory m10290D() {
        return this.f29374Y;
    }

    public final SSLSocketFactory m10289E() {
        SSLSocketFactory sSLSocketFactory = this.f29375Z;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final void m10288F() {
        boolean z;
        List<AbstractC9129x> list = this.f29380c;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        boolean z2 = true;
        if (!list.contains(null)) {
            List<AbstractC9129x> list2 = this.f29362M;
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list2.contains(null)) {
                List<C9099l> list3 = this.f29379b0;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (C9099l lVar : list3) {
                        if (lVar.m10447f()) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    if (!(this.f29375Z == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (this.f29384f0 == null) {
                        if (this.f29377a0 != null) {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (!C8298k.m12936b(this.f29383e0, C9086g.f29140c)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else if (this.f29375Z == null) {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                } else if (this.f29384f0 == null) {
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                } else if (this.f29377a0 == null) {
                    throw new IllegalStateException("x509TrustManager == null".toString());
                }
            } else {
                throw new IllegalStateException(("Null network interceptor: " + this.f29362M).toString());
            }
        } else {
            throw new IllegalStateException(("Null interceptor: " + this.f29380c).toString());
        }
    }

    public final int m10287G() {
        return this.f29388j0;
    }

    public final AbstractC9066b m10284c() {
        return this.f29365P;
    }

    public Object clone() {
        return super.clone();
    }

    public final C9071c m10283d() {
        return this.f29369T;
    }

    public final int m10282e() {
        return this.f29385g0;
    }

    public final C9086g m10281f() {
        return this.f29383e0;
    }

    public final int m10280g() {
        return this.f29386h0;
    }

    public final C9098k m10279h() {
        return this.f29378b;
    }

    public final List<C9099l> m10278i() {
        return this.f29379b0;
    }

    public final AbstractC9106p m10277j() {
        return this.f29368S;
    }

    public final C9110r m10276k() {
        return this.f29376a;
    }

    public final AbstractC9111s m10275l() {
        return this.f29370U;
    }

    public final AbstractC9114t.AbstractC9117c m10274n() {
        return this.f29363N;
    }

    public final boolean m10273o() {
        return this.f29366Q;
    }

    public final boolean m10272p() {
        return this.f29367R;
    }

    public final C10494i m10271q() {
        return this.f29391m0;
    }

    public final HostnameVerifier m10270r() {
        return this.f29382d0;
    }

    public final List<AbstractC9129x> m10269s() {
        return this.f29380c;
    }

    public final List<AbstractC9129x> m10268u() {
        return this.f29362M;
    }

    public AbstractC9080e m10267v(C9069b0 b0Var) {
        C8298k.m12933e(b0Var, "request");
        return new C10482e(this, b0Var, false);
    }

    public final int m10266w() {
        return this.f29389k0;
    }

    public final List<EnumC9064a0> m10265x() {
        return this.f29381c0;
    }

    public final Proxy m10264y() {
        return this.f29371V;
    }

    public final AbstractC9066b m10263z() {
        return this.f29373X;
    }

    public C9132z() {
        this(new C9133a());
    }
}
