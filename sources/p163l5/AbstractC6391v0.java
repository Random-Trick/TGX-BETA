package p163l5;

import android.app.PendingIntent;
import android.os.Bundle;
import p118i5.C5217a;

public abstract class AbstractC6391v0 extends AbstractC6332c1<Boolean> {
    public final int f20039d;
    public final Bundle f20040e;
    public final AbstractC6325c f20041f;

    public AbstractC6391v0(AbstractC6325c cVar, int i, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f20041f = cVar;
        this.f20039d = i;
        this.f20040e = bundle;
    }

    @Override
    public final void mo20482a() {
    }

    @Override
    public final void mo20481b(Boolean bool) {
        C5217a aVar;
        PendingIntent pendingIntent = null;
        if (this.f20039d != 0) {
            this.f20041f.m20634k0(1, null);
            Bundle bundle = this.f20040e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            aVar = new C5217a(this.f20039d, pendingIntent);
        } else if (!mo20480f()) {
            this.f20041f.m20634k0(1, null);
            aVar = new C5217a(8, null);
        } else {
            return;
        }
        mo20479g(aVar);
    }

    public abstract boolean mo20480f();

    public abstract void mo20479g(C5217a aVar);
}
