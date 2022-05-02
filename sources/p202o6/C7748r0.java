package p202o6;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;
import org.thunderdog.challegram.Log;

public final class C7748r0 extends FilterInputStream {
    public long f24815c;
    public final C7720l2 f24813a = new C7720l2();
    public byte[] f24814b = new byte[Log.TAG_EMOJI];
    public boolean f24811M = false;
    public boolean f24812N = false;

    public C7748r0(InputStream inputStream) {
        super(inputStream);
    }

    public final int m15150A0(byte[] bArr, int i, int i2) {
        return Math.max(0, super.read(bArr, i, i2));
    }

    public final boolean m15149B0(int i) {
        int A0 = m15150A0(this.f24814b, 0, i);
        if (A0 != i) {
            int i2 = i - A0;
            if (m15150A0(this.f24814b, A0, i2) != i2) {
                this.f24813a.m15176b(this.f24814b, 0, A0);
                return false;
            }
        }
        this.f24813a.m15176b(this.f24814b, 0, i);
        return true;
    }

    public final long m15148m() {
        return this.f24815c;
    }

    @Override
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final AbstractC7726m3 m15147t() {
        byte[] bArr;
        if (this.f24815c > 0) {
            do {
                bArr = this.f24814b;
            } while (read(bArr, 0, bArr.length) != -1);
            if (!this.f24811M || this.f24812N) {
                return new C7728n0(null, -1L, -1, false, false, null);
            }
            if (!m15149B0(30)) {
                this.f24811M = true;
                return this.f24813a.m15175c();
            }
            AbstractC7726m3 c = this.f24813a.m15175c();
            if (c.mo15162d()) {
                this.f24812N = true;
                return c;
            } else if (c.mo15164b() != 4294967295L) {
                int a = this.f24813a.m15177a() - 30;
                long j = a;
                int length = this.f24814b.length;
                if (j > length) {
                    do {
                        length += length;
                    } while (length < j);
                    this.f24814b = Arrays.copyOf(this.f24814b, length);
                }
                if (!m15149B0(a)) {
                    this.f24811M = true;
                    return this.f24813a.m15175c();
                }
                AbstractC7726m3 c2 = this.f24813a.m15175c();
                this.f24815c = c2.mo15164b();
                return c2;
            } else {
                throw new C7694g1("Files bigger than 4GiB are not supported.");
            }
        } else {
            if (!this.f24811M) {
            }
            return new C7728n0(null, -1L, -1, false, false, null);
        }
    }

    public final boolean m15146y0() {
        return this.f24812N;
    }

    public final boolean m15145z0() {
        return this.f24811M;
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f24815c;
        if (j <= 0 || this.f24811M) {
            return -1;
        }
        int A0 = m15150A0(bArr, i, (int) Math.min(j, i2));
        this.f24815c -= A0;
        if (A0 != 0) {
            return A0;
        }
        this.f24811M = true;
        return 0;
    }
}
