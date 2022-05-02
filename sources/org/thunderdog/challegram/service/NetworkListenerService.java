package org.thunderdog.challegram.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import be.C1379j0;

public class NetworkListenerService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        C1379j0.m37359L(getApplicationContext());
        return 1;
    }
}
