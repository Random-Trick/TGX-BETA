package p6;

import android.content.Context;
import t6.p;

public final class u1 {
    public static d f20816a;

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (u1.class) {
            if (f20816a == null) {
                x0 x0Var = new x0(null);
                x0Var.b(new u3(p.a(context)));
                f20816a = x0Var.a();
            }
            dVar = f20816a;
        }
        return dVar;
    }
}
