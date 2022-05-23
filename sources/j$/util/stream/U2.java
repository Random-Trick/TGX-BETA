package j$.util.stream;

import j$.util.W;
import j$.util.function.AbstractC0278f;
import j$.util.function.Consumer;
import j$.util.z;
import java.util.Arrays;
import java.util.Iterator;

public class U2 extends AbstractC0295a3 implements AbstractC0278f {
    public U2() {
    }

    public U2(int i10) {
        super(i10);
    }

    @Override
    public final void A(Object obj, int i10, int i11, Object obj2) {
        double[] dArr = (double[]) obj;
        AbstractC0278f fVar = (AbstractC0278f) obj2;
        while (i10 < i11) {
            fVar.c(dArr[i10]);
            i10++;
        }
    }

    @Override
    public final int B(Object obj) {
        return ((double[]) obj).length;
    }

    @Override
    protected final Object[] G() {
        return new double[8];
    }

    public z mo33spliterator() {
        return new T2(this, 0, this.f14734c, 0, this.f14733b);
    }

    public final void a(Consumer consumer) {
        if (consumer instanceof AbstractC0278f) {
            n((AbstractC0278f) consumer);
        } else if (!R3.f14615a) {
            mo33spliterator().forEachRemaining(consumer);
        } else {
            R3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    @Override
    public void c(double d10) {
        H();
        int i10 = this.f14733b;
        this.f14733b = i10 + 1;
        ((double[]) this.f14697e)[i10] = d10;
    }

    @Override
    public final Object g(int i10) {
        return new double[i10];
    }

    @Override
    public final Iterator iterator() {
        return W.f(mo33spliterator());
    }

    public final String toString() {
        double[] dArr = (double[]) m();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f14734c), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f14734c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
