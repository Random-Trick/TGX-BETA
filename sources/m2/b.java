package m2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f2.j;
import r2.a;

public class b extends c<Boolean> {
    public static final String f16458i = j.f("BatteryNotLowTracker");

    public b(Context context, a aVar) {
        super(context, aVar);
    }

    @Override
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override
    public void h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            j.c().a(f16458i, String.format("Received %s", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                d(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                d(Boolean.FALSE);
            }
        }
    }

    public Boolean b() {
        Intent registerReceiver = this.f16464b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            j.c().b(f16458i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
