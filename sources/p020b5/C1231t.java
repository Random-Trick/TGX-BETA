package p020b5;

import java.util.Arrays;

public final class C1231t {
    public int f4563a;
    public long[] f4564b;

    public C1231t() {
        this(32);
    }

    public void m37879a(long j) {
        int i = this.f4563a;
        long[] jArr = this.f4564b;
        if (i == jArr.length) {
            this.f4564b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f4564b;
        int i2 = this.f4563a;
        this.f4563a = i2 + 1;
        jArr2[i2] = j;
    }

    public long m37878b(int i) {
        if (i >= 0 && i < this.f4563a) {
            return this.f4564b[i];
        }
        int i2 = this.f4563a;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Invalid index ");
        sb2.append(i);
        sb2.append(", size is ");
        sb2.append(i2);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public int m37877c() {
        return this.f4563a;
    }

    public long[] m37876d() {
        return Arrays.copyOf(this.f4564b, this.f4563a);
    }

    public C1231t(int i) {
        this.f4564b = new long[i];
    }
}
