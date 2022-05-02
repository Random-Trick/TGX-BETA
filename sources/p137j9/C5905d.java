package p137j9;

import android.view.Surface;
import p064e9.C4166a;
import qa.C8298k;

public class C5905d extends AbstractC5902b {
    public Surface f18807g;
    public boolean f18808h;

    public C5905d(C4166a aVar, Surface surface, boolean z) {
        super(aVar, aVar.m28629a(surface));
        C8298k.m12934e(aVar, "eglCore");
        C8298k.m12934e(surface, "surface");
        this.f18807g = surface;
        this.f18808h = z;
    }

    @Override
    public void mo21863d() {
        super.mo21863d();
        if (this.f18808h) {
            Surface surface = this.f18807g;
            if (surface != null) {
                surface.release();
            }
            this.f18807g = null;
        }
    }
}
