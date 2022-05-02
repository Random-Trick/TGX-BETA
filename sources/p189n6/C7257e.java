package p189n6;

import android.content.Context;
import p262s6.C8676p;

public final class C7257e {
    public static C7258f f23084a;

    public static synchronized C7258f m17188a(Context context) {
        C7258f fVar;
        synchronized (C7257e.class) {
            if (f23084a == null) {
                C7253c0 c0Var = new C7253c0(null);
                c0Var.m17194a(new C7264l(C8676p.m11764a(context)));
                f23084a = c0Var.m17193b();
            }
            fVar = f23084a;
        }
        return fVar;
    }
}
