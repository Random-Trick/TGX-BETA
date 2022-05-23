package m2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import f2.j;

public class a extends c<Boolean> {
    public static final String f16457i = j.f("BatteryChrgTracker");

    public a(Context context, r2.a aVar) {
        super(context, aVar);
    }

    @Override
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    @Override
    public void h(android.content.Context r6, android.content.Intent r7) {
        throw new UnsupportedOperationException("Method not decompiled: m2.a.h(android.content.Context, android.content.Intent):void");
    }

    public Boolean b() {
        Intent registerReceiver = this.f16464b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(j(registerReceiver));
        }
        j.c().b(f16457i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    public final boolean j(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }
}
