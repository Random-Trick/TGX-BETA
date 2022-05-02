package p340y3;

import org.thunderdog.challegram.Log;
import p020b5.C1189b0;
import p270t3.AbstractC8959g;

public final class C10369f {
    public final C1189b0 f33359a = new C1189b0(8);
    public int f33360b;

    public final long m5295a(AbstractC8959g gVar) {
        int i = 0;
        gVar.mo10805q(this.f33359a.m38142d(), 0, 1);
        int i2 = this.f33359a.m38142d()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = Log.TAG_YOUTUBE;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        gVar.mo10805q(this.f33359a.m38142d(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f33359a.m38142d()[i] & 255) + (i5 << 8);
        }
        this.f33360b += i4 + 1;
        return i5;
    }

    public boolean m5294b(AbstractC8959g gVar) {
        long a;
        int i;
        long a2 = gVar.mo6046a();
        long j = 1024;
        int i2 = (a2 > (-1L) ? 1 : (a2 == (-1L) ? 0 : -1));
        if (i2 != 0 && a2 <= 1024) {
            j = a2;
        }
        int i3 = (int) j;
        gVar.mo10805q(this.f33359a.m38142d(), 0, 4);
        long F = this.f33359a.m38157F();
        this.f33360b = 4;
        while (F != 440786851) {
            int i4 = this.f33360b + 1;
            this.f33360b = i4;
            if (i4 == i3) {
                return false;
            }
            gVar.mo10805q(this.f33359a.m38142d(), 0, 1);
            F = ((F << 8) & (-256)) | (this.f33359a.m38142d()[0] & 255);
        }
        long a3 = m5295a(gVar);
        long j2 = this.f33360b;
        if (a3 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + a3 >= a2) {
            return false;
        }
        while (true) {
            int i5 = this.f33360b;
            long j3 = j2 + a3;
            if (i5 >= j3) {
                return ((long) i5) == j3;
            }
            if (m5295a(gVar) != Long.MIN_VALUE && (a = m5295a(gVar)) >= 0 && a <= 2147483647L) {
                if (i != 0) {
                    int i6 = (int) a;
                    gVar.mo10811h(i6);
                    this.f33360b += i6;
                }
            }
        }
    }
}
