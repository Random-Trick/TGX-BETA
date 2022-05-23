package o4;

import a5.r;
import b5.b;
import c5.l0;
import java.io.IOException;
import m3.g3;
import o4.p;
import o4.s;

public final class m implements p, p.a {
    public s M;
    public p N;
    public p.a O;
    public a P;
    public boolean Q;
    public long R = -9223372036854775807L;
    public final s.b f19141a;
    public final long f19142b;
    public final b f19143c;

    public interface a {
        void a(s.b bVar);

        void b(s.b bVar, IOException iOException);
    }

    public m(s.b bVar, b bVar2, long j10) {
        this.f19141a = bVar;
        this.f19143c = bVar2;
        this.f19142b = j10;
    }

    public void a(s.b bVar) {
        long m10 = m(this.f19142b);
        p a10 = ((s) c5.a.e(this.M)).a(bVar, this.f19143c, m10);
        this.N = a10;
        if (this.O != null) {
            a10.d(this, m10);
        }
    }

    @Override
    public void b(p pVar) {
        ((p.a) l0.j(this.O)).b(this);
        a aVar = this.P;
        if (aVar != null) {
            aVar.a(this.f19141a);
        }
    }

    @Override
    public long c() {
        return ((p) l0.j(this.N)).c();
    }

    @Override
    public void d(p.a aVar, long j10) {
        this.O = aVar;
        p pVar = this.N;
        if (pVar != null) {
            pVar.d(this, m(this.f19142b));
        }
    }

    @Override
    public long e(long j10, g3 g3Var) {
        return ((p) l0.j(this.N)).e(j10, g3Var);
    }

    @Override
    public void g() {
        try {
            p pVar = this.N;
            if (pVar != null) {
                pVar.g();
            } else {
                s sVar = this.M;
                if (sVar != null) {
                    sVar.j();
                }
            }
        } catch (IOException e10) {
            a aVar = this.P;
            if (aVar == null) {
                throw e10;
            } else if (!this.Q) {
                this.Q = true;
                aVar.b(this.f19141a, e10);
            }
        }
    }

    @Override
    public long h(long j10) {
        return ((p) l0.j(this.N)).h(j10);
    }

    @Override
    public boolean i(long j10) {
        p pVar = this.N;
        return pVar != null && pVar.i(j10);
    }

    @Override
    public boolean j() {
        p pVar = this.N;
        return pVar != null && pVar.j();
    }

    public long k() {
        return this.R;
    }

    public long l() {
        return this.f19142b;
    }

    public final long m(long j10) {
        long j11 = this.R;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override
    public long n() {
        return ((p) l0.j(this.N)).n();
    }

    @Override
    public long o(r[] rVarArr, boolean[] zArr, j0[] j0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.R;
        if (j12 == -9223372036854775807L || j10 != this.f19142b) {
            j11 = j10;
        } else {
            this.R = -9223372036854775807L;
            j11 = j12;
        }
        return ((p) l0.j(this.N)).o(rVarArr, zArr, j0VarArr, zArr2, j11);
    }

    @Override
    public r0 p() {
        return ((p) l0.j(this.N)).p();
    }

    public void f(p pVar) {
        ((p.a) l0.j(this.O)).f(this);
    }

    @Override
    public long r() {
        return ((p) l0.j(this.N)).r();
    }

    @Override
    public void s(long j10, boolean z10) {
        ((p) l0.j(this.N)).s(j10, z10);
    }

    public void t(long j10) {
        this.R = j10;
    }

    @Override
    public void u(long j10) {
        ((p) l0.j(this.N)).u(j10);
    }

    public void v() {
        if (this.N != null) {
            ((s) c5.a.e(this.M)).d(this.N);
        }
    }

    public void w(s sVar) {
        c5.a.f(this.M == null);
        this.M = sVar;
    }
}
