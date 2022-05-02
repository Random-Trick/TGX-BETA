package org.thunderdog.challegram.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class StubAuthenticatorService extends Service {
    public StubAuthenticator f25709a;

    @Override
    public IBinder onBind(Intent intent) {
        return this.f25709a.getIBinder();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.f25709a = new StubAuthenticator(this);
    }
}
