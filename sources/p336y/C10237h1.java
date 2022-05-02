package p336y;

import android.util.Size;
import android.view.Surface;
import p015b0.C1111f;
import p022b7.AbstractFutureC1291a;

public final class C10237h1 extends AbstractC10287q0 {
    public final Surface f33016m;

    public C10237h1(Surface surface, Size size, int i) {
        super(size, i);
        this.f33016m = surface;
    }

    @Override
    public AbstractFutureC1291a<Surface> mo5540n() {
        return C1111f.m38351h(this.f33016m);
    }

    public C10237h1(Surface surface) {
        this.f33016m = surface;
    }
}
