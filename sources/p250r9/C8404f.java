package p250r9;

import java.nio.ByteBuffer;
import p107ha.C5060q;
import pa.AbstractC8088l;
import qa.C8298k;

public final class C8404f extends C8401c {
    public final long f27290d;
    public final double f27291e;

    public C8404f(ByteBuffer byteBuffer, long j, long j2, double d, AbstractC8088l<? super Boolean, C5060q> lVar) {
        super(byteBuffer, j2, lVar);
        C8298k.m12934e(byteBuffer, "buffer");
        C8298k.m12934e(lVar, "release");
        this.f27290d = j;
        this.f27291e = d;
    }

    public final double m12566d() {
        return this.f27291e;
    }
}
