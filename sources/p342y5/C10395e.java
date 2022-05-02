package p342y5;

import java.util.HashMap;
import java.util.Map;
import p092g7.AbstractC4514e;
import p092g7.AbstractC4516g;
import p104h7.AbstractC5021b;

public final class C10395e implements AbstractC5021b<C10395e> {
    public static final AbstractC4514e<Object> f33452d = C10393d.f33451a;
    public static final int f33453e = 0;
    public final Map<Class<?>, AbstractC4514e<?>> f33454a = new HashMap();
    public final Map<Class<?>, AbstractC4516g<?>> f33455b = new HashMap();
    public final AbstractC4514e<Object> f33456c = f33452d;

    @Override
    public final C10395e mo5172a(Class cls, AbstractC4514e eVar) {
        this.f33454a.put(cls, eVar);
        this.f33455b.remove(cls);
        return this;
    }

    public final C10397f m5171b() {
        return new C10397f(new HashMap(this.f33454a), new HashMap(this.f33455b), this.f33456c);
    }
}
