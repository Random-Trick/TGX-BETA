package p126j$.util.function;

public interface ToDoubleFunction<T> {

    public final class VivifiedWrapper implements ToDoubleFunction {
        final java.util.function.ToDoubleFunction f18065a;

        private VivifiedWrapper(java.util.function.ToDoubleFunction toDoubleFunction) {
            this.f18065a = toDoubleFunction;
        }

        public static ToDoubleFunction convert(java.util.function.ToDoubleFunction toDoubleFunction) {
            if (toDoubleFunction == null) {
                return null;
            }
            return new VivifiedWrapper(toDoubleFunction);
        }

        @Override
        public double mo22325v(Object obj) {
            return this.f18065a.applyAsDouble(obj);
        }
    }

    double mo22325v(Object obj);
}
