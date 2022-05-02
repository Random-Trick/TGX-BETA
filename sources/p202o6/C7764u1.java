package p202o6;

import android.content.Context;
import p262s6.C8676p;

public final class C7764u1 {
    public static AbstractC7675d f24864a;

    public static synchronized AbstractC7675d m15115a(Context context) {
        AbstractC7675d dVar;
        synchronized (C7764u1.class) {
            if (f24864a == null) {
                C7778x0 x0Var = new C7778x0(null);
                x0Var.m15105b(new C7766u3(C8676p.m11763a(context)));
                f24864a = x0Var.m15106a();
            }
            dVar = f24864a;
        }
        return dVar;
    }
}
