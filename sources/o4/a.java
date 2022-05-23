package o4;

import android.os.Handler;
import android.os.Looper;
import b5.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m3.o3;
import n3.p1;
import o4.s;
import o4.y;
import q3.w;

public abstract class a implements s {
    public final ArrayList<s.c> f18951a = new ArrayList<>(1);
    public final HashSet<s.c> f18952b = new HashSet<>(1);
    public final y.a f18953c = new y.a();
    public final w.a f18954d = new w.a();
    public Looper f18955e;
    public o3 f18956f;
    public p1 f18957g;

    @Override
    public final void b(s.c cVar) {
        boolean z10 = !this.f18952b.isEmpty();
        this.f18952b.remove(cVar);
        if (z10 && this.f18952b.isEmpty()) {
            t();
        }
    }

    @Override
    public final void c(s.c cVar, i0 i0Var, p1 p1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f18955e;
        c5.a.a(looper == null || looper == myLooper);
        this.f18957g = p1Var;
        o3 o3Var = this.f18956f;
        this.f18951a.add(cVar);
        if (this.f18955e == null) {
            this.f18955e = myLooper;
            this.f18952b.add(cVar);
            x(i0Var);
        } else if (o3Var != null) {
            k(cVar);
            cVar.a(this, o3Var);
        }
    }

    @Override
    public final void e(y yVar) {
        this.f18953c.w(yVar);
    }

    @Override
    public final void f(Handler handler, w wVar) {
        c5.a.e(handler);
        c5.a.e(wVar);
        this.f18954d.g(handler, wVar);
    }

    @Override
    public final void i(w wVar) {
        this.f18954d.t(wVar);
    }

    @Override
    public final void k(s.c cVar) {
        c5.a.e(this.f18955e);
        boolean isEmpty = this.f18952b.isEmpty();
        this.f18952b.add(cVar);
        if (isEmpty) {
            u();
        }
    }

    @Override
    public boolean l() {
        return r.b(this);
    }

    @Override
    public final void m(s.c cVar) {
        this.f18951a.remove(cVar);
        if (this.f18951a.isEmpty()) {
            this.f18955e = null;
            this.f18956f = null;
            this.f18957g = null;
            this.f18952b.clear();
            z();
            return;
        }
        b(cVar);
    }

    @Override
    public o3 n() {
        return r.a(this);
    }

    @Override
    public final void o(Handler handler, y yVar) {
        c5.a.e(handler);
        c5.a.e(yVar);
        this.f18953c.f(handler, yVar);
    }

    public final w.a p(int i10, s.b bVar) {
        return this.f18954d.u(i10, bVar);
    }

    public final w.a q(s.b bVar) {
        return this.f18954d.u(0, bVar);
    }

    public final y.a r(int i10, s.b bVar, long j10) {
        return this.f18953c.x(i10, bVar, j10);
    }

    public final y.a s(s.b bVar) {
        return this.f18953c.x(0, bVar, 0L);
    }

    public void t() {
    }

    public void u() {
    }

    public final p1 v() {
        return (p1) c5.a.h(this.f18957g);
    }

    public final boolean w() {
        return !this.f18952b.isEmpty();
    }

    public abstract void x(i0 i0Var);

    public final void y(o3 o3Var) {
        this.f18956f = o3Var;
        Iterator<s.c> it = this.f18951a.iterator();
        while (it.hasNext()) {
            it.next().a(this, o3Var);
        }
    }

    public abstract void z();
}
