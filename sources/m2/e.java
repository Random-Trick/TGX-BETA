package m2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import f2.j;

public class e extends d<k2.b> {
    public static final String f16470j = j.f("NetworkStateTracker");
    public final ConnectivityManager f16471g = (ConnectivityManager) this.f16464b.getSystemService("connectivity");
    public b f16472h;
    public a f16473i;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                j.c().a(e.f16470j, "Network broadcast received", new Throwable[0]);
                e eVar = e.this;
                eVar.d(eVar.g());
            }
        }
    }

    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            j.c().a(e.f16470j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override
        public void onLost(Network network) {
            j.c().a(e.f16470j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, r2.a aVar) {
        super(context, aVar);
        if (j()) {
            this.f16472h = new b();
        } else {
            this.f16473i = new a();
        }
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override
    public void e() {
        if (j()) {
            try {
                j.c().a(f16470j, "Registering network callback", new Throwable[0]);
                this.f16471g.registerDefaultNetworkCallback(this.f16472h);
            } catch (IllegalArgumentException | SecurityException e10) {
                j.c().b(f16470j, "Received exception while registering network callback", e10);
            }
        } else {
            j.c().a(f16470j, "Registering broadcast receiver", new Throwable[0]);
            this.f16464b.registerReceiver(this.f16473i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @Override
    public void f() {
        if (j()) {
            try {
                j.c().a(f16470j, "Unregistering network callback", new Throwable[0]);
                this.f16471g.unregisterNetworkCallback(this.f16472h);
            } catch (IllegalArgumentException | SecurityException e10) {
                j.c().b(f16470j, "Received exception while unregistering network callback", e10);
            }
        } else {
            j.c().a(f16470j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f16464b.unregisterReceiver(this.f16473i);
        }
    }

    public k2.b g() {
        NetworkInfo activeNetworkInfo = this.f16471g.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i10 = i();
        boolean a10 = x0.a.a(this.f16471g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z10 = false;
        }
        return new k2.b(z11, i10, a10, z10);
    }

    public k2.b b() {
        return g();
    }

    public boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f16471g.getNetworkCapabilities(this.f16471g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e10) {
            j.c().b(f16470j, "Unable to validate active network", e10);
            return false;
        }
    }
}
