package y;

import android.util.Size;
import android.view.Surface;
import b0.f;
import c7.a;

public final class h1 extends q0 {
    public final Surface f26313m;

    public h1(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f26313m = surface;
    }

    @Override
    public a<Surface> n() {
        return f.h(this.f26313m);
    }

    public h1(Surface surface) {
        this.f26313m = surface;
    }
}
