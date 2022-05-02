package p032c5;

import android.view.Surface;
import p059e4.C4138m;
import p059e4.C4139n;

public class C1617i extends C4138m {
    public final boolean f5963M;
    public final int f5964c;

    public C1617i(Throwable th, C4139n nVar, Surface surface) {
        super(th, nVar);
        this.f5964c = System.identityHashCode(surface);
        this.f5963M = surface == null || surface.isValid();
    }
}
