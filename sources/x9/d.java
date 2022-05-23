package x9;

import ia.l;
import ja.h0;
import java.util.Iterator;
import java.util.Map;
import ra.k;
import x9.j;

public final class d<T> implements j<T> {
    public final Map<o9.d, T> f26175a;

    public d(T t10, T t11) {
        this.f26175a = h0.f(l.a(o9.d.VIDEO, t10), l.a(o9.d.AUDIO, t11));
    }

    @Override
    public T a() {
        return (T) j.a.b(this);
    }

    @Override
    public T b() {
        return (T) j.a.g(this);
    }

    @Override
    public void c(T t10, T t11) {
        j.a.i(this, t10, t11);
    }

    @Override
    public void e(o9.d dVar, T t10) {
        k.e(dVar, "type");
        this.f26175a.put(dVar, t10);
    }

    @Override
    public int getSize() {
        return j.a.f(this);
    }

    @Override
    public void h(T t10) {
        j.a.j(this, t10);
    }

    @Override
    public boolean i() {
        return j.a.c(this);
    }

    @Override
    public Iterator<T> iterator() {
        return j.a.h(this);
    }

    @Override
    public T j() {
        return (T) j.a.l(this);
    }

    @Override
    public T k() {
        return (T) j.a.a(this);
    }

    @Override
    public boolean l() {
        return j.a.d(this);
    }

    @Override
    public T n(o9.d dVar) {
        k.e(dVar, "type");
        T t10 = this.f26175a.get(dVar);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override
    public T o(o9.d dVar) {
        k.e(dVar, "type");
        return (T) j.a.e(this, dVar);
    }

    @Override
    public void p(T t10) {
        j.a.k(this, t10);
    }

    @Override
    public boolean q(o9.d dVar) {
        k.e(dVar, "type");
        return this.f26175a.get(dVar) != null;
    }
}
