package o6;

import android.content.Context;
import t6.p;

public final class e {
    public static f f19224a;

    public static synchronized f a(Context context) {
        f fVar;
        synchronized (e.class) {
            if (f19224a == null) {
                c0 c0Var = new c0(null);
                c0Var.a(new l(p.a(context)));
                f19224a = c0Var.b();
            }
            fVar = f19224a;
        }
        return fVar;
    }
}
