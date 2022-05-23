package z5;

import h7.g;
import i7.b;
import java.util.HashMap;
import java.util.Map;

public final class e implements b<e> {
    public static final h7.e<Object> f26971d = d.f26970a;
    public static final int f26972e = 0;
    public final Map<Class<?>, h7.e<?>> f26973a = new HashMap();
    public final Map<Class<?>, g<?>> f26974b = new HashMap();
    public final h7.e<Object> f26975c = f26971d;

    @Override
    public final e a(Class cls, h7.e eVar) {
        this.f26973a.put(cls, eVar);
        this.f26974b.remove(cls);
        return this;
    }

    public final f b() {
        return new f(new HashMap(this.f26973a), new HashMap(this.f26974b), this.f26975c);
    }
}
