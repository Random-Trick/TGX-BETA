package p202o6;

import android.content.Context;
import p262s6.C8676p;

public final class C7764u1 {
    public static AbstractC7675d f24861a;

    public static synchronized AbstractC7675d m15115a(Context context) {
        AbstractC7675d dVar;
        synchronized (C7764u1.class) {
            if (f24861a == null) {
                C7778x0 x0Var = new C7778x0(null);
                x0Var.m15105b(new C7766u3(C8676p.m11764a(context)));
                f24861a = x0Var.m15106a();
            }
            dVar = f24861a;
        }
        return dVar;
    }
}
