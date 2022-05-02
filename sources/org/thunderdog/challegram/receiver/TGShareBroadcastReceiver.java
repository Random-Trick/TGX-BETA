package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;

public class TGShareBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (!C5070i.m24062i(dataString)) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", dataString);
            Intent createChooser = Intent.createChooser(intent2, C4403w.m27871i1(R.string.ShareLink));
            createChooser.setFlags(268435456);
            context.startActivity(createChooser);
        }
    }
}
