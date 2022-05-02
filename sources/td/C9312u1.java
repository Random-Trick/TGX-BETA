package td;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C9312u1 {
    public int f30136a;
    public final ArrayList<AbstractC9323v4<?>> f30137b;
    public boolean f30138c;
    public final List<AbstractC9313a> f30139d;

    public interface AbstractC9313a {
        void mo9486a(C9312u1 u1Var);
    }

    public C9312u1() {
        this.f30139d = new ArrayList();
        this.f30137b = new ArrayList<>();
        this.f30136a = -1;
    }

    public void m9515A(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            this.f30137b.clear();
            this.f30137b.add(v4Var);
            this.f30136a = 0;
            m9494s();
            return;
        }
        throw new IllegalArgumentException();
    }

    public void m9514B(boolean z) {
        this.f30138c = z;
    }

    public int m9513C() {
        return this.f30137b.size();
    }

    public void m9512a(AbstractC9313a aVar) {
        this.f30139d.add(aVar);
    }

    public void m9511b(C9270q1 q1Var) {
        if (!this.f30137b.isEmpty()) {
            Iterator<AbstractC9323v4<?>> it = this.f30137b.iterator();
            while (it.hasNext()) {
                AbstractC9323v4<?> next = it.next();
                if (!next.m9347Sa()) {
                    next.mo9384N8(q1Var);
                    next.mo417Z8();
                    next.mo9266e9();
                }
            }
            this.f30137b.clear();
            this.f30136a = -1;
            m9494s();
        }
    }

    public AbstractC9323v4<?> m9510c(int i) {
        AbstractC9323v4<?> u = m9492u(i);
        if (u != null) {
            u.mo417Z8();
        }
        return u;
    }

    public void m9509d(int i) {
        while (m9513C() > i) {
            m9510c(0);
        }
    }

    public void m9508e(int i) {
        for (int size = this.f30137b.size() - 2; size >= 0; size--) {
            AbstractC9323v4<?> v4Var = this.f30137b.get(size);
            if (v4Var != null && v4Var.mo407R9() == i) {
                m9510c(size);
            }
        }
    }

    public void m9507f() {
        m9509d(1);
    }

    public AbstractC9323v4<?> m9506g(int i) {
        Iterator<AbstractC9323v4<?>> it = this.f30137b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().mo407R9() == i) {
                return m9510c(i2);
            }
            i2++;
        }
        return null;
    }

    public AbstractC9323v4<?> m9505h(int i) {
        Iterator<AbstractC9323v4<?>> it = this.f30137b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().mo407R9() == i && this.f30136a != i2) {
                return m9510c(i2);
            }
            i2++;
        }
        return null;
    }

    public AbstractC9323v4<?> m9504i(int i) {
        for (int size = this.f30137b.size() - 1; size >= 0; size--) {
            AbstractC9323v4<?> v4Var = this.f30137b.get(size);
            if (v4Var.mo407R9() == i) {
                return v4Var;
            }
        }
        return null;
    }

    public AbstractC9323v4<?> m9503j(int i) {
        if (i < 0 || i >= this.f30137b.size()) {
            return null;
        }
        return this.f30137b.get(i);
    }

    public ArrayList<AbstractC9323v4<?>> m9502k() {
        return this.f30137b;
    }

    public AbstractC9323v4<?> m9501l() {
        return m9503j(this.f30136a);
    }

    public int m9500m() {
        if (this.f30138c) {
            return 0;
        }
        return this.f30136a;
    }

    public AbstractC9323v4<?> m9499n() {
        return m9503j(this.f30136a - 1);
    }

    public void m9498o(AbstractC9323v4<?> v4Var, int i) {
        if (i <= this.f30136a) {
            this.f30137b.add(i, v4Var);
            this.f30136a++;
            m9494s();
        }
    }

    public void m9497p(AbstractC9323v4<?> v4Var) {
        m9498o(v4Var, this.f30136a);
    }

    public boolean m9496q() {
        return this.f30137b.isEmpty();
    }

    public boolean m9495r() {
        return this.f30138c;
    }

    public final void m9494s() {
        List<AbstractC9313a> list = this.f30139d;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f30139d.get(size).mo9486a(this);
            }
        }
    }

    public void m9493t(AbstractC9323v4<?> v4Var, boolean z) {
        ArrayList<AbstractC9323v4<?>> arrayList;
        if (v4Var != null) {
            if (this.f30137b.size() > 0) {
                if (v4Var == this.f30137b.get(arrayList.size() - 1)) {
                    throw new IllegalArgumentException();
                }
            }
            this.f30137b.add(v4Var);
            if (z) {
                this.f30136a++;
            }
            m9494s();
            return;
        }
        throw new IllegalArgumentException();
    }

    public AbstractC9323v4<?> m9492u(int i) {
        int i2;
        AbstractC9323v4<?> v4Var;
        if (i < 0 || i >= this.f30137b.size() || i == (i2 = this.f30136a)) {
            return null;
        }
        if (i < i2) {
            this.f30136a = i2 - 1;
            v4Var = this.f30137b.remove(i);
        } else {
            v4Var = this.f30137b.remove(i);
        }
        m9494s();
        return v4Var;
    }

    public AbstractC9323v4<?> m9491v(int i) {
        Iterator<AbstractC9323v4<?>> it = this.f30137b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().mo407R9() == i) {
                return m9492u(i2);
            }
            i2++;
        }
        return null;
    }

    public void m9490w(AbstractC9313a aVar) {
        this.f30139d.remove(aVar);
    }

    public AbstractC9323v4<?> m9489x() {
        if (this.f30137b.isEmpty()) {
            return null;
        }
        AbstractC9323v4<?> remove = this.f30137b.remove(this.f30136a);
        this.f30136a--;
        m9494s();
        return remove;
    }

    public void m9488y(int i, AbstractC9323v4<?> v4Var) {
        if (v4Var == null) {
            throw new IllegalArgumentException();
        } else if (i < 0 || i >= this.f30137b.size()) {
            throw new IndexOutOfBoundsException();
        } else {
            this.f30137b.get(i).mo417Z8();
            this.f30137b.set(i, v4Var);
        }
    }

    public void m9487z(C9270q1 q1Var, boolean z) {
        AbstractC9323v4<?> x = m9489x();
        if (!z) {
            m9511b(q1Var);
        } else if (this.f30137b.size() > 1) {
            AbstractC9323v4<?> v4Var = this.f30137b.get(0);
            Iterator<AbstractC9323v4<?>> it = this.f30137b.iterator();
            int i = 0;
            while (it.hasNext()) {
                AbstractC9323v4<?> next = it.next();
                if (i != 0 && !next.m9347Sa()) {
                    next.mo9384N8(q1Var);
                    next.mo417Z8();
                    next.mo9266e9();
                }
                i++;
            }
            this.f30137b.clear();
            this.f30137b.add(v4Var);
            this.f30136a = 0;
        }
        m9493t(x, true);
    }

    public C9312u1(AbstractC9323v4<?> v4Var) {
        this.f30139d = new ArrayList();
        if (v4Var != null) {
            ArrayList<AbstractC9323v4<?>> arrayList = new ArrayList<>();
            this.f30137b = arrayList;
            arrayList.add(v4Var);
            this.f30136a = 0;
            return;
        }
        throw new IllegalArgumentException();
    }
}
