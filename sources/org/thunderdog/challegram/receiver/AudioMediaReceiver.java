package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.thunderdog.challegram.Log;
import p108hb.C5070i;
import p350yd.C10536ab;

public class AudioMediaReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.m14721i((int) Log.TAG_PLAYER, "onReceive action:%s", action);
        if (!C5070i.m24061i(action)) {
            action.hashCode();
            char c = 65535;
            switch (action.hashCode()) {
                case 47209010:
                    if (action.equals("org.thunderdog.challegram.ACTION_PLAY_PAUSE")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1595315215:
                    if (action.equals("org.thunderdog.challegram.ACTION_PLAY_SKIP_NEXT")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1774571027:
                    if (action.equals("org.thunderdog.challegram.ACTION_PLAY_SKIP_PREVIOUS")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2079742808:
                    if (action.equals("org.thunderdog.challegram.ACTION_PLAY_PLAY")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2079840294:
                    if (action.equals("org.thunderdog.challegram.ACTION_PLAY_STOP")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 3:
                    C10536ab.m4667o1().m4636w2().m7111E0();
                    return;
                case 1:
                    C10536ab.m4667o1().m4636w2().m7063c1(true);
                    return;
                case 2:
                    C10536ab.m4667o1().m4636w2().m7063c1(false);
                    return;
                case 4:
                    C10536ab.m4667o1().m4636w2().m7061d1(true);
                    return;
                default:
                    return;
            }
        }
    }
}
