package j$.util;

public interface F extends H {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override
    F trySplit();
}
