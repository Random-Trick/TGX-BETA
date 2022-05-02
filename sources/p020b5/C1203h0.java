package p020b5;

import java.util.Arrays;

public final class C1203h0<V> {
    public long[] f4502a;
    public V[] f4503b;
    public int f4504c;
    public int f4505d;

    public C1203h0() {
        this(10);
    }

    public static <V> V[] m38064f(int i) {
        return (V[]) new Object[i];
    }

    public synchronized void m38069a(long j, V v) {
        m38066d(j);
        m38065e();
        m38068b(j, v);
    }

    public final void m38068b(long j, V v) {
        int i = this.f4504c;
        int i2 = this.f4505d;
        V[] vArr = this.f4503b;
        int length = (i + i2) % vArr.length;
        this.f4502a[length] = j;
        vArr[length] = v;
        this.f4505d = i2 + 1;
    }

    public synchronized void m38067c() {
        this.f4504c = 0;
        this.f4505d = 0;
        Arrays.fill(this.f4503b, (Object) null);
    }

    public final void m38066d(long j) {
        int i = this.f4505d;
        if (i > 0) {
            if (j <= this.f4502a[((this.f4504c + i) - 1) % this.f4503b.length]) {
                m38067c();
            }
        }
    }

    public final void m38065e() {
        int length = this.f4503b.length;
        if (this.f4505d >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] vArr = (V[]) m38064f(i);
            int i2 = this.f4504c;
            int i3 = length - i2;
            System.arraycopy(this.f4502a, i2, jArr, 0, i3);
            System.arraycopy(this.f4503b, this.f4504c, vArr, 0, i3);
            int i4 = this.f4504c;
            if (i4 > 0) {
                System.arraycopy(this.f4502a, 0, jArr, i3, i4);
                System.arraycopy(this.f4503b, 0, vArr, i3, this.f4504c);
            }
            this.f4502a = jArr;
            this.f4503b = vArr;
            this.f4504c = 0;
        }
    }

    public synchronized V m38063g(long j) {
        return m38062h(j, false);
    }

    public final V m38062h(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.f4505d > 0) {
            long j3 = j - this.f4502a[this.f4504c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = m38059k();
            j2 = j3;
        }
        return v;
    }

    public synchronized V m38061i() {
        return this.f4505d == 0 ? null : m38059k();
    }

    public synchronized V m38060j(long j) {
        return m38062h(j, true);
    }

    public final V m38059k() {
        C1186a.m38184f(this.f4505d > 0);
        V[] vArr = this.f4503b;
        int i = this.f4504c;
        V v = vArr[i];
        vArr[i] = null;
        this.f4504c = (i + 1) % vArr.length;
        this.f4505d--;
        return v;
    }

    public synchronized int m38058l() {
        return this.f4505d;
    }

    public C1203h0(int i) {
        this.f4502a = new long[i];
        this.f4503b = (V[]) m38064f(i);
    }
}
