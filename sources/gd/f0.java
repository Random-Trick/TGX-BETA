package gd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import zd.ya;

public class f0 extends BroadcastReceiver {
    public final d0 f12243a;

    public f0(d0 d0Var) {
        this.f12243a = d0Var;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.media.AUDIO_BECOMING_NOISY".equals(action)) {
            ya.o1().w2().W0(4, true);
        } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f12243a.o();
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if ("android.intent.action.HEADSET_PLUG".equals(action)) {
                if (intent.getIntExtra("state", 0) == 1) {
                    ya.o1().w2().W0(4, false);
                }
            } else if (i10 < 24 || !"android.net.conn.RESTRICT_BACKGROUND_CHANGED".equals(action)) {
                this.f12243a.o();
            } else {
                this.f12243a.o();
            }
        }
    }
}
