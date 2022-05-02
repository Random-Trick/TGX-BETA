package p126j$.util.function;

public interface ToIntFunction<T> {

    public final class VivifiedWrapper implements ToIntFunction {
        final java.util.function.ToIntFunction f18066a;

        private VivifiedWrapper(java.util.function.ToIntFunction toIntFunction) {
            this.f18066a = toIntFunction;
        }

        public static ToIntFunction convert(java.util.function.ToIntFunction toIntFunction) {
            if (toIntFunction == null) {
                return null;
            }
            return new VivifiedWrapper(toIntFunction);
        }

        @Override
        public int mo22326f(Object obj) {
            return this.f18066a.applyAsInt(obj);
        }
    }

    int mo22326f(Object obj);
}
