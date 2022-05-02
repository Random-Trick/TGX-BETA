package p126j$.util.stream;

import java.util.Arrays;

public final class C5688c1 extends C5683b1 implements AbstractC5577E0 {
    public C5688c1(long j) {
        super(j);
    }

    @Override
    public AbstractC5602J0 mo42633b() {
        if (this.f18316b >= this.f18315a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18316b), Integer.valueOf(this.f18315a.length)));
    }

    @Override
    public void mo22136c(double d) {
        int i = this.f18316b;
        double[] dArr = this.f18315a;
        if (i < dArr.length) {
            this.f18316b = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f18315a.length)));
    }

    @Override
    public void mo22135d(int i) {
        AbstractC5572D0.m22415m();
        throw null;
    }

    @Override
    public void mo22134e(long j) {
        AbstractC5572D0.m22413n();
        throw null;
    }

    @Override
    public void mo22133h() {
        if (this.f18316b < this.f18315a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18316b), Integer.valueOf(this.f18315a.length)));
        }
    }

    @Override
    public void mo22132j(long j) {
        if (j == this.f18315a.length) {
            this.f18316b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(this.f18315a.length)));
    }

    @Override
    public boolean mo22131t() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f18315a.length - this.f18316b), Arrays.toString(this.f18315a));
    }

    public void mo22129k(Double d) {
        AbstractC5572D0.m22420j(this, d);
    }
}
