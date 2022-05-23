package j$.util.concurrent;

import j$.util.AbstractC0264a;
import j$.util.H;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;

public final class k extends q implements H {
    public final int f14407i;
    long f14408j;

    public k(m[] mVarArr, int i10, int i11, int i12, long j10, int i13) {
        super(mVarArr, i10, i11, i12);
        this.f14407i = i13;
        this.f14408j = j10;
    }

    @Override
    public final boolean a(Consumer consumer) {
        switch (this.f14407i) {
            case 0:
                Objects.requireNonNull(consumer);
                m b10 = b();
                if (b10 == null) {
                    return false;
                }
                consumer.l(b10.f14413b);
                return true;
            default:
                Objects.requireNonNull(consumer);
                m b11 = b();
                if (b11 == null) {
                    return false;
                }
                consumer.l(b11.f14414c);
                return true;
        }
    }

    @Override
    public final int characteristics() {
        switch (this.f14407i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override
    public final long estimateSize() {
        switch (this.f14407i) {
            case 0:
                return this.f14408j;
            default:
                return this.f14408j;
        }
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f14407i) {
            case 0:
                Objects.requireNonNull(consumer);
                while (true) {
                    m b10 = b();
                    if (b10 != null) {
                        consumer.l(b10.f14413b);
                    } else {
                        return;
                    }
                }
            default:
                Objects.requireNonNull(consumer);
                while (true) {
                    m b11 = b();
                    if (b11 != null) {
                        consumer.l(b11.f14414c);
                    } else {
                        return;
                    }
                }
        }
    }

    @Override
    public final Comparator getComparator() {
        switch (this.f14407i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public final long getExactSizeIfKnown() {
        switch (this.f14407i) {
            case 0:
                return AbstractC0264a.h(this);
            default:
                return AbstractC0264a.h(this);
        }
    }

    @Override
    public final boolean hasCharacteristics(int i10) {
        switch (this.f14407i) {
            case 0:
                return AbstractC0264a.k(this, i10);
            default:
                return AbstractC0264a.k(this, i10);
        }
    }

    @Override
    public final H trySplit() {
        switch (this.f14407i) {
            case 0:
                int i10 = this.f14425f;
                int i11 = this.f14426g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                m[] mVarArr = this.f14420a;
                int i13 = this.f14427h;
                this.f14426g = i12;
                long j10 = this.f14408j >>> 1;
                this.f14408j = j10;
                return new k(mVarArr, i13, i12, i11, j10, 0);
            default:
                int i14 = this.f14425f;
                int i15 = this.f14426g;
                int i16 = (i14 + i15) >>> 1;
                if (i16 <= i14) {
                    return null;
                }
                m[] mVarArr2 = this.f14420a;
                int i17 = this.f14427h;
                this.f14426g = i16;
                long j11 = this.f14408j >>> 1;
                this.f14408j = j11;
                return new k(mVarArr2, i17, i16, i15, j11, 1);
        }
    }
}
