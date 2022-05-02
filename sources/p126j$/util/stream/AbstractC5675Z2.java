package p126j$.util.stream;

import java.util.Arrays;
import p126j$.util.AbstractC5468G;

abstract class AbstractC5675Z2 extends AbstractC5696e implements Iterable {
    Object f18282e = mo22334g(16);
    Object[] f18283f;

    public AbstractC5675Z2() {
    }

    public AbstractC5675Z2(int i) {
        super(i);
    }

    private void m22328z() {
        if (this.f18283f == null) {
            Object[] A = mo22336A(8);
            this.f18283f = A;
            this.f18343d = new long[8];
            A[0] = this.f18282e;
        }
    }

    protected abstract Object[] mo22336A(int i);

    public void m22335B() {
        if (this.f18341b == mo22332v(this.f18282e)) {
            m22328z();
            int i = this.f18342c;
            int i2 = i + 1;
            Object[] objArr = this.f18283f;
            if (i2 >= objArr.length || objArr[i + 1] == null) {
                m22329y(m22331w() + 1);
            }
            this.f18341b = 0;
            int i3 = this.f18342c + 1;
            this.f18342c = i3;
            this.f18282e = this.f18283f[i3];
        }
    }

    @Override
    public void clear() {
        Object[] objArr = this.f18283f;
        if (objArr != null) {
            this.f18282e = objArr[0];
            this.f18283f = null;
            this.f18343d = null;
        }
        this.f18341b = 0;
        this.f18342c = 0;
    }

    public abstract Object mo22334g(int i);

    public void mo22157i(Object obj, int i) {
        long j = i;
        long count = count() + j;
        if (count > mo22332v(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f18342c == 0) {
            System.arraycopy(this.f18282e, 0, obj, i, this.f18341b);
        } else {
            for (int i2 = 0; i2 < this.f18342c; i2++) {
                Object[] objArr = this.f18283f;
                System.arraycopy(objArr[i2], 0, obj, i, mo22332v(objArr[i2]));
                i += mo22332v(this.f18283f[i2]);
            }
            int i3 = this.f18341b;
            if (i3 > 0) {
                System.arraycopy(this.f18282e, 0, obj, i, i3);
            }
        }
    }

    public Object mo22156l() {
        long count = count();
        if (count < 2147483639) {
            Object g = mo22334g((int) count);
            mo22157i(g, 0);
            return g;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public void mo22155m(Object obj) {
        for (int i = 0; i < this.f18342c; i++) {
            Object[] objArr = this.f18283f;
            mo22333u(objArr[i], 0, mo22332v(objArr[i]), obj);
        }
        mo22333u(this.f18282e, 0, this.f18341b, obj);
    }

    public abstract AbstractC5468G mo42631spliterator();

    public abstract void mo22333u(Object obj, int i, int i2, Object obj2);

    public abstract int mo22332v(Object obj);

    protected long m22331w() {
        int i = this.f18342c;
        if (i == 0) {
            return mo22332v(this.f18282e);
        }
        return mo22332v(this.f18283f[i]) + this.f18343d[i];
    }

    public int m22330x(long j) {
        if (this.f18342c == 0) {
            if (j < this.f18341b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j < count()) {
            for (int i = 0; i <= this.f18342c; i++) {
                if (j < this.f18343d[i] + mo22332v(this.f18283f[i])) {
                    return i;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    public final void m22329y(long j) {
        int i;
        long w = m22331w();
        if (j > w) {
            m22328z();
            int i2 = this.f18342c;
            while (true) {
                i2++;
                if (j > w) {
                    Object[] objArr = this.f18283f;
                    if (i2 >= objArr.length) {
                        int length = objArr.length * 2;
                        this.f18283f = Arrays.copyOf(objArr, length);
                        this.f18343d = Arrays.copyOf(this.f18343d, length);
                    }
                    int r = m22281r(i2);
                    this.f18283f[i2] = mo22334g(r);
                    long[] jArr = this.f18343d;
                    jArr[i2] = jArr[i2 - 1] + mo22332v(this.f18283f[i]);
                    w += r;
                } else {
                    return;
                }
            }
        }
    }
}
