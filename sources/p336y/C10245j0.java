package p336y;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p336y.AbstractC10268n0;

public final class C10245j0 {
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33027g = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.captureConfig.rotation", Integer.TYPE);
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33028h = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.captureConfig.jpegQuality", Integer.class);
    public final List<AbstractC10287q0> f33029a;
    public final AbstractC10268n0 f33030b;
    public final int f33031c;
    public final List<AbstractC10234h> f33032d;
    public final boolean f33033e;
    public final C10242i2 f33034f;

    public interface AbstractC10247b {
        void mo5633a(AbstractC10273n2<?> n2Var, C10246a aVar);
    }

    public C10245j0(List<AbstractC10287q0> list, AbstractC10268n0 n0Var, int i, List<AbstractC10234h> list2, boolean z, C10242i2 i2Var) {
        this.f33029a = list;
        this.f33030b = n0Var;
        this.f33031c = i;
        this.f33032d = Collections.unmodifiableList(list2);
        this.f33033e = z;
        this.f33034f = i2Var;
    }

    public static C10245j0 m5656a() {
        return new C10246a().m5642h();
    }

    public List<AbstractC10234h> m5655b() {
        return this.f33032d;
    }

    public AbstractC10268n0 m5654c() {
        return this.f33030b;
    }

    public List<AbstractC10287q0> m5653d() {
        return Collections.unmodifiableList(this.f33029a);
    }

    public C10242i2 m5652e() {
        return this.f33034f;
    }

    public int m5651f() {
        return this.f33031c;
    }

    public boolean m5650g() {
        return this.f33033e;
    }

    public static final class C10246a {
        public final Set<AbstractC10287q0> f33035a;
        public AbstractC10277o1 f33036b;
        public int f33037c;
        public List<AbstractC10234h> f33038d;
        public boolean f33039e;
        public C10290q1 f33040f;

        public C10246a() {
            this.f33035a = new HashSet();
            this.f33036b = C10284p1.m5569J();
            this.f33037c = -1;
            this.f33038d = new ArrayList();
            this.f33039e = false;
            this.f33040f = C10290q1.m5536f();
        }

        public static C10246a m5640j(AbstractC10273n2<?> n2Var) {
            AbstractC10247b j = n2Var.mo5437j(null);
            if (j != null) {
                C10246a aVar = new C10246a();
                j.mo5633a(n2Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + n2Var.mo5432q(n2Var.toString()));
        }

        public static C10246a m5639k(C10245j0 j0Var) {
            return new C10246a(j0Var);
        }

        public void m5649a(Collection<AbstractC10234h> collection) {
            for (AbstractC10234h hVar : collection) {
                m5647c(hVar);
            }
        }

        public void m5648b(C10242i2 i2Var) {
            this.f33040f.m5537e(i2Var);
        }

        public void m5647c(AbstractC10234h hVar) {
            if (!this.f33038d.contains(hVar)) {
                this.f33038d.add(hVar);
            }
        }

        public <T> void m5646d(AbstractC10268n0.AbstractC10269a<T> aVar, T t) {
            this.f33036b.mo5566n(aVar, t);
        }

        public void m5645e(AbstractC10268n0 n0Var) {
            for (AbstractC10268n0.AbstractC10269a<?> aVar : n0Var.mo5425b()) {
                Object a = this.f33036b.mo5426a(aVar, null);
                Object c = n0Var.mo5424c(aVar);
                if (a instanceof AbstractC10272n1) {
                    ((AbstractC10272n1) a).m5576a(((AbstractC10272n1) c).m5574c());
                } else {
                    if (c instanceof AbstractC10272n1) {
                        c = ((AbstractC10272n1) c).clone();
                    }
                    this.f33036b.mo5565y(aVar, n0Var.mo5423d(aVar), c);
                }
            }
        }

        public void m5644f(AbstractC10287q0 q0Var) {
            this.f33035a.add(q0Var);
        }

        public void m5643g(String str, Object obj) {
            this.f33040f.m5534h(str, obj);
        }

        public C10245j0 m5642h() {
            return new C10245j0(new ArrayList(this.f33035a), C10300t1.m5524H(this.f33036b), this.f33037c, this.f33038d, this.f33039e, C10242i2.m5660b(this.f33040f));
        }

        public void m5641i() {
            this.f33035a.clear();
        }

        public Set<AbstractC10287q0> m5638l() {
            return this.f33035a;
        }

        public int m5637m() {
            return this.f33037c;
        }

        public void m5636n(AbstractC10268n0 n0Var) {
            this.f33036b = C10284p1.m5568K(n0Var);
        }

        public void m5635o(int i) {
            this.f33037c = i;
        }

        public void m5634p(boolean z) {
            this.f33039e = z;
        }

        public C10246a(C10245j0 j0Var) {
            HashSet hashSet = new HashSet();
            this.f33035a = hashSet;
            this.f33036b = C10284p1.m5569J();
            this.f33037c = -1;
            this.f33038d = new ArrayList();
            this.f33039e = false;
            this.f33040f = C10290q1.m5536f();
            hashSet.addAll(j0Var.f33029a);
            this.f33036b = C10284p1.m5568K(j0Var.f33030b);
            this.f33037c = j0Var.f33031c;
            this.f33038d.addAll(j0Var.m5655b());
            this.f33039e = j0Var.m5650g();
            this.f33040f = C10290q1.m5535g(j0Var.m5652e());
        }
    }
}
