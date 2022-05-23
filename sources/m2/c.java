package m2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f2.j;

public abstract class c<T> extends d<T> {
    public static final String f16459h = j.f("BrdcstRcvrCnstrntTrckr");
    public final BroadcastReceiver f16460g = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, r2.a aVar) {
        super(context, aVar);
    }

    @Override
    public void e() {
        j.c().a(f16459h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f16464b.registerReceiver(this.f16460g, g());
    }

    @Override
    public void f() {
        j.c().a(f16459h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f16464b.unregisterReceiver(this.f16460g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
