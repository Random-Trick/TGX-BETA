package p317wa;

import java.util.NoSuchElementException;
import p123ia.AbstractC5289e0;

public final class C10026i extends AbstractC5289e0 {
    public long f32637M;
    public final long f32638a;
    public final long f32639b;
    public boolean f32640c;

    public C10026i(long j, long j2, long j3) {
        this.f32638a = j3;
        this.f32639b = j2;
        boolean z = true;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i <= 0 ? i2 < 0 : i2 > 0) {
            z = false;
        }
        this.f32640c = z;
        this.f32637M = !z ? j2 : j;
    }

    @Override
    public long mo6198e() {
        long j = this.f32637M;
        if (j != this.f32639b) {
            this.f32637M = this.f32638a + j;
        } else if (this.f32640c) {
            this.f32640c = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    @Override
    public boolean hasNext() {
        return this.f32640c;
    }
}
