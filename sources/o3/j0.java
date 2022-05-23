package o3;

import o3.g;

public final class j0 extends y {
    @Override
    public void b(java.nio.ByteBuffer r10) {
        throw new UnsupportedOperationException("Method not decompiled: o3.j0.b(java.nio.ByteBuffer):void");
    }

    @Override
    public g.a i(g.a aVar) {
        int i10 = aVar.f18785c;
        if (i10 != 3 && i10 != 2 && i10 != 268435456 && i10 != 536870912 && i10 != 805306368 && i10 != 4) {
            throw new g.b(aVar);
        } else if (i10 != 2) {
            return new g.a(aVar.f18783a, aVar.f18784b, 2);
        } else {
            return g.a.f18782e;
        }
    }
}
