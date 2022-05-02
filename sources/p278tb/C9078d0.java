package p278tb;

import java.io.Closeable;
import java.util.List;
import p123ia.C5304n;
import p278tb.C9122v;
import p348yb.C10478c;
import p362zb.C11464e;
import qa.C8298k;

public final class C9078d0 implements Closeable {
    public final String f29106M;
    public final int f29107N;
    public final C9118u f29108O;
    public final C9122v f29109P;
    public final AbstractC9081e0 f29110Q;
    public final C9078d0 f29111R;
    public final C9078d0 f29112S;
    public final C9078d0 f29113T;
    public final long f29114U;
    public final long f29115V;
    public final C10478c f29116W;
    public C9075d f29117a;
    public final C9069b0 f29118b;
    public final EnumC9064a0 f29119c;

    public C9078d0(C9069b0 b0Var, EnumC9064a0 a0Var, String str, int i, C9118u uVar, C9122v vVar, AbstractC9081e0 e0Var, C9078d0 d0Var, C9078d0 d0Var2, C9078d0 d0Var3, long j, long j2, C10478c cVar) {
        C8298k.m12933e(b0Var, "request");
        C8298k.m12933e(a0Var, "protocol");
        C8298k.m12933e(str, "message");
        C8298k.m12933e(vVar, "headers");
        this.f29118b = b0Var;
        this.f29119c = a0Var;
        this.f29106M = str;
        this.f29107N = i;
        this.f29108O = uVar;
        this.f29109P = vVar;
        this.f29110Q = e0Var;
        this.f29111R = d0Var;
        this.f29112S = d0Var2;
        this.f29113T = d0Var3;
        this.f29114U = j;
        this.f29115V = j2;
        this.f29116W = cVar;
    }

    public static String m10523E0(C9078d0 d0Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return d0Var.m10524D0(str, str2);
    }

    public final int m10527A0() {
        return this.f29107N;
    }

    public final C10478c m10526B0() {
        return this.f29116W;
    }

    public final C9118u m10525C0() {
        return this.f29108O;
    }

    public final String m10524D0(String str, String str2) {
        C8298k.m12933e(str, "name");
        String h = this.f29109P.m10372h(str);
        return h != null ? h : str2;
    }

    public final C9122v m10522F0() {
        return this.f29109P;
    }

    public final boolean m10521G0() {
        int i = this.f29107N;
        return 200 <= i && 299 >= i;
    }

    public final String m10520H0() {
        return this.f29106M;
    }

    public final C9078d0 m10519I0() {
        return this.f29111R;
    }

    public final C9079a m10518J0() {
        return new C9079a(this);
    }

    public final C9078d0 m10517K0() {
        return this.f29113T;
    }

    public final EnumC9064a0 m10516L0() {
        return this.f29119c;
    }

    public final long m10515M0() {
        return this.f29115V;
    }

    public final C9069b0 m10514N0() {
        return this.f29118b;
    }

    public final long m10513O0() {
        return this.f29114U;
    }

    @Override
    public void close() {
        AbstractC9081e0 e0Var = this.f29110Q;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final AbstractC9081e0 m10512m() {
        return this.f29110Q;
    }

    public final C9075d m10511t() {
        C9075d dVar = this.f29117a;
        if (dVar != null) {
            return dVar;
        }
        C9075d b = C9075d.f29084p.m10528b(this.f29109P);
        this.f29117a = b;
        return b;
    }

    public String toString() {
        return "Response{protocol=" + this.f29119c + ", code=" + this.f29107N + ", message=" + this.f29106M + ", url=" + this.f29118b.m10558i() + '}';
    }

    public final C9078d0 m10510y0() {
        return this.f29112S;
    }

    public final List<C9093h> m10509z0() {
        String str;
        C9122v vVar = this.f29109P;
        int i = this.f29107N;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return C5304n.m23367f();
        } else {
            str = "Proxy-Authenticate";
        }
        return C11464e.m551a(vVar, str);
    }

    public static class C9079a {
        public C9069b0 f29120a;
        public EnumC9064a0 f29121b;
        public int f29122c;
        public String f29123d;
        public C9118u f29124e;
        public C9122v.C9123a f29125f;
        public AbstractC9081e0 f29126g;
        public C9078d0 f29127h;
        public C9078d0 f29128i;
        public C9078d0 f29129j;
        public long f29130k;
        public long f29131l;
        public C10478c f29132m;

        public C9079a() {
            this.f29122c = -1;
            this.f29125f = new C9122v.C9123a();
        }

        public C9079a m10508a(String str, String str2) {
            C8298k.m12933e(str, "name");
            C8298k.m12933e(str2, "value");
            this.f29125f.m10367a(str, str2);
            return this;
        }

        public C9079a m10507b(AbstractC9081e0 e0Var) {
            this.f29126g = e0Var;
            return this;
        }

        public C9078d0 m10506c() {
            int i = this.f29122c;
            if (i >= 0) {
                C9069b0 b0Var = this.f29120a;
                if (b0Var != null) {
                    EnumC9064a0 a0Var = this.f29121b;
                    if (a0Var != null) {
                        String str = this.f29123d;
                        if (str != null) {
                            return new C9078d0(b0Var, a0Var, str, i, this.f29124e, this.f29125f.m10364d(), this.f29126g, this.f29127h, this.f29128i, this.f29129j, this.f29130k, this.f29131l, this.f29132m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.f29122c).toString());
        }

        public C9079a m10505d(C9078d0 d0Var) {
            m10503f("cacheResponse", d0Var);
            this.f29128i = d0Var;
            return this;
        }

        public final void m10504e(C9078d0 d0Var) {
            if (d0Var != null) {
                if (!(d0Var.m10512m() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        public final void m10503f(String str, C9078d0 d0Var) {
            if (d0Var != null) {
                boolean z = true;
                if (d0Var.m10512m() == null) {
                    if (d0Var.m10519I0() == null) {
                        if (d0Var.m10510y0() == null) {
                            if (d0Var.m10517K0() != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        public C9079a m10502g(int i) {
            this.f29122c = i;
            return this;
        }

        public final int m10501h() {
            return this.f29122c;
        }

        public C9079a m10500i(C9118u uVar) {
            this.f29124e = uVar;
            return this;
        }

        public C9079a m10499j(String str, String str2) {
            C8298k.m12933e(str, "name");
            C8298k.m12933e(str2, "value");
            this.f29125f.m10361g(str, str2);
            return this;
        }

        public C9079a m10498k(C9122v vVar) {
            C8298k.m12933e(vVar, "headers");
            this.f29125f = vVar.m10370m();
            return this;
        }

        public final void m10497l(C10478c cVar) {
            C8298k.m12933e(cVar, "deferredTrailers");
            this.f29132m = cVar;
        }

        public C9079a m10496m(String str) {
            C8298k.m12933e(str, "message");
            this.f29123d = str;
            return this;
        }

        public C9079a m10495n(C9078d0 d0Var) {
            m10503f("networkResponse", d0Var);
            this.f29127h = d0Var;
            return this;
        }

        public C9079a m10494o(C9078d0 d0Var) {
            m10504e(d0Var);
            this.f29129j = d0Var;
            return this;
        }

        public C9079a m10493p(EnumC9064a0 a0Var) {
            C8298k.m12933e(a0Var, "protocol");
            this.f29121b = a0Var;
            return this;
        }

        public C9079a m10492q(long j) {
            this.f29131l = j;
            return this;
        }

        public C9079a m10491r(C9069b0 b0Var) {
            C8298k.m12933e(b0Var, "request");
            this.f29120a = b0Var;
            return this;
        }

        public C9079a m10490s(long j) {
            this.f29130k = j;
            return this;
        }

        public C9079a(C9078d0 d0Var) {
            C8298k.m12933e(d0Var, "response");
            this.f29122c = -1;
            this.f29120a = d0Var.m10514N0();
            this.f29121b = d0Var.m10516L0();
            this.f29122c = d0Var.m10527A0();
            this.f29123d = d0Var.m10520H0();
            this.f29124e = d0Var.m10525C0();
            this.f29125f = d0Var.m10522F0().m10370m();
            this.f29126g = d0Var.m10512m();
            this.f29127h = d0Var.m10519I0();
            this.f29128i = d0Var.m10510y0();
            this.f29129j = d0Var.m10517K0();
            this.f29130k = d0Var.m10513O0();
            this.f29131l = d0Var.m10515M0();
            this.f29132m = d0Var.m10526B0();
        }
    }
}
