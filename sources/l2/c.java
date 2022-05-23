package l2;

import java.util.ArrayList;
import java.util.List;
import m2.d;
import o2.p;

public abstract class c<T> implements k2.a<T> {
    public final List<String> f15997a = new ArrayList();
    public T f15998b;
    public d<T> f15999c;
    public a f16000d;

    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    public c(d<T> dVar) {
        this.f15999c = dVar;
    }

    @Override
    public void a(T t10) {
        this.f15998b = t10;
        h(this.f16000d, t10);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(T t10);

    public boolean d(String str) {
        T t10 = this.f15998b;
        return t10 != null && c(t10) && this.f15997a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f15997a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f15997a.add(pVar.f18590a);
            }
        }
        if (this.f15997a.isEmpty()) {
            this.f15999c.c(this);
        } else {
            this.f15999c.a(this);
        }
        h(this.f16000d, this.f15998b);
    }

    public void f() {
        if (!this.f15997a.isEmpty()) {
            this.f15997a.clear();
            this.f15999c.c(this);
        }
    }

    public void g(a aVar) {
        if (this.f16000d != aVar) {
            this.f16000d = aVar;
            h(aVar, this.f15998b);
        }
    }

    public final void h(a aVar, T t10) {
        if (!this.f15997a.isEmpty() && aVar != null) {
            if (t10 == null || c(t10)) {
                aVar.b(this.f15997a);
            } else {
                aVar.a(this.f15997a);
            }
        }
    }
}
