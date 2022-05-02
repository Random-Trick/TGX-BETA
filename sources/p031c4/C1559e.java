package p031c4;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import org.thunderdog.challegram.Log;
import p020b5.C1189b0;
import p031c4.AbstractC1571i0;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.C8971q;

public final class C1559e implements AbstractC8958f {
    public static final AbstractC8965l f5554d = C1557d.f5551b;
    public final C1562f f5555a = new C1562f();
    public final C1189b0 f5556b = new C1189b0((int) Log.TAG_VIDEO);
    public boolean f5557c;

    public static AbstractC8958f[] m36468d() {
        return new AbstractC8958f[]{new C1559e()};
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        this.f5557c = false;
        this.f5555a.mo36332c();
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        int b = gVar.mo4414b(this.f5556b.m38139d(), 0, Log.TAG_VIDEO);
        if (b == -1) {
            return -1;
        }
        this.f5556b.m38144P(0);
        this.f5556b.m38145O(b);
        if (!this.f5557c) {
            this.f5555a.mo36329f(0L, 4);
            this.f5557c = true;
        }
        this.f5555a.mo36333b(this.f5556b);
        return 0;
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f5555a.mo36330e(hVar, new AbstractC1571i0.C1575d(0, 1));
        hVar.mo6040m();
        hVar.mo6042a(new AbstractC3470g.C3472b(-9223372036854775807L));
    }

    @Override
    public boolean mo1144j(p270t3.AbstractC8959g r9) {
        throw new UnsupportedOperationException("Method not decompiled: p031c4.C1559e.mo1144j(t3.g):boolean");
    }
}
