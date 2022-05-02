package p177m6;

public final class RunnableC6786t implements Runnable {
    public final AbstractC6775l f21263a;
    public final C6787u f21264b;

    public RunnableC6786t(C6787u uVar, AbstractC6775l lVar) {
        this.f21264b = uVar;
        this.f21263a = lVar;
    }

    @Override
    public final void run() {
        C6778m0 m0Var;
        C6778m0 m0Var2;
        C6778m0 m0Var3;
        AbstractC6757c cVar;
        C6778m0 m0Var4;
        C6778m0 m0Var5;
        if (this.f21263a.mo19068n()) {
            m0Var5 = this.f21264b.f21267c;
            m0Var5.m19060v();
            return;
        }
        try {
            cVar = this.f21264b.f21266b;
            Object a = cVar.mo10597a(this.f21263a);
            m0Var4 = this.f21264b.f21267c;
            m0Var4.m19064r(a);
        } catch (C6771j e) {
            if (e.getCause() instanceof Exception) {
                m0Var2 = this.f21264b.f21267c;
                m0Var2.m19062t((Exception) e.getCause());
                return;
            }
            m0Var = this.f21264b.f21267c;
            m0Var.m19062t(e);
        } catch (Exception e2) {
            m0Var3 = this.f21264b.f21267c;
            m0Var3.m19062t(e2);
        }
    }
}
