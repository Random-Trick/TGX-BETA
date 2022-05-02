package p317wa;

import java.util.NoSuchElementException;
import p123ia.AbstractC5289e0;

public final class C10026i extends AbstractC5289e0 {
    public long f32640M;
    public final long f32641a;
    public final long f32642b;
    public boolean f32643c;

    public C10026i(long j, long j2, long j3) {
        this.f32641a = j3;
        this.f32642b = j2;
        boolean z = true;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i <= 0 ? i2 < 0 : i2 > 0) {
            z = false;
        }
        this.f32643c = z;
        this.f32640M = !z ? j2 : j;
    }

    @Override
    public long mo6198e() {
        long j = this.f32640M;
        if (j != this.f32642b) {
            this.f32640M = this.f32641a + j;
        } else if (this.f32643c) {
            this.f32643c = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    @Override
    public boolean hasNext() {
        return this.f32643c;
    }
}
