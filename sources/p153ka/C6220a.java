package p153ka;

import java.lang.reflect.Method;
import qa.C8298k;
import ua.AbstractC9486c;
import ua.C9484b;

public class C6220a {

    public static final class C6221a {
        public static final C6221a f19641a = new C6221a();
        public static final Method f19642b;
        public static final Method f19643c;

        static {
            throw new UnsupportedOperationException("Method not decompiled: p153ka.C6220a.C6221a.<clinit>():void");
        }
    }

    public void mo20407a(Throwable th, Throwable th2) {
        C8298k.m12933e(th, "cause");
        C8298k.m12933e(th2, "exception");
        Method method = C6221a.f19642b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public AbstractC9486c mo18954b() {
        return new C9484b();
    }
}
