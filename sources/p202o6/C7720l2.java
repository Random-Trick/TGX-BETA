package p202o6;

import java.util.Arrays;
import org.thunderdog.challegram.Log;

public final class C7720l2 {
    public byte[] f24746a = new byte[Log.TAG_EMOJI];
    public int f24747b;
    public long f24748c;
    public long f24749d;
    public int f24750e;
    public int f24751f;
    public int f24752g;
    public boolean f24753h;
    public String f24754i;

    public C7720l2() {
        m15174d();
    }

    public final int m15177a() {
        return this.f24751f;
    }

    public final int m15176b(byte[] bArr, int i, int i2) {
        int e = m15173e(30, bArr, i, i2);
        if (e == -1) {
            return -1;
        }
        if (this.f24748c == -1) {
            long b = C7733o0.m15156b(this.f24746a, 0);
            this.f24748c = b;
            if (b == 67324752) {
                this.f24753h = false;
                this.f24749d = C7733o0.m15156b(this.f24746a, 18);
                this.f24752g = C7733o0.m15157a(this.f24746a, 8);
                this.f24750e = C7733o0.m15157a(this.f24746a, 26);
                int a = this.f24750e + 30 + C7733o0.m15157a(this.f24746a, 28);
                this.f24751f = a;
                int length = this.f24746a.length;
                if (length < a) {
                    do {
                        length += length;
                    } while (length < a);
                    this.f24746a = Arrays.copyOf(this.f24746a, length);
                }
            } else {
                this.f24753h = true;
            }
        }
        int e2 = m15173e(this.f24751f, bArr, i + e, i2 - e);
        if (e2 == -1) {
            return -1;
        }
        int i3 = e + e2;
        if (!this.f24753h && this.f24754i == null) {
            this.f24754i = new String(this.f24746a, 30, this.f24750e);
        }
        return i3;
    }

    public final AbstractC7726m3 m15175c() {
        int i = this.f24747b;
        int i2 = this.f24751f;
        if (i < i2) {
            return new C7728n0(this.f24754i, this.f24749d, this.f24752g, true, this.f24753h, Arrays.copyOf(this.f24746a, i));
        }
        C7728n0 n0Var = new C7728n0(this.f24754i, this.f24749d, this.f24752g, false, this.f24753h, Arrays.copyOf(this.f24746a, i2));
        m15174d();
        return n0Var;
    }

    public final void m15174d() {
        this.f24747b = 0;
        this.f24750e = -1;
        this.f24748c = -1L;
        this.f24753h = false;
        this.f24751f = 30;
        this.f24749d = -1L;
        this.f24752g = -1;
        this.f24754i = null;
    }

    public final int m15173e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f24747b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f24746a, this.f24747b, min);
        int i5 = this.f24747b + min;
        this.f24747b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }
}
