package ac;

import java.util.List;
import ra.k;
import ub.b0;
import ub.d0;
import ub.x;
import zb.c;
import zb.e;

public final class g implements x.a {
    public int f725a;
    public final e f726b;
    public final List<x> f727c;
    public final int f728d;
    public final c f729e;
    public final b0 f730f;
    public final int f731g;
    public final int f732h;
    public final int f733i;

    public g(e eVar, List<? extends x> list, int i10, c cVar, b0 b0Var, int i11, int i12, int i13) {
        k.e(eVar, "call");
        k.e(list, "interceptors");
        k.e(b0Var, "request");
        this.f726b = eVar;
        this.f727c = list;
        this.f728d = i10;
        this.f729e = cVar;
        this.f730f = b0Var;
        this.f731g = i11;
        this.f732h = i12;
        this.f733i = i13;
    }

    public static g d(g gVar, int i10, c cVar, b0 b0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f728d;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f729e;
        }
        c cVar2 = cVar;
        if ((i14 & 4) != 0) {
            b0Var = gVar.f730f;
        }
        b0 b0Var2 = b0Var;
        if ((i14 & 8) != 0) {
            i11 = gVar.f731g;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gVar.f732h;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gVar.f733i;
        }
        return gVar.c(i10, cVar2, b0Var2, i15, i16, i13);
    }

    @Override
    public d0 a(b0 b0Var) {
        k.e(b0Var, "request");
        boolean z10 = false;
        if (this.f728d < this.f727c.size()) {
            this.f725a++;
            c cVar = this.f729e;
            if (cVar != null) {
                if (cVar.j().g(b0Var.i())) {
                    if (!(this.f725a == 1)) {
                        throw new IllegalStateException(("network interceptor " + this.f727c.get(this.f728d - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f727c.get(this.f728d - 1) + " must retain the same host and port").toString());
                }
            }
            g d10 = d(this, this.f728d + 1, null, b0Var, 0, 0, 0, 58, null);
            x xVar = this.f727c.get(this.f728d);
            d0 a10 = xVar.a(d10);
            if (a10 != null) {
                if (this.f729e != null) {
                    if (!(this.f728d + 1 >= this.f727c.size() || d10.f725a == 1)) {
                        throw new IllegalStateException(("network interceptor " + xVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a10.m() != null) {
                    z10 = true;
                }
                if (z10) {
                    return a10;
                }
                throw new IllegalStateException(("interceptor " + xVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + xVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override
    public b0 b() {
        return this.f730f;
    }

    public final g c(int i10, c cVar, b0 b0Var, int i11, int i12, int i13) {
        k.e(b0Var, "request");
        return new g(this.f726b, this.f727c, i10, cVar, b0Var, i11, i12, i13);
    }

    @Override
    public ub.e call() {
        return this.f726b;
    }

    public final e e() {
        return this.f726b;
    }

    public final int f() {
        return this.f731g;
    }

    public final c g() {
        return this.f729e;
    }

    public final int h() {
        return this.f732h;
    }

    public final b0 i() {
        return this.f730f;
    }

    public final int j() {
        return this.f733i;
    }

    public int k() {
        return this.f732h;
    }
}
