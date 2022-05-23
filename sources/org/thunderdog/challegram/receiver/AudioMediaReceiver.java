package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ib.i;
import org.thunderdog.challegram.Log;
import zd.ya;

public class AudioMediaReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.i((int) Log.TAG_PLAYER, "onReceive action:%s", action);
        if (!i.i(action)) {
            action.hashCode();
            char c10 = 65535;
            switch (action.hashCode()) {
                case 47209010:
                    if (action.equals("org.thunderdog.challegram.ACTION_PLAY_PAUSE")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1595315215:
                    if (action.equals("org.thunderdog.challegram.ACTION_PLAY_SKIP_NEXT")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1774571027:
                    if (action.equals("org.thunderdog.challegram.ACTION_PLAY_SKIP_PREVIOUS")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2079742808:
                    if (action.equals("org.thunderdog.challegram.ACTION_PLAY_PLAY")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2079840294:
                    if (action.equals("org.thunderdog.challegram.ACTION_PLAY_STOP")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 3:
                    ya.o1().w2().E0();
                    return;
                case 1:
                    ya.o1().w2().c1(true);
                    return;
                case 2:
                    ya.o1().w2().c1(false);
                    return;
                case 4:
                    ya.o1().w2().d1(true);
                    return;
                default:
                    return;
            }
        }
    }
}
