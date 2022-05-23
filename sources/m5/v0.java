package m5;

import android.app.PendingIntent;
import android.os.Bundle;
import j5.a;

public abstract class v0 extends c1<Boolean> {
    public final int f17274d;
    public final Bundle f17275e;
    public final c f17276f;

    public v0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f17276f = cVar;
        this.f17274d = i10;
        this.f17275e = bundle;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b(Boolean bool) {
        a aVar;
        PendingIntent pendingIntent = null;
        if (this.f17274d != 0) {
            this.f17276f.k0(1, null);
            Bundle bundle = this.f17275e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            aVar = new a(this.f17274d, pendingIntent);
        } else if (!f()) {
            this.f17276f.k0(1, null);
            aVar = new a(8, null);
        } else {
            return;
        }
        g(aVar);
    }

    public abstract boolean f();

    public abstract void g(a aVar);
}
