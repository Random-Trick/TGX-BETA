package e6;

import java.util.Arrays;
import java.util.Objects;

public class i7<E> extends u7<E> {
    public Object[] f10850a = new Object[4];
    public int f10851b = 0;
    public boolean f10852c;

    public i7(int i10) {
    }

    public final i7<E> a(E e10) {
        Objects.requireNonNull(e10);
        b(this.f10851b + 1);
        Object[] objArr = this.f10850a;
        int i10 = this.f10851b;
        this.f10851b = i10 + 1;
        objArr[i10] = e10;
        return this;
    }

    public final void b(int i10) {
        Object[] objArr = this.f10850a;
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
            this.f10850a = Arrays.copyOf(objArr, i11);
            this.f10852c = false;
        } else if (this.f10852c) {
            this.f10850a = (Object[]) objArr.clone();
            this.f10852c = false;
        }
    }
}
