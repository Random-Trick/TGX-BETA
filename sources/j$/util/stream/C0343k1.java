package j$.util.stream;

import j$.util.function.o;
import java.util.Arrays;

public final class C0343k1 extends T0 implements I0 {
    public C0343k1(long j10, o oVar) {
        super(j10, oVar);
    }

    @Override
    public final Q0 mo32b() {
        if (this.f14630b >= this.f14629a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f14630b), Integer.valueOf(this.f14629a.length)));
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
        E0.q();
        throw null;
    }

    @Override
    public final void h() {
        if (this.f14630b < this.f14629a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f14630b), Integer.valueOf(this.f14629a.length)));
        }
    }

    @Override
    public final void k(long j10) {
        if (j10 == this.f14629a.length) {
            this.f14630b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f14629a.length)));
    }

    @Override
    public final void l(Object obj) {
        int i10 = this.f14630b;
        Object[] objArr = this.f14629a;
        if (i10 < objArr.length) {
            this.f14630b = i10 + 1;
            objArr[i10] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f14629a.length)));
    }

    @Override
    public final String toString() {
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(this.f14629a.length - this.f14630b), Arrays.toString(this.f14629a));
    }

    @Override
    public final boolean u() {
        return false;
    }
}
