package p033c6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class C1978x0<E> extends AbstractC1992y0<E> {
    public Object[] f7064a = new Object[4];
    public int f7065b = 0;
    public boolean f7066c;

    public C1978x0(int i) {
    }

    public final C1978x0<E> m35838b(E e) {
        Objects.requireNonNull(e);
        m35836d(this.f7065b + 1);
        Object[] objArr = this.f7064a;
        int i = this.f7065b;
        this.f7065b = i + 1;
        objArr[i] = e;
        return this;
    }

    public final AbstractC1992y0<E> m35837c(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            m35836d(this.f7065b + iterable.size());
            if (iterable instanceof AbstractC2006z0) {
                this.f7065b = ((AbstractC2006z0) iterable).mo35829h(this.f7064a, this.f7065b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo35835a(it.next());
        }
        return this;
    }

    public final void m35836d(int i) {
        Object[] objArr = this.f7064a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f7064a = Arrays.copyOf(objArr, i2);
            this.f7066c = false;
        } else if (this.f7066c) {
            this.f7064a = (Object[]) objArr.clone();
            this.f7066c = false;
        }
    }
}
