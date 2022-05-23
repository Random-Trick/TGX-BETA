package y;

import android.util.Size;
import androidx.camera.core.b2;
import androidx.camera.core.s;
import androidx.camera.core.x2;
import c0.h;
import c0.k;
import c0.l;
import java.util.List;
import java.util.Set;
import y.b2;
import y.j0;
import y.n0;

public final class v1 implements n2<b2>, e1, k {
    public static final n0.a<a1> f26432x = n0.a.a("camerax.core.preview.imageInfoProcessor", a1.class);
    public static final n0.a<k0> f26433y = n0.a.a("camerax.core.preview.captureProcessor", k0.class);
    public final t1 f26434w;

    public v1(t1 t1Var) {
        this.f26434w = t1Var;
    }

    @Override
    public b2.d A(b2.d dVar) {
        return m2.e(this, dVar);
    }

    @Override
    public j0 B(j0 j0Var) {
        return m2.c(this, j0Var);
    }

    @Override
    public s C(s sVar) {
        return m2.a(this, sVar);
    }

    @Override
    public x2.b D(x2.b bVar) {
        return l.a(this, bVar);
    }

    @Override
    public int E(int i10) {
        return d1.f(this, i10);
    }

    public k0 F(k0 k0Var) {
        return (k0) a(f26433y, k0Var);
    }

    public a1 G(a1 a1Var) {
        return (a1) a(f26432x, a1Var);
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
    public Size f(Size size) {
        return d1.b(this, size);
    }

    @Override
    public void g(String str, n0.b bVar) {
        y1.b(this, str, bVar);
    }

    @Override
    public List i(List list) {
        return d1.c(this, list);
    }

    @Override
    public j0.b j(j0.b bVar) {
        return m2.b(this, bVar);
    }

    @Override
    public n0 k() {
        return this.f26434w;
    }

    @Override
    public Set l(n0.a aVar) {
        return y1.d(this, aVar);
    }

    @Override
    public int m() {
        return ((Integer) c(c1.f26276j)).intValue();
    }

    @Override
    public Size o(Size size) {
        return d1.a(this, size);
    }

    @Override
    public Size p(Size size) {
        return d1.e(this, size);
    }

    @Override
    public String q(String str) {
        return h.a(this, str);
    }

    @Override
    public b2 t(b2 b2Var) {
        return m2.d(this, b2Var);
    }

    @Override
    public boolean u() {
        return d1.g(this);
    }

    @Override
    public int v(int i10) {
        return m2.f(this, i10);
    }

    @Override
    public int w() {
        return d1.d(this);
    }

    @Override
    public Object x(n0.a aVar, n0.c cVar) {
        return y1.h(this, aVar, cVar);
    }
}
