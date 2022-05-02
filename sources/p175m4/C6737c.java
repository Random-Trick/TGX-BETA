package p175m4;

import java.nio.ByteBuffer;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p020b5.C1205i0;
import p073f4.AbstractC4270h;
import p073f4.C4260a;
import p073f4.C4267e;

public final class C6737c extends AbstractC4270h {
    public final C1189b0 f21190a = new C1189b0();
    public final C1187a0 f21191b = new C1187a0();
    public C1205i0 f21192c;

    @Override
    public C4260a mo19175b(C4267e eVar, ByteBuffer byteBuffer) {
        C1205i0 i0Var = this.f21192c;
        if (i0Var == null || eVar.f14315R != i0Var.m38049e()) {
            C1205i0 i0Var2 = new C1205i0(eVar.f26126N);
            this.f21192c = i0Var2;
            i0Var2.m38053a(eVar.f26126N - eVar.f14315R);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f21190a.m38146N(array, limit);
        this.f21191b.m38166o(array, limit);
        this.f21191b.m38163r(39);
        long h = (this.f21191b.m38173h(1) << 32) | this.f21191b.m38173h(32);
        this.f21191b.m38163r(20);
        int h2 = this.f21191b.m38173h(12);
        int h3 = this.f21191b.m38173h(8);
        C4260a.AbstractC4262b bVar = null;
        this.f21190a.m38143Q(14);
        if (h3 == 0) {
            bVar = new C6741e();
        } else if (h3 == 255) {
            bVar = C6734a.m19178a(this.f21190a, h2, h);
        } else if (h3 == 4) {
            bVar = C6743f.m19167a(this.f21190a);
        } else if (h3 == 5) {
            bVar = C6738d.m19174a(this.f21190a, h, this.f21192c);
        } else if (h3 == 6) {
            bVar = C6747g.m19154a(this.f21190a, h, this.f21192c);
        }
        return bVar == null ? new C4260a(new C4260a.AbstractC4262b[0]) : new C4260a(bVar);
    }
}
