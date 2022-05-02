package p202o6;

import java.util.Arrays;
import org.thunderdog.challegram.Log;

public final class C7720l2 {
    public byte[] f24749a = new byte[Log.TAG_EMOJI];
    public int f24750b;
    public long f24751c;
    public long f24752d;
    public int f24753e;
    public int f24754f;
    public int f24755g;
    public boolean f24756h;
    public String f24757i;

    public C7720l2() {
        m15174d();
    }

    public final int m15177a() {
        return this.f24754f;
    }

    public final int m15176b(byte[] bArr, int i, int i2) {
        int e = m15173e(30, bArr, i, i2);
        if (e == -1) {
            return -1;
        }
        if (this.f24751c == -1) {
            long b = C7733o0.m15156b(this.f24749a, 0);
            this.f24751c = b;
            if (b == 67324752) {
                this.f24756h = false;
                this.f24752d = C7733o0.m15156b(this.f24749a, 18);
                this.f24755g = C7733o0.m15157a(this.f24749a, 8);
                this.f24753e = C7733o0.m15157a(this.f24749a, 26);
                int a = this.f24753e + 30 + C7733o0.m15157a(this.f24749a, 28);
                this.f24754f = a;
                int length = this.f24749a.length;
                if (length < a) {
                    do {
                        length += length;
                    } while (length < a);
                    this.f24749a = Arrays.copyOf(this.f24749a, length);
                }
            } else {
                this.f24756h = true;
            }
        }
        int e2 = m15173e(this.f24754f, bArr, i + e, i2 - e);
        if (e2 == -1) {
            return -1;
        }
        int i3 = e + e2;
        if (!this.f24756h && this.f24757i == null) {
            this.f24757i = new String(this.f24749a, 30, this.f24753e);
        }
        return i3;
    }

    public final AbstractC7726m3 m15175c() {
        int i = this.f24750b;
        int i2 = this.f24754f;
        if (i < i2) {
            return new C7728n0(this.f24757i, this.f24752d, this.f24755g, true, this.f24756h, Arrays.copyOf(this.f24749a, i));
        }
        C7728n0 n0Var = new C7728n0(this.f24757i, this.f24752d, this.f24755g, false, this.f24756h, Arrays.copyOf(this.f24749a, i2));
        m15174d();
        return n0Var;
    }

    public final void m15174d() {
        this.f24750b = 0;
        this.f24753e = -1;
        this.f24751c = -1L;
        this.f24756h = false;
        this.f24754f = 30;
        this.f24752d = -1L;
        this.f24755g = -1;
        this.f24757i = null;
    }

    public final int m15173e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f24750b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f24749a, this.f24750b, min);
        int i5 = this.f24750b + min;
        this.f24750b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }
}
