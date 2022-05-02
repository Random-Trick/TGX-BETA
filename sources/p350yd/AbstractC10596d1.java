package p350yd;

import be.C1379j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p139jb.AbstractC5911c;
import p350yd.AbstractC10596d1;

public abstract class AbstractC10596d1<T> implements AbstractC5911c, Iterable<T> {
    public boolean f33964M;
    public boolean f33965N;
    public boolean f33966O;
    public final int f33968Q;
    public final int f33969R;
    public boolean f33970S;
    public final C10930q6 f33972a;
    public final List<T> f33973b = new ArrayList();
    public int f33974c = 0;
    public int f33967P = -1;
    public final List<AbstractC10598b<T>> f33971T = new ArrayList();

    public class C10597a implements Client.AbstractC7865g {
        public final int f33976a;
        public final boolean f33977b;
        public final Runnable f33978c;

        public C10597a(int i, boolean z, Runnable runnable) {
            this.f33976a = i;
            this.f33977b = z;
            this.f33978c = runnable;
        }

        public void m4487b(C10599c cVar, boolean z, Runnable runnable) {
            AbstractC10596d1.this.m4506T(cVar, z);
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            if (object.getConstructor() == -1679978726) {
                C1379j0.m37302t0(object);
                return;
            }
            final C10599c<T> U = AbstractC10596d1.this.mo1347U(object, this, this.f33976a, this.f33977b);
            if (U != null) {
                AbstractC10596d1 d1Var = AbstractC10596d1.this;
                final boolean z = this.f33977b;
                final Runnable runnable = this.f33978c;
                d1Var.m4504X(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC10596d1.C10597a.this.m4487b(U, z, runnable);
                    }
                });
            }
        }
    }

    public interface AbstractC10598b<T> {
        void mo4486C3(AbstractC10596d1<T> d1Var, boolean z);

        void mo4485C6(AbstractC10596d1<T> d1Var, List<T> list, int i, boolean z);

        void mo4484F5(AbstractC10596d1<T> d1Var);

        void mo4483H6(AbstractC10596d1<T> d1Var, T t, int i, int i2);

        void mo4482J6(AbstractC10596d1<T> d1Var, int i);

        void mo4481d4(AbstractC10596d1<T> d1Var, T t, int i);

        void mo4480i7(AbstractC10596d1<T> d1Var, T t, int i, int i2);

        void mo4479t6(AbstractC10596d1<T> d1Var);

        void mo4478x2(AbstractC10596d1<T> d1Var, T t, int i);
    }

    public static class C10599c<T> {
        public final List<T> f33979a;
        public final int f33980b;

        public C10599c(List<T> list, int i) {
            this.f33979a = list;
            this.f33980b = i;
        }
    }

    public AbstractC10596d1(C10930q6 q6Var, int i, int i2, boolean z, AbstractC10598b<T> bVar) {
        this.f33972a = q6Var;
        this.f33968Q = i;
        this.f33969R = i2;
        this.f33966O = !z;
        if (bVar != null) {
            m4497r(bVar);
        }
        mo1346a0();
    }

    public void m4522C(Runnable runnable) {
        if (!m4490y()) {
            runnable.run();
        }
    }

    public void m4521D(Runnable runnable) {
        if (m4523B()) {
            runnable.run();
        }
    }

    public final boolean m4524A() {
        return this.f33970S;
    }

    public final boolean m4523B() {
        int i = this.f33974c;
        return i == 1 || i == 2;
    }

    public final void m4520E(Runnable runnable) {
        if (this.f33973b.isEmpty()) {
            m4518G(false, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void m4519F(int i, boolean z, Runnable runnable) {
        int i2;
        if (!this.f33964M && (i2 = this.f33974c) != 2 && i2 != 3) {
            if (z) {
                if (this.f33966O) {
                    return;
                }
            } else if (this.f33965N) {
                return;
            }
            this.f33964M = true;
            this.f33972a.m2270r4().m14783o(mo4516J(z, this.f33973b.size(), i), new C10597a(i, z, runnable));
        }
    }

    public final void m4518G(boolean z, Runnable runnable) {
        m4519F(this.f33973b.isEmpty() ? this.f33968Q : this.f33969R, z, runnable);
    }

    public void mo4517I(Runnable runnable) {
    }

    public abstract TdApi.Function mo4516J(boolean z, int i, int i2);

    public final void m4515K(boolean z) {
        for (int size = this.f33971T.size() - 1; size >= 0; size--) {
            this.f33971T.get(size).mo4486C3(this, z);
        }
    }

    public final void m4514L() {
        for (int size = this.f33971T.size() - 1; size >= 0; size--) {
            this.f33971T.get(size).mo4479t6(this);
        }
    }

    public final void m4513M(int i, int i2) {
        T t = this.f33973b.get(i);
        for (int size = this.f33971T.size() - 1; size >= 0; size--) {
            this.f33971T.get(size).mo4480i7(this, t, i, i2);
        }
    }

    public final void m4512N(int i) {
        for (int size = this.f33971T.size() - 1; size >= 0; size--) {
            this.f33971T.get(size).mo4482J6(this, i);
        }
    }

    public final void m4511O(boolean z) {
    }

    public final void m4510P(T t, int i) {
        for (int size = this.f33971T.size() - 1; size >= 0; size--) {
            this.f33971T.get(size).mo4478x2(this, t, i);
        }
        m4495t();
    }

    public final void m4509Q(T t, int i, int i2) {
        for (int size = this.f33971T.size() - 1; size >= 0; size--) {
            this.f33971T.get(size).mo4483H6(this, t, i, i2);
        }
    }

    public final void m4508R(T t, int i) {
        m4495t();
        for (int size = this.f33971T.size() - 1; size >= 0; size--) {
            this.f33971T.get(size).mo4481d4(this, t, i);
        }
    }

    public final void m4507S(List<T> list, int i, boolean z) {
        for (int size = this.f33971T.size() - 1; size >= 0; size--) {
            this.f33971T.get(size).mo4485C6(this, list, i, z);
        }
        m4495t();
    }

    public final void m4506T(C10599c<T> cVar, boolean z) {
        if (!m4490y()) {
            this.f33964M = false;
            int i = 1;
            boolean z2 = this.f33974c != 0;
            if (cVar.f33979a.isEmpty()) {
                if (z) {
                    this.f33966O = true;
                } else {
                    this.f33965N = true;
                }
                if ((this.f33965N && this.f33966O) || this.f33973b.size() == cVar.f33980b) {
                    this.f33974c = 2;
                }
                m4511O(z);
            } else {
                if (this.f33973b.size() + cVar.f33979a.size() == this.f33967P) {
                    i = 2;
                }
                this.f33974c = i;
                int size = this.f33973b.size();
                if (size == 0 || !z) {
                    this.f33973b.addAll(cVar.f33979a);
                    m4507S(cVar.f33979a, size, z2);
                } else {
                    this.f33973b.addAll(0, cVar.f33979a);
                    m4507S(cVar.f33979a, 0, z2);
                }
            }
            int i2 = cVar.f33980b;
            if (i2 != -1) {
                m4502Z(i2);
            }
            if (!z2) {
                m4514L();
            }
        }
    }

    public abstract C10599c<T> mo1347U(TdApi.Object object, Client.AbstractC7865g gVar, int i, boolean z);

    public final void m4505W(AbstractC10598b<T> bVar) {
        this.f33971T.remove(bVar);
    }

    public final void m4504X(final Runnable runnable) {
        this.f33972a.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                AbstractC10596d1.this.m4522C(runnable);
            }
        });
    }

    public final void m4503Y(final Runnable runnable) {
        this.f33972a.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                AbstractC10596d1.this.m4521D(runnable);
            }
        });
    }

    public final boolean m4502Z(int i) {
        if (this.f33967P == i) {
            return false;
        }
        this.f33967P = i;
        if (i > this.f33973b.size() && this.f33974c == 2) {
            this.f33974c = 1;
        }
        m4512N(i);
        return m4495t();
    }

    public abstract void mo1346a0();

    @Override
    public void mo4501a3() {
        if (this.f33974c != 3) {
            mo1345b0();
            this.f33974c = 3;
        }
    }

    public abstract void mo1345b0();

    @Override
    public final Iterator<T> iterator() {
        return this.f33973b.iterator();
    }

    public final void m4497r(AbstractC10598b<T> bVar) {
        this.f33971T.add(bVar);
    }

    public final boolean m4496s(int i) {
        int i2 = this.f33967P;
        if (i2 == -1 || i == 0) {
            return false;
        }
        if (i2 + i >= 0) {
            return m4502Z(i2 + i);
        }
        boolean Z = m4502Z(this.f33973b.size());
        mo4517I(null);
        return Z;
    }

    public final boolean m4495t() {
        boolean z = true;
        boolean z2 = !this.f33973b.isEmpty() || this.f33967P > 0;
        if (this.f33970S == z2) {
            z = false;
        }
        if (z) {
            this.f33970S = z2;
            m4515K(z2);
        }
        if (this.f33973b.size() < this.f33968Q) {
            m4518G(false, null);
        }
        return z;
    }

    public final int m4494u() {
        return this.f33973b.size();
    }

    public final int m4493v() {
        int i = this.f33967P;
        if (i == -1) {
            return -1;
        }
        if (!this.f33966O || !this.f33965N) {
            return Math.max(i, this.f33973b.size());
        }
        return this.f33973b.size();
    }

    public final int m4492w(T t) {
        int i = 0;
        for (T t2 : this.f33973b) {
            if (t2.equals(t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean m4491x() {
        return m4524A();
    }

    public final boolean m4490y() {
        return this.f33974c == 3;
    }

    public final boolean m4489z() {
        return this.f33974c == 2;
    }
}
