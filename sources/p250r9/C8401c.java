package p250r9;

import java.nio.ByteBuffer;
import p107ha.C5060q;
import pa.AbstractC8088l;
import qa.C8298k;

public class C8401c {
    public final ByteBuffer f27276a;
    public final long f27277b;
    public final AbstractC8088l<Boolean, C5060q> f27278c;

    public C8401c(ByteBuffer byteBuffer, long j, AbstractC8088l<? super Boolean, C5060q> lVar) {
        C8298k.m12934e(byteBuffer, "buffer");
        C8298k.m12934e(lVar, "release");
        this.f27276a = byteBuffer;
        this.f27277b = j;
        this.f27278c = lVar;
    }

    public final ByteBuffer m12573a() {
        return this.f27276a;
    }

    public final AbstractC8088l<Boolean, C5060q> m12572b() {
        return this.f27278c;
    }

    public final long m12571c() {
        return this.f27277b;
    }
}
