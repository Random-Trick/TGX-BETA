package qa;

import java.io.Serializable;
import p206oa.C7813b;
import p332xa.AbstractC10168a;
import p332xa.AbstractC10170c;

public abstract class AbstractC8288c implements AbstractC10168a, Serializable {
    public static final Object f26769P = C8289a.f26776a;
    public final String f26770M;
    public final String f26771N;
    public final boolean f26772O;
    public transient AbstractC10168a f26773a;
    public final Object f26774b;
    public final Class f26775c;

    public static class C8289a implements Serializable {
        public static final C8289a f26776a = new C8289a();
    }

    public AbstractC8288c() {
        this(f26769P);
    }

    public AbstractC10168a m12948f() {
        AbstractC10168a aVar = this.f26773a;
        if (aVar != null) {
            return aVar;
        }
        AbstractC10168a g = mo12923g();
        this.f26773a = g;
        return g;
    }

    public abstract AbstractC10168a mo12923g();

    public Object m12947h() {
        return this.f26774b;
    }

    public String m12946i() {
        return this.f26770M;
    }

    public AbstractC10170c m12945j() {
        Class cls = this.f26775c;
        if (cls == null) {
            return null;
        }
        return this.f26772O ? C8307t.m12918c(cls) : C8307t.m12919b(cls);
    }

    public AbstractC10168a m12944k() {
        AbstractC10168a f = m12948f();
        if (f != this) {
            return f;
        }
        throw new C7813b();
    }

    public String m12943l() {
        return this.f26771N;
    }

    public AbstractC8288c(Object obj) {
        this(obj, null, null, null, false);
    }

    public AbstractC8288c(Object obj, Class cls, String str, String str2, boolean z) {
        this.f26774b = obj;
        this.f26775c = cls;
        this.f26770M = str;
        this.f26771N = str2;
        this.f26772O = z;
    }
}
