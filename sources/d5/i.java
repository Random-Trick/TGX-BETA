package d5;

import android.view.Surface;
import e4.m;
import e4.n;

public class i extends m {
    public final boolean M;
    public final int f6268c;

    public i(Throwable th, n nVar, Surface surface) {
        super(th, nVar);
        this.f6268c = System.identityHashCode(surface);
        this.M = surface == null || surface.isValid();
    }
}
