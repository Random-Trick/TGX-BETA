package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;

public interface H {
    boolean a(Consumer consumer);

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i10);

    H trySplit();
}
