package je;

import ae.j;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.y;
import eb.f;
import eb.g;
import eb.i;
import eb.k;
import eb.l;
import ib.d;
import ib.h;
import ie.t;
import je.g;
import org.thunderdog.challegram.R;
import zd.o6;

public final class a implements k.b, i.b<g>, k {
    public final f M;
    public final c N;
    public final int O;
    public final float P;
    public final int Q;
    public final float R;
    public final float S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final k Y;
    public float Z;
    public final i<g> f15341a;
    public final g f15342b;
    public final f f15343c;

    public class C0132a implements c {
        public final View f15344a;

        public C0132a(View view) {
            this.f15344a = view;
        }

        @Override
        public boolean d(a aVar) {
            return this.f15344a.getParent() != null;
        }

        @Override
        public void m(a aVar, boolean z10) {
            this.f15344a.invalidate();
        }
    }

    public static class b {
        public c f15347c;
        public int f15348d;
        public float f15349e;
        public float f15350f;
        public int f15355k;
        public k f15356l;
        public float f15345a = 13.0f;
        public int f15346b = 3;
        public int f15351g = 0;
        public int f15352h = R.id.theme_color_badgeText;
        public int f15353i = R.id.theme_color_badgeMutedText;
        public int f15354j = R.id.theme_color_badgeFailedText;

        public b a(boolean z10) {
            this.f15346b = ib.c.h(this.f15346b, 1, z10);
            return this;
        }

        public a b() {
            return new a(this.f15345a, this.f15347c, this.f15346b, this.f15352h, this.f15353i, this.f15354j, this.f15355k, this.f15348d, this.f15349e, this.f15350f, this.f15351g, this.f15356l);
        }

        public b c(View view) {
            return d(view != null ? a.q(view) : null);
        }

        public b d(c cVar) {
            this.f15347c = cVar;
            return this;
        }

        public b e(k kVar) {
            this.f15356l = kVar;
            return this;
        }

        public b f(int i10, float f10, float f11, int i11) {
            this.f15348d = i10;
            this.f15349e = f10;
            this.f15350f = f11;
            this.f15351g = i11;
            return this;
        }

        public b g() {
            this.f15346b = ib.c.h(this.f15346b, 2, false);
            return this;
        }

        public b h(int i10) {
            this.f15355k = i10;
            return this;
        }

        public b i(int i10) {
            this.f15352h = i10;
            return this;
        }

        public b j(float f10) {
            this.f15345a = f10;
            return this;
        }
    }

    public interface c {
        boolean d(a aVar);

        void m(a aVar, boolean z10);
    }

    public a(float f10, c cVar, int i10, int i11, int i12, int i13, int i14, int i15, float f11, float f12, int i16, k kVar) {
        this.f15341a = new i<>(this);
        this.f15342b = new g(this);
        DecelerateInterpolator decelerateInterpolator = db.b.f7287b;
        this.f15343c = new f(1, this, decelerateInterpolator, 120L);
        this.M = new f(2, this, decelerateInterpolator, 120L);
        this.P = f10;
        this.N = cVar;
        this.O = i10;
        this.U = i11;
        this.V = i12;
        this.W = i13;
        this.X = i14;
        this.Q = i15;
        this.R = f11;
        this.S = f12;
        this.T = i16;
        this.Y = kVar;
    }

    public static c q(View view) {
        return new C0132a(view);
    }

    @Override
    public int R() {
        return j.d(this);
    }

    @Override
    public long W0(boolean z10) {
        return j.c(this, z10);
    }

    @Override
    public void a(i<?> iVar) {
        float m10 = m();
        boolean z10 = this.Z != m10;
        this.Z = m10;
        o(z10);
    }

    @Override
    public int a1() {
        return j.f(this);
    }

    @Override
    public int c() {
        k kVar = this.Y;
        return kVar != null ? kVar.c() : h(i(), this.U, this.V, this.W);
    }

    @Override
    public int d(boolean z10) {
        return 0;
    }

    public void e(Canvas canvas, float f10, float f11, int i10, float f12) {
        f(canvas, f10, f11, i10, f12, null, 0);
    }

    public void f(Canvas canvas, float f10, float f11, int i10, float f12, t tVar, int i11) {
        if (l() * f12 > 0.0f) {
            int i12 = this.Q;
            ce.b.h(canvas, f10, f11, i10, this.f15341a, this.P, ib.c.b(this.O, 2), this, i12 != 0 ? tVar.Z(i12, i11) : null, this.T, i11, a0.i(this.S), f12 * l(), this.f15342b.a());
        }
    }

    @Override
    public int g(boolean z10) {
        return 0;
    }

    public final int h(float f10, int i10, int i11, int i12) {
        return d.d(d.d(j.L(i10), j.L(i11), f10), j.L(i12), this.M.g());
    }

    public float i() {
        return this.f15343c.g();
    }

    public float j(int i10) {
        return (m() + i10) * l();
    }

    public float l() {
        return h.d(this.f15342b.a());
    }

    public final float m() {
        return ce.b.C(this.P, ib.c.b(this.O, 2), this.f15341a, this.Q != 0 ? a0.i(this.R) + a0.i(this.S) : 0);
    }

    public void n(boolean z10) {
        v(0, p(), z10);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        o(i10 == 0);
    }

    public void o(boolean z10) {
        c cVar = this.N;
        if (cVar != null) {
            cVar.m(this, z10);
        }
    }

    @Override
    public int o0(boolean z10) {
        return j.e(this, z10);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        l.a(this, i10, f10, kVar);
    }

    public boolean p() {
        return this.f15343c.h();
    }

    @Override
    public int r0(boolean z10) {
        k kVar = this.Y;
        return kVar != null ? kVar.r0(z10) : h(i(), R.id.theme_color_badge, R.id.theme_color_badgeMuted, R.id.theme_color_badgeFailed);
    }

    public g b(String str) {
        return new g.b(str, Integer.MAX_VALUE, y.A0(this.P), this).s().c(ib.c.b(this.O, 1)).f();
    }

    @Override
    public int t0(boolean z10) {
        int i10 = this.X;
        if (i10 != 0) {
            return j.L(i10);
        }
        return 0;
    }

    public void u(int i10, boolean z10) {
        v(i10, p(), z10);
    }

    public void v(int i10, boolean z10, boolean z11) {
        c cVar;
        boolean z12 = false;
        if (z11 && ((cVar = this.N) == null || !cVar.d(this))) {
            z11 = false;
        }
        if (!z11 || j0.K()) {
            boolean z13 = z11 && l() > 0.0f;
            this.f15343c.p(z10, z13);
            this.M.p(i10 == o6.B2, z13);
            if (i10 > 0 || i10 == o6.A2 || i10 == o6.B2) {
                z12 = true;
            }
            if (i10 == o6.B2 && this.Q == 0) {
                this.f15341a.s(i10, "!", z13);
            } else if (i10 > 0) {
                long j10 = i10;
                this.f15341a.s(j10, c0.f(j10), z13);
            } else {
                this.f15341a.m(z13);
            }
            this.f15342b.b(z12, z11);
            return;
        }
        throw new AssertionError();
    }

    public void w(boolean z10, boolean z11) {
        this.f15343c.p(z10, z11);
    }

    public void x(boolean z10) {
        v(o6.A2, p(), z10);
    }

    public void y(boolean z10, boolean z11) {
        if (z10) {
            x(z11);
        } else {
            n(z11);
        }
    }
}
