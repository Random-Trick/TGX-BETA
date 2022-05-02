package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p350yd.C10536ab;
import p350yd.C10666fb;

public class TGRemoveAllReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        C10536ab.m4656r2(context, 1, C10666fb.m4341f(intent.getExtras()));
    }
}
