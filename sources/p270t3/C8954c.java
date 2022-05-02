package p270t3;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.thunderdog.challegram.Log;
import p006a5.AbstractC0147h;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.C6585d1;

public final class C8954c implements AbstractC8959g {
    public final AbstractC0147h f28825b;
    public final long f28826c;
    public long f28827d;
    public int f28829f;
    public int f28830g;
    public byte[] f28828e = new byte[Log.TAG_COMPRESS];
    public final byte[] f28824a = new byte[Log.TAG_EMOJI];

    static {
        C6585d1.m19945a("goog.exo.extractor");
    }

    public C8954c(AbstractC0147h hVar, long j, long j2) {
        this.f28825b = hVar;
        this.f28827d = j;
        this.f28826c = j2;
    }

    @Override
    public long mo6046a() {
        return this.f28826c;
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        int u = m10841u(bArr, i, i2);
        if (u == 0) {
            u = m10840v(bArr, i, i2, 0, true);
        }
        m10843s(u);
        return u;
    }

    @Override
    public boolean mo10814d(byte[] bArr, int i, int i2, boolean z) {
        int u = m10841u(bArr, i, i2);
        while (u < i2 && u != -1) {
            u = m10840v(bArr, i, i2, u, z);
        }
        m10843s(u);
        return u != -1;
    }

    @Override
    public boolean mo10813e(byte[] bArr, int i, int i2, boolean z) {
        if (!mo10807o(i2, z)) {
            return false;
        }
        System.arraycopy(this.f28828e, this.f28829f - i2, bArr, i, i2);
        return true;
    }

    @Override
    public long mo6045f() {
        return this.f28827d + this.f28829f;
    }

    @Override
    public void mo10812h(int i) {
        mo10807o(i, false);
    }

    @Override
    public int mo10811i(int i) {
        int w = m10839w(i);
        if (w == 0) {
            byte[] bArr = this.f28824a;
            w = m10840v(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m10843s(w);
        return w;
    }

    @Override
    public <E extends Throwable> void mo6044j(long j, E e) {
        C1186a.m38189a(j >= 0);
        this.f28827d = j;
        throw e;
    }

    @Override
    public int mo10810k(byte[] bArr, int i, int i2) {
        int i3;
        m10842t(i2);
        int i4 = this.f28830g;
        int i5 = this.f28829f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m10840v(this.f28828e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f28830g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f28828e, this.f28829f, bArr, i, i3);
        this.f28829f += i3;
        return i3;
    }

    @Override
    public void mo10809m() {
        this.f28829f = 0;
    }

    @Override
    public void mo10808n(int i) {
        m10838x(i, false);
    }

    @Override
    public boolean mo10807o(int i, boolean z) {
        m10842t(i);
        int i2 = this.f28830g - this.f28829f;
        while (i2 < i) {
            i2 = m10840v(this.f28828e, this.f28829f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f28830g = this.f28829f + i2;
        }
        this.f28829f += i;
        return true;
    }

    @Override
    public void mo10806q(byte[] bArr, int i, int i2) {
        mo10813e(bArr, i, i2, false);
    }

    @Override
    public long mo6043r() {
        return this.f28827d;
    }

    @Override
    public void readFully(byte[] bArr, int i, int i2) {
        mo10814d(bArr, i, i2, false);
    }

    public final void m10843s(int i) {
        if (i != -1) {
            this.f28827d += i;
        }
    }

    public final void m10842t(int i) {
        int i2 = this.f28829f + i;
        byte[] bArr = this.f28828e;
        if (i2 > bArr.length) {
            this.f28828e = Arrays.copyOf(this.f28828e, C1216l0.m37956p(bArr.length * 2, Log.TAG_COMPRESS + i2, i2 + Log.TAG_PLAYER));
        }
    }

    public final int m10841u(byte[] bArr, int i, int i2) {
        int i3 = this.f28830g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f28828e, 0, bArr, i, min);
        m10837y(min);
        return min;
    }

    public final int m10840v(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int b = this.f28825b.mo4414b(bArr, i + i3, i2 - i3);
            if (b != -1) {
                return i3 + b;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public final int m10839w(int i) {
        int min = Math.min(this.f28830g, i);
        m10837y(min);
        return min;
    }

    public boolean m10838x(int i, boolean z) {
        int w = m10839w(i);
        while (w < i && w != -1) {
            w = m10840v(this.f28824a, -w, Math.min(i, this.f28824a.length + w), w, z);
        }
        m10843s(w);
        return w != -1;
    }

    public final void m10837y(int i) {
        int i2 = this.f28830g - i;
        this.f28830g = i2;
        this.f28829f = 0;
        byte[] bArr = this.f28828e;
        byte[] bArr2 = i2 < bArr.length - Log.TAG_PLAYER ? new byte[Log.TAG_COMPRESS + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f28828e = bArr2;
    }
}
