package p051db;

import android.view.View;
import android.view.animation.Interpolator;
import p051db.C3950k;

public class C3940f implements C3950k.AbstractC3952b {
    public long f13264M;
    public long f13265N;
    public float f13266O;
    public boolean f13267P;
    public C3950k f13268Q;
    public final int f13269a;
    public final C3950k.AbstractC3952b f13270b;
    public Interpolator f13271c;

    public C3940f(final View view, Interpolator interpolator, long j) {
        this(0, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                view.invalidate();
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29526a(this, i, f, kVar);
            }
        }, interpolator, j, false);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        m29578m(f);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        this.f13270b.mo35Y0(this.f13269a, f, null);
    }

    public void m29588c() {
        C3950k kVar = this.f13268Q;
        if (kVar != null) {
            kVar.m29542k();
        }
    }

    public void m29587d(float f) {
        this.f13266O = f;
    }

    public void m29586e(boolean z) {
        this.f13267P = z;
    }

    public void m29585f(boolean z, float f) {
        this.f13267P = z;
        C3950k kVar = this.f13268Q;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        m29578m(f);
    }

    public float m29584g() {
        return this.f13266O;
    }

    public boolean m29583h() {
        return this.f13267P;
    }

    public boolean m29582i() {
        C3950k kVar = this.f13268Q;
        return kVar != null && kVar.m29531v();
    }

    public void m29579l(long j) {
        this.f13264M = j;
        C3950k kVar = this.f13268Q;
        if (kVar != null) {
            kVar.m29528y(j);
        }
    }

    public final void m29578m(float f) {
        if (this.f13266O != f) {
            this.f13266O = f;
            this.f13270b.mo45P5(this.f13269a, f, -1.0f, null);
        }
    }

    public void m29577n(Interpolator interpolator) {
        this.f13271c = interpolator;
        C3950k kVar = this.f13268Q;
        if (kVar != null) {
            kVar.m29557B(interpolator);
        }
    }

    public void m29576o(long j) {
        this.f13265N = j;
        C3950k kVar = this.f13268Q;
        if (kVar != null) {
            kVar.m29553F(j);
        }
    }

    public void m29575p(boolean z, boolean z2) {
        m29574q(z, z2, null);
    }

    public void m29574q(boolean z, boolean z2, View view) {
        if (this.f13267P != z || !z2) {
            this.f13267P = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f13268Q == null) {
                    C3950k kVar = new C3950k(0, this, this.f13271c, this.f13264M, this.f13266O);
                    this.f13268Q = kVar;
                    long j = this.f13265N;
                    if (j != 0) {
                        kVar.m29553F(j);
                    }
                }
                this.f13268Q.m29543j(f, view);
                return;
            }
            C3950k kVar2 = this.f13268Q;
            if (kVar2 != null) {
                kVar2.m29541l(f);
            }
            if (this.f13266O != f) {
                m29578m(f);
                this.f13270b.mo35Y0(this.f13269a, f, null);
            }
        }
    }

    public boolean m29573r(boolean z) {
        m29575p(!this.f13267P, z);
        return this.f13267P;
    }

    public C3940f(final View view, Interpolator interpolator, long j, boolean z) {
        this(0, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                view.invalidate();
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29526a(this, i, f, kVar);
            }
        }, interpolator, j, z);
    }

    public C3940f(int i, C3950k.AbstractC3952b bVar, Interpolator interpolator, long j) {
        this(i, bVar, interpolator, j, false);
    }

    public C3940f(int i, C3950k.AbstractC3952b bVar, Interpolator interpolator, long j, boolean z) {
        this.f13269a = i;
        this.f13270b = bVar;
        this.f13271c = interpolator;
        this.f13264M = j;
        this.f13267P = z;
        this.f13266O = z ? 1.0f : 0.0f;
    }
}
