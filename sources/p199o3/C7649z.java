package p199o3;

import java.nio.ByteBuffer;
import p020b5.C1186a;
import p199o3.AbstractC7611g;

public final class C7649z extends AbstractC7648y {
    public int[] f24520i;
    public int[] f24521j;

    @Override
    public void mo15305b(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C1186a.m38185e(this.f24521j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m = m15306m(((limit - position) / this.f24513b.f24361d) * this.f24514c.f24361d);
        while (position < limit) {
            for (int i : iArr) {
                m.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f24513b.f24361d;
        }
        byteBuffer.position(limit);
        m.flip();
    }

    @Override
    public AbstractC7611g.C7612a mo15304i(AbstractC7611g.C7612a aVar) {
        int[] iArr = this.f24520i;
        if (iArr == null) {
            return AbstractC7611g.C7612a.f24357e;
        }
        if (aVar.f24360c == 2) {
            boolean z = aVar.f24359b != iArr.length;
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 < aVar.f24359b) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new AbstractC7611g.C7613b(aVar);
                }
            }
            if (z) {
                return new AbstractC7611g.C7612a(aVar.f24358a, iArr.length, 2);
            }
            return AbstractC7611g.C7612a.f24357e;
        }
        throw new AbstractC7611g.C7613b(aVar);
    }

    @Override
    public void mo15303j() {
        this.f24521j = this.f24520i;
    }

    @Override
    public void mo15302l() {
        this.f24521j = null;
        this.f24520i = null;
    }

    public void m15301n(int[] iArr) {
        this.f24520i = iArr;
    }
}
