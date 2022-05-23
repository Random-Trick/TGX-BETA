package ra;

import ya.b;
import ya.c;
import ya.d;
import ya.e;

public class t {
    public static final u f21819a;
    public static final b[] f21820b;

    static {
        u uVar = null;
        try {
            uVar = (u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new u();
        }
        f21819a = uVar;
        f21820b = new b[0];
    }

    public static d a(i iVar) {
        return f21819a.a(iVar);
    }

    public static b b(Class cls) {
        return f21819a.b(cls);
    }

    public static c c(Class cls) {
        return f21819a.c(cls, "");
    }

    public static e d(m mVar) {
        return f21819a.d(mVar);
    }

    public static String e(l lVar) {
        return f21819a.f(lVar);
    }
}
