package p031c4;

import org.thunderdog.challegram.Log;
import p020b5.C1189b0;
import p020b5.C1205i0;
import p020b5.C1216l0;
import p031c4.AbstractC1571i0;
import p270t3.AbstractC8960h;

public final class C1556c0 implements AbstractC1571i0 {
    public final AbstractC1554b0 f5545a;
    public final C1189b0 f5546b = new C1189b0(32);
    public int f5547c;
    public int f5548d;
    public boolean f5549e;
    public boolean f5550f;

    public C1556c0(AbstractC1554b0 b0Var) {
        this.f5545a = b0Var;
    }

    @Override
    public void mo36318a(C1205i0 i0Var, AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        this.f5545a.mo36321a(i0Var, hVar, dVar);
        this.f5550f = true;
    }

    @Override
    public void mo36317b(C1189b0 b0Var, int i) {
        boolean z = (i & 1) != 0;
        int e = z ? b0Var.m38138e() + b0Var.m38156D() : -1;
        if (this.f5550f) {
            if (z) {
                this.f5550f = false;
                b0Var.m38144P(e);
                this.f5548d = 0;
            } else {
                return;
            }
        }
        while (b0Var.m38142a() > 0) {
            int i2 = this.f5548d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int D = b0Var.m38156D();
                    b0Var.m38144P(b0Var.m38138e() - 1);
                    if (D == 255) {
                        this.f5550f = true;
                        return;
                    }
                }
                int min = Math.min(b0Var.m38142a(), 3 - this.f5548d);
                b0Var.m38133j(this.f5546b.m38139d(), this.f5548d, min);
                int i3 = this.f5548d + min;
                this.f5548d = i3;
                if (i3 == 3) {
                    this.f5546b.m38144P(0);
                    this.f5546b.m38145O(3);
                    this.f5546b.m38143Q(1);
                    int D2 = this.f5546b.m38156D();
                    int D3 = this.f5546b.m38156D();
                    this.f5549e = (D2 & Log.TAG_YOUTUBE) != 0;
                    this.f5547c = (((D2 & 15) << 8) | D3) + 3;
                    int b = this.f5546b.m38141b();
                    int i4 = this.f5547c;
                    if (b < i4) {
                        this.f5546b.m38140c(Math.min(4098, Math.max(i4, this.f5546b.m38141b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(b0Var.m38142a(), this.f5547c - this.f5548d);
                b0Var.m38133j(this.f5546b.m38139d(), this.f5548d, min2);
                int i5 = this.f5548d + min2;
                this.f5548d = i5;
                int i6 = this.f5547c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f5549e) {
                        this.f5546b.m38145O(i6);
                    } else if (C1216l0.m37952r(this.f5546b.m38139d(), 0, this.f5547c, -1) != 0) {
                        this.f5550f = true;
                        return;
                    } else {
                        this.f5546b.m38145O(this.f5547c - 4);
                    }
                    this.f5546b.m38144P(0);
                    this.f5545a.mo36320b(this.f5546b);
                    this.f5548d = 0;
                }
            }
        }
    }

    @Override
    public void mo36316c() {
        this.f5550f = true;
    }
}
