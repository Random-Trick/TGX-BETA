package p174m3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import p020b5.C1230s;

public final class C6650m3 {
    public final PowerManager f20778a;
    public PowerManager.WakeLock f20779b;
    public boolean f20780c;
    public boolean f20781d;

    public C6650m3(Context context) {
        this.f20778a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void m19666a(boolean z) {
        if (z && this.f20779b == null) {
            PowerManager powerManager = this.f20778a;
            if (powerManager == null) {
                C1230s.m37884i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f20779b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f20780c = z;
        m19664c();
    }

    public void m19665b(boolean z) {
        this.f20781d = z;
        m19664c();
    }

    @SuppressLint({"WakelockTimeout"})
    public final void m19664c() {
        PowerManager.WakeLock wakeLock = this.f20779b;
        if (wakeLock != null) {
            if (!this.f20780c || !this.f20781d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }
}
