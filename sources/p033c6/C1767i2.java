package p033c6;

import java.util.HashMap;
import java.util.Map;
import p092g7.AbstractC4514e;
import p092g7.AbstractC4516g;
import p104h7.AbstractC5021b;

public final class C1767i2 implements AbstractC5021b<C1767i2> {
    public static final AbstractC4514e<Object> f6356d = C1752h2.f6316a;
    public static final int f6357e = 0;
    public final Map<Class<?>, AbstractC4514e<?>> f6358a = new HashMap();
    public final Map<Class<?>, AbstractC4516g<?>> f6359b = new HashMap();
    public final AbstractC4514e<Object> f6360c = f6356d;

    @Override
    public final C1767i2 mo5172a(Class cls, AbstractC4514e eVar) {
        this.f6358a.put(cls, eVar);
        this.f6359b.remove(cls);
        return this;
    }

    public final C1782j2 m35993b() {
        return new C1782j2(new HashMap(this.f6358a), new HashMap(this.f6359b), this.f6360c);
    }
}
