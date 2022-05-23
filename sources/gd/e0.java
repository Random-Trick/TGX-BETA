package gd;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import org.thunderdog.challegram.Log;
import zd.ya;

public class e0 {
    public static final IntentFilter f12234f;
    public final Context f12235a;
    public final d0 f12236b;
    public final f0 f12237c;
    public final i0 f12238d = new i0();
    public boolean f12239e;

    static {
        IntentFilter intentFilter = new IntentFilter();
        f12234f = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        int i10 = Build.VERSION.SDK_INT;
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        if (i10 >= 24) {
            intentFilter.addAction("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
        }
    }

    public e0(Context context, ya yaVar) {
        this.f12235a = context;
        d0 d0Var = new d0(yaVar);
        this.f12236b = d0Var;
        this.f12237c = new f0(d0Var);
    }

    public d0 a() {
        return this.f12236b;
    }

    public void b() {
        if (!this.f12239e) {
            this.f12239e = true;
            try {
                this.f12235a.registerReceiver(this.f12237c, f12234f);
            } catch (Throwable th) {
                Log.w("Cannot register intent receiver", th, new Object[0]);
            }
            this.f12238d.i();
        }
    }

    public void c() {
        if (this.f12239e) {
            this.f12239e = false;
            try {
                this.f12235a.unregisterReceiver(this.f12237c);
            } catch (Throwable th) {
                Log.w("Cannot unregister intent receiver", th, new Object[0]);
            }
            this.f12238d.l();
        }
    }
}
