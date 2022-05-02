package p173m2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p071f2.AbstractC4234j;
import p243r2.AbstractC8354a;

public class C6543b extends AbstractC6544c<Boolean> {
    public static final String f20373i = AbstractC4234j.m28362f("BatteryNotLowTracker");

    public C6543b(Context context, AbstractC8354a aVar) {
        super(context, aVar);
    }

    @Override
    public IntentFilter mo20126g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override
    public void mo20125h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            AbstractC4234j.m28364c().mo28361a(f20373i, String.format("Received %s", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                m20134d(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                m20134d(Boolean.FALSE);
            }
        }
    }

    public Boolean mo20127b() {
        Intent registerReceiver = this.f20379b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            AbstractC4234j.m28364c().mo28360b(f20373i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
