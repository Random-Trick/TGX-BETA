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
    public int f36432a;
    public final C10482e f36433b;
    public final List<AbstractC9129x> f36434c;
    public final int f36435d;
    public final C10478c f36436e;
    public final C9069b0 f36437f;
    public final int f36438g;
    public final int f36439h;
    public final int f36440i;

    public C11466g(C10482e eVar, List<? extends AbstractC9129x> list, int i, C10478c cVar, C9069b0 b0Var, int i2, int i3, int i4) {
        C8298k.m12933e(eVar, "call");
        C8298k.m12933e(list, "interceptors");
        C8298k.m12933e(b0Var, "request");
        this.f36433b = eVar;
        this.f36434c = list;
        this.f36435d = i;
        this.f36436e = cVar;
        this.f36437f = b0Var;
        this.f36438g = i2;
        this.f36439h = i3;
        this.f36440i = i4;
    }

    public static C11466g m536d(C11466g gVar, int i, C10478c cVar, C9069b0 b0Var, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = gVar.f36435d;
        }
        if ((i5 & 2) != 0) {
            cVar = gVar.f36436e;
        }
        C10478c cVar2 = cVar;
        if ((i5 & 4) != 0) {
            b0Var = gVar.f36437f;
        }
        C9069b0 b0Var2 = b0Var;
        if ((i5 & 8) != 0) {
            i2 = gVar.f36438g;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = gVar.f36439h;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = gVar.f36440i;
        }
        return gVar.m537c(i, cVar2, b0Var2, i6, i7, i4);
    }

    @Override
    public C9078d0 mo539a(C9069b0 b0Var) {
        C8298k.m12933e(b0Var, "request");
        boolean z = false;
        if (this.f36435d < this.f36434c.size()) {
            this.f36432a++;
            C10478c cVar = this.f36436e;
            if (cVar != null) {
                if (cVar.m5041j().m5020g(b0Var.m10558i())) {
                    if (!(this.f36432a == 1)) {
                        throw new IllegalStateException(("network interceptor " + this.f36434c.get(this.f36435d - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f36434c.get(this.f36435d - 1) + " must retain the same host and port").toString());
                }
            }
            C11466g d = m536d(this, this.f36435d + 1, null, b0Var, 0, 0, 0, 58, null);
            AbstractC9129x xVar = this.f36434c.get(this.f36435d);
            C9078d0 a = xVar.mo523a(d);
            if (a != null) {
                if (this.f36436e != null) {
                    if (!(this.f36435d + 1 >= this.f36434c.size() || d.f36432a == 1)) {
                        throw new IllegalStateException(("network interceptor " + xVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a.m10512m() != null) {
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
        return this.f36437f;
    }

    public final C11466g m537c(int i, C10478c cVar, C9069b0 b0Var, int i2, int i3, int i4) {
        C8298k.m12933e(b0Var, "request");
        return new C11466g(this.f36433b, this.f36434c, i, cVar, b0Var, i2, i3, i4);
    }

    @Override
    public AbstractC9080e call() {
        return this.f36433b;
    }

    public final C10482e m535e() {
        return this.f36433b;
    }

    public final int m534f() {
        return this.f36438g;
    }

    public final C10478c m533g() {
        return this.f36436e;
    }

    public final int m532h() {
        return this.f36439h;
    }

    public final C9069b0 m531i() {
        return this.f36437f;
    }

    public final int m530j() {
        return this.f36440i;
    }

    public int m529k() {
        return this.f36439h;
    }
}
