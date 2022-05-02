package p126j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p126j$.util.AbstractC5464C;
import p126j$.util.AbstractC5482V;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.Consumer;

public class C5667X2 extends AbstractC5675Z2 implements AbstractC5535q {
    public C5667X2() {
    }

    public C5667X2(int i) {
        super(i);
    }

    @Override
    protected Object[] mo22336A(int i) {
        return new long[i];
    }

    public AbstractC5464C mo42631spliterator() {
        return new C5663W2(this, 0, this.f18342c, 0, this.f18341b);
    }

    public void m22351a(Consumer consumer) {
        if (consumer instanceof AbstractC5535q) {
            mo22155m((AbstractC5535q) consumer);
        } else if (!AbstractC5640Q3.f18220a) {
            mo42631spliterator().forEachRemaining(consumer);
        } else {
            AbstractC5640Q3.m22369a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        }
    }

    @Override
    public void mo22127e(long j) {
        m22335B();
        int i = this.f18341b;
        this.f18341b = i + 1;
        ((long[]) this.f18282e)[i] = j;
    }

    @Override
    public Object mo22334g(int i) {
        return new long[i];
    }

    @Override
    public Iterator iterator() {
        return AbstractC5482V.m22592h(mo42631spliterator());
    }

    public String toString() {
        long[] jArr = (long[]) mo22156l();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f18342c), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f18342c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    @Override
    public void mo22333u(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        AbstractC5535q qVar = (AbstractC5535q) obj2;
        while (i < i2) {
            qVar.mo22127e(jArr[i]);
            i++;
        }
    }

    @Override
    public int mo22332v(Object obj) {
        return ((long[]) obj).length;
    }
}
