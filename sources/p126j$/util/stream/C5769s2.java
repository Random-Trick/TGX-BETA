package p126j$.util.stream;

import org.thunderdog.challegram.Log;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5531m;

public class C5769s2 extends AbstractC5709g2 {
    final long f18469u;
    final long f18470v;

    public C5769s2(AbstractC5686c cVar, int i, int i2, long j, long j2) {
        super(cVar, i, i2);
        this.f18469u = j;
        this.f18470v = j2;
    }

    @Override
    AbstractC5632P0 mo22142B0(AbstractC5572D0 d0, AbstractC5468G g, AbstractC5531m mVar) {
        long S = d0.mo22304S(g);
        if (S > 0 && g.hasCharacteristics(Log.TAG_VIDEO)) {
            return AbstractC5572D0.m22443H(d0, AbstractC5572D0.m22450A(d0.mo22303Y(), g, this.f18469u, this.f18470v), true, mVar);
        }
        return !EnumC5705f3.ORDERED.m22266d(d0.mo22302Z()) ? AbstractC5572D0.m22443H(this, m22183P0(d0.mo22299s0(g), this.f18469u, this.f18470v, S), true, mVar) : (AbstractC5632P0) new C5559A2(this, d0, g, mVar, this.f18469u, this.f18470v).invoke();
    }

    @Override
    AbstractC5468G mo22141C0(AbstractC5572D0 d0, AbstractC5468G g) {
        long G;
        long S = d0.mo22304S(g);
        if (S > 0 && g.hasCharacteristics(Log.TAG_VIDEO)) {
            AbstractC5468G s0 = d0.mo22299s0(g);
            long j = this.f18469u;
            G = AbstractC5572D0.m22444G(j, this.f18470v);
            return new C5570C3(s0, j, G);
        }
        return !EnumC5705f3.ORDERED.m22266d(d0.mo22302Z()) ? m22183P0(d0.mo22299s0(g), this.f18469u, this.f18470v, S) : ((AbstractC5632P0) new C5559A2(this, d0, g, C5601J.f18162c, this.f18469u, this.f18470v).invoke()).mo42632spliterator();
    }

    @Override
    public AbstractC5759q2 mo22137E0(int i, AbstractC5759q2 q2Var) {
        return new C5764r2(this, q2Var);
    }

    AbstractC5468G m22183P0(AbstractC5468G g, long j, long j2, long j3) {
        long j4;
        long j5;
        if (j <= j3) {
            long j6 = j3 - j;
            j4 = j2 >= 0 ? Math.min(j2, j6) : j6;
            j5 = 0;
        } else {
            j5 = j;
            j4 = j2;
        }
        return new C5600I3(g, j5, j4);
    }
}
