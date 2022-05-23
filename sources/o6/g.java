package o6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import t6.a;
import u6.d;

public final class g extends d {
    public g(Context context) {
        super(new a("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override
    public final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f23586a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f23586a.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f23586a.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState f10 = InstallState.f(intent, this.f23586a);
        this.f23586a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", f10);
        f(f10);
    }
}
