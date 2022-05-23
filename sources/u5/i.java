package u5;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public final class i implements View.OnClickListener {
    public final Context f23582a;
    public final Intent f23583b;

    public i(Context context, Intent intent) {
        this.f23582a = context;
        this.f23583b = intent;
    }

    @Override
    public final void onClick(View view) {
        try {
            this.f23582a.startActivity(this.f23583b);
        } catch (ActivityNotFoundException e10) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
        }
    }
}
