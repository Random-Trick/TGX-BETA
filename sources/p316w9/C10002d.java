package p316w9;

import java.util.Iterator;
import java.util.Map;
import p107ha.C5054l;
import p123ia.C5295h0;
import p192n9.EnumC7313d;
import p316w9.AbstractC10008j;
import qa.C8298k;

public final class C10002d<T> implements AbstractC10008j<T> {
    public final Map<EnumC7313d, T> f32610a;

    public C10002d(T t, T t2) {
        this.f32610a = C5295h0.m23422f(C5054l.m24189a(EnumC7313d.VIDEO, t), C5054l.m24189a(EnumC7313d.AUDIO, t2));
    }

    @Override
    public T mo6241a() {
        return (T) AbstractC10008j.C10009a.m6253b(this);
    }

    @Override
    public T mo6240b() {
        return (T) AbstractC10008j.C10009a.m6248g(this);
    }

    @Override
    public void mo6258c(T t, T t2) {
        AbstractC10008j.C10009a.m6246i(this, t, t2);
    }

    @Override
    public T mo6239d(EnumC7313d dVar) {
        C8298k.m12933e(dVar, "type");
        T t = this.f32610a.get(dVar);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override
    public T mo6238f(EnumC7313d dVar) {
        C8298k.m12933e(dVar, "type");
        return (T) AbstractC10008j.C10009a.m6250e(this, dVar);
    }

    @Override
    public boolean mo6237g(EnumC7313d dVar) {
        C8298k.m12933e(dVar, "type");
        return this.f32610a.get(dVar) != null;
    }

    @Override
    public int getSize() {
        return AbstractC10008j.C10009a.m6249f(this);
    }

    @Override
    public Iterator<T> iterator() {
        return AbstractC10008j.C10009a.m6247h(this);
    }

    @Override
    public void mo6257j(T t) {
        AbstractC10008j.C10009a.m6245j(this, t);
    }

    @Override
    public boolean mo6236k() {
        return AbstractC10008j.C10009a.m6252c(this);
    }

    @Override
    public T mo6235l() {
        return (T) AbstractC10008j.C10009a.m6243l(this);
    }

    @Override
    public T mo6234n() {
        return (T) AbstractC10008j.C10009a.m6254a(this);
    }

    @Override
    public boolean mo6233o() {
        return AbstractC10008j.C10009a.m6251d(this);
    }

    @Override
    public void mo6256p(EnumC7313d dVar, T t) {
        C8298k.m12933e(dVar, "type");
        this.f32610a.put(dVar, t);
    }

    @Override
    public void mo6255q(T t) {
        AbstractC10008j.C10009a.m6244k(this, t);
    }
}
