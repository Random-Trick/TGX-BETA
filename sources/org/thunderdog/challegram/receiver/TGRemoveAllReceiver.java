package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import zd.db;
import zd.ya;

public class TGRemoveAllReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ya.r2(context, 1, db.f(intent.getExtras()));
    }
}
