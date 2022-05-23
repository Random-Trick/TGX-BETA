package p6;

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
import t6.a;
import t6.y;
import u6.d;

public final class z extends d {
    public final z1 f20876g;
    public final h1 f20877h;
    public final y f20878i;
    public final s0 f20879j;
    public final k1 f20880k;
    public final y f20881l;
    public final y f20882m;
    public final u2 f20883n;
    public final Handler f20884o = new Handler(Looper.getMainLooper());

    public z(Context context, z1 z1Var, h1 h1Var, y yVar, k1 k1Var, s0 s0Var, y yVar2, y yVar3, u2 u2Var) {
        super(new a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f20876g = z1Var;
        this.f20877h = h1Var;
        this.f20878i = yVar;
        this.f20880k = k1Var;
        this.f20879j = s0Var;
        this.f20881l = yVar2;
        this.f20882m = yVar3;
        this.f20883n = u2Var;
    }

    @Override
    public final void a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f23586a.b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            final AssetPackState i10 = AssetPackState.i(bundleExtra, stringArrayList.get(0), this.f20880k, this.f20883n, b0.f20547a);
            this.f23586a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", i10);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f20879j.a(pendingIntent);
            }
            ((Executor) this.f20882m.zza()).execute(new Runnable() {
                @Override
                public final void run() {
                    z.this.i(bundleExtra, i10);
                }
            });
            ((Executor) this.f20881l.zza()).execute(new Runnable() {
                @Override
                public final void run() {
                    z.this.h(bundleExtra);
                }
            });
            return;
        }
        this.f23586a.b("Empty bundle received from broadcast.", new Object[0]);
    }

    public final void h(Bundle bundle) {
        if (this.f20876g.n(bundle)) {
            this.f20877h.a();
        }
    }

    public final void i(Bundle bundle, AssetPackState assetPackState) {
        if (this.f20876g.m(bundle)) {
            j(assetPackState);
            ((d4) this.f20878i.zza()).k();
        }
    }

    public final void j(final AssetPackState assetPackState) {
        this.f20884o.post(new Runnable() {
            @Override
            public final void run() {
                z.this.f(assetPackState);
            }
        });
    }
}
