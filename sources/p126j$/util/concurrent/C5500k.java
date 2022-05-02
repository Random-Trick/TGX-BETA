package p126j$.util.concurrent;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.Consumer;

public final class C5500k extends C5506q implements AbstractC5468G {
    public final int f18015i;
    long f18016j;

    public C5500k(C5502m[] mVarArr, int i, int i2, int i3, long j, int i4) {
        super(mVarArr, i, i2, i3);
        this.f18015i = i4;
        this.f18016j = j;
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        switch (this.f18015i) {
            case 0:
                Objects.requireNonNull(consumer);
                C5502m b = m22521b();
                if (b == null) {
                    return false;
                }
                consumer.mo22128k(b.f18021b);
                return true;
            default:
                Objects.requireNonNull(consumer);
                C5502m b2 = m22521b();
                if (b2 == null) {
                    return false;
                }
                consumer.mo22128k(b2.f18022c);
                return true;
        }
    }

    @Override
    public int characteristics() {
        switch (this.f18015i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override
    public long estimateSize() {
        switch (this.f18015i) {
            case 0:
                return this.f18016j;
            default:
                return this.f18016j;
        }
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        switch (this.f18015i) {
            case 0:
                Objects.requireNonNull(consumer);
                while (true) {
                    C5502m b = m22521b();
                    if (b != null) {
                        consumer.mo22128k(b.f18021b);
                    } else {
                        return;
                    }
                }
            default:
                Objects.requireNonNull(consumer);
                while (true) {
                    C5502m b2 = m22521b();
                    if (b2 != null) {
                        consumer.mo22128k(b2.f18022c);
                    } else {
                        return;
                    }
                }
        }
    }

    @Override
    public Comparator getComparator() {
        switch (this.f18015i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public long getExactSizeIfKnown() {
        switch (this.f18015i) {
            case 0:
                return AbstractC5485a.m22569h(this);
            default:
                return AbstractC5485a.m22569h(this);
        }
    }

    @Override
    public boolean hasCharacteristics(int i) {
        switch (this.f18015i) {
            case 0:
                return AbstractC5485a.m22568j(this, i);
            default:
                return AbstractC5485a.m22568j(this, i);
        }
    }

    @Override
    public AbstractC5468G trySplit() {
        switch (this.f18015i) {
            case 0:
                int i = this.f18033f;
                int i2 = this.f18034g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                C5502m[] mVarArr = this.f18028a;
                int i4 = this.f18035h;
                this.f18034g = i3;
                long j = this.f18016j >>> 1;
                this.f18016j = j;
                return new C5500k(mVarArr, i4, i3, i2, j, 0);
            default:
                int i5 = this.f18033f;
                int i6 = this.f18034g;
                int i7 = (i5 + i6) >>> 1;
                if (i7 <= i5) {
                    return null;
                }
                C5502m[] mVarArr2 = this.f18028a;
                int i8 = this.f18035h;
                this.f18034g = i7;
                long j2 = this.f18016j >>> 1;
                this.f18016j = j2;
                return new C5500k(mVarArr2, i8, i7, i6, j2, 1);
        }
    }
}
