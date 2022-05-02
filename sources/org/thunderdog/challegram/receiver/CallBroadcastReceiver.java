package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.thunderdog.challegram.service.TGCallService;

public class CallBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        TGCallService w = TGCallService.m14211w();
        if (w != null) {
            w.m14249M(context, intent);
        }
    }
}
