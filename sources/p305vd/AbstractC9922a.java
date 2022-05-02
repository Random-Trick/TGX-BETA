package p305vd;

import android.annotation.TargetApi;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p350yd.C10536ab;
import p350yd.C10666fb;

public abstract class AbstractC9922a extends BroadcastReceiver {
    @Override
    @TargetApi(20)
    public void onReceive(Context context, Intent intent) {
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            C10536ab.m4652s2(context, resultsFromIntent.getCharSequence("extra_voice_reply"), C10666fb.m4342e(intent.getExtras()));
        }
    }
}
