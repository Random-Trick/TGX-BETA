package o3;

import c5.l0;
import java.nio.ByteBuffer;
import o3.g;

public final class n0 extends y {
    public int f18876i;
    public int f18877j;
    public boolean f18878k;
    public int f18879l;
    public byte[] f18880m = l0.f4846f;
    public int f18881n;
    public long f18882o;

    @Override
    public ByteBuffer a() {
        int i10;
        if (super.e() && (i10 = this.f18881n) > 0) {
            m(i10).put(this.f18880m, 0, this.f18881n).flip();
            this.f18881n = 0;
        }
        return super.a();
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f18879l);
            this.f18882o += min / this.f18942b.f18786d;
            this.f18879l -= min;
            byteBuffer.position(position + min);
            if (this.f18879l <= 0) {
                int i11 = i10 - min;
                int length = (this.f18881n + i11) - this.f18880m.length;
                ByteBuffer m10 = m(length);
                int p10 = l0.p(length, 0, this.f18881n);
                m10.put(this.f18880m, 0, p10);
                int p11 = l0.p(length - p10, 0, i11);
                byteBuffer.limit(byteBuffer.position() + p11);
                m10.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i11 - p11;
                int i13 = this.f18881n - p10;
                this.f18881n = i13;
                byte[] bArr = this.f18880m;
                System.arraycopy(bArr, p10, bArr, 0, i13);
                byteBuffer.get(this.f18880m, this.f18881n, i12);
                this.f18881n += i12;
                m10.flip();
            }
        }
    }

    @Override
    public boolean e() {
        return super.e() && this.f18881n == 0;
    }

    @Override
    public g.a i(g.a aVar) {
        if (aVar.f18785c == 2) {
            this.f18878k = true;
            return (this.f18876i == 0 && this.f18877j == 0) ? g.a.f18782e : aVar;
        }
        throw new g.b(aVar);
    }

    @Override
    public void j() {
        if (this.f18878k) {
            this.f18878k = false;
            int i10 = this.f18877j;
            int i11 = this.f18942b.f18786d;
            this.f18880m = new byte[i10 * i11];
            this.f18879l = this.f18876i * i11;
        }
        this.f18881n = 0;
    }

    @Override
    public void k() {
        int i10;
        if (this.f18878k) {
            if (this.f18881n > 0) {
                this.f18882o += i10 / this.f18942b.f18786d;
            }
            this.f18881n = 0;
        }
    }

    @Override
    public void l() {
        this.f18880m = l0.f4846f;
    }

    public long n() {
        return this.f18882o;
    }

    public void o() {
        this.f18882o = 0L;
    }

    public void p(int i10, int i11) {
        this.f18876i = i10;
        this.f18877j = i11;
    }
}
