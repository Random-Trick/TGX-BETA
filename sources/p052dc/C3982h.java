package p052dc;

import java.lang.reflect.Method;
import qa.C8294g;
import qa.C8298k;

public final class C3982h {
    public static final C3983a f13358d = new C3983a(null);
    public final Method f13359a;
    public final Method f13360b;
    public final Method f13361c;

    public static final class C3983a {
        public C3983a() {
        }

        public final C3982h m29427a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C3982h(method3, method, method2);
        }

        public C3983a(C8294g gVar) {
            this();
        }
    }

    public C3982h(Method method, Method method2, Method method3) {
        this.f13359a = method;
        this.f13360b = method2;
        this.f13361c = method3;
    }

    public final Object m29429a(String str) {
        C8298k.m12933e(str, "closer");
        Method method = this.f13359a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f13360b;
                C8298k.m12935c(method2);
                method2.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean m29428b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f13361c;
            C8298k.m12935c(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
