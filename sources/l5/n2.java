package l5;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j5.c;
import k5.a;
import n6.m;

public final class n2<ResultT> extends p1 {
    public final r<a.b, ResultT> f16176b;
    public final m<ResultT> f16177c;
    public final q f16178d;

    public n2(int i10, r<a.b, ResultT> rVar, m<ResultT> mVar, q qVar) {
        super(i10);
        this.f16177c = mVar;
        this.f16176b = rVar;
        this.f16178d = qVar;
        if (i10 == 2 && rVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override
    public final void a(Status status) {
        this.f16177c.d(this.f16178d.a(status));
    }

    @Override
    public final void b(Exception exc) {
        this.f16177c.d(exc);
    }

    @Override
    public final void c(u uVar, boolean z10) {
        uVar.b(this.f16177c, z10);
    }

    @Override
    public final void d(c1<?> c1Var) {
        try {
            this.f16176b.b(c1Var.v(), this.f16177c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(p2.e(e11));
        } catch (RuntimeException e12) {
            this.f16177c.d(e12);
        }
    }

    @Override
    public final c[] f(c1<?> c1Var) {
        return this.f16176b.d();
    }

    @Override
    public final boolean g(c1<?> c1Var) {
        return this.f16176b.c();
    }
}
