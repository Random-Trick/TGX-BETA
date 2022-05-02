package p278tb;

import java.io.Closeable;
import java.util.List;
import p123ia.C5304n;
import p278tb.C9122v;
import p348yb.C10478c;
import p362zb.C11464e;
import qa.C8298k;

public final class C9078d0 implements Closeable {
    public final String f29103M;
    public final int f29104N;
    public final C9118u f29105O;
    public final C9122v f29106P;
    public final AbstractC9081e0 f29107Q;
    public final C9078d0 f29108R;
    public final C9078d0 f29109S;
    public final C9078d0 f29110T;
    public final long f29111U;
    public final long f29112V;
    public final C10478c f29113W;
    public C9075d f29114a;
    public final C9069b0 f29115b;
    public final EnumC9064a0 f29116c;

    public C9078d0(C9069b0 b0Var, EnumC9064a0 a0Var, String str, int i, C9118u uVar, C9122v vVar, AbstractC9081e0 e0Var, C9078d0 d0Var, C9078d0 d0Var2, C9078d0 d0Var3, long j, long j2, C10478c cVar) {
        C8298k.m12934e(b0Var, "request");
        C8298k.m12934e(a0Var, "protocol");
        C8298k.m12934e(str, "message");
        C8298k.m12934e(vVar, "headers");
        this.f29115b = b0Var;
        this.f29116c = a0Var;
        this.f29103M = str;
        this.f29104N = i;
        this.f29105O = uVar;
        this.f29106P = vVar;
        this.f29107Q = e0Var;
        this.f29108R = d0Var;
        this.f29109S = d0Var2;
        this.f29110T = d0Var3;
        this.f29111U = j;
        this.f29112V = j2;
        this.f29113W = cVar;
    }

    public static String m10524E0(C9078d0 d0Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return d0Var.m10525D0(str, str2);
    }

    public final int m10528A0() {
        return this.f29104N;
    }

    public final C10478c m10527B0() {
        return this.f29113W;
    }

    public final C9118u m10526C0() {
        return this.f29105O;
    }

    public final String m10525D0(String str, String str2) {
        C8298k.m12934e(str, "name");
        String h = this.f29106P.m10373h(str);
        return h != null ? h : str2;
    }

    public final C9122v m10523F0() {
        return this.f29106P;
    }

    public final boolean m10522G0() {
        int i = this.f29104N;
        return 200 <= i && 299 >= i;
    }

    public final String m10521H0() {
        return this.f29103M;
    }

    public final C9078d0 m10520I0() {
        return this.f29108R;
    }

    public final C9079a m10519J0() {
        return new C9079a(this);
    }

    public final C9078d0 m10518K0() {
        return this.f29110T;
    }

    public final EnumC9064a0 m10517L0() {
        return this.f29116c;
    }

    public final long m10516M0() {
        return this.f29112V;
    }

    public final C9069b0 m10515N0() {
        return this.f29115b;
    }

    public final long m10514O0() {
        return this.f29111U;
    }

    @Override
    public void close() {
        AbstractC9081e0 e0Var = this.f29107Q;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final AbstractC9081e0 m10513m() {
        return this.f29107Q;
    }

    public final C9075d m10512t() {
        C9075d dVar = this.f29114a;
        if (dVar != null) {
            return dVar;
        }
        C9075d b = C9075d.f29081p.m10529b(this.f29106P);
        this.f29114a = b;
        return b;
    }

    public String toString() {
        return "Response{protocol=" + this.f29116c + ", code=" + this.f29104N + ", message=" + this.f29103M + ", url=" + this.f29115b.m10559i() + '}';
    }

    public final C9078d0 m10511y0() {
        return this.f29109S;
    }

    public final List<C9093h> m10510z0() {
        String str;
        C9122v vVar = this.f29106P;
        int i = this.f29104N;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return C5304n.m23366f();
        } else {
            str = "Proxy-Authenticate";
        }
        return C11464e.m551a(vVar, str);
    }

    public static class C9079a {
        public C9069b0 f29117a;
        public EnumC9064a0 f29118b;
        public int f29119c;
        public String f29120d;
        public C9118u f29121e;
        public C9122v.C9123a f29122f;
        public AbstractC9081e0 f29123g;
        public C9078d0 f29124h;
        public C9078d0 f29125i;
        public C9078d0 f29126j;
        public long f29127k;
        public long f29128l;
        public C10478c f29129m;

        public C9079a() {
            this.f29119c = -1;
            this.f29122f = new C9122v.C9123a();
        }

        public C9079a m10509a(String str, String str2) {
            C8298k.m12934e(str, "name");
            C8298k.m12934e(str2, "value");
            this.f29122f.m10368a(str, str2);
            return this;
        }

        public C9079a m10508b(AbstractC9081e0 e0Var) {
            this.f29123g = e0Var;
            return this;
        }

        public C9078d0 m10507c() {
            int i = this.f29119c;
            if (i >= 0) {
                C9069b0 b0Var = this.f29117a;
                if (b0Var != null) {
                    EnumC9064a0 a0Var = this.f29118b;
                    if (a0Var != null) {
                        String str = this.f29120d;
                        if (str != null) {
                            return new C9078d0(b0Var, a0Var, str, i, this.f29121e, this.f29122f.m10365d(), this.f29123g, this.f29124h, this.f29125i, this.f29126j, this.f29127k, this.f29128l, this.f29129m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.f29119c).toString());
        }

        public C9079a m10506d(C9078d0 d0Var) {
            m10504f("cacheResponse", d0Var);
            this.f29125i = d0Var;
            return this;
        }

        public final void m10505e(C9078d0 d0Var) {
            if (d0Var != null) {
                if (!(d0Var.m10513m() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        public final void m10504f(String str, C9078d0 d0Var) {
            if (d0Var != null) {
                boolean z = true;
                if (d0Var.m10513m() == null) {
                    if (d0Var.m10520I0() == null) {
                        if (d0Var.m10511y0() == null) {
                            if (d0Var.m10518K0() != null) {
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

        public C9079a m10503g(int i) {
            this.f29119c = i;
            return this;
        }

        public final int m10502h() {
            return this.f29119c;
        }

        public C9079a m10501i(C9118u uVar) {
            this.f29121e = uVar;
            return this;
        }

        public C9079a m10500j(String str, String str2) {
            C8298k.m12934e(str, "name");
            C8298k.m12934e(str2, "value");
            this.f29122f.m10362g(str, str2);
            return this;
        }

        public C9079a m10499k(C9122v vVar) {
            C8298k.m12934e(vVar, "headers");
            this.f29122f = vVar.m10371m();
            return this;
        }

        public final void m10498l(C10478c cVar) {
            C8298k.m12934e(cVar, "deferredTrailers");
            this.f29129m = cVar;
        }

        public C9079a m10497m(String str) {
            C8298k.m12934e(str, "message");
            this.f29120d = str;
            return this;
        }

        public C9079a m10496n(C9078d0 d0Var) {
            m10504f("networkResponse", d0Var);
            this.f29124h = d0Var;
            return this;
        }

        public C9079a m10495o(C9078d0 d0Var) {
            m10505e(d0Var);
            this.f29126j = d0Var;
            return this;
        }

        public C9079a m10494p(EnumC9064a0 a0Var) {
            C8298k.m12934e(a0Var, "protocol");
            this.f29118b = a0Var;
            return this;
        }

        public C9079a m10493q(long j) {
            this.f29128l = j;
            return this;
        }

        public C9079a m10492r(C9069b0 b0Var) {
            C8298k.m12934e(b0Var, "request");
            this.f29117a = b0Var;
            return this;
        }

        public C9079a m10491s(long j) {
            this.f29127k = j;
            return this;
        }

        public C9079a(C9078d0 d0Var) {
            C8298k.m12934e(d0Var, "response");
            this.f29119c = -1;
            this.f29117a = d0Var.m10515N0();
            this.f29118b = d0Var.m10517L0();
            this.f29119c = d0Var.m10528A0();
            this.f29120d = d0Var.m10521H0();
            this.f29121e = d0Var.m10526C0();
            this.f29122f = d0Var.m10523F0().m10371m();
            this.f29123g = d0Var.m10513m();
            this.f29124h = d0Var.m10520I0();
            this.f29125i = d0Var.m10511y0();
            this.f29126j = d0Var.m10518K0();
            this.f29127k = d0Var.m10514O0();
            this.f29128l = d0Var.m10516M0();
            this.f29129m = d0Var.m10527B0();
        }
    }
}
