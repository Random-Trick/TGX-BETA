package p173m2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import p071f2.AbstractC4234j;
import p145k2.C6042b;
import p243r2.AbstractC8354a;
import p322x0.C10063a;

public class C6548e extends AbstractC6546d<C6042b> {
    public static final String f20385j = AbstractC4234j.m28362f("NetworkStateTracker");
    public final ConnectivityManager f20386g = (ConnectivityManager) this.f20379b.getSystemService("connectivity");
    public C6550b f20387h;
    public C6549a f20388i;

    public class C6549a extends BroadcastReceiver {
        public C6549a() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                AbstractC4234j.m28364c().mo28361a(C6548e.f20385j, "Network broadcast received", new Throwable[0]);
                C6548e eVar = C6548e.this;
                eVar.m20134d(eVar.m20131g());
            }
        }
    }

    public class C6550b extends ConnectivityManager.NetworkCallback {
        public C6550b() {
        }

        @Override
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC4234j.m28364c().mo28361a(C6548e.f20385j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            C6548e eVar = C6548e.this;
            eVar.m20134d(eVar.m20131g());
        }

        @Override
        public void onLost(Network network) {
            AbstractC4234j.m28364c().mo28361a(C6548e.f20385j, "Network connection lost", new Throwable[0]);
            C6548e eVar = C6548e.this;
            eVar.m20134d(eVar.m20131g());
        }
    }

    public C6548e(Context context, AbstractC8354a aVar) {
        super(context, aVar);
        if (m20128j()) {
            this.f20387h = new C6550b();
        } else {
            this.f20388i = new C6549a();
        }
    }

    public static boolean m20128j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override
    public void mo20133e() {
        if (m20128j()) {
            try {
                AbstractC4234j.m28364c().mo28361a(f20385j, "Registering network callback", new Throwable[0]);
                this.f20386g.registerDefaultNetworkCallback(this.f20387h);
            } catch (IllegalArgumentException | SecurityException e) {
                AbstractC4234j.m28364c().mo28360b(f20385j, "Received exception while registering network callback", e);
            }
        } else {
            AbstractC4234j.m28364c().mo28361a(f20385j, "Registering broadcast receiver", new Throwable[0]);
            this.f20379b.registerReceiver(this.f20388i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @Override
    public void mo20132f() {
        if (m20128j()) {
            try {
                AbstractC4234j.m28364c().mo28361a(f20385j, "Unregistering network callback", new Throwable[0]);
                this.f20386g.unregisterNetworkCallback(this.f20387h);
            } catch (IllegalArgumentException | SecurityException e) {
                AbstractC4234j.m28364c().mo28360b(f20385j, "Received exception while unregistering network callback", e);
            }
        } else {
            AbstractC4234j.m28364c().mo28361a(f20385j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f20379b.unregisterReceiver(this.f20388i);
        }
    }

    public C6042b m20131g() {
        NetworkInfo activeNetworkInfo = this.f20386g.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i = m20129i();
        boolean a = C10063a.m6087a(this.f20386g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new C6042b(z2, i, a, z);
    }

    public C6042b mo20127b() {
        return m20131g();
    }

    public boolean m20129i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f20386g.getNetworkCapabilities(this.f20386g.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e) {
            AbstractC4234j.m28364c().mo28360b(f20385j, "Unable to validate active network", e);
            return false;
        }
    }
}
