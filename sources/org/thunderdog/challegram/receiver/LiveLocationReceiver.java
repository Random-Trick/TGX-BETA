package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ib.i;
import org.thunderdog.challegram.Log;
import zd.ya;

public class LiveLocationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.i("onReceive LiveLocation action:%s", action);
        if (!i.i(action)) {
            action.hashCode();
            if (action.equals("org.thunderdog.challegram.ACTION_STOP_LOCATION")) {
                ya.o1().W1().k();
            }
        }
    }
}
