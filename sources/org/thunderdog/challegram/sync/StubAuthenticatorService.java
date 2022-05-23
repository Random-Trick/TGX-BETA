package org.thunderdog.challegram.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class StubAuthenticatorService extends Service {
    public StubAuthenticator f20145a;

    @Override
    public IBinder onBind(Intent intent) {
        return this.f20145a.getIBinder();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.f20145a = new StubAuthenticator(this);
    }
}
