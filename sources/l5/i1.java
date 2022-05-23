package l5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class i1 extends BroadcastReceiver {
    public Context f16115a;
    public final h1 f16116b;

    public i1(h1 h1Var) {
        this.f16116b = h1Var;
    }

    public final void a(Context context) {
        this.f16115a = context;
    }

    public final synchronized void b() {
        Context context = this.f16115a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f16115a = null;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f16116b.a();
            b();
        }
    }
}
