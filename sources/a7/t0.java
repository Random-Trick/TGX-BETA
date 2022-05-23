package a7;

import com.google.errorprone.annotations.DoNotCall;
import java.util.ListIterator;

public abstract class t0<E> extends s0<E> implements ListIterator<E> {
    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(E e10) {
        throw new UnsupportedOperationException();
    }
}
