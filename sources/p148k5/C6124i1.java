package p148k5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class C6124i1 extends BroadcastReceiver {
    public Context f19419a;
    public final AbstractC6118h1 f19420b;

    public C6124i1(AbstractC6118h1 h1Var) {
        this.f19420b = h1Var;
    }

    public final void m21257a(Context context) {
        this.f19419a = context;
    }

    public final synchronized void m21256b() {
        Context context = this.f19419a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f19419a = null;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f19420b.mo21104a();
            m21256b();
        }
    }
}
