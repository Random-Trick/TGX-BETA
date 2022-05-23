package org.thunderdog.challegram.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SyncService extends Service {
    public static SyncAdapter f20146a;
    public static final Object f20147b = new Object();

    @Override
    public IBinder onBind(Intent intent) {
        return f20146a.getSyncAdapterBinder();
    }

    @Override
    public void onCreate() {
        synchronized (f20147b) {
            if (f20146a == null) {
                f20146a = new SyncAdapter(getApplicationContext(), true);
            }
        }
    }
}
