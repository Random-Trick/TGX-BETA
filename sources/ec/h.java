package ec;

import java.lang.reflect.Method;
import ra.g;
import ra.k;

public final class h {
    public static final a f11515d = new a(null);
    public final Method f11516a;
    public final Method f11517b;
    public final Method f11518c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final h a() {
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
            return new h(method3, method, method2);
        }
    }

    public h(Method method, Method method2, Method method3) {
        this.f11516a = method;
        this.f11517b = method2;
        this.f11518c = method3;
    }

    public final Object a(String str) {
        k.e(str, "closer");
        Method method = this.f11516a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f11517b;
                k.c(method2);
                method2.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f11518c;
            k.c(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
