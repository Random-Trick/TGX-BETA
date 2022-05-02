package p123ia;

import java.util.Iterator;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p251ra.AbstractC8415a;

public abstract class AbstractC5286d0 implements Iterator<Integer>, AbstractC8415a, p126j$.util.Iterator {
    public abstract int mo6206e();

    @Override
    public void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override
    public void forEachRemaining(java.util.function.Consumer<? super Integer> consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public Object next() {
        return Integer.valueOf(mo6206e());
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
