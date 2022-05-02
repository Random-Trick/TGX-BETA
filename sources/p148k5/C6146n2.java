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
        if (i == 2 && rVar.m21158c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override
    public final void mo21185a(Status status) {
        this.f19490c.m19084d(this.f19491d.mo21180a(status));
    }

    @Override
    public final void mo21184b(Exception exc) {
        this.f19490c.m19084d(exc);
    }

    @Override
    public final void mo21183c(C6172u uVar, boolean z) {
        uVar.m21127b(this.f19490c, z);
    }

    @Override
    public final void mo21182d(C6093c1<?> c1Var) {
        try {
            this.f19489b.mo21159b(c1Var.m21341v(), this.f19490c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo21185a(AbstractC6154p2.m21181e(e2));
        } catch (RuntimeException e3) {
            this.f19490c.m19084d(e3);
        }
    }

    @Override
    public final C5219c[] mo21187f(C6093c1<?> c1Var) {
        return this.f19489b.m21157d();
    }

    @Override
    public final boolean mo21186g(C6093c1<?> c1Var) {
        return this.f19489b.m21158c();
    }
}
