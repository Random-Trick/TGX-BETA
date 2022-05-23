package n6;

public final class t implements Runnable {
    public final l f17738a;
    public final u f17739b;

    public t(u uVar, l lVar) {
        this.f17739b = uVar;
        this.f17738a = lVar;
    }

    @Override
    public final void run() {
        m0 m0Var;
        m0 m0Var2;
        m0 m0Var3;
        c cVar;
        m0 m0Var4;
        m0 m0Var5;
        if (this.f17738a.n()) {
            m0Var5 = this.f17739b.f17742c;
            m0Var5.v();
            return;
        }
        try {
            cVar = this.f17739b.f17741b;
            Object a10 = cVar.a(this.f17738a);
            m0Var4 = this.f17739b.f17742c;
            m0Var4.r(a10);
        } catch (j e10) {
            if (e10.getCause() instanceof Exception) {
                m0Var2 = this.f17739b.f17742c;
                m0Var2.t((Exception) e10.getCause());
                return;
            }
            m0Var = this.f17739b.f17742c;
            m0Var.t(e10);
        } catch (Exception e11) {
            m0Var3 = this.f17739b.f17742c;
            m0Var3.t(e11);
        }
    }
}
