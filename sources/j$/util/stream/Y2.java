package j$.util.stream;

import j$.util.D;
import j$.util.W;
import j$.util.function.Consumer;
import j$.util.function.v;
import java.util.Arrays;
import java.util.Iterator;

public class Y2 extends AbstractC0295a3 implements v {
    public Y2() {
    }

    public Y2(int i10) {
        super(i10);
    }

    @Override
    public final void A(Object obj, int i10, int i11, Object obj2) {
        long[] jArr = (long[]) obj;
        v vVar = (v) obj2;
        while (i10 < i11) {
            vVar.e(jArr[i10]);
            i10++;
        }
    }

    @Override
    public final int B(Object obj) {
        return ((long[]) obj).length;
    }

    @Override
    protected final Object[] G() {
        return new long[8];
    }

    public D mo33spliterator() {
        return new X2(this, 0, this.f14734c, 0, this.f14733b);
    }

    public final void a(Consumer consumer) {
        if (consumer instanceof v) {
            n((v) consumer);
        } else if (!R3.f14615a) {
            mo33spliterator().forEachRemaining(consumer);
        } else {
            R3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        }
    }

    @Override
    public void e(long j10) {
        H();
        int i10 = this.f14733b;
        this.f14733b = i10 + 1;
        ((long[]) this.f14697e)[i10] = j10;
    }

    @Override
    public final Object g(int i10) {
        return new long[i10];
    }

    @Override
    public final Iterator iterator() {
        return W.h(mo33spliterator());
    }

    public final String toString() {
        long[] jArr = (long[]) m();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f14734c), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f14734c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
