package p126j$.util.stream;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.Function;

class C5756q extends AbstractC5739m2 {
    public final int f18452b = 1;
    Object f18453c;
    final Object f18454d;

    public C5756q(C5761r rVar, AbstractC5759q2 q2Var) {
        super(q2Var);
        this.f18454d = rVar;
    }

    @Override
    public void mo22132h() {
        switch (this.f18452b) {
            case 0:
                this.f18453c = null;
                this.f18428a.mo22132h();
                return;
            default:
                this.f18428a.mo22132h();
                return;
        }
    }

    @Override
    public void mo22131j(long j) {
        switch (this.f18452b) {
            case 0:
                this.f18453c = new HashSet();
                this.f18428a.mo22131j(-1L);
                return;
            case 1:
                this.f18428a.mo22131j(-1L);
                return;
            case 2:
                this.f18428a.mo22131j(-1L);
                return;
            default:
                this.f18428a.mo22131j(-1L);
                return;
        }
    }

    @Override
    public void mo22128k(Object obj) {
        AbstractC5732l0 l0Var;
        switch (this.f18452b) {
            case 0:
                if (!((Set) this.f18453c).contains(obj)) {
                    ((Set) this.f18453c).add(obj);
                    this.f18428a.mo22128k(obj);
                    return;
                }
                return;
            case 1:
                AbstractC5777u0 u0Var = (AbstractC5777u0) ((Function) ((C5556A) this.f18454d).f18092v).mo22502a(obj);
                if (u0Var != null) {
                    try {
                        u0Var.sequential().mo22171b((AbstractC5535q) this.f18453c);
                    } finally {
                        try {
                            ((AbstractC5686c) u0Var).close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                }
                if (u0Var != null) {
                    ((AbstractC5686c) u0Var).close();
                    return;
                }
                return;
            case 2:
                l0Var = (AbstractC5732l0) ((Function) ((C5801z) this.f18454d).f18521v).mo22502a(obj);
                if (l0Var != null) {
                    try {
                        l0Var.sequential().mo22221e((AbstractC5530l) this.f18453c);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (l0Var != null) {
                    ((AbstractC5686c) l0Var).close();
                    return;
                }
                return;
            default:
                l0Var = (AbstractC5591H) ((Function) ((C5791x) this.f18454d).f18504v).mo22502a(obj);
                if (l0Var != null) {
                    try {
                        l0Var.sequential().mo22385d((AbstractC5525g) this.f18453c);
                    } finally {
                        try {
                            ((AbstractC5686c) l0Var).close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                }
                if (l0Var != null) {
                    ((AbstractC5686c) l0Var).close();
                    return;
                }
                return;
        }
    }

    public C5756q(C5791x xVar, AbstractC5759q2 q2Var) {
        super(q2Var);
        this.f18454d = xVar;
        AbstractC5759q2 q2Var2 = this.f18428a;
        Objects.requireNonNull(q2Var2);
        this.f18453c = new C5781v(q2Var2, 0);
    }

    public C5756q(C5801z zVar, AbstractC5759q2 q2Var) {
        super(q2Var);
        this.f18454d = zVar;
        AbstractC5759q2 q2Var2 = this.f18428a;
        Objects.requireNonNull(q2Var2);
        this.f18453c = new C5687c0(q2Var2, 0);
    }

    public C5756q(C5556A a, AbstractC5759q2 q2Var) {
        super(q2Var);
        this.f18454d = a;
        AbstractC5759q2 q2Var2 = this.f18428a;
        Objects.requireNonNull(q2Var2);
        this.f18453c = new C5742n0(q2Var2, 0);
    }
}
