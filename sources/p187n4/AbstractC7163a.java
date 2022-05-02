package p187n4;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p006a5.AbstractC0150i0;
import p020b5.C1186a;
import p174m3.AbstractC6604g3;
import p187n4.AbstractC7230t;
import p187n4.AbstractC7240z;
import p230q3.AbstractC8219w;

public abstract class AbstractC7163a implements AbstractC7230t {
    public final ArrayList<AbstractC7230t.AbstractC7232b> f22747a = new ArrayList<>(1);
    public final HashSet<AbstractC7230t.AbstractC7232b> f22748b = new HashSet<>(1);
    public final AbstractC7240z.C7241a f22749c = new AbstractC7240z.C7241a();
    public final AbstractC8219w.C8220a f22750d = new AbstractC8219w.C8220a();
    public Looper f22751e;
    public AbstractC6604g3 f22752f;

    @Override
    public final void mo17262a(AbstractC7230t.AbstractC7232b bVar, AbstractC0150i0 i0Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f22751e;
        C1186a.m38192a(looper == null || looper == myLooper);
        AbstractC6604g3 g3Var = this.f22752f;
        this.f22747a.add(bVar);
        if (this.f22751e == null) {
            this.f22751e = myLooper;
            this.f22748b.add(bVar);
            mo17308w(i0Var);
        } else if (g3Var != null) {
            mo17254j(bVar);
            bVar.mo17247a(this, g3Var);
        }
    }

    @Override
    public final void mo17261b(AbstractC7240z zVar) {
        this.f22749c.m17214w(zVar);
    }

    @Override
    public final void mo17258e(Handler handler, AbstractC8219w wVar) {
        C1186a.m38188e(handler);
        C1186a.m38188e(wVar);
        this.f22750d.m13181g(handler, wVar);
    }

    @Override
    public final void mo17256h(AbstractC8219w wVar) {
        this.f22750d.m13168t(wVar);
    }

    @Override
    public final void mo17255i(AbstractC7230t.AbstractC7232b bVar) {
        this.f22747a.remove(bVar);
        if (this.f22747a.isEmpty()) {
            this.f22751e = null;
            this.f22752f = null;
            this.f22748b.clear();
            mo17307y();
            return;
        }
        mo17250n(bVar);
    }

    @Override
    public final void mo17254j(AbstractC7230t.AbstractC7232b bVar) {
        C1186a.m38188e(this.f22751e);
        boolean isEmpty = this.f22748b.isEmpty();
        this.f22748b.add(bVar);
        if (isEmpty) {
            mo17430u();
        }
    }

    @Override
    public final void mo17252l(Handler handler, AbstractC7240z zVar) {
        C1186a.m38188e(handler);
        C1186a.m38188e(zVar);
        this.f22749c.m17231f(handler, zVar);
    }

    @Override
    public boolean mo17251m() {
        return C7228s.m17263b(this);
    }

    @Override
    public final void mo17250n(AbstractC7230t.AbstractC7232b bVar) {
        boolean z = !this.f22748b.isEmpty();
        this.f22748b.remove(bVar);
        if (z && this.f22748b.isEmpty()) {
            mo17431t();
        }
    }

    @Override
    public AbstractC6604g3 mo17249o() {
        return C7228s.m17264a(this);
    }

    public final AbstractC8219w.C8220a m17511p(int i, AbstractC7230t.C7231a aVar) {
        return this.f22750d.m13167u(i, aVar);
    }

    public final AbstractC8219w.C8220a m17510q(AbstractC7230t.C7231a aVar) {
        return this.f22750d.m13167u(0, aVar);
    }

    public final AbstractC7240z.C7241a m17509r(int i, AbstractC7230t.C7231a aVar, long j) {
        return this.f22749c.m17213x(i, aVar, j);
    }

    public final AbstractC7240z.C7241a m17508s(AbstractC7230t.C7231a aVar) {
        return this.f22749c.m17213x(0, aVar, 0L);
    }

    public void mo17431t() {
    }

    public void mo17430u() {
    }

    public final boolean m17507v() {
        return !this.f22748b.isEmpty();
    }

    public abstract void mo17308w(AbstractC0150i0 i0Var);

    public final void m17506x(AbstractC6604g3 g3Var) {
        this.f22752f = g3Var;
        Iterator<AbstractC7230t.AbstractC7232b> it = this.f22747a.iterator();
        while (it.hasNext()) {
            it.next().mo17247a(this, g3Var);
        }
    }

    public abstract void mo17307y();
}
