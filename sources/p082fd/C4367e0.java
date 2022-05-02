package p082fd;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import org.thunderdog.challegram.Log;
import p350yd.C10536ab;

public class C4367e0 {
    public static final IntentFilter f14466f;
    public final Context f14467a;
    public final C4363d0 f14468b;
    public final C4369f0 f14469c;
    public final C4375i0 f14470d = new C4375i0();
    public boolean f14471e;

    static {
        IntentFilter intentFilter = new IntentFilter();
        f14466f = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        }
        if (i >= 24) {
            intentFilter.addAction("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
        }
    }

    public C4367e0(Context context, C10536ab abVar) {
        this.f14467a = context;
        C4363d0 d0Var = new C4363d0(abVar);
        this.f14468b = d0Var;
        this.f14469c = new C4369f0(d0Var);
    }

    public C4363d0 m28128a() {
        return this.f14468b;
    }

    public void m28127b() {
        if (!this.f14471e) {
            this.f14471e = true;
            try {
                this.f14467a.registerReceiver(this.f14469c, f14466f);
            } catch (Throwable th) {
                Log.m14710w("Cannot register intent receiver", th, new Object[0]);
            }
            this.f14470d.m28117i();
        }
    }

    public void m28126c() {
        if (this.f14471e) {
            this.f14471e = false;
            try {
                this.f14467a.unregisterReceiver(this.f14469c);
            } catch (Throwable th) {
                Log.m14710w("Cannot unregister intent receiver", th, new Object[0]);
            }
            this.f14470d.m28114l();
        }
    }
}
