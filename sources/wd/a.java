package wd;

import android.annotation.TargetApi;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import zd.db;
import zd.ya;

public abstract class a extends BroadcastReceiver {
    @Override
    @TargetApi(20)
    public void onReceive(Context context, Intent intent) {
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            ya.s2(context, resultsFromIntent.getCharSequence("extra_voice_reply"), db.e(intent.getExtras()));
        }
    }
}
