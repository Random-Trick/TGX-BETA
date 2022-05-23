package o3;

import c5.a;
import java.nio.ByteBuffer;
import o3.g;

public final class z extends y {
    public int[] f18949i;
    public int[] f18950j;

    @Override
    public void b(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) a.e(this.f18950j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m10 = m(((limit - position) / this.f18942b.f18786d) * this.f18943c.f18786d);
        while (position < limit) {
            for (int i10 : iArr) {
                m10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f18942b.f18786d;
        }
        byteBuffer.position(limit);
        m10.flip();
    }

    @Override
    public g.a i(g.a aVar) {
        int[] iArr = this.f18949i;
        if (iArr == null) {
            return g.a.f18782e;
        }
        if (aVar.f18785c == 2) {
            boolean z10 = aVar.f18784b != iArr.length;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 < aVar.f18784b) {
                    z10 |= i11 != i10;
                    i10++;
                } else {
                    throw new g.b(aVar);
                }
            }
            if (z10) {
                return new g.a(aVar.f18783a, iArr.length, 2);
            }
            return g.a.f18782e;
        }
        throw new g.b(aVar);
    }

    @Override
    public void j() {
        this.f18950j = this.f18949i;
    }

    @Override
    public void l() {
        this.f18950j = null;
        this.f18949i = null;
    }

    public void n(int[] iArr) {
        this.f18949i = iArr;
    }
}
