package p342y5;

import java.io.OutputStream;
import java.util.Map;
import p092g7.AbstractC4514e;
import p092g7.AbstractC4516g;

public final class C10397f {
    public final Map<Class<?>, AbstractC4514e<?>> f33464a;
    public final Map<Class<?>, AbstractC4516g<?>> f33465b;
    public final AbstractC4514e<Object> f33466c;

    public C10397f(Map<Class<?>, AbstractC4514e<?>> map, Map<Class<?>, AbstractC4516g<?>> map2, AbstractC4514e<Object> eVar) {
        this.f33464a = map;
        this.f33465b = map2;
        this.f33466c = eVar;
    }

    public final void m5170a(Object obj, OutputStream outputStream) {
        new C10391c(outputStream, this.f33464a, this.f33465b, this.f33466c).m5184i(obj);
    }
}
