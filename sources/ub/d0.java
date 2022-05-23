package ub;

import ac.e;
import ja.n;
import java.io.Closeable;
import java.util.List;
import ra.k;
import ub.v;
import zb.c;

public final class d0 implements Closeable {
    public final String M;
    public final int N;
    public final u O;
    public final v P;
    public final e0 Q;
    public final d0 R;
    public final d0 S;
    public final d0 T;
    public final long U;
    public final long V;
    public final c W;
    public d f23777a;
    public final b0 f23778b;
    public final a0 f23779c;

    public d0(b0 b0Var, a0 a0Var, String str, int i10, u uVar, v vVar, e0 e0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j10, long j11, c cVar) {
        k.e(b0Var, "request");
        k.e(a0Var, "protocol");
        k.e(str, "message");
        k.e(vVar, "headers");
        this.f23778b = b0Var;
        this.f23779c = a0Var;
        this.M = str;
        this.N = i10;
        this.O = uVar;
        this.P = vVar;
        this.Q = e0Var;
        this.R = d0Var;
        this.S = d0Var2;
        this.T = d0Var3;
        this.U = j10;
        this.V = j11;
        this.W = cVar;
    }

    public static String E0(d0 d0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return d0Var.D0(str, str2);
    }

    public final int A0() {
        return this.N;
    }

    public final c B0() {
        return this.W;
    }

    public final u C0() {
        return this.O;
    }

    public final String D0(String str, String str2) {
        k.e(str, "name");
        String f10 = this.P.f(str);
        return f10 != null ? f10 : str2;
    }

    public final v F0() {
        return this.P;
    }

    public final boolean G0() {
        int i10 = this.N;
        return 200 <= i10 && 299 >= i10;
    }

    public final String H0() {
        return this.M;
    }

    public final d0 I0() {
        return this.R;
    }

    public final a J0() {
        return new a(this);
    }

    public final d0 K0() {
        return this.T;
    }

    public final a0 L0() {
        return this.f23779c;
    }

    public final long M0() {
        return this.V;
    }

    public final b0 N0() {
        return this.f23778b;
    }

    public final long O0() {
        return this.U;
    }

    @Override
    public void close() {
        e0 e0Var = this.Q;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final e0 m() {
        return this.Q;
    }

    public final d s() {
        d dVar = this.f23777a;
        if (dVar != null) {
            return dVar;
        }
        d b10 = d.f23755p.b(this.P);
        this.f23777a = b10;
        return b10;
    }

    public String toString() {
        return "Response{protocol=" + this.f23779c + ", code=" + this.N + ", message=" + this.M + ", url=" + this.f23778b.i() + '}';
    }

    public final d0 y0() {
        return this.S;
    }

    public final List<h> z0() {
        String str;
        v vVar = this.P;
        int i10 = this.N;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else if (i10 != 407) {
            return n.f();
        } else {
            str = "Proxy-Authenticate";
        }
        return e.a(vVar, str);
    }

    public static class a {
        public b0 f23780a;
        public a0 f23781b;
        public int f23782c;
        public String f23783d;
        public u f23784e;
        public v.a f23785f;
        public e0 f23786g;
        public d0 f23787h;
        public d0 f23788i;
        public d0 f23789j;
        public long f23790k;
        public long f23791l;
        public c f23792m;

        public a() {
            this.f23782c = -1;
            this.f23785f = new v.a();
        }

        public a a(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            this.f23785f.a(str, str2);
            return this;
        }

        public a b(e0 e0Var) {
            this.f23786g = e0Var;
            return this;
        }

        public d0 c() {
            int i10 = this.f23782c;
            if (i10 >= 0) {
                b0 b0Var = this.f23780a;
                if (b0Var != null) {
                    a0 a0Var = this.f23781b;
                    if (a0Var != null) {
                        String str = this.f23783d;
                        if (str != null) {
                            return new d0(b0Var, a0Var, str, i10, this.f23784e, this.f23785f.d(), this.f23786g, this.f23787h, this.f23788i, this.f23789j, this.f23790k, this.f23791l, this.f23792m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.f23782c).toString());
        }

        public a d(d0 d0Var) {
            f("cacheResponse", d0Var);
            this.f23788i = d0Var;
            return this;
        }

        public final void e(d0 d0Var) {
            if (d0Var != null) {
                if (!(d0Var.m() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        public final void f(String str, d0 d0Var) {
            if (d0Var != null) {
                boolean z10 = true;
                if (d0Var.m() == null) {
                    if (d0Var.I0() == null) {
                        if (d0Var.y0() == null) {
                            if (d0Var.K0() != null) {
                                z10 = false;
                            }
                            if (!z10) {
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

        public a g(int i10) {
            this.f23782c = i10;
            return this;
        }

        public final int h() {
            return this.f23782c;
        }

        public a i(u uVar) {
            this.f23784e = uVar;
            return this;
        }

        public a j(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            this.f23785f.g(str, str2);
            return this;
        }

        public a k(v vVar) {
            k.e(vVar, "headers");
            this.f23785f = vVar.m();
            return this;
        }

        public final void l(c cVar) {
            k.e(cVar, "deferredTrailers");
            this.f23792m = cVar;
        }

        public a m(String str) {
            k.e(str, "message");
            this.f23783d = str;
            return this;
        }

        public a n(d0 d0Var) {
            f("networkResponse", d0Var);
            this.f23787h = d0Var;
            return this;
        }

        public a o(d0 d0Var) {
            e(d0Var);
            this.f23789j = d0Var;
            return this;
        }

        public a p(a0 a0Var) {
            k.e(a0Var, "protocol");
            this.f23781b = a0Var;
            return this;
        }

        public a q(long j10) {
            this.f23791l = j10;
            return this;
        }

        public a r(b0 b0Var) {
            k.e(b0Var, "request");
            this.f23780a = b0Var;
            return this;
        }

        public a s(long j10) {
            this.f23790k = j10;
            return this;
        }

        public a(d0 d0Var) {
            k.e(d0Var, "response");
            this.f23782c = -1;
            this.f23780a = d0Var.N0();
            this.f23781b = d0Var.L0();
            this.f23782c = d0Var.A0();
            this.f23783d = d0Var.H0();
            this.f23784e = d0Var.C0();
            this.f23785f = d0Var.F0().m();
            this.f23786g = d0Var.m();
            this.f23787h = d0Var.I0();
            this.f23788i = d0Var.y0();
            this.f23789j = d0Var.K0();
            this.f23790k = d0Var.O0();
            this.f23791l = d0Var.M0();
            this.f23792m = d0Var.B0();
        }
    }
}
