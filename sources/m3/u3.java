package m3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import c5.s;

public final class u3 {
    public final PowerManager f17009a;
    public PowerManager.WakeLock f17010b;
    public boolean f17011c;
    public boolean f17012d;

    public u3(Context context) {
        this.f17009a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z10) {
        if (z10 && this.f17010b == null) {
            PowerManager powerManager = this.f17009a;
            if (powerManager == null) {
                s.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f17010b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f17011c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f17012d = z10;
        c();
    }

    @SuppressLint({"WakelockTimeout"})
    public final void c() {
        PowerManager.WakeLock wakeLock = this.f17010b;
        if (wakeLock != null) {
            if (!this.f17011c || !this.f17012d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }
}
