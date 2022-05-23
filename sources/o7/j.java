package o7;

import n6.m;
import q7.d;

public class j implements n {
    public final o f19302a;
    public final m<l> f19303b;

    public j(o oVar, m<l> mVar) {
        this.f19302a = oVar;
        this.f19303b = mVar;
    }

    @Override
    public boolean a(d dVar) {
        if (!dVar.k() || this.f19302a.f(dVar)) {
            return false;
        }
        this.f19303b.c(l.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override
    public boolean b(Exception exc) {
        this.f19303b.d(exc);
        return true;
    }
}
