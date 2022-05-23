package org.thunderdog.challegram.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gd.w;
import ib.i;
import org.thunderdog.challegram.R;

public class TGShareBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (!i.i(dataString)) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", dataString);
            Intent createChooser = Intent.createChooser(intent2, w.i1(R.string.ShareLink));
            createChooser.setFlags(268435456);
            context.startActivity(createChooser);
        }
    }
}
