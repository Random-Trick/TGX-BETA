package p126j$.util;

import java.util.Comparator;
import p126j$.util.function.Consumer;

public interface AbstractC5468G {
    boolean mo22125a(Consumer consumer);

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    AbstractC5468G trySplit();
}
