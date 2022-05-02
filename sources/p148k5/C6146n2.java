package p148k5;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p118i5.C5219c;
import p133j5.C5850a;
import p177m6.C6777m;

public final class C6146n2<ResultT> extends AbstractC6153p1 {
    public final AbstractC6159r<C5850a.AbstractC5852b, ResultT> f19489b;
    public final C6777m<ResultT> f19490c;
    public final AbstractC6155q f19491d;

    public C6146n2(int i, AbstractC6159r<C5850a.AbstractC5852b, ResultT> rVar, C6777m<ResultT> mVar, AbstractC6155q qVar) {
        super(i);
        this.f19490c = mVar;
        this.f19489b = rVar;
        this.f19491d = qVar;
        if (i == 2 && rVar.m21157c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override
    public final void mo21184a(Status status) {
        this.f19490c.m19083d(this.f19491d.mo21179a(status));
    }

    @Override
    public final void mo21183b(Exception exc) {
        this.f19490c.m19083d(exc);
    }

    @Override
    public final void mo21182c(C6172u uVar, boolean z) {
        uVar.m21126b(this.f19490c, z);
    }

    @Override
    public final void mo21181d(C6093c1<?> c1Var) {
        try {
            this.f19489b.mo21158b(c1Var.m21340v(), this.f19490c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo21184a(AbstractC6154p2.m21180e(e2));
        } catch (RuntimeException e3) {
            this.f19490c.m19083d(e3);
        }
    }

    @Override
    public final C5219c[] mo21186f(C6093c1<?> c1Var) {
        return this.f19489b.m21156d();
    }

    @Override
    public final boolean mo21185g(C6093c1<?> c1Var) {
        return this.f19489b.m21157c();
    }
}
