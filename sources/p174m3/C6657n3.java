package p174m3;

import android.content.Context;
import android.net.wifi.WifiManager;
import p020b5.C1230s;

public final class C6657n3 {
    public final WifiManager f20799a;
    public WifiManager.WifiLock f20800b;
    public boolean f20801c;
    public boolean f20802d;

    public C6657n3(Context context) {
        this.f20799a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void m19648a(boolean z) {
        if (z && this.f20800b == null) {
            WifiManager wifiManager = this.f20799a;
            if (wifiManager == null) {
                C1230s.m37884i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f20800b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f20801c = z;
        m19646c();
    }

    public void m19647b(boolean z) {
        this.f20802d = z;
        m19646c();
    }

    public final void m19646c() {
        WifiManager.WifiLock wifiLock = this.f20800b;
        if (wifiLock != null) {
            if (!this.f20801c || !this.f20802d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }
}
