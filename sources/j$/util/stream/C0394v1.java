package j$.util.stream;

import java.util.Arrays;

public final class C0394v1 extends C0390u1 implements H0 {
    public C0394v1(long j10) {
        super(j10);
    }

    @Override
    public final O0 mo32b() {
        if (this.f14870b >= this.f14869a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f14870b), Integer.valueOf(this.f14869a.length)));
    }

    @Override
    public final void c(double d10) {
        E0.i();
        throw null;
    }

    @Override
    public final void d(int i10) {
        E0.p();
        throw null;
    }

    @Override
    public final void e(long j10) {
        int i10 = this.f14870b;
        long[] jArr = this.f14869a;
        if (i10 < jArr.length) {
            this.f14870b = i10 + 1;
            jArr[i10] = j10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f14869a.length)));
    }

    @Override
    public final void h() {
        if (this.f14870b < this.f14869a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f14870b), Integer.valueOf(this.f14869a.length)));
        }
    }

    @Override
    public final void k(long j10) {
        if (j10 == this.f14869a.length) {
            this.f14870b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f14869a.length)));
    }

    @Override
    public final void l(Object obj) {
        x((Long) obj);
    }

    @Override
    public final String toString() {
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f14869a.length - this.f14870b), Arrays.toString(this.f14869a));
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void x(Long l10) {
        E0.n(this, l10);
    }
}
