package p126j$.util.stream;

import java.util.Arrays;

public final class C5778u1 extends C5773t1 implements AbstractC5587G0 {
    public C5778u1(long j) {
        super(j);
    }

    @Override
    public AbstractC5622N0 mo42633b() {
        if (this.f18476b >= this.f18475a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18476b), Integer.valueOf(this.f18475a.length)));
    }

    @Override
    public void mo22136c(double d) {
        AbstractC5572D0.m22422i();
        throw null;
    }

    @Override
    public void mo22135d(int i) {
        AbstractC5572D0.m22415m();
        throw null;
    }

    @Override
    public void mo22134e(long j) {
        int i = this.f18476b;
        long[] jArr = this.f18475a;
        if (i < jArr.length) {
            this.f18476b = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f18475a.length)));
    }

    @Override
    public void mo22133h() {
        if (this.f18476b < this.f18475a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18476b), Integer.valueOf(this.f18475a.length)));
        }
    }

    @Override
    public void mo22132j(long j) {
        if (j == this.f18475a.length) {
            this.f18476b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(this.f18475a.length)));
    }

    @Override
    public boolean mo22131t() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f18475a.length - this.f18476b), Arrays.toString(this.f18475a));
    }

    public void mo22129k(Long l) {
        AbstractC5572D0.m22417l(this, l);
    }
}
