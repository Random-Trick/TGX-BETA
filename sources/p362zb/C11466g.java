package p362zb;

import java.util.List;
import p278tb.AbstractC9080e;
import p278tb.AbstractC9129x;
import p278tb.C9069b0;
import p278tb.C9078d0;
import p348yb.C10478c;
import p348yb.C10482e;
import qa.C8298k;

public final class C11466g implements AbstractC9129x.AbstractC9130a {
    public int f36429a;
    public final C10482e f36430b;
    public final List<AbstractC9129x> f36431c;
    public final int f36432d;
    public final C10478c f36433e;
    public final C9069b0 f36434f;
    public final int f36435g;
    public final int f36436h;
    public final int f36437i;

    public C11466g(C10482e eVar, List<? extends AbstractC9129x> list, int i, C10478c cVar, C9069b0 b0Var, int i2, int i3, int i4) {
        C8298k.m12934e(eVar, "call");
        C8298k.m12934e(list, "interceptors");
        C8298k.m12934e(b0Var, "request");
        this.f36430b = eVar;
        this.f36431c = list;
        this.f36432d = i;
        this.f36433e = cVar;
        this.f36434f = b0Var;
        this.f36435g = i2;
        this.f36436h = i3;
        this.f36437i = i4;
    }

    public static C11466g m536d(C11466g gVar, int i, C10478c cVar, C9069b0 b0Var, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = gVar.f36432d;
        }
        if ((i5 & 2) != 0) {
            cVar = gVar.f36433e;
        }
        C10478c cVar2 = cVar;
        if ((i5 & 4) != 0) {
            b0Var = gVar.f36434f;
        }
        C9069b0 b0Var2 = b0Var;
        if ((i5 & 8) != 0) {
            i2 = gVar.f36435g;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = gVar.f36436h;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = gVar.f36437i;
        }
        return gVar.m537c(i, cVar2, b0Var2, i6, i7, i4);
    }

    @Override
    public C9078d0 mo539a(C9069b0 b0Var) {
        C8298k.m12934e(b0Var, "request");
        boolean z = false;
        if (this.f36432d < this.f36431c.size()) {
            this.f36429a++;
            C10478c cVar = this.f36433e;
            if (cVar != null) {
                if (cVar.m5041j().m5020g(b0Var.m10559i())) {
                    if (!(this.f36429a == 1)) {
                        throw new IllegalStateException(("network interceptor " + this.f36431c.get(this.f36432d - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f36431c.get(this.f36432d - 1) + " must retain the same host and port").toString());
                }
            }
            C11466g d = m536d(this, this.f36432d + 1, null, b0Var, 0, 0, 0, 58, null);
            AbstractC9129x xVar = this.f36431c.get(this.f36432d);
            C9078d0 a = xVar.mo523a(d);
            if (a != null) {
                if (this.f36433e != null) {
                    if (!(this.f36432d + 1 >= this.f36431c.size() || d.f36429a == 1)) {
                        throw new IllegalStateException(("network interceptor " + xVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a.m10513m() != null) {
                    z = true;
                }
                if (z) {
                    return a;
                }
                throw new IllegalStateException(("interceptor " + xVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + xVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override
    public C9069b0 mo538b() {
        return this.f36434f;
    }

    public final C11466g m537c(int i, C10478c cVar, C9069b0 b0Var, int i2, int i3, int i4) {
        C8298k.m12934e(b0Var, "request");
        return new C11466g(this.f36430b, this.f36431c, i, cVar, b0Var, i2, i3, i4);
    }

    @Override
    public AbstractC9080e call() {
        return this.f36430b;
    }

    public final C10482e m535e() {
        return this.f36430b;
    }

    public final int m534f() {
        return this.f36435g;
    }

    public final C10478c m533g() {
        return this.f36433e;
    }

    public final int m532h() {
        return this.f36436h;
    }

    public final C9069b0 m531i() {
        return this.f36434f;
    }

    public final int m530j() {
        return this.f36437i;
    }

    public int m529k() {
        return this.f36436h;
    }
}
