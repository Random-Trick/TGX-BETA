package p272t5;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public final class View$OnClickListenerC8992i implements View.OnClickListener {
    public final Context f28891a;
    public final Intent f28892b;

    public View$OnClickListenerC8992i(Context context, Intent intent) {
        this.f28891a = context;
        this.f28892b = intent;
    }

    @Override
    public final void onClick(View view) {
        try {
            this.f28891a.startActivity(this.f28892b);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
