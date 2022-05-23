package j$.util.function;

public interface ToIntFunction<T> {

    public final class VivifiedWrapper implements ToIntFunction {
        final java.util.function.ToIntFunction f14454a;

        private VivifiedWrapper(java.util.function.ToIntFunction toIntFunction) {
            this.f14454a = toIntFunction;
        }

        public static ToIntFunction convert(java.util.function.ToIntFunction toIntFunction) {
            if (toIntFunction == null) {
                return null;
            }
            return new VivifiedWrapper(toIntFunction);
        }

        @Override
        public final int f(Object obj) {
            return this.f14454a.applyAsInt(obj);
        }
    }

    int f(Object obj);
}
