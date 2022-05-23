package o4;

import android.os.Handler;
import b5.i0;
import c5.l0;
import java.io.IOException;
import java.util.HashMap;
import m3.o3;
import o4.s;
import o4.y;
import q3.p;
import q3.w;

public abstract class f<T> extends o4.a {
    public final HashMap<T, b<T>> f19054h = new HashMap<>();
    public Handler f19055i;
    public i0 f19056j;

    public final class a implements y, w {
        public final T f19057a;
        public y.a f19058b;
        public w.a f19059c;

        public a(T t10) {
            this.f19058b = f.this.s(null);
            this.f19059c = f.this.q(null);
            this.f19057a = t10;
        }

        @Override
        public void A(int i10, s.b bVar, k kVar, o oVar) {
            if (b(i10, bVar)) {
                this.f19058b.r(kVar, g(oVar));
            }
        }

        @Override
        public void C(int i10, s.b bVar) {
            if (b(i10, bVar)) {
                this.f19059c.i();
            }
        }

        @Override
        public void E(int i10, s.b bVar) {
            if (b(i10, bVar)) {
                this.f19059c.h();
            }
        }

        @Override
        public void F(int i10, s.b bVar, int i11) {
            if (b(i10, bVar)) {
                this.f19059c.k(i11);
            }
        }

        @Override
        public void G(int i10, s.b bVar, k kVar, o oVar) {
            if (b(i10, bVar)) {
                this.f19058b.p(kVar, g(oVar));
            }
        }

        @Override
        public void J(int i10, s.b bVar, Exception exc) {
            if (b(i10, bVar)) {
                this.f19059c.l(exc);
            }
        }

        @Override
        public void Z(int i10, s.b bVar, o oVar) {
            if (b(i10, bVar)) {
                this.f19058b.i(g(oVar));
            }
        }

        @Override
        public void a0(int i10, s.b bVar, k kVar, o oVar, IOException iOException, boolean z10) {
            if (b(i10, bVar)) {
                this.f19058b.t(kVar, g(oVar), iOException, z10);
            }
        }

        public final boolean b(int i10, s.b bVar) {
            s.b bVar2;
            if (bVar != null) {
                bVar2 = f.this.B(this.f19057a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int D = f.this.D(this.f19057a, i10);
            y.a aVar = this.f19058b;
            if (aVar.f19194a != D || !l0.c(aVar.f19195b, bVar2)) {
                this.f19058b = f.this.r(D, bVar2, 0L);
            }
            w.a aVar2 = this.f19059c;
            if (aVar2.f21367a == D && l0.c(aVar2.f21368b, bVar2)) {
                return true;
            }
            this.f19059c = f.this.p(D, bVar2);
            return true;
        }

        @Override
        public void b0(int i10, s.b bVar, k kVar, o oVar) {
            if (b(i10, bVar)) {
                this.f19058b.v(kVar, g(oVar));
            }
        }

        public final o g(o oVar) {
            long C = f.this.C(this.f19057a, oVar.f19163f);
            long C2 = f.this.C(this.f19057a, oVar.f19164g);
            return (C == oVar.f19163f && C2 == oVar.f19164g) ? oVar : new o(oVar.f19158a, oVar.f19159b, oVar.f19160c, oVar.f19161d, oVar.f19162e, C, C2);
        }

        @Override
        public void g0(int i10, s.b bVar) {
            if (b(i10, bVar)) {
                this.f19059c.j();
            }
        }

        @Override
        public void k0(int i10, s.b bVar) {
            if (b(i10, bVar)) {
                this.f19059c.m();
            }
        }

        @Override
        public void l0(int i10, s.b bVar) {
            p.a(this, i10, bVar);
        }
    }

    public static final class b<T> {
        public final s f19060a;
        public final s.c f19061b;
        public final f<T>.a f19062c;

        public b(s sVar, s.c cVar, f<T>.a aVar) {
            this.f19060a = sVar;
            this.f19061b = cVar;
            this.f19062c = aVar;
        }
    }

    public s.b B(T t10, s.b bVar) {
        return bVar;
    }

    public long C(T t10, long j10) {
        return j10;
    }

    public int D(T t10, int i10) {
        return i10;
    }

    public abstract void E(T t10, s sVar, o3 o3Var);

    public final void G(final T t10, s sVar) {
        c5.a.a(!this.f19054h.containsKey(t10));
        s.c eVar = new s.c() {
            @Override
            public final void a(s sVar2, o3 o3Var) {
                f.this.E(t10, sVar2, o3Var);
            }
        };
        a aVar = new a(t10);
        this.f19054h.put(t10, new b<>(sVar, eVar, aVar));
        sVar.o((Handler) c5.a.e(this.f19055i), aVar);
        sVar.f((Handler) c5.a.e(this.f19055i), aVar);
        sVar.c(eVar, this.f19056j, v());
        if (!w()) {
            sVar.b(eVar);
        }
    }

    @Override
    public void j() {
        for (b<T> bVar : this.f19054h.values()) {
            bVar.f19060a.j();
        }
    }

    @Override
    public void t() {
        for (b<T> bVar : this.f19054h.values()) {
            bVar.f19060a.b(bVar.f19061b);
        }
    }

    @Override
    public void u() {
        for (b<T> bVar : this.f19054h.values()) {
            bVar.f19060a.k(bVar.f19061b);
        }
    }

    @Override
    public void x(i0 i0Var) {
        this.f19056j = i0Var;
        this.f19055i = l0.u();
    }

    @Override
    public void z() {
        for (b<T> bVar : this.f19054h.values()) {
            bVar.f19060a.m(bVar.f19061b);
            bVar.f19060a.e(bVar.f19062c);
            bVar.f19060a.i(bVar.f19062c);
        }
        this.f19054h.clear();
    }
}
