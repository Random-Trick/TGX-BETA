package p199o3;

import java.nio.ByteBuffer;
import p020b5.C1186a;
import p020b5.C1216l0;
import p199o3.AbstractC7611g;

public final class C7621j0 extends AbstractC7648y {
    public final long f24385i;
    public final long f24386j;
    public final short f24387k;
    public int f24388l;
    public boolean f24389m;
    public byte[] f24390n;
    public byte[] f24391o;
    public int f24392p;
    public int f24393q;
    public int f24394r;
    public boolean f24395s;
    public long f24396t;

    public C7621j0() {
        this(150000L, 20000L, (short) 1024);
    }

    @Override
    public void mo15305b(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m15308h()) {
            int i = this.f24392p;
            if (i == 0) {
                m15459u(byteBuffer);
            } else if (i == 1) {
                m15460t(byteBuffer);
            } else if (i == 2) {
                m15458v(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override
    public boolean mo15310f() {
        return this.f24389m;
    }

    @Override
    public AbstractC7611g.C7612a mo15304i(AbstractC7611g.C7612a aVar) {
        if (aVar.f24363c == 2) {
            return this.f24389m ? aVar : AbstractC7611g.C7612a.f24360e;
        }
        throw new AbstractC7611g.C7613b(aVar);
    }

    @Override
    public void mo15303j() {
        if (this.f24389m) {
            this.f24388l = this.f24516b.f24364d;
            int n = m15466n(this.f24385i) * this.f24388l;
            if (this.f24390n.length != n) {
                this.f24390n = new byte[n];
            }
            int n2 = m15466n(this.f24386j) * this.f24388l;
            this.f24394r = n2;
            if (this.f24391o.length != n2) {
                this.f24391o = new byte[n2];
            }
        }
        this.f24392p = 0;
        this.f24396t = 0L;
        this.f24393q = 0;
        this.f24395s = false;
    }

    @Override
    public void mo15307k() {
        int i = this.f24393q;
        if (i > 0) {
            m15461s(this.f24390n, i);
        }
        if (!this.f24395s) {
            this.f24396t += this.f24394r / this.f24388l;
        }
    }

    @Override
    public void mo15302l() {
        this.f24389m = false;
        this.f24394r = 0;
        byte[] bArr = C1216l0.f4531f;
        this.f24390n = bArr;
        this.f24391o = bArr;
    }

    public final int m15466n(long j) {
        return (int) ((j * this.f24516b.f24361a) / 1000000);
    }

    public final int m15465o(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs((int) byteBuffer.getShort(limit)) > this.f24387k) {
                int i = this.f24388l;
                return ((limit / i) * i) + i;
            }
        }
    }

    public final int m15464p(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f24387k) {
                int i = this.f24388l;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    public long m15463q() {
        return this.f24396t;
    }

    public final void m15462r(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m15306m(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f24395s = true;
        }
    }

    public final void m15461s(byte[] bArr, int i) {
        m15306m(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f24395s = true;
        }
    }

    public final void m15460t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int p = m15464p(byteBuffer);
        int position = p - byteBuffer.position();
        byte[] bArr = this.f24390n;
        int length = bArr.length;
        int i = this.f24393q;
        int i2 = length - i;
        if (p >= limit || position >= i2) {
            int min = Math.min(position, i2);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f24390n, this.f24393q, min);
            int i3 = this.f24393q + min;
            this.f24393q = i3;
            byte[] bArr2 = this.f24390n;
            if (i3 == bArr2.length) {
                if (this.f24395s) {
                    m15461s(bArr2, this.f24394r);
                    this.f24396t += (this.f24393q - (this.f24394r * 2)) / this.f24388l;
                } else {
                    this.f24396t += (i3 - this.f24394r) / this.f24388l;
                }
                m15456x(byteBuffer, this.f24390n, this.f24393q);
                this.f24393q = 0;
                this.f24392p = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        m15461s(bArr, i);
        this.f24393q = 0;
        this.f24392p = 0;
    }

    public final void m15459u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f24390n.length));
        int o = m15465o(byteBuffer);
        if (o == byteBuffer.position()) {
            this.f24392p = 1;
        } else {
            byteBuffer.limit(o);
            m15462r(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    public final void m15458v(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int p = m15464p(byteBuffer);
        byteBuffer.limit(p);
        this.f24396t += byteBuffer.remaining() / this.f24388l;
        m15456x(byteBuffer, this.f24391o, this.f24394r);
        if (p < limit) {
            m15461s(this.f24391o, this.f24394r);
            this.f24392p = 0;
            byteBuffer.limit(limit);
        }
    }

    public void m15457w(boolean z) {
        this.f24389m = z;
    }

    public final void m15456x(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f24394r);
        int i2 = this.f24394r - min;
        System.arraycopy(bArr, i - i2, this.f24391o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f24391o, i2, min);
    }

    public C7621j0(long j, long j2, short s) {
        C1186a.m38192a(j2 <= j);
        this.f24385i = j;
        this.f24386j = j2;
        this.f24387k = s;
        byte[] bArr = C1216l0.f4531f;
        this.f24390n = bArr;
        this.f24391o = bArr;
    }
}
