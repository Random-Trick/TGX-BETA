package u7;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class p implements Application.ActivityLifecycleCallbacks {
    public final Set<Intent> f23671a = Collections.newSetFromMap(new WeakHashMap());

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        Intent intent = activity.getIntent();
        if (intent != null && this.f23671a.add(intent) && (extras = intent.getExtras()) != null) {
            Bundle bundle2 = extras.getBundle("gcm.n.analytics_data");
            if (b.B(bundle2)) {
                b.u(bundle2);
            }
        }
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
    }

    @Override
    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f23671a.remove(activity.getIntent());
        }
    }

    @Override
    public void onActivityResumed(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override
    public void onActivityStarted(Activity activity) {
    }

    @Override
    public void onActivityStopped(Activity activity) {
    }
}
