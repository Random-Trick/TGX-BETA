package j$.util.function;

public interface Consumer<T> {

    public final class VivifiedWrapper implements Consumer {
        final java.util.function.Consumer f14451a;

        private VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f14451a = consumer;
        }

        public static Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return new VivifiedWrapper(consumer);
        }

        @Override
        public final void l(Object obj) {
            this.f14451a.accept(obj);
        }
    }

    void l(Object obj);
}
