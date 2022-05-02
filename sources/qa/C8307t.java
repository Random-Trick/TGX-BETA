package qa;

import p332xa.AbstractC10169b;
import p332xa.AbstractC10170c;
import p332xa.AbstractC10171d;
import p332xa.AbstractC10172e;

public class C8307t {
    public static final C8308u f26792a;
    public static final AbstractC10169b[] f26793b;

    static {
        C8308u uVar = null;
        try {
            uVar = (C8308u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new C8308u();
        }
        f26792a = uVar;
        f26793b = new AbstractC10169b[0];
    }

    public static AbstractC10171d m12920a(C8296i iVar) {
        return f26792a.m12915a(iVar);
    }

    public static AbstractC10169b m12919b(Class cls) {
        return f26792a.m12914b(cls);
    }

    public static AbstractC10170c m12918c(Class cls) {
        return f26792a.m12913c(cls, "");
    }

    public static AbstractC10172e m12917d(AbstractC8300m mVar) {
        return f26792a.m12912d(mVar);
    }

    public static String m12916e(AbstractC8299l lVar) {
        return f26792a.m12910f(lVar);
    }
}
