package a7;

import com.google.errorprone.annotations.DoNotCall;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

public abstract class s0<E> implements Iterator<E>, j$.util.Iterator {
    @Override
    public void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override
    public void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
