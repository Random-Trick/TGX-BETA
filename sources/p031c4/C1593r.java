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
    public void mo36333b(C1189b0 b0Var) {
        C1186a.m38182h(this.f5806b);
        if (this.f5807c) {
            int a = b0Var.m38142a();
            int i = this.f5810f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(b0Var.m38139d(), b0Var.m38138e(), this.f5805a.m38139d(), this.f5810f, min);
                if (this.f5810f + min == 10) {
                    this.f5805a.m38144P(0);
                    if (73 == this.f5805a.m38156D() && 68 == this.f5805a.m38156D() && 51 == this.f5805a.m38156D()) {
                        this.f5805a.m38143Q(3);
                        this.f5809e = this.f5805a.m38157C() + 10;
                    } else {
                        C1230s.m37881i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f5807c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f5809e - this.f5810f);
            this.f5806b.mo10796c(b0Var, min2);
            this.f5810f += min2;
        }
    }

    @Override
    public void mo36332c() {
        this.f5807c = false;
        this.f5808d = -9223372036854775807L;
    }

    @Override
    public void mo36331d() {
        int i;
        C1186a.m38182h(this.f5806b);
        if (this.f5807c && (i = this.f5809e) != 0 && this.f5810f == i) {
            long j = this.f5808d;
            if (j != -9223372036854775807L) {
                this.f5806b.mo10794e(j, 1, i, 0, null);
            }
            this.f5807c = false;
        }
    }

    @Override
    public void mo36330e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36406a();
        AbstractC8974t r = hVar.mo6039r(dVar.m36404c(), 5);
        this.f5806b = r;
        r.mo10798a(new C6600g1.C6602b().m19875S(dVar.m36405b()).m19858e0("application/id3").m19889E());
    }

    @Override
    public void mo36329f(long j, int i) {
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
