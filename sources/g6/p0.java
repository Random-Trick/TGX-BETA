package g6;

import com.google.android.gms.common.api.Status;
import k5.b;
import k5.i;
import l5.d;
import n6.m;

public final class p0 implements d<i> {
    public final m<h> f12140a;

    public p0(m<h> mVar) {
        this.f12140a = mVar;
    }

    @Override
    public final void a(i iVar) {
        i iVar2 = iVar;
        Status a10 = iVar2.a();
        if (a10.f()) {
            this.f12140a.c(new h(iVar2));
        } else if (a10.e()) {
            this.f12140a.b(new i(a10));
        } else {
            this.f12140a.b(new b(a10));
        }
    }
}
