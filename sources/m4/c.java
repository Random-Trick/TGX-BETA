package m4;

import c5.a0;
import c5.b0;
import c5.i0;
import f4.a;
import f4.e;
import f4.h;
import java.nio.ByteBuffer;

public final class c extends h {
    public final b0 f17121a = new b0();
    public final a0 f17122b = new a0();
    public i0 f17123c;

    @Override
    public a b(e eVar, ByteBuffer byteBuffer) {
        i0 i0Var = this.f17123c;
        if (i0Var == null || eVar.R != i0Var.e()) {
            i0 i0Var2 = new i0(eVar.N);
            this.f17123c = i0Var2;
            i0Var2.a(eVar.N - eVar.R);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f17121a.N(array, limit);
        this.f17122b.o(array, limit);
        this.f17122b.r(39);
        long h10 = (this.f17122b.h(1) << 32) | this.f17122b.h(32);
        this.f17122b.r(20);
        int h11 = this.f17122b.h(12);
        int h12 = this.f17122b.h(8);
        a.b bVar = null;
        this.f17121a.Q(14);
        if (h12 == 0) {
            bVar = new e();
        } else if (h12 == 255) {
            bVar = a.a(this.f17121a, h11, h10);
        } else if (h12 == 4) {
            bVar = f.a(this.f17121a);
        } else if (h12 == 5) {
            bVar = d.a(this.f17121a, h10, this.f17123c);
        } else if (h12 == 6) {
            bVar = g.a(this.f17121a, h10, this.f17123c);
        }
        return bVar == null ? new a(new a.b[0]) : new a(bVar);
    }
}
