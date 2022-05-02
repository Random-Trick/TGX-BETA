package p073f4;

import java.nio.ByteBuffer;
import p020b5.C1186a;

public abstract class AbstractC4270h implements AbstractC4264c {
    @Override
    public final C4260a mo28316a(C4267e eVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C1186a.m38188e(eVar.f26135c);
        C1186a.m38192a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.isDecodeOnly()) {
            return null;
        }
        return mo19176b(eVar, byteBuffer);
    }

    public abstract C4260a mo19176b(C4267e eVar, ByteBuffer byteBuffer);
}
