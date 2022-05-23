package e4;

import c5.l0;
import c5.s;
import c5.w;
import e4.b;
import e4.l;
import e4.x;

public final class j implements l.b {
    public boolean f10496b;
    public int f10495a = 0;
    public boolean f10497c = true;

    @Override
    public l a(l.a aVar) {
        int i10 = this.f10495a;
        if ((i10 != 1 || l0.f4841a < 23) && (i10 != 0 || l0.f4841a < 31)) {
            return new x.b().a(aVar);
        }
        int f10 = w.f(aVar.f10505c.U);
        String valueOf = String.valueOf(l0.e0(f10));
        s.f("DMCodecAdapterFactory", valueOf.length() != 0 ? "Creating an asynchronous MediaCodec adapter for track type ".concat(valueOf) : new String("Creating an asynchronous MediaCodec adapter for track type "));
        return new b.C0094b(f10, this.f10496b, this.f10497c).a(aVar);
    }
}
