package eb;

import android.view.View;
import android.view.animation.Interpolator;
import eb.k;

public class f implements k.b {
    public long M;
    public long N;
    public float O;
    public boolean P;
    public k Q;
    public final int f11437a;
    public final k.b f11438b;
    public Interpolator f11439c;

    public f(final View view, Interpolator interpolator, long j10) {
        this(0, new k.b() {
            @Override
            public final void n4(int i10, float f10, float f11, k kVar) {
                view.invalidate();
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
                l.a(this, i10, f10, kVar);
            }
        }, interpolator, j10, false);
    }

    public void c() {
        k kVar = this.Q;
        if (kVar != null) {
            kVar.k();
        }
    }

    public void d(float f10) {
        this.O = f10;
    }

    public void e(boolean z10) {
        this.P = z10;
    }

    public void f(boolean z10, float f10) {
        this.P = z10;
        k kVar = this.Q;
        if (kVar != null) {
            kVar.l(f10);
        }
        m(f10);
    }

    public float g() {
        return this.O;
    }

    public boolean h() {
        return this.P;
    }

    public boolean i() {
        k kVar = this.Q;
        return kVar != null && kVar.v();
    }

    public void l(long j10) {
        this.M = j10;
        k kVar = this.Q;
        if (kVar != null) {
            kVar.y(j10);
        }
    }

    public final void m(float f10) {
        if (this.O != f10) {
            this.O = f10;
            this.f11438b.n4(this.f11437a, f10, -1.0f, null);
        }
    }

    public void n(Interpolator interpolator) {
        this.f11439c = interpolator;
        k kVar = this.Q;
        if (kVar != null) {
            kVar.B(interpolator);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        m(f10);
    }

    public void o(long j10) {
        this.N = j10;
        k kVar = this.Q;
        if (kVar != null) {
            kVar.F(j10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        this.f11438b.o4(this.f11437a, f10, null);
    }

    public void p(boolean z10, boolean z11) {
        q(z10, z11, null);
    }

    public void q(boolean z10, boolean z11, View view) {
        if (this.P != z10 || !z11) {
            this.P = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.Q == null) {
                    k kVar = new k(0, this, this.f11439c, this.M, this.O);
                    this.Q = kVar;
                    long j10 = this.N;
                    if (j10 != 0) {
                        kVar.F(j10);
                    }
                }
                this.Q.j(f10, view);
                return;
            }
            k kVar2 = this.Q;
            if (kVar2 != null) {
                kVar2.l(f10);
            }
            if (this.O != f10) {
                m(f10);
                this.f11438b.o4(this.f11437a, f10, null);
            }
        }
    }

    public boolean r(boolean z10) {
        p(!this.P, z10);
        return this.P;
    }

    public f(final View view, Interpolator interpolator, long j10, boolean z10) {
        this(0, new k.b() {
            @Override
            public final void n4(int i10, float f10, float f11, k kVar) {
                view.invalidate();
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
                l.a(this, i10, f10, kVar);
            }
        }, interpolator, j10, z10);
    }

    public f(int i10, k.b bVar, Interpolator interpolator, long j10) {
        this(i10, bVar, interpolator, j10, false);
    }

    public f(int i10, k.b bVar, Interpolator interpolator, long j10, boolean z10) {
        this.f11437a = i10;
        this.f11438b = bVar;
        this.f11439c = interpolator;
        this.M = j10;
        this.P = z10;
        this.O = z10 ? 1.0f : 0.0f;
    }
}
