package e6;

import h7.e;
import h7.g;
import i7.b;
import java.util.HashMap;
import java.util.Map;

public final class c implements b<c> {
    public static final e<Object> f10662d = b.f10642a;
    public static final int f10663e = 0;
    public final Map<Class<?>, e<?>> f10664a = new HashMap();
    public final Map<Class<?>, g<?>> f10665b = new HashMap();
    public final e<Object> f10666c = f10662d;

    @Override
    public final c a(Class cls, e eVar) {
        this.f10664a.put(cls, eVar);
        this.f10665b.remove(cls);
        return this;
    }

    public final d b() {
        return new d(new HashMap(this.f10664a), new HashMap(this.f10665b), this.f10666c);
    }
}
