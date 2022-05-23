package p6;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;
import org.thunderdog.challegram.Log;

public final class r0 extends FilterInputStream {
    public long f20767c;
    public final l2 f20765a = new l2();
    public byte[] f20766b = new byte[Log.TAG_EMOJI];
    public boolean M = false;
    public boolean N = false;

    public r0(InputStream inputStream) {
        super(inputStream);
    }

    public final int A0(byte[] bArr, int i10, int i11) {
        return Math.max(0, super.read(bArr, i10, i11));
    }

    public final boolean B0(int i10) {
        int A0 = A0(this.f20766b, 0, i10);
        if (A0 != i10) {
            int i11 = i10 - A0;
            if (A0(this.f20766b, A0, i11) != i11) {
                this.f20765a.b(this.f20766b, 0, A0);
                return false;
            }
        }
        this.f20765a.b(this.f20766b, 0, i10);
        return true;
    }

    public final long m() {
        return this.f20767c;
    }

    @Override
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final m3 s() {
        byte[] bArr;
        if (this.f20767c > 0) {
            do {
                bArr = this.f20766b;
            } while (read(bArr, 0, bArr.length) != -1);
            if (!this.M || this.N) {
                return new n0(null, -1L, -1, false, false, null);
            }
            if (!B0(30)) {
                this.M = true;
                return this.f20765a.c();
            }
            m3 c10 = this.f20765a.c();
            if (c10.d()) {
                this.N = true;
                return c10;
            } else if (c10.b() != 4294967295L) {
                int a10 = this.f20765a.a() - 30;
                long j10 = a10;
                int length = this.f20766b.length;
                if (j10 > length) {
                    do {
                        length += length;
                    } while (length < j10);
                    this.f20766b = Arrays.copyOf(this.f20766b, length);
                }
                if (!B0(a10)) {
                    this.M = true;
                    return this.f20765a.c();
                }
                m3 c11 = this.f20765a.c();
                this.f20767c = c11.b();
                return c11;
            } else {
                throw new g1("Files bigger than 4GiB are not supported.");
            }
        } else {
            if (!this.M) {
            }
            return new n0(null, -1L, -1, false, false, null);
        }
    }

    public final boolean y0() {
        return this.N;
    }

    public final boolean z0() {
        return this.M;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.f20767c;
        if (j10 <= 0 || this.M) {
            return -1;
        }
        int A0 = A0(bArr, i10, (int) Math.min(j10, i11));
        this.f20767c -= A0;
        if (A0 != 0) {
            return A0;
        }
        this.M = true;
        return 0;
    }
}
