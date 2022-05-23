package z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

public abstract class a<T> implements Iterator<T>, j$.util.Iterator {
    public b f27003a = b.NOT_READY;
    @CheckForNull
    public T f27004b;

    public static class C0258a {
        public static final int[] f27005a;

        static {
            int[] iArr = new int[b.values().length];
            f27005a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27005a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @CheckForNull
    public abstract T a();

    @CanIgnoreReturnValue
    @CheckForNull
    public final T b() {
        this.f27003a = b.DONE;
        return null;
    }

    public final boolean c() {
        this.f27003a = b.FAILED;
        this.f27004b = a();
        if (this.f27003a == b.DONE) {
            return false;
        }
        this.f27003a = b.READY;
        return true;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override
    public void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final boolean hasNext() {
        j.n(this.f27003a != b.FAILED);
        int i10 = C0258a.f27005a[this.f27003a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    @Override
    public final T next() {
        if (hasNext()) {
            this.f27003a = b.NOT_READY;
            T t10 = (T) h.a(this.f27004b);
            this.f27004b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
