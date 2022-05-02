package org.thunderdog.challegram.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SyncService extends Service {
    public static SyncAdapter f25707a;
    public static final Object f25708b = new Object();

    @Override
    public IBinder onBind(Intent intent) {
        return f25707a.getSyncAdapterBinder();
    }

    @Override
    public void onCreate() {
        synchronized (f25708b) {
            if (f25707a == null) {
                f25707a = new SyncAdapter(getApplicationContext(), true);
            }
        }
    }
}
