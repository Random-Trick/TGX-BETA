package p126j$.util.stream;

import java.util.Arrays;

public final class C5733l1 extends C5728k1 implements AbstractC5582F0 {
    public C5733l1(long j) {
        super(j);
    }

    @Override
    public AbstractC5612L0 mo42630b() {
        if (this.f18412b >= this.f18411a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18412b), Integer.valueOf(this.f18411a.length)));
    }

    @Override
    public void mo22135c(double d) {
        AbstractC5572D0.m22421i();
        throw null;
    }

    @Override
    public void mo22134d(int i) {
        int i2 = this.f18412b;
        int[] iArr = this.f18411a;
        if (i2 < iArr.length) {
            this.f18412b = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f18411a.length)));
    }

    @Override
    public void mo22133e(long j) {
        AbstractC5572D0.m22412n();
        throw null;
    }

    @Override
    public void mo22132h() {
        if (this.f18412b < this.f18411a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18412b), Integer.valueOf(this.f18411a.length)));
        }
    }

    @Override
    public void mo22131j(long j) {
        if (j == this.f18411a.length) {
            this.f18412b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(this.f18411a.length)));
    }

    @Override
    public boolean mo22130t() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f18411a.length - this.f18412b), Arrays.toString(this.f18411a));
    }

    public void mo22128k(Integer num) {
        AbstractC5572D0.m22417k(this, num);
    }
}
