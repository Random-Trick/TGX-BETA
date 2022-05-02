package p202o6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p262s6.AbstractC8689y;
import p262s6.C8646a;
import p273t6.AbstractC8999d;

public final class C7787z extends AbstractC8999d {
    public final C7789z1 f24924g;
    public final C7699h1 f24925h;
    public final AbstractC8689y f24926i;
    public final C7753s0 f24927j;
    public final C7714k1 f24928k;
    public final AbstractC8689y f24929l;
    public final AbstractC8689y f24930m;
    public final C7765u2 f24931n;
    public final Handler f24932o = new Handler(Looper.getMainLooper());

    public C7787z(Context context, C7789z1 z1Var, C7699h1 h1Var, AbstractC8689y yVar, C7714k1 k1Var, C7753s0 s0Var, AbstractC8689y yVar2, AbstractC8689y yVar3, C7765u2 u2Var) {
        super(new C8646a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f24924g = z1Var;
        this.f24925h = h1Var;
        this.f24926i = yVar;
        this.f24928k = k1Var;
        this.f24927j = s0Var;
        this.f24929l = yVar2;
        this.f24930m = yVar3;
        this.f24931n = u2Var;
    }

    @Override
    public final void mo10755a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f28898a.m11816b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            final AssetPackState i = AssetPackState.m30297i(bundleExtra, stringArrayList.get(0), this.f24928k, this.f24931n, C7664b0.f24573a);
            this.f28898a.m11817a("ListenerRegistryBroadcastReceiver.onReceive: %s", i);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f24927j.m15144a(pendingIntent);
            }
            ((Executor) this.f24930m.zza()).execute(new Runnable() {
                @Override
                public final void run() {
                    C7787z.this.m15103i(bundleExtra, i);
                }
            });
            ((Executor) this.f24929l.zza()).execute(new Runnable() {
                @Override
                public final void run() {
                    C7787z.this.m15104h(bundleExtra);
                }
            });
            return;
        }
        this.f28898a.m11816b("Empty bundle received from broadcast.", new Object[0]);
    }

    public final void m15104h(Bundle bundle) {
        if (this.f24924g.m15087n(bundle)) {
            this.f24925h.m15210a();
        }
    }

    public final void m15103i(Bundle bundle, AssetPackState assetPackState) {
        if (this.f24924g.m15088m(bundle)) {
            m15102j(assetPackState);
            ((AbstractC7680d4) this.f24926i.zza()).mo15131k();
        }
    }

    public final void m15102j(final AssetPackState assetPackState) {
        this.f24932o.post(new Runnable() {
            @Override
            public final void run() {
                C7787z.this.m10750f(assetPackState);
            }
        });
    }
}
