package m3;

import android.content.Context;
import android.net.wifi.WifiManager;
import c5.s;

public final class v3 {
    public final WifiManager f17016a;
    public WifiManager.WifiLock f17017b;
    public boolean f17018c;
    public boolean f17019d;

    public v3(Context context) {
        this.f17016a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z10) {
        if (z10 && this.f17017b == null) {
            WifiManager wifiManager = this.f17016a;
            if (wifiManager == null) {
                s.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f17017b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f17018c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f17019d = z10;
        c();
    }

    public final void c() {
        WifiManager.WifiLock wifiLock = this.f17017b;
        if (wifiLock != null) {
            if (!this.f17018c || !this.f17019d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }
}
