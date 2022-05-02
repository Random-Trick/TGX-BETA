package p189n6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import p262s6.C8646a;
import p273t6.AbstractC8999d;

public final class C7259g extends AbstractC8999d {
    public C7259g(Context context) {
        super(new C8646a("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override
    public final void mo10755a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f28898a.m11817a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f28898a.m11817a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f28898a.m11817a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState f = InstallState.m30295f(intent, this.f28898a);
        this.f28898a.m11817a("ListenerRegistryBroadcastReceiver.onReceive: %s", f);
        m10750f(f);
    }
}
