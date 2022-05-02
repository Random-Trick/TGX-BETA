package p126j$.util.function;

public interface Function<T, R> {

    public final class VivifiedWrapper implements Function {
        final java.util.function.Function f18064a;

        private VivifiedWrapper(java.util.function.Function function) {
            this.f18064a = function;
        }

        public static Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return new VivifiedWrapper(function);
        }

        @Override
        public Object mo22503a(Object obj) {
            return this.f18064a.apply(obj);
        }
    }

    Object mo22503a(Object obj);
}
