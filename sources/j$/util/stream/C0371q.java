package j$.util.stream;

final class C0371q extends AbstractC0359n2 {
    boolean f14842b;
    Object f14843c;

    public C0371q(AbstractC0378r2 r2Var) {
        super(r2Var);
    }

    @Override
    public final void h() {
        this.f14842b = false;
        this.f14843c = null;
        this.f14822a.h();
    }

    @Override
    public final void k(long j10) {
        this.f14842b = false;
        this.f14843c = null;
        this.f14822a.k(-1L);
    }

    @Override
    public final void l(Object obj) {
        if (obj != null) {
            Object obj2 = this.f14843c;
            if (obj2 == null || !obj.equals(obj2)) {
                AbstractC0378r2 r2Var = this.f14822a;
                this.f14843c = obj;
                r2Var.l(obj);
            }
        } else if (!this.f14842b) {
            this.f14842b = true;
            AbstractC0378r2 r2Var2 = this.f14822a;
            this.f14843c = null;
            r2Var2.l(null);
        }
    }
}
