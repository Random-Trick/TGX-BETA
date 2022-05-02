package p126j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p126j$.util.AbstractC5462A;
import p126j$.util.AbstractC5482V;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.Consumer;

public class C5659V2 extends AbstractC5675Z2 implements AbstractC5530l {
    public C5659V2() {
    }

    public C5659V2(int i) {
        super(i);
    }

    @Override
    protected Object[] mo22336A(int i) {
        return new int[i];
    }

    public AbstractC5462A mo42631spliterator() {
        return new C5655U2(this, 0, this.f18342c, 0, this.f18341b);
    }

    public void m22361a(Consumer consumer) {
        if (consumer instanceof AbstractC5530l) {
            mo22155m((AbstractC5530l) consumer);
        } else if (!AbstractC5640Q3.f18220a) {
            mo42631spliterator().forEachRemaining(consumer);
        } else {
            AbstractC5640Q3.m22369a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        }
    }

    @Override
    public void mo22144d(int i) {
        m22335B();
        int i2 = this.f18341b;
        this.f18341b = i2 + 1;
        ((int[]) this.f18282e)[i2] = i;
    }

    @Override
    public Object mo22334g(int i) {
        return new int[i];
    }

    @Override
    public Iterator iterator() {
        return AbstractC5482V.m22593g(mo42631spliterator());
    }

    public String toString() {
        int[] iArr = (int[]) mo22156l();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f18342c), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f18342c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override
    public void mo22333u(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        AbstractC5530l lVar = (AbstractC5530l) obj2;
        while (i < i2) {
            lVar.mo22144d(iArr[i]);
            i++;
        }
    }

    @Override
    public int mo22332v(Object obj) {
        return ((int[]) obj).length;
    }
}
