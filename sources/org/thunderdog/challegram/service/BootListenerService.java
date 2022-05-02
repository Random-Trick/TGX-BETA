package org.thunderdog.challegram.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import be.C1379j0;
import p350yd.C10536ab;

public class BootListenerService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        C1379j0.m37359L(getApplicationContext());
        C10536ab.m4723Z1(getApplicationContext(), -1, 1, 0L, false, 0L);
        return 2;
    }
}
