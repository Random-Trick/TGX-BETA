package s9;

import ia.q;
import java.nio.ByteBuffer;
import qa.l;
import ra.k;

public class c {
    public final ByteBuffer f22646a;
    public final long f22647b;
    public final l<Boolean, q> f22648c;

    public c(ByteBuffer byteBuffer, long j10, l<? super Boolean, q> lVar) {
        k.e(byteBuffer, "buffer");
        k.e(lVar, "release");
        this.f22646a = byteBuffer;
        this.f22647b = j10;
        this.f22648c = lVar;
    }

    public final ByteBuffer a() {
        return this.f22646a;
    }

    public final l<Boolean, q> b() {
        return this.f22648c;
    }

    public final long c() {
        return this.f22647b;
    }
}
