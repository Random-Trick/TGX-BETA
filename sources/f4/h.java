package f4;

import c5.a;
import java.nio.ByteBuffer;

public abstract class h implements c {
    @Override
    public final a a(e eVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a.e(eVar.f20488c);
        a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.isDecodeOnly()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    public abstract a b(e eVar, ByteBuffer byteBuffer);
}
