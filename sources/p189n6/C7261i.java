package p189n6;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import p233q6.AbstractC8257a;

public final class C7261i implements AbstractC8257a {
    public final Activity f23093a;

    public C7261i(C7262j jVar, Activity activity) {
        this.f23093a = activity;
    }

    @Override
    public final void mo13021a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.f23093a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
