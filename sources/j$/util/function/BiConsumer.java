package j$.util.function;

public interface BiConsumer<T, U> {

    public final class VivifiedWrapper implements BiConsumer {
        final java.util.function.BiConsumer f14449a;

        private VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f14449a = biConsumer;
        }

        public static BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return new VivifiedWrapper(biConsumer);
        }

        @Override
        public final void q(Object obj, Object obj2) {
            this.f14449a.accept(obj, obj2);
        }
    }

    void q(Object obj, Object obj2);
}
