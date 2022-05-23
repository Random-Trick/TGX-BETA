package y;

import androidx.camera.core.e0;
import androidx.camera.core.s;
import androidx.camera.core.x2;
import c0.i;
import c0.m;
import y.b2;
import y.j0;
import y.n0;

public interface n2<T extends x2> extends i<T>, m, c1 {
    public static final n0.a<b2> f26373q = n0.a.a("camerax.core.useCase.defaultSessionConfig", b2.class);
    public static final n0.a<j0> f26374r = n0.a.a("camerax.core.useCase.defaultCaptureConfig", j0.class);
    public static final n0.a<b2.d> f26375s = n0.a.a("camerax.core.useCase.sessionConfigUnpacker", b2.d.class);
    public static final n0.a<j0.b> f26376t = n0.a.a("camerax.core.useCase.captureConfigUnpacker", j0.b.class);
    public static final n0.a<Integer> f26377u = n0.a.a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);
    public static final n0.a<s> f26378v = n0.a.a("camerax.core.useCase.cameraSelector", s.class);

    public interface a<T extends x2, C extends n2<T>, B> extends e0<T> {
        C b();
    }

    b2.d A(b2.d dVar);

    j0 B(j0 j0Var);

    s C(s sVar);

    j0.b j(j0.b bVar);

    b2 t(b2 b2Var);

    int v(int i10);
}
