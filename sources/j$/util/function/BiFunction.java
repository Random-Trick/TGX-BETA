package j$.util.function;

public interface BiFunction<T, U, R> {

    public final class VivifiedWrapper implements BiFunction {
        final java.util.function.BiFunction f14450a;

        private VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f14450a = biFunction;
        }

        public static BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return new VivifiedWrapper(biFunction);
        }

        @Override
        public final Object v(Object obj, Object obj2) {
            return this.f14450a.apply(obj, obj2);
        }
    }

    Object v(Object obj, Object obj2);
}
