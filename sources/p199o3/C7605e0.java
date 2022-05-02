package p199o3;

import java.nio.ByteBuffer;
import p020b5.C1216l0;
import p199o3.AbstractC7611g;

public final class C7605e0 extends AbstractC7648y {
    public static final int f24340i = Float.floatToIntBits(Float.NaN);

    public static void m15527n(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == f24340i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override
    public void mo15305b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f24516b.f24363c;
        if (i2 == 536870912) {
            byteBuffer2 = m15306m((i / 3) * 4);
            while (position < limit) {
                m15527n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = m15306m(i);
            while (position < limit) {
                m15527n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override
    public AbstractC7611g.C7612a mo15304i(AbstractC7611g.C7612a aVar) {
        int i = aVar.f24363c;
        if (!C1216l0.m37974h0(i)) {
            throw new AbstractC7611g.C7613b(aVar);
        } else if (i != 4) {
            return new AbstractC7611g.C7612a(aVar.f24361a, aVar.f24362b, 4);
        } else {
            return AbstractC7611g.C7612a.f24360e;
        }
    }
}
