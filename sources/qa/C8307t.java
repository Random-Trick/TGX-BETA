package qa;

import p332xa.AbstractC10169b;
import p332xa.AbstractC10170c;
import p332xa.AbstractC10171d;
import p332xa.AbstractC10172e;

public class C8307t {
    public static final C8308u f26789a;
    public static final AbstractC10169b[] f26790b;

    static {
        C8308u uVar = null;
        try {
            uVar = (C8308u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new C8308u();
        }
        f26789a = uVar;
        f26790b = new AbstractC10169b[0];
    }

    public static AbstractC10171d m12921a(C8296i iVar) {
        return f26789a.m12916a(iVar);
    }

    public static AbstractC10169b m12920b(Class cls) {
        return f26789a.m12915b(cls);
    }

    public static AbstractC10170c m12919c(Class cls) {
        return f26789a.m12914c(cls, "");
    }

    public static AbstractC10172e m12918d(AbstractC8300m mVar) {
        return f26789a.m12913d(mVar);
    }

    public static String m12917e(AbstractC8299l lVar) {
        return f26789a.m12911f(lVar);
    }
}
