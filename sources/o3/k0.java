package o3;

import c5.a;
import c5.l0;
import java.nio.ByteBuffer;
import o3.g;

public final class k0 extends y {
    public final long f18820i;
    public final long f18821j;
    public final short f18822k;
    public int f18823l;
    public boolean f18824m;
    public byte[] f18825n;
    public byte[] f18826o;
    public int f18827p;
    public int f18828q;
    public int f18829r;
    public boolean f18830s;
    public long f18831t;

    public k0() {
        this(150000L, 20000L, (short) 1024);
    }

    @Override
    public void b(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !h()) {
            int i10 = this.f18827p;
            if (i10 == 0) {
                u(byteBuffer);
            } else if (i10 == 1) {
                t(byteBuffer);
            } else if (i10 == 2) {
                v(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override
    public boolean f() {
        return this.f18824m;
    }

    @Override
    public g.a i(g.a aVar) {
        if (aVar.f18785c == 2) {
            return this.f18824m ? aVar : g.a.f18782e;
        }
        throw new g.b(aVar);
    }

    @Override
    public void j() {
        if (this.f18824m) {
            this.f18823l = this.f18942b.f18786d;
            int n10 = n(this.f18820i) * this.f18823l;
            if (this.f18825n.length != n10) {
                this.f18825n = new byte[n10];
            }
            int n11 = n(this.f18821j) * this.f18823l;
            this.f18829r = n11;
            if (this.f18826o.length != n11) {
                this.f18826o = new byte[n11];
            }
        }
        this.f18827p = 0;
        this.f18831t = 0L;
        this.f18828q = 0;
        this.f18830s = false;
    }

    @Override
    public void k() {
        int i10 = this.f18828q;
        if (i10 > 0) {
            s(this.f18825n, i10);
        }
        if (!this.f18830s) {
            this.f18831t += this.f18829r / this.f18823l;
        }
    }

    @Override
    public void l() {
        this.f18824m = false;
        this.f18829r = 0;
        byte[] bArr = l0.f4846f;
        this.f18825n = bArr;
        this.f18826o = bArr;
    }

    public final int n(long j10) {
        return (int) ((j10 * this.f18942b.f18783a) / 1000000);
    }

    public final int o(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs((int) byteBuffer.getShort(limit)) > this.f18822k) {
                int i10 = this.f18823l;
                return ((limit / i10) * i10) + i10;
            }
        }
    }

    public final int p(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f18822k) {
                int i10 = this.f18823l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    public long q() {
        return this.f18831t;
    }

    public final void r(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f18830s = true;
        }
    }

    public final void s(byte[] bArr, int i10) {
        m(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f18830s = true;
        }
    }

    public final void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int p10 = p(byteBuffer);
        int position = p10 - byteBuffer.position();
        byte[] bArr = this.f18825n;
        int length = bArr.length;
        int i10 = this.f18828q;
        int i11 = length - i10;
        if (p10 >= limit || position >= i11) {
            int min = Math.min(position, i11);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f18825n, this.f18828q, min);
            int i12 = this.f18828q + min;
            this.f18828q = i12;
            byte[] bArr2 = this.f18825n;
            if (i12 == bArr2.length) {
                if (this.f18830s) {
                    s(bArr2, this.f18829r);
                    this.f18831t += (this.f18828q - (this.f18829r * 2)) / this.f18823l;
                } else {
                    this.f18831t += (i12 - this.f18829r) / this.f18823l;
                }
                x(byteBuffer, this.f18825n, this.f18828q);
                this.f18828q = 0;
                this.f18827p = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        s(bArr, i10);
        this.f18828q = 0;
        this.f18827p = 0;
    }

    public final void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f18825n.length));
        int o10 = o(byteBuffer);
        if (o10 == byteBuffer.position()) {
            this.f18827p = 1;
        } else {
            byteBuffer.limit(o10);
            r(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    public final void v(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int p10 = p(byteBuffer);
        byteBuffer.limit(p10);
        this.f18831t += byteBuffer.remaining() / this.f18823l;
        x(byteBuffer, this.f18826o, this.f18829r);
        if (p10 < limit) {
            s(this.f18826o, this.f18829r);
            this.f18827p = 0;
            byteBuffer.limit(limit);
        }
    }

    public void w(boolean z10) {
        this.f18824m = z10;
    }

    public final void x(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f18829r);
        int i11 = this.f18829r - min;
        System.arraycopy(bArr, i10 - i11, this.f18826o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f18826o, i11, min);
    }

    public k0(long j10, long j11, short s10) {
        a.a(j11 <= j10);
        this.f18820i = j10;
        this.f18821j = j11;
        this.f18822k = s10;
        byte[] bArr = l0.f4846f;
        this.f18825n = bArr;
        this.f18826o = bArr;
    }
}
