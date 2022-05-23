package d6;

import h7.e;
import h7.g;
import i7.b;
import java.util.HashMap;
import java.util.Map;

public final class i2 implements b<i2> {
    public static final e<Object> f6560d = h2.f6531a;
    public static final int f6561e = 0;
    public final Map<Class<?>, e<?>> f6562a = new HashMap();
    public final Map<Class<?>, g<?>> f6563b = new HashMap();
    public final e<Object> f6564c = f6560d;

    @Override
    public final i2 a(Class cls, e eVar) {
        this.f6562a.put(cls, eVar);
        this.f6563b.remove(cls);
        return this;
    }

    public final j2 b() {
        return new j2(new HashMap(this.f6562a), new HashMap(this.f6563b), this.f6564c);
    }
}
