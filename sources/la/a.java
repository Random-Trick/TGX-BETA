package la;

import java.lang.reflect.Method;
import ra.k;
import va.b;
import va.c;

public class a {

    public static final class C0150a {
        public static final C0150a f16322a = new C0150a();
        public static final Method f16323b;
        public static final Method f16324c;

        static {
            throw new UnsupportedOperationException("Method not decompiled: la.a.C0150a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        k.e(th, "cause");
        k.e(th2, "exception");
        Method method = C0150a.f16323b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public c b() {
        return new b();
    }
}
