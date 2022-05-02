package p126j$.util.stream;

import java.util.Arrays;
import p126j$.util.AbstractC5468G;

abstract class AbstractC5675Z2 extends AbstractC5696e implements Iterable {
    Object f18282e = mo22335g(16);
    Object[] f18283f;

    public AbstractC5675Z2() {
    }

    public AbstractC5675Z2(int i) {
        super(i);
    }

    private void m22329z() {
        if (this.f18283f == null) {
            Object[] A = mo22337A(8);
            this.f18283f = A;
            this.f18343d = new long[8];
            A[0] = this.f18282e;
        }
    }

    protected abstract Object[] mo22337A(int i);

    public void m22336B() {
        if (this.f18341b == mo22333v(this.f18282e)) {
            m22329z();
            int i = this.f18342c;
            int i2 = i + 1;
            Object[] objArr = this.f18283f;
            if (i2 >= objArr.length || objArr[i + 1] == null) {
                m22330y(m22332w() + 1);
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

    public abstract Object mo22335g(int i);

    public void mo22158i(Object obj, int i) {
        long j = i;
        long count = count() + j;
        if (count > mo22333v(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f18342c == 0) {
            System.arraycopy(this.f18282e, 0, obj, i, this.f18341b);
        } else {
            for (int i2 = 0; i2 < this.f18342c; i2++) {
                Object[] objArr = this.f18283f;
                System.arraycopy(objArr[i2], 0, obj, i, mo22333v(objArr[i2]));
                i += mo22333v(this.f18283f[i2]);
            }
            int i3 = this.f18341b;
            if (i3 > 0) {
                System.arraycopy(this.f18282e, 0, obj, i, i3);
            }
        }
    }

    public Object mo22157l() {
        long count = count();
        if (count < 2147483639) {
            Object g = mo22335g((int) count);
            mo22158i(g, 0);
            return g;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public void mo22156m(Object obj) {
        for (int i = 0; i < this.f18342c; i++) {
            Object[] objArr = this.f18283f;
            mo22334u(objArr[i], 0, mo22333v(objArr[i]), obj);
        }
        mo22334u(this.f18282e, 0, this.f18341b, obj);
    }

    public abstract AbstractC5468G mo42634spliterator();

    public abstract void mo22334u(Object obj, int i, int i2, Object obj2);

    public abstract int mo22333v(Object obj);

    protected long m22332w() {
        int i = this.f18342c;
        if (i == 0) {
            return mo22333v(this.f18282e);
        }
        return mo22333v(this.f18283f[i]) + this.f18343d[i];
    }

    public int m22331x(long j) {
        if (this.f18342c == 0) {
            if (j < this.f18341b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j < count()) {
            for (int i = 0; i <= this.f18342c; i++) {
                if (j < this.f18343d[i] + mo22333v(this.f18283f[i])) {
                    return i;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    public final void m22330y(long j) {
        int i;
        long w = m22332w();
        if (j > w) {
            m22329z();
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
                    int r = m22282r(i2);
                    this.f18283f[i2] = mo22335g(r);
                    long[] jArr = this.f18343d;
                    jArr[i2] = jArr[i2 - 1] + mo22333v(this.f18283f[i]);
                    w += r;
                } else {
                    return;
                }
            }
        }
    }
}
