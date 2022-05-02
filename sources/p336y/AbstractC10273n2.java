package p336y;

import androidx.camera.core.AbstractC0560f0;
import androidx.camera.core.AbstractC0688y2;
import androidx.camera.core.C0653t;
import p027c0.AbstractC1424i;
import p027c0.AbstractC1428m;
import p336y.AbstractC10268n0;
import p336y.C10200b2;
import p336y.C10245j0;

public interface AbstractC10273n2<T extends AbstractC0688y2> extends AbstractC1424i<T>, AbstractC1428m, AbstractC10210c1 {
    public static final AbstractC10268n0.AbstractC10269a<C10200b2> f33094q = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.useCase.defaultSessionConfig", C10200b2.class);
    public static final AbstractC10268n0.AbstractC10269a<C10245j0> f33095r = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.useCase.defaultCaptureConfig", C10245j0.class);
    public static final AbstractC10268n0.AbstractC10269a<C10200b2.AbstractC10204d> f33096s = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.useCase.sessionConfigUnpacker", C10200b2.AbstractC10204d.class);
    public static final AbstractC10268n0.AbstractC10269a<C10245j0.AbstractC10247b> f33097t = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.useCase.captureConfigUnpacker", C10245j0.AbstractC10247b.class);
    public static final AbstractC10268n0.AbstractC10269a<Integer> f33098u = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);
    public static final AbstractC10268n0.AbstractC10269a<C0653t> f33099v = AbstractC10268n0.AbstractC10269a.m5582a("camerax.core.useCase.cameraSelector", C0653t.class);

    public interface AbstractC10274a<T extends AbstractC0688y2, C extends AbstractC10273n2<T>, B> extends AbstractC0560f0<T> {
        C mo5573b();
    }

    C10200b2.AbstractC10204d mo5456A(C10200b2.AbstractC10204d dVar);

    C10245j0 mo5455B(C10245j0 j0Var);

    C0653t mo5454C(C0653t tVar);

    C10245j0.AbstractC10247b mo5437j(C10245j0.AbstractC10247b bVar);

    C10200b2 mo5431t(C10200b2 b2Var);

    int mo5429v(int i);
}
