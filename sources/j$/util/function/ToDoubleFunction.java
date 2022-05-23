package j$.util.function;

public interface ToDoubleFunction<T> {

    public final class VivifiedWrapper implements ToDoubleFunction {
        final java.util.function.ToDoubleFunction f14453a;

        private VivifiedWrapper(java.util.function.ToDoubleFunction toDoubleFunction) {
            this.f14453a = toDoubleFunction;
        }

        public static ToDoubleFunction convert(java.util.function.ToDoubleFunction toDoubleFunction) {
            if (toDoubleFunction == null) {
                return null;
            }
            return new VivifiedWrapper(toDoubleFunction);
        }

        @Override
        public final double w(Object obj) {
            return this.f14453a.applyAsDouble(obj);
        }
    }

    double w(Object obj);
}
