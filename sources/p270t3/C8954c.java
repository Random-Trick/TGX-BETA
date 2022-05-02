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
    public final AbstractC0147h f28828b;
    public final long f28829c;
    public long f28830d;
    public int f28832f;
    public int f28833g;
    public byte[] f28831e = new byte[Log.TAG_COMPRESS];
    public final byte[] f28827a = new byte[Log.TAG_EMOJI];

    static {
        C6585d1.m19946a("goog.exo.extractor");
    }

    public C8954c(AbstractC0147h hVar, long j, long j2) {
        this.f28828b = hVar;
        this.f28830d = j;
        this.f28829c = j2;
    }

    @Override
    public long mo6046a() {
        return this.f28829c;
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        int u = m10840u(bArr, i, i2);
        if (u == 0) {
            u = m10839v(bArr, i, i2, 0, true);
        }
        m10842s(u);
        return u;
    }

    @Override
    public boolean mo10813d(byte[] bArr, int i, int i2, boolean z) {
        int u = m10840u(bArr, i, i2);
        while (u < i2 && u != -1) {
            u = m10839v(bArr, i, i2, u, z);
        }
        m10842s(u);
        return u != -1;
    }

    @Override
    public boolean mo10812e(byte[] bArr, int i, int i2, boolean z) {
        if (!mo10806o(i2, z)) {
            return false;
        }
        System.arraycopy(this.f28831e, this.f28832f - i2, bArr, i, i2);
        return true;
    }

    @Override
    public long mo6045f() {
        return this.f28830d + this.f28832f;
    }

    @Override
    public void mo10811h(int i) {
        mo10806o(i, false);
    }

    @Override
    public int mo10810i(int i) {
        int w = m10838w(i);
        if (w == 0) {
            byte[] bArr = this.f28827a;
            w = m10839v(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m10842s(w);
        return w;
    }

    @Override
    public <E extends Throwable> void mo6044j(long j, E e) {
        C1186a.m38192a(j >= 0);
        this.f28830d = j;
        throw e;
    }

    @Override
    public int mo10809k(byte[] bArr, int i, int i2) {
        int i3;
        m10841t(i2);
        int i4 = this.f28833g;
        int i5 = this.f28832f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m10839v(this.f28831e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f28833g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f28831e, this.f28832f, bArr, i, i3);
        this.f28832f += i3;
        return i3;
    }

    @Override
    public void mo10808m() {
        this.f28832f = 0;
    }

    @Override
    public void mo10807n(int i) {
        m10837x(i, false);
    }

    @Override
    public boolean mo10806o(int i, boolean z) {
        m10841t(i);
        int i2 = this.f28833g - this.f28832f;
        while (i2 < i) {
            i2 = m10839v(this.f28831e, this.f28832f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f28833g = this.f28832f + i2;
        }
        this.f28832f += i;
        return true;
    }

    @Override
    public void mo10805q(byte[] bArr, int i, int i2) {
        mo10812e(bArr, i, i2, false);
    }

    @Override
    public long mo6043r() {
        return this.f28830d;
    }

    @Override
    public void readFully(byte[] bArr, int i, int i2) {
        mo10813d(bArr, i, i2, false);
    }

    public final void m10842s(int i) {
        if (i != -1) {
            this.f28830d += i;
        }
    }

    public final void m10841t(int i) {
        int i2 = this.f28832f + i;
        byte[] bArr = this.f28831e;
        if (i2 > bArr.length) {
            this.f28831e = Arrays.copyOf(this.f28831e, C1216l0.m37959p(bArr.length * 2, Log.TAG_COMPRESS + i2, i2 + Log.TAG_PLAYER));
        }
    }

    public final int m10840u(byte[] bArr, int i, int i2) {
        int i3 = this.f28833g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f28831e, 0, bArr, i, min);
        m10836y(min);
        return min;
    }

    public final int m10839v(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int b = this.f28828b.mo4414b(bArr, i + i3, i2 - i3);
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

    public final int m10838w(int i) {
        int min = Math.min(this.f28833g, i);
        m10836y(min);
        return min;
    }

    public boolean m10837x(int i, boolean z) {
        int w = m10838w(i);
        while (w < i && w != -1) {
            w = m10839v(this.f28827a, -w, Math.min(i, this.f28827a.length + w), w, z);
        }
        m10842s(w);
        return w != -1;
    }

    public final void m10836y(int i) {
        int i2 = this.f28833g - i;
        this.f28833g = i2;
        this.f28832f = 0;
        byte[] bArr = this.f28831e;
        byte[] bArr2 = i2 < bArr.length - Log.TAG_PLAYER ? new byte[Log.TAG_COMPRESS + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f28831e = bArr2;
    }
}
