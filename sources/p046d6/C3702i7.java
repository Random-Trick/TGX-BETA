package p046d6;

import java.util.Arrays;
import java.util.Objects;

public class C3702i7<E> extends C3813u7<E> {
    public Object[] f12589a = new Object[4];
    public int f12590b = 0;
    public boolean f12591c;

    public C3702i7(int i) {
    }

    public final C3702i7<E> m29824a(E e) {
        Objects.requireNonNull(e);
        m29823b(this.f12590b + 1);
        Object[] objArr = this.f12589a;
        int i = this.f12590b;
        this.f12590b = i + 1;
        objArr[i] = e;
        return this;
    }

    public final void m29823b(int i) {
        Object[] objArr = this.f12589a;
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
            this.f12589a = Arrays.copyOf(objArr, i2);
            this.f12591c = false;
        } else if (this.f12591c) {
            this.f12589a = (Object[]) objArr.clone();
            this.f12591c = false;
        }
    }
}
