package p270t3;

import p020b5.C1186a;
import p199o3.C7582b;
import p270t3.AbstractC8974t;

public final class C8976u {
    public final byte[] f28868a = new byte[10];
    public boolean f28869b;
    public int f28870c;
    public long f28871d;
    public int f28872e;
    public int f28873f;
    public int f28874g;

    public void m10791a(AbstractC8974t tVar, AbstractC8974t.C8975a aVar) {
        if (this.f28870c > 0) {
            tVar.mo10793e(this.f28871d, this.f28872e, this.f28873f, this.f28874g, aVar);
            this.f28870c = 0;
        }
    }

    public void m10790b() {
        this.f28869b = false;
        this.f28870c = 0;
    }

    public void m10789c(AbstractC8974t tVar, long j, int i, int i2, int i3, AbstractC8974t.C8975a aVar) {
        C1186a.m38186g(this.f28874g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f28869b) {
            int i4 = this.f28870c;
            int i5 = i4 + 1;
            this.f28870c = i5;
            if (i4 == 0) {
                this.f28871d = j;
                this.f28872e = i;
                this.f28873f = 0;
            }
            this.f28873f += i2;
            this.f28874g = i3;
            if (i5 >= 16) {
                m10791a(tVar, aVar);
            }
        }
    }

    public void m10788d(AbstractC8959g gVar) {
        if (!this.f28869b) {
            gVar.mo10805q(this.f28868a, 0, 10);
            gVar.mo10808m();
            if (C7582b.m15623i(this.f28868a) != 0) {
                this.f28869b = true;
            }
        }
    }
}
