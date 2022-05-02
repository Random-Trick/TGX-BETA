package p173m2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p071f2.AbstractC4234j;
import p243r2.AbstractC8354a;

public abstract class AbstractC6544c<T> extends AbstractC6546d<T> {
    public static final String f20374h = AbstractC4234j.m28362f("BrdcstRcvrCnstrntTrckr");
    public final BroadcastReceiver f20375g = new C6545a();

    public class C6545a extends BroadcastReceiver {
        public C6545a() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AbstractC6544c.this.mo20125h(context, intent);
            }
        }
    }

    public AbstractC6544c(Context context, AbstractC8354a aVar) {
        super(context, aVar);
    }

    @Override
    public void mo20133e() {
        AbstractC4234j.m28364c().mo28361a(f20374h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f20379b.registerReceiver(this.f20375g, mo20126g());
    }

    @Override
    public void mo20132f() {
        AbstractC4234j.m28364c().mo28361a(f20374h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f20379b.unregisterReceiver(this.f20375g);
    }

    public abstract IntentFilter mo20126g();

    public abstract void mo20125h(Context context, Intent intent);
}
