package o6;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import r6.a;

public final class i implements a {
    public final Activity f19233a;

    public i(j jVar, Activity activity) {
        this.f19233a = activity;
    }

    @Override
    public final void a(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        this.f19233a.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
