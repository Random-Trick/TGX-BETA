package p272t5;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public final class View$OnClickListenerC8992i implements View.OnClickListener {
    public final Context f28894a;
    public final Intent f28895b;

    public View$OnClickListenerC8992i(Context context, Intent intent) {
        this.f28894a = context;
        this.f28895b = intent;
    }

    @Override
    public final void onClick(View view) {
        try {
            this.f28894a.startActivity(this.f28895b);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
