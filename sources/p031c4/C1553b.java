package p031c4;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import p020b5.C1189b0;
import p031c4.AbstractC1571i0;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.C8971q;

public final class C1553b implements AbstractC8958f {
    public static final AbstractC8965l f5529d = C1550a.f5508b;
    public final C1555c f5530a = new C1555c();
    public final C1189b0 f5531b = new C1189b0(2786);
    public boolean f5532c;

    public static AbstractC8958f[] m36475d() {
        return new AbstractC8958f[]{new C1553b()};
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        this.f5532c = false;
        this.f5530a.mo36332c();
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        int b = gVar.mo4414b(this.f5531b.m38139d(), 0, 2786);
        if (b == -1) {
            return -1;
        }
        this.f5531b.m38144P(0);
        this.f5531b.m38145O(b);
        if (!this.f5532c) {
            this.f5530a.mo36329f(0L, 4);
            this.f5532c = true;
        }
        this.f5530a.mo36333b(this.f5531b);
        return 0;
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f5530a.mo36330e(hVar, new AbstractC1571i0.C1575d(0, 1));
        hVar.mo6040m();
        hVar.mo6042a(new AbstractC3470g.C3472b(-9223372036854775807L));
    }

    @Override
    public boolean mo1144j(p270t3.AbstractC8959g r8) {
        throw new UnsupportedOperationException("Method not decompiled: p031c4.C1553b.mo1144j(t3.g):boolean");
    }
}
