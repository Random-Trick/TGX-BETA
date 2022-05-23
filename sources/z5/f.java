package z5;

import h7.e;
import h7.g;
import java.io.OutputStream;
import java.util.Map;

public final class f {
    public final Map<Class<?>, e<?>> f26979a;
    public final Map<Class<?>, g<?>> f26980b;
    public final e<Object> f26981c;

    public f(Map<Class<?>, e<?>> map, Map<Class<?>, g<?>> map2, e<Object> eVar) {
        this.f26979a = map;
        this.f26980b = map2;
        this.f26981c = eVar;
    }

    public final void a(Object obj, OutputStream outputStream) {
        new c(outputStream, this.f26979a, this.f26980b, this.f26981c).i(obj);
    }
}
