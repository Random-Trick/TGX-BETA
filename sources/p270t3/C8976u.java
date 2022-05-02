package p270t3;

import p020b5.C1186a;
import p199o3.C7582b;
import p270t3.AbstractC8974t;

public final class C8976u {
    public final byte[] f28865a = new byte[10];
    public boolean f28866b;
    public int f28867c;
    public long f28868d;
    public int f28869e;
    public int f28870f;
    public int f28871g;

    public void m10792a(AbstractC8974t tVar, AbstractC8974t.C8975a aVar) {
        if (this.f28867c > 0) {
            tVar.mo10794e(this.f28868d, this.f28869e, this.f28870f, this.f28871g, aVar);
            this.f28867c = 0;
        }
    }

    public void m10791b() {
        this.f28866b = false;
        this.f28867c = 0;
    }

    public void m10790c(AbstractC8974t tVar, long j, int i, int i2, int i3, AbstractC8974t.C8975a aVar) {
        C1186a.m38183g(this.f28871g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f28866b) {
            int i4 = this.f28867c;
            int i5 = i4 + 1;
            this.f28867c = i5;
            if (i4 == 0) {
                this.f28868d = j;
                this.f28869e = i;
                this.f28870f = 0;
            }
            this.f28870f += i2;
            this.f28871g = i3;
            if (i5 >= 16) {
                m10792a(tVar, aVar);
            }
        }
    }

    public void m10789d(AbstractC8959g gVar) {
        if (!this.f28866b) {
            gVar.mo10806q(this.f28865a, 0, 10);
            gVar.mo10809m();
            if (C7582b.m15623i(this.f28865a) != 0) {
                this.f28866b = true;
            }
        }
    }
}
