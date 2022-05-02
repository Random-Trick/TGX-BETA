package p342y5;

import java.io.OutputStream;
import java.util.Map;
import p092g7.AbstractC4514e;
import p092g7.AbstractC4516g;

public final class C10397f {
    public final Map<Class<?>, AbstractC4514e<?>> f33461a;
    public final Map<Class<?>, AbstractC4516g<?>> f33462b;
    public final AbstractC4514e<Object> f33463c;

    public C10397f(Map<Class<?>, AbstractC4514e<?>> map, Map<Class<?>, AbstractC4516g<?>> map2, AbstractC4514e<Object> eVar) {
        this.f33461a = map;
        this.f33462b = map2;
        this.f33463c = eVar;
    }

    public final void m5170a(Object obj, OutputStream outputStream) {
        new C10391c(outputStream, this.f33461a, this.f33462b, this.f33463c).m5184i(obj);
    }
}
