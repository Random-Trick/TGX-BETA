package y;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import y.n0;

public final class j0 {
    public static final n0.a<Integer> f26321g = n0.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);
    public static final n0.a<Integer> f26322h = n0.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);
    public final List<q0> f26323a;
    public final n0 f26324b;
    public final int f26325c;
    public final List<h> f26326d;
    public final boolean f26327e;
    public final i2 f26328f;

    public interface b {
        void a(n2<?> n2Var, a aVar);
    }

    public j0(List<q0> list, n0 n0Var, int i10, List<h> list2, boolean z10, i2 i2Var) {
        this.f26323a = list;
        this.f26324b = n0Var;
        this.f26325c = i10;
        this.f26326d = Collections.unmodifiableList(list2);
        this.f26327e = z10;
        this.f26328f = i2Var;
    }

    public static j0 a() {
        return new a().h();
    }

    public List<h> b() {
        return this.f26326d;
    }

    public n0 c() {
        return this.f26324b;
    }

    public List<q0> d() {
        return Collections.unmodifiableList(this.f26323a);
    }

    public i2 e() {
        return this.f26328f;
    }

    public int f() {
        return this.f26325c;
    }

    public boolean g() {
        return this.f26327e;
    }

    public static final class a {
        public final Set<q0> f26329a;
        public o1 f26330b;
        public int f26331c;
        public List<h> f26332d;
        public boolean f26333e;
        public q1 f26334f;

        public a() {
            this.f26329a = new HashSet();
            this.f26330b = p1.J();
            this.f26331c = -1;
            this.f26332d = new ArrayList();
            this.f26333e = false;
            this.f26334f = q1.f();
        }

        public static a j(n2<?> n2Var) {
            b j10 = n2Var.j(null);
            if (j10 != null) {
                a aVar = new a();
                j10.a(n2Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + n2Var.q(n2Var.toString()));
        }

        public static a k(j0 j0Var) {
            return new a(j0Var);
        }

        public void a(Collection<h> collection) {
            for (h hVar : collection) {
                c(hVar);
            }
        }

        public void b(i2 i2Var) {
            this.f26334f.e(i2Var);
        }

        public void c(h hVar) {
            if (!this.f26332d.contains(hVar)) {
                this.f26332d.add(hVar);
            }
        }

        public <T> void d(n0.a<T> aVar, T t10) {
            this.f26330b.n(aVar, t10);
        }

        public void e(n0 n0Var) {
            for (n0.a<?> aVar : n0Var.b()) {
                Object a10 = this.f26330b.a(aVar, null);
                Object c10 = n0Var.c(aVar);
                if (a10 instanceof n1) {
                    ((n1) a10).a(((n1) c10).c());
                } else {
                    if (c10 instanceof n1) {
                        c10 = ((n1) c10).clone();
                    }
                    this.f26330b.y(aVar, n0Var.d(aVar), c10);
                }
            }
        }

        public void f(q0 q0Var) {
            this.f26329a.add(q0Var);
        }

        public void g(String str, Object obj) {
            this.f26334f.h(str, obj);
        }

        public j0 h() {
            return new j0(new ArrayList(this.f26329a), t1.H(this.f26330b), this.f26331c, this.f26332d, this.f26333e, i2.b(this.f26334f));
        }

        public void i() {
            this.f26329a.clear();
        }

        public Set<q0> l() {
            return this.f26329a;
        }

        public int m() {
            return this.f26331c;
        }

        public void n(n0 n0Var) {
            this.f26330b = p1.K(n0Var);
        }

        public void o(int i10) {
            this.f26331c = i10;
        }

        public void p(boolean z10) {
            this.f26333e = z10;
        }

        public a(j0 j0Var) {
            HashSet hashSet = new HashSet();
            this.f26329a = hashSet;
            this.f26330b = p1.J();
            this.f26331c = -1;
            this.f26332d = new ArrayList();
            this.f26333e = false;
            this.f26334f = q1.f();
            hashSet.addAll(j0Var.f26323a);
            this.f26330b = p1.K(j0Var.f26324b);
            this.f26331c = j0Var.f26325c;
            this.f26332d.addAll(j0Var.b());
            this.f26333e = j0Var.g();
            this.f26334f = q1.g(j0Var.e());
        }
    }
}
