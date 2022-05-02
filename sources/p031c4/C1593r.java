package p031c4;

import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1230s;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1593r implements AbstractC1581m {
    public AbstractC8974t f5806b;
    public boolean f5807c;
    public int f5809e;
    public int f5810f;
    public final C1189b0 f5805a = new C1189b0(10);
    public long f5808d = -9223372036854775807L;

    @Override
    public void mo36336b(C1189b0 b0Var) {
        C1186a.m38185h(this.f5806b);
        if (this.f5807c) {
            int a = b0Var.m38145a();
            int i = this.f5810f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(b0Var.m38142d(), b0Var.m38141e(), this.f5805a.m38142d(), this.f5810f, min);
                if (this.f5810f + min == 10) {
                    this.f5805a.m38147P(0);
                    if (73 == this.f5805a.m38159D() && 68 == this.f5805a.m38159D() && 51 == this.f5805a.m38159D()) {
                        this.f5805a.m38146Q(3);
                        this.f5809e = this.f5805a.m38160C() + 10;
                    } else {
                        C1230s.m37884i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f5807c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f5809e - this.f5810f);
            this.f5806b.mo10795c(b0Var, min2);
            this.f5810f += min2;
        }
    }

    @Override
    public void mo36335c() {
        this.f5807c = false;
        this.f5808d = -9223372036854775807L;
    }

    @Override
    public void mo36334d() {
        int i;
        C1186a.m38185h(this.f5806b);
        if (this.f5807c && (i = this.f5809e) != 0 && this.f5810f == i) {
            long j = this.f5808d;
            if (j != -9223372036854775807L) {
                this.f5806b.mo10793e(j, 1, i, 0, null);
            }
            this.f5807c = false;
        }
    }

    @Override
    public void mo36333e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36409a();
        AbstractC8974t r = hVar.mo6039r(dVar.m36407c(), 5);
        this.f5806b = r;
        r.mo10797a(new C6600g1.C6602b().m19876S(dVar.m36408b()).m19859e0("application/id3").m19890E());
    }

    @Override
    public void mo36332f(long j, int i) {
        if ((i & 4) != 0) {
            this.f5807c = true;
            if (j != -9223372036854775807L) {
                this.f5808d = j;
            }
            this.f5809e = 0;
            this.f5810f = 0;
        }
    }
}
