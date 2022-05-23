package x;

import androidx.camera.core.e0;
import java.util.Set;
import x.j;
import y.n0;
import y.o1;
import y.p1;
import y.t1;
import y.y1;
import y.z1;

public class j implements z1 {
    public final n0 f25928w;

    public static final class a implements e0<j> {
        public final p1 f25929a = p1.J();

        public static a e(final n0 n0Var) {
            final a aVar = new a();
            n0Var.g("camera2.captureRequest.option.", new n0.b() {
                @Override
                public final boolean a(n0.a aVar2) {
                    boolean f10;
                    f10 = j.a.f(j.a.this, n0Var, aVar2);
                    return f10;
                }
            });
            return aVar;
        }

        public static boolean f(a aVar, n0 n0Var, n0.a aVar2) {
            aVar.a().y(aVar2, n0Var.d(aVar2), n0Var.c(aVar2));
            return true;
        }

        @Override
        public o1 a() {
            return this.f25929a;
        }

        public j d() {
            return new j(t1.H(this.f25929a));
        }
    }

    public j(n0 n0Var) {
        this.f25928w = n0Var;
    }

    @Override
    public Object a(n0.a aVar, Object obj) {
        return y1.g(this, aVar, obj);
    }

    @Override
    public Set b() {
        return y1.e(this);
    }

    @Override
    public Object c(n0.a aVar) {
        return y1.f(this, aVar);
    }

    @Override
    public n0.c d(n0.a aVar) {
        return y1.c(this, aVar);
    }

    @Override
    public boolean e(n0.a aVar) {
        return y1.a(this, aVar);
    }

    @Override
    public void g(String str, n0.b bVar) {
        y1.b(this, str, bVar);
    }

    @Override
    public n0 k() {
        return this.f25928w;
    }

    @Override
    public Set l(n0.a aVar) {
        return y1.d(this, aVar);
    }

    @Override
    public Object x(n0.a aVar, n0.c cVar) {
        return y1.h(this, aVar, cVar);
    }
}
