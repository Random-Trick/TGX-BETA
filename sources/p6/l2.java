package p6;

import java.util.Arrays;
import org.thunderdog.challegram.Log;

public final class l2 {
    public byte[] f20703a = new byte[Log.TAG_EMOJI];
    public int f20704b;
    public long f20705c;
    public long f20706d;
    public int f20707e;
    public int f20708f;
    public int f20709g;
    public boolean f20710h;
    public String f20711i;

    public l2() {
        d();
    }

    public final int a() {
        return this.f20708f;
    }

    public final int b(byte[] bArr, int i10, int i11) {
        int e10 = e(30, bArr, i10, i11);
        if (e10 == -1) {
            return -1;
        }
        if (this.f20705c == -1) {
            long b10 = o0.b(this.f20703a, 0);
            this.f20705c = b10;
            if (b10 == 67324752) {
                this.f20710h = false;
                this.f20706d = o0.b(this.f20703a, 18);
                this.f20709g = o0.a(this.f20703a, 8);
                this.f20707e = o0.a(this.f20703a, 26);
                int a10 = this.f20707e + 30 + o0.a(this.f20703a, 28);
                this.f20708f = a10;
                int length = this.f20703a.length;
                if (length < a10) {
                    do {
                        length += length;
                    } while (length < a10);
                    this.f20703a = Arrays.copyOf(this.f20703a, length);
                }
            } else {
                this.f20710h = true;
            }
        }
        int e11 = e(this.f20708f, bArr, i10 + e10, i11 - e10);
        if (e11 == -1) {
            return -1;
        }
        int i12 = e10 + e11;
        if (!this.f20710h && this.f20711i == null) {
            this.f20711i = new String(this.f20703a, 30, this.f20707e);
        }
        return i12;
    }

    public final m3 c() {
        int i10 = this.f20704b;
        int i11 = this.f20708f;
        if (i10 < i11) {
            return new n0(this.f20711i, this.f20706d, this.f20709g, true, this.f20710h, Arrays.copyOf(this.f20703a, i10));
        }
        n0 n0Var = new n0(this.f20711i, this.f20706d, this.f20709g, false, this.f20710h, Arrays.copyOf(this.f20703a, i11));
        d();
        return n0Var;
    }

    public final void d() {
        this.f20704b = 0;
        this.f20707e = -1;
        this.f20705c = -1L;
        this.f20710h = false;
        this.f20708f = 30;
        this.f20706d = -1L;
        this.f20709g = -1;
        this.f20711i = null;
    }

    public final int e(int i10, byte[] bArr, int i11, int i12) {
        int i13 = this.f20704b;
        if (i13 >= i10) {
            return 0;
        }
        int min = Math.min(i12, i10 - i13);
        System.arraycopy(bArr, i11, this.f20703a, this.f20704b, min);
        int i14 = this.f20704b + min;
        this.f20704b = i14;
        if (i14 < i10) {
            return -1;
        }
        return min;
    }
}
