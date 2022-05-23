package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import zd.db;
import zd.ya;

public class TGMessageReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action;
        int i10;
        if (intent != null && (action = intent.getAction()) != null) {
            if (action.equals("org.thunderdog.challegram.ACTION_MESSAGE_MUTE")) {
                i10 = 3;
            } else if (action.equals("org.thunderdog.challegram.ACTION_MESSAGE_READ")) {
                i10 = 2;
            } else {
                return;
            }
            ya.r2(context, i10, db.e(intent.getExtras()));
        }
    }
}
