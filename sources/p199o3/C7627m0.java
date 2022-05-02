package p199o3;

import java.nio.ByteBuffer;
import p020b5.C1216l0;
import p199o3.AbstractC7611g;

public final class C7627m0 extends AbstractC7648y {
    public int f24437i;
    public int f24438j;
    public boolean f24439k;
    public int f24440l;
    public byte[] f24441m = C1216l0.f4531f;
    public int f24442n;
    public long f24443o;

    @Override
    public ByteBuffer mo15314a() {
        int i;
        if (super.mo15311e() && (i = this.f24442n) > 0) {
            m15306m(i).put(this.f24441m, 0, this.f24442n).flip();
            this.f24442n = 0;
        }
        return super.mo15314a();
    }

    @Override
    public void mo15305b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f24440l);
            this.f24443o += min / this.f24513b.f24361d;
            this.f24440l -= min;
            byteBuffer.position(position + min);
            if (this.f24440l <= 0) {
                int i2 = i - min;
                int length = (this.f24442n + i2) - this.f24441m.length;
                ByteBuffer m = m15306m(length);
                int p = C1216l0.m37956p(length, 0, this.f24442n);
                m.put(this.f24441m, 0, p);
                int p2 = C1216l0.m37956p(length - p, 0, i2);
                byteBuffer.limit(byteBuffer.position() + p2);
                m.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - p2;
                int i4 = this.f24442n - p;
                this.f24442n = i4;
                byte[] bArr = this.f24441m;
                System.arraycopy(bArr, p, bArr, 0, i4);
                byteBuffer.get(this.f24441m, this.f24442n, i3);
                this.f24442n += i3;
                m.flip();
            }
        }
    }

    @Override
    public boolean mo15311e() {
        return super.mo15311e() && this.f24442n == 0;
    }

    @Override
    public AbstractC7611g.C7612a mo15304i(AbstractC7611g.C7612a aVar) {
        if (aVar.f24360c == 2) {
            this.f24439k = true;
            return (this.f24437i == 0 && this.f24438j == 0) ? AbstractC7611g.C7612a.f24357e : aVar;
        }
        throw new AbstractC7611g.C7613b(aVar);
    }

    @Override
    public void mo15303j() {
        if (this.f24439k) {
            this.f24439k = false;
            int i = this.f24438j;
            int i2 = this.f24513b.f24361d;
            this.f24441m = new byte[i * i2];
            this.f24440l = this.f24437i * i2;
        }
        this.f24442n = 0;
    }

    @Override
    public void mo15307k() {
        int i;
        if (this.f24439k) {
            if (this.f24442n > 0) {
                this.f24443o += i / this.f24513b.f24361d;
            }
            this.f24442n = 0;
        }
    }

    @Override
    public void mo15302l() {
        this.f24441m = C1216l0.f4531f;
    }

    public long m15429n() {
        return this.f24443o;
    }

    public void m15428o() {
        this.f24443o = 0L;
    }

    public void m15427p(int i, int i2) {
        this.f24437i = i;
        this.f24438j = i2;
    }
}
