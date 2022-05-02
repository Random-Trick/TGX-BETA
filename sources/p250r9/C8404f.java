package p250r9;

import java.nio.ByteBuffer;
import p107ha.C5060q;
import pa.AbstractC8088l;
import qa.C8298k;

public final class C8404f extends C8401c {
    public final long f27293d;
    public final double f27294e;

    public C8404f(ByteBuffer byteBuffer, long j, long j2, double d, AbstractC8088l<? super Boolean, C5060q> lVar) {
        super(byteBuffer, j2, lVar);
        C8298k.m12933e(byteBuffer, "buffer");
        C8298k.m12933e(lVar, "release");
        this.f27293d = j;
        this.f27294e = d;
    }

    public final double m12565d() {
        return this.f27294e;
    }
}
