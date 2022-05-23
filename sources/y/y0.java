package y;

import android.util.Size;
import androidx.camera.core.j0;
import androidx.camera.core.l1;
import androidx.camera.core.s;
import androidx.camera.core.x2;
import c0.h;
import c0.j;
import c0.k;
import c0.l;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import y.b2;
import y.j0;
import y.n0;

public final class y0 implements n2<j0>, e1, k {
    public final t1 f26445w;
    public static final n0.a<Integer> f26442x = n0.a.a("camerax.core.imageAnalysis.backpressureStrategy", j0.b.class);
    public static final n0.a<Integer> f26443y = n0.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final n0.a<l1> f26444z = n0.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", l1.class);
    public static final n0.a<Integer> A = n0.a.a("camerax.core.imageAnalysis.outputImageFormat", j0.e.class);
    public static final n0.a<Boolean> B = n0.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);
    public static final n0.a<Boolean> C = n0.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    public y0(t1 t1Var) {
        this.f26445w = t1Var;
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

    public Executor F(Executor executor) {
        return j.a(this, executor);
    }

    public int G(int i10) {
        return ((Integer) a(f26442x, Integer.valueOf(i10))).intValue();
    }

    public int H(int i10) {
        return ((Integer) a(f26443y, Integer.valueOf(i10))).intValue();
    }

    public l1 I() {
        return (l1) a(f26444z, null);
    }

    public Boolean J(Boolean bool) {
        return (Boolean) a(B, bool);
    }

    public int K(int i10) {
        return ((Integer) a(A, Integer.valueOf(i10))).intValue();
    }

    public Boolean L(Boolean bool) {
        return (Boolean) a(C, bool);
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
        return this.f26445w;
    }

    @Override
    public Set l(n0.a aVar) {
        return y1.d(this, aVar);
    }

    @Override
    public int m() {
        return 35;
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
