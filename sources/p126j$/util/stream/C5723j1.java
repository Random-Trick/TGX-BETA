package p126j$.util.stream;

import java.util.Arrays;
import p126j$.util.function.AbstractC5531m;

public final class C5723j1 extends C5645S0 implements AbstractC5592H0 {
    public C5723j1(long j, AbstractC5531m mVar) {
        super(j, mVar);
    }

    @Override
    public AbstractC5632P0 mo42630b() {
        if (this.f18235b >= this.f18234a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f18235b), Integer.valueOf(this.f18234a.length)));
    }

    @Override
    public void mo22135c(double d) {
        AbstractC5572D0.m22421i();
        throw null;
    }

    @Override
    public void mo22134d(int i) {
        AbstractC5572D0.m22414m();
        throw null;
    }

    @Override
    public void mo22133e(long j) {
        AbstractC5572D0.m22412n();
        throw null;
    }

    @Override
    public void mo22132h() {
        if (this.f18235b < this.f18234a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f18235b), Integer.valueOf(this.f18234a.length)));
        }
    }

    @Override
    public void mo22131j(long j) {
        if (j == this.f18234a.length) {
            this.f18235b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(this.f18234a.length)));
    }

    @Override
    public void mo22128k(Object obj) {
        int i = this.f18235b;
        Object[] objArr = this.f18234a;
        if (i < objArr.length) {
            this.f18235b = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f18234a.length)));
    }

    @Override
    public boolean mo22130t() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(this.f18234a.length - this.f18235b), Arrays.toString(this.f18234a));
    }
}
