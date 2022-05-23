package j$.util.concurrent;

final class z extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        return new ThreadLocalRandom();
    }
}
