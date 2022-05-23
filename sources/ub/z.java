package ub;

import dc.h;
import gc.c;
import gc.d;
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
import ra.g;
import ra.k;
import ub.t;
import zb.e;
import zb.i;

public class z implements Cloneable {
    public final List<x> M;
    public final t.c N;
    public final boolean O;
    public final ub.b P;
    public final boolean Q;
    public final boolean R;
    public final p S;
    public final s T;
    public final Proxy U;
    public final ProxySelector V;
    public final ub.b W;
    public final SocketFactory X;
    public final SSLSocketFactory Y;
    public final X509TrustManager Z;
    public final r f23963a;
    public final List<l> f23964a0;
    public final k f23965b;
    public final List<a0> f23966b0;
    public final List<x> f23967c;
    public final HostnameVerifier f23968c0;
    public final g f23969d0;
    public final c f23970e0;
    public final int f23971f0;
    public final int f23972g0;
    public final int f23973h0;
    public final int f23974i0;
    public final int f23975j0;
    public final long f23976k0;
    public final i f23977l0;
    public static final b f23962o0 = new b(null);
    public static final List<a0> f23960m0 = vb.b.t(a0.HTTP_2, a0.HTTP_1_1);
    public static final List<l> f23961n0 = vb.b.t(l.f23889h, l.f23891j);

    public static final class a {
        public int A;
        public i C;
        public ub.b f23984g;
        public Proxy f23989l;
        public ProxySelector f23990m;
        public ub.b f23991n;
        public SocketFactory f23992o;
        public SSLSocketFactory f23993p;
        public X509TrustManager f23994q;
        public List<l> f23995r;
        public List<? extends a0> f23996s;
        public c f23999v;
        public int f24000w;
        public r f23978a = new r();
        public k f23979b = new k();
        public final List<x> f23980c = new ArrayList();
        public final List<x> f23981d = new ArrayList();
        public t.c f23982e = vb.b.e(t.f23927a);
        public boolean f23983f = true;
        public boolean f23985h = true;
        public boolean f23986i = true;
        public p f23987j = p.f23915a;
        public s f23988k = s.f23925a;
        public HostnameVerifier f23997t = d.f12196a;
        public g f23998u = g.f23799c;
        public int f24001x = 10000;
        public int f24002y = 10000;
        public int f24003z = 10000;
        public long B = 1024;

        public a() {
            ub.b bVar = ub.b.f23734a;
            this.f23984g = bVar;
            this.f23991n = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            k.d(socketFactory, "SocketFactory.getDefault()");
            this.f23992o = socketFactory;
            b bVar2 = z.f23962o0;
            this.f23995r = bVar2.a();
            this.f23996s = bVar2.b();
        }

        public final boolean A() {
            return this.f23983f;
        }

        public final i B() {
            return this.C;
        }

        public final SocketFactory C() {
            return this.f23992o;
        }

        public final SSLSocketFactory D() {
            return this.f23993p;
        }

        public final int E() {
            return this.f24003z;
        }

        public final X509TrustManager F() {
            return this.f23994q;
        }

        public final a G(long j10, TimeUnit timeUnit) {
            k.e(timeUnit, "unit");
            this.f24002y = vb.b.h("timeout", j10, timeUnit);
            return this;
        }

        public final a H(long j10, TimeUnit timeUnit) {
            k.e(timeUnit, "unit");
            this.f24003z = vb.b.h("timeout", j10, timeUnit);
            return this;
        }

        public final z a() {
            return new z(this);
        }

        public final a b(long j10, TimeUnit timeUnit) {
            k.e(timeUnit, "unit");
            this.f24001x = vb.b.h("timeout", j10, timeUnit);
            return this;
        }

        public final ub.b c() {
            return this.f23984g;
        }

        public final c d() {
            return null;
        }

        public final int e() {
            return this.f24000w;
        }

        public final c f() {
            return this.f23999v;
        }

        public final g g() {
            return this.f23998u;
        }

        public final int h() {
            return this.f24001x;
        }

        public final k i() {
            return this.f23979b;
        }

        public final List<l> j() {
            return this.f23995r;
        }

        public final p k() {
            return this.f23987j;
        }

        public final r l() {
            return this.f23978a;
        }

        public final s m() {
            return this.f23988k;
        }

        public final t.c n() {
            return this.f23982e;
        }

        public final boolean o() {
            return this.f23985h;
        }

        public final boolean p() {
            return this.f23986i;
        }

        public final HostnameVerifier q() {
            return this.f23997t;
        }

        public final List<x> r() {
            return this.f23980c;
        }

        public final long s() {
            return this.B;
        }

        public final List<x> t() {
            return this.f23981d;
        }

        public final int u() {
            return this.A;
        }

        public final List<a0> v() {
            return this.f23996s;
        }

        public final Proxy w() {
            return this.f23989l;
        }

        public final ub.b x() {
            return this.f23991n;
        }

        public final ProxySelector y() {
            return this.f23990m;
        }

        public final int z() {
            return this.f24002y;
        }
    }

    public static final class b {
        public b() {
        }

        public b(g gVar) {
            this();
        }

        public final List<l> a() {
            return z.f23961n0;
        }

        public final List<a0> b() {
            return z.f23960m0;
        }
    }

    public z(a aVar) {
        ProxySelector proxySelector;
        k.e(aVar, "builder");
        this.f23963a = aVar.l();
        this.f23965b = aVar.i();
        this.f23967c = vb.b.N(aVar.r());
        this.M = vb.b.N(aVar.t());
        this.N = aVar.n();
        this.O = aVar.A();
        this.P = aVar.c();
        this.Q = aVar.o();
        this.R = aVar.p();
        this.S = aVar.k();
        aVar.d();
        this.T = aVar.m();
        this.U = aVar.w();
        if (aVar.w() != null) {
            proxySelector = fc.a.f11878a;
        } else {
            proxySelector = aVar.y();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = fc.a.f11878a;
            }
        }
        this.V = proxySelector;
        this.W = aVar.x();
        this.X = aVar.C();
        List<l> j10 = aVar.j();
        this.f23964a0 = j10;
        this.f23966b0 = aVar.v();
        this.f23968c0 = aVar.q();
        this.f23971f0 = aVar.e();
        this.f23972g0 = aVar.h();
        this.f23973h0 = aVar.z();
        this.f23974i0 = aVar.E();
        this.f23975j0 = aVar.u();
        this.f23976k0 = aVar.s();
        i B = aVar.B();
        this.f23977l0 = B == null ? new i() : B;
        boolean z10 = true;
        if (!(j10 instanceof Collection) || !j10.isEmpty()) {
            Iterator<T> it = j10.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((l) it.next()).f()) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z10) {
            this.Y = null;
            this.f23970e0 = null;
            this.Z = null;
            this.f23969d0 = g.f23799c;
        } else if (aVar.D() != null) {
            this.Y = aVar.D();
            c f10 = aVar.f();
            k.c(f10);
            this.f23970e0 = f10;
            X509TrustManager F = aVar.F();
            k.c(F);
            this.Z = F;
            g g10 = aVar.g();
            k.c(f10);
            this.f23969d0 = g10.e(f10);
        } else {
            h.a aVar2 = h.f7333c;
            X509TrustManager o10 = aVar2.g().o();
            this.Z = o10;
            h g11 = aVar2.g();
            k.c(o10);
            this.Y = g11.n(o10);
            c.a aVar3 = c.f12195a;
            k.c(o10);
            c a10 = aVar3.a(o10);
            this.f23970e0 = a10;
            g g12 = aVar.g();
            k.c(a10);
            this.f23969d0 = g12.e(a10);
        }
        F();
    }

    public final ProxySelector A() {
        return this.V;
    }

    public final int B() {
        return this.f23973h0;
    }

    public final boolean C() {
        return this.O;
    }

    public final SocketFactory D() {
        return this.X;
    }

    public final SSLSocketFactory E() {
        SSLSocketFactory sSLSocketFactory = this.Y;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final void F() {
        boolean z10;
        List<x> list = this.f23967c;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        boolean z11 = true;
        if (!list.contains(null)) {
            List<x> list2 = this.M;
            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list2.contains(null)) {
                List<l> list3 = this.f23964a0;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (l lVar : list3) {
                        if (lVar.f()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    if (!(this.Y == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (this.f23970e0 == null) {
                        if (this.Z != null) {
                            z11 = false;
                        }
                        if (!z11) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (!k.b(this.f23969d0, g.f23799c)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else if (this.Y == null) {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                } else if (this.f23970e0 == null) {
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                } else if (this.Z == null) {
                    throw new IllegalStateException("x509TrustManager == null".toString());
                }
            } else {
                throw new IllegalStateException(("Null network interceptor: " + this.M).toString());
            }
        } else {
            throw new IllegalStateException(("Null interceptor: " + this.f23967c).toString());
        }
    }

    public final int G() {
        return this.f23974i0;
    }

    public final ub.b c() {
        return this.P;
    }

    public Object clone() {
        return super.clone();
    }

    public final c d() {
        return null;
    }

    public final int e() {
        return this.f23971f0;
    }

    public final g f() {
        return this.f23969d0;
    }

    public final int g() {
        return this.f23972g0;
    }

    public final k h() {
        return this.f23965b;
    }

    public final List<l> i() {
        return this.f23964a0;
    }

    public final p j() {
        return this.S;
    }

    public final r k() {
        return this.f23963a;
    }

    public final s l() {
        return this.T;
    }

    public final t.c n() {
        return this.N;
    }

    public final boolean o() {
        return this.Q;
    }

    public final boolean p() {
        return this.R;
    }

    public final i q() {
        return this.f23977l0;
    }

    public final HostnameVerifier r() {
        return this.f23968c0;
    }

    public final List<x> t() {
        return this.f23967c;
    }

    public final List<x> u() {
        return this.M;
    }

    public e v(b0 b0Var) {
        k.e(b0Var, "request");
        return new e(this, b0Var, false);
    }

    public final int w() {
        return this.f23975j0;
    }

    public final List<a0> x() {
        return this.f23966b0;
    }

    public final Proxy y() {
        return this.U;
    }

    public final ub.b z() {
        return this.W;
    }

    public z() {
        this(new a());
    }
}
