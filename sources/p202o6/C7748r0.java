package p202o6;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;
import org.thunderdog.challegram.Log;

public final class C7748r0 extends FilterInputStream {
    public long f24812c;
    public final C7720l2 f24810a = new C7720l2();
    public byte[] f24811b = new byte[Log.TAG_EMOJI];
    public boolean f24808M = false;
    public boolean f24809N = false;

    public C7748r0(InputStream inputStream) {
        super(inputStream);
    }

    public final int m15150A0(byte[] bArr, int i, int i2) {
        return Math.max(0, super.read(bArr, i, i2));
    }

    public final boolean m15149B0(int i) {
        int A0 = m15150A0(this.f24811b, 0, i);
        if (A0 != i) {
            int i2 = i - A0;
            if (m15150A0(this.f24811b, A0, i2) != i2) {
                this.f24810a.m15176b(this.f24811b, 0, A0);
                return false;
            }
        }
        this.f24810a.m15176b(this.f24811b, 0, i);
        return true;
    }

    public final long m15148m() {
        return this.f24812c;
    }

    @Override
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final AbstractC7726m3 m15147t() {
        byte[] bArr;
        if (this.f24812c > 0) {
            do {
                bArr = this.f24811b;
            } while (read(bArr, 0, bArr.length) != -1);
            if (!this.f24808M || this.f24809N) {
                return new C7728n0(null, -1L, -1, false, false, null);
            }
            if (!m15149B0(30)) {
                this.f24808M = true;
                return this.f24810a.m15175c();
            }
            AbstractC7726m3 c = this.f24810a.m15175c();
            if (c.mo15162d()) {
                this.f24809N = true;
                return c;
            } else if (c.mo15164b() != 4294967295L) {
                int a = this.f24810a.m15177a() - 30;
                long j = a;
                int length = this.f24811b.length;
                if (j > length) {
                    do {
                        length += length;
                    } while (length < j);
                    this.f24811b = Arrays.copyOf(this.f24811b, length);
                }
                if (!m15149B0(a)) {
                    this.f24808M = true;
                    return this.f24810a.m15175c();
                }
                AbstractC7726m3 c2 = this.f24810a.m15175c();
                this.f24812c = c2.mo15164b();
                return c2;
            } else {
                throw new C7694g1("Files bigger than 4GiB are not supported.");
            }
        } else {
            if (!this.f24808M) {
            }
            return new C7728n0(null, -1L, -1, false, false, null);
        }
    }

    public final boolean m15146y0() {
        return this.f24809N;
    }

    public final boolean m15145z0() {
        return this.f24808M;
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f24812c;
        if (j <= 0 || this.f24808M) {
            return -1;
        }
        int A0 = m15150A0(bArr, i, (int) Math.min(j, i2));
        this.f24812c -= A0;
        if (A0 != 0) {
            return A0;
        }
        this.f24808M = true;
        return 0;
    }
}
