package j$.util.function;

public interface ToLongFunction<T> {

    public final class VivifiedWrapper implements ToLongFunction {
        final java.util.function.ToLongFunction f14455a;

        private VivifiedWrapper(java.util.function.ToLongFunction toLongFunction) {
            this.f14455a = toLongFunction;
        }

        public static ToLongFunction convert(java.util.function.ToLongFunction toLongFunction) {
            if (toLongFunction == null) {
                return null;
            }
            return new VivifiedWrapper(toLongFunction);
        }

        @Override
        public final long g(Object obj) {
            return this.f14455a.applyAsLong(obj);
        }
    }

    long g(Object obj);
}
