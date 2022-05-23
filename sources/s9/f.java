package s9;

import ia.q;
import java.nio.ByteBuffer;
import qa.l;
import ra.k;

public final class f extends c {
    public final long f22660d;
    public final double f22661e;

    public f(ByteBuffer byteBuffer, long j10, long j11, double d10, l<? super Boolean, q> lVar) {
        super(byteBuffer, j11, lVar);
        k.e(byteBuffer, "buffer");
        k.e(lVar, "release");
        this.f22660d = j10;
        this.f22661e = d10;
    }

    public final double d() {
        return this.f22661e;
    }
}
