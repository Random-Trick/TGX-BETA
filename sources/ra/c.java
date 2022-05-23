package ra;

import java.io.Serializable;
import pa.b;

public abstract class c implements ya.a, Serializable {
    public static final Object P = a.f21805a;
    public final String M;
    public final String N;
    public final boolean O;
    public transient ya.a f21802a;
    public final Object f21803b;
    public final Class f21804c;

    public static class a implements Serializable {
        public static final a f21805a = new a();
    }

    public c() {
        this(P);
    }

    public ya.a f() {
        ya.a aVar = this.f21802a;
        if (aVar != null) {
            return aVar;
        }
        ya.a g10 = g();
        this.f21802a = g10;
        return g10;
    }

    public abstract ya.a g();

    public Object h() {
        return this.f21803b;
    }

    public String i() {
        return this.M;
    }

    public ya.c j() {
        Class cls = this.f21804c;
        if (cls == null) {
            return null;
        }
        return this.O ? t.c(cls) : t.b(cls);
    }

    public ya.a k() {
        ya.a f10 = f();
        if (f10 != this) {
            return f10;
        }
        throw new b();
    }

    public String l() {
        return this.N;
    }

    public c(Object obj) {
        this(obj, null, null, null, false);
    }

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f21803b = obj;
        this.f21804c = cls;
        this.M = str;
        this.N = str2;
        this.O = z10;
    }
}
