package p336y;

import java.util.Set;

public interface AbstractC10268n0 {

    public static abstract class AbstractC10269a<T> {
        public static <T> AbstractC10269a<T> m5582a(String str, Class<?> cls) {
            return m5581b(str, cls, null);
        }

        public static <T> AbstractC10269a<T> m5581b(String str, Class<?> cls, Object obj) {
            return new C10197b(str, cls, obj);
        }

        public abstract String mo5580c();

        public abstract Object mo5579d();

        public abstract Class<T> mo5578e();
    }

    public interface AbstractC10270b {
        boolean mo5577a(AbstractC10269a<?> aVar);
    }

    public enum EnumC10271c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    <ValueT> ValueT mo5426a(AbstractC10269a<ValueT> aVar, ValueT valuet);

    Set<AbstractC10269a<?>> mo5425b();

    <ValueT> ValueT mo5424c(AbstractC10269a<ValueT> aVar);

    EnumC10271c mo5423d(AbstractC10269a<?> aVar);

    boolean mo5422e(AbstractC10269a<?> aVar);

    void mo5439g(String str, AbstractC10270b bVar);

    Set<EnumC10271c> mo5436l(AbstractC10269a<?> aVar);

    <ValueT> ValueT mo5427x(AbstractC10269a<ValueT> aVar, EnumC10271c cVar);
}
