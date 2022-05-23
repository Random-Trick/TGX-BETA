package o4;

import c5.a;
import t3.f;
import t3.g;
import t3.l;
import t3.q;

public final class b implements z {
    public final l f18959a;
    public f f18960b;
    public g f18961c;

    public b(l lVar) {
        this.f18959a = lVar;
    }

    @Override
    public void a() {
        f fVar = this.f18960b;
        if (fVar != null) {
            fVar.a();
            this.f18960b = null;
        }
        this.f18961c = null;
    }

    @Override
    public void b(long j10, long j11) {
        ((f) a.e(this.f18960b)).b(j10, j11);
    }

    @Override
    public int c(q qVar) {
        return ((f) a.e(this.f18960b)).e((g) a.e(this.f18961c), qVar);
    }

    @Override
    public long d() {
        g gVar = this.f18961c;
        if (gVar != null) {
            return gVar.r();
        }
        return -1L;
    }

    @Override
    public void e() {
        f fVar = this.f18960b;
        if (fVar instanceof z3.f) {
            ((z3.f) fVar).k();
        }
    }

    @Override
    public void f(b5.h r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, t3.h r15) {
        throw new UnsupportedOperationException("Method not decompiled: o4.b.f(b5.h, android.net.Uri, java.util.Map, long, long, t3.h):void");
    }
}
