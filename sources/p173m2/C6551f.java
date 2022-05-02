package p173m2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p071f2.AbstractC4234j;
import p243r2.AbstractC8354a;

public class C6551f extends AbstractC6544c<Boolean> {
    public static final String f20391i = AbstractC4234j.m28360f("StorageNotLowTracker");

    public C6551f(Context context, AbstractC8354a aVar) {
        super(context, aVar);
    }

    @Override
    public IntentFilter mo20125g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override
    public void mo20124h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            AbstractC4234j.m28362c().mo28359a(f20391i, String.format("Received %s", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                m20133d(Boolean.FALSE);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                m20133d(Boolean.TRUE);
            }
        }
    }

    public Boolean mo20126b() {
        Intent registerReceiver = this.f20379b.registerReceiver(null, mo20125g());
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
