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
    public final C7789z1 f24921g;
    public final C7699h1 f24922h;
    public final AbstractC8689y f24923i;
    public final C7753s0 f24924j;
    public final C7714k1 f24925k;
    public final AbstractC8689y f24926l;
    public final AbstractC8689y f24927m;
    public final C7765u2 f24928n;
    public final Handler f24929o = new Handler(Looper.getMainLooper());

    public C7787z(Context context, C7789z1 z1Var, C7699h1 h1Var, AbstractC8689y yVar, C7714k1 k1Var, C7753s0 s0Var, AbstractC8689y yVar2, AbstractC8689y yVar3, C7765u2 u2Var) {
        super(new C8646a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f24921g = z1Var;
        this.f24922h = h1Var;
        this.f24923i = yVar;
        this.f24925k = k1Var;
        this.f24924j = s0Var;
        this.f24926l = yVar2;
        this.f24927m = yVar3;
        this.f24928n = u2Var;
    }

    @Override
    public final void mo10756a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f28895a.m11817b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            final AssetPackState i = AssetPackState.m30295i(bundleExtra, stringArrayList.get(0), this.f24925k, this.f24928n, C7664b0.f24570a);
            this.f28895a.m11818a("ListenerRegistryBroadcastReceiver.onReceive: %s", i);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f24924j.m15144a(pendingIntent);
            }
            ((Executor) this.f24927m.zza()).execute(new Runnable() {
                @Override
                public final void run() {
                    C7787z.this.m15103i(bundleExtra, i);
                }
            });
            ((Executor) this.f24926l.zza()).execute(new Runnable() {
                @Override
                public final void run() {
                    C7787z.this.m15104h(bundleExtra);
                }
            });
            return;
        }
        this.f28895a.m11817b("Empty bundle received from broadcast.", new Object[0]);
    }

    public final void m15104h(Bundle bundle) {
        if (this.f24921g.m15087n(bundle)) {
            this.f24922h.m15210a();
        }
    }

    public final void m15103i(Bundle bundle, AssetPackState assetPackState) {
        if (this.f24921g.m15088m(bundle)) {
            m15102j(assetPackState);
            ((AbstractC7680d4) this.f24923i.zza()).mo15131k();
        }
    }

    public final void m15102j(final AssetPackState assetPackState) {
        this.f24929o.post(new Runnable() {
            @Override
            public final void run() {
                C7787z.this.m10751f(assetPackState);
            }
        });
    }
}
