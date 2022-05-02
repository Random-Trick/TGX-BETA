package p082fd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p350yd.C10536ab;

public class C4369f0 extends BroadcastReceiver {
    public final C4363d0 f14476a;

    public C4369f0(C4363d0 d0Var) {
        this.f14476a = d0Var;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.media.AUDIO_BECOMING_NOISY".equals(action)) {
            if (Build.VERSION.SDK_INT >= 21) {
                C10536ab.m4667o1().m4636w2().m7075W0(4, true);
            } else {
                C10536ab.m4667o1().m4636w2().m7119A0(4);
            }
        } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f14476a.m28138o();
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i < 21 || !"android.intent.action.HEADSET_PLUG".equals(action)) {
                if (i < 24 || !"android.net.conn.RESTRICT_BACKGROUND_CHANGED".equals(action)) {
                    this.f14476a.m28138o();
                } else {
                    this.f14476a.m28138o();
                }
            } else if (intent.getIntExtra("state", 0) == 1) {
                C10536ab.m4667o1().m4636w2().m7075W0(4, false);
            }
        }
    }
}
