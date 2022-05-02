package p126j$.util.concurrent;

class C5514y extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new ThreadLocalRandom(null);
    }
}
