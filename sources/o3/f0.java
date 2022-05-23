package o3;

import c5.l0;
import java.nio.ByteBuffer;
import o3.g;

public final class f0 extends y {
    public static final int f18780i = Float.floatToIntBits(Float.NaN);

    public static void n(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f18780i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f18942b.f18785c;
        if (i11 == 536870912) {
            byteBuffer2 = m((i10 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 805306368) {
            byteBuffer2 = m(i10);
            while (position < limit) {
                n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override
    public g.a i(g.a aVar) {
        int i10 = aVar.f18785c;
        if (!l0.i0(i10)) {
            throw new g.b(aVar);
        } else if (i10 != 4) {
            return new g.a(aVar.f18783a, aVar.f18784b, 4);
        } else {
            return g.a.f18782e;
        }
    }
}
