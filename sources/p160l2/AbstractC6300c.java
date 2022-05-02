package p160l2;

import java.util.ArrayList;
import java.util.List;
import p145k2.AbstractC6041a;
import p173m2.AbstractC6546d;
import p198o2.C7554p;

public abstract class AbstractC6300c<T> implements AbstractC6041a<T> {
    public final List<String> f19836a = new ArrayList();
    public T f19837b;
    public AbstractC6546d<T> f19838c;
    public AbstractC6301a f19839d;

    public interface AbstractC6301a {
        void mo20697a(List<String> list);

        void mo20696b(List<String> list);
    }

    public AbstractC6300c(AbstractC6546d<T> dVar) {
        this.f19838c = dVar;
    }

    @Override
    public void mo20703a(T t) {
        this.f19837b = t;
        m20698h(this.f19839d, t);
    }

    public abstract boolean mo20691b(C7554p pVar);

    public abstract boolean mo20690c(T t);

    public boolean m20702d(String str) {
        T t = this.f19837b;
        return t != null && mo20690c(t) && this.f19836a.contains(str);
    }

    public void m20701e(Iterable<C7554p> iterable) {
        this.f19836a.clear();
        for (C7554p pVar : iterable) {
            if (mo20691b(pVar)) {
                this.f19836a.add(pVar.f24140a);
            }
        }
        if (this.f19836a.isEmpty()) {
            this.f19838c.m20134c(this);
        } else {
            this.f19838c.m20135a(this);
        }
        m20698h(this.f19839d, this.f19837b);
    }

    public void m20700f() {
        if (!this.f19836a.isEmpty()) {
            this.f19836a.clear();
            this.f19838c.m20134c(this);
        }
    }

    public void m20699g(AbstractC6301a aVar) {
        if (this.f19839d != aVar) {
            this.f19839d = aVar;
            m20698h(aVar, this.f19837b);
        }
    }

    public final void m20698h(AbstractC6301a aVar, T t) {
        if (!this.f19836a.isEmpty() && aVar != null) {
            if (t == null || mo20690c(t)) {
                aVar.mo20696b(this.f19836a);
            } else {
                aVar.mo20697a(this.f19836a);
            }
        }
    }
}
