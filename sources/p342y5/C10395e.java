package p342y5;

import java.util.HashMap;
import java.util.Map;
import p092g7.AbstractC4514e;
import p092g7.AbstractC4516g;
import p104h7.AbstractC5021b;

public final class C10395e implements AbstractC5021b<C10395e> {
    public static final AbstractC4514e<Object> f33455d = C10393d.f33454a;
    public static final int f33456e = 0;
    public final Map<Class<?>, AbstractC4514e<?>> f33457a = new HashMap();
    public final Map<Class<?>, AbstractC4516g<?>> f33458b = new HashMap();
    public final AbstractC4514e<Object> f33459c = f33455d;

    @Override
    public final C10395e mo5172a(Class cls, AbstractC4514e eVar) {
        this.f33457a.put(cls, eVar);
        this.f33458b.remove(cls);
        return this;
    }

    public final C10397f m5171b() {
        return new C10397f(new HashMap(this.f33457a), new HashMap(this.f33458b), this.f33459c);
    }
}
