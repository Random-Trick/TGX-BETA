package p126j$.util.stream;

class C5751p extends AbstractC5739m2 {
    boolean f18448b;
    Object f18449c;

    public C5751p(C5761r rVar, AbstractC5759q2 q2Var) {
        super(q2Var);
    }

    @Override
    public void mo22132h() {
        this.f18448b = false;
        this.f18449c = null;
        this.f18428a.mo22132h();
    }

    @Override
    public void mo22131j(long j) {
        this.f18448b = false;
        this.f18449c = null;
        this.f18428a.mo22131j(-1L);
    }

    @Override
    public void mo22128k(Object obj) {
        if (obj != null) {
            Object obj2 = this.f18449c;
            if (obj2 == null || !obj.equals(obj2)) {
                AbstractC5759q2 q2Var = this.f18428a;
                this.f18449c = obj;
                q2Var.mo22128k(obj);
            }
        } else if (!this.f18448b) {
            this.f18448b = true;
            AbstractC5759q2 q2Var2 = this.f18428a;
            this.f18449c = null;
            q2Var2.mo22128k(null);
        }
    }
}
