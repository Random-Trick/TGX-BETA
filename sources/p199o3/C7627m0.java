package p199o3;

import java.nio.ByteBuffer;
import p020b5.C1216l0;
import p199o3.AbstractC7611g;

public final class C7627m0 extends AbstractC7648y {
    public int f24440i;
    public int f24441j;
    public boolean f24442k;
    public int f24443l;
    public byte[] f24444m = C1216l0.f4531f;
    public int f24445n;
    public long f24446o;

    @Override
    public ByteBuffer mo15314a() {
        int i;
        if (super.mo15311e() && (i = this.f24445n) > 0) {
            m15306m(i).put(this.f24444m, 0, this.f24445n).flip();
            this.f24445n = 0;
        }
        return super.mo15314a();
    }

    @Override
    public void mo15305b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f24443l);
            this.f24446o += min / this.f24516b.f24364d;
            this.f24443l -= min;
            byteBuffer.position(position + min);
            if (this.f24443l <= 0) {
                int i2 = i - min;
                int length = (this.f24445n + i2) - this.f24444m.length;
                ByteBuffer m = m15306m(length);
                int p = C1216l0.m37959p(length, 0, this.f24445n);
                m.put(this.f24444m, 0, p);
                int p2 = C1216l0.m37959p(length - p, 0, i2);
                byteBuffer.limit(byteBuffer.position() + p2);
                m.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - p2;
                int i4 = this.f24445n - p;
                this.f24445n = i4;
                byte[] bArr = this.f24444m;
                System.arraycopy(bArr, p, bArr, 0, i4);
                byteBuffer.get(this.f24444m, this.f24445n, i3);
                this.f24445n += i3;
                m.flip();
            }
        }
    }

    @Override
    public boolean mo15311e() {
        return super.mo15311e() && this.f24445n == 0;
    }

    @Override
    public AbstractC7611g.C7612a mo15304i(AbstractC7611g.C7612a aVar) {
        if (aVar.f24363c == 2) {
            this.f24442k = true;
            return (this.f24440i == 0 && this.f24441j == 0) ? AbstractC7611g.C7612a.f24360e : aVar;
        }
        throw new AbstractC7611g.C7613b(aVar);
    }

    @Override
    public void mo15303j() {
        if (this.f24442k) {
            this.f24442k = false;
            int i = this.f24441j;
            int i2 = this.f24516b.f24364d;
            this.f24444m = new byte[i * i2];
            this.f24443l = this.f24440i * i2;
        }
        this.f24445n = 0;
    }

    @Override
    public void mo15307k() {
        int i;
        if (this.f24442k) {
            if (this.f24445n > 0) {
                this.f24446o += i / this.f24516b.f24364d;
            }
            this.f24445n = 0;
        }
    }

    @Override
    public void mo15302l() {
        this.f24444m = C1216l0.f4531f;
    }

    public long m15429n() {
        return this.f24446o;
    }

    public void m15428o() {
        this.f24446o = 0L;
    }

    public void m15427p(int i, int i2) {
        this.f24440i = i;
        this.f24441j = i2;
    }
}
