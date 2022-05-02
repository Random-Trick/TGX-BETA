package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.thunderdog.challegram.Log;
import p108hb.C5070i;
import p350yd.C10536ab;

public class LiveLocationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.m14719i("onReceive LiveLocation action:%s", action);
        if (!C5070i.m24062i(action)) {
            action.hashCode();
            if (action.equals("org.thunderdog.challegram.ACTION_STOP_LOCATION")) {
                C10536ab.m4667o1().m4735W1().m4366k();
            }
        }
    }
}
