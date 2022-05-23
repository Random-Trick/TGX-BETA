package d6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class x0<E> extends y0<E> {
    public Object[] f7100a = new Object[4];
    public int f7101b = 0;
    public boolean f7102c;

    public x0(int i10) {
    }

    public final x0<E> b(E e10) {
        Objects.requireNonNull(e10);
        d(this.f7101b + 1);
        Object[] objArr = this.f7100a;
        int i10 = this.f7101b;
        this.f7101b = i10 + 1;
        objArr[i10] = e10;
        return this;
    }

    public final y0<E> c(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            d(this.f7101b + iterable.size());
            if (iterable instanceof z0) {
                this.f7101b = ((z0) iterable).f(this.f7100a, this.f7101b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public final void d(int i10) {
        Object[] objArr = this.f7100a;
        int length = objArr.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = Integer.MAX_VALUE;
            }
            this.f7100a = Arrays.copyOf(objArr, i11);
            this.f7102c = false;
        } else if (this.f7102c) {
            this.f7100a = (Object[]) objArr.clone();
            this.f7102c = false;
        }
    }
}
