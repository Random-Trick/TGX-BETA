package p126j$.util.function;

public interface ToLongFunction<T> {

    public final class VivifiedWrapper implements ToLongFunction {
        final java.util.function.ToLongFunction f18067a;

        private VivifiedWrapper(java.util.function.ToLongFunction toLongFunction) {
            this.f18067a = toLongFunction;
        }

        public static ToLongFunction convert(java.util.function.ToLongFunction toLongFunction) {
            if (toLongFunction == null) {
                return null;
            }
            return new VivifiedWrapper(toLongFunction);
        }

        @Override
        public long mo22232g(Object obj) {
            return this.f18067a.applyAsLong(obj);
        }
    }

    long mo22232g(Object obj);
}
