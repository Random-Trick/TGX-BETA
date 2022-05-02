package p173m2;

import android.content.Context;
import p243r2.AbstractC8354a;

public class C6552g {
    public static C6552g f20392e;
    public C6542a f20393a;
    public C6543b f20394b;
    public C6548e f20395c;
    public C6551f f20396d;

    public C6552g(Context context, AbstractC8354a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f20393a = new C6542a(applicationContext, aVar);
        this.f20394b = new C6543b(applicationContext, aVar);
        this.f20395c = new C6548e(applicationContext, aVar);
        this.f20396d = new C6551f(applicationContext, aVar);
    }

    public static synchronized C6552g m20120c(Context context, AbstractC8354a aVar) {
        C6552g gVar;
        synchronized (C6552g.class) {
            if (f20392e == null) {
                f20392e = new C6552g(context, aVar);
            }
            gVar = f20392e;
        }
        return gVar;
    }

    public C6542a m20122a() {
        return this.f20393a;
    }

    public C6543b m20121b() {
        return this.f20394b;
    }

    public C6548e m20119d() {
        return this.f20395c;
    }

    public C6551f m20118e() {
        return this.f20396d;
    }
}
