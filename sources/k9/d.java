package k9;

import android.view.Surface;
import f9.a;
import ra.k;

public class d extends b {
    public Surface f15743g;
    public boolean f15744h;

    public d(a aVar, Surface surface, boolean z10) {
        super(aVar, aVar.a(surface));
        k.e(aVar, "eglCore");
        k.e(surface, "surface");
        this.f15743g = surface;
        this.f15744h = z10;
    }

    @Override
    public void d() {
        super.d();
        if (this.f15744h) {
            Surface surface = this.f15743g;
            if (surface != null) {
                surface.release();
            }
            this.f15743g = null;
        }
    }
}
