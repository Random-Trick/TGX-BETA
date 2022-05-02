package qa;

import java.io.Serializable;
import p206oa.C7813b;
import p332xa.AbstractC10168a;
import p332xa.AbstractC10170c;

public abstract class AbstractC8288c implements AbstractC10168a, Serializable {
    public static final Object f26766P = C8289a.f26773a;
    public final String f26767M;
    public final String f26768N;
    public final boolean f26769O;
    public transient AbstractC10168a f26770a;
    public final Object f26771b;
    public final Class f26772c;

    public static class C8289a implements Serializable {
        public static final C8289a f26773a = new C8289a();
    }

    public AbstractC8288c() {
        this(f26766P);
    }

    public AbstractC10168a m12949f() {
        AbstractC10168a aVar = this.f26770a;
        if (aVar != null) {
            return aVar;
        }
        AbstractC10168a g = mo12924g();
        this.f26770a = g;
        return g;
    }

    public abstract AbstractC10168a mo12924g();

    public Object m12948h() {
        return this.f26771b;
    }

    public String m12947i() {
        return this.f26767M;
    }

    public AbstractC10170c m12946j() {
        Class cls = this.f26772c;
        if (cls == null) {
            return null;
        }
        return this.f26769O ? C8307t.m12919c(cls) : C8307t.m12920b(cls);
    }

    public AbstractC10168a m12945k() {
        AbstractC10168a f = m12949f();
        if (f != this) {
            return f;
        }
        throw new C7813b();
    }

    public String m12944l() {
        return this.f26768N;
    }

    public AbstractC8288c(Object obj) {
        this(obj, null, null, null, false);
    }

    public AbstractC8288c(Object obj, Class cls, String str, String str2, boolean z) {
        this.f26771b = obj;
        this.f26772c = cls;
        this.f26767M = str;
        this.f26768N = str2;
        this.f26769O = z;
    }
}
