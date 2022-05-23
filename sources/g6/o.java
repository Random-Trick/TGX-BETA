package g6;

import a6.b;
import a6.f;
import com.google.android.gms.common.api.Status;
import n6.m;

public final class o extends f {
    public final m f12137a;

    public o(b bVar, m mVar) {
        this.f12137a = mVar;
    }

    @Override
    public final void R0(b bVar) {
        Status a10 = bVar.a();
        if (a10 == null) {
            this.f12137a.d(new k5.b(new Status(8, "Got null status from location service")));
        } else if (a10.c() == 0) {
            this.f12137a.c(Boolean.TRUE);
        } else {
            this.f12137a.d(m5.b.a(a10));
        }
    }

    @Override
    public final void h() {
    }
}
