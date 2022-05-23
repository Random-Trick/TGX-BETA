package org.thunderdog.challegram.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ce.j0;
import zd.ya;

public class BootListenerService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int i10, int i11) {
        j0.L(getApplicationContext());
        ya.Z1(getApplicationContext(), -1, 1, 0L, false, 0L);
        return 2;
    }
}
