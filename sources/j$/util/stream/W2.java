package j$.util.stream;

import j$.util.B;
import j$.util.W;
import j$.util.function.Consumer;
import j$.util.function.n;
import java.util.Arrays;
import java.util.Iterator;

public class W2 extends AbstractC0295a3 implements n {
    public W2() {
    }

    public W2(int i10) {
        super(i10);
    }

    @Override
    public final void A(Object obj, int i10, int i11, Object obj2) {
        int[] iArr = (int[]) obj;
        n nVar = (n) obj2;
        while (i10 < i11) {
            nVar.d(iArr[i10]);
            i10++;
        }
    }

    @Override
    public final int B(Object obj) {
        return ((int[]) obj).length;
    }

    @Override
    protected final Object[] G() {
        return new int[8];
    }

    public B mo33spliterator() {
        return new V2(this, 0, this.f14734c, 0, this.f14733b);
    }

    public final void a(Consumer consumer) {
        if (consumer instanceof n) {
            n((n) consumer);
        } else if (!R3.f14615a) {
            mo33spliterator().forEachRemaining(consumer);
        } else {
            R3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        }
    }

    @Override
    public void d(int i10) {
        H();
        int i11 = this.f14733b;
        this.f14733b = i11 + 1;
        ((int[]) this.f14697e)[i11] = i10;
    }

    @Override
    public final Object g(int i10) {
        return new int[i10];
    }

    @Override
    public final Iterator iterator() {
        return W.g(mo33spliterator());
    }

    public final String toString() {
        int[] iArr = (int[]) m();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f14734c), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f14734c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
