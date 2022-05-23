package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.thunderdog.challegram.service.TGCallService;

public class CallBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        TGCallService w10 = TGCallService.w();
        if (w10 != null) {
            w10.M(context, intent);
        }
    }
}
