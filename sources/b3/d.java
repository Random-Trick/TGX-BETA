package b3;

import android.content.Context;
import b3.s;
import c3.j;
import g3.c;
import g3.i;
import h3.f;
import h3.l;
import h3.m;
import h3.p;
import h3.q;
import h3.r;
import i3.b0;
import i3.c0;
import i3.g;
import i3.h;
import i3.i0;
import java.util.concurrent.Executor;

public final class d extends s {
    public ha.a M;
    public ha.a N;
    public ha.a<b0> O;
    public ha.a<f> P;
    public ha.a<r> Q;
    public ha.a<c> R;
    public ha.a<l> S;
    public ha.a<p> T;
    public ha.a<r> U;
    public ha.a<Executor> f3726a;
    public ha.a<Context> f3727b;
    public ha.a f3728c;

    public static final class b implements s.a {
        public Context f3729a;

        public b() {
        }

        @Override
        public s a() {
            d3.d.a(this.f3729a, Context.class);
            return new d(this.f3729a);
        }

        public b b(Context context) {
            this.f3729a = (Context) d3.d.b(context);
            return this;
        }
    }

    public static s.a y0() {
        return new b();
    }

    @Override
    public i3.c m() {
        return this.O.get();
    }

    @Override
    public r s() {
        return this.U.get();
    }

    public final void z0(Context context) {
        this.f3726a = d3.a.a(j.a());
        d3.b a10 = d3.c.a(context);
        this.f3727b = a10;
        j a11 = j.a(a10, k3.c.a(), k3.d.a());
        this.f3728c = a11;
        this.M = d3.a.a(c3.l.a(this.f3727b, a11));
        this.N = i0.a(this.f3727b, i3.f.a(), g.a());
        this.O = d3.a.a(c0.a(k3.c.a(), k3.d.a(), h.a(), this.N));
        g3.g b10 = g3.g.b(k3.c.a());
        this.P = b10;
        i a12 = i.a(this.f3727b, this.O, b10, k3.d.a());
        this.Q = a12;
        ha.a<Executor> aVar = this.f3726a;
        ha.a aVar2 = this.M;
        ha.a<b0> aVar3 = this.O;
        this.R = g3.d.a(aVar, aVar2, a12, aVar3, aVar3);
        ha.a<Context> aVar4 = this.f3727b;
        ha.a aVar5 = this.M;
        ha.a<b0> aVar6 = this.O;
        this.S = m.a(aVar4, aVar5, aVar6, this.Q, this.f3726a, aVar6, k3.c.a());
        ha.a<Executor> aVar7 = this.f3726a;
        ha.a<b0> aVar8 = this.O;
        this.T = q.a(aVar7, aVar8, this.Q, aVar8);
        this.U = d3.a.a(t.a(k3.c.a(), k3.d.a(), this.R, this.S, this.T));
    }

    public d(Context context) {
        z0(context);
    }
}
