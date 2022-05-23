package j$.util.stream;

import j$.util.function.AbstractC0278f;
import j$.util.function.Function;
import j$.util.function.n;
import j$.util.function.v;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

final class r extends AbstractC0359n2 {
    public final int f14846b = 2;
    Object f14847c;
    final Object f14848d;

    public r(C0380s sVar, AbstractC0378r2 r2Var) {
        super(r2Var);
        this.f14848d = sVar;
    }

    @Override
    public final void h() {
        switch (this.f14846b) {
            case 0:
                this.f14847c = null;
                this.f14822a.h();
                return;
            default:
                super.h();
                return;
        }
    }

    @Override
    public final void k(long j10) {
        switch (this.f14846b) {
            case 0:
                this.f14847c = new HashSet();
                this.f14822a.k(-1L);
                return;
            case 1:
                this.f14822a.k(-1L);
                return;
            case 2:
                this.f14822a.k(-1L);
                return;
            default:
                this.f14822a.k(-1L);
                return;
        }
    }

    @Override
    public final void l(Object obj) {
        AbstractC0352m0 m0Var;
        switch (this.f14846b) {
            case 0:
                if (!((Set) this.f14847c).contains(obj)) {
                    ((Set) this.f14847c).add(obj);
                    this.f14822a.l(obj);
                    return;
                }
                return;
            case 1:
                AbstractC0393v0 v0Var = (AbstractC0393v0) ((Function) ((B) this.f14848d).f14487v).a(obj);
                if (v0Var != null) {
                    try {
                        v0Var.sequential().b((v) this.f14847c);
                    } finally {
                        try {
                            ((AbstractC0301c) v0Var).close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                }
                if (v0Var != null) {
                    ((AbstractC0301c) v0Var).close();
                    return;
                }
                return;
            case 2:
                m0Var = (AbstractC0352m0) ((Function) ((A) this.f14848d).f14480v).a(obj);
                if (m0Var != null) {
                    try {
                        m0Var.sequential().e((n) this.f14847c);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (m0Var != null) {
                    ((AbstractC0301c) m0Var).close();
                    return;
                }
                return;
            default:
                m0Var = (I) ((Function) ((C0404y) this.f14848d).f14898v).a(obj);
                if (m0Var != null) {
                    try {
                        m0Var.sequential().d((AbstractC0278f) this.f14847c);
                    } finally {
                        try {
                            ((AbstractC0301c) m0Var).close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                }
                if (m0Var != null) {
                    ((AbstractC0301c) m0Var).close();
                    return;
                }
                return;
        }
    }

    public r(C0404y yVar, AbstractC0378r2 r2Var) {
        super(r2Var);
        this.f14848d = yVar;
        AbstractC0378r2 r2Var2 = this.f14822a;
        Objects.requireNonNull(r2Var2);
        this.f14847c = new C0396w(r2Var2, 0);
    }

    public r(A a10, AbstractC0378r2 r2Var) {
        super(r2Var);
        this.f14848d = a10;
        AbstractC0378r2 r2Var2 = this.f14822a;
        Objects.requireNonNull(r2Var2);
        this.f14847c = new C0307d0(r2Var2, 0);
    }

    public r(B b10, AbstractC0378r2 r2Var) {
        super(r2Var);
        this.f14848d = b10;
        AbstractC0378r2 r2Var2 = this.f14822a;
        Objects.requireNonNull(r2Var2);
        this.f14847c = new C0362o0(r2Var2, 0);
    }
}
