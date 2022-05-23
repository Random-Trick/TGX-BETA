package c5;

import java.util.Arrays;

public final class t {
    public int f4893a;
    public long[] f4894b;

    public t() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f4893a;
        long[] jArr = this.f4894b;
        if (i10 == jArr.length) {
            this.f4894b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f4894b;
        int i11 = this.f4893a;
        this.f4893a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f4893a) {
            return this.f4894b[i10];
        }
        int i11 = this.f4893a;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Invalid index ");
        sb2.append(i10);
        sb2.append(", size is ");
        sb2.append(i11);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public int c() {
        return this.f4893a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f4894b, this.f4893a);
    }

    public t(int i10) {
        this.f4894b = new long[i10];
    }
}
