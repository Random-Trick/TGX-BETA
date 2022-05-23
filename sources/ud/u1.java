package ud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class u1 {
    public int f24475a;
    public final ArrayList<v4<?>> f24476b;
    public boolean f24477c;
    public final List<a> f24478d;

    public interface a {
        void a(u1 u1Var);
    }

    public u1() {
        this.f24478d = new ArrayList();
        this.f24476b = new ArrayList<>();
        this.f24475a = -1;
    }

    public void A(v4<?> v4Var) {
        if (v4Var != null) {
            this.f24476b.clear();
            this.f24476b.add(v4Var);
            this.f24475a = 0;
            s();
            return;
        }
        throw new IllegalArgumentException();
    }

    public void B(boolean z10) {
        this.f24477c = z10;
    }

    public int C() {
        return this.f24476b.size();
    }

    public void a(a aVar) {
        this.f24478d.add(aVar);
    }

    public void b(q1 q1Var) {
        if (!this.f24476b.isEmpty()) {
            Iterator<v4<?>> it = this.f24476b.iterator();
            while (it.hasNext()) {
                v4<?> next = it.next();
                if (!next.Sa()) {
                    next.N8(q1Var);
                    next.Z8();
                    next.e9();
                }
            }
            this.f24476b.clear();
            this.f24475a = -1;
            s();
        }
    }

    public v4<?> c(int i10) {
        v4<?> u10 = u(i10);
        if (u10 != null) {
            u10.Z8();
        }
        return u10;
    }

    public void d(int i10) {
        while (C() > i10) {
            c(0);
        }
    }

    public void e(int i10) {
        for (int size = this.f24476b.size() - 2; size >= 0; size--) {
            v4<?> v4Var = this.f24476b.get(size);
            if (v4Var != null && v4Var.R9() == i10) {
                c(size);
            }
        }
    }

    public void f() {
        d(1);
    }

    public v4<?> g(int i10) {
        Iterator<v4<?>> it = this.f24476b.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().R9() == i10) {
                return c(i11);
            }
            i11++;
        }
        return null;
    }

    public v4<?> h(int i10) {
        Iterator<v4<?>> it = this.f24476b.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().R9() == i10 && this.f24475a != i11) {
                return c(i11);
            }
            i11++;
        }
        return null;
    }

    public v4<?> i(int i10) {
        for (int size = this.f24476b.size() - 1; size >= 0; size--) {
            v4<?> v4Var = this.f24476b.get(size);
            if (v4Var.R9() == i10) {
                return v4Var;
            }
        }
        return null;
    }

    public v4<?> j(int i10) {
        if (i10 < 0 || i10 >= this.f24476b.size()) {
            return null;
        }
        return this.f24476b.get(i10);
    }

    public ArrayList<v4<?>> k() {
        return this.f24476b;
    }

    public v4<?> l() {
        return j(this.f24475a);
    }

    public int m() {
        if (this.f24477c) {
            return 0;
        }
        return this.f24475a;
    }

    public v4<?> n() {
        return j(this.f24475a - 1);
    }

    public void o(v4<?> v4Var, int i10) {
        if (i10 <= this.f24475a) {
            this.f24476b.add(i10, v4Var);
            this.f24475a++;
            s();
        }
    }

    public void p(v4<?> v4Var) {
        o(v4Var, this.f24475a);
    }

    public boolean q() {
        return this.f24476b.isEmpty();
    }

    public boolean r() {
        return this.f24477c;
    }

    public final void s() {
        List<a> list = this.f24478d;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f24478d.get(size).a(this);
            }
        }
    }

    public void t(v4<?> v4Var, boolean z10) {
        ArrayList<v4<?>> arrayList;
        if (v4Var != null) {
            if (this.f24476b.size() > 0) {
                if (v4Var == this.f24476b.get(arrayList.size() - 1)) {
                    throw new IllegalArgumentException();
                }
            }
            this.f24476b.add(v4Var);
            if (z10) {
                this.f24475a++;
            }
            s();
            return;
        }
        throw new IllegalArgumentException();
    }

    public v4<?> u(int i10) {
        int i11;
        v4<?> v4Var;
        if (i10 < 0 || i10 >= this.f24476b.size() || i10 == (i11 = this.f24475a)) {
            return null;
        }
        if (i10 < i11) {
            this.f24475a = i11 - 1;
            v4Var = this.f24476b.remove(i10);
        } else {
            v4Var = this.f24476b.remove(i10);
        }
        s();
        return v4Var;
    }

    public v4<?> v(int i10) {
        Iterator<v4<?>> it = this.f24476b.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().R9() == i10) {
                return u(i11);
            }
            i11++;
        }
        return null;
    }

    public void w(a aVar) {
        this.f24478d.remove(aVar);
    }

    public v4<?> x() {
        if (this.f24476b.isEmpty()) {
            return null;
        }
        v4<?> remove = this.f24476b.remove(this.f24475a);
        this.f24475a--;
        s();
        return remove;
    }

    public void y(int i10, v4<?> v4Var) {
        if (v4Var == null) {
            throw new IllegalArgumentException();
        } else if (i10 < 0 || i10 >= this.f24476b.size()) {
            throw new IndexOutOfBoundsException();
        } else {
            this.f24476b.get(i10).Z8();
            this.f24476b.set(i10, v4Var);
        }
    }

    public void z(q1 q1Var, boolean z10) {
        v4<?> x10 = x();
        if (!z10) {
            b(q1Var);
        } else if (this.f24476b.size() > 1) {
            v4<?> v4Var = this.f24476b.get(0);
            Iterator<v4<?>> it = this.f24476b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                v4<?> next = it.next();
                if (i10 != 0 && !next.Sa()) {
                    next.N8(q1Var);
                    next.Z8();
                    next.e9();
                }
                i10++;
            }
            this.f24476b.clear();
            this.f24476b.add(v4Var);
            this.f24475a = 0;
        }
        t(x10, true);
    }

    public u1(v4<?> v4Var) {
        this.f24478d = new ArrayList();
        if (v4Var != null) {
            ArrayList<v4<?>> arrayList = new ArrayList<>();
            this.f24476b = arrayList;
            arrayList.add(v4Var);
            this.f24475a = 0;
            return;
        }
        throw new IllegalArgumentException();
    }
}
