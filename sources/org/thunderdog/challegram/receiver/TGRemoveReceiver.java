package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import zd.db;
import zd.ya;

public class TGRemoveReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ya.r2(context, 0, db.e(intent.getExtras()));
    }
}
