package c5;

import java.util.Arrays;

public final class h0<V> {
    public long[] f4823a;
    public V[] f4824b;
    public int f4825c;
    public int f4826d;

    public h0() {
        this(10);
    }

    public static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public final void b(long j10, V v10) {
        int i10 = this.f4825c;
        int i11 = this.f4826d;
        V[] vArr = this.f4824b;
        int length = (i10 + i11) % vArr.length;
        this.f4823a[length] = j10;
        vArr[length] = v10;
        this.f4826d = i11 + 1;
    }

    public synchronized void c() {
        this.f4825c = 0;
        this.f4826d = 0;
        Arrays.fill(this.f4824b, (Object) null);
    }

    public final void d(long j10) {
        int i10 = this.f4826d;
        if (i10 > 0) {
            if (j10 <= this.f4823a[((this.f4825c + i10) - 1) % this.f4824b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f4824b.length;
        if (this.f4826d >= length) {
            int i10 = length * 2;
            long[] jArr = new long[i10];
            V[] vArr = (V[]) f(i10);
            int i11 = this.f4825c;
            int i12 = length - i11;
            System.arraycopy(this.f4823a, i11, jArr, 0, i12);
            System.arraycopy(this.f4824b, this.f4825c, vArr, 0, i12);
            int i13 = this.f4825c;
            if (i13 > 0) {
                System.arraycopy(this.f4823a, 0, jArr, i12, i13);
                System.arraycopy(this.f4824b, 0, vArr, i12, this.f4825c);
            }
            this.f4823a = jArr;
            this.f4824b = vArr;
            this.f4825c = 0;
        }
    }

    public synchronized V g(long j10) {
        return h(j10, false);
    }

    public final V h(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f4826d > 0) {
            long j12 = j10 - this.f4823a[this.f4825c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v10 = k();
            j11 = j12;
        }
        return v10;
    }

    public synchronized V i() {
        return this.f4826d == 0 ? null : k();
    }

    public synchronized V j(long j10) {
        return h(j10, true);
    }

    public final V k() {
        a.f(this.f4826d > 0);
        V[] vArr = this.f4824b;
        int i10 = this.f4825c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f4825c = (i10 + 1) % vArr.length;
        this.f4826d--;
        return v10;
    }

    public synchronized int l() {
        return this.f4826d;
    }

    public h0(int i10) {
        this.f4823a = new long[i10];
        this.f4824b = (V[]) f(i10);
    }
}
