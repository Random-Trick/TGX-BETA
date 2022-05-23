package j$.util.function;

public interface Function<T, R> {

    public final class VivifiedWrapper implements Function {
        final java.util.function.Function f14452a;

        private VivifiedWrapper(java.util.function.Function function) {
            this.f14452a = function;
        }

        public static Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return new VivifiedWrapper(function);
        }

        @Override
        public final Object a(Object obj) {
            return this.f14452a.apply(obj);
        }
    }

    Object a(Object obj);
}
