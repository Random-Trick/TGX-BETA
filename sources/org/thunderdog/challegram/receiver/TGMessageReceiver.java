package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p350yd.C10536ab;
import p350yd.C10666fb;

public class TGMessageReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action;
        int i;
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.equals("org.thunderdog.challegram.ACTION_MESSAGE_MUTE")) {
                i = 3;
            } else if (action.equals("org.thunderdog.challegram.ACTION_MESSAGE_READ")) {
                i = 2;
            } else {
                return;
            }
            C10536ab.m4656r2(context, i, C10666fb.m4342e(intent.getExtras()));
        }
    }
}
