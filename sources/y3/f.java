package y3;

import c5.b0;
import org.thunderdog.challegram.Log;
import t3.g;

public final class f {
    public final b0 f26564a = new b0(8);
    public int f26565b;

    public final long a(g gVar) {
        int i10 = 0;
        gVar.q(this.f26564a.d(), 0, 1);
        int i11 = this.f26564a.d()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = Log.TAG_YOUTUBE;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        gVar.q(this.f26564a.d(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f26564a.d()[i10] & 255) + (i14 << 8);
        }
        this.f26565b += i13 + 1;
        return i14;
    }

    public boolean b(g gVar) {
        long a10;
        int i10;
        long a11 = gVar.a();
        long j10 = 1024;
        int i11 = (a11 > (-1L) ? 1 : (a11 == (-1L) ? 0 : -1));
        if (i11 != 0 && a11 <= 1024) {
            j10 = a11;
        }
        int i12 = (int) j10;
        gVar.q(this.f26564a.d(), 0, 4);
        long F = this.f26564a.F();
        this.f26565b = 4;
        while (F != 440786851) {
            int i13 = this.f26565b + 1;
            this.f26565b = i13;
            if (i13 == i12) {
                return false;
            }
            gVar.q(this.f26564a.d(), 0, 1);
            F = ((F << 8) & (-256)) | (this.f26564a.d()[0] & 255);
        }
        long a12 = a(gVar);
        long j11 = this.f26565b;
        if (a12 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a12 >= a11) {
            return false;
        }
        while (true) {
            int i14 = this.f26565b;
            long j12 = j11 + a12;
            if (i14 >= j12) {
                return ((long) i14) == j12;
            }
            if (a(gVar) != Long.MIN_VALUE && (a10 = a(gVar)) >= 0 && a10 <= 2147483647L) {
                if (i10 != 0) {
                    int i15 = (int) a10;
                    gVar.g(i15);
                    this.f26565b += i15;
                }
            }
        }
    }
}
