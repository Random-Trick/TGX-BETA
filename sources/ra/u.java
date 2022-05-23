package ra;

import ya.b;
import ya.c;
import ya.d;
import ya.e;

public class u {
    public d a(i iVar) {
        return iVar;
    }

    public b b(Class cls) {
        return new e(cls);
    }

    public c c(Class cls, String str) {
        return new p(cls, str);
    }

    public e d(m mVar) {
        return mVar;
    }

    public String e(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String f(l lVar) {
        return e(lVar);
    }
}
