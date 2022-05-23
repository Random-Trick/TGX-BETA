package org.thunderdog.challegram.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ce.j0;

public class NetworkListenerService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int i10, int i11) {
        j0.L(getApplicationContext());
        return 1;
    }
}
