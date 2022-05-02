package p126j$.util.function;

public interface Consumer<T> {

    public final class VivifiedWrapper implements Consumer {
        final java.util.function.Consumer f18063a;

        private VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f18063a = consumer;
        }

        public static Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return new VivifiedWrapper(consumer);
        }

        @Override
        public void mo22129k(Object obj) {
            this.f18063a.accept(obj);
        }
    }

    void mo22129k(Object obj);
}
