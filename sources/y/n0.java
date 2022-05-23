package y;

import java.util.Set;

public interface n0 {

    public static abstract class a<T> {
        public static <T> a<T> a(String str, Class<?> cls) {
            return b(str, cls, null);
        }

        public static <T> a<T> b(String str, Class<?> cls, Object obj) {
            return new y.b(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class<T> e();
    }

    public interface b {
        boolean a(a<?> aVar);
    }

    public enum c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    <ValueT> ValueT a(a<ValueT> aVar, ValueT valuet);

    Set<a<?>> b();

    <ValueT> ValueT c(a<ValueT> aVar);

    c d(a<?> aVar);

    boolean e(a<?> aVar);

    void g(String str, b bVar);

    Set<c> l(a<?> aVar);

    <ValueT> ValueT x(a<ValueT> aVar, c cVar);
}
