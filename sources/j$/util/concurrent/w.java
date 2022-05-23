package j$.util.concurrent;

import j$.util.Map;
import j$.util.function.BiConsumer;

public interface w extends Map {
    @Override
    void forEach(BiConsumer biConsumer);
}
