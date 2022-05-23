package a7;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
import z6.j;

public abstract class b<T> extends s0<T> {
    public EnumC0014b f592a = EnumC0014b.NOT_READY;
    @CheckForNull
    public T f593b;

    public static class a {
        public static final int[] f594a;

        static {
            int[] iArr = new int[EnumC0014b.values().length];
            f594a = iArr;
            try {
                iArr[EnumC0014b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f594a[EnumC0014b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum EnumC0014b {
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
        this.f592a = EnumC0014b.DONE;
        return null;
    }

    public final boolean c() {
        this.f592a = EnumC0014b.FAILED;
        this.f593b = a();
        if (this.f592a == EnumC0014b.DONE) {
            return false;
        }
        this.f592a = EnumC0014b.READY;
        return true;
    }

    @Override
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        j.n(this.f592a != EnumC0014b.FAILED);
        int i10 = a.f594a[this.f592a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    @Override
    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f592a = EnumC0014b.NOT_READY;
            T t10 = (T) f0.a(this.f593b);
            this.f593b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
