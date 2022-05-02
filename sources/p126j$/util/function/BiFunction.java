package p126j$.util.function;

public interface BiFunction<T, U, R> {

    public final class VivifiedWrapper implements BiFunction {
        final java.util.function.BiFunction f18062a;

        private VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f18062a = biFunction;
        }

        public static BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return new VivifiedWrapper(biFunction);
        }

        @Override
        public Object mo22172u(Object obj, Object obj2) {
            return this.f18062a.apply(obj, obj2);
        }
    }

    Object mo22172u(Object obj, Object obj2);
}
