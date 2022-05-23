package m2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f2.j;
import r2.a;

public class f extends c<Boolean> {
    public static final String f16476i = j.f("StorageNotLowTracker");

    public f(Context context, a aVar) {
        super(context, aVar);
    }

    @Override
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override
    public void h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            j.c().a(f16476i, String.format("Received %s", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                d(Boolean.FALSE);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                d(Boolean.TRUE);
            }
        }
    }

    public Boolean b() {
        Intent registerReceiver = this.f16464b.registerReceiver(null, g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }
}
