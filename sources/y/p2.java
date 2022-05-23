package y;

import android.util.Size;
import androidx.camera.core.h3;
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

public final class p2 implements n2<h3>, e1, k {
    public static final n0.a<Integer> A;
    public static final n0.a<Integer> B;
    public static final n0.a<Integer> C;
    public static final n0.a<Integer> D;
    public static final n0.a<Integer> f26390x;
    public static final n0.a<Integer> f26391y;
    public static final n0.a<Integer> f26392z;
    public final t1 f26393w;

    static {
        Class cls = Integer.TYPE;
        f26390x = n0.a.a("camerax.core.videoCapture.recordingFrameRate", cls);
        f26391y = n0.a.a("camerax.core.videoCapture.bitRate", cls);
        f26392z = n0.a.a("camerax.core.videoCapture.intraFrameInterval", cls);
        A = n0.a.a("camerax.core.videoCapture.audioBitRate", cls);
        B = n0.a.a("camerax.core.videoCapture.audioSampleRate", cls);
        C = n0.a.a("camerax.core.videoCapture.audioChannelCount", cls);
        D = n0.a.a("camerax.core.videoCapture.audioMinBufferSize", cls);
    }

    public p2(t1 t1Var) {
        this.f26393w = t1Var;
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

    public int F() {
        return ((Integer) c(A)).intValue();
    }

    public int G() {
        return ((Integer) c(C)).intValue();
    }

    public int H() {
        return ((Integer) c(D)).intValue();
    }

    public int I() {
        return ((Integer) c(B)).intValue();
    }

    public int J() {
        return ((Integer) c(f26391y)).intValue();
    }

    public int K() {
        return ((Integer) c(f26392z)).intValue();
    }

    public int L() {
        return ((Integer) c(f26390x)).intValue();
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
        return this.f26393w;
    }

    @Override
    public Set l(n0.a aVar) {
        return y1.d(this, aVar);
    }

    @Override
    public int m() {
        return 34;
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
