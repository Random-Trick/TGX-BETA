package t3;

import b5.h;
import c5.a;
import c5.l0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import m3.n1;
import org.thunderdog.challegram.Log;

public final class c implements g {
    public final h f22868b;
    public final long f22869c;
    public long f22870d;
    public int f22872f;
    public int f22873g;
    public byte[] f22871e = new byte[Log.TAG_COMPRESS];
    public final byte[] f22867a = new byte[Log.TAG_EMOJI];

    static {
        n1.a("goog.exo.extractor");
    }

    public c(h hVar, long j10, long j11) {
        this.f22868b = hVar;
        this.f22870d = j10;
        this.f22869c = j11;
    }

    @Override
    public long a() {
        return this.f22869c;
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        int u10 = u(bArr, i10, i11);
        if (u10 == 0) {
            u10 = v(bArr, i10, i11, 0, true);
        }
        s(u10);
        return u10;
    }

    @Override
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        int u10 = u(bArr, i10, i11);
        while (u10 < i11 && u10 != -1) {
            u10 = v(bArr, i10, i11, u10, z10);
        }
        s(u10);
        return u10 != -1;
    }

    @Override
    public boolean e(byte[] bArr, int i10, int i11, boolean z10) {
        if (!o(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f22871e, this.f22872f - i11, bArr, i10, i11);
        return true;
    }

    @Override
    public long f() {
        return this.f22870d + this.f22872f;
    }

    @Override
    public void g(int i10) {
        o(i10, false);
    }

    @Override
    public int h(int i10) {
        int w10 = w(i10);
        if (w10 == 0) {
            byte[] bArr = this.f22867a;
            w10 = v(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        s(w10);
        return w10;
    }

    @Override
    public <E extends Throwable> void j(long j10, E e10) {
        a.a(j10 >= 0);
        this.f22870d = j10;
        throw e10;
    }

    @Override
    public int k(byte[] bArr, int i10, int i11) {
        int i12;
        t(i11);
        int i13 = this.f22873g;
        int i14 = this.f22872f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            i12 = v(this.f22871e, i14, i11, 0, true);
            if (i12 == -1) {
                return -1;
            }
            this.f22873g += i12;
        } else {
            i12 = Math.min(i11, i15);
        }
        System.arraycopy(this.f22871e, this.f22872f, bArr, i10, i12);
        this.f22872f += i12;
        return i12;
    }

    @Override
    public void m() {
        this.f22872f = 0;
    }

    @Override
    public void n(int i10) {
        x(i10, false);
    }

    @Override
    public boolean o(int i10, boolean z10) {
        t(i10);
        int i11 = this.f22873g - this.f22872f;
        while (i11 < i10) {
            i11 = v(this.f22871e, this.f22872f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f22873g = this.f22872f + i11;
        }
        this.f22872f += i10;
        return true;
    }

    @Override
    public void q(byte[] bArr, int i10, int i11) {
        e(bArr, i10, i11, false);
    }

    @Override
    public long r() {
        return this.f22870d;
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        c(bArr, i10, i11, false);
    }

    public final void s(int i10) {
        if (i10 != -1) {
            this.f22870d += i10;
        }
    }

    public final void t(int i10) {
        int i11 = this.f22872f + i10;
        byte[] bArr = this.f22871e;
        if (i11 > bArr.length) {
            this.f22871e = Arrays.copyOf(this.f22871e, l0.p(bArr.length * 2, Log.TAG_COMPRESS + i11, i11 + Log.TAG_PLAYER));
        }
    }

    public final int u(byte[] bArr, int i10, int i11) {
        int i12 = this.f22873g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f22871e, 0, bArr, i10, min);
        y(min);
        return min;
    }

    public final int v(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int b10 = this.f22868b.b(bArr, i10 + i12, i11 - i12);
            if (b10 != -1) {
                return i12 + b10;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public final int w(int i10) {
        int min = Math.min(this.f22873g, i10);
        y(min);
        return min;
    }

    public boolean x(int i10, boolean z10) {
        int w10 = w(i10);
        while (w10 < i10 && w10 != -1) {
            w10 = v(this.f22867a, -w10, Math.min(i10, this.f22867a.length + w10), w10, z10);
        }
        s(w10);
        return w10 != -1;
    }

    public final void y(int i10) {
        int i11 = this.f22873g - i10;
        this.f22873g = i11;
        this.f22872f = 0;
        byte[] bArr = this.f22871e;
        byte[] bArr2 = i11 < bArr.length - Log.TAG_PLAYER ? new byte[Log.TAG_COMPRESS + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f22871e = bArr2;
    }
}
