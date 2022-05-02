package p173m2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import p071f2.AbstractC4234j;
import p243r2.AbstractC8354a;

public class C6542a extends AbstractC6544c<Boolean> {
    public static final String f20372i = AbstractC4234j.m28362f("BatteryChrgTracker");

    public C6542a(Context context, AbstractC8354a aVar) {
        super(context, aVar);
    }

    @Override
    public IntentFilter mo20126g() {
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
    public void mo20125h(android.content.Context r6, android.content.Intent r7) {
        throw new UnsupportedOperationException("Method not decompiled: p173m2.C6542a.mo20125h(android.content.Context, android.content.Intent):void");
    }

    public Boolean mo20127b() {
        Intent registerReceiver = this.f20379b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m20138j(registerReceiver));
        }
        AbstractC4234j.m28364c().mo28360b(f20372i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    public final boolean m20138j(Intent intent) {
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
