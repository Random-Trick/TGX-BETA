package p126j$.util.stream;

import java.util.Arrays;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5482V;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.Consumer;

public class C5645S0 implements AbstractC5632P0 {
    final Object[] f18234a;
    int f18235b;

    public C5645S0(long j, AbstractC5531m mVar) {
        if (j < 2147483639) {
            this.f18234a = (Object[]) mVar.mo22179w((int) j);
            this.f18235b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public C5645S0(Object[] objArr) {
        this.f18234a = objArr;
        this.f18235b = objArr.length;
    }

    @Override
    public void mo22177a(Consumer consumer) {
        for (int i = 0; i < this.f18235b; i++) {
            consumer.mo22129k(this.f18234a[i]);
        }
    }

    @Override
    public long count() {
        return this.f18235b;
    }

    @Override
    public AbstractC5632P0 mo22159f(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void mo22155n(Object[] objArr, int i) {
        System.arraycopy(this.f18234a, 0, objArr, i, this.f18235b);
    }

    @Override
    public int mo22154o() {
        return 0;
    }

    @Override
    public Object[] mo22153p(AbstractC5531m mVar) {
        Object[] objArr = this.f18234a;
        if (objArr.length == this.f18235b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override
    public AbstractC5632P0 mo22152q(long j, long j2, AbstractC5531m mVar) {
        return AbstractC5572D0.m22399y(this, j, j2, mVar);
    }

    @Override
    public AbstractC5468G mo42632spliterator() {
        return AbstractC5482V.m22588m(this.f18234a, 0, this.f18235b, 1040);
    }

    public String toString() {
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(this.f18234a.length - this.f18235b), Arrays.toString(this.f18234a));
    }
}
