package p126j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p126j$.util.AbstractC5482V;
import p126j$.util.AbstractC5811y;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.Consumer;

public class C5651T2 extends AbstractC5675Z2 implements AbstractC5525g {
    public C5651T2() {
    }

    public C5651T2(int i) {
        super(i);
    }

    @Override
    protected Object[] mo22336A(int i) {
        return new double[i];
    }

    public AbstractC5811y mo42631spliterator() {
        return new C5647S2(this, 0, this.f18342c, 0, this.f18341b);
    }

    public void m22365a(Consumer consumer) {
        if (consumer instanceof AbstractC5525g) {
            mo22155m((AbstractC5525g) consumer);
        } else if (!AbstractC5640Q3.f18220a) {
            mo42631spliterator().forEachRemaining(consumer);
        } else {
            AbstractC5640Q3.m22369a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    @Override
    public void mo22150c(double d) {
        m22335B();
        int i = this.f18341b;
        this.f18341b = i + 1;
        ((double[]) this.f18282e)[i] = d;
    }

    @Override
    public Object mo22334g(int i) {
        return new double[i];
    }

    @Override
    public Iterator iterator() {
        return AbstractC5482V.m22594f(mo42631spliterator());
    }

    public String toString() {
        double[] dArr = (double[]) mo22156l();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f18342c), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f18342c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    @Override
    public void mo22333u(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        AbstractC5525g gVar = (AbstractC5525g) obj2;
        while (i < i2) {
            gVar.mo22150c(dArr[i]);
            i++;
        }
    }

    @Override
    public int mo22332v(Object obj) {
        return ((double[]) obj).length;
    }
}
