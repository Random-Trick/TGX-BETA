package s;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.s;
import androidx.camera.core.t1;
import androidx.camera.core.x2;
import b0.c;
import b0.f;
import c0.h;
import c0.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import t.z;
import y.b1;
import y.b2;
import y.h1;
import y.j0;
import y.m2;
import y.n0;
import y.n2;
import y.p1;
import y.q0;
import y.y1;

public class c2 {
    public q0 f21969a;
    public final b2 f21970b;

    public class a implements c<Void> {
        public final Surface f21971a;
        public final SurfaceTexture f21972b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f21971a = surface;
            this.f21972b = surfaceTexture;
        }

        @Override
        public void b(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        public void a(Void r12) {
            this.f21971a.release();
            this.f21972b.release();
        }
    }

    public static class b implements n2<x2> {
        public final n0 f21974w;

        public b() {
            p1 J = p1.J();
            J.n(n2.f26375s, new c1());
            this.f21974w = J;
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
        public j0.b j(j0.b bVar) {
            return m2.b(this, bVar);
        }

        @Override
        public n0 k() {
            return this.f21974w;
        }

        @Override
        public Set l(n0.a aVar) {
            return y1.d(this, aVar);
        }

        @Override
        public int m() {
            return b1.a(this);
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
        public int v(int i10) {
            return m2.f(this, i10);
        }

        @Override
        public Object x(n0.a aVar, n0.c cVar) {
            return y1.h(this, aVar, cVar);
        }
    }

    public c2(z zVar) {
        b bVar = new b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size c10 = c(zVar);
        t1.a("MeteringRepeating", "MerteringSession SurfaceTexture size: " + c10);
        surfaceTexture.setDefaultBufferSize(c10.getWidth(), c10.getHeight());
        Surface surface = new Surface(surfaceTexture);
        b2.b o10 = b2.b.o(bVar);
        o10.r(1);
        h1 h1Var = new h1(surface);
        this.f21969a = h1Var;
        f.b(h1Var.i(), new a(surface, surfaceTexture), a0.a.a());
        o10.k(this.f21969a);
        this.f21970b = o10.m();
    }

    public static int f(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    public void b() {
        t1.a("MeteringRepeating", "MeteringRepeating clear!");
        q0 q0Var = this.f21969a;
        if (q0Var != null) {
            q0Var.c();
        }
        this.f21969a = null;
    }

    public final Size c(z zVar) {
        Size[] sizeArr;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) zVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            t1.c("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        if (Build.VERSION.SDK_INT < 23) {
            sizeArr = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            sizeArr = streamConfigurationMap.getOutputSizes(34);
        }
        if (sizeArr != null) {
            return (Size) Collections.min(Arrays.asList(sizeArr), b2.f21963a);
        }
        t1.c("MeteringRepeating", "Can not get output size list.");
        return new Size(0, 0);
    }

    public String d() {
        return "MeteringRepeating";
    }

    public b2 e() {
        return this.f21970b;
    }
}
