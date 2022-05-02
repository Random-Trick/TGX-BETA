package p126j$.util.function;

public interface BiConsumer<T, U> {

    public final class VivifiedWrapper implements BiConsumer {
        final java.util.function.BiConsumer f18061a;

        private VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f18061a = biConsumer;
        }

        public static BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return new VivifiedWrapper(biConsumer);
        }

        @Override
        public void mo22180p(Object obj, Object obj2) {
            this.f18061a.accept(obj, obj2);
        }
    }

    void mo22180p(Object obj, Object obj2);
}
