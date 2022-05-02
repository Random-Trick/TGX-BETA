package p126j$.util.stream;

import org.thunderdog.challegram.Log;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5811y;
import p126j$.util.function.AbstractC5531m;

public class C5799y2 extends AbstractC5571D {
    public static final int f18517w = 0;
    final long f18518u;
    final long f18519v;

    public C5799y2(AbstractC5686c cVar, int i, int i2, long j, long j2) {
        super(cVar, i, i2);
        this.f18518u = j;
        this.f18519v = j2;
    }

    @Override
    AbstractC5632P0 mo22141B0(AbstractC5572D0 d0, AbstractC5468G g, AbstractC5531m mVar) {
        long S = d0.mo22303S(g);
        if (S > 0 && g.hasCharacteristics(Log.TAG_VIDEO)) {
            return AbstractC5572D0.m22441I(d0, AbstractC5572D0.m22449A(d0.mo22302Y(), g, this.f18518u, this.f18519v), true);
        }
        return !EnumC5705f3.ORDERED.m22265d(d0.mo22301Z()) ? AbstractC5572D0.m22441I(this, m22139R0((AbstractC5811y) d0.mo22298s0(g), this.f18518u, this.f18519v, S), true) : (AbstractC5632P0) new C5559A2(this, d0, g, mVar, this.f18518u, this.f18519v).invoke();
    }

    @Override
    AbstractC5468G mo22140C0(AbstractC5572D0 d0, AbstractC5468G g) {
        long G;
        long S = d0.mo22303S(g);
        if (S > 0 && g.hasCharacteristics(Log.TAG_VIDEO)) {
            AbstractC5811y yVar = (AbstractC5811y) d0.mo22298s0(g);
            long j = this.f18518u;
            G = AbstractC5572D0.m22443G(j, this.f18519v);
            return new C5790w3(yVar, j, G);
        }
        return !EnumC5705f3.ORDERED.m22265d(d0.mo22301Z()) ? m22139R0((AbstractC5811y) d0.mo22298s0(g), this.f18518u, this.f18519v, S) : ((AbstractC5632P0) new C5559A2(this, d0, g, C5682b0.f18314b, this.f18518u, this.f18519v).invoke()).mo42629spliterator();
    }

    @Override
    public AbstractC5759q2 mo22136E0(int i, AbstractC5759q2 q2Var) {
        return new C5794x2(this, q2Var);
    }

    AbstractC5811y m22139R0(AbstractC5811y yVar, long j, long j2, long j3) {
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
        return new C5580E3(yVar, j5, j4);
    }
}
