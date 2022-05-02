package p343y6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

public abstract class AbstractC10419a<T> implements Iterator<T>, p126j$.util.Iterator {
    public EnumC10421b f33485a = EnumC10421b.NOT_READY;
    @NullableDecl
    public T f33486b;

    public static class C10420a {
        public static final int[] f33487a;

        static {
            int[] iArr = new int[EnumC10421b.values().length];
            f33487a = iArr;
            try {
                iArr[EnumC10421b.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33487a[EnumC10421b.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum EnumC10421b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T mo5110a();

    @CanIgnoreReturnValue
    @NullableDecl
    public final T m5153b() {
        this.f33485a = EnumC10421b.DONE;
        return null;
    }

    public final boolean m5152c() {
        this.f33485a = EnumC10421b.FAILED;
        this.f33486b = mo5110a();
        if (this.f33485a == EnumC10421b.DONE) {
            return false;
        }
        this.f33485a = EnumC10421b.READY;
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
        C10433i.m5124n(this.f33485a != EnumC10421b.FAILED);
        int i = C10420a.f33487a[this.f33485a.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return m5152c();
        }
        return false;
    }

    @Override
    public final T next() {
        if (hasNext()) {
            this.f33485a = EnumC10421b.NOT_READY;
            T t = this.f33486b;
            this.f33486b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
