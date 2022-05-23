package y;

import android.util.Size;
import androidx.camera.core.d1;
import androidx.camera.core.l1;
import androidx.camera.core.s;
import androidx.camera.core.x2;
import c0.g;
import c0.h;
import c0.l;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import y.b2;
import y.j0;
import y.n0;

public final class z0 implements n2<d1>, e1, g {
    public static final n0.a<Integer> F;
    public static final n0.a<Integer> G;
    public static final n0.a<Integer> f26446x;
    public static final n0.a<Integer> f26447y;
    public final t1 f26449w;
    public static final n0.a<i0> f26448z = n0.a.a("camerax.core.imageCapture.captureBundle", i0.class);
    public static final n0.a<k0> A = n0.a.a("camerax.core.imageCapture.captureProcessor", k0.class);
    public static final n0.a<Integer> B = n0.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
    public static final n0.a<Integer> C = n0.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
    public static final n0.a<l1> D = n0.a.a("camerax.core.imageCapture.imageReaderProxyProvider", l1.class);
    public static final n0.a<Boolean> E = n0.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);

    static {
        Class cls = Integer.TYPE;
        f26446x = n0.a.a("camerax.core.imageCapture.captureMode", cls);
        f26447y = n0.a.a("camerax.core.imageCapture.flashMode", cls);
        F = n0.a.a("camerax.core.imageCapture.flashType", cls);
        G = n0.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public z0(t1 t1Var) {
        this.f26449w = t1Var;
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

    public i0 F(i0 i0Var) {
        return (i0) a(f26448z, i0Var);
    }

    public int G() {
        return ((Integer) c(f26446x)).intValue();
    }

    public k0 H(k0 k0Var) {
        return (k0) a(A, k0Var);
    }

    public int I(int i10) {
        return ((Integer) a(f26447y, Integer.valueOf(i10))).intValue();
    }

    public int J(int i10) {
        return ((Integer) a(F, Integer.valueOf(i10))).intValue();
    }

    public l1 K() {
        return (l1) a(D, null);
    }

    public Executor L(Executor executor) {
        return (Executor) a(g.f4207a, executor);
    }

    public int M() {
        return ((Integer) c(G)).intValue();
    }

    public int N(int i10) {
        return ((Integer) a(C, Integer.valueOf(i10))).intValue();
    }

    public boolean O() {
        return e(f26446x);
    }

    public boolean P() {
        return ((Boolean) a(E, Boolean.FALSE)).booleanValue();
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
        return this.f26449w;
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
