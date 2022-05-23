package j$.util.stream;

import java.util.Arrays;

public final class C0353m1 extends C0348l1 implements G0 {
    public C0353m1(long j10) {
        super(j10);
    }

    @Override
    public final M0 mo32b() {
        if (this.f14806b >= this.f14805a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f14806b), Integer.valueOf(this.f14805a.length)));
    }

    @Override
    public final void c(double d10) {
        E0.i();
        throw null;
    }

    @Override
    public final void d(int i10) {
        int i11 = this.f14806b;
        int[] iArr = this.f14805a;
        if (i11 < iArr.length) {
            this.f14806b = i11 + 1;
            iArr[i11] = i10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f14805a.length)));
    }

    @Override
    public final void e(long j10) {
        E0.q();
        throw null;
    }

    @Override
    public final void h() {
        if (this.f14806b < this.f14805a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f14806b), Integer.valueOf(this.f14805a.length)));
        }
    }

    @Override
    public final void k(long j10) {
        if (j10 == this.f14805a.length) {
            this.f14806b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f14805a.length)));
    }

    @Override
    public final void l(Object obj) {
        p((Integer) obj);
    }

    @Override
    public final void p(Integer num) {
        E0.l(this, num);
    }

    @Override
    public final String toString() {
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f14805a.length - this.f14806b), Arrays.toString(this.f14805a));
    }

    @Override
    public final boolean u() {
        return false;
    }
}
